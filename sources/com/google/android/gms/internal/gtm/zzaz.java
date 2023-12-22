package com.google.android.gms.internal.gtm;

import i3.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzaz extends n {
    private final Map zza = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put("dimension".concat(valueOf), entry.getValue());
        }
        return n.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(n nVar) {
        ((zzaz) nVar).zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}
