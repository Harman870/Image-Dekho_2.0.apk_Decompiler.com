package j4;

import android.app.Activity;
import android.os.Bundle;
import r3.o;
import z3.b;

public final class u1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8485e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f8486f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f8487g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f8488h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1(b2 b2Var, Bundle bundle, Activity activity) {
        super(b2Var.f8052a, true);
        this.f8488h = b2Var;
        this.f8486f = bundle;
        this.f8487g = activity;
    }

    public final void a() {
        Bundle bundle;
        switch (this.f8485e) {
            case 0:
                u0 u0Var = ((c2) this.f8488h).f8080h;
                o.h(u0Var);
                u0Var.getMaxUserProperties((String) this.f8486f, (q0) this.f8487g);
                return;
            default:
                if (((Bundle) this.f8486f) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f8486f).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f8486f).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                u0 u0Var2 = ((b2) this.f8488h).f8052a.f8080h;
                o.h(u0Var2);
                u0Var2.onActivityCreated(new b((Activity) this.f8487g), bundle, this.f8534b);
                return;
        }
    }

    public final void b() {
        switch (this.f8485e) {
            case 0:
                ((q0) this.f8487g).w((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1(c2 c2Var, String str, q0 q0Var) {
        super(c2Var, true);
        this.f8488h = c2Var;
        this.f8486f = str;
        this.f8487g = q0Var;
    }
}
