package com.google.android.gms.internal.gtm;

import android.util.Log;

public final class zzho {
    static {
        new zzgw();
    }

    public static void zza(String str) {
        if (zzgw.zza(6)) {
            Log.e("GoogleTagManager", str);
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzgw.zza(6)) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    public static void zzc(String str) {
        if (zzgw.zza(4)) {
            Log.i("GoogleTagManager", str);
        }
    }

    public static void zzd(String str) {
        if (zzgw.zza(2)) {
            Log.v("GoogleTagManager", str);
        }
    }

    public static void zze(String str) {
        if (zzgw.zza(5)) {
            Log.w("GoogleTagManager", str);
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzgw.zza(5)) {
            Log.w("GoogleTagManager", str, th);
        }
    }
}
