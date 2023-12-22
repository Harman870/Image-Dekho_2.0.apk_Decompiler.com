package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import q4.a;
import r3.o;

public final class zzfp {
    private static Boolean zza;
    /* access modifiers changed from: private */
    public final Handler zzb = new zzgc();
    private final Context zzc;

    public zzfp(Context context) {
        o.h(context);
        this.zzc = context;
    }

    public static boolean zzh(Context context) {
        o.h(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z9 = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z9 = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z9);
        return z9;
    }

    public final int zza(Intent intent, int i10, int i11) {
        try {
            synchronized (zzfk.zza) {
                a aVar = zzfk.zzb;
                if (aVar != null && aVar.b()) {
                    aVar.c();
                }
            }
        } catch (SecurityException unused) {
        }
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzQ("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzg.zzj();
        zzm.zzP("Local AnalyticsService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzg(new zzfm(this, i11, zzm));
        }
        return 2;
    }

    public final /* synthetic */ void zzc(int i10, zzfd zzfd) {
        if (((zzfo) this.zzc).callServiceStopSelfResult(i10)) {
            zzfd.zzN("Local AnalyticsService processed last dispatch request");
        }
    }

    public final /* synthetic */ void zzd(zzfd zzfd, JobParameters jobParameters) {
        zzfd.zzN("AnalyticsJobService processed last dispatch request");
        ((zzfo) this.zzc).zza(jobParameters, false);
    }

    public final void zze() {
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzN("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzN("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable) {
        zzbx.zzg(this.zzc).zzf().zze(new zzfn(this, runnable));
    }

    @TargetApi(24)
    public final boolean zzi(JobParameters jobParameters) {
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        String string = jobParameters.getExtras().getString("action");
        zzg.zzj();
        zzm.zzO("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        zzg(new zzfl(this, zzm, jobParameters));
        return true;
    }
}
