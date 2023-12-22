package i4;

import java.util.Iterator;

public final class b3 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f7196a;

    public b3(c3 c3Var) {
        this.f7196a = c3Var.f7222a.iterator();
    }

    public final boolean hasNext() {
        return this.f7196a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f7196a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
