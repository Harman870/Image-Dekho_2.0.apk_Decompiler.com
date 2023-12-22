package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class zzrb extends zzqz {
    private static final Map zzb;
    private final Double zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzlx.zza);
        hashMap.put("toString", new zzmz());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzrb(Double d10) {
        o.h(d10);
        this.zzc = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrb)) {
            return false;
        }
        return this.zzc.equals(((zzrb) obj).zzc);
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException(w0.d("Native Method ", str, " is not defined for type DoubleWrapper."));
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Double zzi() {
        return this.zzc;
    }
}
