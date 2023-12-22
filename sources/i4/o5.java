package i4;

public final class o5 extends p5 {
    public o5(int i10, byte[] bArr) {
        super(i10, bArr);
    }

    public final int a() {
        return 12;
    }

    public final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.f7587a;
            int[] iArr4 = l5.f7467a;
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
