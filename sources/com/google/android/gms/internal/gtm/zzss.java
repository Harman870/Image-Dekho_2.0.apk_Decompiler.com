package com.google.android.gms.internal.gtm;

import javax.annotation.CheckForNull;

final class zzss extends zzst {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzst zzc;

    public zzss(zzst zzst, int i10, int i11) {
        this.zzc = zzst;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzsl.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @CheckForNull
    public final Object[] zze() {
        return this.zzc.zze();
    }

    /* renamed from: zzf */
    public final zzst subList(int i10, int i11) {
        zzsl.zzc(i10, i11, this.zzb);
        zzst zzst = this.zzc;
        int i12 = this.zza;
        return zzst.subList(i10 + i12, i11 + i12);
    }
}
