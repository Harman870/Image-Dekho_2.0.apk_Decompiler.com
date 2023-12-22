package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f9280a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f9281b;

    /* renamed from: c  reason: collision with root package name */
    public g<K, V>.e f9282c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f9283a;

        /* renamed from: b  reason: collision with root package name */
        public int f9284b;

        /* renamed from: c  reason: collision with root package name */
        public int f9285c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9286d = false;

        public a(int i10) {
            this.f9283a = i10;
            this.f9284b = g.this.d();
        }

        public final boolean hasNext() {
            return this.f9285c < this.f9284b;
        }

        public final T next() {
            if (hasNext()) {
                T b10 = g.this.b(this.f9285c, this.f9283a);
                this.f9285c++;
                this.f9286d = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f9286d) {
                int i10 = this.f9285c - 1;
                this.f9285c = i10;
                this.f9284b--;
                this.f9286d = false;
                g.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = g.this.d();
            for (Map.Entry entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != g.this.d();
        }

        public final void clear() {
            g.this.a();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = g.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            Object b10 = g.this.b(e10, 1);
            Object value = entry.getValue();
            return b10 == value || (b10 != null && b10.equals(value));
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public final int hashCode() {
            int i10 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                Object b11 = g.this.b(d10, 1);
                i10 += (b10 == null ? 0 : b10.hashCode()) ^ (b11 == null ? 0 : b11.hashCode());
            }
            return i10;
        }

        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return g.this.d();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            g.this.a();
        }

        public final boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map c10 = g.this.c();
            for (Object containsKey : collection) {
                if (!c10.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public final int hashCode() {
            int i10 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                i10 += b10 == null ? 0 : b10.hashCode();
            }
            return i10;
        }

        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        public final Iterator<K> iterator() {
            return new a(0);
        }

        public final boolean remove(Object obj) {
            int e10 = g.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            g.this.h(e10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map c10 = g.this.c();
            int size = c10.size();
            for (Object remove : collection) {
                c10.remove(remove);
            }
            return size != c10.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return g.k(collection, g.this.c());
        }

        public final int size() {
            return g.this.d();
        }

        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = gVar.b(i10, 0);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return g.this.l(0, tArr);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public int f9290a;

        /* renamed from: b  reason: collision with root package name */
        public int f9291b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9292c = false;

        public d() {
            this.f9290a = g.this.d() - 1;
            this.f9291b = -1;
        }

        public final boolean equals(Object obj) {
            boolean z9;
            boolean z10;
            if (!this.f9292c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object b10 = g.this.b(this.f9291b, 0);
                if (key == b10 || (key != null && key.equals(b10))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    return false;
                }
                Object value = entry.getValue();
                Object b11 = g.this.b(this.f9291b, 1);
                if (value == b11 || (value != null && value.equals(b11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                return false;
            }
        }

        public final K getKey() {
            if (this.f9292c) {
                return g.this.b(this.f9291b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f9292c) {
                return g.this.b(this.f9291b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f9291b < this.f9290a;
        }

        public final int hashCode() {
            if (this.f9292c) {
                int i10 = 0;
                Object b10 = g.this.b(this.f9291b, 0);
                Object b11 = g.this.b(this.f9291b, 1);
                int hashCode = b10 == null ? 0 : b10.hashCode();
                if (b11 != null) {
                    i10 = b11.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f9291b++;
                this.f9292c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f9292c) {
                g.this.h(this.f9291b);
                this.f9291b--;
                this.f9290a--;
                this.f9292c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v10) {
            if (this.f9292c) {
                return g.this.i(this.f9291b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            g.this.a();
        }

        public final boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        public final Iterator<V> iterator() {
            return new a(1);
        }

        public final boolean remove(Object obj) {
            int f10 = g.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            g.this.h(f10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z9 = false;
            while (i10 < d10) {
                if (collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z9 = true;
                }
                i10++;
            }
            return z9;
        }

        public final boolean retainAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z9 = false;
            while (i10 < d10) {
                if (!collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z9 = true;
                }
                i10++;
            }
            return z9;
        }

        public final int size() {
            return g.this.d();
        }

        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = gVar.b(i10, 1);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return g.this.l(1, tArr);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean k(Collection collection, Map map) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v10);

    public abstract void h(int i10);

    public abstract V i(int i10, V v10);

    public final Object[] l(int i10, Object[] objArr) {
        int d10 = d();
        if (objArr.length < d10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        if (objArr.length > d10) {
            objArr[d10] = null;
        }
        return objArr;
    }
}
