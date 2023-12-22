package i4;

public final class i0 extends l0 {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f7375e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7376f;

    /* renamed from: g  reason: collision with root package name */
    public int f7377g;

    public i0(byte[] bArr, int i10) {
        super(0);
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.f7375e = bArr;
            this.f7377g = 0;
            this.f7376f = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i10)}));
    }

    public final void F(byte b10) {
        try {
            byte[] bArr = this.f7375e;
            int i10 = this.f7377g;
            this.f7377g = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new j0(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7377g), Integer.valueOf(this.f7376f), 1}), e10);
        }
    }

    public final void G(int i10, boolean z9) {
        S(i10 << 3);
        F(z9 ? (byte) 1 : 0);
    }

    public final void H(int i10, e0 e0Var) {
        S((i10 << 3) | 2);
        S(e0Var.g());
        e0Var.m(this);
    }

    public final void I(int i10, int i11) {
        S((i10 << 3) | 5);
        J(i11);
    }

    public final void J(int i10) {
        try {
            byte[] bArr = this.f7375e;
            int i11 = this.f7377g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f7377g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new j0(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7377g), Integer.valueOf(this.f7376f), 1}), e10);
        }
    }

    public final void K(int i10, long j10) {
        S((i10 << 3) | 1);
        L(j10);
    }

    public final void L(long j10) {
        try {
            byte[] bArr = this.f7375e;
            int i10 = this.f7377g;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f7377g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new j0(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7377g), Integer.valueOf(this.f7376f), 1}), e10);
        }
    }

    public final void M(int i10, int i11) {
        S(i10 << 3);
        N(i11);
    }

    public final void N(int i10) {
        if (i10 >= 0) {
            S(i10);
        } else {
            U((long) i10);
        }
    }

    public final void O(int i10, b2 b2Var, m2 m2Var) {
        S((i10 << 3) | 2);
        S(((t) b2Var).a(m2Var));
        m2Var.h(b2Var, this.f7461b);
    }

    public final void P(int i10, String str) {
        int i11;
        S((i10 << 3) | 2);
        int i12 = this.f7377g;
        try {
            int C = l0.C(str.length() * 3);
            int C2 = l0.C(str.length());
            if (C2 == C) {
                int i13 = i12 + C2;
                this.f7377g = i13;
                i11 = m3.a(str, this.f7375e, i13, this.f7376f - i13);
                this.f7377g = i12;
                S((i11 - i12) - C2);
            } else {
                S(m3.b(str));
                byte[] bArr = this.f7375e;
                int i14 = this.f7377g;
                i11 = m3.a(str, bArr, i14, this.f7376f - i14);
            }
            this.f7377g = i11;
        } catch (l3 e10) {
            this.f7377g = i12;
            E(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new j0(e11);
        }
    }

    public final void Q(int i10, int i11) {
        S((i10 << 3) | i11);
    }

    public final void R(int i10, int i11) {
        S(i10 << 3);
        S(i11);
    }

    public final void S(int i10) {
        while ((i10 & -128) != 0) {
            byte[] bArr = this.f7375e;
            int i11 = this.f7377g;
            this.f7377g = i11 + 1;
            bArr[i11] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        try {
            byte[] bArr2 = this.f7375e;
            int i12 = this.f7377g;
            this.f7377g = i12 + 1;
            bArr2[i12] = (byte) i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new j0(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7377g), Integer.valueOf(this.f7376f), 1}), e10);
        }
    }

    public final void T(int i10, long j10) {
        S(i10 << 3);
        U(j10);
    }

    public final void U(long j10) {
        if (!l0.f7460d || this.f7376f - this.f7377g < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.f7375e;
                int i10 = this.f7377g;
                this.f7377g = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f7375e;
                int i11 = this.f7377g;
                this.f7377g = i11 + 1;
                bArr2[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new j0(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7377g), Integer.valueOf(this.f7376f), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f7375e;
                int i12 = this.f7377g;
                this.f7377g = i12 + 1;
                h3.n(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f7375e;
            int i13 = this.f7377g;
            this.f7377g = i13 + 1;
            h3.n(bArr4, (long) i13, (byte) ((int) j10));
        }
    }

    public final void q(byte[] bArr, int i10) {
        try {
            System.arraycopy(bArr, 0, this.f7375e, this.f7377g, i10);
            this.f7377g += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new j0(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7377g), Integer.valueOf(this.f7376f), Integer.valueOf(i10)}), e10);
        }
    }
}
