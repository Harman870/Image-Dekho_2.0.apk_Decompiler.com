package com.google.android.gms.internal.gtm;

import java.util.List;
import r3.o;

public final class zzkf extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        int length = zzqzArr.length;
        o.b(length > 0 && length <= 3);
        o.b(zzqzArr[0] instanceof zzrg);
        zzrg zzrg = zzqzArr[0];
        zzrd zzrd = length < 2 ? zzrd.zze : zzqzArr[1];
        List zzk = zzrg.zzk();
        int size = zzk.size();
        int i10 = size - 1;
        if (length == 3) {
            int zza = (int) zzjx.zza(zzqzArr[2]);
            i10 = zza < 0 ? size - Math.abs(zza) : Math.min(zza, i10);
        }
        while (true) {
            if (i10 >= 0) {
                if (zzrg.zzn(i10) && zzjx.zzh(zzrd, (zzqz) zzk.get(i10))) {
                    break;
                }
                i10--;
            } else {
                i10 = -1;
                break;
            }
        }
        return new zzrb(Double.valueOf((double) i10));
    }
}
