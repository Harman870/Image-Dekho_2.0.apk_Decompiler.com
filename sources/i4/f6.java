package i4;

import androidx.lifecycle.c0;
import c6.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

public final class f6 implements r3 {

    /* renamed from: a  reason: collision with root package name */
    public final k4 f7306a;

    public f6(k4 k4Var) {
        this.f7306a = k4Var;
        if (k4Var.b()) {
            d9 a10 = q7.f7616b.a();
            b.B(k4Var);
            a10.zza();
        }
    }

    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (i4 i4Var : this.f7306a.a(copyOfRange)) {
                try {
                    byte[] zza = ((r3) i4Var.f7379a).zza(copyOfRange2);
                    int length2 = copyOfRange2.length;
                    return zza;
                } catch (GeneralSecurityException e10) {
                    g6.f7328a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (i4 i4Var2 : this.f7306a.a(c0.f1718b)) {
            try {
                return ((r3) i4Var2.f7379a).zza(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
