package i4;

import java.io.OutputStream;

public final class k0 extends l0 {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f7427e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7428f;

    /* renamed from: g  reason: collision with root package name */
    public int f7429g;

    /* renamed from: h  reason: collision with root package name */
    public final OutputStream f7430h;

    public k0(OutputStream outputStream, int i10) {
        super(0);
        if (i10 >= 0) {
            int max = Math.max(i10, 20);
            this.f7427e = new byte[max];
            this.f7428f = max;
            this.f7430h = outputStream;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void F(byte b10) {
        if (this.f7429g == this.f7428f) {
            X();
        }
        byte[] bArr = this.f7427e;
        int i10 = this.f7429g;
        this.f7429g = i10 + 1;
        bArr[i10] = b10;
    }

    public final void G(int i10, boolean z9) {
        Y(11);
        b0(i10 << 3);
        byte[] bArr = this.f7427e;
        int i11 = this.f7429g;
        this.f7429g = i11 + 1;
        bArr[i11] = z9 ? (byte) 1 : 0;
    }

    public final void H(int i10, e0 e0Var) {
        S((i10 << 3) | 2);
        S(e0Var.g());
        e0Var.m(this);
    }

    public final void I(int i10, int i11) {
        Y(14);
        b0((i10 << 3) | 5);
        Z(i11);
    }

    public final void J(int i10) {
        Y(4);
        Z(i10);
    }

    public final void K(int i10, long j10) {
        Y(18);
        b0((i10 << 3) | 1);
        a0(j10);
    }

    public final void L(long j10) {
        Y(8);
        a0(j10);
    }

    public final void M(int i10, int i11) {
        Y(20);
        b0(i10 << 3);
        if (i11 >= 0) {
            b0(i11);
        } else {
            c0((long) i11);
        }
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
        try {
            int length = str.length() * 3;
            int C = l0.C(length);
            int i12 = C + length;
            int i13 = this.f7428f;
            if (i12 > i13) {
                byte[] bArr = new byte[length];
                int a10 = m3.a(str, bArr, 0, length);
                S(a10);
                d0(bArr, a10);
                return;
            }
            if (i12 > i13 - this.f7429g) {
                X();
            }
            int C2 = l0.C(str.length());
            i11 = this.f7429g;
            if (C2 == C) {
                int i14 = i11 + C2;
                this.f7429g = i14;
                int a11 = m3.a(str, this.f7427e, i14, this.f7428f - i14);
                this.f7429g = i11;
                b0((a11 - i11) - C2);
                this.f7429g = a11;
                return;
            }
            int b10 = m3.b(str);
            b0(b10);
            this.f7429g = m3.a(str, this.f7427e, this.f7429g, b10);
        } catch (l3 e10) {
            this.f7429g = i11;
            throw e10;
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new j0(e11);
        } catch (l3 e12) {
            E(str, e12);
        }
    }

    public final void Q(int i10, int i11) {
        S((i10 << 3) | i11);
    }

    public final void R(int i10, int i11) {
        Y(20);
        b0(i10 << 3);
        b0(i11);
    }

    public final void S(int i10) {
        Y(5);
        b0(i10);
    }

    public final void T(int i10, long j10) {
        Y(20);
        b0(i10 << 3);
        c0(j10);
    }

    public final void U(long j10) {
        Y(10);
        c0(j10);
    }

    public final void X() {
        this.f7430h.write(this.f7427e, 0, this.f7429g);
        this.f7429g = 0;
    }

    public final void Y(int i10) {
        if (this.f7428f - this.f7429g < i10) {
            X();
        }
    }

    public final void Z(int i10) {
        byte[] bArr = this.f7427e;
        int i11 = this.f7429g;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f7429g = i14 + 1;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void a0(long j10) {
        byte[] bArr = this.f7427e;
        int i10 = this.f7429g;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((int) (j10 & 255));
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f7429g = i17 + 1;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void b0(int i10) {
        if (l0.f7460d) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.f7427e;
                int i11 = this.f7429g;
                this.f7429g = i11 + 1;
                h3.n(bArr, (long) i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f7427e;
            int i12 = this.f7429g;
            this.f7429g = i12 + 1;
            h3.n(bArr2, (long) i12, (byte) i10);
            return;
        }
        while ((i10 & -128) != 0) {
            byte[] bArr3 = this.f7427e;
            int i13 = this.f7429g;
            this.f7429g = i13 + 1;
            bArr3[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        byte[] bArr4 = this.f7427e;
        int i14 = this.f7429g;
        this.f7429g = i14 + 1;
        bArr4[i14] = (byte) i10;
    }

    public final void c0(long j10) {
        if (l0.f7460d) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.f7427e;
                int i10 = this.f7429g;
                this.f7429g = i10 + 1;
                h3.n(bArr, (long) i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f7427e;
            int i11 = this.f7429g;
            this.f7429g = i11 + 1;
            h3.n(bArr2, (long) i11, (byte) ((int) j10));
            return;
        }
        while ((j10 & -128) != 0) {
            byte[] bArr3 = this.f7427e;
            int i12 = this.f7429g;
            this.f7429g = i12 + 1;
            bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        byte[] bArr4 = this.f7427e;
        int i13 = this.f7429g;
        this.f7429g = i13 + 1;
        bArr4[i13] = (byte) ((int) j10);
    }

    public final void d0(byte[] bArr, int i10) {
        int i11 = this.f7428f;
        int i12 = this.f7429g;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            System.arraycopy(bArr, 0, this.f7427e, i12, i10);
            this.f7429g += i10;
            return;
        }
        System.arraycopy(bArr, 0, this.f7427e, i12, i13);
        int i14 = i10 - i13;
        this.f7429g = this.f7428f;
        X();
        if (i14 <= this.f7428f) {
            System.arraycopy(bArr, i13, this.f7427e, 0, i14);
            this.f7429g = i14;
            return;
        }
        this.f7430h.write(bArr, i13, i14);
    }

    public final void q(byte[] bArr, int i10) {
        d0(bArr, i10);
    }
}
