package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import r3.o;

public final class zzph {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final String zze;
    private final String zzf = "";

    public zzph(String str, String str2, String str3, boolean z9, String str4, String str5) {
        o.h(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z9;
        this.zze = str4;
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        String str = this.zzc;
        if (str != null) {
            return w0.d(str, "_", this.zza);
        }
        return this.zza;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzd;
    }
}
