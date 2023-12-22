package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmf implements zzjw {
    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (r2 <= 0) {
            z9 = false;
        }
        o.b(z9);
        for (zzrk zzrk : zzqzArr) {
            o.h(zzrk);
            o.b(zzrk instanceof zzrk);
            zzie.zzc(zzrk.zzk(), zzrd.zze);
        }
        return zzrd.zze;
    }
}
