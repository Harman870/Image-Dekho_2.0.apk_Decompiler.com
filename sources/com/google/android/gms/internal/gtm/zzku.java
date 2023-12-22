package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import r3.o;

public final class zzku extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        o.b(zzqzArr.length > 0);
        o.b(zzqzArr[0] instanceof zzrg);
        zzrg zzrg = zzqzArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 1; i10 < zzqzArr.length; i10++) {
            arrayList.add(zzqzArr[i10]);
        }
        zzrg.zzk().addAll(0, arrayList);
        return new zzrb(Double.valueOf((double) zzrg.zzk().size()));
    }
}
