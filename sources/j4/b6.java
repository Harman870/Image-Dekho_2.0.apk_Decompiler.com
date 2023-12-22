package j4;

import java.util.Iterator;
import javax.annotation.CheckForNull;

public final class b6 extends y5 {

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f8053i;

    /* renamed from: j  reason: collision with root package name */
    public static final b6 f8054j;

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f8055d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f8056e;

    /* renamed from: f  reason: collision with root package name */
    public final transient Object[] f8057f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int f8058g;

    /* renamed from: h  reason: collision with root package name */
    public final transient int f8059h;

    static {
        Object[] objArr = new Object[0];
        f8053i = objArr;
        f8054j = new b6(objArr, 0, objArr, 0, 0);
    }

    public b6(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f8055d = objArr;
        this.f8056e = i10;
        this.f8057f = objArr2;
        this.f8058g = i11;
        this.f8059h = i12;
    }

    public final void a(Object[] objArr) {
        System.arraycopy(this.f8055d, 0, objArr, 0, this.f8059h);
    }

    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f8057f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * -862048943), 15)) * 461845907);
        while (true) {
            int i10 = rotateLeft & this.f8058g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i10 + 1;
        }
    }

    public final int d() {
        return this.f8059h;
    }

    public final int g() {
        return 0;
    }

    public final Object[] h() {
        return this.f8055d;
    }

    public final int hashCode() {
        return this.f8056e;
    }

    public final d6 i() {
        x5 x5Var = this.f8566b;
        if (x5Var == null) {
            x5Var = l();
            this.f8566b = x5Var;
        }
        return x5Var.listIterator(0);
    }

    public final Iterator iterator() {
        x5 x5Var = this.f8566b;
        if (x5Var == null) {
            x5Var = l();
            this.f8566b = x5Var;
        }
        return x5Var.listIterator(0);
    }

    public final a6 l() {
        return x5.j(this.f8059h, this.f8055d);
    }

    public final int size() {
        return this.f8059h;
    }
}
