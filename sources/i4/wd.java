package i4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class wd implements p3 {

    /* renamed from: a  reason: collision with root package name */
    public final t5 f7769a;

    public wd(byte[] bArr) {
        this.f7769a = new t5(bArr);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f7769a.b(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
