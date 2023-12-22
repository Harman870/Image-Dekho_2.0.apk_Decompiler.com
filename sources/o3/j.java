package o3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;
import r3.o;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public final class j {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static j f10566c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10567a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f10568b;

    public j(Context context) {
        this.f10567a = context.getApplicationContext();
    }

    public static j a(Context context) {
        o.h(context);
        synchronized (j.class) {
            if (f10566c == null) {
                r rVar = x.f10582a;
                synchronized (x.class) {
                    if (x.f10586e == null) {
                        x.f10586e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f10566c = new j(context);
            }
        }
        return f10566c;
    }

    @Nullable
    public static final t c(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (tVarArr[i10].equals(uVar)) {
                return tVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z9) {
        if (z9 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z9 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z9 ? c(packageInfo, w.f10581a) : c(packageInfo, w.f10581a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0198 A[EDGE_INSN: B:110:0x0198->B:100:0x0198 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A[LOOP:0: B:5:0x0019->B:97:0x0187, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r21) {
        /*
            r20 = this;
            r1 = r20
            android.content.Context r0 = r1.f10567a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = r21
            java.lang.String[] r2 = r0.getPackagesForUid(r2)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0190
            int r5 = r2.length
            if (r5 != 0) goto L_0x0017
            goto L_0x0190
        L_0x0017:
            r0 = r3
            r6 = r4
        L_0x0019:
            if (r6 >= r5) goto L_0x018c
            r14 = r2[r6]
            java.lang.String r15 = "Failed to get Google certificates from remote"
            java.lang.String r13 = "GoogleCertificates"
            java.lang.String r7 = "null pkg"
            if (r14 != 0) goto L_0x002c
            o3.f0 r0 = new o3.f0
            r0.<init>(r4, r7, r3)
            goto L_0x0182
        L_0x002c:
            java.lang.String r0 = r1.f10568b
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0180
            o3.r r0 = o3.x.f10582a
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            o3.x.b()     // Catch:{ a -> 0x004c, RemoteException -> 0x004a }
            r3.o0 r0 = o3.x.f10584c     // Catch:{ a -> 0x004c, RemoteException -> 0x004a }
            boolean r0 = r0.zzi()     // Catch:{ a -> 0x004c, RemoteException -> 0x004a }
            android.os.StrictMode.setThreadPolicy(r8)
            goto L_0x0054
        L_0x0047:
            r0 = move-exception
            goto L_0x017c
        L_0x004a:
            r0 = move-exception
            goto L_0x004d
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            android.util.Log.e(r13, r15, r0)     // Catch:{ all -> 0x0047 }
            android.os.StrictMode.setThreadPolicy(r8)
            r0 = r4
        L_0x0054:
            r12 = 1
            if (r0 == 0) goto L_0x00ef
            android.content.Context r0 = r1.f10567a
            boolean r9 = o3.i.a(r0)
            android.os.StrictMode$ThreadPolicy r16 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r0 = o3.x.f10586e     // Catch:{ all -> 0x00ea }
            r3.o.h(r0)     // Catch:{ all -> 0x00ea }
            o3.x.b()     // Catch:{ a -> 0x00c9 }
            o3.y r0 = new o3.y     // Catch:{ all -> 0x00ea }
            r10 = 0
            android.content.Context r7 = o3.x.f10586e     // Catch:{ all -> 0x00ea }
            z3.b r11 = new z3.b     // Catch:{ all -> 0x00ea }
            r11.<init>(r7)     // Catch:{ all -> 0x00ea }
            r17 = 0
            r18 = 1
            r7 = r0
            r8 = r14
            r4 = r12
            r12 = r17
            r19 = r13
            r13 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00ea }
            r3.o0 r7 = o3.x.f10584c     // Catch:{ RemoteException -> 0x00c0 }
            o3.a0 r0 = r7.h(r0)     // Catch:{ RemoteException -> 0x00c0 }
            boolean r7 = r0.f10533a     // Catch:{ all -> 0x00ea }
            if (r7 == 0) goto L_0x0098
            int r0 = r0.f10536d     // Catch:{ all -> 0x00ea }
            z5.c.t(r0)     // Catch:{ all -> 0x00ea }
            o3.f0 r0 = new o3.f0     // Catch:{ all -> 0x00ea }
            r0.<init>(r4, r3, r3)     // Catch:{ all -> 0x00ea }
            goto L_0x00e5
        L_0x0098:
            java.lang.String r4 = r0.f10534b     // Catch:{ all -> 0x00ea }
            int r7 = r0.f10535c     // Catch:{ all -> 0x00ea }
            int r7 = y3.a.F(r7)     // Catch:{ all -> 0x00ea }
            r8 = 4
            if (r7 != r8) goto L_0x00a9
            android.content.pm.PackageManager$NameNotFoundException r7 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ all -> 0x00ea }
            r7.<init>()     // Catch:{ all -> 0x00ea }
            goto L_0x00aa
        L_0x00a9:
            r7 = r3
        L_0x00aa:
            java.lang.String r8 = "error checking package certificate"
            if (r4 != 0) goto L_0x00af
            r4 = r8
        L_0x00af:
            int r8 = r0.f10536d     // Catch:{ all -> 0x00ea }
            z5.c.t(r8)     // Catch:{ all -> 0x00ea }
            int r0 = r0.f10535c     // Catch:{ all -> 0x00ea }
            y3.a.F(r0)     // Catch:{ all -> 0x00ea }
            o3.f0 r0 = new o3.f0     // Catch:{ all -> 0x00ea }
            r8 = 0
            r0.<init>(r8, r4, r7)     // Catch:{ all -> 0x00ea }
            goto L_0x00e5
        L_0x00c0:
            r0 = move-exception
            r4 = r19
            android.util.Log.e(r4, r15, r0)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "module call"
            goto L_0x00de
        L_0x00c9:
            r0 = move-exception
            r4 = r13
            r7 = r0
            android.util.Log.e(r4, r15, r7)     // Catch:{ all -> 0x00ea }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "module init: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = r4.concat(r0)     // Catch:{ all -> 0x00ea }
            r0 = r7
        L_0x00de:
            o3.f0 r7 = new o3.f0     // Catch:{ all -> 0x00ea }
            r8 = 0
            r7.<init>(r8, r4, r0)     // Catch:{ all -> 0x00ea }
            r0 = r7
        L_0x00e5:
            android.os.StrictMode.setThreadPolicy(r16)
            goto L_0x0166
        L_0x00ea:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r16)
            throw r0
        L_0x00ef:
            r4 = r12
            android.content.Context r0 = r1.f10567a     // Catch:{ NameNotFoundException -> 0x016d }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016d }
            r8 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r14, r8)     // Catch:{ NameNotFoundException -> 0x016d }
            android.content.Context r8 = r1.f10567a
            boolean r8 = o3.i.a(r8)
            if (r0 != 0) goto L_0x010b
            o3.f0 r0 = new o3.f0
            r9 = 0
            r0.<init>(r9, r7, r3)
            goto L_0x0166
        L_0x010b:
            r9 = 0
            android.content.pm.Signature[] r7 = r0.signatures
            if (r7 == 0) goto L_0x015d
            int r7 = r7.length
            if (r7 == r4) goto L_0x0114
            goto L_0x015d
        L_0x0114:
            o3.u r7 = new o3.u
            android.content.pm.Signature[] r10 = r0.signatures
            r10 = r10[r9]
            byte[] r10 = r10.toByteArray()
            r7.<init>(r10)
            java.lang.String r10 = r0.packageName
            android.os.StrictMode$ThreadPolicy r11 = android.os.StrictMode.allowThreadDiskReads()
            o3.f0 r8 = o3.x.a(r10, r7, r8, r9)     // Catch:{ all -> 0x0157 }
            android.os.StrictMode.setThreadPolicy(r11)
            boolean r9 = r8.f10558a
            if (r9 == 0) goto L_0x0155
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L_0x0155
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0155
            android.os.StrictMode$ThreadPolicy r9 = android.os.StrictMode.allowThreadDiskReads()
            r11 = 0
            o3.f0 r0 = o3.x.a(r10, r7, r11, r4)     // Catch:{ all -> 0x014f }
            android.os.StrictMode.setThreadPolicy(r9)
            boolean r0 = r0.f10558a
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "debuggable release cert app rejected"
            goto L_0x015f
        L_0x014f:
            r0 = move-exception
            r2 = r0
            android.os.StrictMode.setThreadPolicy(r9)
            throw r2
        L_0x0155:
            r0 = r8
            goto L_0x0166
        L_0x0157:
            r0 = move-exception
            r2 = r0
            android.os.StrictMode.setThreadPolicy(r11)
            throw r2
        L_0x015d:
            java.lang.String r0 = "single cert required"
        L_0x015f:
            o3.f0 r4 = new o3.f0
            r7 = 0
            r4.<init>(r7, r0, r3)
            r0 = r4
        L_0x0166:
            boolean r4 = r0.f10558a
            if (r4 == 0) goto L_0x0182
            r1.f10568b = r14
            goto L_0x0182
        L_0x016d:
            r0 = move-exception
            java.lang.String r4 = "no pkg "
            java.lang.String r4 = r4.concat(r14)
            o3.f0 r7 = new o3.f0
            r8 = 0
            r7.<init>(r8, r4, r0)
            r0 = r7
            goto L_0x0182
        L_0x017c:
            android.os.StrictMode.setThreadPolicy(r8)
            throw r0
        L_0x0180:
            o3.f0 r0 = o3.f0.f10557d
        L_0x0182:
            boolean r4 = r0.f10558a
            if (r4 == 0) goto L_0x0187
            goto L_0x0198
        L_0x0187:
            int r6 = r6 + 1
            r4 = 0
            goto L_0x0019
        L_0x018c:
            r3.o.h(r0)
            goto L_0x0198
        L_0x0190:
            o3.f0 r0 = new o3.f0
            java.lang.String r2 = "no pkgs"
            r4 = 0
            r0.<init>(r4, r2, r3)
        L_0x0198:
            boolean r2 = r0.f10558a
            if (r2 != 0) goto L_0x01ba
            r2 = 3
            java.lang.String r3 = "GoogleCertificatesRslt"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x01ba
            java.lang.Throwable r2 = r0.f10560c
            if (r2 == 0) goto L_0x01b3
            java.lang.String r2 = r0.a()
            java.lang.Throwable r4 = r0.f10560c
            android.util.Log.d(r3, r2, r4)
            goto L_0x01ba
        L_0x01b3:
            java.lang.String r2 = r0.a()
            android.util.Log.d(r3, r2)
        L_0x01ba:
            boolean r0 = r0.f10558a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.j.b(int):boolean");
    }
}
