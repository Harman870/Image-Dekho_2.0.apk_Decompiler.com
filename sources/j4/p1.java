package j4;

import android.app.Activity;
import android.os.Bundle;
import r3.o;
import z3.b;

public final class p1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8381e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f8382f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f8383g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(b2 b2Var, Activity activity) {
        super(b2Var.f8052a, true);
        this.f8381e = 2;
        this.f8382f = b2Var;
        this.f8383g = activity;
    }

    public final void a() {
        switch (this.f8381e) {
            case 0:
                u0 u0Var = ((c2) this.f8382f).f8080h;
                o.h(u0Var);
                u0Var.getCurrentScreenName((q0) this.f8383g);
                return;
            case 1:
                u0 u0Var2 = ((c2) this.f8382f).f8080h;
                o.h(u0Var2);
                u0Var2.registerOnMeasurementEventListener((y1) this.f8383g);
                return;
            default:
                u0 u0Var3 = ((b2) this.f8382f).f8052a.f8080h;
                o.h(u0Var3);
                u0Var3.onActivityPaused(new b((Activity) this.f8383g), this.f8534b);
                return;
        }
    }

    public final void b() {
        switch (this.f8381e) {
            case 0:
                ((q0) this.f8383g).w((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(c2 c2Var, i0 i0Var, int i10) {
        super(c2Var, true);
        this.f8381e = i10;
        this.f8382f = c2Var;
        this.f8383g = i0Var;
    }
}
