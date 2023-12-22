package com.google.android.gms.internal.gtm;

import java.util.HashMap;

public final class zzlr extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < zzqzArr.length - 1) {
            String zzd = zzjx.zzd(zzqzArr[i10]);
            zzrd zzrd = zzqzArr[i10 + 1];
            if (!(zzrd instanceof zzrd) || zzrd == zzrd.zzd || zzrd == zzrd.zze) {
                hashMap.put(zzd, zzrd);
                i10 += 2;
            } else {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
        }
        return new zzrh(hashMap);
    }
}
