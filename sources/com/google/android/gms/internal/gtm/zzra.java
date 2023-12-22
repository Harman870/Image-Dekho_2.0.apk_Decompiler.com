package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class zzra extends zzqz {
    private static final Map zzb;
    private final Boolean zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzlx.zza);
        hashMap.put("toString", new zzmz());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzra(Boolean bool) {
        o.h(bool);
        this.zzc = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzra)) {
            return false;
        }
        return ((zzra) obj).zzc.equals(this.zzc);
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException(w0.d("Native Method ", str, " is not defined for type BooleanWrapper."));
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Boolean zzi() {
        return this.zzc;
    }
}
