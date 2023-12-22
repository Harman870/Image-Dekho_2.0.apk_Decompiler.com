package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmi extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzqz[] zzqzArr2 = zzqzArr;
        boolean z9 = false;
        o.b(zzqzArr2.length == 2);
        double zzb = zzjx.zzb(zzqzArr2[0]);
        double zzb2 = zzjx.zzb(zzqzArr2[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        boolean z10 = ((double) Double.compare(zzb, 0.0d)) < 0.0d;
        if (((double) Double.compare(zzb2, 0.0d)) < 0.0d) {
            z9 = true;
        }
        boolean z11 = z9 ^ z10;
        double d10 = Double.POSITIVE_INFINITY;
        if (Double.isInfinite(zzb) && !Double.isInfinite(zzb2)) {
            if (true == z11) {
                d10 = Double.NEGATIVE_INFINITY;
            }
            return new zzrb(Double.valueOf(d10));
        } else if (!Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzrb(Double.valueOf(0.0d));
        } else {
            int i10 = (zzb > 0.0d ? 1 : (zzb == 0.0d ? 0 : -1));
            if (i10 == 0) {
                return zzb2 == 0.0d ? new zzrb(Double.valueOf(Double.NaN)) : new zzrb(Double.valueOf(0.0d));
            }
            if (Double.isInfinite(zzb) || i10 == 0 || zzb2 != 0.0d) {
                return new zzrb(Double.valueOf(zzb / zzb2));
            }
            if (true == z11) {
                d10 = Double.NEGATIVE_INFINITY;
            }
            return new zzrb(Double.valueOf(d10));
        }
    }
}
