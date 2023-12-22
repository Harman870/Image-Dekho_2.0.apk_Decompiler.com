package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import j4.d1;
import n4.f7;
import n4.g7;
import n4.i3;
import n4.n4;
import n4.o4;
import n4.w7;
import q3.i0;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements f7 {

    /* renamed from: a  reason: collision with root package name */
    public g7 f2838a;

    public final void a(Intent intent) {
    }

    public final boolean b(int i10) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final g7 d() {
        if (this.f2838a == null) {
            this.f2838a = new g7(this);
        }
        return this.f2838a;
    }

    public final void onCreate() {
        super.onCreate();
        n4.s(d().f9767a, (d1) null, (Long) null).a().f9835n.a("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        n4.s(d().f9767a, (d1) null, (Long) null).a().f9835n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        d().a(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        g7 d10 = d();
        i3 a10 = n4.s(d10.f9767a, (d1) null, (Long) null).a();
        String string = jobParameters.getExtras().getString("action");
        a10.f9835n.b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            o4 o4Var = new o4(d10, a10, jobParameters, 1);
            w7 N = w7.N(d10.f9767a);
            N.d().o(new i0(N, o4Var));
        }
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
