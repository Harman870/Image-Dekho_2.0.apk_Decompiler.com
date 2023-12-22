package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmt extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        int length = zzqzArr.length;
        o.b(length > 0 && length <= 3);
        o.b(zzqzArr[0] instanceof zzrk);
        String zzk = zzqzArr[0].zzk();
        double zza = length < 2 ? 0.0d : zzjx.zza(zzqzArr[1]);
        double length2 = (double) zzk.length();
        if (length == 3 && (zzrd = zzqzArr[2]) != zzrd.zze) {
            length2 = zzjx.zza(zzrd);
        }
        int max = (int) (zza < 0.0d ? Math.max(((double) zzk.length()) + zza, 0.0d) : Math.min(zza, (double) zzk.length()));
        return new zzrk(zzk.substring(max, Math.max(0, ((int) (length2 < 0.0d ? Math.max(((double) zzk.length()) + length2, 0.0d) : Math.min(length2, (double) zzk.length()))) - max) + max));
    }
}
