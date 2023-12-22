package i4;

import androidx.activity.f;
import androidx.activity.result.c;
import c.a;
import c2.b;
import j4.ga;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;
import javax.crypto.Cipher;
import n4.u2;
import n4.w2;
import o.g;

public final /* synthetic */ class v8 implements e7, md, u2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ v8 f7743a = new v8();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ v8 f7744b = new v8();

    public c a(y7 y7Var) {
        s8 s8Var;
        t8 t8Var;
        u7 u7Var = w8.f7765a;
        if (y7Var.f7815a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                lb z9 = lb.z(y7Var.f7817c, p0.f7582b);
                if (z9.v() == 0) {
                    r8 r8Var = new r8();
                    r8Var.f7640a = Integer.valueOf(z9.B().g());
                    r8Var.f7641b = Integer.valueOf(z9.A().v());
                    int A = z9.A().A();
                    int i10 = A - 2;
                    if (i10 == 1) {
                        s8Var = s8.f7670b;
                    } else if (i10 == 2) {
                        s8Var = s8.f7673e;
                    } else if (i10 == 3) {
                        s8Var = s8.f7672d;
                    } else if (i10 == 4) {
                        s8Var = s8.f7674f;
                    } else if (i10 == 5) {
                        s8Var = s8.f7671c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + a.m(A));
                    }
                    r8Var.f7642c = s8Var;
                    int i11 = y7Var.f7819e;
                    int b10 = g.b(i11);
                    if (b10 == 1) {
                        t8Var = t8.f7683b;
                    } else if (b10 == 2) {
                        t8Var = t8.f7685d;
                    } else if (b10 == 3) {
                        t8Var = t8.f7686e;
                    } else if (b10 == 4) {
                        t8Var = t8.f7684c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + f.a(i11));
                    }
                    r8Var.f7643d = t8Var;
                    u8 a10 = r8Var.a();
                    o8 o8Var = new o8();
                    o8Var.f7561a = a10;
                    o8Var.f7562b = new b((Object) xd.a(z9.B().r()));
                    o8Var.f7563c = y7Var.f7820f;
                    return o8Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (i1 | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
        }
    }

    public /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    public Object zza() {
        List list = w2.f10205a;
        return Long.valueOf(ga.f8203b.zza().i());
    }
}
