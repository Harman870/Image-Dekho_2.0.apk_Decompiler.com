package c4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.appset.zze;
import o3.d;
import q3.i;
import r3.f;

public final class c extends f<e> {
    public c(Context context, Looper looper, r3.c cVar, q3.c cVar2, i iVar) {
        super(context, looper, 300, cVar, cVar2, iVar);
    }

    public final int g() {
        return 212800000;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
    }

    public final d[] r() {
        return zze.zzb;
    }

    public final String w() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    public final String x() {
        return "com.google.android.gms.appset.service.START";
    }

    public final boolean y() {
        return true;
    }
}
