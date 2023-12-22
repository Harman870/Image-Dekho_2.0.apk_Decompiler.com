package com.google.android.gms.internal.gtm;

public final class zzoo extends zzjy {
    private static final zzrb zza = new zzrb(Double.valueOf(0.0d));
    private static final zzrb zzb = new zzrb(Double.valueOf(2.147483647E9d));

    private static final boolean zzb(zzqz zzqz) {
        return (zzqz instanceof zzrb) && !Double.isNaN(((zzrb) zzqz).zzi().doubleValue());
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        int length = zzqzArr.length;
        zzrb zzrb = length > 0 ? zzqzArr[0] : zza;
        zzrb zzrb2 = length > 1 ? zzqzArr[1] : zzb;
        double d10 = 0.0d;
        double d11 = 2.147483647E9d;
        if (zzb(zzrb) && zzb(zzrb2) && zzjx.zzf(zzrb, zzrb2)) {
            d10 = zzrb.zzi().doubleValue();
            d11 = zzrb2.zzi().doubleValue();
        }
        return new zzrb(Double.valueOf((double) Math.round(((d11 - d10) * Math.random()) + d10)));
    }
}
