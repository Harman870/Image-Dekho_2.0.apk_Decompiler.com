package n4;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import r3.o;

public final class m4 extends b5 {
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public l4 f9950c;

    /* renamed from: d  reason: collision with root package name */
    public l4 f9951d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue f9952e = new PriorityBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedBlockingQueue f9953f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    public final j4 f9954g = new j4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    public final j4 f9955h = new j4(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i  reason: collision with root package name */
    public final Object f9956i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f9957j = new Semaphore(2);

    public m4(n4 n4Var) {
        super(n4Var);
    }

    public final void g() {
        if (Thread.currentThread() != this.f9950c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean h() {
        return false;
    }

    public final void k() {
        if (Thread.currentThread() != this.f9951d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f9600a.a().f9831i;
        r3.a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f9600a.a().f9831i.a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            n4.n4 r0 = r1.f9600a     // Catch:{ all -> 0x0045 }
            n4.m4 r0 = r0.d()     // Catch:{ all -> 0x0045 }
            r0.o(r6)     // Catch:{ all -> 0x0045 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0026 }
            monitor-exit(r2)     // Catch:{ all -> 0x0045 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0025
            n4.n4 r3 = r1.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.f9831i
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.a(r4)
        L_0x0025:
            return r2
        L_0x0026:
            n4.n4 r3 = r1.f9600a     // Catch:{ all -> 0x0045 }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x0045 }
            n4.g3 r3 = r3.f9831i     // Catch:{ all -> 0x0045 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r4.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0045 }
            r4.append(r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0045 }
            r3.a(r4)     // Catch:{ all -> 0x0045 }
            monitor-exit(r2)     // Catch:{ all -> 0x0045 }
            r2 = 0
            return r2
        L_0x0045:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0045 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.m4.l(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final k4 m(Callable callable) {
        i();
        k4 k4Var = new k4(this, callable, false);
        if (Thread.currentThread() == this.f9950c) {
            if (!this.f9952e.isEmpty()) {
                this.f9600a.a().f9831i.a("Callable skipped the worker queue.");
            }
            k4Var.run();
        } else {
            r(k4Var);
        }
        return k4Var;
    }

    public final void n(Runnable runnable) {
        i();
        k4 k4Var = new k4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f9956i) {
            this.f9953f.add(k4Var);
            l4 l4Var = this.f9951d;
            if (l4Var == null) {
                l4 l4Var2 = new l4(this, "Measurement Network", this.f9953f);
                this.f9951d = l4Var2;
                l4Var2.setUncaughtExceptionHandler(this.f9955h);
                this.f9951d.start();
            } else {
                synchronized (l4Var.f9914a) {
                    l4Var.f9914a.notifyAll();
                }
            }
        }
    }

    public final void o(Runnable runnable) {
        i();
        o.h(runnable);
        r(new k4(this, runnable, false, "Task exception on worker thread"));
    }

    public final void p(Runnable runnable) {
        i();
        r(new k4(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean q() {
        return Thread.currentThread() == this.f9950c;
    }

    public final void r(k4 k4Var) {
        synchronized (this.f9956i) {
            this.f9952e.add(k4Var);
            l4 l4Var = this.f9950c;
            if (l4Var == null) {
                l4 l4Var2 = new l4(this, "Measurement Worker", this.f9952e);
                this.f9950c = l4Var2;
                l4Var2.setUncaughtExceptionHandler(this.f9954g);
                this.f9950c.start();
            } else {
                synchronized (l4Var.f9914a) {
                    l4Var.f9914a.notifyAll();
                }
            }
        }
    }
}
