package i4;

import c6.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import y3.a;

public final class dd implements q3 {

    /* renamed from: c  reason: collision with root package name */
    public static final List f7257c = Arrays.asList(new Integer[]{64});

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7258d = new byte[16];

    /* renamed from: a  reason: collision with root package name */
    public final od f7259a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7260b;

    public dd(byte[] bArr) {
        if (j3.c(1)) {
            List list = f7257c;
            int length = bArr.length;
            if (list.contains(Integer.valueOf(length))) {
                int i10 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
                this.f7260b = Arrays.copyOfRange(bArr, i10, length);
                this.f7259a = new od(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length >= 16) {
            Cipher cipher = (Cipher) kd.f7450e.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f7260b, "AES"), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && ud.a()) {
                doFinal = new byte[0];
            }
            byte[][] bArr5 = {bArr2, doFinal};
            byte[] a10 = this.f7259a.a(16, f7258d);
            for (int i10 = 0; i10 <= 0; i10++) {
                byte[] bArr6 = bArr5[i10];
                if (bArr6 == null) {
                    bArr6 = new byte[0];
                }
                a10 = b.M(a.T(a10), this.f7259a.a(16, bArr6));
            }
            byte[] bArr7 = bArr5[1];
            int length2 = bArr7.length;
            if (length2 >= 16) {
                int length3 = a10.length;
                if (length2 >= length3) {
                    int i11 = length2 - length3;
                    bArr3 = Arrays.copyOf(bArr7, length2);
                    for (int i12 = 0; i12 < a10.length; i12++) {
                        int i13 = i11 + i12;
                        bArr3[i13] = (byte) (bArr3[i13] ^ a10[i12]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                int length4 = bArr7.length;
                if (length4 < 16) {
                    byte[] copyOf = Arrays.copyOf(bArr7, 16);
                    copyOf[length4] = Byte.MIN_VALUE;
                    bArr3 = b.M(copyOf, a.T(a10));
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            if (b.J(copyOfRange, this.f7259a.a(16, bArr3))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
