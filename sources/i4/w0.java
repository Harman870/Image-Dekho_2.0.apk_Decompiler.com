package i4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w0 extends u implements RandomAccess, i2 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f7753b;

    /* renamed from: c  reason: collision with root package name */
    public int f7754c;

    static {
        new w0(0, new float[0]).f7694a = false;
    }

    public w0() {
        this(0, new float[10]);
    }

    public w0(int i10, float[] fArr) {
        this.f7753b = fArr;
        this.f7754c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7754c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7754c));
        }
        float[] fArr = this.f7753b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[a.f(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f7753b, i10, fArr2, i10 + 1, this.f7754c - i10);
            this.f7753b = fArr2;
        }
        this.f7753b[i10] = floatValue;
        this.f7754c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = g1.f7324a;
        collection.getClass();
        if (!(collection instanceof w0)) {
            return super.addAll(collection);
        }
        w0 w0Var = (w0) collection;
        int i10 = w0Var.f7754c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7754c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f7753b;
            if (i12 > fArr.length) {
                this.f7753b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(w0Var.f7753b, 0, this.f7753b, this.f7754c, w0Var.f7754c);
            this.f7754c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ f1 c(int i10) {
        if (i10 >= this.f7754c) {
            return new w0(this.f7754c, Arrays.copyOf(this.f7753b, i10));
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f10) {
        a();
        int i10 = this.f7754c;
        float[] fArr = this.f7753b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a.f(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f7753b = fArr2;
        }
        float[] fArr3 = this.f7753b;
        int i11 = this.f7754c;
        this.f7754c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return super.equals(obj);
        }
        w0 w0Var = (w0) obj;
        if (this.f7754c != w0Var.f7754c) {
            return false;
        }
        float[] fArr = w0Var.f7753b;
        for (int i10 = 0; i10 < this.f7754c; i10++) {
            if (Float.floatToIntBits(this.f7753b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f7754c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7754c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f7753b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7754c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f7753b[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f7754c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7753b[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        float[] fArr = this.f7753b;
        float f10 = fArr[i10];
        int i11 = this.f7754c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f7754c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f7753b;
            System.arraycopy(fArr, i11, fArr, i10, this.f7754c - i11);
            this.f7754c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        g(i10);
        float[] fArr = this.f7753b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f7754c;
    }
}
