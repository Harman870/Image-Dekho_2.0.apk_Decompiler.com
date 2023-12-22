package i4;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zc implements nd {

    /* renamed from: d  reason: collision with root package name */
    public static final yc f7841d = new yc();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7842a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7843b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7844c;

    public zc(int i10, byte[] bArr) {
        if (j3.c(2)) {
            vd.b(bArr.length);
            this.f7842a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f7841d.get()).getBlockSize();
            this.f7844c = blockSize;
            if (i10 < 12 || i10 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f7843b = i10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f7843b;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int i11 = this.f7843b;
            int i12 = length - i11;
            byte[] bArr3 = new byte[i12];
            Cipher cipher = (Cipher) f7841d.get();
            byte[] bArr4 = new byte[this.f7844c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f7843b);
            cipher.init(2, this.f7842a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i11, i12, bArr3, 0) == i12) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
