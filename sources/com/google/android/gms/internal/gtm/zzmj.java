package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmj extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        int i10;
        o.b(zzqzArr.length == 2);
        double zzb = zzjx.zzb(zzqzArr[0]);
        double zzb2 = zzjx.zzb(zzqzArr[1]);
        return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? new zzrb(Double.valueOf(Double.NaN)) : (Double.isInfinite(zzb) || zzb2 == 0.0d) ? new zzrb(Double.valueOf(Double.NaN)) : (Double.isInfinite(zzb) || !Double.isInfinite(zzb2)) ? (zzb != 0.0d || i10 == 0 || Double.isInfinite(zzb2)) ? new zzrb(Double.valueOf(zzb % zzb2)) : new zzrb(Double.valueOf(zzb)) : new zzrb(Double.valueOf(zzb));
    }
}
