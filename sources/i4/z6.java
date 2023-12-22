package i4;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public final class z6 implements p3 {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f7840a;

    public z6(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f7840a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w("z6", "encountered a potentially transient KeyStore error, will wait and retry", e10);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return c(bArr, bArr2);
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w("z6", "encountered a potentially transient KeyStore error, will wait and retry", e10);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return d(bArr, bArr2);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f7840a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f7840a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
