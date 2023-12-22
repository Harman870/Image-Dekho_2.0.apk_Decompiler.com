package j4;

import java.util.logging.Level;

public final class s6 extends u6 {
    public final int A;
    public int B;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f8461z;

    public s6(byte[] bArr, int i10) {
        super(0);
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.f8461z = bArr;
            this.B = 0;
            this.A = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i10)}));
    }

    public final void U(byte b10) {
        try {
            byte[] bArr = this.f8461z;
            int i10 = this.B;
            this.B = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new t6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.A), 1}), e10);
        }
    }

    public final void V(int i10, boolean z9) {
        g0(i10 << 3);
        U(z9 ? (byte) 1 : 0);
    }

    public final void W(int i10, q6 q6Var) {
        g0((i10 << 3) | 2);
        g0(q6Var.g());
        q6Var.k(this);
    }

    public final void X(int i10, int i11) {
        g0((i10 << 3) | 5);
        Y(i11);
    }

    public final void Y(int i10) {
        try {
            byte[] bArr = this.f8461z;
            int i11 = this.B;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.B = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new t6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.A), 1}), e10);
        }
    }

    public final void Z(int i10, long j10) {
        g0((i10 << 3) | 1);
        a0(j10);
    }

    public final void a0(long j10) {
        try {
            byte[] bArr = this.f8461z;
            int i10 = this.B;
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
            this.B = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new t6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.A), 1}), e10);
        }
    }

    public final void b0(int i10, int i11) {
        g0(i10 << 3);
        c0(i11);
    }

    public final void c0(int i10) {
        if (i10 >= 0) {
            g0(i10);
        } else {
            i0((long) i10);
        }
    }

    public final void d0(int i10, String str) {
        int i11;
        g0((i10 << 3) | 2);
        int i12 = this.B;
        try {
            int m02 = u6.m0(str.length() * 3);
            int m03 = u6.m0(str.length());
            if (m03 == m02) {
                int i13 = i12 + m03;
                this.B = i13;
                i11 = x9.a(str, this.f8461z, i13, this.A - i13);
                this.B = i12;
                g0((i11 - i12) - m03);
            } else {
                g0(x9.b(str));
                byte[] bArr = this.f8461z;
                int i14 = this.B;
                i11 = x9.a(str, bArr, i14, this.A - i14);
            }
            this.B = i11;
        } catch (w9 e10) {
            this.B = i12;
            u6.f8492x.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
            byte[] bytes = str.getBytes(s7.f8462a);
            try {
                int length = bytes.length;
                g0(length);
                o0(bytes, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new t6(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new t6(e12);
        }
    }

    public final void e0(int i10, int i11) {
        g0((i10 << 3) | i11);
    }

    public final void f0(int i10, int i11) {
        g0(i10 << 3);
        g0(i11);
    }

    public final void g0(int i10) {
        while ((i10 & -128) != 0) {
            byte[] bArr = this.f8461z;
            int i11 = this.B;
            this.B = i11 + 1;
            bArr[i11] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        try {
            byte[] bArr2 = this.f8461z;
            int i12 = this.B;
            this.B = i12 + 1;
            bArr2[i12] = (byte) i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new t6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.A), 1}), e10);
        }
    }

    public final void h0(int i10, long j10) {
        g0(i10 << 3);
        i0(j10);
    }

    public final void i0(long j10) {
        if (!u6.f8493y || this.A - this.B < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.f8461z;
                int i10 = this.B;
                this.B = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f8461z;
                int i11 = this.B;
                this.B = i11 + 1;
                bArr2[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new t6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.A), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f8461z;
                int i12 = this.B;
                this.B = i12 + 1;
                t9.f8475c.d(bArr3, t9.f8478f + ((long) i12), (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f8461z;
            int i13 = this.B;
            this.B = i13 + 1;
            t9.f8475c.d(bArr4, t9.f8478f + ((long) i13), (byte) ((int) j10));
        }
    }

    public final void o0(byte[] bArr, int i10) {
        try {
            System.arraycopy(bArr, 0, this.f8461z, this.B, i10);
            this.B += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new t6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.A), Integer.valueOf(i10)}), e10);
        }
    }
}
