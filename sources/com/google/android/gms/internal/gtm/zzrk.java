package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r3.o;

public final class zzrk extends zzqz {
    private static final Map zzb;
    /* access modifiers changed from: private */
    public final String zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("charAt", new zzmm());
        hashMap.put("concat", new zzmn());
        hashMap.put("hasOwnProperty", zzlx.zza);
        hashMap.put("indexOf", new zzmo());
        hashMap.put("lastIndexOf", new zzmp());
        hashMap.put("match", new zzmq());
        hashMap.put("replace", new zzmr());
        hashMap.put("search", new zzms());
        hashMap.put("slice", new zzmt());
        hashMap.put("split", new zzmu());
        hashMap.put("substring", new zzmv());
        hashMap.put("toLocaleLowerCase", new zzmw());
        hashMap.put("toLocaleUpperCase", new zzmx());
        hashMap.put("toLowerCase", new zzmy());
        hashMap.put("toUpperCase", new zzna());
        hashMap.put("toString", new zzmz());
        hashMap.put("trim", new zznb());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzrk(String str) {
        o.h(str);
        this.zzc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrk)) {
            return false;
        }
        return this.zzc.equals(((zzrk) obj).zzc);
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException(w0.d("Native Method ", str, " is not defined for type ListWrapper."));
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final Iterator zze() {
        return new zzrj(this);
    }

    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzqz zzi(int i10) {
        return (i10 < 0 || i10 >= this.zzc.length()) ? zzrd.zze : new zzrk(String.valueOf(this.zzc.charAt(i10)));
    }

    public final String zzk() {
        return this.zzc;
    }
}
