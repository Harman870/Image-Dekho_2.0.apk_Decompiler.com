package i4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class d1 extends u implements RandomAccess, i2 {

    /* renamed from: b  reason: collision with root package name */
    public int[] f7247b;

    /* renamed from: c  reason: collision with root package name */
    public int f7248c;

    static {
        new d1(new int[0], 0).f7694a = false;
    }

    public d1() {
        this(new int[10], 0);
    }

    public d1(int[] iArr, int i10) {
        this.f7247b = iArr;
        this.f7248c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7248c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7248c));
        }
        int[] iArr = this.f7247b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[a.f(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f7247b, i10, iArr2, i10 + 1, this.f7248c - i10);
            this.f7247b = iArr2;
        }
        this.f7247b[i10] = intValue;
        this.f7248c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = g1.f7324a;
        collection.getClass();
        if (!(collection instanceof d1)) {
            return super.addAll(collection);
        }
        d1 d1Var = (d1) collection;
        int i10 = d1Var.f7248c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7248c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f7247b;
            if (i12 > iArr.length) {
                this.f7247b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(d1Var.f7247b, 0, this.f7247b, this.f7248c, d1Var.f7248c);
            this.f7248c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ f1 c(int i10) {
        if (i10 >= this.f7248c) {
            return new d1(Arrays.copyOf(this.f7247b, i10), this.f7248c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        a();
        int i11 = this.f7248c;
        int[] iArr = this.f7247b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a.f(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7247b = iArr2;
        }
        int[] iArr3 = this.f7247b;
        int i12 = this.f7248c;
        this.f7248c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return super.equals(obj);
        }
        d1 d1Var = (d1) obj;
        if (this.f7248c != d1Var.f7248c) {
            return false;
        }
        int[] iArr = d1Var.f7247b;
        for (int i10 = 0; i10 < this.f7248c; i10++) {
            if (this.f7247b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f7248c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7248c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Integer.valueOf(this.f7247b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7248c; i11++) {
            i10 = (i10 * 31) + this.f7247b[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f7248c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7247b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        int[] iArr = this.f7247b;
        int i11 = iArr[i10];
        int i12 = this.f7248c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f7248c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f7247b;
            System.arraycopy(iArr, i11, iArr, i10, this.f7248c - i11);
            this.f7248c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        g(i10);
        int[] iArr = this.f7247b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f7248c;
    }
}
