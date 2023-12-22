package d4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import k3.b;
import q3.i;
import r3.c;
import r3.f;

public final class a extends f {
    public final Bundle B;

    public a(Context context, Looper looper, c cVar, k3.c cVar2, q3.c cVar3, i iVar) {
        super(context, looper, 16, cVar, cVar3, iVar);
        Bundle bundle;
        if (cVar2 == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle((Bundle) null);
        }
        this.B = bundle;
    }

    public final int g() {
        return 12451000;
    }

    public final boolean l() {
        String str;
        c cVar = this.f11582y;
        Account account = cVar.f11527a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (cVar.f11530d.get(b.f9059a) != null) {
            throw null;
        } else if (!cVar.f11528b.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new b(iBinder);
    }

    public final Bundle t() {
        return this.B;
    }

    public final String w() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String x() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean z() {
        return true;
    }
}
