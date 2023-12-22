package e9;

import e1.c;
import e9.n0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o8.h;
import s8.d;
import w8.l;
import y3.a;

public final class f<T> extends z<T> implements e<T>, d {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6234g = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decision");

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6235h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = b.f6220a;

    /* renamed from: d  reason: collision with root package name */
    public final q8.d<T> f6236d;

    /* renamed from: e  reason: collision with root package name */
    public final q8.f f6237e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f6238f;

    public f(q8.d dVar) {
        super(1);
        this.f6236d = dVar;
        this.f6237e = dVar.b();
    }

    public static void p(Object obj, l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public final void a(Object obj, CancellationException cancellationException) {
        boolean z9;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof v0) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof m)) {
                boolean z10 = true;
                if (obj2 instanceof l) {
                    l lVar = (l) obj2;
                    if (lVar.f6248e != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        l a10 = l.a(lVar, (d) null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6235h;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            d dVar = lVar.f6245b;
                            if (dVar != null) {
                                try {
                                    dVar.a(cancellationException);
                                } catch (Throwable th) {
                                    a.k(this.f6237e, new c(x8.f.j(this, "Exception in invokeOnCancellation handler for "), th));
                                }
                            }
                            l<Throwable, h> lVar2 = lVar.f6246c;
                            if (lVar2 != null) {
                                j(lVar2, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6235h;
                    l lVar3 = new l(obj2, (d) null, (l) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, lVar3)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final q8.f b() {
        return this.f6237e;
    }

    public final q8.d<T> c() {
        return this.f6236d;
    }

    public final d d() {
        q8.d<T> dVar = this.f6236d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: e9.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: e9.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0052 A[EDGE_INSN: B:44:0x0052->B:28:0x0052 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Throwable r0 = o8.f.a(r12)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000d
        L_0x0008:
            e9.m r12 = new e9.m
            r12.<init>(r0, r1)
        L_0x000d:
            int r0 = r11.f6277c
        L_0x000f:
            r5 = 0
            java.lang.Object r8 = r11._state
            boolean r2 = r8 instanceof e9.v0
            r9 = 1
            if (r2 == 0) goto L_0x006b
            r2 = r8
            e9.v0 r2 = (e9.v0) r2
            boolean r3 = r12 instanceof e9.m
            if (r3 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            if (r0 == r9) goto L_0x0027
            r3 = 2
            if (r0 != r3) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r1
            goto L_0x0028
        L_0x0027:
            r3 = r9
        L_0x0028:
            if (r3 != 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            boolean r3 = r2 instanceof e9.d
            if (r3 == 0) goto L_0x0041
            e9.l r10 = new e9.l
            if (r3 == 0) goto L_0x0036
            e9.d r2 = (e9.d) r2
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            r4 = r2
            r6 = 0
            r7 = 16
            r2 = r10
            r3 = r12
            r2.<init>((java.lang.Object) r3, (e9.d) r4, (w8.l) r5, (java.util.concurrent.CancellationException) r6, (int) r7)
            goto L_0x0042
        L_0x0041:
            r10 = r12
        L_0x0042:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f6235h
        L_0x0044:
            boolean r3 = r2.compareAndSet(r11, r8, r10)
            if (r3 == 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            java.lang.Object r3 = r2.get(r11)
            if (r3 == r8) goto L_0x0044
            r9 = r1
        L_0x0052:
            if (r9 != 0) goto L_0x0055
            goto L_0x000f
        L_0x0055:
            boolean r12 = r11.o()
            if (r12 != 0) goto L_0x0067
            e9.b0 r12 = r11.f6238f
            if (r12 != 0) goto L_0x0060
            goto L_0x0067
        L_0x0060:
            r12.b()
            e9.u0 r12 = e9.u0.f6272a
            r11.f6238f = r12
        L_0x0067:
            r11.l(r0)
            goto L_0x007c
        L_0x006b:
            boolean r0 = r8 instanceof e9.g
            if (r0 == 0) goto L_0x007d
            e9.g r8 = (e9.g) r8
            r8.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = e9.g.f6239c
            boolean r0 = r0.compareAndSet(r8, r1, r9)
            if (r0 == 0) goto L_0x007d
        L_0x007c:
            return
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed, but proposed with update "
            java.lang.String r12 = x8.f.j(r12, r1)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.f.e(java.lang.Object):void");
    }

    public final Throwable f(Object obj) {
        Throwable f10 = super.f(obj);
        if (f10 == null) {
            return null;
        }
        return f10;
    }

    public final <T> T g(Object obj) {
        return obj instanceof l ? ((l) obj).f6244a : obj;
    }

    public final Object i() {
        return this._state;
    }

    public final void j(l<? super Throwable, h> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            a.k(this.f6237e, new c(x8.f.j(this, "Exception in resume onCancellation handler for "), th2));
        }
    }

    public final void k(Throwable th) {
        Object obj;
        boolean z9;
        boolean z10;
        d dVar;
        b0 b0Var;
        do {
            obj = this._state;
            z9 = false;
            if (obj instanceof v0) {
                z10 = obj instanceof d;
                g gVar = new g(this, th, z10);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6235h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z9 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z9);
        if (z10) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            try {
                dVar.a(th);
            } catch (Throwable th2) {
                a.k(this.f6237e, new c(x8.f.j(this, "Exception in invokeOnCancellation handler for "), th2));
            }
        }
        if (!o() && (b0Var = this.f6238f) != null) {
            b0Var.b();
            this.f6238f = u0.f6272a;
        }
        l(this.f6277c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6._decision
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 != r3) goto L_0x000b
            r0 = r2
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f6234g
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r3
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            q8.d<T> r0 = r6.f6236d
            r4 = 4
            if (r7 != r4) goto L_0x002a
            r4 = r3
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            if (r4 != 0) goto L_0x008b
            boolean r5 = r0 instanceof h9.c
            if (r5 == 0) goto L_0x008b
            if (r7 == r3) goto L_0x0038
            if (r7 != r1) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r3
        L_0x0039:
            int r5 = r6.f6277c
            if (r5 == r3) goto L_0x0042
            if (r5 != r1) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r1 = r2
            goto L_0x0043
        L_0x0042:
            r1 = r3
        L_0x0043:
            if (r7 != r1) goto L_0x008b
            r7 = r0
            h9.c r7 = (h9.c) r7
            e9.p r7 = r7.f7043d
            q8.f r0 = r0.b()
            boolean r1 = r7.M()
            if (r1 == 0) goto L_0x0058
            r7.L(r0, r6)
            goto L_0x008e
        L_0x0058:
            e9.d0 r7 = e9.y0.a()
            long r0 = r7.f6225b
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            r2 = r3
        L_0x0068:
            if (r2 == 0) goto L_0x006e
            r7.O(r6)
            goto L_0x008e
        L_0x006e:
            r7.P(r3)
            q8.d<T> r0 = r6.f6236d     // Catch:{ all -> 0x007d }
            c.a.g(r6, r0, r3)     // Catch:{ all -> 0x007d }
        L_0x0076:
            boolean r0 = r7.Q()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0076
            goto L_0x0082
        L_0x007d:
            r0 = move-exception
            r1 = 0
            r6.h(r0, r1)     // Catch:{ all -> 0x0086 }
        L_0x0082:
            r7.N()
            goto L_0x008e
        L_0x0086:
            r0 = move-exception
            r7.N()
            throw r0
        L_0x008b:
            c.a.g(r6, r0, r4)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.f.l(int):void");
    }

    public final Object m() {
        boolean z9;
        boolean z10;
        n0 n0Var;
        h9.c cVar;
        h9.c cVar2;
        n0 n0Var2;
        boolean o10 = o();
        while (true) {
            int i10 = this._decision;
            z9 = false;
            if (i10 == 0) {
                if (f6234g.compareAndSet(this, 0, 1)) {
                    z10 = true;
                    break;
                }
            } else if (i10 == 2) {
                z10 = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        Throwable th = null;
        if (z10) {
            if (this.f6238f == null && (n0Var2 = (n0) this.f6237e.get(n0.b.f6255a)) != null) {
                this.f6238f = n0.a.a(n0Var2, true, new h(this), 2);
            }
            if (o10) {
                q8.d<T> dVar = this.f6236d;
                if (dVar instanceof h9.c) {
                    cVar2 = (h9.c) dVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    th = cVar2.m(this);
                }
                if (th != null) {
                    b0 b0Var = this.f6238f;
                    if (b0Var != null) {
                        b0Var.b();
                        this.f6238f = u0.f6272a;
                    }
                    k(th);
                }
            }
            return r8.a.COROUTINE_SUSPENDED;
        }
        if (o10) {
            q8.d<T> dVar2 = this.f6236d;
            if (dVar2 instanceof h9.c) {
                cVar = (h9.c) dVar2;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                th = cVar.m(this);
            }
            if (th != null) {
                b0 b0Var2 = this.f6238f;
                if (b0Var2 != null) {
                    b0Var2.b();
                    this.f6238f = u0.f6272a;
                }
                k(th);
            }
        }
        Object obj = this._state;
        if (!(obj instanceof m)) {
            int i11 = this.f6277c;
            if (i11 == 1 || i11 == 2) {
                z9 = true;
            }
            if (!z9 || (n0Var = (n0) this.f6237e.get(n0.b.f6255a)) == null || n0Var.a()) {
                return g(obj);
            }
            CancellationException u = n0Var.u();
            a(obj, u);
            throw u;
        }
        throw ((m) obj).f6251a;
    }

    public final void n(l<? super Throwable, h> lVar) {
        d dVar;
        boolean z9;
        if (lVar instanceof d) {
            dVar = (d) lVar;
        } else {
            dVar = new l0(lVar);
        }
        while (true) {
            Object obj = this._state;
            boolean z10 = true;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6235h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, dVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof d)) {
                    boolean z11 = obj instanceof m;
                    if (z11) {
                        m mVar = (m) obj;
                        mVar.getClass();
                        if (!m.f6250b.compareAndSet(mVar, 0, 1)) {
                            p(obj, lVar);
                            throw null;
                        } else if (obj instanceof g) {
                            if (!z11) {
                                mVar = null;
                            }
                            if (mVar != null) {
                                th = mVar.f6251a;
                            }
                            try {
                                lVar.invoke(th);
                                return;
                            } catch (Throwable th2) {
                                a.k(this.f6237e, new c(x8.f.j(this, "Exception in invokeOnCancellation handler for "), th2));
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (obj instanceof l) {
                        l lVar2 = (l) obj;
                        if (lVar2.f6245b == null) {
                            Throwable th3 = lVar2.f6248e;
                            if (th3 != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                try {
                                    lVar.invoke(th3);
                                    return;
                                } catch (Throwable th4) {
                                    a.k(this.f6237e, new c(x8.f.j(this, "Exception in invokeOnCancellation handler for "), th4));
                                    return;
                                }
                            } else {
                                l a10 = l.a(lVar2, dVar, (CancellationException) null, 29);
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6235h;
                                while (true) {
                                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                            z10 = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                        } else {
                            p(obj, lVar);
                            throw null;
                        }
                    } else {
                        l lVar3 = new l(obj, dVar, (l) null, (CancellationException) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f6235h;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, lVar3)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            return;
                        }
                    }
                } else {
                    p(obj, lVar);
                    throw null;
                }
            }
        }
    }

    public final boolean o() {
        return (this.f6277c == 2) && ((h9.c) this.f6236d).j();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(t.d(this.f6236d));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof v0) {
            str = "Active";
        } else if (obj instanceof g) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(t.c(this));
        return sb.toString();
    }
}
