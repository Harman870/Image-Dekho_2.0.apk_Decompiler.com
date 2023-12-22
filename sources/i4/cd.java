package i4;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class cd implements p3 {

    /* renamed from: a  reason: collision with root package name */
    public final n5 f7232a;

    public cd(byte[] bArr) {
        if (j3.c(2)) {
            this.f7232a = new n5(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f7232a.a(Arrays.copyOf(bArr, 12), bArr);
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
