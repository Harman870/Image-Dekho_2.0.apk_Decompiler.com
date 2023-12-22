package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmp extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9;
        int length = zzqzArr.length;
        if (length != 2) {
            if (length == 3) {
                length = 3;
            } else {
                z9 = false;
                o.b(z9);
                o.b(zzqzArr[0] instanceof zzrk);
                String zzk = zzqzArr[0].zzk();
                String zzd = zzjx.zzd(zzqzArr[1]);
                double d10 = Double.POSITIVE_INFINITY;
                if (length == 3 && !Double.isNaN(zzjx.zzb(zzqzArr[2]))) {
                    d10 = zzjx.zza(zzqzArr[2]);
                }
                return new zzrb(Double.valueOf((double) zzk.lastIndexOf(zzd, (int) Math.min(Math.max(d10, 0.0d), (double) zzk.length()))));
            }
        }
        z9 = true;
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrk);
        String zzk2 = zzqzArr[0].zzk();
        String zzd2 = zzjx.zzd(zzqzArr[1]);
        double d102 = Double.POSITIVE_INFINITY;
        d102 = zzjx.zza(zzqzArr[2]);
        return new zzrb(Double.valueOf((double) zzk2.lastIndexOf(zzd2, (int) Math.min(Math.max(d102, 0.0d), (double) zzk2.length()))));
    }
}
