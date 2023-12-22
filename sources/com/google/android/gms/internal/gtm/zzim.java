package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

final class zzim implements zzij {
    public final /* synthetic */ zzin zza;
    private final Handler zzb;

    public /* synthetic */ zzim(zzin zzin, zzil zzil) {
        this.zza = zzin;
        this.zzb = new zzgc(zzin.zzc.getMainLooper(), new zzik(this));
    }

    private final Message zzd() {
        return this.zzb.obtainMessage(1, zzin.zza);
    }

    public final void zza() {
        this.zzb.removeMessages(1, zzin.zza);
    }

    public final void zzb() {
        this.zzb.removeMessages(1, zzin.zza);
        this.zzb.sendMessage(zzd());
    }

    public final void zzc(long j10) {
        this.zzb.removeMessages(1, zzin.zza);
        this.zzb.sendMessageDelayed(zzd(), 1800000);
    }
}
