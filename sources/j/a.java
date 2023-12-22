package j;

import j.b;
import java.util.HashMap;

public final class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f7986e = new HashMap<>();

    public final b.c<K, V> a(K k) {
        return this.f7986e.get(k);
    }

    public final V d(K k) {
        V d10 = super.d(k);
        this.f7986e.remove(k);
        return d10;
    }

    public final V g(K k, V v10) {
        b.c a10 = a(k);
        if (a10 != null) {
            return a10.f7992b;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f7986e;
        b.c<K, V> cVar = new b.c<>(k, v10);
        this.f7990d++;
        b.c<K, V> cVar2 = this.f7988b;
        if (cVar2 == null) {
            this.f7987a = cVar;
        } else {
            cVar2.f7993c = cVar;
            cVar.f7994d = cVar2;
        }
        this.f7988b = cVar;
        hashMap.put(k, cVar);
        return null;
    }
}
