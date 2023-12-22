package j4;

import o.c;
import x2.l;

public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    public final l f8435a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8436b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8437c;

    /* renamed from: d  reason: collision with root package name */
    public final w5 f8438d;

    public r2() {
        l lVar = new l();
        this.f8435a = lVar;
        c cVar = new c((c) null, lVar);
        this.f8437c = cVar;
        this.f8436b = cVar.a();
        w5 w5Var = new w5();
        this.f8438d = w5Var;
        cVar.f("require", new td(w5Var));
        w5Var.f8538a.put("internal.platform", z1.f8577a);
        cVar.f("runtime.counter", new i(Double.valueOf(0.0d)));
    }

    public final p a(c cVar, h4... h4VarArr) {
        p pVar = p.f8373c0;
        for (h4 a10 : h4VarArr) {
            pVar = e5.a(a10);
            j4.c(this.f8437c);
            if ((pVar instanceof q) || (pVar instanceof o)) {
                pVar = this.f8435a.d(cVar, pVar);
            }
        }
        return pVar;
    }
}
