package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfo;
import com.google.android.gms.internal.gtm.zzfp;

public final class AnalyticsService extends Service implements zzfo {

    /* renamed from: a  reason: collision with root package name */
    public zzfp f2765a;

    public final zzfp a() {
        if (this.f2765a == null) {
            this.f2765a = new zzfp(this);
        }
        return this.f2765a;
    }

    public final boolean callServiceStopSelfResult(int i10) {
        return stopSelfResult(i10);
    }

    public final IBinder onBind(Intent intent) {
        a();
        return null;
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

    public final void zza(JobParameters jobParameters, boolean z9) {
        throw new UnsupportedOperationException();
    }
}
