package m;

import androidx.lifecycle.c0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m.g;

public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f9260e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f9261f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f9262g;

    /* renamed from: h  reason: collision with root package name */
    public static int f9263h;

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f9264i;

    /* renamed from: j  reason: collision with root package name */
    public static int f9265j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f9266a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f9267b;

    /* renamed from: c  reason: collision with root package name */
    public int f9268c;

    /* renamed from: d  reason: collision with root package name */
    public c f9269d;

    public d() {
        this(0);
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f9266a = f9260e;
            this.f9267b = f9261f;
        } else {
            a(i10);
        }
        this.f9268c = 0;
    }

    public static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f9265j < 10) {
                    objArr[0] = f9264i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f9264i = objArr;
                    f9265j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f9263h < 10) {
                    objArr[0] = f9262g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f9262g = objArr;
                    f9263h++;
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = f9264i;
                if (objArr != null) {
                    this.f9267b = objArr;
                    f9264i = (Object[]) objArr[0];
                    this.f9266a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9265j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f9262g;
                if (objArr2 != null) {
                    this.f9267b = objArr2;
                    f9262g = (Object[]) objArr2[0];
                    this.f9266a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9263h--;
                    return;
                }
            }
        }
        this.f9266a = new int[i10];
        this.f9267b = new Object[i10];
    }

    public final boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = h();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = g(hashCode, e10);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f9268c;
        int[] iArr = this.f9266a;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f9267b;
            a(i14);
            int[] iArr2 = this.f9266a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9267b, 0, objArr.length);
            }
            d(iArr, objArr, this.f9268c);
        }
        int i15 = this.f9268c;
        if (i12 < i15) {
            int[] iArr3 = this.f9266a;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f9267b;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f9268c - i12);
        }
        this.f9266a[i12] = i10;
        this.f9267b[i12] = e10;
        this.f9268c++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f9268c;
        int[] iArr = this.f9266a;
        boolean z9 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f9267b;
            a(size);
            int i10 = this.f9268c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f9266a, 0, i10);
                System.arraycopy(objArr, 0, this.f9267b, 0, this.f9268c);
            }
            d(iArr, objArr, this.f9268c);
        }
        for (Object add : collection) {
            z9 |= add(add);
        }
        return z9;
    }

    public final void clear() {
        int i10 = this.f9268c;
        if (i10 != 0) {
            d(this.f9266a, this.f9267b, i10);
            this.f9266a = f9260e;
            this.f9267b = f9261f;
            this.f9268c = 0;
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f9268c != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f9268c) {
                try {
                    if (!set.contains(this.f9267b[i10])) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g(int i10, Object obj) {
        int i11 = this.f9268c;
        if (i11 == 0) {
            return -1;
        }
        int c10 = c0.c(i11, i10, this.f9266a);
        if (c10 < 0 || obj.equals(this.f9267b[c10])) {
            return c10;
        }
        int i12 = c10 + 1;
        while (i12 < i11 && this.f9266a[i12] == i10) {
            if (obj.equals(this.f9267b[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = c10 - 1;
        while (i13 >= 0 && this.f9266a[i13] == i10) {
            if (obj.equals(this.f9267b[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public final int h() {
        int i10 = this.f9268c;
        if (i10 == 0) {
            return -1;
        }
        int c10 = c0.c(i10, 0, this.f9266a);
        if (c10 < 0 || this.f9267b[c10] == null) {
            return c10;
        }
        int i11 = c10 + 1;
        while (i11 < i10 && this.f9266a[i11] == 0) {
            if (this.f9267b[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = c10 - 1;
        while (i12 >= 0 && this.f9266a[i12] == 0) {
            if (this.f9267b[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public final int hashCode() {
        int[] iArr = this.f9266a;
        int i10 = this.f9268c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final void i(int i10) {
        Object[] objArr = this.f9267b;
        Object obj = objArr[i10];
        int i11 = this.f9268c;
        if (i11 <= 1) {
            d(this.f9266a, objArr, i11);
            this.f9266a = f9260e;
            this.f9267b = f9261f;
            this.f9268c = 0;
            return;
        }
        int[] iArr = this.f9266a;
        int i12 = 8;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i13 = i11 - 1;
            this.f9268c = i13;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                Object[] objArr2 = this.f9267b;
                System.arraycopy(objArr2, i14, objArr2, i10, this.f9268c - i10);
            }
            this.f9267b[this.f9268c] = null;
            return;
        }
        if (i11 > 8) {
            i12 = i11 + (i11 >> 1);
        }
        a(i12);
        this.f9268c--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f9266a, 0, i10);
            System.arraycopy(objArr, 0, this.f9267b, 0, i10);
        }
        int i15 = this.f9268c;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, this.f9266a, i10, i15 - i10);
            System.arraycopy(objArr, i16, this.f9267b, i10, this.f9268c - i10);
        }
    }

    public final int indexOf(Object obj) {
        return obj == null ? h() : g(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        return this.f9268c <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f9269d == null) {
            this.f9269d = new c(this);
        }
        c cVar = this.f9269d;
        if (cVar.f9281b == null) {
            cVar.f9281b = new g.c();
        }
        return cVar.f9281b.iterator();
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        i(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z9 = false;
        for (Object remove : collection) {
            z9 |= remove(remove);
        }
        return z9;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z9 = false;
        for (int i10 = this.f9268c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f9267b[i10])) {
                i(i10);
                z9 = true;
            }
        }
        return z9;
    }

    public final int size() {
        return this.f9268c;
    }

    public final Object[] toArray() {
        int i10 = this.f9268c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f9267b, 0, objArr, 0, i10);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f9268c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f9268c);
        }
        System.arraycopy(this.f9267b, 0, tArr, 0, this.f9268c);
        int length = tArr.length;
        int i10 = this.f9268c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9268c * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f9268c; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f9267b[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
