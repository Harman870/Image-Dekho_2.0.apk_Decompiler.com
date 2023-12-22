package j4;

import android.app.Activity;
import r3.o;
import z3.b;

public final class i1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Activity f8229e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f8230f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f8231g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c2 f8232h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1(c2 c2Var, Activity activity, String str, String str2) {
        super(c2Var, true);
        this.f8232h = c2Var;
        this.f8229e = activity;
        this.f8230f = str;
        this.f8231g = str2;
    }

    public final void a() {
        u0 u0Var = this.f8232h.f8080h;
        o.h(u0Var);
        u0Var.setCurrentScreen(new b(this.f8229e), this.f8230f, this.f8231g, this.f8533a);
    }
}
