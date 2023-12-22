package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import r3.o;

public final class zzma implements zzjw {
    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr != null);
        ArrayList arrayList = new ArrayList(r1);
        for (zzqz add : zzqzArr) {
            arrayList.add(add);
        }
        return new zzrg(arrayList);
    }
}
