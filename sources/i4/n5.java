package i4;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class n5 {

    /* renamed from: c  reason: collision with root package name */
    public static final m5 f7523c = new m5();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7524a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7525b;

    public n5(byte[] bArr, boolean z9) {
        if (j3.c(2)) {
            vd.b(bArr.length);
            this.f7524a = new SecretKeySpec(bArr, "AES");
            this.f7525b = z9;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i10 = 12;
        if (bArr.length == 12) {
            boolean z9 = this.f7525b;
            int i11 = true != z9 ? 16 : 28;
            int length = bArr2.length;
            if (length < i11) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z9 || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                AlgorithmParameterSpec gCMParameterSpec = (!ud.a() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
                m5 m5Var = f7523c;
                ((Cipher) m5Var.get()).init(2, this.f7524a, gCMParameterSpec);
                boolean z10 = this.f7525b;
                if (true != z10) {
                    i10 = 0;
                }
                if (z10) {
                    length -= 12;
                }
                return ((Cipher) m5Var.get()).doFinal(bArr2, i10, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }
}
