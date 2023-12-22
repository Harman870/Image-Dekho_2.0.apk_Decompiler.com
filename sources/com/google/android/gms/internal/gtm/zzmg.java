package com.google.android.gms.internal.gtm;

import java.util.List;
import r3.o;

public final class zzmg implements zzjw {
    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr != null);
        o.b(zzqzArr.length == 4);
        zzqz zzc = zzrl.zzc(zzie, zzqzArr[3]);
        o.b(zzc instanceof zzrg);
        List zzk = ((zzrg) zzc).zzk();
        zzra zzra = zzqzArr[2];
        o.b(zzra instanceof zzra);
        if (zzra.zzi().booleanValue()) {
            zzrd zzf = zzrl.zzf(zzie, zzk);
            if (zzf == zzrd.zzb) {
                return zzrd.zze;
            }
            if (zzf.zzj()) {
                return zzf;
            }
        }
        while (zzjx.zzg(zzrl.zzc(zzie, zzqzArr[0]))) {
            zzrd zzf2 = zzrl.zzf(zzie, zzk);
            if (zzf2 == zzrd.zzb) {
                return zzrd.zze;
            }
            if (zzf2.zzj()) {
                return zzf2;
            }
            zzrl.zzc(zzie, zzqzArr[1]);
        }
        return zzrd.zze;
    }
}
