package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Map;

public final class zzqm {
    private final Map zza;
    private final zzqv zzb;

    public /* synthetic */ zzqm(Map map, zzqv zzqv, zzql zzql) {
        this.zza = Collections.unmodifiableMap(map);
        this.zzb = zzqv;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return "Properties: " + valueOf + " pushAfterEvaluate: " + valueOf2;
    }

    public final Map zza() {
        return this.zza;
    }
}
