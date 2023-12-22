package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmh extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr.length == 2);
        zzrd zzrd = zzqzArr[0];
        boolean z9 = zzrd instanceof zzrd;
        zzrd zzrd2 = zzqzArr[1];
        if ((!z9 || zzrd == zzrd.zze || zzrd == zzrd.zzd) && (!(zzrd2 instanceof zzrd) || zzrd2 == zzrd.zze || zzrd2 == zzrd.zzd)) {
            if ((zzrd instanceof zzrh) || (zzrd instanceof zzrg) || (zzrd instanceof zzrc)) {
                zzrd = new zzrk(zzjx.zzd(zzrd));
            }
            if ((zzrd2 instanceof zzrh) || (zzrd2 instanceof zzrg) || (zzrd2 instanceof zzrc)) {
                zzrd2 = new zzrk(zzjx.zzd(zzrd2));
            }
            if (!(zzrd instanceof zzrk) && !(zzrd2 instanceof zzrk)) {
                return new zzrb(Double.valueOf(zzjx.zzc(zzrd, zzrd2)));
            }
            return new zzrk(String.valueOf(zzjx.zzd(zzrd)).concat(String.valueOf(zzjx.zzd(zzrd2))));
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Add.");
    }
}
