package com.google.android.gms.internal.gtm;

import r3.o;

public final class zznv implements zzjw {
    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        return zzie.zzf("gtm.globals.eventName") ? zzie.zzb("gtm.globals.eventName") : zzrd.zzd;
    }
}
