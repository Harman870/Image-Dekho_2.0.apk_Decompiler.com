package com.google.android.gms.internal.gtm;

import android.content.Context;
import r3.o;

public final class zznn implements zzjw {
    private final zzgg zza;

    public zznn(Context context) {
        this.zza = zzgg.zzb(context);
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = false;
        o.b(zzqzArr != null);
        if (zzqzArr.length == 0) {
            z9 = true;
        }
        o.b(z9);
        return new zzra(Boolean.valueOf(!this.zza.zzf()));
    }
}
