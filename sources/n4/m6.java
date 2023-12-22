package n4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j4.x0;
import o3.f;

public final class m6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f9961a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f9962b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9963c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9964d;

    public m6(AppMeasurementDynamiteService appMeasurementDynamiteService, x0 x0Var, r rVar, String str) {
        this.f9964d = appMeasurementDynamiteService;
        this.f9961a = x0Var;
        this.f9962b = rVar;
        this.f9963c = str;
    }

    public final void run() {
        a7 v10 = this.f9964d.f2841a.v();
        x0 x0Var = this.f9961a;
        r rVar = this.f9962b;
        String str = this.f9963c;
        v10.g();
        v10.h();
        d8 x9 = v10.f9600a.x();
        x9.getClass();
        if (f.f10556b.b(x9.f9600a.f9986a, 12451000) != 0) {
            v10.f9600a.a().f9831i.a("Not bundling data. Service unavailable or out of date");
            v10.f9600a.x().C(x0Var, new byte[0]);
            return;
        }
        v10.s(new s6(v10, rVar, str, x0Var));
    }
}
