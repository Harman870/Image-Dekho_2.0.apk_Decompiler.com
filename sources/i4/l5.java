package i4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public final class l5 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7467a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int i15 = i14 ^ iArr[i13];
        int i16 = (i15 >>> -16) | (i15 << 16);
        iArr[i13] = i16;
        int i17 = iArr[i12] + i16;
        iArr[i12] = i17;
        int i18 = iArr[i11] ^ i17;
        int i19 = (i18 >>> -12) | (i18 << 12);
        iArr[i11] = i19;
        int i20 = iArr[i10] + i19;
        iArr[i10] = i20;
        int i21 = iArr[i13] ^ i20;
        int i22 = (i21 >>> -8) | (i21 << 8);
        iArr[i13] = i22;
        int i23 = iArr[i12] + i22;
        iArr[i12] = i23;
        int i24 = iArr[i11] ^ i23;
        iArr[i11] = (i24 >>> -7) | (i24 << 7);
    }

    public static void b(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i10 = 0; i10 < 10; i10++) {
            a(0, 4, 8, 12, iArr2);
            a(1, 5, 9, 13, iArr2);
            a(2, 6, 10, 14, iArr2);
            a(3, 7, 11, 15, iArr2);
            a(0, 5, 10, 15, iArr2);
            a(1, 6, 11, 12, iArr2);
            a(2, 7, 8, 13, iArr2);
            a(3, 4, 9, 14, iArr2);
        }
    }

    public static int[] c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
