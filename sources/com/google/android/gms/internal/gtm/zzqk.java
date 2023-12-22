package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;

public final class zzqk {
    private final Map zza = new HashMap();
    private zzqv zzb;

    public final zzqk zza(String str, zzqv zzqv) {
        this.zza.put(str, zzqv);
        return this;
    }

    public final zzqk zzb(zzqv zzqv) {
        this.zzb = zzqv;
        return this;
    }

    public final zzqm zzc() {
        return new zzqm(this.zza, this.zzb, (zzql) null);
    }
}
