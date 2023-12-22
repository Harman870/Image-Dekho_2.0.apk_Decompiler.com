package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import com.google.android.gms.tagmanager.zzch;

final class zziv extends zzch {
    public final /* synthetic */ zzjh zza;

    public zziv(zzjh zzjh) {
        this.zza = zzjh;
    }

    public final void zze(String str, String str2, Bundle bundle, long j10) {
        String str3 = str;
        if (!str.endsWith("+gtm")) {
            this.zza.zzg.execute(new zziu(this, str2, bundle, str.concat("+gtm"), j10, str));
        }
    }
}
