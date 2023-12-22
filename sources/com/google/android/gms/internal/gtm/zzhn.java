package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;

public final class zzhn {
    private static String zzb;

    static {
        new HashMap();
    }

    public static String zza(String str, String str2) {
        if (str2 != null) {
            return Uri.parse("http://hostname/?".concat(String.valueOf(str))).getQueryParameter(str2);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    public static String zzb(Context context, String str) {
        if (zzb == null) {
            synchronized (zzhn.class) {
                if (zzb == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    zzb = sharedPreferences != null ? sharedPreferences.getString("referrer", "") : "";
                }
            }
        }
        return zza(zzb, str);
    }
}
