package com.google.android.gms.internal.gtm;

import android.os.Build;
import r3.o;

public final class zznz implements zzjw {
    private final String zza = Build.MODEL;

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        return new zzrk(this.zza);
    }
}
