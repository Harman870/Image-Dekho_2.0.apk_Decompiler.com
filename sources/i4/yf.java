package i4;

import android.util.Log;
import androidx.appcompat.widget.l;
import i9.h;
import java.util.List;

public final class yf implements h {

    /* renamed from: a  reason: collision with root package name */
    public final int f7828a;

    public /* synthetic */ yf(int i10) {
        this.f7828a = i10;
    }

    public /* synthetic */ yf(String str) {
        int i10;
        try {
            List j10 = l.i().j(str);
            if (j10.size() == 1) {
                i10 = Integer.parseInt(str);
            } else {
                if (j10.size() >= 3) {
                    i10 = Integer.parseInt((String) j10.get(2)) + (Integer.parseInt((String) j10.get(1)) * 1000) + (Integer.parseInt((String) j10.get(0)) * 1000000);
                }
                i10 = -1;
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e10}));
            }
        }
        this.f7828a = i10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[Catch:{ all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i4.yf c() {
        /*
            java.lang.String r0 = "Failed to get app version for libraryName: firebase-auth"
            i4.yf r1 = new i4.yf
            r3.k r2 = r3.k.f11602c
            r2.getClass()
            java.lang.String r3 = "LibraryVersion"
            java.lang.String r4 = "Please provide a valid libraryName"
            java.lang.String r5 = "firebase-auth"
            r3.o.f(r4, r5)
            java.util.concurrent.ConcurrentHashMap r4 = r2.f11603a
            boolean r4 = r4.containsKey(r5)
            java.lang.String r6 = "UNKNOWN"
            if (r4 == 0) goto L_0x0026
            java.util.concurrent.ConcurrentHashMap r0 = r2.f11603a
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00e0
        L_0x0026:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            r7 = 0
            java.lang.String r8 = "/%s.properties"
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x009b }
            r10 = 0
            r9[r10] = r5     // Catch:{ IOException -> 0x009b }
            java.lang.String r8 = java.lang.String.format(r8, r9)     // Catch:{ IOException -> 0x009b }
            java.lang.Class<r3.k> r9 = r3.k.class
            java.io.InputStream r8 = r9.getResourceAsStream(r8)     // Catch:{ IOException -> 0x009b }
            if (r8 == 0) goto L_0x0078
            r4.load(r8)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            java.lang.String r9 = "version"
            java.lang.String r7 = r4.getProperty(r9, r7)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            r3.h r4 = r3.k.f11601b     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            r9.<init>()     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            r9.append(r5)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            java.lang.String r10 = " version is "
            r9.append(r10)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            r9.append(r7)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            r10 = 2
            java.lang.String r11 = r4.f11594a     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            boolean r10 = android.util.Log.isLoggable(r11, r10)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            if (r10 == 0) goto L_0x0090
            java.lang.String r4 = r4.f11595b     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            if (r4 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            java.lang.String r9 = r4.concat(r9)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
        L_0x0071:
            android.util.Log.v(r3, r9)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            goto L_0x0090
        L_0x0075:
            r0 = move-exception
            goto L_0x00f3
        L_0x0078:
            r3.h r4 = r3.k.f11601b     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            r9 = 5
            java.lang.String r10 = r4.f11594a     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            boolean r9 = android.util.Log.isLoggable(r10, r9)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            if (r9 == 0) goto L_0x0090
            java.lang.String r4 = r4.f11595b     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
            if (r4 != 0) goto L_0x0089
            r4 = r0
            goto L_0x008d
        L_0x0089:
            java.lang.String r4 = r4.concat(r0)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
        L_0x008d:
            android.util.Log.w(r3, r4)     // Catch:{ IOException -> 0x0096, all -> 0x0075 }
        L_0x0090:
            if (r8 == 0) goto L_0x00bd
            w3.f.a(r8)
            goto L_0x00bd
        L_0x0096:
            r4 = move-exception
            r12 = r8
            r8 = r7
            r7 = r12
            goto L_0x009d
        L_0x009b:
            r4 = move-exception
            r8 = r7
        L_0x009d:
            r3.h r9 = r3.k.f11601b     // Catch:{ all -> 0x00b5 }
            r10 = 6
            java.lang.String r11 = r9.f11594a     // Catch:{ all -> 0x00b5 }
            boolean r10 = android.util.Log.isLoggable(r11, r10)     // Catch:{ all -> 0x00b5 }
            if (r10 == 0) goto L_0x00b7
            java.lang.String r9 = r9.f11595b     // Catch:{ all -> 0x00b5 }
            if (r9 != 0) goto L_0x00ad
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r0 = r9.concat(r0)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            android.util.Log.e(r3, r0, r4)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b7
        L_0x00b5:
            r0 = move-exception
            goto L_0x00f2
        L_0x00b7:
            if (r7 == 0) goto L_0x00bc
            w3.f.a(r7)
        L_0x00bc:
            r7 = r8
        L_0x00bd:
            if (r7 != 0) goto L_0x00da
            r3.h r0 = r3.k.f11601b
            r4 = 3
            java.lang.String r7 = r0.f11594a
            boolean r4 = android.util.Log.isLoggable(r7, r4)
            if (r4 == 0) goto L_0x00d8
            java.lang.String r4 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            java.lang.String r0 = r0.f11595b
            if (r0 != 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            java.lang.String r4 = r0.concat(r4)
        L_0x00d5:
            android.util.Log.d(r3, r4)
        L_0x00d8:
            r0 = r6
            goto L_0x00db
        L_0x00da:
            r0 = r7
        L_0x00db:
            java.util.concurrent.ConcurrentHashMap r2 = r2.f11603a
            r2.put(r5, r0)
        L_0x00e0:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x00ec
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x00ee
        L_0x00ec:
            java.lang.String r0 = "-1"
        L_0x00ee:
            r1.<init>((java.lang.String) r0)
            return r1
        L_0x00f2:
            r8 = r7
        L_0x00f3:
            if (r8 == 0) goto L_0x00f8
            w3.f.a(r8)
        L_0x00f8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.yf.c():i4.yf");
    }

    public void a() {
    }

    public int b() {
        return this.f7828a;
    }
}
