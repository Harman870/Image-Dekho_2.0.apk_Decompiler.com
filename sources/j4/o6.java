package j4;

import androidx.activity.f;
import java.nio.charset.Charset;

public class o6 extends n6 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f8365c;

    public o6(byte[] bArr) {
        bArr.getClass();
        this.f8365c = bArr;
    }

    public byte a(int i10) {
        return this.f8365c[i10];
    }

    public byte d(int i10) {
        return this.f8365c[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q6) || g() != ((q6) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return obj.equals(this);
        }
        o6 o6Var = (o6) obj;
        int i10 = this.f8403a;
        int i11 = o6Var.f8403a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int g10 = g();
        if (g10 > o6Var.g()) {
            throw new IllegalArgumentException("Length too large: " + g10 + g());
        } else if (g10 <= o6Var.g()) {
            byte[] bArr = this.f8365c;
            byte[] bArr2 = o6Var.f8365c;
            o6Var.o();
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
            throw new IllegalArgumentException(f.f("Ran off end of other: 0, ", g10, ", ", o6Var.g()));
        }
    }

    public int g() {
        return this.f8365c.length;
    }

    public final int h(int i10, int i11) {
        byte[] bArr = this.f8365c;
        Charset charset = s7.f8462a;
        for (int i12 = 0; i12 < i11; i12++) {
            i10 = (i10 * 31) + bArr[i12];
        }
        return i10;
    }

    public final o6 i() {
        int m2 = q6.m(0, 47, g());
        return m2 == 0 ? q6.f8402b : new m6(this.f8365c, m2);
    }

    public final String j(Charset charset) {
        return new String(this.f8365c, 0, g(), charset);
    }

    public final void k(u6 u6Var) {
        ((s6) u6Var).o0(this.f8365c, g());
    }

    public final boolean l() {
        return x9.c(this.f8365c, 0, g());
    }

    public void o() {
    }
}
