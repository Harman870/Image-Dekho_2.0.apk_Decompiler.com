package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlv implements zzjw {
    private static zzic zza;

    public zzlv(zzic zzic) {
        zza = zzic;
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 1) {
            z9 = false;
        }
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrk);
        return zza.zzc(zzqzArr[0].zzk());
    }
}
