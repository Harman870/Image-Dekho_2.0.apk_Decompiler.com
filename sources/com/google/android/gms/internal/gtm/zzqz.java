package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class zzqz {
    public Map zza;

    public abstract String toString();

    public zzjw zza(String str) {
        throw new IllegalStateException(w0.d("Attempting to access Native Method ", str, " on unsupported type."));
    }

    public zzqz zzb(String str) {
        Map map = this.zza;
        return map != null ? (zzqz) map.get(str) : zzrd.zze;
    }

    public abstract Object zzc();

    public final Iterator zzd() {
        Map map = this.zza;
        return map == null ? new zzqy((zzqx) null) : new zzqw(this, map.keySet().iterator());
    }

    public Iterator zze() {
        return new zzqy((zzqx) null);
    }

    public final void zzf(String str, zzqz zzqz) {
        if (this.zza == null) {
            this.zza = new HashMap();
        }
        this.zza.put(str, zzqz);
    }

    public boolean zzg(String str) {
        return false;
    }

    public final boolean zzh(String str) {
        Map map = this.zza;
        return map != null && map.containsKey(str);
    }
}
