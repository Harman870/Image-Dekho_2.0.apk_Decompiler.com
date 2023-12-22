package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r3.o;

public final class zzrh extends zzqz {
    private static final Map zzb;
    private boolean zzc = false;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzlx.zza);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzrh(Map map) {
        o.h(map);
        this.zza = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrh)) {
            return false;
        }
        return this.zza.entrySet().equals(((zzrh) obj).zza.entrySet());
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException(w0.d("Native Method ", str, " is not defined for type ListWrapper."));
    }

    public final zzqz zzb(String str) {
        zzqz zzb2 = super.zzb(str);
        return zzb2 == null ? zzrd.zze : zzb2;
    }

    public final /* synthetic */ Object zzc() {
        return this.zza;
    }

    public final Iterator zze() {
        return zzd();
    }

    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Map zzi() {
        return this.zza;
    }

    public final void zzj() {
        this.zzc = true;
    }

    public final boolean zzk() {
        return this.zzc;
    }
}
