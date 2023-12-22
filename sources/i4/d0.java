package i4;

import androidx.activity.f;
import java.nio.charset.Charset;

public class d0 extends c0 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f7246c;

    public d0(byte[] bArr) {
        bArr.getClass();
        this.f7246c = bArr;
    }

    public byte a(int i10) {
        return this.f7246c[i10];
    }

    public byte d(int i10) {
        return this.f7246c[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0) || g() != ((e0) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return obj.equals(this);
        }
        d0 d0Var = (d0) obj;
        int i10 = this.f7270a;
        int i11 = d0Var.f7270a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int g10 = g();
        if (g10 > d0Var.g()) {
            throw new IllegalArgumentException("Length too large: " + g10 + g());
        } else if (g10 <= d0Var.g()) {
            byte[] bArr = this.f7246c;
            byte[] bArr2 = d0Var.f7246c;
            d0Var.s();
            int i12 = 0;
            int i13 = 0;
            while (i12 < g10) {
                if (bArr[i12] != bArr2[i13]) {
                    return false;
                }
                i12++;
                i13++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(f.f("Ran off end of other: 0, ", g10, ", ", d0Var.g()));
        }
    }

    public int g() {
        return this.f7246c.length;
    }

    public void h(int i10, byte[] bArr) {
        System.arraycopy(this.f7246c, 0, bArr, 0, i10);
    }

    public final int i(int i10, int i11) {
        byte[] bArr = this.f7246c;
        Charset charset = g1.f7324a;
        for (int i12 = 0; i12 < i11; i12++) {
            i10 = (i10 * 31) + bArr[i12];
        }
        return i10;
    }

    public final d0 j() {
        int o10 = e0.o(0, 47, g());
        return o10 == 0 ? e0.f7269b : new b0(this.f7246c, o10);
    }

    public final f0 k() {
        byte[] bArr = this.f7246c;
        int g10 = g();
        f0 f0Var = new f0(bArr, g10);
        try {
            f0Var.a(g10);
            return f0Var;
        } catch (i1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final String l(Charset charset) {
        return new String(this.f7246c, 0, g(), charset);
    }

    public final void m(l0 l0Var) {
        l0Var.q(this.f7246c, g());
    }

    public final boolean n() {
        return m3.d(this.f7246c, 0, g());
    }

    public void s() {
    }
}
