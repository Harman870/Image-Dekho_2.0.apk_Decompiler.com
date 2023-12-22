package i4;

import androidx.activity.f;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class e0 implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f7269b = new d0(g1.f7325b);

    /* renamed from: a  reason: collision with root package name */
    public int f7270a = 0;

    static {
        int i10 = v.f7729a;
    }

    public static int o(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException(f.f("Beginning index larger than ending index: ", i10, ", ", i11));
        } else {
            throw new IndexOutOfBoundsException(f.f("End index: ", i11, " >= ", i12));
        }
    }

    public static d0 p(byte[] bArr) {
        return q(bArr, 0, bArr.length);
    }

    public static d0 q(byte[] bArr, int i10, int i11) {
        o(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new d0(bArr2);
    }

    public abstract byte a(int i10);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public abstract void h(int i10, byte[] bArr);

    public final int hashCode() {
        int i10 = this.f7270a;
        if (i10 == 0) {
            int g10 = g();
            i10 = i(g10, g10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7270a = i10;
        }
        return i10;
    }

    public abstract int i(int i10, int i11);

    public final /* synthetic */ Iterator iterator() {
        return new z(this);
    }

    public abstract d0 j();

    public abstract f0 k();

    public abstract String l(Charset charset);

    public abstract void m(l0 l0Var);

    public abstract boolean n();

    public final byte[] r() {
        int g10 = g();
        if (g10 == 0) {
            return g1.f7325b;
        }
        byte[] bArr = new byte[g10];
        h(g10, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(g());
        objArr[2] = g() <= 50 ? j3.a(this) : j3.a(j()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
