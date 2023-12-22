package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfo;
import com.google.android.gms.internal.gtm.zzfp;

@TargetApi(24)
public final class AnalyticsJobService extends JobService implements zzfo {

    /* renamed from: a  reason: collision with root package name */
    public zzfp f2763a;

    public final zzfp a() {
        if (this.f2763a == null) {
            this.f2763a = new zzfp(this);
        }
        return this.f2763a;
    }

    public final boolean callServiceStopSelfResult(int i10) {
        return stopSelfResult(i10);
    }

    public final void onCreate() {
        super.onCreate();
        a().zze();
    }

    public final void onDestroy() {
        a().zzf();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        a().zza(intent, i10, i11);
        return 2;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        a().zzi(jobParameters);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @TargetApi(24)
    public final void zza(JobParameters jobParameters, boolean z9) {
        jobFinished(jobParameters, false);
    }
}
