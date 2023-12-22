package com.google.android.gms.internal.gtm;

import r3.o;
import w3.b;

final class zzfq {
    private final b zza;
    private long zzb;

    public zzfq(b bVar) {
        o.h(bVar);
        this.zza = bVar;
    }

    public zzfq(b bVar, long j10) {
        o.h(bVar);
        this.zza = bVar;
        this.zzb = j10;
    }

    public final void zza() {
        this.zzb = 0;
    }

    public final void zzb() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zzc(long j10) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb > j10;
    }
}
