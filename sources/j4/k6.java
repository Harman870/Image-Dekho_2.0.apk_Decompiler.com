package j4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class k6 extends g6 implements RandomAccess, u8 {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f8295b;

    /* renamed from: c  reason: collision with root package name */
    public int f8296c;

    static {
        new k6(new boolean[0], 0, false);
    }

    public k6() {
        this(new boolean[10], 0, true);
    }

    public k6(boolean[] zArr, int i10, boolean z9) {
        super(z9);
        this.f8295b = zArr;
        this.f8296c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f8296c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8296c));
        }
        boolean[] zArr = this.f8295b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[a.f(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f8295b, i10, zArr2, i10 + 1, this.f8296c - i10);
            this.f8295b = zArr2;
        }
        this.f8295b[i10] = booleanValue;
        this.f8296c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = s7.f8462a;
        collection.getClass();
        if (!(collection instanceof k6)) {
            return super.addAll(collection);
        }
        k6 k6Var = (k6) collection;
        int i10 = k6Var.f8296c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8296c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f8295b;
            if (i12 > zArr.length) {
                this.f8295b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(k6Var.f8295b, 0, this.f8295b, this.f8296c, k6Var.f8296c);
            this.f8296c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ r7 c(int i10) {
        if (i10 >= this.f8296c) {
            return new k6(Arrays.copyOf(this.f8295b, i10), this.f8296c, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z9) {
        a();
        int i10 = this.f8296c;
        boolean[] zArr = this.f8295b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a.f(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f8295b = zArr2;
        }
        boolean[] zArr3 = this.f8295b;
        int i11 = this.f8296c;
        this.f8296c = i11 + 1;
        zArr3[i11] = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return super.equals(obj);
        }
        k6 k6Var = (k6) obj;
        if (this.f8296c != k6Var.f8296c) {
            return false;
        }
        boolean[] zArr = k6Var.f8295b;
        for (int i10 = 0; i10 < this.f8296c; i10++) {
            if (this.f8295b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f8296c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8296c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f8295b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8296c; i11++) {
            i10 = (i10 * 31) + s7.a(this.f8295b[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f8296c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8295b[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        boolean[] zArr = this.f8295b;
        boolean z9 = zArr[i10];
        int i11 = this.f8296c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f8296c--;
        this.modCount++;
        return Boolean.valueOf(z9);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f8295b;
            System.arraycopy(zArr, i11, zArr, i10, this.f8296c - i11);
            this.f8296c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        g(i10);
        boolean[] zArr = this.f8295b;
        boolean z9 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z9);
    }

    public final int size() {
        return this.f8296c;
    }
}
