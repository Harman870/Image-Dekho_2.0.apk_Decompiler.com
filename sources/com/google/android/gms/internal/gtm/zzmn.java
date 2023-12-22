package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmn extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr.length > 0);
        o.b(zzqzArr[0] instanceof zzrk);
        StringBuilder sb = new StringBuilder(zzqzArr[0].zzk());
        for (int i10 = 1; i10 < zzqzArr.length; i10++) {
            sb.append(zzjx.zzd(zzqzArr[i10]));
        }
        return new zzrk(sb.toString());
    }
}
