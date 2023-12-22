package i4;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;

public final class n6 implements o6 {
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new q5(bArr).b(ByteBuffer.wrap(bArr3), bArr2, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    public final int zza() {
        return 32;
    }

    public final byte[] zzb() {
        return u6.k;
    }
}
