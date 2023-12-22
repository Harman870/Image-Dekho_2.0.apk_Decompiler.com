package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import com.ironsource.adapters.ironsource.a;
import i3.e;

@Deprecated
public final class zzfc {
    private static volatile e zza = new zzcw();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzJ(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                StringBuilder h10 = a.h(str, ":");
                h10.append((String) obj);
                str2 = h10.toString();
            } else {
                str2 = str;
            }
            Log.e((String) zzew.zzc.zzb(), str2);
        }
        e eVar = zza;
        if (eVar != null) {
            eVar.error(str);
        }
    }

    public static void zzc(e eVar) {
        zza = eVar;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zze(String str) {
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzQ(str);
        } else if (zzf(2)) {
            Log.w((String) zzew.zzc.zzb(), str);
        }
        e eVar = zza;
        if (eVar != null) {
            eVar.warn(str);
        }
    }

    public static boolean zzf(int i10) {
        return zza != null && zza.getLogLevel() <= i10;
    }
}
