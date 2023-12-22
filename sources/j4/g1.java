package j4;

import android.os.Bundle;
import r3.o;

public final class g1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f8191e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f8192f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Bundle f8193g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c2 f8194h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g1(c2 c2Var, String str, String str2, Bundle bundle) {
        super(c2Var, true);
        this.f8194h = c2Var;
        this.f8191e = str;
        this.f8192f = str2;
        this.f8193g = bundle;
    }

    public final void a() {
        u0 u0Var = this.f8194h.f8080h;
        o.h(u0Var);
        u0Var.clearConditionalUserProperty(this.f8191e, this.f8192f, this.f8193g);
    }
}
