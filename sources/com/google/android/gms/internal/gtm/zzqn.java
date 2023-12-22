package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

public final class zzqn {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final List zzd = new ArrayList();

    public final zzqn zza(zzqm zzqm) {
        this.zzc.add(zzqm);
        return this;
    }

    public final zzqn zzb(zzqm zzqm) {
        this.zzb.add(zzqm);
        return this;
    }

    public final zzqn zzc(zzqm zzqm) {
        this.zza.add(zzqm);
        return this;
    }

    public final zzqn zzd(zzqm zzqm) {
        this.zzd.add(zzqm);
        return this;
    }

    public final zzqp zze() {
        return new zzqp(this.zza, this.zzb, this.zzc, this.zzd, (zzqo) null);
    }
}
