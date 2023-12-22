package com.google.android.gms.internal.gtm;

import r3.o;

public abstract class zzjy implements zzjw {
    public abstract zzqz zza(zzie zzie, zzqz... zzqzArr);

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        zzqz[] zzqzArr2 = new zzqz[zzqzArr.length];
        for (int i10 = 0; i10 < zzqzArr.length; i10++) {
            o.b(zzqzArr[i10] != null);
            zzrd zzrd = zzqzArr[i10];
            zzrd zzrd2 = zzrd.zzb;
            o.b(zzrd != zzrd2);
            zzrd zzrd3 = zzqzArr[i10];
            zzrd zzrd4 = zzrd.zzc;
            o.b(zzrd3 != zzrd4);
            zzqz zzc = zzrl.zzc(zzie, zzqzArr[i10]);
            zzqzArr2[i10] = zzc;
            o.b(zzc != zzrd2);
            o.b(zzqzArr2[i10] != zzrd4);
        }
        zzqz zza = zza(zzie, zzqzArr2);
        if (zza == null) {
            z9 = false;
        }
        o.k(z9);
        return zza;
    }
}
