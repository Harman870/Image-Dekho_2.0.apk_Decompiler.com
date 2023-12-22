package n4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j4.x0;

public final class e8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f9726a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9727b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9728c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9729d;

    public e8(AppMeasurementDynamiteService appMeasurementDynamiteService, x0 x0Var, String str, String str2) {
        this.f9729d = appMeasurementDynamiteService;
        this.f9726a = x0Var;
        this.f9727b = str;
        this.f9728c = str2;
    }

    public final void run() {
        a7 v10 = this.f9729d.f2841a.v();
        x0 x0Var = this.f9726a;
        String str = this.f9727b;
        String str2 = this.f9728c;
        v10.g();
        v10.h();
        v10.s(new x6(v10, str, str2, v10.p(false), x0Var));
    }
}
