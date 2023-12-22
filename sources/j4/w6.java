package j4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w6 extends g6 implements RandomAccess, u8 {

    /* renamed from: b  reason: collision with root package name */
    public double[] f8539b;

    /* renamed from: c  reason: collision with root package name */
    public int f8540c;

    static {
        new w6(new double[0], 0, false);
    }

    public w6() {
        this(new double[10], 0, true);
    }

    public w6(double[] dArr, int i10, boolean z9) {
        super(z9);
        this.f8539b = dArr;
        this.f8540c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f8540c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8540c));
        }
        double[] dArr = this.f8539b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[a.f(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f8539b, i10, dArr2, i10 + 1, this.f8540c - i10);
            this.f8539b = dArr2;
        }
        this.f8539b[i10] = doubleValue;
        this.f8540c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = s7.f8462a;
        collection.getClass();
        if (!(collection instanceof w6)) {
            return super.addAll(collection);
        }
        w6 w6Var = (w6) collection;
        int i10 = w6Var.f8540c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8540c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f8539b;
            if (i12 > dArr.length) {
                this.f8539b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(w6Var.f8539b, 0, this.f8539b, this.f8540c, w6Var.f8540c);
            this.f8540c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ r7 c(int i10) {
        if (i10 >= this.f8540c) {
            return new w6(Arrays.copyOf(this.f8539b, i10), this.f8540c, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d10) {
        a();
        int i10 = this.f8540c;
        double[] dArr = this.f8539b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a.f(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f8539b = dArr2;
        }
        double[] dArr3 = this.f8539b;
        int i11 = this.f8540c;
        this.f8540c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return super.equals(obj);
        }
        w6 w6Var = (w6) obj;
        if (this.f8540c != w6Var.f8540c) {
            return false;
        }
        double[] dArr = w6Var.f8539b;
        for (int i10 = 0; i10 < this.f8540c; i10++) {
            if (Double.doubleToLongBits(this.f8539b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f8540c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8540c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f8539b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8540c; i11++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f8539b[i11]);
            Charset charset = s7.f8462a;
            i10 = (i10 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f8540c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8539b[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        double[] dArr = this.f8539b;
        double d10 = dArr[i10];
        int i11 = this.f8540c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f8540c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f8539b;
            System.arraycopy(dArr, i11, dArr, i10, this.f8540c - i11);
            this.f8540c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        g(i10);
        double[] dArr = this.f8539b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f8540c;
    }
}
