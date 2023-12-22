package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import r3.o;

public final class zznf extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        if (zzqzArr.length > 0) {
            zzrd = zzqzArr[0];
            o.h(zzrd);
        } else {
            zzrd = zzrd.zze;
        }
        try {
            return new zzrk(zzne.zzb(zzjx.zzd(zzrd), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.!~*'()"));
        } catch (UnsupportedEncodingException unused) {
            return zzrd.zze;
        }
    }
}
