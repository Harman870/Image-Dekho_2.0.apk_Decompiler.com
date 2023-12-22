package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzki extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        int length = zzqzArr.length;
        o.b(length > 0);
        o.b(zzqzArr[0] instanceof zzrg);
        zzrg zzrg = zzqzArr[0];
        int size = zzrg.zzk().size();
        zzrg.zzm((length + size) - 1);
        for (int i10 = 1; i10 < zzqzArr.length; i10++) {
            zzrg.zzl(size, zzqzArr[i10]);
            size++;
        }
        return new zzrb(Double.valueOf((double) size));
    }
}
