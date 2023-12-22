package j4;

import android.app.Activity;
import r3.o;
import z3.b;

public final class k1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8280e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f8281f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f8282g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(b2 b2Var, Activity activity) {
        super(b2Var.f8052a, true);
        this.f8282g = b2Var;
        this.f8281f = activity;
    }

    public final void a() {
        switch (this.f8280e) {
            case 0:
                u0 u0Var = ((c2) this.f8282g).f8080h;
                o.h(u0Var);
                u0Var.beginAdUnitExposure((String) this.f8281f, this.f8534b);
                return;
            default:
                u0 u0Var2 = ((b2) this.f8282g).f8052a.f8080h;
                o.h(u0Var2);
                u0Var2.onActivityDestroyed(new b((Activity) this.f8281f), this.f8534b);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(c2 c2Var, String str) {
        super(c2Var, true);
        this.f8282g = c2Var;
        this.f8281f = str;
    }
}
