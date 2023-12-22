package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzqj {
    private final List zza;
    private final Map zzb;
    private final String zzc;

    public zzqj(List list, Map map, String str, int i10) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableMap(map);
        this.zzc = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return "Rules: " + valueOf + "\n  Macros: " + valueOf2;
    }

    public final zzqm zza(String str) {
        return (zzqm) this.zzb.get(str);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final List zzc() {
        return this.zza;
    }
}
