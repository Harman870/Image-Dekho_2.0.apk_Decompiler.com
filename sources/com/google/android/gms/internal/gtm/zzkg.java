package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
import r3.o;

public final class zzkg extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzqz zzqz;
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
                zzqz = zzrc.zzi().zzd(zzie, (zzqz) zzk.get(i10), new zzrb(Double.valueOf((double) i10)), zzrg);
                o.k(!zzrl.zzi(zzqz));
            } else {
                zzqz = null;
            }
            arrayList.add(zzqz);
            i10++;
        }
        return new zzrg(arrayList);
    }
}
