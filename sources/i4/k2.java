package i4;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.util.Arrays;
import java.util.RandomAccess;

public final class k2 extends u implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final k2 f7433d;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f7434b;

    /* renamed from: c  reason: collision with root package name */
    public int f7435c;

    static {
        k2 k2Var = new k2(new Object[0], 0);
        f7433d = k2Var;
        k2Var.f7694a = false;
    }

    public k2(Object[] objArr, int i10) {
        this.f7434b = objArr;
        this.f7435c = i10;
    }

    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f7435c)) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7435c));
        }
        Object[] objArr = this.f7434b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[a.f(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f7434b, i10, objArr2, i10 + 1, this.f7435c - i10);
            this.f7434b = objArr2;
        }
        this.f7434b[i10] = obj;
        this.f7435c++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        a();
        int i10 = this.f7435c;
        Object[] objArr = this.f7434b;
        if (i10 == objArr.length) {
            this.f7434b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7434b;
        int i11 = this.f7435c;
        this.f7435c = i11 + 1;
        objArr2[i11] = obj;
        this.modCount++;
        return true;
    }

    public final /* bridge */ /* synthetic */ f1 c(int i10) {
        if (i10 >= this.f7435c) {
            return new k2(Arrays.copyOf(this.f7434b, i10), this.f7435c);
        }
        throw new IllegalArgumentException();
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f7435c) {
            throw new IndexOutOfBoundsException(f.f("Index:", i10, ", Size:", this.f7435c));
        }
    }

    public final Object get(int i10) {
        d(i10);
        return this.f7434b[i10];
    }

    public final Object remove(int i10) {
        a();
        d(i10);
        Object[] objArr = this.f7434b;
        Object obj = objArr[i10];
        int i11 = this.f7435c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f7435c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i10, Object obj) {
        a();
        d(i10);
        Object[] objArr = this.f7434b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f7435c;
    }
}
