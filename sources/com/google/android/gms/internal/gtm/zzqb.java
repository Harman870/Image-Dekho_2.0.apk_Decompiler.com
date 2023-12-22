package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class zzqb {
    private final String zza = "https://www.google-analytics.com";

    private static final String zzb(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException unused) {
            zzho.zza("Cannot encode the string: ".concat(String.valueOf(str)));
            return "";
        }
    }

    public final String zza(zzph zzph) {
        String str;
        String str2;
        String str3;
        String str4 = this.zza;
        if (zzph.zzg()) {
            str = zzph.zza();
        } else {
            if (!zzph.zze().trim().isEmpty()) {
                str2 = zzph.zze().trim();
            } else {
                str2 = "-1";
            }
            StringBuilder sb = new StringBuilder();
            if (zzph.zzf() != null) {
                str3 = zzph.zzf();
            } else {
                str3 = "id";
            }
            sb.append(str3);
            sb.append("=");
            sb.append(zzb(zzph.zzb()));
            sb.append("&pv=");
            sb.append(zzb(str2));
            sb.append("&rv=5.0");
            if (zzph.zzg()) {
                sb.append("&gtm_debug=x");
            }
            str = sb.toString();
        }
        return w0.d(str4, "/gtm/android?", str);
    }
}
