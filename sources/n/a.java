package n;

import androidx.fragment.app.w0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a<V> implements Future {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f9454d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f9455e = Logger.getLogger(a.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final C0114a f9456f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f9457g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f9458a;

    /* renamed from: b  reason: collision with root package name */
    public volatile d f9459b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f9460c;

    /* renamed from: n.a$a  reason: collision with other inner class name */
    public static abstract class C0114a {
        public abstract boolean a(a aVar, d dVar);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f9461c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f9462d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9463a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f9464b;

        static {
            if (a.f9454d) {
                f9462d = null;
                f9461c = null;
                return;
            }
            f9462d = new b((Throwable) null, false);
            f9461c = new b((Throwable) null, true);
        }

        public b(Throwable th, boolean z9) {
            this.f9463a = z9;
            this.f9464b = th;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f9465a;

        /* renamed from: n.a$c$a  reason: collision with other inner class name */
        public class C0115a extends Throwable {
            public C0115a() {
                super("Failure occurred while trying to finish a future.");
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0115a());
        }

        public c(Throwable th) {
            boolean z9 = a.f9454d;
            th.getClass();
            this.f9465a = th;
        }
    }

    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f9466d = new d();

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f9467a = null;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f9468b = null;

        /* renamed from: c  reason: collision with root package name */
        public d f9469c;
    }

    public static final class e extends C0114a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f9470a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f9471b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f9472c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f9473d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f9474e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f9470a = atomicReferenceFieldUpdater;
            this.f9471b = atomicReferenceFieldUpdater2;
            this.f9472c = atomicReferenceFieldUpdater3;
            this.f9473d = atomicReferenceFieldUpdater4;
            this.f9474e = atomicReferenceFieldUpdater5;
        }

        public final boolean a(a aVar, d dVar) {
            d dVar2 = d.f9466d;
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f9473d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f9474e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f9472c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        public final void d(h hVar, h hVar2) {
            this.f9471b.lazySet(hVar, hVar2);
        }

        public final void e(h hVar, Thread thread) {
            this.f9470a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        public final void run() {
            throw null;
        }
    }

    public static final class g extends C0114a {
        public final boolean a(a aVar, d dVar) {
            d dVar2 = d.f9466d;
            synchronized (aVar) {
                if (aVar.f9459b != dVar) {
                    return false;
                }
                aVar.f9459b = dVar2;
                return true;
            }
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f9458a != obj) {
                    return false;
                }
                aVar.f9458a = obj2;
                return true;
            }
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f9460c != hVar) {
                    return false;
                }
                aVar.f9460c = hVar2;
                return true;
            }
        }

        public final void d(h hVar, h hVar2) {
            hVar.f9477b = hVar2;
        }

        public final void e(h hVar, Thread thread) {
            hVar.f9476a = thread;
        }
    }

    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f9475c = new h(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f9476a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f9477b;

        public h() {
            a.f9456f.e(this, Thread.currentThread());
        }

        public h(int i10) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: n.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: n.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: n.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: n.a$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<n.a$h> r0 = n.a.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f9454d = r1
            java.lang.Class<n.a> r1 = n.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f9455e = r1
            n.a$e r1 = new n.a$e     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<n.a> r2 = n.a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<n.a> r0 = n.a.class
            java.lang.Class<n.a$d> r2 = n.a.d.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<n.a> r0 = n.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            n.a$g r1 = new n.a$g
            r1.<init>()
        L_0x0054:
            f9456f = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f9455e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f9457g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a.<clinit>():void");
    }

    public static void c(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f9460c;
        } while (!f9456f.c(aVar, hVar, h.f9475c));
        while (hVar != null) {
            Thread thread = hVar.f9476a;
            if (thread != null) {
                hVar.f9476a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f9477b;
        }
        aVar.b();
        do {
            dVar = aVar.f9459b;
        } while (!f9456f.a(aVar, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f9469c;
            dVar.f9469c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f9469c;
            Runnable runnable = dVar2.f9467a;
            if (!(runnable instanceof f)) {
                Executor executor = dVar2.f9468b;
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    f9455e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
                }
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
            }
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f9464b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f9465a);
        } else if (obj == f9457g) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String str;
        String str2 = "]";
        boolean z9 = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (ExecutionException e10) {
                sb.append("FAILURE, cause=[");
                sb.append(e10.getCause());
                sb.append(str2);
                return;
            } catch (CancellationException unused2) {
                str2 = "CANCELLED";
                sb.append(str2);
                return;
            } catch (RuntimeException e11) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e11.getClass());
                str2 = " thrown from get()]";
                sb.append(str2);
                return;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            str = "this future";
        } else {
            str = String.valueOf(obj);
        }
        sb.append(str);
        sb.append(str2);
    }

    public void b() {
    }

    public final boolean cancel(boolean z9) {
        Object obj = this.f9458a;
        if ((obj == null) || (obj instanceof f)) {
            b bVar = f9454d ? new b(new CancellationException("Future.cancel() was called."), z9) : z9 ? b.f9461c : b.f9462d;
            while (!f9456f.b(this, obj, bVar)) {
                obj = this.f9458a;
                if (!(obj instanceof f)) {
                }
            }
            c(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    public final String e() {
        Object obj = this.f9458a;
        if (obj instanceof f) {
            StringBuilder g10 = androidx.activity.f.g("setFuture=[");
            ((f) obj).getClass();
            g10.append("null");
            g10.append("]");
            return g10.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder g11 = androidx.activity.f.g("remaining delay=[");
            g11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            g11.append(" ms]");
            return g11.toString();
        }
    }

    public final void f(h hVar) {
        hVar.f9476a = null;
        while (true) {
            h hVar2 = this.f9460c;
            if (hVar2 != h.f9475c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f9477b;
                    if (hVar2.f9476a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f9477b = hVar4;
                        if (hVar3.f9476a == null) {
                        }
                    } else if (!f9456f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9458a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return d(obj2);
            }
            h hVar = this.f9460c;
            if (hVar != h.f9475c) {
                h hVar2 = new h();
                do {
                    C0114a aVar = f9456f;
                    aVar.d(hVar2, hVar);
                    if (aVar.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9458a;
                            } else {
                                f(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return d(obj);
                    }
                    hVar = this.f9460c;
                } while (hVar != h.f9475c);
            }
            return d(this.f9458a);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f9458a instanceof b;
    }

    public final boolean isDone() {
        Object obj = this.f9458a;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f9458a instanceof b) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str2 = e();
                } catch (RuntimeException e10) {
                    StringBuilder g10 = androidx.activity.f.g("Exception thrown from implementation: ");
                    g10.append(e10.getClass());
                    str2 = g10.toString();
                }
                if (str2 != null && !str2.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str2);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public final V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f9458a;
            boolean z9 = true;
            if ((obj != null) && (!(obj instanceof f))) {
                return d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f9460c;
                if (hVar != h.f9475c) {
                    h hVar2 = new h();
                    do {
                        C0114a aVar = f9456f;
                        aVar.d(hVar2, hVar);
                        if (aVar.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f9458a;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(hVar2);
                        } else {
                            hVar = this.f9460c;
                        }
                    } while (hVar != h.f9475c);
                }
                return d(this.f9458a);
            }
            while (nanos > 0) {
                Object obj3 = this.f9458a;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar2 = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String g10 = com.ironsource.adapters.ironsource.a.g(str, " (plus ");
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i10 != 0 && nanos2 <= 1000) {
                    z9 = false;
                }
                if (i10 > 0) {
                    String str2 = g10 + convert + " " + lowerCase;
                    if (z9) {
                        str2 = com.ironsource.adapters.ironsource.a.g(str2, ",");
                    }
                    g10 = com.ironsource.adapters.ironsource.a.g(str2, " ");
                }
                if (z9) {
                    g10 = g10 + nanos2 + " nanoseconds ";
                }
                str = com.ironsource.adapters.ironsource.a.g(g10, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(com.ironsource.adapters.ironsource.a.g(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(w0.d(str, " for ", aVar2));
        }
        throw new InterruptedException();
    }
}
