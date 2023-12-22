package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class zzie {
    private zzie zza;
    private Map zzb;

    public zzie() {
        this((zzie) null);
    }

    private zzie(zzie zzie) {
        this.zzb = null;
        this.zza = zzie;
    }

    public final zzie zza() {
        return new zzie(this);
    }

    public final zzqz zzb(String str) {
        Map map = this.zzb;
        if (map != null && map.containsKey(str)) {
            return (zzqz) this.zzb.get(str);
        }
        zzie zzie = this.zza;
        if (zzie != null) {
            return zzie.zzb(str);
        }
        throw new IllegalStateException("Trying to get a non existent symbol: ".concat(String.valueOf(str)));
    }

    public final void zzc(String str, zzqz zzqz) {
        if (this.zzb == null) {
            this.zzb = new HashMap();
        }
        this.zzb.put(str, zzqz);
    }

    public final void zzd(String str) {
        o.k(zzf("gtm.globals.eventName"));
        Map map = this.zzb;
        if (map == null || !map.containsKey("gtm.globals.eventName")) {
            this.zza.zzd("gtm.globals.eventName");
        } else {
            this.zzb.remove("gtm.globals.eventName");
        }
    }

    public final void zze(String str, zzqz zzqz) {
        Map map = this.zzb;
        if (map == null || !map.containsKey(str)) {
            zzie zzie = this.zza;
            if (zzie != null) {
                zzie.zze(str, zzqz);
                return;
            }
            throw new IllegalStateException("Trying to modify a non existent symbol: ".concat(String.valueOf(str)));
        }
        this.zzb.put(str, zzqz);
    }

    public final boolean zzf(String str) {
        Map map = this.zzb;
        if (map != null && map.containsKey(str)) {
            return true;
        }
        zzie zzie = this.zza;
        if (zzie != null) {
            return zzie.zzf(str);
        }
        return false;
    }
}
