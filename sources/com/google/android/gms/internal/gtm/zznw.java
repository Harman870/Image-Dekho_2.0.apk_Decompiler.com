package com.google.android.gms.internal.gtm;

import r3.o;
import w3.b;
import y3.a;

public final class zznw implements zzjw {
    private b zza = a.P;

    public final void zza(b bVar) {
        o.h(bVar);
        this.zza = bVar;
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        return new zzrb(Double.valueOf((double) this.zza.currentTimeMillis()));
    }
}
