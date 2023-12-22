package j4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class x5 extends s5 implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final u5 f8551b = new u5(a6.f8042e, 0);

    public static a6 j(int i10, Object[] objArr) {
        return i10 == 0 ? a6.f8042e : new a6(objArr, i10);
    }

    public void a(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
    }

    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        boolean z9;
        boolean z10;
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (list instanceof RandomAccess) {
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = get(i10);
                    Object obj3 = list.get(i10);
                    if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return false;
                    }
                }
            } else {
                u5 k = listIterator(0);
                Iterator it = list.iterator();
                while (k.hasNext()) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    Object next = k.next();
                    Object next2 = it.next();
                    if (next == next2 || (next != null && next.equals(next2))) {
                        z9 = true;
                        continue;
                    } else {
                        z9 = false;
                        continue;
                    }
                    if (!z9) {
                        return false;
                    }
                }
                if (it.hasNext()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    /* renamed from: i */
    public x5 subList(int i10, int i11) {
        j5.b(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? a6.f8042e : new v5(this, i10, i12);
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: k */
    public final u5 listIterator(int i10) {
        int size = size();
        if (i10 >= 0 && i10 <= size) {
            return isEmpty() ? f8551b : new u5(this, i10);
        }
        throw new IndexOutOfBoundsException(j5.c(i10, size, "index"));
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
