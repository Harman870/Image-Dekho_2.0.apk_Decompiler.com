package j4;

import android.app.Activity;
import android.os.Bundle;
import r3.o;
import z3.b;

public final class f1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8134e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f8135f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f8136g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f1(b2 b2Var, Activity activity) {
        super(b2Var.f8052a, true);
        this.f8134e = 2;
        this.f8135f = b2Var;
        this.f8136g = activity;
    }

    public final void a() {
        switch (this.f8134e) {
            case 0:
                u0 u0Var = ((c2) this.f8135f).f8080h;
                o.h(u0Var);
                u0Var.setConditionalUserProperty((Bundle) this.f8136g, this.f8533a);
                return;
            case 1:
                u0 u0Var2 = ((c2) this.f8135f).f8080h;
                o.h(u0Var2);
                u0Var2.getCachedAppInstanceId((q0) this.f8136g);
                return;
            default:
                u0 u0Var3 = ((b2) this.f8135f).f8052a.f8080h;
                o.h(u0Var3);
                u0Var3.onActivityStarted(new b((Activity) this.f8136g), this.f8534b);
                return;
        }
    }

    public final void b() {
        switch (this.f8134e) {
            case 1:
                ((q0) this.f8136g).w((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(c2 c2Var, Object obj, int i10) {
        super(c2Var, true);
        this.f8134e = i10;
        this.f8135f = c2Var;
        this.f8136g = obj;
    }
}
