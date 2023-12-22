package j4;

import androidx.activity.f;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import y3.a;

public abstract class q6 implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final o6 f8402b = new o6(s7.f8463b);

    /* renamed from: a  reason: collision with root package name */
    public int f8403a = 0;

    static {
        int i10 = h6.f8215a;
    }

    public static int m(int i10, int i11, int i12) {
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

    public static o6 n(byte[] bArr, int i10, int i11) {
        m(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o6(bArr2);
    }

    public abstract byte a(int i10);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public abstract int h(int i10, int i11);

    public final int hashCode() {
        int i10 = this.f8403a;
        if (i10 == 0) {
            int g10 = g();
            i10 = h(g10, g10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f8403a = i10;
        }
        return i10;
    }

    public abstract o6 i();

    public final /* synthetic */ Iterator iterator() {
        return new l6(this);
    }

    public abstract String j(Charset charset);

    public abstract void k(u6 u6Var);

    public abstract boolean l();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(g());
        objArr[2] = g() <= 50 ? a.N(this) : a.N(i()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
