package d;

import android.app.job.JobParameters;
import android.widget.RelativeLayout;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import d.t;
import d3.q;
import j6.u;
import u6.a;
import x8.f;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5959a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5960b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5961c;

    public /* synthetic */ s(Object obj, int i10, Object obj2) {
        this.f5959a = i10;
        this.f5960b = obj;
        this.f5961c = obj2;
    }

    public final void run() {
        q qVar;
        switch (this.f5959a) {
            case 0:
                t.a aVar = (t.a) this.f5960b;
                Runnable runnable = (Runnable) this.f5961c;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                int i10 = JobInfoSchedulerService.f2748a;
                ((JobInfoSchedulerService) this.f5960b).jobFinished((JobParameters) this.f5961c, false);
                return;
            case 2:
                u uVar = (u) this.f5960b;
                a<T> aVar2 = (a) this.f5961c;
                if (uVar.f8767b == u.f8765d) {
                    synchronized (uVar) {
                        qVar = uVar.f8766a;
                        uVar.f8766a = null;
                        uVar.f8767b = aVar2;
                    }
                    qVar.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 3:
                a7.q qVar2 = (a7.q) this.f5960b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f5961c;
                qVar2.getClass();
                try {
                    taskCompletionSource.setResult(qVar2.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            default:
                com.ironsource.mediationsdk.testSuite.a aVar3 = (com.ironsource.mediationsdk.testSuite.a) this.f5960b;
                TestSuiteActivity testSuiteActivity = (TestSuiteActivity) this.f5961c;
                f.f(aVar3, "this$0");
                RelativeLayout relativeLayout = aVar3.f4893c;
                if (relativeLayout != null) {
                    relativeLayout.addView(aVar3.f4894d);
                }
                testSuiteActivity.getContainer().addView(aVar3.f4893c);
                return;
        }
    }
}
