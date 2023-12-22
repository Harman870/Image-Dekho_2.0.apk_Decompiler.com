package w3;

import javax.annotation.Nullable;

public final class h {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static String f12745a;

    /* renamed from: b  reason: collision with root package name */
    public static int f12746b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = f12745a
            if (r0 != 0) goto L_0x0069
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0011
            java.lang.String r0 = android.app.Application.getProcessName()
            f12745a = r0
            goto L_0x0069
        L_0x0011:
            int r0 = f12746b
            if (r0 != 0) goto L_0x001b
            int r0 = android.os.Process.myPid()
            f12746b = r0
        L_0x001b:
            r1 = 0
            if (r0 > 0) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r2.<init>()     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r2.append(r0)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0058 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0058 }
            r4.<init>(r0)     // Catch:{ all -> 0x0058 }
            r3.<init>(r4)     // Catch:{ all -> 0x0058 }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r3.o.h(r0)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r1 = r3
            goto L_0x005e
        L_0x0055:
            r0 = r1
        L_0x0056:
            r1 = r3
            goto L_0x0063
        L_0x0058:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            throw r0     // Catch:{ IOException -> 0x0062, all -> 0x005d }
        L_0x005d:
            r0 = move-exception
        L_0x005e:
            w3.f.a(r1)
            throw r0
        L_0x0062:
            r0 = r1
        L_0x0063:
            w3.f.a(r1)
            r1 = r0
        L_0x0067:
            f12745a = r1
        L_0x0069:
            java.lang.String r0 = f12745a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.h.a():java.lang.String");
    }
}
