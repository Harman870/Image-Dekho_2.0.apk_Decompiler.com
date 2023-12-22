package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import r3.o;

public final class zzda extends zzbu {
    private boolean zza;
    private boolean zzb;
    private final AlarmManager zzc = ((AlarmManager) zzo().getSystemService("alarm"));
    private Integer zzd;

    public zzda(zzbx zzbx) {
        super(zzbx);
    }

    private final int zzf() {
        if (this.zzd == null) {
            this.zzd = Integer.valueOf("analytics".concat(String.valueOf(zzo().getPackageName())).hashCode());
        }
        return this.zzd.intValue();
    }

    private final PendingIntent zzg() {
        Context zzo = zzo();
        return PendingIntent.getBroadcast(zzo, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfw.zza);
    }

    public final void zza() {
        this.zzb = false;
        try {
            this.zzc.cancel(zzg());
        } catch (NullPointerException unused) {
        }
        int zzf = zzf();
        zzO("Cancelling job. JobID", Integer.valueOf(zzf));
        ((JobScheduler) zzo().getSystemService("jobscheduler")).cancel(zzf);
    }

    public final void zzb() {
        zzV();
        o.j("Receiver not registered", this.zza);
        zzw();
        long zzd2 = zzcv.zzd();
        if (zzd2 > 0) {
            zza();
            zzC().elapsedRealtime();
            this.zzb = true;
            ((Boolean) zzew.zzR.zzb()).booleanValue();
            zzN("Scheduling upload with JobScheduler");
            Context zzo = zzo();
            ComponentName componentName = new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsJobService");
            int zzf = zzf();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo build = new JobInfo.Builder(zzf, componentName).setMinimumLatency(zzd2).setOverrideDeadline(zzd2 + zzd2).setExtras(persistableBundle).build();
            zzO("Scheduling job. JobID", Integer.valueOf(zzf));
            zzfx.zza(zzo, build, "com.google.android.gms", "DispatchAlarm");
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public final void zzd() {
        try {
            zza();
            zzw();
            if (zzcv.zzd() > 0) {
                Context zzo = zzo();
                ActivityInfo receiverInfo = zzo.getPackageManager().getReceiverInfo(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    zzN("Receiver registered for local dispatch.");
                    this.zza = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}
