package e4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import k3.a;
import p3.d;
import r3.c;
import r3.f;

public final class d extends f {
    public final a.C0108a B;

    public d(Context context, Looper looper, c cVar, a.C0108a aVar, d.a aVar2, d.b bVar) {
        super(context, looper, 68, cVar, aVar2, bVar);
        a.C0108a.C0109a aVar3 = new a.C0108a.C0109a(aVar == null ? a.C0108a.f9054c : aVar);
        byte[] bArr = new byte[16];
        b.f6188a.nextBytes(bArr);
        aVar3.f9058b = Base64.encodeToString(bArr, 11);
        this.B = new a.C0108a(aVar3);
    }

    public final int g() {
        return 12800000;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
    }

    public final Bundle t() {
        a.C0108a aVar = this.B;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", aVar.f9055a);
        bundle.putString("log_session_id", aVar.f9056b);
        return bundle;
    }

    public final String w() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String x() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
