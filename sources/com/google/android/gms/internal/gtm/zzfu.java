package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import r3.o;
import w3.e;

public final class zzfu {
    public static long zza(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static zzay zzb(zzfd zzfd, String str) {
        o.h(zzfd);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map a10 = e.a(new URI("?" + str));
            zzay zzay = new zzay();
            zzay.zzp((String) a10.get("utm_content"));
            zzay.zzu((String) a10.get("utm_medium"));
            zzay.zzv((String) a10.get("utm_campaign"));
            zzay.zzw((String) a10.get("utm_source"));
            zzay.zzt((String) a10.get("utm_term"));
            zzay.zzs((String) a10.get("utm_id"));
            zzay.zzo((String) a10.get("anid"));
            zzay.zzr((String) a10.get("gclid"));
            zzay.zzq((String) a10.get("dclid"));
            zzay.zzn((String) a10.get("aclid"));
            return zzay;
        } catch (URISyntaxException e10) {
            zzfd.zzR("No valid campaign data found", e10);
            return null;
        }
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static MessageDigest zze(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void zzg(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void zzh(Map map, String str, Map map2) {
        zzg(map, str, (String) map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z9) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            return receiverInfo != null && receiverInfo.enabled && (!z9 || receiverInfo.exported);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zzj(double d10, String str) {
        int i10;
        if (d10 > 0.0d && d10 < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i10 = ((i10 << 6) & 65535) + charAt + (charAt << 14);
                    int i11 = 266338304 & i10;
                    if (i11 != 0) {
                        i10 ^= i11 >> 21;
                    }
                }
            } else {
                i10 = 1;
            }
            if (((double) (i10 % 10000)) >= d10 * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
