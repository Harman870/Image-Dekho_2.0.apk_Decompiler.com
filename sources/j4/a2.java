package j4;

import android.app.Activity;
import r3.o;
import z3.b;

public final class a2 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Activity f8039e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q0 f8040f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b2 f8041g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, Activity activity, q0 q0Var) {
        super(b2Var.f8052a, true);
        this.f8041g = b2Var;
        this.f8039e = activity;
        this.f8040f = q0Var;
    }

    public final void a() {
        u0 u0Var = this.f8041g.f8052a.f8080h;
        o.h(u0Var);
        u0Var.onActivitySaveInstanceState(new b(this.f8039e), this.f8040f, this.f8534b);
    }
}
