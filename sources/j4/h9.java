package j4;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class h9 extends AbstractMap {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f8217g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f8218a;

    /* renamed from: b  reason: collision with root package name */
    public List f8219b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map f8220c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f8221d;

    /* renamed from: e  reason: collision with root package name */
    public volatile g9 f8222e;

    /* renamed from: f  reason: collision with root package name */
    public Map f8223f = Collections.emptyMap();

    public /* synthetic */ h9(int i10) {
        this.f8218a = i10;
    }

    public void a() {
        if (!this.f8221d) {
            this.f8220c = this.f8220c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8220c);
            this.f8223f = this.f8223f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8223f);
            this.f8221d = true;
        }
    }

    public final int b() {
        return this.f8219b.size();
    }

    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((e9) this.f8219b.get(d10)).setValue(obj);
        }
        g();
        if (this.f8219b.isEmpty() && !(this.f8219b instanceof ArrayList)) {
            this.f8219b = new ArrayList(this.f8218a);
        }
        int i10 = -(d10 + 1);
        if (i10 >= this.f8218a) {
            return f().put(comparable, obj);
        }
        int size = this.f8219b.size();
        int i11 = this.f8218a;
        if (size == i11) {
            e9 e9Var = (e9) this.f8219b.remove(i11 - 1);
            f().put(e9Var.f8124a, e9Var.f8125b);
        }
        this.f8219b.add(i10, new e9(this, comparable, obj));
        return null;
    }

    public final void clear() {
        g();
        if (!this.f8219b.isEmpty()) {
            this.f8219b.clear();
        }
        if (!this.f8220c.isEmpty()) {
            this.f8220c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f8220c.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int size = this.f8219b.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((e9) this.f8219b.get(size)).f8124a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((e9) this.f8219b.get(i11)).f8124a);
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
        Object obj = ((e9) this.f8219b.remove(i10)).f8125b;
        if (!this.f8220c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f8219b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new e9(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Set entrySet() {
        if (this.f8222e == null) {
            this.f8222e = new g9(this);
        }
        return this.f8222e;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return super.equals(obj);
        }
        h9 h9Var = (h9) obj;
        int size = size();
        if (size != h9Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 == h9Var.b()) {
            for (int i10 = 0; i10 < b10; i10++) {
                if (!((Map.Entry) this.f8219b.get(i10)).equals((Map.Entry) h9Var.f8219b.get(i10))) {
                    return false;
                }
            }
            if (b10 == size) {
                return true;
            }
            obj3 = this.f8220c;
            obj2 = h9Var.f8220c;
        } else {
            obj3 = entrySet();
            obj2 = h9Var.entrySet();
        }
        return obj3.equals(obj2);
    }

    public final SortedMap f() {
        g();
        if (this.f8220c.isEmpty() && !(this.f8220c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8220c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f8223f = treeMap.descendingMap();
        }
        return (SortedMap) this.f8220c;
    }

    public final void g() {
        if (this.f8221d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((e9) this.f8219b.get(d10)).f8125b;
        }
        return this.f8220c.get(comparable);
    }

    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += ((e9) this.f8219b.get(i11)).hashCode();
        }
        return this.f8220c.size() > 0 ? this.f8220c.hashCode() + i10 : i10;
    }

    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return e(d10);
        }
        if (this.f8220c.isEmpty()) {
            return null;
        }
        return this.f8220c.remove(comparable);
    }

    public final int size() {
        return this.f8220c.size() + this.f8219b.size();
    }
}
