package h9;

import e9.b0;
import e9.d0;
import e9.m;
import e9.n;
import e9.p;
import e9.t;
import e9.u0;
import e9.y0;
import e9.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o8.h;
import q8.f;
import s8.d;
import z7.e;

public final class c<T> extends z<T> implements d, q8.d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7042h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: d  reason: collision with root package name */
    public final p f7043d;

    /* renamed from: e  reason: collision with root package name */
    public final q8.d<T> f7044e;

    /* renamed from: f  reason: collision with root package name */
    public Object f7045f = z5.c.f13180d;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7046g = p.b(b());

    public c(p pVar, s8.c cVar) {
        super(-1);
        this.f7043d = pVar;
        this.f7044e = cVar;
    }

    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof n) {
            ((n) obj).getClass();
            throw null;
        }
    }

    public final f b() {
        return this.f7044e.b();
    }

    public final q8.d<T> c() {
        return this;
    }

    public final d d() {
        q8.d<T> dVar = this.f7044e;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final void e(Object obj) {
        Object obj2;
        boolean z9;
        f b10;
        Object c10;
        f b11 = this.f7044e.b();
        Throwable a10 = o8.f.a(obj);
        if (a10 == null) {
            obj2 = obj;
        } else {
            obj2 = new m(a10, false);
        }
        if (this.f7043d.M()) {
            this.f7045f = obj2;
            this.f6277c = 0;
            this.f7043d.L(b11, this);
            return;
        }
        d0 a11 = y0.a();
        if (a11.f6225b >= 4294967296L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f7045f = obj2;
            this.f6277c = 0;
            a11.O(this);
            return;
        }
        a11.P(true);
        try {
            b10 = b();
            c10 = p.c(b10, this.f7046g);
            this.f7044e.e(obj);
            h hVar = h.f10610a;
            p.a(b10, c10);
            do {
            } while (a11.Q());
        } catch (Throwable th) {
            try {
                h(th, (Throwable) null);
            } catch (Throwable th2) {
                a11.N();
                throw th2;
            }
        }
        a11.N();
    }

    public final Object i() {
        Object obj = this.f7045f;
        this.f7045f = z5.c.f13180d;
        return obj;
    }

    public final boolean j() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean k(CancellationException cancellationException) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            e eVar = z5.c.f13181e;
            boolean z9 = false;
            boolean z10 = true;
            if (x8.f.a(obj, eVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7042h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, cancellationException)) {
                        if (atomicReferenceFieldUpdater.get(this) != eVar) {
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7042h;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return false;
                }
            }
        }
    }

    public final void l() {
        e9.f fVar;
        b0 b0Var;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof e9.f) {
            fVar = (e9.f) obj;
        } else {
            fVar = null;
        }
        if (fVar != null && (b0Var = fVar.f6238f) != null) {
            b0Var.b();
            fVar.f6238f = u0.f6272a;
        }
    }

    public final Throwable m(e9.e<?> eVar) {
        boolean z9;
        do {
            Object obj = this._reusableCancellableContinuation;
            e eVar2 = z5.c.f13181e;
            z9 = false;
            if (obj == eVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7042h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, eVar2, eVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != eVar2) {
                            continue;
                            break;
                        }
                    } else {
                        z9 = true;
                        continue;
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7042h;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(x8.f.j(obj, "Inconsistent state ").toString());
            }
        } while (!z9);
        return null;
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("DispatchedContinuation[");
        g10.append(this.f7043d);
        g10.append(", ");
        g10.append(t.d(this.f7044e));
        g10.append(']');
        return g10.toString();
    }
}
