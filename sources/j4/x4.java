package j4;

import android.content.Context;

public final /* synthetic */ class x4 implements m5 {

    /* renamed from: a  reason: collision with root package name */
    public Context f8550a;

    public /* synthetic */ x4() {
    }

    public /* synthetic */ x4(Context context) {
        this.f8550a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0155 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[Catch:{ RuntimeException -> 0x0060, all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015d A[Catch:{ RuntimeException -> 0x0060, all -> 0x0166 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f8550a
            java.lang.Object r1 = j4.f5.f8137f
            java.lang.Class<j4.t4> r1 = j4.t4.class
            monitor-enter(r1)
            j4.i5 r2 = j4.t4.f8471a     // Catch:{ all -> 0x016d }
            if (r2 != 0) goto L_0x016b
            java.lang.String r2 = android.os.Build.TYPE     // Catch:{ all -> 0x016d }
            java.lang.String r3 = android.os.Build.TAGS     // Catch:{ all -> 0x016d }
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)     // Catch:{ all -> 0x016d }
            if (r4 != 0) goto L_0x001f
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x016d }
            if (r2 == 0) goto L_0x0030
        L_0x001f:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x016d }
            if (r2 != 0) goto L_0x0035
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x016d }
            if (r2 == 0) goto L_0x0030
            goto L_0x0035
        L_0x0030:
            j4.h5 r0 = j4.h5.f8214a     // Catch:{ all -> 0x016d }
            r2 = r0
            goto L_0x0163
        L_0x0035:
            boolean r2 = r0.isDeviceProtectedStorage()     // Catch:{ all -> 0x016d }
            if (r2 != 0) goto L_0x003f
            android.content.Context r0 = r0.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x016d }
        L_0x003f:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x016d }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0166 }
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ RuntimeException -> 0x0060 }
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r5 = r0.getDir(r5, r3)     // Catch:{ RuntimeException -> 0x0060 }
            java.lang.String r6 = "overrides.txt"
            r4.<init>(r5, r6)     // Catch:{ RuntimeException -> 0x0060 }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x0166 }
            if (r5 == 0) goto L_0x0068
            j4.k5 r5 = new j4.k5     // Catch:{ all -> 0x0166 }
            r5.<init>(r4)     // Catch:{ all -> 0x0166 }
            goto L_0x006a
        L_0x0060:
            r4 = move-exception
            java.lang.String r5 = "HermeticFileOverrides"
            java.lang.String r6 = "no data dir"
            android.util.Log.e(r5, r6, r4)     // Catch:{ all -> 0x0166 }
        L_0x0068:
            j4.h5 r5 = j4.h5.f8214a     // Catch:{ all -> 0x0166 }
        L_0x006a:
            boolean r4 = r5.b()     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x015d
            java.lang.Object r4 = r5.a()     // Catch:{ all -> 0x0166 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0156 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0156 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0156 }
            r8 = r4
            java.io.File r8 = (java.io.File) r8     // Catch:{ IOException -> 0x0156 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0156 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0156 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0156 }
            r6 = 1
            m.h r7 = new m.h     // Catch:{ all -> 0x013a }
            r7.<init>()     // Catch:{ all -> 0x013a }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x013a }
            r8.<init>()     // Catch:{ all -> 0x013a }
        L_0x0091:
            java.lang.String r9 = r5.readLine()     // Catch:{ all -> 0x013a }
            if (r9 == 0) goto L_0x0106
            java.lang.String r10 = " "
            r11 = 3
            java.lang.String[] r10 = r9.split(r10, r11)     // Catch:{ all -> 0x013a }
            int r12 = r10.length     // Catch:{ all -> 0x013a }
            if (r12 == r11) goto L_0x00b8
            java.lang.String r10 = "HermeticFileOverrides"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            r11.<init>()     // Catch:{ all -> 0x013a }
            java.lang.String r12 = "Invalid: "
            r11.append(r12)     // Catch:{ all -> 0x013a }
            r11.append(r9)     // Catch:{ all -> 0x013a }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x013a }
            android.util.Log.e(r10, r9)     // Catch:{ all -> 0x013a }
            goto L_0x0091
        L_0x00b8:
            r9 = r10[r3]     // Catch:{ all -> 0x013a }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x013a }
            r11.<init>(r9)     // Catch:{ all -> 0x013a }
            r9 = r10[r6]     // Catch:{ all -> 0x013a }
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x013a }
            r12.<init>(r9)     // Catch:{ all -> 0x013a }
            java.lang.String r9 = android.net.Uri.decode(r12)     // Catch:{ all -> 0x013a }
            r12 = 2
            r13 = r10[r12]     // Catch:{ all -> 0x013a }
            java.lang.Object r13 = r8.get(r13)     // Catch:{ all -> 0x013a }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x013a }
            if (r13 != 0) goto L_0x00ed
            r10 = r10[r12]     // Catch:{ all -> 0x013a }
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x013a }
            r12.<init>(r10)     // Catch:{ all -> 0x013a }
            java.lang.String r13 = android.net.Uri.decode(r12)     // Catch:{ all -> 0x013a }
            int r10 = r13.length()     // Catch:{ all -> 0x013a }
            r14 = 1024(0x400, float:1.435E-42)
            if (r10 < r14) goto L_0x00ea
            if (r13 != r12) goto L_0x00ed
        L_0x00ea:
            r8.put(r12, r13)     // Catch:{ all -> 0x013a }
        L_0x00ed:
            boolean r10 = r7.containsKey(r11)     // Catch:{ all -> 0x013a }
            if (r10 != 0) goto L_0x00fb
            m.h r10 = new m.h     // Catch:{ all -> 0x013a }
            r10.<init>()     // Catch:{ all -> 0x013a }
            r7.put(r11, r10)     // Catch:{ all -> 0x013a }
        L_0x00fb:
            r10 = 0
            java.lang.Object r10 = r7.getOrDefault(r11, r10)     // Catch:{ all -> 0x013a }
            m.h r10 = (m.h) r10     // Catch:{ all -> 0x013a }
            r10.put(r9, r13)     // Catch:{ all -> 0x013a }
            goto L_0x0091
        L_0x0106:
            java.lang.String r8 = "HermeticFileOverrides"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x013a }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x013a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            r9.<init>()     // Catch:{ all -> 0x013a }
            java.lang.String r10 = "Parsed "
            r9.append(r10)     // Catch:{ all -> 0x013a }
            r9.append(r4)     // Catch:{ all -> 0x013a }
            java.lang.String r4 = " for Android package "
            r9.append(r4)     // Catch:{ all -> 0x013a }
            r9.append(r0)     // Catch:{ all -> 0x013a }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x013a }
            android.util.Log.w(r8, r0)     // Catch:{ all -> 0x013a }
            j4.q4 r0 = new j4.q4     // Catch:{ all -> 0x013a }
            r0.<init>(r7)     // Catch:{ all -> 0x013a }
            r5.close()     // Catch:{ IOException -> 0x0156 }
            j4.k5 r3 = new j4.k5     // Catch:{ all -> 0x0166 }
            r3.<init>(r0)     // Catch:{ all -> 0x0166 }
            goto L_0x015f
        L_0x013a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x013f }
            goto L_0x0155
        L_0x013f:
            r4 = move-exception
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0155 }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            r8[r3] = r9     // Catch:{ Exception -> 0x0155 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0155 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0155 }
            r6[r3] = r4     // Catch:{ Exception -> 0x0155 }
            r5.invoke(r0, r6)     // Catch:{ Exception -> 0x0155 }
        L_0x0155:
            throw r0     // Catch:{ IOException -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0166 }
            r3.<init>(r0)     // Catch:{ all -> 0x0166 }
            throw r3     // Catch:{ all -> 0x0166 }
        L_0x015d:
            j4.h5 r3 = j4.h5.f8214a     // Catch:{ all -> 0x0166 }
        L_0x015f:
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x016d }
            r2 = r3
        L_0x0163:
            j4.t4.f8471a = r2     // Catch:{ all -> 0x016d }
            goto L_0x016b
        L_0x0166:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x016d }
            throw r0     // Catch:{ all -> 0x016d }
        L_0x016b:
            monitor-exit(r1)     // Catch:{ all -> 0x016d }
            return r2
        L_0x016d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.x4.zza():java.lang.Object");
    }
}
