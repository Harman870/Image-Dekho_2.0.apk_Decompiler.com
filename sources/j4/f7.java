package j4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class f7 extends g6 implements RandomAccess, u8 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f8145b;

    /* renamed from: c  reason: collision with root package name */
    public int f8146c;

    static {
        new f7(new float[0], 0, false);
    }

    public f7() {
        this(new float[10], 0, true);
    }

    public f7(float[] fArr, int i10, boolean z9) {
        super(z9);
        this.f8145b = fArr;
        this.f8146c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f8146c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8146c));
        }
        float[] fArr = this.f8145b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[a.f(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f8145b, i10, fArr2, i10 + 1, this.f8146c - i10);
            this.f8145b = fArr2;
        }
        this.f8145b[i10] = floatValue;
        this.f8146c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = s7.f8462a;
        collection.getClass();
        if (!(collection instanceof f7)) {
            return super.addAll(collection);
        }
        f7 f7Var = (f7) collection;
        int i10 = f7Var.f8146c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8146c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f8145b;
            if (i12 > fArr.length) {
                this.f8145b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(f7Var.f8145b, 0, this.f8145b, this.f8146c, f7Var.f8146c);
            this.f8146c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ r7 c(int i10) {
        if (i10 >= this.f8146c) {
            return new f7(Arrays.copyOf(this.f8145b, i10), this.f8146c, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f10) {
        a();
        int i10 = this.f8146c;
        float[] fArr = this.f8145b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a.f(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f8145b = fArr2;
        }
        float[] fArr3 = this.f8145b;
        int i11 = this.f8146c;
        this.f8146c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return super.equals(obj);
        }
        f7 f7Var = (f7) obj;
        if (this.f8146c != f7Var.f8146c) {
            return false;
        }
        float[] fArr = f7Var.f8145b;
        for (int i10 = 0; i10 < this.f8146c; i10++) {
            if (Float.floatToIntBits(this.f8145b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f8146c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8146c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f8145b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8146c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f8145b[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f8146c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8145b[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        float[] fArr = this.f8145b;
        float f10 = fArr[i10];
        int i11 = this.f8146c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f8146c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f8145b;
            System.arraycopy(fArr, i11, fArr, i10, this.f8146c - i11);
            this.f8146c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        g(i10);
        float[] fArr = this.f8145b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f8146c;
    }
}
