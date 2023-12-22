package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmk extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = false;
        o.b(zzqzArr.length == 2);
        double zzb = zzjx.zzb(zzqzArr[0]);
        double zzb2 = zzjx.zzb(zzqzArr[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        if ((Double.isInfinite(zzb) && zzb2 == 0.0d) || (zzb == 0.0d && Double.isInfinite(zzb2))) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        if (!Double.isInfinite(zzb) && !Double.isInfinite(zzb2)) {
            return new zzrb(Double.valueOf(zzb * zzb2));
        }
        boolean z10 = ((double) Double.compare(zzb, 0.0d)) < 0.0d;
        if (((double) Double.compare(zzb2, 0.0d)) < 0.0d) {
            z9 = true;
        }
        return new zzrb(Double.valueOf(true != (z10 ^ z9) ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY));
    }
}
