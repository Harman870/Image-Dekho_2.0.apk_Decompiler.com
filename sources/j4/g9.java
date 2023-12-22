package j4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class g9 extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h9 f8202a;

    public /* synthetic */ g9(h9 h9Var) {
        this.f8202a = h9Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f8202a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f8202a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f8202a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new f9(this.f8202a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f8202a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f8202a.size();
    }
}
