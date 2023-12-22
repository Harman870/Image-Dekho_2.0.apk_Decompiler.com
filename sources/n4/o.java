package n4;

import java.util.Iterator;

public final class o implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f10027a;

    public o(p pVar) {
        this.f10027a = pVar.f10048a.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.f10027a.hasNext();
    }

    public final Object next() {
        return (String) this.f10027a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
