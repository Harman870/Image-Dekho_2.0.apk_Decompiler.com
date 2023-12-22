package u9;

import c.a;
import e9.e;
import e9.f;

public final class p implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12293a;

    public p(f fVar) {
        this.f12293a = fVar;
    }

    public final void a(b<Object> bVar, b0<Object> b0Var) {
        boolean z9;
        T t10;
        e eVar;
        x8.f.g(bVar, "call");
        x8.f.g(b0Var, "response");
        int i10 = b0Var.f12245a.f8823c;
        if (i10 < 200 || i10 >= 300) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            eVar = this.f12293a;
            t10 = b0Var.f12246b;
        } else {
            eVar = this.f12293a;
            t10 = a.d(new j(b0Var));
        }
        eVar.e(t10);
    }

    public final void b(b<Object> bVar, Throwable th) {
        x8.f.g(bVar, "call");
        x8.f.g(th, "t");
        this.f12293a.e(a.d(th));
    }
}
