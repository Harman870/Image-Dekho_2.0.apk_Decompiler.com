package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzqi {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private String zzc = "";

    public final zzqi zza(zzqm zzqm) {
        this.zzb.put(((zzqv) zzqm.zza().get("instance_name")).toString(), zzqm);
        return this;
    }

    public final zzqi zzb(zzqp zzqp) {
        this.zza.add(zzqp);
        return this;
    }

    public final zzqi zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzqj zzd() {
        return new zzqj(this.zza, this.zzb, this.zzc, 0);
    }
}
