package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;
import r3.o;

public final class zzlt extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        o.b(zzqzArr.length == 3);
        o.b(zzqzArr[0] instanceof zzrk);
        String zzk = zzqzArr[0].zzk();
        o.b(zzie.zzf(zzk));
        zzqz zzqz = zzqzArr[1];
        o.h(zzqz);
        zzrg zzrg = zzqzArr[2];
        o.b(zzrg instanceof zzrg);
        List zzk2 = zzrg.zzk();
        Iterator zze = zzqz.zze();
        while (zze.hasNext()) {
            zzie.zze(zzk, (zzqz) zze.next());
            zzrd zzf = zzrl.zzf(zzie, zzk2);
            if (zzf == zzrd.zzb) {
                return zzrd.zze;
            }
            if (zzf.zzj()) {
                return zzf;
            }
        }
        return zzrd.zze;
    }
}
