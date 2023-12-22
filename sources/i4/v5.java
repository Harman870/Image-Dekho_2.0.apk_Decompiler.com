package i4;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class v5 implements p3 {

    /* renamed from: b  reason: collision with root package name */
    public static final u5 f7737b = new u5(0);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7738a;

    public v5(byte[] bArr) {
        vd.b(bArr.length);
        this.f7738a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (ud.a()) {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            u5 u5Var = f7737b;
            ((Cipher) u5Var.get()).init(2, this.f7738a, algorithmParameterSpec);
            return ((Cipher) u5Var.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
