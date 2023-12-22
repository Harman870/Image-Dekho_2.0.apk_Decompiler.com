package com.ironsource.mediationsdk.bidding;

import androidx.fragment.app.w0;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class d {

    public interface a {
        void a(String str);

        void a(List<j> list, long j10, List<String> list2);
    }

    public class b implements WorkerManager.WorkEndedListener<j> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ a f4330a;

        public b(d dVar, a aVar) {
            this.f4330a = aVar;
        }

        public final void onWorkCompleted(List<WorkerResult<j>> list, long j10) {
            StringBuilder sb;
            IronLog ironLog;
            String str;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult next : list) {
                if (next instanceof WorkerResult.Completed) {
                    arrayList2.add((j) ((WorkerResult.Completed) next).data);
                } else if (next instanceof WorkerResult.Canceled) {
                    arrayList.add(((a) ((WorkerResult.Canceled) next).callable).f4325b);
                } else if (next instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) next;
                    a aVar = (a) failed.callable;
                    arrayList2.add(new j(aVar.f4324a, aVar.f4325b, (Map<String, Object>) null, 0, failed.exception.getMessage()));
                }
            }
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("tokens received=" + arrayList2.size() + ", reached timeout=" + arrayList.size() + ", total duration=" + j10 + " millis");
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar.c() != null) {
                    ironLog = IronLog.INTERNAL;
                    sb = new StringBuilder();
                    sb.append(jVar.b());
                    sb.append(" - success (");
                    sb.append(jVar.d());
                    str = " millis)";
                } else {
                    ironLog = IronLog.INTERNAL;
                    sb = new StringBuilder();
                    sb.append(jVar.b());
                    sb.append(" - failed (");
                    sb.append(jVar.d());
                    sb.append(" millis) error: ");
                    str = jVar.e();
                }
                w0.f(sb, str, ironLog);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose(((String) it2.next()) + " reached timeout");
            }
            this.f4330a.a(arrayList2, j10, arrayList);
        }

        public final void onWorkFailed(String str) {
            String j10 = com.ironsource.adapters.ironsource.a.j("failed to collect bidding data, error= ", str);
            IronLog.INTERNAL.verbose(j10);
            this.f4330a.a(j10);
        }
    }

    public final void a(List<a> list, a aVar, long j10, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            for (a addCallable : list) {
                workerManager.addCallable(addCallable);
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j10 + " millis");
            workerManager.startWork(new b(this, aVar), j10, timeUnit);
        } catch (Throwable th) {
            String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            IronLog.INTERNAL.error(str);
            aVar.a(str);
        }
    }
}
