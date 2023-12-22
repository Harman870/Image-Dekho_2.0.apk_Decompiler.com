package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i3.t;
import r3.o;

public final class zzbs extends zzbu {
    /* access modifiers changed from: private */
    public final zzcm zza;

    public zzbs(zzbx zzbx, zzby zzby) {
        super(zzbx);
        o.h(zzby);
        this.zza = new zzcm(zzbx, zzby);
    }

    public final long zza(zzbz zzbz) {
        zzV();
        o.h(zzbz);
        t.a();
        long zzb = this.zza.zzb(zzbz, true);
        if (zzb != 0) {
            return zzb;
        }
        this.zza.zzk(zzbz);
        return 0;
    }

    public final void zzc() {
        zzV();
        Context zzo = zzo();
        if (!zzfk.zza(zzo) || !zzfp.zzh(zzo)) {
            zze((zzdb) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
        zzo.startService(intent);
    }

    public final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzdb zzdb) {
        zzV();
        t zzq = zzq();
        zzbq zzbq = new zzbq(this, zzdb);
        zzq.getClass();
        zzq.f7164c.submit(zzbq);
    }

    public final void zzh(zzez zzez) {
        o.h(zzez);
        zzV();
        zzF("Hit delivery requested", zzez);
        t zzq = zzq();
        zzbo zzbo = new zzbo(this, zzez);
        zzq.getClass();
        zzq.f7164c.submit(zzbo);
    }

    public final void zzi() {
        t.a();
        this.zza.zzl();
    }

    public final void zzj() {
        t.a();
        this.zza.zzm();
    }

    public final void zzk() {
        zzV();
        t.a();
        zzcm zzcm = this.zza;
        t.a();
        zzcm.zzV();
        zzcm.zzN("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzZ();
    }
}
