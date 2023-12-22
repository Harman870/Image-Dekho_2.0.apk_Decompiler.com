package i4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class n0 extends u implements RandomAccess, i2 {

    /* renamed from: b  reason: collision with root package name */
    public double[] f7512b;

    /* renamed from: c  reason: collision with root package name */
    public int f7513c;

    static {
        new n0(0, new double[0]).f7694a = false;
    }

    public n0() {
        this(0, new double[10]);
    }

    public n0(int i10, double[] dArr) {
        this.f7512b = dArr;
        this.f7513c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7513c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7513c));
        }
        double[] dArr = this.f7512b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[a.f(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f7512b, i10, dArr2, i10 + 1, this.f7513c - i10);
            this.f7512b = dArr2;
        }
        this.f7512b[i10] = doubleValue;
        this.f7513c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = g1.f7324a;
        collection.getClass();
        if (!(collection instanceof n0)) {
            return super.addAll(collection);
        }
        n0 n0Var = (n0) collection;
        int i10 = n0Var.f7513c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7513c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f7512b;
            if (i12 > dArr.length) {
                this.f7512b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(n0Var.f7512b, 0, this.f7512b, this.f7513c, n0Var.f7513c);
            this.f7513c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ f1 c(int i10) {
        if (i10 >= this.f7513c) {
            return new n0(this.f7513c, Arrays.copyOf(this.f7512b, i10));
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d10) {
        a();
        int i10 = this.f7513c;
        double[] dArr = this.f7512b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a.f(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f7512b = dArr2;
        }
        double[] dArr3 = this.f7512b;
        int i11 = this.f7513c;
        this.f7513c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return super.equals(obj);
        }
        n0 n0Var = (n0) obj;
        if (this.f7513c != n0Var.f7513c) {
            return false;
        }
        double[] dArr = n0Var.f7512b;
        for (int i10 = 0; i10 < this.f7513c; i10++) {
            if (Double.doubleToLongBits(this.f7512b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f7513c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7513c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f7512b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7513c; i11++) {
            i10 = (i10 * 31) + g1.b(Double.doubleToLongBits(this.f7512b[i11]));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f7513c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7512b[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        double[] dArr = this.f7512b;
        double d10 = dArr[i10];
        int i11 = this.f7513c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f7513c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f7512b;
            System.arraycopy(dArr, i11, dArr, i10, this.f7513c - i11);
            this.f7513c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        g(i10);
        double[] dArr = this.f7512b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f7513c;
    }
}
