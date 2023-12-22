package i4;

import androidx.lifecycle.c0;
import c6.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import o.g;

public final class a9 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    public final k4 f7188a;

    public a9(k4 k4Var) {
        this.f7188a = k4Var;
        if (k4Var.b()) {
            d9 a10 = q7.f7616b.a();
            b.B(k4Var);
            a10.zza();
            a10.zza();
        }
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (i4 i4Var : this.f7188a.a(copyOf)) {
                if (g.a(i4Var.f7381c, 3)) {
                    bArr3 = b.K(bArr2, b9.f7204b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((g4) i4Var.f7379a).a(copyOfRange, bArr3);
                    return;
                } catch (GeneralSecurityException e10) {
                    b9.f7203a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (i4 i4Var2 : this.f7188a.a(c0.f1718b)) {
                try {
                    ((g4) i4Var2.f7379a).a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
