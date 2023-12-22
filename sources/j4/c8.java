package j4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class c8 extends g6 implements RandomAccess, q7, u8 {

    /* renamed from: d  reason: collision with root package name */
    public static final c8 f8085d = new c8(new long[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public long[] f8086b;

    /* renamed from: c  reason: collision with root package name */
    public int f8087c;

    public c8() {
        this(new long[10], 0, true);
    }

    public c8(long[] jArr, int i10, boolean z9) {
        super(z9);
        this.f8086b = jArr;
        this.f8087c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f8087c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8087c));
        }
        long[] jArr = this.f8086b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[a.f(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f8086b, i10, jArr2, i10 + 1, this.f8087c - i10);
            this.f8086b = jArr2;
        }
        this.f8086b[i10] = longValue;
        this.f8087c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = s7.f8462a;
        collection.getClass();
        if (!(collection instanceof c8)) {
            return super.addAll(collection);
        }
        c8 c8Var = (c8) collection;
        int i10 = c8Var.f8087c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8087c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f8086b;
            if (i12 > jArr.length) {
                this.f8086b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c8Var.f8086b, 0, this.f8086b, this.f8087c, c8Var.f8087c);
            this.f8087c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final r7 c(int i10) {
        if (i10 >= this.f8087c) {
            return new c8(Arrays.copyOf(this.f8086b, i10), this.f8087c, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j10) {
        a();
        int i10 = this.f8087c;
        long[] jArr = this.f8086b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a.f(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f8086b = jArr2;
        }
        long[] jArr3 = this.f8086b;
        int i11 = this.f8087c;
        this.f8087c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return super.equals(obj);
        }
        c8 c8Var = (c8) obj;
        if (this.f8087c != c8Var.f8087c) {
            return false;
        }
        long[] jArr = c8Var.f8086b;
        for (int i10 = 0; i10 < this.f8087c; i10++) {
            if (this.f8086b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f8087c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8087c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f8086b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8087c; i11++) {
            long j10 = this.f8086b[i11];
            Charset charset = s7.f8462a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f8087c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8086b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        long[] jArr = this.f8086b;
        long j10 = jArr[i10];
        int i11 = this.f8087c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f8087c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f8086b;
            System.arraycopy(jArr, i11, jArr, i10, this.f8087c - i11);
            this.f8087c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        g(i10);
        long[] jArr = this.f8086b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f8087c;
    }
}
