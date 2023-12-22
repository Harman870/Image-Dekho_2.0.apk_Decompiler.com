package com.google.android.gms.internal.gtm;

import java.util.List;
import r3.o;

public final class zzkh extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.h(zzqzArr);
        boolean z9 = true;
        if (zzqzArr.length != 1) {
            z9 = false;
        }
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrg);
        List zzk = zzqzArr[0].zzk();
        return !zzk.isEmpty() ? (zzqz) zzk.remove(zzk.size() - 1) : zzrd.zze;
    }
}
