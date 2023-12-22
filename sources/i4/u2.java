package i4;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class u2 extends AbstractMap {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f7700g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f7701a;

    /* renamed from: b  reason: collision with root package name */
    public List f7702b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map f7703c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f7704d;

    /* renamed from: e  reason: collision with root package name */
    public volatile t2 f7705e;

    /* renamed from: f  reason: collision with root package name */
    public Map f7706f = Collections.emptyMap();

    public /* synthetic */ u2(int i10) {
        this.f7701a = i10;
    }

    public void a() {
        if (!this.f7704d) {
            this.f7703c = this.f7703c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7703c);
            this.f7706f = this.f7706f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7706f);
            this.f7704d = true;
        }
    }

    public final int b() {
        return this.f7702b.size();
    }

    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((r2) this.f7702b.get(d10)).setValue(obj);
        }
        g();
        if (this.f7702b.isEmpty() && !(this.f7702b instanceof ArrayList)) {
            this.f7702b = new ArrayList(this.f7701a);
        }
        int i10 = -(d10 + 1);
        if (i10 >= this.f7701a) {
            return f().put(comparable, obj);
        }
        int size = this.f7702b.size();
        int i11 = this.f7701a;
        if (size == i11) {
            r2 r2Var = (r2) this.f7702b.remove(i11 - 1);
            f().put(r2Var.f7631a, r2Var.f7632b);
        }
        this.f7702b.add(i10, new r2(this, comparable, obj));
        return null;
    }

    public final void clear() {
        g();
        if (!this.f7702b.isEmpty()) {
            this.f7702b.clear();
        }
        if (!this.f7703c.isEmpty()) {
            this.f7703c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f7703c.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int size = this.f7702b.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((r2) this.f7702b.get(size)).f7631a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((r2) this.f7702b.get(i11)).f7631a);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public final Object e(int i10) {
        g();
        Object obj = ((r2) this.f7702b.remove(i10)).f7632b;
        if (!this.f7703c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f7702b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new r2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Set entrySet() {
        if (this.f7705e == null) {
            this.f7705e = new t2(this);
        }
        return this.f7705e;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return super.equals(obj);
        }
        u2 u2Var = (u2) obj;
        int size = size();
        if (size != u2Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 == u2Var.b()) {
            for (int i10 = 0; i10 < b10; i10++) {
                if (!((Map.Entry) this.f7702b.get(i10)).equals((Map.Entry) u2Var.f7702b.get(i10))) {
                    return false;
                }
            }
            if (b10 == size) {
                return true;
            }
            obj3 = this.f7703c;
            obj2 = u2Var.f7703c;
        } else {
            obj3 = entrySet();
            obj2 = u2Var.entrySet();
        }
        return obj3.equals(obj2);
    }

    public final SortedMap f() {
        g();
        if (this.f7703c.isEmpty() && !(this.f7703c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7703c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f7706f = treeMap.descendingMap();
        }
        return (SortedMap) this.f7703c;
    }

    public final void g() {
        if (this.f7704d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((r2) this.f7702b.get(d10)).f7632b;
        }
        return this.f7703c.get(comparable);
    }

    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += ((r2) this.f7702b.get(i11)).hashCode();
        }
        return this.f7703c.size() > 0 ? this.f7703c.hashCode() + i10 : i10;
    }

    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return e(d10);
        }
        if (this.f7703c.isEmpty()) {
            return null;
        }
        return this.f7703c.remove(comparable);
    }

    public final int size() {
        return this.f7703c.size() + this.f7702b.size();
    }
}
