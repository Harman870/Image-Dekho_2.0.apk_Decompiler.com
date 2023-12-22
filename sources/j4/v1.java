package j4;

import android.os.Bundle;
import r3.o;

public final class v1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Long f8498e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f8499f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f8500g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f8501h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f8502i = true;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f8503j;
    public final /* synthetic */ c2 k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1(c2 c2Var, Long l6, String str, String str2, Bundle bundle, boolean z9) {
        super(c2Var, true);
        this.k = c2Var;
        this.f8498e = l6;
        this.f8499f = str;
        this.f8500g = str2;
        this.f8501h = bundle;
        this.f8503j = z9;
    }

    public final void a() {
        long j10;
        Long l6 = this.f8498e;
        if (l6 == null) {
            j10 = this.f8533a;
        } else {
            j10 = l6.longValue();
        }
        u0 u0Var = this.k.f8080h;
        o.h(u0Var);
        u0Var.logEvent(this.f8499f, this.f8500g, this.f8501h, this.f8502i, this.f8503j, j10);
    }
}
