package i9;

import e9.t;
import h9.m;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import o.g;
import o8.h;
import x8.f;
import y8.c;
import z7.e;

public final class a implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7947h = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7948i = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7949j = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    public static final e k = new e("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f7950a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7951b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7952c;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f7953d;

    /* renamed from: e  reason: collision with root package name */
    public final d f7954e;

    /* renamed from: f  reason: collision with root package name */
    public final d f7955f;

    /* renamed from: g  reason: collision with root package name */
    public final m<C0101a> f7956g;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: i9.a$a  reason: collision with other inner class name */
    public final class C0101a extends Thread {

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f7957h = AtomicIntegerFieldUpdater.newUpdater(C0101a.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final l f7958a;

        /* renamed from: b  reason: collision with root package name */
        public int f7959b;

        /* renamed from: c  reason: collision with root package name */
        public long f7960c;

        /* renamed from: d  reason: collision with root package name */
        public long f7961d;

        /* renamed from: e  reason: collision with root package name */
        public int f7962e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7963f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public C0101a() {
            throw null;
        }

        public C0101a(int i10) {
            a.this = a.this;
            setDaemon(true);
            this.f7958a = new l();
            this.f7959b = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = a.k;
            this.f7962e = c.f13073a.a();
            f(i10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: i9.g} */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
            if (r0 == null) goto L_0x008e;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final i9.g a(boolean r10) {
            /*
                r9 = this;
                int r0 = r9.f7959b
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x0007
                goto L_0x002e
            L_0x0007:
                i9.a r0 = i9.a.this
            L_0x0009:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r3 = (int) r3
                if (r3 != 0) goto L_0x0019
                r0 = r2
                goto L_0x002a
            L_0x0019:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = i9.a.f7948i
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L_0x0009
                r0 = r1
            L_0x002a:
                if (r0 == 0) goto L_0x0030
                r9.f7959b = r1
            L_0x002e:
                r0 = r1
                goto L_0x0031
            L_0x0030:
                r0 = r2
            L_0x0031:
                r3 = 0
                if (r0 == 0) goto L_0x0077
                if (r10 == 0) goto L_0x006c
                i9.a r10 = i9.a.this
                int r10 = r10.f7950a
                int r10 = r10 * 2
                int r10 = r9.d(r10)
                if (r10 != 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r1 = r2
            L_0x0044:
                if (r1 == 0) goto L_0x004c
                i9.g r10 = r9.e()
                if (r10 != 0) goto L_0x0076
            L_0x004c:
                i9.l r10 = r9.f7958a
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i9.l.f7981b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                i9.g r0 = (i9.g) r0
                if (r0 != 0) goto L_0x0060
                i9.g r10 = r10.d()
                goto L_0x0061
            L_0x0060:
                r10 = r0
            L_0x0061:
                if (r10 != 0) goto L_0x0076
                if (r1 != 0) goto L_0x0072
                i9.g r10 = r9.e()
                if (r10 != 0) goto L_0x0076
                goto L_0x0072
            L_0x006c:
                i9.g r10 = r9.e()
                if (r10 != 0) goto L_0x0076
            L_0x0072:
                i9.g r10 = r9.i(r2)
            L_0x0076:
                return r10
            L_0x0077:
                if (r10 == 0) goto L_0x008e
                i9.l r10 = r9.f7958a
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i9.l.f7981b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                i9.g r0 = (i9.g) r0
                if (r0 != 0) goto L_0x008c
                i9.g r0 = r10.d()
            L_0x008c:
                if (r0 != 0) goto L_0x0099
            L_0x008e:
                i9.a r10 = i9.a.this
                i9.d r10 = r10.f7955f
                java.lang.Object r10 = r10.d()
                r0 = r10
                i9.g r0 = (i9.g) r0
            L_0x0099:
                if (r0 != 0) goto L_0x009f
                i9.g r0 = r9.i(r1)
            L_0x009f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.a.C0101a.a(boolean):i9.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f7962e;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f7962e = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final g e() {
            d dVar;
            if (d(2) == 0) {
                g gVar = (g) a.this.f7954e.d();
                if (gVar != null) {
                    return gVar;
                }
                dVar = a.this.f7955f;
            } else {
                g gVar2 = (g) a.this.f7955f.d();
                if (gVar2 != null) {
                    return gVar2;
                }
                dVar = a.this.f7954e;
            }
            return (g) dVar.d();
        }

        public final void f(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f7953d);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i10) {
            int i11 = this.f7959b;
            boolean z9 = true;
            if (i11 != 1) {
                z9 = false;
            }
            if (z9) {
                a.f7948i.addAndGet(a.this, 4398046511104L);
            }
            if (i11 != i10) {
                this.f7959b = i10;
            }
            return z9;
        }

        public final g i(boolean z9) {
            long j10;
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int d10 = d(i10);
            a aVar = a.this;
            int i11 = 0;
            long j11 = Long.MAX_VALUE;
            while (i11 < i10) {
                i11++;
                d10++;
                if (d10 > i10) {
                    d10 = 1;
                }
                C0101a b10 = aVar.f7956g.b(d10);
                if (!(b10 == null || b10 == this)) {
                    l lVar = this.f7958a;
                    l lVar2 = b10.f7958a;
                    if (z9) {
                        j10 = lVar.e(lVar2);
                    } else {
                        lVar.getClass();
                        g d11 = lVar2.d();
                        if (d11 != null) {
                            lVar.a(d11, false);
                            j10 = -1;
                        } else {
                            j10 = lVar.f(lVar2, false);
                        }
                    }
                    if (j10 == -1) {
                        l lVar3 = this.f7958a;
                        lVar3.getClass();
                        g gVar = (g) l.f7981b.getAndSet(lVar3, (Object) null);
                        if (gVar == null) {
                            return lVar3.d();
                        }
                        return gVar;
                    } else if (j10 > 0) {
                        j11 = Math.min(j11, j10);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f7961d = j11;
            return null;
        }

        public final void run() {
            boolean z9;
            boolean z10;
            loop0:
            while (true) {
                boolean z11 = false;
                while (!a.this.isTerminated() && this.f7959b != 5) {
                    g a10 = a(this.f7963f);
                    if (a10 == null) {
                        this.f7963f = false;
                        if (this.f7961d == 0) {
                            if (this.nextParkedWorker != a.k) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (this.nextParkedWorker != a.k) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10 || this.workerCtl != -1 || a.this.isTerminated() || this.f7959b == 5) {
                                        break;
                                    }
                                    h(3);
                                    Thread.interrupted();
                                    if (this.f7960c == 0) {
                                        this.f7960c = System.nanoTime() + a.this.f7952c;
                                    }
                                    LockSupport.parkNanos(a.this.f7952c);
                                    if (System.nanoTime() - this.f7960c >= 0) {
                                        this.f7960c = 0;
                                        a aVar = a.this;
                                        synchronized (aVar.f7956g) {
                                            if (!aVar.isTerminated()) {
                                                if (((int) (aVar.controlState & 2097151)) > aVar.f7950a) {
                                                    if (f7957h.compareAndSet(this, -1, 1)) {
                                                        int i10 = this.indexInArray;
                                                        f(0);
                                                        aVar.o(this, i10, 0);
                                                        int andDecrement = (int) (a.f7948i.getAndDecrement(aVar) & 2097151);
                                                        if (andDecrement != i10) {
                                                            C0101a b10 = aVar.f7956g.b(andDecrement);
                                                            f.c(b10);
                                                            C0101a aVar2 = b10;
                                                            aVar.f7956g.c(i10, aVar2);
                                                            aVar2.f(i10);
                                                            aVar.o(aVar2, andDecrement, i10);
                                                        }
                                                        aVar.f7956g.c(andDecrement, (C0101a) null);
                                                        h hVar = h.f10610a;
                                                        this.f7959b = 5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.j(this);
                            }
                        } else if (!z11) {
                            z11 = true;
                        } else {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f7961d);
                            this.f7961d = 0;
                        }
                    } else {
                        this.f7961d = 0;
                        int b11 = a10.f7971b.b();
                        this.f7960c = 0;
                        if (this.f7959b == 3) {
                            this.f7959b = 2;
                        }
                        if (b11 != 0 && h(2)) {
                            a aVar3 = a.this;
                            if (!aVar3.t() && !aVar3.s(aVar3.controlState)) {
                                aVar3.t();
                            }
                        }
                        a.this.getClass();
                        try {
                            a10.run();
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (b11 != 0) {
                            a.f7948i.addAndGet(a.this, -2097152);
                            if (this.f7959b != 5) {
                                this.f7959b = 4;
                            }
                        }
                    }
                }
            }
            h(5);
            return;
        }
    }

    public a(int i10, int i11, long j10, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        this.f7950a = i10;
        this.f7951b = i11;
        this.f7952c = j10;
        this.f7953d = str;
        boolean z12 = true;
        if (i10 >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i11 >= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 <= 2097150) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (j10 <= 0 ? false : z12) {
                        this.f7954e = new d();
                        this.f7955f = new d();
                        this.parkedWorkersStack = 0;
                        this.f7956g = new m<>(i10 + 1);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(androidx.activity.f.f("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
            r10 = this;
            h9.m<i9.a$a> r0 = r10.f7956g
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0009
            r1 = -1
            goto L_0x005d
        L_0x0009:
            long r1 = r10.controlState     // Catch:{ all -> 0x0077 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0077 }
            int r1 = r5 - r1
            r2 = 0
            if (r1 >= 0) goto L_0x0021
            r1 = r2
        L_0x0021:
            int r6 = r10.f7950a     // Catch:{ all -> 0x0077 }
            if (r1 < r6) goto L_0x0027
            monitor-exit(r0)
            return r2
        L_0x0027:
            int r6 = r10.f7951b     // Catch:{ all -> 0x0077 }
            if (r5 < r6) goto L_0x002d
            monitor-exit(r0)
            return r2
        L_0x002d:
            long r5 = r10.controlState     // Catch:{ all -> 0x0077 }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x003f
            h9.m<i9.a$a> r7 = r10.f7956g     // Catch:{ all -> 0x0077 }
            java.lang.Object r7 = r7.b(r5)     // Catch:{ all -> 0x0077 }
            if (r7 != 0) goto L_0x003f
            r7 = r6
            goto L_0x0040
        L_0x003f:
            r7 = r2
        L_0x0040:
            if (r7 == 0) goto L_0x006b
            i9.a$a r7 = new i9.a$a     // Catch:{ all -> 0x0077 }
            r7.<init>(r5)     // Catch:{ all -> 0x0077 }
            h9.m<i9.a$a> r8 = r10.f7956g     // Catch:{ all -> 0x0077 }
            r8.c(r5, r7)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f7948i     // Catch:{ all -> 0x0077 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0077 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0077 }
            if (r5 != r3) goto L_0x0057
            r2 = r6
        L_0x0057:
            if (r2 == 0) goto L_0x005f
            r7.start()     // Catch:{ all -> 0x0077 }
            int r1 = r1 + r6
        L_0x005d:
            monitor-exit(r0)
            return r1
        L_0x005f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x006b:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.a.a():int");
    }

    public final void c(Runnable runnable, h hVar, boolean z9) {
        g gVar;
        C0101a aVar;
        g gVar2;
        boolean z10;
        d dVar;
        j.f7977e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            gVar = (g) runnable;
            gVar.f7970a = nanoTime;
            gVar.f7971b = hVar;
        } else {
            gVar = new i(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        C0101a aVar2 = null;
        if (currentThread instanceof C0101a) {
            aVar = (C0101a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar != null && f.a(a.this, this)) {
            aVar2 = aVar;
        }
        boolean z11 = true;
        if (aVar2 == null || aVar2.f7959b == 5 || (gVar.f7971b.b() == 0 && aVar2.f7959b == 2)) {
            gVar2 = gVar;
        } else {
            aVar2.f7963f = true;
            gVar2 = aVar2.f7958a.a(gVar, z9);
        }
        if (gVar2 != null) {
            if (gVar2.f7971b.b() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar = this.f7955f;
            } else {
                dVar = this.f7954e;
            }
            if (!dVar.a(gVar2)) {
                throw new RejectedExecutionException(f.j(" was terminated", this.f7953d));
            }
        }
        if (!z9 || aVar2 == null) {
            z11 = false;
        }
        if (gVar.f7971b.b() != 0) {
            long addAndGet = f7948i.addAndGet(this, 2097152);
            if (!z11 && !t() && !s(addAndGet)) {
                t();
            }
        } else if (!z11 && !t() && !s(this.controlState)) {
            t();
        }
    }

    public final void close() {
        C0101a aVar;
        int i10;
        g gVar;
        boolean z9;
        if (f7949j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof C0101a) {
                aVar = (C0101a) currentThread;
            } else {
                aVar = null;
            }
            if (aVar == null || !f.a(a.this, this)) {
                aVar = null;
            }
            synchronized (this.f7956g) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    C0101a b10 = this.f7956g.b(i11);
                    f.c(b10);
                    C0101a aVar2 = b10;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000);
                        }
                        l lVar = aVar2.f7958a;
                        d dVar = this.f7955f;
                        lVar.getClass();
                        g gVar2 = (g) l.f7981b.getAndSet(lVar, (Object) null);
                        if (gVar2 != null) {
                            dVar.a(gVar2);
                        }
                        do {
                            g d10 = lVar.d();
                            if (d10 == null) {
                                z9 = false;
                                continue;
                            } else {
                                dVar.a(d10);
                                z9 = true;
                                continue;
                            }
                        } while (z9);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            this.f7955f.b();
            this.f7954e.b();
            while (true) {
                if (aVar == null) {
                    gVar = null;
                } else {
                    gVar = aVar.a(true);
                }
                if (gVar == null && (gVar = (g) this.f7954e.d()) == null && (gVar = (g) this.f7955f.d()) == null) {
                    if (aVar != null) {
                        aVar.h(5);
                    }
                    this.parkedWorkersStack = 0;
                    this.controlState = 0;
                    return;
                }
                try {
                    gVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        c(runnable, j.f7978f, false);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(C0101a aVar) {
        long j10;
        long j11;
        if (aVar.c() == k) {
            do {
                j10 = this.parkedWorkersStack;
                int b10 = aVar.b();
                aVar.g(this.f7956g.b((int) (2097151 & j10)));
                j11 = (long) b10;
            } while (!f7947h.compareAndSet(this, j10, j11 | ((2097152 + j10) & -2097152)));
        }
    }

    public final void o(C0101a aVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                if (i11 == 0) {
                    C0101a aVar2 = aVar;
                    while (true) {
                        Object c10 = aVar2.c();
                        if (c10 != k) {
                            if (c10 != null) {
                                aVar2 = (C0101a) c10;
                                int b10 = aVar2.b();
                                if (b10 != 0) {
                                    i12 = b10;
                                    break;
                                }
                            } else {
                                i12 = 0;
                                break;
                            }
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f7947h.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final boolean s(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f7950a) {
            int a10 = a();
            if (a10 == 1 && this.f7950a > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        e eVar;
        int i10;
        while (true) {
            long j10 = this.parkedWorkersStack;
            C0101a b10 = this.f7956g.b((int) (2097151 & j10));
            if (b10 == null) {
                b10 = null;
            } else {
                long j11 = (2097152 + j10) & -2097152;
                C0101a aVar = b10;
                while (true) {
                    Object c10 = aVar.c();
                    eVar = k;
                    if (c10 != eVar) {
                        if (c10 != null) {
                            aVar = (C0101a) c10;
                            i10 = aVar.b();
                            if (i10 != 0) {
                                break;
                            }
                        } else {
                            i10 = 0;
                            break;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 < 0) {
                    continue;
                } else {
                    if (f7947h.compareAndSet(this, j10, ((long) i10) | j11)) {
                        b10.g(eVar);
                    } else {
                        continue;
                    }
                }
            }
            if (b10 == null) {
                return false;
            }
            if (C0101a.f7957h.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }

    public final String toString() {
        char c10;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f7956g.a();
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i11 < a10) {
            int i16 = i11 + 1;
            C0101a b10 = this.f7956g.b(i11);
            if (b10 != null) {
                int c11 = b10.f7958a.c();
                int b11 = g.b(b10.f7959b);
                if (b11 == 0) {
                    i10++;
                    sb = new StringBuilder();
                    sb.append(c11);
                    c10 = 'c';
                } else if (b11 == 1) {
                    i12++;
                    sb = new StringBuilder();
                    sb.append(c11);
                    c10 = 'b';
                } else if (b11 == 2) {
                    i13++;
                } else if (b11 == 3) {
                    i14++;
                    if (c11 > 0) {
                        sb = new StringBuilder();
                        sb.append(c11);
                        c10 = 'd';
                    }
                } else if (b11 == 4) {
                    i15++;
                }
                sb.append(c10);
                arrayList.add(sb.toString());
            }
            i11 = i16;
        }
        long j10 = this.controlState;
        return this.f7953d + '@' + t.c(this) + "[Pool Size {core = " + this.f7950a + ", max = " + this.f7951b + "}, Worker States {CPU = " + i10 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f7954e.c() + ", global blocking queue size = " + this.f7955f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f7950a - ((int) ((j10 & 9223367638808264704L) >> 42))) + "}]";
    }
}
