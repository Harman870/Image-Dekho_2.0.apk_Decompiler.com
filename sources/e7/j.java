package e7;

import java.util.ArrayList;
import java.util.Iterator;

public final class j extends l implements Iterable<l> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6208a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f6208a.equals(this.f6208a));
    }

    public final int hashCode() {
        return this.f6208a.hashCode();
    }

    public final Iterator<l> iterator() {
        return this.f6208a.iterator();
    }
}
