package j4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterator f8093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Iterator f8094b;

    public d(Iterator it, Iterator it2) {
        this.f8093a = it;
        this.f8094b = it2;
    }

    public final boolean hasNext() {
        if (this.f8093a.hasNext()) {
            return true;
        }
        return this.f8094b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f8093a.hasNext()) {
            return new t(((Integer) this.f8093a.next()).toString());
        }
        if (this.f8094b.hasNext()) {
            return new t((String) this.f8094b.next());
        }
        throw new NoSuchElementException();
    }
}
