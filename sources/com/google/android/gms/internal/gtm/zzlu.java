package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlu implements zzjw {
    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 1) {
            z9 = false;
        }
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrk);
        zzqz zzb = zzie.zzb(zzqzArr[0].zzk());
        if (zzb instanceof zzri) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        } else if (!(zzb instanceof zzrd) || zzb == zzrd.zze || zzb == zzrd.zzd) {
            return zzb;
        } else {
            throw new IllegalStateException("Illegal InternalType encountered in Get.");
        }
    }
}
