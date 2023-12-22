package i4;

import androidx.lifecycle.c0;
import c6.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

public final class s4 implements p3 {

    /* renamed from: a  reason: collision with root package name */
    public final k4 f7669a;

    public s4(k4 k4Var) {
        this.f7669a = k4Var;
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
            for (i4 i4Var : this.f7669a.a(copyOf)) {
                try {
                    byte[] a10 = ((p3) i4Var.f7379a).a(copyOfRange, bArr2);
                    int length2 = copyOfRange.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    t4.f7680a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (i4 i4Var2 : this.f7669a.a(c0.f1718b)) {
            try {
                return ((p3) i4Var2.f7379a).a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
