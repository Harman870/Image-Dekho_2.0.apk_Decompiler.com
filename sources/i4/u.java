package i4;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class u extends AbstractList implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7694a = true;

    public final void a() {
        if (!this.f7694a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(Object obj) {
        a();
        return super.add(obj);
    }

    public boolean addAll(int i10, Collection collection) {
        a();
        return super.addAll(i10, collection);
    }

    public boolean addAll(Collection collection) {
        a();
        return super.addAll(collection);
    }

    public void clear() {
        a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public abstract Object remove(int i10);

    public final boolean remove(Object obj) {
        a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        a();
        return super.retainAll(collection);
    }

    public final void zzb() {
        this.f7694a = false;
    }

    public final boolean zzc() {
        return this.f7694a;
    }
}
