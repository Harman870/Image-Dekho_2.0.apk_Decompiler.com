package t1;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.activity.f;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f11974b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    public static volatile int f11975c;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f11976a;

    /* renamed from: t1.a$a  reason: collision with other inner class name */
    public static final class C0144a implements ThreadFactory {

        /* renamed from: t1.a$a$a  reason: collision with other inner class name */
        public class C0145a extends Thread {
            public C0145a(Runnable runnable) {
                super(runnable);
            }

            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            return new C0145a(runnable);
        }
    }

    public static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadFactory f11977a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11978b;

        /* renamed from: c  reason: collision with root package name */
        public final c f11979c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f11980d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicInteger f11981e = new AtomicInteger();

        /* renamed from: t1.a$b$a  reason: collision with other inner class name */
        public class C0146a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f11982a;

            public C0146a(Runnable runnable) {
                this.f11982a = runnable;
            }

            public final void run() {
                if (b.this.f11980d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f11982a.run();
                } catch (Throwable th) {
                    b.this.f11979c.a(th);
                }
            }
        }

        public b(C0144a aVar, String str, boolean z9) {
            c.C0147a aVar2 = c.f11984a;
            this.f11977a = aVar;
            this.f11978b = str;
            this.f11979c = aVar2;
            this.f11980d = z9;
        }

        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f11977a.newThread(new C0146a(runnable));
            StringBuilder g10 = f.g("glide-");
            g10.append(this.f11978b);
            g10.append("-thread-");
            g10.append(this.f11981e.getAndIncrement());
            newThread.setName(g10.toString());
            return newThread;
        }
    }

    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0147a f11984a = new C0147a();

        /* renamed from: t1.a$c$a  reason: collision with other inner class name */
        public class C0147a implements c {
            public final void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void a(Throwable th);
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f11976a = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f11976a.awaitTermination(j10, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f11976a.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f11976a.invokeAll(collection);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f11976a.invokeAll(collection, j10, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f11976a.invokeAny(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f11976a.invokeAny(collection, j10, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f11976a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f11976a.isTerminated();
    }

    public final void shutdown() {
        this.f11976a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f11976a.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f11976a.submit(runnable);
    }

    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f11976a.submit(runnable, t10);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f11976a.submit(callable);
    }

    public final String toString() {
        return this.f11976a.toString();
    }
}
