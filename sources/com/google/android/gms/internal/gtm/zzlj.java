package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlj implements zzjw {
    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr != null);
        o.b(zzqzArr.length == 3);
        zzqz zzc = zzrl.zzc(zzie, zzjx.zzg(zzrl.zzc(zzie, zzqzArr[0])) ? zzqzArr[1] : zzqzArr[2]);
        if (!(zzc instanceof zzrd) || zzc == zzrd.zze || zzc == zzrd.zzd) {
            return zzc;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
