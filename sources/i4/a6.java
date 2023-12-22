package i4;

import androidx.lifecycle.c0;
import c6.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

public final class a6 implements q3 {

    /* renamed from: a  reason: collision with root package name */
    public final k4 f7182a;

    public a6(k4 k4Var) {
        this.f7182a = k4Var;
        if (k4Var.b()) {
            d9 a10 = q7.f7616b.a();
            b.B(k4Var);
            a10.zza();
            a10.zza();
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (i4 i4Var : this.f7182a.a(copyOf)) {
                try {
                    byte[] a10 = ((q3) i4Var.f7379a).a(copyOfRange, bArr2);
                    int length2 = copyOfRange.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    b6.f7198a.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (i4 i4Var2 : this.f7182a.a(c0.f1718b)) {
            try {
                return ((q3) i4Var2.f7379a).a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
