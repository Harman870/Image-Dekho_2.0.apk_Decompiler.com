package e9;

import c.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x8.f;

public abstract class q0 extends o implements b0, j0 {

    /* renamed from: d  reason: collision with root package name */
    public r0 f6260d;

    public final boolean a() {
        return true;
    }

    public final void b() {
        boolean z9;
        r0 l6 = l();
        do {
            Object q10 = l6.q();
            if (q10 instanceof q0) {
                if (q10 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.f6262a;
                    c0 c0Var = a.f2346g;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(l6, q10, c0Var)) {
                            if (atomicReferenceFieldUpdater.get(l6) != q10) {
                                z9 = false;
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
            } else if ((q10 instanceof j0) && ((j0) q10).d() != null) {
                j();
                return;
            } else {
                return;
            }
        } while (!z9);
    }

    public final t0 d() {
        return null;
    }

    public final r0 l() {
        r0 r0Var = this.f6260d;
        if (r0Var != null) {
            return r0Var;
        }
        f.k("job");
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + t.c(this) + "[job@" + t.c(l()) + ']';
    }
}
