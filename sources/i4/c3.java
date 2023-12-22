package i4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class c3 extends AbstractList implements RandomAccess, m1 {

    /* renamed from: a  reason: collision with root package name */
    public final m1 f7222a;

    public c3(m1 m1Var) {
        this.f7222a = m1Var;
    }

    public final List b() {
        return this.f7222a.b();
    }

    public final Object e(int i10) {
        return this.f7222a.e(i10);
    }

    public final void f(d0 d0Var) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((l1) this.f7222a).get(i10);
    }

    public final Iterator iterator() {
        return new b3(this);
    }

    public final ListIterator listIterator(int i10) {
        return new a3(this, i10);
    }

    public final int size() {
        return this.f7222a.size();
    }

    public final m1 zze() {
        return this;
    }
}
