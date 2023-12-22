package j4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class o9 extends AbstractList implements RandomAccess, y7 {

    /* renamed from: a  reason: collision with root package name */
    public final y7 f8366a;

    public o9(y7 y7Var) {
        this.f8366a = y7Var;
    }

    public final List b() {
        return this.f8366a.b();
    }

    public final Object e(int i10) {
        return this.f8366a.e(i10);
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((x7) this.f8366a).get(i10);
    }

    public final Iterator iterator() {
        return new n9(this);
    }

    public final ListIterator listIterator(int i10) {
        return new m9(this, i10);
    }

    public final int size() {
        return this.f8366a.size();
    }

    public final void v(q6 q6Var) {
        throw new UnsupportedOperationException();
    }

    public final y7 zze() {
        return this;
    }
}
