package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
import r3.o;

public final class zzqt {
    private final Integer zza;
    private final Object zzb;
    private final List zzc = new ArrayList();
    private boolean zzd = false;

    public zzqt(int i10, Object obj) {
        this.zza = Integer.valueOf(i10);
        this.zzb = obj;
    }

    public final zzqt zza(int i10) {
        this.zzc.add(Integer.valueOf(i10));
        return this;
    }

    public final zzqt zzb(boolean z9) {
        this.zzd = true;
        return this;
    }

    public final zzqv zzc() {
        o.h(this.zza);
        o.h(this.zzb);
        return new zzqv(this.zza, this.zzb, this.zzc, this.zzd, (zzqu) null);
    }
}
