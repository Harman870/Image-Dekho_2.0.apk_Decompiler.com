package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import r3.o;

public final class zzjz extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        o.b(zzqzArr.length > 0);
        o.b(zzqzArr[0] instanceof zzrg);
        ArrayList arrayList = new ArrayList();
        for (zzqz add : zzqzArr[0].zzk()) {
            arrayList.add(add);
        }
        for (int i10 = 1; i10 < zzqzArr.length; i10++) {
            zzrg zzrg = zzqzArr[i10];
            if (zzrg instanceof zzrg) {
                for (zzqz add2 : zzrg.zzk()) {
                    arrayList.add(add2);
                }
            } else {
                arrayList.add(zzrg);
            }
        }
        return new zzrg(arrayList);
    }
}
