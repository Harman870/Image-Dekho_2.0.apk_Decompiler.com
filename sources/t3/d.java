package t3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import q3.i;
import r3.c;
import r3.f;
import r3.s;

public final class d extends f<a> {
    public final s B;

    public d(Context context, Looper looper, c cVar, s sVar, q3.c cVar2, i iVar) {
        super(context, looper, 270, cVar, cVar2, iVar);
        this.B = sVar;
    }

    public final int g() {
        return 203400000;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final o3.d[] r() {
        return f4.d.f6383b;
    }

    public final Bundle t() {
        s sVar = this.B;
        sVar.getClass();
        Bundle bundle = new Bundle();
        String str = sVar.f11632a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final String w() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String x() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean y() {
        return true;
    }
}
