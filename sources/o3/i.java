package o3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.c;

public class i {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f10562a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f10563b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f10564c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f10565d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f10564c) {
            try {
                PackageInfo b10 = c.a(context).b(64, "com.google.android.gms");
                j.a(context);
                if (b10 == null || j.d(b10, false) || !j.d(b10, true)) {
                    f10563b = false;
                } else {
                    f10563b = true;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
            } catch (Throwable th) {
                f10564c = true;
                throw th;
            }
            f10564c = true;
        }
        return f10563b || !"user".equals(Build.TYPE);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ Exception -> 0x0037 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0037 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1
            java.lang.String r3 = "com.google.android.gms"
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r0.next()
            android.content.pm.PackageInstaller$SessionInfo r1 = (android.content.pm.PackageInstaller.SessionInfo) r1
            java.lang.String r1 = r1.getAppPackageName()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0010
            return r2
        L_0x002a:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r3, r0)     // Catch:{  }
            boolean r4 = r4.enabled     // Catch:{  }
            return r4
        L_0x0037:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.i.b(android.content.Context):boolean");
    }
}
