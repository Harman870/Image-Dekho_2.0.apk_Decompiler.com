package a3;

import android.os.Build;
import android.util.Log;

public final class a {
    public static void a(Object obj, String str, String str2) {
        String c10 = c(str);
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format(str2, new Object[]{obj}));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c10 = c(str);
        if (Log.isLoggable(c10, 6)) {
            Log.e(c10, str2, exc);
        }
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return com.ironsource.adapters.ironsource.a.g("TRuntime.", str);
        }
        String g10 = com.ironsource.adapters.ironsource.a.g("TRuntime.", str);
        if (g10.length() > 23) {
            return g10.substring(0, 23);
        }
        return g10;
    }
}
