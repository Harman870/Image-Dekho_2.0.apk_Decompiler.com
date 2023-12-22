package j4;

import android.app.Activity;
import android.os.Bundle;
import r3.o;
import z3.b;

public final class q1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8396e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f8397f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f8398g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1(b2 b2Var, Activity activity) {
        super(b2Var.f8052a, true);
        this.f8398g = b2Var;
        this.f8397f = activity;
    }

    public final void a() {
        switch (this.f8396e) {
            case 0:
                u0 u0Var = ((c2) this.f8398g).f8080h;
                o.h(u0Var);
                u0Var.getCurrentScreenClass((q0) this.f8397f);
                return;
            default:
                u0 u0Var2 = ((b2) this.f8398g).f8052a.f8080h;
                o.h(u0Var2);
                u0Var2.onActivityStopped(new b((Activity) this.f8397f), this.f8534b);
                return;
        }
    }

    public final void b() {
        switch (this.f8396e) {
            case 0:
                ((q0) this.f8397f).w((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1(c2 c2Var, q0 q0Var) {
        super(c2Var, true);
        this.f8398g = c2Var;
        this.f8397f = q0Var;
    }
}
