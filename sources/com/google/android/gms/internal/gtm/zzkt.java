package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import r3.o;

public final class zzkt extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        o.b(zzqzArr.length >= 3);
        o.b(zzqzArr[0] instanceof zzrg);
        zzrg zzrg = zzqzArr[0];
        int zza = (int) zzjx.zza(zzqzArr[1]);
        int size = zzrg.zzk().size();
        int max = zza < 0 ? Math.max(size + zza, 0) : Math.min(zza, size);
        int min = Math.min(Math.max((int) zzjx.zza(zzqzArr[2]), 0), zzrg.zzk().size() - max) + max;
        ArrayList arrayList = new ArrayList(zzrg.zzk().subList(max, min));
        zzrg.zzk().subList(max, min).clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 3; i10 < zzqzArr.length; i10++) {
            arrayList2.add(zzqzArr[i10]);
        }
        zzrg.zzk().addAll(max, arrayList2);
        return new zzrg(arrayList);
    }
}
