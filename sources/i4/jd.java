package i4;

import c6.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class jd implements p3 {

    /* renamed from: a  reason: collision with root package name */
    public final nd f7408a;

    /* renamed from: b  reason: collision with root package name */
    public final g4 f7409b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7410c;

    public jd(nd ndVar, g4 g4Var, int i10) {
        this.f7408a = ndVar;
        this.f7409b = g4Var;
        this.f7410c = i10;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f7410c;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f7410c, length);
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
            this.f7409b.a(copyOfRange2, b.K(bArr2, copyOfRange, copyOf));
            return this.f7408a.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
