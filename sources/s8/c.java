package s8;

import q8.d;
import q8.e;
import q8.f;

public abstract class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public final f f11898b;

    /* renamed from: c  reason: collision with root package name */
    public transient d<Object> f11899c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        this(dVar, dVar != null ? dVar.b() : null);
    }

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this.f11898b = fVar;
    }

    public final f b() {
        f fVar = this.f11898b;
        x8.f.c(fVar);
        return fVar;
    }

    public final void f() {
        d<Object> dVar = this.f11899c;
        if (!(dVar == null || dVar == this)) {
            f fVar = this.f11898b;
            x8.f.c(fVar);
            int i10 = e.f11372n0;
            f.b bVar = fVar.get(e.a.f11373a);
            x8.f.c(bVar);
            ((e) bVar).j(dVar);
        }
        this.f11899c = b.f11897a;
    }
}
