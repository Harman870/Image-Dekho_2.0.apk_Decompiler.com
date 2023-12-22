package i4;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class q4 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7608a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b  reason: collision with root package name */
    public static final String f7609b = "type.googleapis.com/google.crypto.tink.AesGcmKey";

    static {
        new w4(0);
        new w4(1);
        new e5();
        new c5(0);
        new z4(1);
        new c5(1);
        new h5(0);
        new w4(2);
        int i10 = tc.f7688a;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        boolean z9;
        o4.g(new t4());
        x8.a();
        o4.f(new w4(0));
        o4.f(new w4(1));
        if (!w5.a()) {
            o4.f(new c5(0));
            try {
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                z9 = true;
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                z9 = false;
            }
            if (z9) {
                o4.f(new e5());
            }
            o4.f(new h5(0));
            o4.f(new z4(1));
            o4.f(new c5(1));
            o4.f(new w4(2));
        }
    }
}
