package n4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import o3.f;
import r3.b;
import r3.g;

public final class e3 extends b {
    public e3(Context context, Looper looper, z6 z6Var, z6 z6Var2) {
        super(context, looper, g.a(context), f.f10556b, 93, z6Var, z6Var2, (String) null);
    }

    public final int g() {
        return 12451000;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof z2 ? (z2) queryLocalInterface : new x2(iBinder);
    }

    public final String w() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String x() {
        return "com.google.android.gms.measurement.START";
    }
}
