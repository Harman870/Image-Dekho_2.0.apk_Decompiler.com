package com.google.android.gms.internal.gtm;

import android.content.Context;
import w3.c;

final class zzgv {
    public static void zza(String str, Context context) {
        zzho.zza(str);
        c.a(context, new RuntimeException(str));
        zzho.zzd("Failed to report crash");
    }

    public static void zzb(String str, Throwable th, Context context) {
        zzho.zzb(str, th);
        c.a(context, th);
        zzho.zzd("Failed to report crash");
    }

    public static void zzc(String str, Context context) {
        zzho.zze(str);
        c.a(context, new RuntimeException(str));
        zzho.zzd("Failed to report crash");
    }
}
