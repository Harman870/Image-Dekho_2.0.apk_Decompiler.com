package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlm extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr.length == 2);
        o.b(zzqzArr[0] instanceof zzrk);
        String zzk = zzqzArr[0].zzk();
        if (zzie.zzf(zzk)) {
            zzie.zze(zzk, zzqzArr[1]);
            return zzqzArr[1];
        }
        throw new IllegalStateException("Attempting to assign to undefined variable ".concat(String.valueOf(zzk)));
    }
}
