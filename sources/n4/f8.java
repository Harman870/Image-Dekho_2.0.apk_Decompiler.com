package n4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j4.a1;

public final class f8 implements h5 {

    /* renamed from: a  reason: collision with root package name */
    public final a1 f9746a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9747b;

    public f8(AppMeasurementDynamiteService appMeasurementDynamiteService, a1 a1Var) {
        this.f9747b = appMeasurementDynamiteService;
        this.f9746a = a1Var;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f9746a.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            n4 n4Var = this.f9747b.f2841a;
            if (n4Var != null) {
                n4Var.a().f9831i.b("Event listener threw exception", e10);
            }
        }
    }
}
