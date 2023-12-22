package com.google.android.gms.internal.gtm;

import java.util.List;
import r3.o;

public final class zzkd extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        int length = zzqzArr.length;
        int i10 = 0;
        o.b(length > 0 && length <= 3);
        o.b(zzqzArr[0] instanceof zzrg);
        zzrg zzrg = zzqzArr[0];
        zzrd zzrd = length < 2 ? zzrd.zze : zzqzArr[1];
        zzrd zzrd2 = length < 3 ? zzrd.zze : zzqzArr[2];
        List zzk = zzrg.zzk();
        int size = zzk.size();
        if (zzrd2 != zzrd.zze) {
            int zza = (int) zzjx.zza(zzrd2);
            i10 = zza < 0 ? Math.max(size - Math.abs(zza), 0) : zza;
        }
        while (true) {
            if (i10 < size) {
                if (zzrg.zzn(i10) && zzjx.zzh(zzrd, (zzqz) zzk.get(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return new zzrb(Double.valueOf((double) i10));
    }
}
