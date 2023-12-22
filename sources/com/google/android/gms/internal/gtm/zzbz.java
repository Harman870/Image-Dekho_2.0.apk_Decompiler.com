package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class zzbz {
    private final String zza;
    private final String zzb;
    private final boolean zzc;
    private long zzd;
    private final Map zze;

    public zzbz(long j10, String str, String str2, boolean z9, long j11, Map map) {
        o.e(str);
        o.e(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z9;
        this.zzd = j11;
        this.zze = map != null ? new HashMap(map) : Collections.emptyMap();
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final Map zzd() {
        return this.zze;
    }

    public final void zze(long j10) {
        this.zzd = j10;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
