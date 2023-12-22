package e9;

import e9.n0;
import h9.f;
import h9.k;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o8.h;
import q8.f;
import w8.p;
import x8.f;
import z7.e;

public class r0 implements n0, k, w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6262a = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static final class a extends q0 {

        /* renamed from: e  reason: collision with root package name */
        public final r0 f6263e;

        /* renamed from: f  reason: collision with root package name */
        public final b f6264f;

        /* renamed from: g  reason: collision with root package name */
        public final j f6265g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f6266h;

        public a(r0 r0Var, b bVar, j jVar, Object obj) {
            this.f6263e = r0Var;
            this.f6264f = bVar;
            this.f6265g = jVar;
            this.f6266h = obj;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            k((Throwable) obj);
            return h.f10610a;
        }

        public final void k(Throwable th) {
            r0 r0Var = this.f6263e;
            b bVar = this.f6264f;
            j jVar = this.f6265g;
            Object obj = this.f6266h;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.f6262a;
            r0Var.getClass();
            j B = r0.B(jVar);
            if (B == null || !r0Var.I(bVar, B, obj)) {
                r0Var.g(r0Var.n(bVar, obj));
            }
        }
    }

    public static final class b implements j0 {
        private volatile /* synthetic */ Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        public final t0 f6267a;

        public b(t0 t0Var, Throwable th) {
            this.f6267a = t0Var;
            this._rootCause = th;
            this._exceptionsHolder = null;
        }

        public final boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(f.j(obj, "State is ").toString());
                }
            }
        }

        public final Throwable c() {
            return (Throwable) this._rootCause;
        }

        public final t0 d() {
            return this.f6267a;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final boolean g() {
            if (this._exceptionsHolder == c.a.f2345f) {
                return true;
            }
            return false;
        }

        public final ArrayList h(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(f.j(obj, "State is ").toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !f.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = c.a.f2345f;
            return arrayList;
        }

        public final void i() {
            this._isCompleting = 1;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [int, boolean] */
        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("Finishing[cancelling=");
            g10.append(e());
            g10.append(", completing=");
            g10.append(this._isCompleting);
            g10.append(", rootCause=");
            g10.append((Throwable) this._rootCause);
            g10.append(", exceptions=");
            g10.append(this._exceptionsHolder);
            g10.append(", list=");
            g10.append(this.f6267a);
            g10.append(']');
            return g10.toString();
        }
    }

    public static final class c extends f.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r0 f6268d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f6269e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h9.f fVar, r0 r0Var, Object obj) {
            super(fVar);
            this.f6268d = r0Var;
            this.f6269e = obj;
        }

        public final e c(Object obj) {
            h9.f fVar = (h9.f) obj;
            if (this.f6268d.q() == this.f6269e) {
                return null;
            }
            return c6.b.f2475g;
        }
    }

    public static j B(h9.f fVar) {
        while (fVar.i()) {
            h9.f e10 = fVar.e();
            if (e10 == null) {
                Object obj = fVar._prev;
                while (true) {
                    fVar = (h9.f) obj;
                    if (!fVar.i()) {
                        break;
                    }
                    obj = fVar._prev;
                }
            } else {
                fVar = e10;
            }
        }
        while (true) {
            fVar = fVar.h();
            if (!fVar.i()) {
                if (fVar instanceof j) {
                    return (j) fVar;
                }
                if (fVar instanceof t0) {
                    return null;
                }
            }
        }
    }

    public static String G(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof j0 ? ((j0) obj).a() ? "Active" : "New" : obj instanceof m ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        if (bVar.e()) {
            return "Cancelling";
        }
        if (bVar.f()) {
            return "Completing";
        }
    }

    public final void A(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o0(k(), (Throwable) null, this);
        }
        h(cancellationException);
    }

    public final void C(t0 t0Var, Throwable th) {
        e1.c cVar;
        e1.c cVar2 = null;
        for (h9.f fVar = (h9.f) t0Var.g(); !x8.f.a(fVar, t0Var); fVar = fVar.h()) {
            if (fVar instanceof p0) {
                q0 q0Var = (q0) fVar;
                try {
                    q0Var.k(th);
                } catch (Throwable th2) {
                    if (cVar2 == null) {
                        cVar = null;
                    } else {
                        z5.c.c(cVar2, th2);
                        cVar = cVar2;
                    }
                    if (cVar == null) {
                        cVar2 = new e1.c("Exception in completion handler " + q0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar2 != null) {
            w(cVar2);
        }
        i(th);
    }

    public void D(Object obj) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[LOOP:2: B:12:0x0036->B:15:0x0041, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(e9.q0 r6) {
        /*
            r5 = this;
            e9.t0 r0 = new e9.t0
            r0.<init>()
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h9.f.f7053b
            r1.lazySet(r0, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h9.f.f7052a
            r1.lazySet(r0, r6)
        L_0x0012:
            java.lang.Object r1 = r6.g()
            r2 = 0
            if (r1 == r6) goto L_0x001a
            goto L_0x0030
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h9.f.f7052a
        L_0x001c:
            boolean r3 = r1.compareAndSet(r6, r6, r0)
            r4 = 1
            if (r3 == 0) goto L_0x0025
            r2 = r4
            goto L_0x002b
        L_0x0025:
            java.lang.Object r3 = r1.get(r6)
            if (r3 == r6) goto L_0x001c
        L_0x002b:
            if (r2 == 0) goto L_0x0012
            r0.f(r6)
        L_0x0030:
            h9.f r1 = r6.h()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f6262a
        L_0x0036:
            boolean r0 = r2.compareAndSet(r5, r6, r1)
            if (r0 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            java.lang.Object r0 = r2.get(r5)
            if (r0 == r6) goto L_0x0036
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.r0.F(e9.q0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00af, code lost:
        if (r5 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b2, code lost:
        C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b7, code lost:
        if ((r8 instanceof e9.j) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b9, code lost:
        r0 = (e9.j) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00bd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00be, code lost:
        if (r0 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c0, code lost:
        r8 = r8.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c4, code lost:
        if (r8 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c7, code lost:
        r4 = B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cc, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00cd, code lost:
        if (r4 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d3, code lost:
        if (I(r3, r4, r9) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return n(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return c.a.f2342c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof e9.j0
            if (r0 != 0) goto L_0x0007
            z7.e r8 = c.a.f2341b
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof e9.c0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r8 instanceof e9.q0
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r8 instanceof e9.j
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9 instanceof e9.m
            if (r0 != 0) goto L_0x004c
            r0 = r8
            e9.j0 r0 = (e9.j0) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f6262a
            boolean r8 = r9 instanceof e9.j0
            if (r8 == 0) goto L_0x002c
            e9.k0 r8 = new e9.k0
            r4 = r9
            e9.j0 r4 = (e9.j0) r4
            r8.<init>(r4)
            r4 = r8
            goto L_0x002d
        L_0x002c:
            r4 = r9
        L_0x002d:
            boolean r8 = r3.compareAndSet(r7, r0, r4)
            if (r8 == 0) goto L_0x0035
            r8 = r1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r8 = r3.get(r7)
            if (r8 == r0) goto L_0x002d
            r8 = r2
        L_0x003c:
            if (r8 != 0) goto L_0x0040
            r1 = r2
            goto L_0x0046
        L_0x0040:
            r7.D(r9)
            r7.l(r0, r9)
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r9
        L_0x0049:
            z7.e r8 = c.a.f2343d
            return r8
        L_0x004c:
            e9.j0 r8 = (e9.j0) r8
            e9.t0 r0 = r7.p(r8)
            if (r0 != 0) goto L_0x0058
            z7.e r8 = c.a.f2343d
            goto L_0x00dc
        L_0x0058:
            boolean r3 = r8 instanceof e9.r0.b
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r8
            e9.r0$b r3 = (e9.r0.b) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            e9.r0$b r3 = new e9.r0$b
            r3.<init>(r0, r4)
        L_0x0069:
            monitor-enter(r3)
            boolean r5 = r3.f()     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0073
            z7.e r8 = c.a.f2341b     // Catch:{ all -> 0x00dd }
            goto L_0x008c
        L_0x0073:
            r3.i()     // Catch:{ all -> 0x00dd }
            if (r3 == r8) goto L_0x008e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f6262a     // Catch:{ all -> 0x00dd }
        L_0x007a:
            boolean r6 = r5.compareAndSet(r7, r8, r3)     // Catch:{ all -> 0x00dd }
            if (r6 == 0) goto L_0x0082
            r2 = r1
            goto L_0x0088
        L_0x0082:
            java.lang.Object r6 = r5.get(r7)     // Catch:{ all -> 0x00dd }
            if (r6 == r8) goto L_0x007a
        L_0x0088:
            if (r2 != 0) goto L_0x008e
            z7.e r8 = c.a.f2343d     // Catch:{ all -> 0x00dd }
        L_0x008c:
            monitor-exit(r3)
            goto L_0x00dc
        L_0x008e:
            boolean r2 = r3.e()     // Catch:{ all -> 0x00dd }
            boolean r5 = r9 instanceof e9.m     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x009a
            r5 = r9
            e9.m r5 = (e9.m) r5     // Catch:{ all -> 0x00dd }
            goto L_0x009b
        L_0x009a:
            r5 = r4
        L_0x009b:
            if (r5 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            java.lang.Throwable r5 = r5.f6251a     // Catch:{ all -> 0x00dd }
            r3.b(r5)     // Catch:{ all -> 0x00dd }
        L_0x00a3:
            java.lang.Throwable r5 = r3.c()     // Catch:{ all -> 0x00dd }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r5 = r4
        L_0x00ac:
            o8.h r1 = o8.h.f10610a     // Catch:{ all -> 0x00dd }
            monitor-exit(r3)
            if (r5 != 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r7.C(r0, r5)
        L_0x00b5:
            boolean r0 = r8 instanceof e9.j
            if (r0 == 0) goto L_0x00bd
            r0 = r8
            e9.j r0 = (e9.j) r0
            goto L_0x00be
        L_0x00bd:
            r0 = r4
        L_0x00be:
            if (r0 != 0) goto L_0x00cc
            e9.t0 r8 = r8.d()
            if (r8 != 0) goto L_0x00c7
            goto L_0x00cd
        L_0x00c7:
            e9.j r4 = B(r8)
            goto L_0x00cd
        L_0x00cc:
            r4 = r0
        L_0x00cd:
            if (r4 == 0) goto L_0x00d8
            boolean r8 = r7.I(r3, r4, r9)
            if (r8 == 0) goto L_0x00d8
            z7.e r8 = c.a.f2342c
            goto L_0x00dc
        L_0x00d8:
            java.lang.Object r8 = r7.n(r3, r9)
        L_0x00dc:
            return r8
        L_0x00dd:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.r0.H(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean I(b bVar, j jVar, Object obj) {
        do {
            jVar.getClass();
            if (n0.a.a((n0) null, false, new a(this, bVar, jVar, obj), 1) != u0.f6272a) {
                return true;
            }
            jVar = B(jVar);
        } while (jVar != null);
        return false;
    }

    public boolean a() {
        Object q10 = q();
        return (q10 instanceof j0) && ((j0) q10).a();
    }

    public final boolean f(Object obj, t0 t0Var, q0 q0Var) {
        boolean z9;
        boolean z10;
        c cVar = new c(q0Var, this, obj);
        do {
            h9.f e10 = t0Var.e();
            if (e10 == null) {
                Object obj2 = t0Var._prev;
                while (true) {
                    e10 = (h9.f) obj2;
                    if (!e10.i()) {
                        break;
                    }
                    obj2 = e10._prev;
                }
            }
            h9.f.f7053b.lazySet(q0Var, e10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h9.f.f7052a;
            atomicReferenceFieldUpdater.lazySet(q0Var, t0Var);
            cVar.f7056c = t0Var;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(e10, t0Var, cVar)) {
                    if (atomicReferenceFieldUpdater.get(e10) != t0Var) {
                        z9 = false;
                        break;
                    }
                } else {
                    z9 = true;
                    break;
                }
            }
            if (!z9) {
                z10 = false;
            } else if (cVar.a(e10) == null) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        } while (!z10);
        return false;
    }

    public final <R> R fold(R r4, p<? super R, ? super f.b, ? extends R> pVar) {
        x8.f.f(pVar, "operation");
        return pVar.a(r4, this);
    }

    public void g(Object obj) {
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f.c<?> getKey() {
        return n0.b.f6255a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0087, code lost:
        r10 = c.a.f2341b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0087 A[EDGE_INSN: B:65:0x0087->B:47:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r9.q()
            boolean r3 = r2 instanceof e9.r0.b
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x004d
            monitor-enter(r2)
            r3 = r2
            e9.r0$b r3 = (e9.r0.b) r3     // Catch:{ all -> 0x004a }
            boolean r3 = r3.g()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x001b
            z7.e r10 = c.a.f2344e     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            goto L_0x00b1
        L_0x001b:
            r3 = r2
            e9.r0$b r3 = (e9.r0.b) r3     // Catch:{ all -> 0x004a }
            boolean r3 = r3.e()     // Catch:{ all -> 0x004a }
            if (r10 != 0) goto L_0x0026
            if (r3 != 0) goto L_0x0032
        L_0x0026:
            if (r1 != 0) goto L_0x002c
            java.lang.Throwable r1 = r9.m(r10)     // Catch:{ all -> 0x004a }
        L_0x002c:
            r10 = r2
            e9.r0$b r10 = (e9.r0.b) r10     // Catch:{ all -> 0x004a }
            r10.b(r1)     // Catch:{ all -> 0x004a }
        L_0x0032:
            r10 = r2
            e9.r0$b r10 = (e9.r0.b) r10     // Catch:{ all -> 0x004a }
            java.lang.Throwable r10 = r10.c()     // Catch:{ all -> 0x004a }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003e
            r0 = r10
        L_0x003e:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0042
            goto L_0x0087
        L_0x0042:
            e9.r0$b r2 = (e9.r0.b) r2
            e9.t0 r10 = r2.f6267a
            r9.C(r10, r0)
            goto L_0x0087
        L_0x004a:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x004d:
            boolean r3 = r2 instanceof e9.j0
            if (r3 == 0) goto L_0x00af
            if (r1 != 0) goto L_0x0057
            java.lang.Throwable r1 = r9.m(r10)
        L_0x0057:
            r3 = r2
            e9.j0 r3 = (e9.j0) r3
            boolean r6 = r3.a()
            if (r6 == 0) goto L_0x008a
            e9.t0 r6 = r9.p(r3)
            if (r6 != 0) goto L_0x0067
            goto L_0x007f
        L_0x0067:
            e9.r0$b r7 = new e9.r0$b
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f6262a
        L_0x006e:
            boolean r2 = r8.compareAndSet(r9, r3, r7)
            if (r2 == 0) goto L_0x0076
            r2 = r4
            goto L_0x007d
        L_0x0076:
            java.lang.Object r2 = r8.get(r9)
            if (r2 == r3) goto L_0x006e
            r2 = r5
        L_0x007d:
            if (r2 != 0) goto L_0x0081
        L_0x007f:
            r2 = r5
            goto L_0x0085
        L_0x0081:
            r9.C(r6, r1)
            r2 = r4
        L_0x0085:
            if (r2 == 0) goto L_0x0002
        L_0x0087:
            z7.e r10 = c.a.f2341b
            goto L_0x00b1
        L_0x008a:
            e9.m r3 = new e9.m
            r3.<init>(r1, r5)
            java.lang.Object r3 = r9.H(r2, r3)
            z7.e r6 = c.a.f2341b
            if (r3 == r6) goto L_0x009f
            z7.e r2 = c.a.f2343d
            if (r3 != r2) goto L_0x009d
            goto L_0x0002
        L_0x009d:
            r10 = r3
            goto L_0x00b1
        L_0x009f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = x8.f.j(r2, r0)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00af:
            z7.e r10 = c.a.f2344e
        L_0x00b1:
            z7.e r0 = c.a.f2341b
            if (r10 != r0) goto L_0x00b6
            goto L_0x00c4
        L_0x00b6:
            z7.e r0 = c.a.f2342c
            if (r10 != r0) goto L_0x00bb
            goto L_0x00c4
        L_0x00bb:
            z7.e r0 = c.a.f2344e
            if (r10 != r0) goto L_0x00c1
            r4 = r5
            goto L_0x00c4
        L_0x00c1:
            r9.g(r10)
        L_0x00c4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.r0.h(java.lang.Object):boolean");
    }

    public final boolean i(Throwable th) {
        if (x()) {
            return true;
        }
        boolean z9 = th instanceof CancellationException;
        i iVar = (i) this._parentHandle;
        if (iVar == null || iVar == u0.f6272a) {
            return z9;
        }
        if (iVar.c(th) || z9) {
            return true;
        }
        return false;
    }

    public String k() {
        return "Job was cancelled";
    }

    public final void l(j0 j0Var, Object obj) {
        m mVar;
        Throwable th;
        e1.c cVar;
        i iVar = (i) this._parentHandle;
        if (iVar != null) {
            iVar.b();
            this._parentHandle = u0.f6272a;
        }
        if (obj instanceof m) {
            mVar = (m) obj;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            th = null;
        } else {
            th = mVar.f6251a;
        }
        if (j0Var instanceof q0) {
            try {
                ((q0) j0Var).k(th);
            } catch (Throwable th2) {
                w(new e1.c("Exception in completion handler " + j0Var + " for " + this, th2));
            }
        } else {
            t0 d10 = j0Var.d();
            if (d10 != null) {
                e1.c cVar2 = null;
                for (h9.f fVar = (h9.f) d10.g(); !x8.f.a(fVar, d10); fVar = fVar.h()) {
                    if (fVar instanceof q0) {
                        q0 q0Var = (q0) fVar;
                        try {
                            q0Var.k(th);
                        } catch (Throwable th3) {
                            if (cVar2 == null) {
                                cVar = null;
                            } else {
                                z5.c.c(cVar2, th3);
                                cVar = cVar2;
                            }
                            if (cVar == null) {
                                cVar2 = new e1.c("Exception in completion handler " + q0Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (cVar2 != null) {
                    w(cVar2);
                }
            }
        }
    }

    public final Throwable m(Object obj) {
        boolean z9;
        if (obj == null) {
            z9 = true;
        } else {
            z9 = obj instanceof Throwable;
        }
        if (z9) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new o0(k(), (Throwable) null, this);
            }
            return th;
        } else if (obj != null) {
            return ((w0) obj).t();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    public final q8.f minusKey(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d1 A[LOOP:2: B:59:0x00d1->B:62:0x00dc, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(e9.r0.b r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e9.m
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r10
            e9.m r0 = (e9.m) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 != 0) goto L_0x000e
            r0 = r1
            goto L_0x0010
        L_0x000e:
            java.lang.Throwable r0 = r0.f6251a
        L_0x0010:
            monitor-enter(r9)
            r9.e()     // Catch:{ all -> 0x00e2 }
            java.util.ArrayList r2 = r9.h(r0)     // Catch:{ all -> 0x00e2 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00e2 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0031
            boolean r3 = r9.e()     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x0053
            e9.o0 r3 = new e9.o0     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = r8.k()     // Catch:{ all -> 0x00e2 }
            r3.<init>(r6, r1, r8)     // Catch:{ all -> 0x00e2 }
            r1 = r3
            goto L_0x0053
        L_0x0031:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x0035:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x00e2 }
            r7 = r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x00e2 }
            boolean r7 = r7 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00e2 }
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0035
            r1 = r6
        L_0x0048:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            java.lang.Object r1 = r2.get(r5)     // Catch:{ all -> 0x00e2 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00e2 }
        L_0x0053:
            if (r1 == 0) goto L_0x008b
            int r3 = r2.size()     // Catch:{ all -> 0x00e2 }
            if (r3 > r4) goto L_0x005c
            goto L_0x008b
        L_0x005c:
            int r3 = r2.size()     // Catch:{ all -> 0x00e2 }
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00e2 }
            r6.<init>(r3)     // Catch:{ all -> 0x00e2 }
            java.util.Set r3 = java.util.Collections.newSetFromMap(r6)     // Catch:{ all -> 0x00e2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x006d:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x008b
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00e2 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00e2 }
            if (r6 == r1) goto L_0x006d
            if (r6 == r1) goto L_0x006d
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00e2 }
            if (r7 != 0) goto L_0x006d
            boolean r7 = r3.add(r6)     // Catch:{ all -> 0x00e2 }
            if (r7 == 0) goto L_0x006d
            z5.c.c(r1, r6)     // Catch:{ all -> 0x00e2 }
            goto L_0x006d
        L_0x008b:
            monitor-exit(r9)
            if (r1 != 0) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            if (r1 != r0) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            e9.m r10 = new e9.m
            r10.<init>(r1, r5)
        L_0x0097:
            if (r1 == 0) goto L_0x00be
            boolean r0 = r8.i(r1)
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r8.r(r1)
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r0 = r5
            goto L_0x00a9
        L_0x00a8:
            r0 = r4
        L_0x00a9:
            if (r0 == 0) goto L_0x00be
            if (r10 == 0) goto L_0x00b6
            r0 = r10
            e9.m r0 = (e9.m) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = e9.m.f6250b
            r1.compareAndSet(r0, r5, r4)
            goto L_0x00be
        L_0x00b6:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r9.<init>(r10)
            throw r9
        L_0x00be:
            r8.D(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f6262a
            boolean r1 = r10 instanceof e9.j0
            if (r1 == 0) goto L_0x00d0
            e9.k0 r1 = new e9.k0
            r2 = r10
            e9.j0 r2 = (e9.j0) r2
            r1.<init>(r2)
            goto L_0x00d1
        L_0x00d0:
            r1 = r10
        L_0x00d1:
            boolean r2 = r0.compareAndSet(r8, r9, r1)
            if (r2 == 0) goto L_0x00d8
            goto L_0x00de
        L_0x00d8:
            java.lang.Object r2 = r0.get(r8)
            if (r2 == r9) goto L_0x00d1
        L_0x00de:
            r8.l(r9, r10)
            return r10
        L_0x00e2:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.r0.n(e9.r0$b, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[LOOP:2: B:28:0x004c->B:31:0x0057, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e9.b0 o(boolean r8, boolean r9, e9.q0 r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof e9.p0
            if (r1 == 0) goto L_0x000b
            r1 = r10
            e9.p0 r1 = (e9.p0) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0015
            e9.m0 r1 = new e9.m0
            r1.<init>(r10)
            goto L_0x0015
        L_0x0014:
            r1 = r10
        L_0x0015:
            r1.f6260d = r7
        L_0x0017:
            java.lang.Object r2 = r7.q()
            boolean r3 = r2 instanceof e9.c0
            if (r3 == 0) goto L_0x005a
            r3 = r2
            e9.c0 r3 = (e9.c0) r3
            boolean r4 = r3.f6223a
            if (r4 == 0) goto L_0x003a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f6262a
        L_0x0028:
            boolean r3 = r4.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0037
        L_0x0030:
            java.lang.Object r3 = r4.get(r7)
            if (r3 == r2) goto L_0x0028
            r2 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x003a:
            e9.t0 r2 = new e9.t0
            r2.<init>()
            boolean r4 = r3.f6223a
            if (r4 == 0) goto L_0x0045
            r4 = r2
            goto L_0x004a
        L_0x0045:
            e9.i0 r4 = new e9.i0
            r4.<init>(r2)
        L_0x004a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f6262a
        L_0x004c:
            boolean r2 = r5.compareAndSet(r7, r3, r4)
            if (r2 == 0) goto L_0x0053
            goto L_0x0017
        L_0x0053:
            java.lang.Object r2 = r5.get(r7)
            if (r2 == r3) goto L_0x004c
            goto L_0x0017
        L_0x005a:
            boolean r3 = r2 instanceof e9.j0
            if (r3 == 0) goto L_0x00bb
            r3 = r2
            e9.j0 r3 = (e9.j0) r3
            e9.t0 r3 = r3.d()
            if (r3 != 0) goto L_0x0077
            if (r2 == 0) goto L_0x006f
            e9.q0 r2 = (e9.q0) r2
            r7.F(r2)
            goto L_0x0017
        L_0x006f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r8.<init>(r9)
            throw r8
        L_0x0077:
            e9.u0 r4 = e9.u0.f6272a
            if (r8 == 0) goto L_0x00ab
            boolean r5 = r2 instanceof e9.r0.b
            if (r5 == 0) goto L_0x00ab
            monitor-enter(r2)
            r5 = r2
            e9.r0$b r5 = (e9.r0.b) r5     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable r5 = r5.c()     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x0096
            boolean r6 = r10 instanceof e9.j     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x00a4
            r6 = r2
            e9.r0$b r6 = (e9.r0.b) r6     // Catch:{ all -> 0x00a8 }
            boolean r6 = r6.f()     // Catch:{ all -> 0x00a8 }
            if (r6 != 0) goto L_0x00a4
        L_0x0096:
            boolean r4 = r7.f(r2, r3, r1)     // Catch:{ all -> 0x00a8 }
            if (r4 != 0) goto L_0x009f
            monitor-exit(r2)
            goto L_0x0017
        L_0x009f:
            if (r5 != 0) goto L_0x00a3
            monitor-exit(r2)
            return r1
        L_0x00a3:
            r4 = r1
        L_0x00a4:
            o8.h r6 = o8.h.f10610a     // Catch:{ all -> 0x00a8 }
            monitor-exit(r2)
            goto L_0x00ac
        L_0x00a8:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00ab:
            r5 = r0
        L_0x00ac:
            if (r5 == 0) goto L_0x00b4
            if (r9 == 0) goto L_0x00b3
            r10.invoke(r5)
        L_0x00b3:
            return r4
        L_0x00b4:
            boolean r2 = r7.f(r2, r3, r1)
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x00bb:
            if (r9 == 0) goto L_0x00cd
            boolean r8 = r2 instanceof e9.m
            if (r8 == 0) goto L_0x00c4
            e9.m r2 = (e9.m) r2
            goto L_0x00c5
        L_0x00c4:
            r2 = r0
        L_0x00c5:
            if (r2 != 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            java.lang.Throwable r0 = r2.f6251a
        L_0x00ca:
            r10.invoke(r0)
        L_0x00cd:
            e9.u0 r8 = e9.u0.f6272a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.r0.o(boolean, boolean, e9.q0):e9.b0");
    }

    public final t0 p(j0 j0Var) {
        t0 d10 = j0Var.d();
        if (d10 != null) {
            return d10;
        }
        if (j0Var instanceof c0) {
            return new t0();
        }
        if (j0Var instanceof q0) {
            F((q0) j0Var);
            return null;
        }
        throw new IllegalStateException(x8.f.j(j0Var, "State should have list: ").toString());
    }

    public final Object q() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof k)) {
                return obj;
            }
            ((k) obj).a(this);
        }
    }

    public boolean r(Throwable th) {
        return false;
    }

    public final CancellationException t() {
        Throwable th;
        Object q10 = q();
        CancellationException cancellationException = null;
        if (q10 instanceof b) {
            th = ((b) q10).c();
        } else if (q10 instanceof m) {
            th = ((m) q10).f6251a;
        } else if (!(q10 instanceof j0)) {
            th = null;
        } else {
            throw new IllegalStateException(x8.f.j(q10, "Cannot be cancelling child in this state: ").toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new o0(x8.f.j(G(q10), "Parent job is "), th, this) : cancellationException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z() + '{' + G(q()) + '}');
        sb.append('@');
        sb.append(t.c(this));
        return sb.toString();
    }

    public final CancellationException u() {
        Object q10 = q();
        CancellationException cancellationException = null;
        if (q10 instanceof b) {
            Throwable c10 = ((b) q10).c();
            if (c10 != null) {
                String j10 = x8.f.j(" is cancelling", getClass().getSimpleName());
                if (c10 instanceof CancellationException) {
                    cancellationException = (CancellationException) c10;
                }
                if (cancellationException == null) {
                    if (j10 == null) {
                        j10 = k();
                    }
                    cancellationException = new o0(j10, c10, this);
                }
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(x8.f.j(this, "Job is still new or active: ").toString());
        } else if (q10 instanceof j0) {
            throw new IllegalStateException(x8.f.j(this, "Job is still new or active: ").toString());
        } else if (!(q10 instanceof m)) {
            return new o0(x8.f.j(" has completed normally", getClass().getSimpleName()), (Throwable) null, this);
        } else {
            Throwable th = ((m) q10).f6251a;
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                return new o0(k(), th, this);
            }
            return cancellationException;
        }
    }

    public final void v(r0 r0Var) {
        h(r0Var);
    }

    public void w(e1.c cVar) {
        throw cVar;
    }

    public boolean x() {
        return false;
    }

    public final Object y(Object obj) {
        Object H;
        m mVar;
        do {
            H = H(q(), obj);
            if (H == c.a.f2341b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof m) {
                    mVar = (m) obj;
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    th = mVar.f6251a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (H == c.a.f2343d);
        return H;
    }

    public String z() {
        return getClass().getSimpleName();
    }
}
