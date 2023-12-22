package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import r3.o;

public final class zznd extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        if (zzqzArr.length > 0) {
            zzrd = zzqzArr[0];
            o.h(zzrd);
        } else {
            zzrd = zzrd.zze;
        }
        try {
            return new zzrk(zznc.zzb(zzjx.zzd(zzrd), ""));
        } catch (UnsupportedEncodingException unused) {
            return zzrd.zze;
        }
    }
}
