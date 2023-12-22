package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f7987a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f7988b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f7989c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f7990d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f7994d;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f7993c;
        }
    }

    /* renamed from: j.b$b  reason: collision with other inner class name */
    public static class C0102b<K, V> extends e<K, V> {
        public C0102b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f7993c;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f7994d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f7991a;

        /* renamed from: b  reason: collision with root package name */
        public final V f7992b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f7993c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f7994d;

        public c(K k, V v10) {
            this.f7991a = k;
            this.f7992b = v10;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f7991a.equals(cVar.f7991a) && this.f7992b.equals(cVar.f7992b);
        }

        public final K getKey() {
            return this.f7991a;
        }

        public final V getValue() {
            return this.f7992b;
        }

        public final int hashCode() {
            return this.f7991a.hashCode() ^ this.f7992b.hashCode();
        }

        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f7991a + "=" + this.f7992b;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f7995a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7996b = true;

        public d() {
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f7995a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f7994d;
                this.f7995a = cVar3;
                this.f7996b = cVar3 == null;
            }
        }

        public final boolean hasNext() {
            if (this.f7996b) {
                return b.this.f7987a != null;
            }
            c<K, V> cVar = this.f7995a;
            return (cVar == null || cVar.f7993c == null) ? false : true;
        }

        public final Object next() {
            c<K, V> cVar;
            if (this.f7996b) {
                this.f7996b = false;
                cVar = b.this.f7987a;
            } else {
                c<K, V> cVar2 = this.f7995a;
                cVar = cVar2 != null ? cVar2.f7993c : null;
            }
            this.f7995a = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f7998a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f7999b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f7998a = cVar2;
            this.f7999b = cVar;
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f7998a == cVar && cVar == this.f7999b) {
                this.f7999b = null;
                this.f7998a = null;
            }
            c<K, V> cVar3 = this.f7998a;
            if (cVar3 == cVar) {
                this.f7998a = b(cVar3);
            }
            c<K, V> cVar4 = this.f7999b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f7998a;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f7999b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public final boolean hasNext() {
            return this.f7999b != null;
        }

        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f7999b;
            c<K, V> cVar3 = this.f7998a;
            if (cVar2 == cVar3 || cVar3 == null) {
                cVar = null;
            } else {
                cVar = c(cVar2);
            }
            this.f7999b = cVar;
            return cVar2;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f7987a;
        while (cVar != null && !cVar.f7991a.equals(k)) {
            cVar = cVar.f7993c;
        }
        return cVar;
    }

    public V d(K k) {
        c a10 = a(k);
        if (a10 == null) {
            return null;
        }
        this.f7990d--;
        if (!this.f7989c.isEmpty()) {
            for (f<K, V> a11 : this.f7989c.keySet()) {
                a11.a(a10);
            }
        }
        c<K, V> cVar = a10.f7994d;
        c<K, V> cVar2 = a10.f7993c;
        if (cVar != null) {
            cVar.f7993c = cVar2;
        } else {
            this.f7987a = cVar2;
        }
        c<K, V> cVar3 = a10.f7993c;
        if (cVar3 != null) {
            cVar3.f7994d = cVar;
        } else {
            this.f7988b = cVar;
        }
        a10.f7993c = null;
        a10.f7994d = null;
        return a10.f7992b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((j.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof j.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            j.b r7 = (j.b) r7
            int r1 = r6.f7990d
            int r3 = r7.f7990d
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            j.b$e r3 = (j.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            j.b$e r4 = (j.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            j.b$e r7 = (j.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f7987a, this.f7988b);
        this.f7989c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                g10.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    g10.append(", ");
                }
            } else {
                g10.append("]");
                return g10.toString();
            }
        }
    }
}
