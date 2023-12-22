package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tagmanager.zzco;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r3.o;
import w3.b;

public final class zzgs {
    /* access modifiers changed from: private */
    public final Context zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public final String zzc;
    /* access modifiers changed from: private */
    public final String zzd;
    /* access modifiers changed from: private */
    public final zzid zze;
    /* access modifiers changed from: private */
    public final zzpo zzf;
    /* access modifiers changed from: private */
    public final ExecutorService zzg;
    private final ScheduledExecutorService zzh;
    /* access modifiers changed from: private */
    public final zzco zzi;
    /* access modifiers changed from: private */
    public final b zzj;
    /* access modifiers changed from: private */
    public final zzgu zzk;
    /* access modifiers changed from: private */
    public zzic zzl;
    /* access modifiers changed from: private */
    public volatile int zzm = 1;
    /* access modifiers changed from: private */
    public List zzn = new ArrayList();
    private ScheduledFuture zzo = null;
    /* access modifiers changed from: private */
    public boolean zzp = false;

    public zzgs(Context context, String str, String str2, String str3, zzid zzid, zzpo zzpo, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, zzco zzco, b bVar, zzgu zzgu) {
        ExecutorService executorService2 = executorService;
        this.zza = context;
        o.h(str);
        this.zzb = str;
        o.h(zzid);
        this.zze = zzid;
        o.h(zzpo);
        this.zzf = zzpo;
        o.h(executorService);
        this.zzg = executorService2;
        o.h(scheduledExecutorService);
        this.zzh = scheduledExecutorService;
        o.h(zzco);
        zzco zzco2 = zzco;
        this.zzi = zzco2;
        o.h(bVar);
        this.zzj = bVar;
        o.h(zzgu);
        this.zzk = zzgu;
        this.zzc = str3;
        this.zzd = str2;
        this.zzn.add(new zzgz("gtm.load", new Bundle(), "gtm", new Date(), false, zzco2));
        zzho.zzd("Container " + str + "is scheduled for loading.");
        executorService2.execute(new zzgn(this, (zzgm) null));
    }

    public static /* bridge */ /* synthetic */ void zzr(zzgs zzgs, long j10) {
        ScheduledFuture scheduledFuture = zzgs.zzo;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        String str = zzgs.zzb;
        zzho.zzd("Refresh container " + str + " in " + j10 + "ms.");
        zzgs.zzo = zzgs.zzh.schedule(new zzgj(zzgs), j10, TimeUnit.MILLISECONDS);
    }

    public final void zzs() {
        this.zzg.execute(new zzgi(this));
    }

    public final void zzt(zzgz zzgz) {
        this.zzg.execute(new zzgo(this, zzgz));
    }
}
