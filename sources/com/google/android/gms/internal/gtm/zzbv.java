package com.google.android.gms.internal.gtm;

import o3.f;

public final class zzbv {
    public static final String zza;
    public static final String zzb;

    static {
        String replaceAll = String.valueOf(f.f10555a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zza = replaceAll;
        zzb = "ma".concat(String.valueOf(replaceAll));
    }
}
