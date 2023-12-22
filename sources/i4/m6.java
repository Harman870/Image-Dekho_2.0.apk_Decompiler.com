package i4;

import androidx.activity.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class m6 implements o6 {

    /* renamed from: a  reason: collision with root package name */
    public final int f7488a;

    public m6(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.f7488a = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException(e.a("Unsupported key length: ", i10));
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f7488a) {
            return new n5(bArr, false).a(bArr2, bArr3);
        }
        throw new InvalidAlgorithmParameterException(e.a("Unexpected key length: ", length));
    }

    public final int zza() {
        return this.f7488a;
    }

    public final byte[] zzb() {
        int i10 = this.f7488a;
        if (i10 == 16) {
            return u6.f7719i;
        }
        if (i10 == 32) {
            return u6.f7720j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
