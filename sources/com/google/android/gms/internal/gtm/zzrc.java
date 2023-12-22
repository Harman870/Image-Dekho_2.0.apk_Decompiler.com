package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzrc extends zzqz {
    private static final Map zzb;
    private final zzjw zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzlx.zza);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzrc(zzjw zzjw) {
        this.zzc = zzjw;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException(w0.d("Native Method ", str, " is not defined for type InstructionReference."));
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final Iterator zze() {
        return zzd();
    }

    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzjw zzi() {
        return this.zzc;
    }
}
