package com.google.android.gms.internal.gtm;

import java.util.List;
import r3.o;

public final class zzko extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        o.b(zzqzArr.length == 2);
        o.b(zzqzArr[0] instanceof zzrg);
        o.b(zzqzArr[1] instanceof zzrc);
        zzrg zzrg = zzqzArr[0];
        zzrc zzrc = zzqzArr[1];
        List zzk = zzrg.zzk();
        int size = zzk.size();
        boolean z9 = false;
        int i10 = 0;
        while (!z9 && i10 < size && i10 < zzrg.zzk().size()) {
            if (zzrg.zzn(i10)) {
                z9 = zzjx.zzg(zzrc.zzi().zzd(zzie, (zzqz) zzk.get(i10), new zzrb(Double.valueOf((double) i10)), zzrg));
            }
            i10++;
        }
        return new zzra(Boolean.valueOf(z9));
    }
}
