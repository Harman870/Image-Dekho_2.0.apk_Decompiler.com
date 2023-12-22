package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmx extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        if (zzqzArr.length != 1) {
            z9 = false;
        }
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrk);
        return new zzrk(zzqzArr[0].zzk().toUpperCase());
    }
}
