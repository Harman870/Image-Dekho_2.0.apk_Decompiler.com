package r1;

import android.util.Log;
import androidx.activity.f;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final g<a, Object> f11466a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f11467b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f11468c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f11469d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f11470e;

    /* renamed from: f  reason: collision with root package name */
    public int f11471f;

    public static final class a implements l {

        /* renamed from: a  reason: collision with root package name */
        public final b f11472a;

        /* renamed from: b  reason: collision with root package name */
        public int f11473b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f11474c;

        public a(b bVar) {
            this.f11472a = bVar;
        }

        public final void a() {
            this.f11472a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11473b == aVar.f11473b && this.f11474c == aVar.f11474c;
        }

        public final int hashCode() {
            int i10 = this.f11473b * 31;
            Class<?> cls = this.f11474c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder g10 = f.g("Key{size=");
            g10.append(this.f11473b);
            g10.append("array=");
            g10.append(this.f11474c);
            g10.append('}');
            return g10.toString();
        }
    }

    public static final class b extends c<a> {
        public final l a() {
            return new a(this);
        }
    }

    public i(int i10) {
        this.f11470e = i10;
    }

    public final synchronized void a(int i10) {
        if (i10 >= 40) {
            try {
                b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i10 >= 20 || i10 == 15) {
            f(this.f11470e / 2);
        }
    }

    public final synchronized void b() {
        f(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T c(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.i(r7)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0053 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f11471f     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f11470e     // Catch:{ all -> 0x0053 }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x0053 }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0040
            r1.i$b r6 = r5.f11467b     // Catch:{ all -> 0x0053 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0053 }
            r1.l r6 = r6.b()     // Catch:{ all -> 0x0053 }
            r1.i$a r6 = (r1.i.a) r6     // Catch:{ all -> 0x0053 }
            r6.f11473b = r0     // Catch:{ all -> 0x0053 }
            r6.f11474c = r7     // Catch:{ all -> 0x0053 }
            goto L_0x004d
        L_0x0040:
            r1.i$b r0 = r5.f11467b     // Catch:{ all -> 0x0053 }
            r1.l r0 = r0.b()     // Catch:{ all -> 0x0053 }
            r1.i$a r0 = (r1.i.a) r0     // Catch:{ all -> 0x0053 }
            r0.f11473b = r6     // Catch:{ all -> 0x0053 }
            r0.f11474c = r7     // Catch:{ all -> 0x0053 }
            r6 = r0
        L_0x004d:
            java.lang.Object r6 = r5.h(r6, r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return r6
        L_0x0053:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.i.c(int, java.lang.Class):java.lang.Object");
    }

    public final synchronized Object d() {
        Object h10;
        Class cls = byte[].class;
        synchronized (this) {
            a aVar = (a) this.f11467b.b();
            aVar.f11473b = 8;
            aVar.f11474c = cls;
            h10 = h(aVar, cls);
        }
        return h10;
    }

    public final void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(i10));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i10);
            if (intValue == 1) {
                i11.remove(valueOf);
            } else {
                i11.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
    }

    public final void f(int i10) {
        while (this.f11471f > i10) {
            Object c10 = this.f11466a.c();
            y3.a.h(c10);
            a<?> g10 = g(c10.getClass());
            this.f11471f -= g10.c() * g10.b(c10);
            e(g10.b(c10), c10.getClass());
            if (Log.isLoggable(g10.a(), 2)) {
                String a10 = g10.a();
                StringBuilder g11 = f.g("evicted: ");
                g11.append(g10.b(c10));
                Log.v(a10, g11.toString());
            }
        }
    }

    public final <T> a<T> g(Class<T> cls) {
        a<T> aVar = (a) this.f11469d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                StringBuilder g10 = f.g("No array pool found for: ");
                g10.append(cls.getSimpleName());
                throw new IllegalArgumentException(g10.toString());
            }
            this.f11469d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        a<T> g10 = g(cls);
        T a10 = this.f11466a.a(aVar);
        if (a10 != null) {
            this.f11471f -= g10.c() * g10.b(a10);
            e(g10.b(a10), cls);
        }
        if (a10 != null) {
            return a10;
        }
        if (Log.isLoggable(g10.a(), 2)) {
            String a11 = g10.a();
            StringBuilder g11 = f.g("Allocated ");
            g11.append(aVar.f11473b);
            g11.append(" bytes");
            Log.v(a11, g11.toString());
        }
        return g10.newArray(aVar.f11473b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f11468c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11468c.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void put(T t10) {
        boolean z9;
        Class<?> cls = t10.getClass();
        a<?> g10 = g(cls);
        int b10 = g10.b(t10);
        int c10 = g10.c() * b10;
        int i10 = 1;
        if (c10 <= this.f11470e / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            a aVar = (a) this.f11467b.b();
            aVar.f11473b = b10;
            aVar.f11474c = cls;
            this.f11466a.b(aVar, t10);
            NavigableMap<Integer, Integer> i11 = i(cls);
            Integer num = i11.get(Integer.valueOf(aVar.f11473b));
            Integer valueOf = Integer.valueOf(aVar.f11473b);
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            i11.put(valueOf, Integer.valueOf(i10));
            this.f11471f += c10;
            f(this.f11470e);
        }
    }
}
