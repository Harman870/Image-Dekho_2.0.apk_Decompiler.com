package w3;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import o3.i;
import y3.b;
import y3.c;

public final class j {
    public static boolean a(Context context, int i10) {
        if (!b(context, "com.google.android.gms", i10)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            o3.j a10 = o3.j.a(context);
            a10.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!o3.j.d(packageInfo, false)) {
                if (!o3.j.d(packageInfo, true)) {
                    return false;
                }
                if (!i.a(a10.f10567a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, String str, int i10) {
        b a10 = c.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f13043a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i10, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
