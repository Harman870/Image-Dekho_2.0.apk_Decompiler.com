package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import r3.o;

public final class zzlq extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        ArrayList arrayList = new ArrayList();
        for (zzrd zzrd : zzqzArr) {
            boolean z9 = true;
            if (!(!(zzrd instanceof zzrd) || zzrd == zzrd.zze || zzrd == zzrd.zzd)) {
                z9 = false;
            }
            o.b(z9);
            arrayList.add(zzrd);
        }
        return new zzrg(arrayList);
    }
}
