package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlo extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        if (zzqzArr.length != 1) {
            z9 = false;
        }
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrg);
        for (zzqz zzc : zzqzArr[0].zzk()) {
            zzqz zzc2 = zzrl.zzc(zzie, zzc);
            if ((zzc2 instanceof zzrd) && (zzc2 == zzrd.zzb || zzc2 == zzrd.zzc || ((zzrd) zzc2).zzj())) {
                return zzc2;
            }
        }
        return zzrd.zze;
    }
}
