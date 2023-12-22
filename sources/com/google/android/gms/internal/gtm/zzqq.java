package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

public final class zzqq {
    private final List zza = new ArrayList();
    private String zzb;

    public final zzqq zza(zzjv zzjv) {
        this.zza.add(zzjv);
        return this;
    }

    public final zzqq zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzqs zzc() {
        return new zzqs(this.zzb, this.zza, (zzqr) null);
    }
}
