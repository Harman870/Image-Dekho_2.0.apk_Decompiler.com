package com.google.android.gms.internal.gtm;

public final /* synthetic */ class zzfm implements Runnable {
    public final /* synthetic */ zzfp zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzfd zzc;

    public /* synthetic */ zzfm(zzfp zzfp, int i10, zzfd zzfd) {
        this.zza = zzfp;
        this.zzb = i10;
        this.zzc = zzfd;
    }

    public final void run() {
        this.zza.zzc(this.zzb, this.zzc);
    }
}
