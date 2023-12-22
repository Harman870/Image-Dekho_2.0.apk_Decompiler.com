package p8;

import androidx.lifecycle.c0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import x8.f;

public final class h implements Set, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final h f10707a = new h();

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        f.f((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        f.f(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return e.f10704a;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return c0.i(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        f.f(tArr, "array");
        return c0.k(this, tArr);
    }

    public final String toString() {
        return "[]";
    }
}
