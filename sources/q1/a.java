package q1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: q1.a$a  reason: collision with other inner class name */
    public class C0129a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f10971a;

        public C0129a(Runnable runnable) {
            this.f10971a = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f10971a.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C0129a(runnable), "glide-active-resources");
    }
}
