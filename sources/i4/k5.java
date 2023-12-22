package i4;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class k5 implements p3 {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f7440c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final bc f7441a;

    /* renamed from: b  reason: collision with root package name */
    public final p3 f7442b;

    public k5(bc bcVar, p3 p3Var) {
        this.f7441a = bcVar;
        this.f7442b = p3Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((p3) o4.d(this.f7441a.A(), this.f7442b.a(bArr3, f7440c))).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
