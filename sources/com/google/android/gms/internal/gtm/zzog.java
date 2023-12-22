package com.google.android.gms.internal.gtm;

import android.content.Context;
import r3.o;

public final class zzog implements zzjw {
    private final Context zza;

    public zzog(Context context) {
        o.h(context);
        this.zza = context;
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        o.b(zzqzArr != null);
        String str = null;
        if (zzqzArr.length > 0 && (zzrd = zzqzArr[0]) != zzrd.zze) {
            str = zzjx.zzd(zzrl.zzc(zzie, zzrd));
        }
        String zzb = zzhn.zzb(this.zza, str);
        return zzb != null ? new zzrk(zzb) : zzrd.zze;
    }
}
