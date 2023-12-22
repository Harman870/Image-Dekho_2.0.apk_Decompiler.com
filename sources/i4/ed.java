package i4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class ed implements p3 {

    /* renamed from: a  reason: collision with root package name */
    public final q5 f7289a;

    public ed(byte[] bArr) {
        this.f7289a = new q5(bArr);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f7289a.b(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
