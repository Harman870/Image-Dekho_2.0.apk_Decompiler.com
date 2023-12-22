package e0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f6156a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public int f6157b = 10;

    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final int f6158a;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f6158a = i10;
        }

        public final void run() {
            Process.setThreadPriority(this.f6158a);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f6156a, this.f6157b);
    }
}
