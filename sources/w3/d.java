package w3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f12741a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f12742b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f12743c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f12744d;

    @TargetApi(26)
    public static boolean a(Context context) {
        boolean z9;
        PackageManager packageManager = context.getPackageManager();
        if (f12741a == null) {
            f12741a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f12741a.booleanValue();
        if (f12742b == null) {
            f12742b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f12742b.booleanValue()) {
            if (g.a()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
