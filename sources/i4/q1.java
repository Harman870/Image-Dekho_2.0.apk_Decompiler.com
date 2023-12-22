package i4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class q1 extends u implements RandomAccess, i2 {

    /* renamed from: b  reason: collision with root package name */
    public long[] f7606b;

    /* renamed from: c  reason: collision with root package name */
    public int f7607c;

    static {
        new q1(new long[0], 0).f7694a = false;
    }

    public q1() {
        this(new long[10], 0);
    }

    public q1(long[] jArr, int i10) {
        this.f7606b = jArr;
        this.f7607c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7607c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7607c));
        }
        long[] jArr = this.f7606b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[a.f(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f7606b, i10, jArr2, i10 + 1, this.f7607c - i10);
            this.f7606b = jArr2;
        }
        this.f7606b[i10] = longValue;
        this.f7607c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = g1.f7324a;
        collection.getClass();
        if (!(collection instanceof q1)) {
            return super.addAll(collection);
        }
        q1 q1Var = (q1) collection;
        int i10 = q1Var.f7607c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7607c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f7606b;
            if (i12 > jArr.length) {
                this.f7606b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(q1Var.f7606b, 0, this.f7606b, this.f7607c, q1Var.f7607c);
            this.f7607c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* bridge */ /* synthetic */ f1 c(int i10) {
        if (i10 >= this.f7607c) {
            return new q1(Arrays.copyOf(this.f7606b, i10), this.f7607c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j10) {
        a();
        int i10 = this.f7607c;
        long[] jArr = this.f7606b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a.f(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f7606b = jArr2;
        }
        long[] jArr3 = this.f7606b;
        int i11 = this.f7607c;
        this.f7607c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return super.equals(obj);
        }
        q1 q1Var = (q1) obj;
        if (this.f7607c != q1Var.f7607c) {
            return false;
        }
        long[] jArr = q1Var.f7606b;
        for (int i10 = 0; i10 < this.f7607c; i10++) {
            if (this.f7606b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f7607c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7607c));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f7606b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7607c; i11++) {
            i10 = (i10 * 31) + g1.b(this.f7606b[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f7607c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7606b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        long[] jArr = this.f7606b;
        long j10 = jArr[i10];
        int i11 = this.f7607c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f7607c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f7606b;
            System.arraycopy(jArr, i11, jArr, i10, this.f7607c - i11);
            this.f7607c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        g(i10);
        long[] jArr = this.f7606b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f7607c;
    }
}
