package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import p3.h;

public final class zzpv implements h {
    private final Status zza;
    private final int zzb;
    private final zzpu zzc;
    private final zzqs zzd;

    public zzpv(Status status, int i10, zzpu zzpu, zzqs zzqs) {
        this.zza = status;
        this.zzb = i10;
        this.zzc = zzpu;
        this.zzd = zzqs;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzpu zzb() {
        return this.zzc;
    }

    public final zzqs zzc() {
        return this.zzd;
    }

    public final String zzd() {
        int i10 = this.zzb;
        if (i10 == 0) {
            return "Network";
        }
        if (i10 == 1) {
            return "Saved file on disk";
        }
        if (i10 == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }
}
