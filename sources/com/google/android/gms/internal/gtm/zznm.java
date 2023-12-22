package com.google.android.gms.internal.gtm;

import android.content.Context;
import r3.o;

public final class zznm implements zzjw {
    private final zzgg zza;

    public zznm(Context context) {
        this.zza = zzgg.zzb(context);
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        String zzc = this.zza.zzc();
        return zzc == null ? zzrd.zze : new zzrk(zzc);
    }
}
