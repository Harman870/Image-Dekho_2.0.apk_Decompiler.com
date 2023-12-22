package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import i3.t;
import java.util.Collections;
import r3.o;
import v3.a;

public final class zzce extends zzbu {
    /* access modifiers changed from: private */
    public final zzcd zza = new zzcd(this);
    private final zzcy zzb;
    private final zzfq zzc;
    private zzfa zzd;

    public zzce(zzbx zzbx) {
        super(zzbx);
        this.zzc = new zzfq(zzbx.zzr());
        this.zzb = new zzca(this, zzbx);
    }

    public static /* synthetic */ void zzb(zzce zzce, ComponentName componentName) {
        t.a();
        if (zzce.zzd != null) {
            zzce.zzd = null;
            zzce.zzO("Disconnected from device AnalyticsService", componentName);
            zzce.zzs().zzk();
        }
    }

    public static /* synthetic */ void zzi(zzce zzce, zzfa zzfa) {
        t.a();
        zzce.zzd = zzfa;
        zzce.zzj();
        zzce.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzcy zzcy = this.zzb;
        zzw();
        zzcy.zzg(((Long) zzew.zzK.zzb()).longValue());
    }

    public final void zzc() {
        t.a();
        zzV();
        try {
            a.b().c(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    public final void zzd() {
    }

    public final boolean zzf() {
        t.a();
        zzV();
        if (this.zzd != null) {
            return true;
        }
        zzfa zza2 = this.zza.zza();
        if (zza2 == null) {
            return false;
        }
        this.zzd = zza2;
        zzj();
        return true;
    }

    public final boolean zzg() {
        t.a();
        zzV();
        return this.zzd != null;
    }

    public final boolean zzh(zzez zzez) {
        o.h(zzez);
        t.a();
        zzV();
        zzfa zzfa = this.zzd;
        if (zzfa == null) {
            return false;
        }
        boolean zzh = zzez.zzh();
        zzw();
        try {
            zzfa.zzf(zzez.zzg(), zzez.zzd(), zzh ? zzcv.zzi() : zzcv.zzk(), Collections.emptyList());
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzN("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
