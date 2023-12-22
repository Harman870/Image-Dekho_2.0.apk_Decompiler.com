package i4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class y extends u implements RandomAccess, i2 {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f7799b;

    /* renamed from: c  reason: collision with root package name */
    public int f7800c;

    static {
        new y(new boolean[0], 0).f7694a = false;
    }

    public y() {
        this(new boolean[10], 0);
    }

    public y(boolean[] zArr, int i10) {
        this.f7799b = zArr;
        this.f7800c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7800c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7800c));
        }
        boolean[] zArr = this.f7799b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[a.f(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f7799b, i10, zArr2, i10 + 1, this.f7800c - i10);
            this.f7799b = zArr2;
        }
        this.f7799b[i10] = booleanValue;
        this.f7800c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = g1.f7324a;
        collection.getClass();
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i10 = yVar.f7800c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7800c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f7799b;
            if (i12 > zArr.length) {
                this.f7799b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(yVar.f7799b, 0, this.f7799b, this.f7800c, yVar.f7800c);
            this.f7800c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ f1 c(int i10) {
        if (i10 >= this.f7800c) {
            return new y(Arrays.copyOf(this.f7799b, i10), this.f7800c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z9) {
        a();
        int i10 = this.f7800c;
        boolean[] zArr = this.f7799b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a.f(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f7799b = zArr2;
        }
        boolean[] zArr3 = this.f7799b;
        int i11 = this.f7800c;
        this.f7800c = i11 + 1;
        zArr3[i11] = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f7800c != yVar.f7800c) {
            return false;
        }
        boolean[] zArr = yVar.f7799b;
        for (int i10 = 0; i10 < this.f7800c; i10++) {
            if (this.f7799b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f7800c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7800c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f7799b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7800c; i11++) {
            i10 = (i10 * 31) + g1.a(this.f7799b[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f7800c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7799b[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        boolean[] zArr = this.f7799b;
        boolean z9 = zArr[i10];
        int i11 = this.f7800c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f7800c--;
        this.modCount++;
        return Boolean.valueOf(z9);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f7799b;
            System.arraycopy(zArr, i11, zArr, i10, this.f7800c - i11);
            this.f7800c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        g(i10);
        boolean[] zArr = this.f7799b;
        boolean z9 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z9);
    }

    public final int size() {
        return this.f7800c;
    }
}
