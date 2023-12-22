package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzky extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = false;
        o.b(zzqzArr.length == 2);
        zzrk zzrk = zzqzArr[0];
        boolean z10 = zzrk instanceof zzrh;
        zzrk zzrk2 = zzqzArr[1];
        if (z10 || (zzrk instanceof zzrg) || (zzrk instanceof zzrc)) {
            zzrk = new zzrk(zzjx.zzd(zzrk));
        }
        if ((zzrk2 instanceof zzrh) || (zzrk2 instanceof zzrg) || (zzrk2 instanceof zzrc)) {
            zzrk2 = new zzrk(zzjx.zzd(zzrk2));
        }
        if (((zzrk instanceof zzrk) && (zzrk2 instanceof zzrk)) || (!Double.isNaN(zzjx.zzb(zzrk)) && !Double.isNaN(zzjx.zzb(zzrk2)))) {
            z9 = !zzjx.zzf(zzrk, zzrk2);
        }
        return new zzra(Boolean.valueOf(z9));
    }
}
