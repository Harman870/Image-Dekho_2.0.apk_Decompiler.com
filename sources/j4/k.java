package j4;

import java.util.Iterator;

public final class k implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterator f8279a;

    public k(Iterator it) {
        this.f8279a = it;
    }

    public final boolean hasNext() {
        return this.f8279a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new t((String) this.f8279a.next());
    }
}
