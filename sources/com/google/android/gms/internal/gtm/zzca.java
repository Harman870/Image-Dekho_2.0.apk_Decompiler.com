package com.google.android.gms.internal.gtm;

import i3.t;

final class zzca extends zzcy {
    public final /* synthetic */ zzce zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzca(zzce zzce, zzbx zzbx) {
        super(zzbx);
        this.zza = zzce;
    }

    public final void zza() {
        zzce zzce = this.zza;
        t.a();
        if (zzce.zzg()) {
            zzce.zzN("Inactivity, disconnecting from device AnalyticsService");
            zzce.zzc();
        }
    }
}
