package j4;

import java.util.Iterator;

public final class n9 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f8341a;

    public n9(o9 o9Var) {
        this.f8341a = o9Var.f8366a.iterator();
    }

    public final boolean hasNext() {
        return this.f8341a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8341a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
