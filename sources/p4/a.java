package p4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p3.d;
import r3.c;
import r3.f;

public final class a extends f<f> implements o4.f {
    public final boolean B = true;
    public final c C;
    public final Bundle D;
    public final Integer E;

    public a(Context context, Looper looper, c cVar, Bundle bundle, d.a aVar, d.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.C = cVar;
        this.D = bundle;
        this.E = cVar.f11534h;
    }

    public final int g() {
        return 12451000;
    }

    public final boolean l() {
        return this.B;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    public final Bundle t() {
        if (!this.f11502c.getPackageName().equals(this.C.f11531e)) {
            this.D.putString("com.google.android.gms.signin.internal.realClientPackageName", this.C.f11531e);
        }
        return this.D;
    }

    public final String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String x() {
        return "com.google.android.gms.signin.service.START";
    }
}
