package com.google.android.gms.internal.gtm;

import java.util.List;
import r3.o;

public final class zzmd extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr.length == 3);
        o.b(zzqzArr[1] instanceof zzrg);
        o.b(zzqzArr[2] instanceof zzrg);
        zzqz zzqz = zzqzArr[0];
        List zzk = zzqzArr[1].zzk();
        List zzk2 = zzqzArr[2].zzk();
        o.b(zzk2.size() <= zzk.size() + 1);
        boolean z9 = false;
        for (int i10 = 0; i10 < zzk.size(); i10++) {
            if (z9 || zzjx.zzh(zzqz, zzrl.zzc(zzie, (zzqz) zzk.get(i10)))) {
                zzqz zzc = zzrl.zzc(zzie, (zzqz) zzk2.get(i10));
                if (!(zzc instanceof zzrd)) {
                    z9 = true;
                } else if (zzc == zzrd.zzc || ((zzrd) zzc).zzj()) {
                    return zzc;
                } else {
                    if (zzc == zzrd.zzb) {
                        return zzrd.zze;
                    }
                }
            }
        }
        if (zzk.size() < zzk2.size()) {
            zzqz zzc2 = zzrl.zzc(zzie, (zzqz) zzk2.get(zzk2.size() - 1));
            if ((zzc2 instanceof zzrd) && (zzc2 == zzrd.zzc || ((zzrd) zzc2).zzj())) {
                return zzc2;
            }
        }
        return zzrd.zze;
    }
}
