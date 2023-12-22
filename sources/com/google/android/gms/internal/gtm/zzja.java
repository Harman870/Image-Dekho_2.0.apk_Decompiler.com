package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class zzja implements ComponentCallbacks2 {
    public final /* synthetic */ zzjh zza;

    public zzja(zzjh zzjh) {
        this.zza = zzjh;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20) {
            this.zza.zzg.execute(new zziz(this));
        }
    }
}
