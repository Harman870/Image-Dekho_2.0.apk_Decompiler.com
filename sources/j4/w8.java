package j4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.util.Arrays;
import java.util.RandomAccess;

public final class w8 extends g6 implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final w8 f8543d = new w8(new Object[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public Object[] f8544b;

    /* renamed from: c  reason: collision with root package name */
    public int f8545c;

    public w8(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f8544b = objArr;
        this.f8545c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f8545c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8545c));
        }
        Object[] objArr = this.f8544b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[a.f(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f8544b, i10, objArr2, i10 + 1, this.f8545c - i10);
            this.f8544b = objArr2;
        }
        this.f8544b[i10] = obj;
        this.f8545c++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        a();
        int i10 = this.f8545c;
        Object[] objArr = this.f8544b;
        if (i10 == objArr.length) {
            this.f8544b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8544b;
        int i11 = this.f8545c;
        this.f8545c = i11 + 1;
        objArr2[i11] = obj;
        this.modCount++;
        return true;
    }

    public final /* bridge */ /* synthetic */ r7 c(int i10) {
        if (i10 >= this.f8545c) {
            return new w8(Arrays.copyOf(this.f8544b, i10), this.f8545c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f8545c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f8545c));
        }
    }

    public final Object get(int i10) {
        d(i10);
        return this.f8544b[i10];
    }

    public final Object remove(int i10) {
        a();
        d(i10);
        Object[] objArr = this.f8544b;
        Object obj = objArr[i10];
        int i11 = this.f8545c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f8545c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i10, Object obj) {
        a();
        d(i10);
        Object[] objArr = this.f8544b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f8545c;
    }
}
