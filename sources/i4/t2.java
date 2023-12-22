package i4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class t2 extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u2 f7679a;

    public /* synthetic */ t2(u2 u2Var) {
        this.f7679a = u2Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f7679a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f7679a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f7679a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new s2(this.f7679a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f7679a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f7679a.size();
    }
}
