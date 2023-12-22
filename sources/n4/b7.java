package n4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j4.x0;

public final class b7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f9630a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9631b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9632c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f9633d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9634e;

    public b7(AppMeasurementDynamiteService appMeasurementDynamiteService, x0 x0Var, String str, String str2, boolean z9) {
        this.f9634e = appMeasurementDynamiteService;
        this.f9630a = x0Var;
        this.f9631b = str;
        this.f9632c = str2;
        this.f9633d = z9;
    }

    public final void run() {
        a7 v10 = this.f9634e.f2841a.v();
        x0 x0Var = this.f9630a;
        String str = this.f9631b;
        String str2 = this.f9632c;
        boolean z9 = this.f9633d;
        v10.g();
        v10.h();
        v10.s(new n6(v10, str, str2, v10.p(false), z9, x0Var));
    }
}
