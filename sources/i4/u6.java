package i4;

import c6.b;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import y3.a;

public final class u6 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f7711a = b(1, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7712b = b(2, 32);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f7713c = b(2, 16);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7714d = b(2, 17);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f7715e = b(2, 18);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f7716f = b(2, 1);

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f7717g = b(2, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f7718h = b(2, 3);

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f7719i = b(2, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f7720j = b(2, 2);
    public static final byte[] k = b(2, 3);

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f7721l = new byte[0];

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f7722m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f7723n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f7724o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static void a(tb tbVar) {
        if (tbVar.A() == 2 || tbVar.A() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(a.M(tbVar.A())));
        }
        String str = "UNRECOGNIZED";
        if (tbVar.z() == 2 || tbVar.z() == 1) {
            int z9 = tbVar.z();
            if (z9 == 2) {
                str = "KDF_UNKNOWN";
            } else if (z9 == 3) {
                str = "HKDF_SHA256";
            } else if (z9 == 4) {
                str = "HKDF_SHA384";
            } else if (z9 == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (tbVar.y() == 2 || tbVar.y() == 1) {
            int y9 = tbVar.y();
            if (y9 == 2) {
                str = "AEAD_UNKNOWN";
            } else if (y9 == 3) {
                str = "AES_128_GCM";
            } else if (y9 == 4) {
                str = "AES_256_GCM";
            } else if (y9 == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    public static byte[] b(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] c(String str, byte[] bArr, byte[] bArr2, int i10) {
        return b.K(b(2, i10), f7724o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
