package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

final class zzik implements Handler.Callback {
    public final /* synthetic */ zzim zza;

    public zzik(zzim zzim) {
        this.zza = zzim;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1 && zzin.zza.equals(message.obj)) {
            this.zza.zza.zzi();
            zzim zzim = this.zza;
            if (!zzim.zza.zzn()) {
                zzim.zzc(1800000);
            }
        }
        return true;
    }
}
