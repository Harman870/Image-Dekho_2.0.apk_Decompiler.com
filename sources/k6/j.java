package k6;

import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.concurrent.CountDownLatch;
import k6.l;
import x8.f;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9098c;

    public /* synthetic */ j(Runnable runnable, Object obj, int i10) {
        this.f9096a = i10;
        this.f9097b = runnable;
        this.f9098c = obj;
    }

    public final void run() {
        switch (this.f9096a) {
            case 0:
                Runnable runnable = this.f9097b;
                l.b bVar = (l.b) this.f9098c;
                try {
                    runnable.run();
                    return;
                } catch (Exception e10) {
                    ((l.a) bVar).a(e10);
                    return;
                }
            default:
                Runnable runnable2 = this.f9097b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f9098c;
                IronSourceThreadManager ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
                f.f(runnable2, "$it");
                f.f(countDownLatch, "$latch");
                runnable2.run();
                new s5.f(3, countDownLatch).run();
                return;
        }
    }
}
