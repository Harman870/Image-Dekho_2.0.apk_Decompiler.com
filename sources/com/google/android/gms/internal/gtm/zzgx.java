package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzgx implements zzhc {
    private static zzgx zza;
    private static final Object zzb = new Object();
    private static final Set zzc = new HashSet(Arrays.asList(new String[]{"GET", VersionInfo.GIT_BRANCH, "POST", "PUT"}));
    private final zzhd zzd;
    private final zzif zze;

    private zzgx(Context context) {
        zzhf zzd2 = zzhf.zzd(context);
        zzif zzif = new zzif();
        this.zzd = zzd2;
        this.zze = zzif;
    }

    public static zzhc zza(Context context) {
        zzgx zzgx;
        synchronized (zzb) {
            if (zza == null) {
                zza = new zzgx(context);
            }
            zzgx = zza;
        }
        return zzgx;
    }

    public final boolean zzb(String str, String str2, String str3, Map map, String str4) {
        String str5;
        if (str2 != null && !zzc.contains(str2)) {
            str5 = String.format("Unsupport http method %s. Drop the hit.", new Object[]{str2});
        } else if (zzhv.zza().zzd() || this.zze.zza()) {
            this.zzd.zzb(str, str2, str3, map, str4);
            return true;
        } else {
            str5 = "Too many hits sent too quickly (rate throttled).";
        }
        zzho.zze(str5);
        return false;
    }
}
