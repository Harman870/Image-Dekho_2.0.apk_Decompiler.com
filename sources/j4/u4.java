package j4;

public final class u4 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile i5 f8489a = h5.f8214a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f8490b = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r0, r5)
            return r1
        L_0x001d:
            j4.i5 r6 = f8489a
            boolean r6 = r6.b()
            if (r6 == 0) goto L_0x0026
            goto L_0x0088
        L_0x0026:
            java.lang.Object r6 = f8490b
            monitor-enter(r6)
            j4.i5 r0 = f8489a     // Catch:{ all -> 0x0095 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x003f
            j4.i5 r5 = f8489a     // Catch:{ all -> 0x0095 }
            java.lang.Object r5 = r5.a()     // Catch:{ all -> 0x0095 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0095 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0095 }
            monitor-exit(r6)     // Catch:{ all -> 0x0095 }
            return r5
        L_0x003f:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0095 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0095 }
            if (r0 != 0) goto L_0x006b
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0095 }
            r4 = 29
            if (r3 >= r4) goto L_0x0059
            r3 = r1
            goto L_0x005b
        L_0x0059:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x005b:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x007c
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x0095 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x007c
        L_0x006b:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x007c }
            int r5 = r5.flags     // Catch:{ all -> 0x0095 }
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x007c
            r1 = 1
        L_0x007c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0095 }
            j4.k5 r0 = new j4.k5     // Catch:{ all -> 0x0095 }
            r0.<init>(r5)     // Catch:{ all -> 0x0095 }
            f8489a = r0     // Catch:{ all -> 0x0095 }
            monitor-exit(r6)     // Catch:{ all -> 0x0095 }
        L_0x0088:
            j4.i5 r5 = f8489a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0095:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0095 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.u4.a(android.content.Context, android.net.Uri):boolean");
    }
}
