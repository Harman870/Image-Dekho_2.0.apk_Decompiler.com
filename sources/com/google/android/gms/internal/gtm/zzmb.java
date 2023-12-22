package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmb extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        int length = zzqzArr.length;
        boolean z9 = true;
        if (length > 1) {
            z9 = false;
        }
        o.b(z9);
        return new zzrd((zzqz) length <= 0 ? zzrd.zze : zzqzArr[0]);
    }
}
