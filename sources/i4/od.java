package i4;

import c6.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import y3.a;

public final class od implements g9 {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7564a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7565b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f7566c;

    public od(byte[] bArr) {
        vd.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f7564a = secretKeySpec;
        if (j3.c(1)) {
            Cipher cipher = (Cipher) kd.f7450e.a("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] T = a.T(cipher.doFinal(new byte[16]));
            this.f7565b = T;
            this.f7566c = a.T(T);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public final byte[] a(int i10, byte[] bArr) {
        byte[] bArr2;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        } else if (j3.c(1)) {
            Cipher cipher = (Cipher) kd.f7450e.a("AES/ECB/NoPadding");
            cipher.init(1, this.f7564a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = b.P(bArr, (max - 1) * 16, this.f7565b, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    bArr2 = b.M(copyOf, this.f7566c);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr3 = cipher.doFinal(b.P(bArr3, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(cipher.doFinal(b.M(bArr2, bArr3)), i10);
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
