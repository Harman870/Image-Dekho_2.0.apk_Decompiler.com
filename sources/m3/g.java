package m3;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import e4.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p3.d;
import r3.c;
import r3.f;

public final class g extends f {
    public final GoogleSignInOptions B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, Looper looper, c cVar, GoogleSignInOptions googleSignInOptions, d.a aVar, d.b bVar) {
        super(context, looper, 91, cVar, aVar, bVar);
        HashMap hashMap;
        String str;
        String str2;
        boolean z9;
        boolean z10;
        boolean z11;
        Account account;
        HashSet hashSet;
        c cVar2 = cVar;
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        if (googleSignInOptions2 != null) {
            new HashSet();
            new HashMap();
            hashSet = new HashSet(googleSignInOptions2.f2784b);
            boolean z12 = googleSignInOptions2.f2787e;
            boolean z13 = googleSignInOptions2.f2788f;
            boolean z14 = googleSignInOptions2.f2786d;
            String str3 = googleSignInOptions2.f2789g;
            Account account2 = googleSignInOptions2.f2785c;
            String str4 = googleSignInOptions2.f2790h;
            str2 = str3;
            account = account2;
            hashMap = GoogleSignInOptions.y(googleSignInOptions2.f2791i);
            str = str4;
            z10 = z12;
            z9 = z13;
            z11 = z14;
        } else {
            account = null;
            str2 = null;
            str = null;
            z11 = false;
            z9 = false;
            hashSet = new HashSet();
            hashMap = new HashMap();
            z10 = false;
        }
        byte[] bArr = new byte[16];
        b.f6188a.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        if (!cVar2.f11529c.isEmpty()) {
            for (Scope add : cVar2.f11529c) {
                hashSet.add(add);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        if (hashSet.contains(GoogleSignInOptions.f2781o)) {
            Scope scope = GoogleSignInOptions.f2780n;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (z11 && (account == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.f2779m);
        }
        this.B = new GoogleSignInOptions(3, new ArrayList(hashSet), account, z11, z10, z9, str2, str, hashMap, encodeToString);
    }

    public final int g() {
        return 12451000;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(iBinder);
    }

    public final String w() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String x() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
