package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import com.google.android.gms.tagmanager.zzck;

final class zzit extends zzck {
    public final /* synthetic */ zzjh zza;

    public zzit(zzjh zzjh) {
        this.zza = zzjh;
    }

    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.zzg.execute(new zzis(this, str2, bundle, String.valueOf(str).concat("+gtm"), j10, str));
    }
}
