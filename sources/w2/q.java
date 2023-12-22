package w2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class q implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f12720a;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f12721a;

        public a(Runnable runnable) {
            this.f12721a = runnable;
        }

        public final void run() {
            try {
                this.f12721a.run();
            } catch (Exception e10) {
                a3.a.b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f12720a = executorService;
    }

    public final void execute(Runnable runnable) {
        this.f12720a.execute(new a(runnable));
    }
}
