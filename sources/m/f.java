package m;

import java.util.LinkedHashMap;
import java.util.Locale;

public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f9275a;

    /* renamed from: b  reason: collision with root package name */
    public int f9276b;

    /* renamed from: c  reason: collision with root package name */
    public int f9277c;

    /* renamed from: d  reason: collision with root package name */
    public int f9278d;

    /* renamed from: e  reason: collision with root package name */
    public int f9279e;

    public f(int i10) {
        if (i10 > 0) {
            this.f9277c = i10;
            this.f9275a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = r3.f9275a.put(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r3.f9275a.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r3.f9276b++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        d(r3.f9277c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V b(K r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0047
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.f9275a     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0013
            int r4 = r3.f9278d     // Catch:{ all -> 0x0044 }
            int r4 = r4 + 1
            r3.f9278d = r4     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            return r0
        L_0x0013:
            int r0 = r3.f9279e     // Catch:{ all -> 0x0044 }
            int r0 = r0 + 1
            r3.f9279e = r0     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r3.a(r4)
            if (r0 != 0) goto L_0x0022
            r4 = 0
            return r4
        L_0x0022:
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r1 = r3.f9275a     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.put(r4, r0)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0031
            java.util.LinkedHashMap<K, V> r2 = r3.f9275a     // Catch:{ all -> 0x0041 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0037
        L_0x0031:
            int r4 = r3.f9276b     // Catch:{ all -> 0x0041 }
            int r4 = r4 + 1
            r3.f9276b = r4     // Catch:{ all -> 0x0041 }
        L_0x0037:
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003b
            return r1
        L_0x003b:
            int r4 = r3.f9277c
            r3.d(r4)
            return r0
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            throw r4
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            throw r4
        L_0x0047:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.b(java.lang.Object):java.lang.Object");
    }

    public final V c(K k, V v10) {
        V put;
        if (k != null) {
            synchronized (this) {
                this.f9276b++;
                put = this.f9275a.put(k, v10);
                if (put != null) {
                    this.f9276b--;
                }
            }
            d(this.f9277c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f9276b     // Catch:{ all -> 0x0063 }
            if (r0 < 0) goto L_0x0044
            java.util.LinkedHashMap<K, V> r0 = r2.f9275a     // Catch:{ all -> 0x0063 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f9276b     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x0044
        L_0x0011:
            int r0 = r2.f9276b     // Catch:{ all -> 0x0063 }
            if (r0 <= r3) goto L_0x0042
            java.util.LinkedHashMap<K, V> r0 = r2.f9275a     // Catch:{ all -> 0x0063 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0042
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r2.f9275a     // Catch:{ all -> 0x0063 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0063 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0063 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0063 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0063 }
            r0.getValue()     // Catch:{ all -> 0x0063 }
            java.util.LinkedHashMap<K, V> r0 = r2.f9275a     // Catch:{ all -> 0x0063 }
            r0.remove(r1)     // Catch:{ all -> 0x0063 }
            int r0 = r2.f9276b     // Catch:{ all -> 0x0063 }
            int r0 = r0 + -1
            r2.f9276b = r0     // Catch:{ all -> 0x0063 }
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0000
        L_0x0042:
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            return
        L_0x0044:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0063 }
            r0.append(r1)     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0063 }
            r3.<init>(r0)     // Catch:{ all -> 0x0063 }
            throw r3     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.d(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f9278d;
        i11 = this.f9279e + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f9277c), Integer.valueOf(this.f9278d), Integer.valueOf(this.f9279e), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0)});
    }
}
