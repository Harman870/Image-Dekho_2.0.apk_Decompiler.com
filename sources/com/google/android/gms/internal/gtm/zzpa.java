package com.google.android.gms.internal.gtm;

import r3.o;

public abstract class zzpa extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr.length == 2);
        try {
            double zzb = zzjx.zzb(zzqzArr[0]);
            double zzb2 = zzjx.zzb(zzqzArr[1]);
            return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? new zzra(Boolean.FALSE) : new zzra(Boolean.valueOf(zzb(zzb, zzb2)));
        } catch (IllegalArgumentException unused) {
            return new zzra(Boolean.FALSE);
        }
    }

    public abstract boolean zzb(double d10, double d11);
}
