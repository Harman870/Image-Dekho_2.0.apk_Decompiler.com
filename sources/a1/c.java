package a1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<Params, Progress, Result> {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadPoolExecutor f40f;

    /* renamed from: g  reason: collision with root package name */
    public static e f41g;

    /* renamed from: a  reason: collision with root package name */
    public final b f42a;

    /* renamed from: b  reason: collision with root package name */
    public final C0001c f43b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f44c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f45d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f46e = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f47a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder g10 = androidx.activity.f.g("ModernAsyncTask #");
            g10.append(this.f47a.getAndIncrement());
            return new Thread(runnable, g10.toString());
        }
    }

    public class b extends f<Params, Result> {
        public b() {
        }

        public final Result call() {
            c.this.f46e.set(true);
            try {
                Process.setThreadPriority(10);
                c.this.a(this.f52a);
                Binder.flushPendingCommands();
                c.this.d((Object) null);
                return null;
            } catch (Throwable th) {
                c.this.d((Object) null);
                throw th;
            }
        }
    }

    /* renamed from: a1.c$c  reason: collision with other inner class name */
    public class C0001c extends FutureTask<Result> {
        public C0001c(b bVar) {
            super(bVar);
        }

        public final void done() {
            try {
                Object obj = get();
                c cVar = c.this;
                if (!cVar.f46e.get()) {
                    cVar.d(obj);
                }
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (CancellationException unused) {
                c cVar2 = c.this;
                if (!cVar2.f46e.get()) {
                    cVar2.d((Object) null);
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static class d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final c f50a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f51b;

        public d(c cVar, Data... dataArr) {
            this.f50a = cVar;
            this.f51b = dataArr;
        }
    }

    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                c cVar = dVar.f50a;
                Data data = dVar.f51b[0];
                if (cVar.f45d.get()) {
                    cVar.b(data);
                } else {
                    cVar.c(data);
                }
                cVar.f44c = 3;
            } else if (i10 == 2) {
                dVar.f50a.getClass();
            }
        }
    }

    public static abstract class f<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f52a;
    }

    static {
        a aVar = new a();
        f40f = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public c() {
        b bVar = new b();
        this.f42a = bVar;
        this.f43b = new C0001c(bVar);
    }

    public abstract void a(Object... objArr);

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final void d(Object obj) {
        e eVar;
        synchronized (c.class) {
            if (f41g == null) {
                f41g = new e();
            }
            eVar = f41g;
        }
        eVar.obtainMessage(1, new d(this, obj)).sendToTarget();
    }
}
