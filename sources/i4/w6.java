package i4;

import j4.s4;

public final class w6 implements s6 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7762a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7763b;

    public /* synthetic */ w6(s4 s4Var, String str) {
        this.f7762a = s4Var;
        this.f7763b = str;
    }

    public /* synthetic */ w6(byte[] bArr, byte[] bArr2) {
        this.f7762a = xd.a(bArr);
        this.f7763b = xd.a(bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        r3 = r3.query(j4.k4.f8284a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r2}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        if (r3 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r3.moveToFirst() != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r1 != j4.k4.f8293j) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        j4.k4.f8288e.put(r2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        r4 = r3.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r4 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        if (r4.equals((java.lang.Object) null) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        if (r1 != j4.k4.f8293j) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        j4.k4.f8288e.put(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d0, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r12 = this;
            java.lang.Class<j4.k4> r0 = j4.k4.class
            java.lang.Object r1 = r12.f7762a
            j4.s4 r1 = (j4.s4) r1
            java.lang.Object r2 = r12.f7763b
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r1 = r1.f8458a
            android.content.ContentResolver r3 = r1.getContentResolver()
            android.net.Uri r1 = j4.k4.f8284a
            monitor-enter(r0)
            java.util.HashMap r1 = j4.k4.f8288e     // Catch:{ all -> 0x00d4 }
            r9 = 1
            r4 = 0
            r10 = 0
            if (r1 != 0) goto L_0x003c
            java.util.concurrent.atomic.AtomicBoolean r1 = j4.k4.f8287d     // Catch:{ all -> 0x00d4 }
            r1.set(r4)     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00d4 }
            r5 = 16
            r6 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r5, r6)     // Catch:{ all -> 0x00d4 }
            j4.k4.f8288e = r1     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x00d4 }
            r1.<init>()     // Catch:{ all -> 0x00d4 }
            j4.k4.f8293j = r1     // Catch:{ all -> 0x00d4 }
            android.net.Uri r1 = j4.k4.f8284a     // Catch:{ all -> 0x00d4 }
            j4.i4 r5 = new j4.i4     // Catch:{ all -> 0x00d4 }
            r5.<init>()     // Catch:{ all -> 0x00d4 }
            r3.registerContentObserver(r1, r9, r5)     // Catch:{ all -> 0x00d4 }
            goto L_0x0064
        L_0x003c:
            java.util.concurrent.atomic.AtomicBoolean r1 = j4.k4.f8287d     // Catch:{ all -> 0x00d4 }
            boolean r1 = r1.getAndSet(r4)     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x0064
            java.util.HashMap r1 = j4.k4.f8288e     // Catch:{ all -> 0x00d4 }
            r1.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r1 = j4.k4.f8289f     // Catch:{ all -> 0x00d4 }
            r1.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r1 = j4.k4.f8290g     // Catch:{ all -> 0x00d4 }
            r1.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r1 = j4.k4.f8291h     // Catch:{ all -> 0x00d4 }
            r1.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r1 = j4.k4.f8292i     // Catch:{ all -> 0x00d4 }
            r1.clear()     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x00d4 }
            r1.<init>()     // Catch:{ all -> 0x00d4 }
            j4.k4.f8293j = r1     // Catch:{ all -> 0x00d4 }
        L_0x0064:
            java.lang.Object r1 = j4.k4.f8293j     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r5 = j4.k4.f8288e     // Catch:{ all -> 0x00d4 }
            boolean r5 = r5.containsKey(r2)     // Catch:{ all -> 0x00d4 }
            if (r5 == 0) goto L_0x007c
            java.util.HashMap r1 = j4.k4.f8288e     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d4 }
            if (r1 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r10 = r1
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x00cb
        L_0x007c:
            java.lang.String[] r5 = j4.k4.k     // Catch:{ all -> 0x00d4 }
            int r5 = r5.length     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            android.net.Uri r5 = j4.k4.f8284a
            r6 = 0
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r9]
            r8[r4] = r2
            r11 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x0095
            goto L_0x00cb
        L_0x0095:
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x00cf }
            if (r4 != 0) goto L_0x00ad
            monitor-enter(r0)     // Catch:{ all -> 0x00cf }
            java.lang.Object r4 = j4.k4.f8293j     // Catch:{ all -> 0x00aa }
            if (r1 != r4) goto L_0x00a5
            java.util.HashMap r1 = j4.k4.f8288e     // Catch:{ all -> 0x00aa }
            r1.put(r2, r10)     // Catch:{ all -> 0x00aa }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            r3.close()
            goto L_0x00cb
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00ad:
            java.lang.String r4 = r3.getString(r9)     // Catch:{ all -> 0x00cf }
            r3.close()
            if (r4 == 0) goto L_0x00bd
            boolean r3 = r4.equals(r10)
            if (r3 == 0) goto L_0x00bd
            r4 = r10
        L_0x00bd:
            monitor-enter(r0)
            java.lang.Object r3 = j4.k4.f8293j     // Catch:{ all -> 0x00cc }
            if (r1 != r3) goto L_0x00c7
            java.util.HashMap r1 = j4.k4.f8288e     // Catch:{ all -> 0x00cc }
            r1.put(r2, r4)     // Catch:{ all -> 0x00cc }
        L_0x00c7:
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            if (r4 == 0) goto L_0x00cb
            r10 = r4
        L_0x00cb:
            return r10
        L_0x00cc:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            throw r1
        L_0x00cf:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.w6.a():java.lang.Object");
    }

    public final xd zza() {
        return (xd) this.f7762a;
    }

    public final xd zzb() {
        return (xd) this.f7763b;
    }
}
