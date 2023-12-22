package g7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f6612h = new a();

    /* renamed from: a  reason: collision with root package name */
    public Comparator<? super K> f6613a;

    /* renamed from: b  reason: collision with root package name */
    public e<K, V> f6614b;

    /* renamed from: c  reason: collision with root package name */
    public int f6615c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f6616d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final e<K, V> f6617e = new e<>();

    /* renamed from: f  reason: collision with root package name */
    public l<K, V>.b f6618f;

    /* renamed from: g  reason: collision with root package name */
    public l<K, V>.c f6619g;

    public static class a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends l<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        public final void clear() {
            l.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && l.this.b((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public final boolean remove(Object obj) {
            e b10;
            if (!(obj instanceof Map.Entry) || (b10 = l.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            l.this.d(b10, true);
            return true;
        }

        public final int size() {
            return l.this.f6615c;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends l<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            public final K next() {
                return a().f6631f;
            }
        }

        public c() {
        }

        public final void clear() {
            l.this.clear();
        }

        public final boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new a(this);
        }

        public final boolean remove(Object obj) {
            l lVar = l.this;
            lVar.getClass();
            e eVar = null;
            if (obj != null) {
                try {
                    eVar = lVar.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                lVar.d(eVar, true);
            }
            if (eVar != null) {
                return true;
            }
            return false;
        }

        public final int size() {
            return l.this.f6615c;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f6622a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f6623b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f6624c;

        public d() {
            this.f6622a = l.this.f6617e.f6629d;
            this.f6624c = l.this.f6616d;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f6622a;
            l lVar = l.this;
            if (eVar == lVar.f6617e) {
                throw new NoSuchElementException();
            } else if (lVar.f6616d == this.f6624c) {
                this.f6622a = eVar.f6629d;
                this.f6623b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f6622a != l.this.f6617e;
        }

        public final void remove() {
            e<K, V> eVar = this.f6623b;
            if (eVar != null) {
                l.this.d(eVar, true);
                this.f6623b = null;
                this.f6624c = l.this.f6616d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f6626a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f6627b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f6628c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f6629d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f6630e;

        /* renamed from: f  reason: collision with root package name */
        public final K f6631f;

        /* renamed from: g  reason: collision with root package name */
        public V f6632g;

        /* renamed from: h  reason: collision with root package name */
        public int f6633h;

        public e() {
            this.f6631f = null;
            this.f6630e = this;
            this.f6629d = this;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f6626a = eVar;
            this.f6631f = k;
            this.f6633h = 1;
            this.f6629d = eVar2;
            this.f6630e = eVar3;
            eVar3.f6629d = this;
            eVar2.f6630e = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f6631f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f6632g
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g7.l.e.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f6631f;
        }

        public final V getValue() {
            return this.f6632g;
        }

        public final int hashCode() {
            K k = this.f6631f;
            int i10 = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v10 = this.f6632g;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public final V setValue(V v10) {
            V v11 = this.f6632g;
            this.f6632g = v10;
            return v11;
        }

        public final String toString() {
            return this.f6631f + "=" + this.f6632g;
        }
    }

    static {
        Class<l> cls = l.class;
    }

    public l() {
        a aVar = f6612h;
        this.f6613a = aVar;
    }

    public final e<K, V> a(K k, boolean z9) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f6613a;
        e<K, V> eVar2 = this.f6614b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f6612h ? (Comparable) k : null;
            while (true) {
                K k10 = eVar2.f6631f;
                i10 = comparable != null ? comparable.compareTo(k10) : comparator.compare(k, k10);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f6627b : eVar2.f6628c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z9) {
            return null;
        }
        e<K, V> eVar4 = this.f6617e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f6630e);
            if (i10 < 0) {
                eVar2.f6627b = eVar;
            } else {
                eVar2.f6628c = eVar;
            }
            c(eVar2, true);
        } else if (comparator != f6612h || (k instanceof Comparable)) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f6630e);
            this.f6614b = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f6615c++;
        this.f6616d++;
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g7.l.e<K, V> b(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            g7.l$e r0 = r5.a(r0, r1)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r3 = 1
            if (r0 == 0) goto L_0x0028
            V r4 = r0.f6632g
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L_0x0024
            if (r4 == 0) goto L_0x0022
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = r1
            goto L_0x0025
        L_0x0024:
            r6 = r3
        L_0x0025:
            if (r6 == 0) goto L_0x0028
            r1 = r3
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            r2 = r0
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.l.b(java.util.Map$Entry):g7.l$e");
    }

    public final void c(e<K, V> eVar, boolean z9) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f6627b;
            e<K, V> eVar3 = eVar.f6628c;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f6633h : 0;
            int i12 = eVar3 != null ? eVar3.f6633h : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f6627b;
                e<K, V> eVar5 = eVar3.f6628c;
                int i14 = eVar5 != null ? eVar5.f6633h : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f6633h;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z9)) {
                    g(eVar3);
                }
                f(eVar);
                if (z9) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f6627b;
                e<K, V> eVar7 = eVar2.f6628c;
                int i16 = eVar7 != null ? eVar7.f6633h : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f6633h;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z9)) {
                    f(eVar2);
                }
                g(eVar);
                if (z9) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f6633h = i11 + 1;
                if (z9) {
                    return;
                }
            } else {
                eVar.f6633h = Math.max(i11, i12) + 1;
                if (!z9) {
                    return;
                }
            }
            eVar = eVar.f6626a;
        }
    }

    public final void clear() {
        this.f6614b = null;
        this.f6615c = 0;
        this.f6616d++;
        e<K, V> eVar = this.f6617e;
        eVar.f6630e = eVar;
        eVar.f6629d = eVar;
    }

    public final boolean containsKey(Object obj) {
        e eVar = null;
        if (obj != null) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVar != null;
    }

    public final void d(e<K, V> eVar, boolean z9) {
        e<K, V> eVar2;
        int i10;
        e<K, V> eVar3;
        if (z9) {
            e<K, V> eVar4 = eVar.f6630e;
            eVar4.f6629d = eVar.f6629d;
            eVar.f6629d.f6630e = eVar4;
        }
        e<K, V> eVar5 = eVar.f6627b;
        e<K, V> eVar6 = eVar.f6628c;
        e<K, V> eVar7 = eVar.f6626a;
        int i11 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                e(eVar, eVar5);
                eVar.f6627b = null;
            } else if (eVar6 != null) {
                e(eVar, eVar6);
                eVar.f6628c = null;
            } else {
                e(eVar, (e<K, V>) null);
            }
            c(eVar7, false);
            this.f6615c--;
            this.f6616d++;
            return;
        }
        if (eVar5.f6633h > eVar6.f6633h) {
            do {
                eVar2 = eVar5;
                eVar5 = eVar5.f6628c;
            } while (eVar5 != null);
        } else {
            do {
                e<K, V> eVar8 = eVar6;
                eVar6 = eVar6.f6627b;
                eVar3 = eVar8;
            } while (eVar6 != null);
            eVar2 = eVar3;
        }
        d(eVar2, false);
        e<K, V> eVar9 = eVar.f6627b;
        if (eVar9 != null) {
            i10 = eVar9.f6633h;
            eVar2.f6627b = eVar9;
            eVar9.f6626a = eVar2;
            eVar.f6627b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar10 = eVar.f6628c;
        if (eVar10 != null) {
            i11 = eVar10.f6633h;
            eVar2.f6628c = eVar10;
            eVar10.f6626a = eVar2;
            eVar.f6628c = null;
        }
        eVar2.f6633h = Math.max(i10, i11) + 1;
        e(eVar, eVar2);
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f6626a;
        eVar.f6626a = null;
        if (eVar2 != null) {
            eVar2.f6626a = eVar3;
        }
        if (eVar3 == null) {
            this.f6614b = eVar2;
        } else if (eVar3.f6627b == eVar) {
            eVar3.f6627b = eVar2;
        } else {
            eVar3.f6628c = eVar2;
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        l<K, V>.b bVar = this.f6618f;
        if (bVar != null) {
            return bVar;
        }
        l<K, V>.b bVar2 = new b();
        this.f6618f = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6627b;
        e<K, V> eVar3 = eVar.f6628c;
        e<K, V> eVar4 = eVar3.f6627b;
        e<K, V> eVar5 = eVar3.f6628c;
        eVar.f6628c = eVar4;
        if (eVar4 != null) {
            eVar4.f6626a = eVar;
        }
        e(eVar, eVar3);
        eVar3.f6627b = eVar;
        eVar.f6626a = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f6633h : 0, eVar4 != null ? eVar4.f6633h : 0) + 1;
        eVar.f6633h = max;
        if (eVar5 != null) {
            i10 = eVar5.f6633h;
        }
        eVar3.f6633h = Math.max(max, i10) + 1;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6627b;
        e<K, V> eVar3 = eVar.f6628c;
        e<K, V> eVar4 = eVar2.f6627b;
        e<K, V> eVar5 = eVar2.f6628c;
        eVar.f6627b = eVar5;
        if (eVar5 != null) {
            eVar5.f6626a = eVar;
        }
        e(eVar, eVar2);
        eVar2.f6628c = eVar;
        eVar.f6626a = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f6633h : 0, eVar5 != null ? eVar5.f6633h : 0) + 1;
        eVar.f6633h = max;
        if (eVar4 != null) {
            i10 = eVar4.f6633h;
        }
        eVar2.f6633h = Math.max(max, i10) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            g7.l$e r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            V r0 = r3.f6632g
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.l.get(java.lang.Object):java.lang.Object");
    }

    public final Set<K> keySet() {
        l<K, V>.c cVar = this.f6619g;
        if (cVar != null) {
            return cVar;
        }
        l<K, V>.c cVar2 = new c();
        this.f6619g = cVar2;
        return cVar2;
    }

    public final V put(K k, V v10) {
        if (k != null) {
            e a10 = a(k, true);
            V v11 = a10.f6632g;
            a10.f6632g = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            g7.l$e r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.d(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            V r0 = r3.f6632g
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.l.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f6615c;
    }
}
