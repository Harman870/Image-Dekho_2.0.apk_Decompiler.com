package com.google.android.gms.internal.gtm;

import r3.o;

public final class zznu implements zzjw {
    private final zzqz zza;

    public zznu(zzqz zzqz) {
        o.h(zzqz);
        this.zza = zzqz;
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        return this.zza;
    }
}
