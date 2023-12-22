package i4;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class bd implements p3 {

    /* renamed from: e  reason: collision with root package name */
    public static final u5 f7205e = new u5(1);

    /* renamed from: f  reason: collision with root package name */
    public static final ad f7206f = new ad();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7207a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7208b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f7209c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7210d;

    public bd(int i10, byte[] bArr) {
        if (!j3.c(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i10 == 12 || i10 == 16) {
            this.f7210d = i10;
            vd.b(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f7209c = secretKeySpec;
            Cipher cipher = (Cipher) f7205e.get();
            cipher.init(1, secretKeySpec);
            byte[] c10 = c(cipher.doFinal(new byte[16]));
            this.f7207a = c10;
            this.f7208b = c(c10);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = (length - this.f7210d) - 16;
        if (i10 >= 0) {
            Cipher cipher = (Cipher) f7205e.get();
            cipher.init(1, this.f7209c);
            Cipher cipher2 = cipher;
            byte[] d10 = d(cipher2, 0, bArr, 0, this.f7210d);
            byte[] d11 = d(cipher2, 1, bArr2, 0, 0);
            byte[] d12 = d(cipher, 2, bArr, this.f7210d, i10);
            int i11 = length - 16;
            byte b10 = 0;
            for (int i12 = 0; i12 < 16; i12++) {
                b10 = (byte) (b10 | (((bArr[i11 + i12] ^ d11[i12]) ^ d10[i12]) ^ d12[i12]));
            }
            if (b10 == 0) {
                Cipher cipher3 = (Cipher) f7206f.get();
                cipher3.init(1, this.f7209c, new IvParameterSpec(d10));
                return cipher3.doFinal(bArr, this.f7210d, i10);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(e(bArr3, this.f7207a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i13 = 0;
        int i14 = 0;
        while (i12 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                doFinal[i15] = (byte) (doFinal[i15] ^ bArr[(i11 + i14) + i15]);
            }
            doFinal = cipher.doFinal(doFinal);
            i14 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i14 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            bArr2 = e(copyOfRange, this.f7207a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f7208b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                copyOf[i13] = (byte) (copyOf[i13] ^ copyOfRange[i13]);
                i13++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(e(doFinal, bArr2));
    }
}
