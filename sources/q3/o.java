package q3;

import m.d;
import o3.e;

public final class o extends v0 {

    /* renamed from: e  reason: collision with root package name */
    public final d<a<?>> f11264e = new d<>();

    /* renamed from: f  reason: collision with root package name */
    public final d f11265f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(f fVar, d dVar) {
        super(fVar);
        Object obj = e.f10552c;
        this.f11265f = dVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    public final void onResume() {
        super.onResume();
        if (!this.f11264e.isEmpty()) {
            this.f11265f.a(this);
        }
    }

    public final void onStart() {
        super.onStart();
        if (!this.f11264e.isEmpty()) {
            this.f11265f.a(this);
        }
    }

    public final void onStop() {
        super.onStop();
        d dVar = this.f11265f;
        dVar.getClass();
        synchronized (d.f11210r) {
            if (dVar.k == this) {
                dVar.k = null;
                dVar.f11222l.clear();
            }
        }
    }
}
