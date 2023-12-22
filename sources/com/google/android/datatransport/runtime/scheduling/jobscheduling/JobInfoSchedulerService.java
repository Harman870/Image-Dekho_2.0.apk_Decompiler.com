package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c3.f;
import c3.q;
import g3.a;
import w2.j;
import w2.s;
import w2.x;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2748a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        x.b(getApplicationContext());
        j.a a10 = s.a();
        a10.b(string);
        a10.c(a.b(i10));
        if (string2 != null) {
            a10.f12708b = Base64.decode(string2, 0);
        }
        q qVar = x.a().f12734d;
        qVar.f2423e.execute(new f(qVar, a10.a(), i11, new d.s(this, 1, jobParameters)));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
