package com.ironsource.environment.workerthread;

import com.ironsource.environment.workerthread.WorkerResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WorkerManager<T> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f3780a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f3781b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j10);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f3781b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f3780a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j10, TimeUnit timeUnit) {
        WorkerResult.Canceled canceled;
        if (this.f3781b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
        } else if (this.f3780a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            try {
                List invokeAll = this.f3781b.invokeAll(this.f3780a, j10, timeUnit);
                for (int i10 = 0; i10 < invokeAll.size(); i10++) {
                    Future future = (Future) invokeAll.get(i10);
                    if (!future.isDone() || future.isCancelled()) {
                        canceled = new WorkerResult.Canceled((Callable) this.f3780a.get(i10));
                    } else {
                        try {
                            arrayList.add(new WorkerResult.Completed(future.get()));
                        } catch (CancellationException unused) {
                            canceled = new WorkerResult.Canceled((Callable) this.f3780a.get(i10));
                        } catch (InterruptedException | ExecutionException e10) {
                            arrayList.add(new WorkerResult.Failed((Callable) this.f3780a.get(i10), e10));
                        }
                    }
                    arrayList.add(canceled);
                }
                workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - currentTimeMillis);
                this.f3781b.shutdownNow();
            } catch (Exception e11) {
                e11.printStackTrace();
                workEndedListener.onWorkFailed("failed to invoke callables, error= " + e11.getMessage());
                this.f3781b.shutdownNow();
            }
        }
    }
}
