package s1;

import java.io.File;
import m1.a;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final j f11832a;

    /* renamed from: b  reason: collision with root package name */
    public final File f11833b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11834c;

    /* renamed from: d  reason: collision with root package name */
    public final b f11835d = new b();

    /* renamed from: e  reason: collision with root package name */
    public a f11836e;

    @Deprecated
    public d(File file, long j10) {
        this.f11833b = file;
        this.f11834c = j10;
        this.f11832a = new j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File a(o1.f r6) {
        /*
            r5 = this;
            s1.j r0 = r5.f11832a
            java.lang.String r0 = r0.a(r6)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x002b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Get: Obtained: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " for for Key: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.v(r1, r6)
        L_0x002b:
            r6 = 0
            monitor-enter(r5)     // Catch:{ IOException -> 0x004a }
            m1.a r2 = r5.f11836e     // Catch:{ all -> 0x004c }
            if (r2 != 0) goto L_0x003b
            java.io.File r2 = r5.f11833b     // Catch:{ all -> 0x004c }
            long r3 = r5.f11834c     // Catch:{ all -> 0x004c }
            m1.a r2 = m1.a.v(r2, r3)     // Catch:{ all -> 0x004c }
            r5.f11836e = r2     // Catch:{ all -> 0x004c }
        L_0x003b:
            m1.a r2 = r5.f11836e     // Catch:{ all -> 0x004c }
            monitor-exit(r5)     // Catch:{ IOException -> 0x004a }
            m1.a$e r0 = r2.t(r0)     // Catch:{ IOException -> 0x004a }
            if (r0 == 0) goto L_0x005b
            r2 = 0
            java.io.File[] r0 = r0.f9345a     // Catch:{ IOException -> 0x004a }
            r6 = r0[r2]     // Catch:{ IOException -> 0x004a }
            goto L_0x005b
        L_0x004a:
            r0 = move-exception
            goto L_0x004f
        L_0x004c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x004a }
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x004f:
            r2 = 5
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x005b
            java.lang.String r2 = "Unable to get from disk cache"
            android.util.Log.w(r1, r2, r0)
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.d.a(o1.f):java.io.File");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(o1.f r6, q1.g r7) {
        /*
            r5 = this;
            s1.j r0 = r5.f11832a
            java.lang.String r0 = r0.a(r6)
            s1.b r1 = r5.f11835d
            monitor-enter(r1)
            java.util.HashMap r2 = r1.f11825a     // Catch:{ all -> 0x00e4 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00e4 }
            s1.b$a r2 = (s1.b.a) r2     // Catch:{ all -> 0x00e4 }
            if (r2 != 0) goto L_0x0031
            s1.b$b r2 = r1.f11826b     // Catch:{ all -> 0x00e4 }
            java.util.ArrayDeque r3 = r2.f11829a     // Catch:{ all -> 0x00e4 }
            monitor-enter(r3)     // Catch:{ all -> 0x00e4 }
            java.util.ArrayDeque r2 = r2.f11829a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            s1.b$a r2 = (s1.b.a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            s1.b$a r2 = new s1.b$a     // Catch:{ all -> 0x00e4 }
            r2.<init>()     // Catch:{ all -> 0x00e4 }
        L_0x0028:
            java.util.HashMap r3 = r1.f11825a     // Catch:{ all -> 0x00e4 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00e4 }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00e4 }
        L_0x0031:
            int r3 = r2.f11828b     // Catch:{ all -> 0x00e4 }
            r4 = 1
            int r3 = r3 + r4
            r2.f11828b = r3     // Catch:{ all -> 0x00e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            java.util.concurrent.locks.ReentrantLock r1 = r2.f11827a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r2.<init>()     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch:{ all -> 0x00dd }
            r2.append(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch:{ all -> 0x00dd }
            r2.append(r6)     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00dd }
            android.util.Log.v(r1, r6)     // Catch:{ all -> 0x00dd }
        L_0x0064:
            monitor-enter(r5)     // Catch:{ IOException -> 0x00a7 }
            m1.a r6 = r5.f11836e     // Catch:{ all -> 0x00c9 }
            if (r6 != 0) goto L_0x0073
            java.io.File r6 = r5.f11833b     // Catch:{ all -> 0x00c9 }
            long r1 = r5.f11834c     // Catch:{ all -> 0x00c9 }
            m1.a r6 = m1.a.v(r6, r1)     // Catch:{ all -> 0x00c9 }
            r5.f11836e = r6     // Catch:{ all -> 0x00c9 }
        L_0x0073:
            m1.a r6 = r5.f11836e     // Catch:{ all -> 0x00c9 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x00a7 }
            m1.a$e r1 = r6.t(r0)     // Catch:{ IOException -> 0x00a7 }
            if (r1 == 0) goto L_0x0082
        L_0x007c:
            s1.b r6 = r5.f11835d
            r6.a(r0)
            return
        L_0x0082:
            m1.a$c r6 = r6.o(r0)     // Catch:{ IOException -> 0x00a7 }
            if (r6 == 0) goto L_0x00b2
            java.io.File r1 = r6.b()     // Catch:{ all -> 0x00a9 }
            o1.d<DataType> r2 = r7.f11000a     // Catch:{ all -> 0x00a9 }
            DataType r3 = r7.f11001b     // Catch:{ all -> 0x00a9 }
            o1.h r7 = r7.f11002c     // Catch:{ all -> 0x00a9 }
            boolean r7 = r2.d(r3, r1, r7)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x009f
            m1.a r7 = m1.a.this     // Catch:{ all -> 0x00a9 }
            m1.a.a(r7, r6, r4)     // Catch:{ all -> 0x00a9 }
            r6.f9336c = r4     // Catch:{ all -> 0x00a9 }
        L_0x009f:
            boolean r7 = r6.f9336c     // Catch:{ IOException -> 0x00a7 }
            if (r7 != 0) goto L_0x007c
            r6.a()     // Catch:{ IOException -> 0x007c }
            goto L_0x007c
        L_0x00a7:
            r6 = move-exception
            goto L_0x00cc
        L_0x00a9:
            r7 = move-exception
            boolean r1 = r6.f9336c     // Catch:{ IOException -> 0x00a7 }
            if (r1 != 0) goto L_0x00b1
            r6.a()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            throw r7     // Catch:{ IOException -> 0x00a7 }
        L_0x00b2:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a7 }
            r7.<init>()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x00a7 }
            r7.append(r0)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00a7 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00a7 }
            throw r6     // Catch:{ IOException -> 0x00a7 }
        L_0x00c9:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x00a7 }
            throw r6     // Catch:{ IOException -> 0x00a7 }
        L_0x00cc:
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x00dd }
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch:{ all -> 0x00dd }
            goto L_0x007c
        L_0x00dd:
            r6 = move-exception
            s1.b r7 = r5.f11835d
            r7.a(r0)
            throw r6
        L_0x00e4:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.d.b(o1.f, q1.g):void");
    }
}
