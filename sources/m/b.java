package m;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m.g;

public class b<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    public a f9258h;

    public b() {
    }

    public b(int i10) {
        super(i10);
    }

    public b(b bVar) {
        if (bVar != null) {
            i(bVar);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f9258h == null) {
            this.f9258h = new a(this);
        }
        a aVar = this.f9258h;
        if (aVar.f9280a == null) {
            aVar.f9280a = new g.b();
        }
        return aVar.f9280a;
    }

    public final Set<K> keySet() {
        if (this.f9258h == null) {
            this.f9258h = new a(this);
        }
        a aVar = this.f9258h;
        if (aVar.f9281b == null) {
            aVar.f9281b = new g.c();
        }
        return aVar.f9281b;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f9301c);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final Collection<V> values() {
        if (this.f9258h == null) {
            this.f9258h = new a(this);
        }
        a aVar = this.f9258h;
        if (aVar.f9282c == null) {
            aVar.f9282c = new g.e();
        }
        return aVar.f9282c;
    }
}
