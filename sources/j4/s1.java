package j4;

import r3.o;
import z3.b;

public final class s1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f8454e = "Error with data collection. Data lost.";

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f8455f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c2 f8456g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s1(c2 c2Var, Object obj) {
        super(c2Var, false);
        this.f8456g = c2Var;
        this.f8455f = obj;
    }

    public final void a() {
        u0 u0Var = this.f8456g.f8080h;
        o.h(u0Var);
        u0Var.logHealthData(5, this.f8454e, new b(this.f8455f), new b((Object) null), new b((Object) null));
    }
}
