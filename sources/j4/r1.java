package j4;

import android.os.Bundle;
import r3.o;
import z3.b;

public final class r1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8429e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f8430f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f8431g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f8432h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c2 f8433i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f8434j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1(c2 c2Var, String str) {
        super(c2Var, true);
        this.f8433i = c2Var;
        this.f8430f = "fcm";
        this.f8431g = "_ln";
        this.f8434j = str;
        this.f8432h = true;
    }

    public final void a() {
        switch (this.f8429e) {
            case 0:
                u0 u0Var = this.f8433i.f8080h;
                o.h(u0Var);
                u0Var.getUserProperties(this.f8430f, this.f8431g, this.f8432h, (q0) this.f8434j);
                return;
            default:
                u0 u0Var2 = this.f8433i.f8080h;
                o.h(u0Var2);
                u0Var2.setUserProperty(this.f8430f, this.f8431g, new b(this.f8434j), this.f8432h, this.f8533a);
                return;
        }
    }

    public final void b() {
        switch (this.f8429e) {
            case 0:
                ((q0) this.f8434j).w((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1(c2 c2Var, String str, String str2, boolean z9, q0 q0Var) {
        super(c2Var, true);
        this.f8433i = c2Var;
        this.f8430f = str;
        this.f8431g = str2;
        this.f8432h = z9;
        this.f8434j = q0Var;
    }
}
