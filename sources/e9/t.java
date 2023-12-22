package e9;

import b6.f;
import b6.r;
import c.a;
import h9.c;
import i4.md;
import j4.f5;
import java.security.Provider;
import javax.crypto.KeyAgreement;
import q8.d;

public final class t implements md, f {
    public /* synthetic */ t() {
    }

    public /* synthetic */ t(int i10) {
        Object obj = f5.f8137f;
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String d(d dVar) {
        String str;
        if (dVar instanceof c) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + c(dVar);
        } catch (Throwable th) {
            str = a.d(th);
        }
        Throwable a10 = o8.f.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = dVar.getClass().getName() + '@' + c(dVar);
        }
        return (String) str2;
    }

    public final /* synthetic */ Object a() {
        return new r("StandardIntegrity");
    }

    public final /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
