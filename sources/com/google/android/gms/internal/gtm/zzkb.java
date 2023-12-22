package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
import r3.o;

public final class zzkb extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        o.b(zzqzArr.length == 2);
        o.b(zzqzArr[0] instanceof zzrg);
        o.b(zzqzArr[1] instanceof zzrc);
        zzrg zzrg = zzqzArr[0];
        zzrc zzrc = zzqzArr[1];
        List zzk = zzrg.zzk();
        int size = zzk.size();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < size && i10 < zzrg.zzk().size()) {
            if (zzrg.zzn(i10)) {
                if (zzjx.zzg(zzrc.zzi().zzd(zzie, (zzqz) zzk.get(i10), new zzrb(Double.valueOf((double) i10)), zzrg))) {
                    arrayList.add((zzqz) zzk.get(i10));
                }
            }
            i10++;
        }
        return new zzrg(arrayList);
    }
}
