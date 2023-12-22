package i4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

public abstract class p5 {

    /* renamed from: a  reason: collision with root package name */
    public int[] f7587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7588b;

    public p5(int i10, byte[] bArr) {
        if (bArr.length == 32) {
            this.f7587a = l5.c(bArr);
            this.f7588b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i10);

    public final ByteBuffer c(int i10, byte[] bArr) {
        int[] b10 = b(l5.c(bArr), i10);
        int[] iArr = (int[]) b10.clone();
        l5.b(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            b10[i11] = b10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b10, 0, 16);
        return order;
    }
}
