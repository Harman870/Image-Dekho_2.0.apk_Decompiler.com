package e9;

import androidx.activity.f;
import h9.h;
import h9.q;
import h9.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import z7.e;

public abstract class e0 extends f0 implements w {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6228e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6229f;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    public static abstract class a implements Runnable, Comparable<a>, b0, r {

        /* renamed from: a  reason: collision with root package name */
        public long f6230a;

        /* renamed from: b  reason: collision with root package name */
        public Object f6231b;

        /* renamed from: c  reason: collision with root package name */
        public int f6232c;

        public final void a(b bVar) {
            if (this.f6231b != c6.b.f2470b) {
                this.f6231b = bVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: h9.q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void b() {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object r0 = r5.f6231b     // Catch:{ all -> 0x0031 }
                z7.e r1 = c6.b.f2470b     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)
                return
            L_0x0009:
                boolean r2 = r0 instanceof e9.e0.b     // Catch:{ all -> 0x0031 }
                r3 = 0
                if (r2 == 0) goto L_0x0011
                e9.e0$b r0 = (e9.e0.b) r0     // Catch:{ all -> 0x0031 }
                goto L_0x0012
            L_0x0011:
                r0 = r3
            L_0x0012:
                if (r0 != 0) goto L_0x0015
                goto L_0x002b
            L_0x0015:
                monitor-enter(r0)     // Catch:{ all -> 0x0031 }
                java.lang.Object r2 = r5.f6231b     // Catch:{ all -> 0x0020 }
                boolean r4 = r2 instanceof h9.q     // Catch:{ all -> 0x0020 }
                if (r4 == 0) goto L_0x0022
                r3 = r2
                h9.q r3 = (h9.q) r3     // Catch:{ all -> 0x0020 }
                goto L_0x0022
            L_0x0020:
                r1 = move-exception
                goto L_0x002f
            L_0x0022:
                if (r3 != 0) goto L_0x0025
                goto L_0x002a
            L_0x0025:
                int r2 = r5.f6232c     // Catch:{ all -> 0x0020 }
                r0.c(r2)     // Catch:{ all -> 0x0020 }
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            L_0x002b:
                r5.f6231b = r1     // Catch:{ all -> 0x0031 }
                monitor-exit(r5)
                return
            L_0x002f:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                throw r1     // Catch:{ all -> 0x0031 }
            L_0x0031:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e9.e0.a.b():void");
        }

        public final int compareTo(Object obj) {
            int i10 = ((this.f6230a - ((a) obj).f6230a) > 0 ? 1 : ((this.f6230a - ((a) obj).f6230a) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        public final void setIndex(int i10) {
            this.f6232c = i10;
        }

        public final String toString() {
            StringBuilder g10 = f.g("Delayed[nanos=");
            g10.append(this.f6230a);
            g10.append(']');
            return g10.toString();
        }
    }

    public static final class b extends q<a> {

        /* renamed from: b  reason: collision with root package name */
        public long f6233b;

        public b(long j10) {
            this.f6233b = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<e0> cls2 = e0.class;
        f6228e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f6229f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    public final void L(q8.f fVar, Runnable runnable) {
        T(runnable);
    }

    public void T(Runnable runnable) {
        if (U(runnable)) {
            Thread R = R();
            if (Thread.currentThread() != R) {
                LockSupport.unpark(R);
                return;
            }
            return;
        }
        u.f6270g.T(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[LOOP:2: B:22:0x0039->B:25:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._queue
            int r1 = r6._isCompleted
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f6228e
            r4 = 0
        L_0x000e:
            boolean r0 = r3.compareAndSet(r6, r4, r7)
            if (r0 == 0) goto L_0x0016
            r2 = r1
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x000e
        L_0x001c:
            if (r2 == 0) goto L_0x0000
            return r1
        L_0x001f:
            boolean r3 = r0 instanceof h9.h
            if (r3 == 0) goto L_0x0048
            r3 = r0
            h9.h r3 = (h9.h) r3
            int r4 = r3.a(r7)
            if (r4 == 0) goto L_0x0047
            if (r4 == r1) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0032
            goto L_0x0000
        L_0x0032:
            return r2
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f6228e
            h9.h r3 = r3.e()
        L_0x0039:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L_0x0039
            goto L_0x0000
        L_0x0047:
            return r1
        L_0x0048:
            z7.e r3 = c6.b.f2471c
            if (r0 != r3) goto L_0x004d
            return r2
        L_0x004d:
            h9.h r3 = new h9.h
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f6228e
        L_0x005f:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L_0x0067
            r2 = r1
            goto L_0x006d
        L_0x0067:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L_0x005f
        L_0x006d:
            if (r2 == 0) goto L_0x0000
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.e0.U(java.lang.Runnable):boolean");
    }

    public final boolean V() {
        boolean z9;
        h9.a<z<?>> aVar = this.f6227d;
        if (aVar == null || aVar.f7039b == aVar.f7040c) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof h) {
                return ((h) obj).d();
            }
            if (obj != c6.b.f2471c) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x007f A[EDGE_INSN: B:100:0x007f->B:48:0x007f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[LOOP:2: B:42:0x006d->B:45:0x0078, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long W() {
        /*
            r11 = this;
            boolean r0 = r11.Q()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            e9.e0$b r0 = (e9.e0.b) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0050
            boolean r6 = r0.b()
            if (r6 != 0) goto L_0x0050
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            T[] r8 = r0.f7076a     // Catch:{ all -> 0x004d }
            if (r8 != 0) goto L_0x0023
            r8 = r4
            goto L_0x0025
        L_0x0023:
            r8 = r8[r5]     // Catch:{ all -> 0x004d }
        L_0x0025:
            if (r8 != 0) goto L_0x002a
            monitor-exit(r0)
            r8 = r4
            goto L_0x0048
        L_0x002a:
            e9.e0$a r8 = (e9.e0.a) r8     // Catch:{ all -> 0x004d }
            long r9 = r8.f6230a     // Catch:{ all -> 0x004d }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0036
            r9 = r3
            goto L_0x0037
        L_0x0036:
            r9 = r5
        L_0x0037:
            if (r9 == 0) goto L_0x003e
            boolean r8 = r11.U(r8)     // Catch:{ all -> 0x004d }
            goto L_0x003f
        L_0x003e:
            r8 = r5
        L_0x003f:
            if (r8 == 0) goto L_0x0046
            h9.r r8 = r0.c(r5)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x0046:
            r8 = r4
        L_0x0047:
            monitor-exit(r0)
        L_0x0048:
            e9.e0$a r8 = (e9.e0.a) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x0050
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0050:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0055
            goto L_0x007f
        L_0x0055:
            boolean r6 = r0 instanceof h9.h
            if (r6 == 0) goto L_0x007b
            r6 = r0
            h9.h r6 = (h9.h) r6
            java.lang.Object r7 = r6.f()
            z7.e r8 = h9.h.f7060g
            if (r7 == r8) goto L_0x0067
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x0097
        L_0x0067:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f6228e
            h9.h r6 = r6.e()
        L_0x006d:
            boolean r8 = r7.compareAndSet(r11, r0, r6)
            if (r8 == 0) goto L_0x0074
            goto L_0x0050
        L_0x0074:
            java.lang.Object r8 = r7.get(r11)
            if (r8 == r0) goto L_0x006d
            goto L_0x0050
        L_0x007b:
            z7.e r6 = c6.b.f2471c
            if (r0 != r6) goto L_0x0081
        L_0x007f:
            r7 = r4
            goto L_0x0097
        L_0x0081:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f6228e
        L_0x0083:
            boolean r7 = r6.compareAndSet(r11, r0, r4)
            if (r7 == 0) goto L_0x008b
            r6 = r3
            goto L_0x0092
        L_0x008b:
            java.lang.Object r7 = r6.get(r11)
            if (r7 == r0) goto L_0x0083
            r6 = r5
        L_0x0092:
            if (r6 == 0) goto L_0x0050
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x0097:
            if (r7 == 0) goto L_0x009d
            r7.run()
            return r1
        L_0x009d:
            h9.a<e9.z<?>> r0 = r11.f6227d
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00a7
            goto L_0x00b1
        L_0x00a7:
            int r8 = r0.f7039b
            int r0 = r0.f7040c
            if (r8 != r0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r3 = r5
        L_0x00af:
            if (r3 == 0) goto L_0x00b3
        L_0x00b1:
            r8 = r6
            goto L_0x00b4
        L_0x00b3:
            r8 = r1
        L_0x00b4:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            goto L_0x00f6
        L_0x00b9:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x00be
            goto L_0x00cb
        L_0x00be:
            boolean r3 = r0 instanceof h9.h
            if (r3 == 0) goto L_0x00f1
            h9.h r0 = (h9.h) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00cb
            goto L_0x00f6
        L_0x00cb:
            java.lang.Object r0 = r11._delayed
            e9.e0$b r0 = (e9.e0.b) r0
            if (r0 != 0) goto L_0x00d2
            goto L_0x00dd
        L_0x00d2:
            monitor-enter(r0)
            T[] r3 = r0.f7076a     // Catch:{ all -> 0x00ee }
            if (r3 != 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r4 = r3[r5]     // Catch:{ all -> 0x00ee }
        L_0x00da:
            monitor-exit(r0)
            e9.e0$a r4 = (e9.e0.a) r4
        L_0x00dd:
            if (r4 != 0) goto L_0x00e0
            goto L_0x00f5
        L_0x00e0:
            long r3 = r4.f6230a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            goto L_0x00f6
        L_0x00ec:
            r1 = r3
            goto L_0x00f6
        L_0x00ee:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f1:
            z7.e r3 = c6.b.f2471c
            if (r0 != r3) goto L_0x00f6
        L_0x00f5:
            r1 = r6
        L_0x00f6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.e0.W():long");
    }

    public final void X() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        if ((r8 - r0.f6233b) > 0) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018 A[LOOP:0: B:6:0x0018->B:9:0x0023, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(long r13, e9.e0.a r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x000b
            r0 = r4
            goto L_0x0074
        L_0x000b:
            java.lang.Object r0 = r12._delayed
            e9.e0$b r0 = (e9.e0.b) r0
            if (r0 != 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f6229f
            e9.e0$b r6 = new e9.e0$b
            r6.<init>(r13)
        L_0x0018:
            boolean r0 = r5.compareAndSet(r12, r1, r6)
            if (r0 == 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            java.lang.Object r0 = r5.get(r12)
            if (r0 == 0) goto L_0x0018
        L_0x0025:
            java.lang.Object r0 = r12._delayed
            x8.f.c(r0)
            e9.e0$b r0 = (e9.e0.b) r0
        L_0x002c:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f6231b     // Catch:{ all -> 0x00b6 }
            z7.e r6 = c6.b.f2470b     // Catch:{ all -> 0x00b6 }
            if (r5 != r6) goto L_0x0035
            r0 = r3
            goto L_0x0073
        L_0x0035:
            monitor-enter(r0)     // Catch:{ all -> 0x00b6 }
            T[] r5 = r0.f7076a     // Catch:{ all -> 0x00b3 }
            if (r5 != 0) goto L_0x003c
            r5 = r1
            goto L_0x003e
        L_0x003c:
            r5 = r5[r2]     // Catch:{ all -> 0x00b3 }
        L_0x003e:
            e9.e0$a r5 = (e9.e0.a) r5     // Catch:{ all -> 0x00b3 }
            r6 = r12
            e9.u r6 = (e9.u) r6     // Catch:{ all -> 0x00b3 }
            int r6 = r6._isCompleted     // Catch:{ all -> 0x00b3 }
            if (r6 == 0) goto L_0x004a
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            r0 = r4
            goto L_0x0073
        L_0x004a:
            r6 = 0
            if (r5 != 0) goto L_0x0050
            r8 = r13
            goto L_0x0061
        L_0x0050:
            long r8 = r5.f6230a     // Catch:{ all -> 0x00b3 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0059
            r8 = r13
        L_0x0059:
            long r10 = r0.f6233b     // Catch:{ all -> 0x00b3 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0063
        L_0x0061:
            r0.f6233b = r8     // Catch:{ all -> 0x00b3 }
        L_0x0063:
            long r8 = r15.f6230a     // Catch:{ all -> 0x00b3 }
            long r10 = r0.f6233b     // Catch:{ all -> 0x00b3 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x006e
            r15.f6230a = r10     // Catch:{ all -> 0x00b3 }
        L_0x006e:
            r0.a(r15)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            r0 = r2
        L_0x0073:
            monitor-exit(r15)
        L_0x0074:
            if (r0 == 0) goto L_0x008b
            if (r0 == r4) goto L_0x0087
            if (r0 != r3) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected result"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0087:
            r12.S(r13, r15)
            goto L_0x00af
        L_0x008b:
            java.lang.Object r13 = r12._delayed
            e9.e0$b r13 = (e9.e0.b) r13
            if (r13 != 0) goto L_0x0092
            goto L_0x009d
        L_0x0092:
            monitor-enter(r13)
            T[] r14 = r13.f7076a     // Catch:{ all -> 0x00b0 }
            if (r14 != 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r1 = r14[r2]     // Catch:{ all -> 0x00b0 }
        L_0x009a:
            monitor-exit(r13)
            e9.e0$a r1 = (e9.e0.a) r1
        L_0x009d:
            if (r1 != r15) goto L_0x00a0
            r2 = r4
        L_0x00a0:
            if (r2 == 0) goto L_0x00af
            java.lang.Thread r13 = r12.R()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00af
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00af:
            return
        L_0x00b0:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00b3:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r13     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.e0.Y(long, e9.e0$a):void");
    }

    public void shutdown() {
        a aVar;
        ThreadLocal<d0> threadLocal = y0.f6276a;
        y0.f6276a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z9 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6228e;
                e eVar = c6.b.f2471c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, eVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    break;
                }
            } else if (obj instanceof h) {
                ((h) obj).b();
                break;
            } else if (obj == c6.b.f2471c) {
                break;
            } else {
                h hVar = new h(8, true);
                hVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6228e;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, hVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    break;
                }
            }
        }
        do {
        } while (W() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar == null) {
                aVar = null;
            } else {
                aVar = (a) bVar.d();
            }
            if (aVar != null) {
                S(nanoTime, aVar);
            } else {
                return;
            }
        }
    }
}
