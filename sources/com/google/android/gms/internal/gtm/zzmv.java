package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmv extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        int length = zzqzArr.length;
        o.b(length > 0 && length <= 3);
        o.b(zzqzArr[0] instanceof zzrk);
        String zzk = zzqzArr[0].zzk();
        int zza = (int) zzjx.zza(length < 2 ? zzrd.zze : zzqzArr[1]);
        int length2 = zzk.length();
        if (length == 3 && (zzrd = zzqzArr[2]) != zzrd.zze) {
            length2 = (int) zzjx.zza(zzrl.zzc(zzie, zzrd));
        }
        int min = Math.min(Math.max(zza, 0), zzk.length());
        int min2 = Math.min(Math.max(length2, 0), zzk.length());
        return new zzrk(zzk.substring(Math.min(min, min2), Math.max(min, min2)));
    }
}
