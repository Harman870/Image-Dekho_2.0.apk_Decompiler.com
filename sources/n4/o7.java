package n4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import j4.n0;

public final class o7 extends q7 {

    /* renamed from: d  reason: collision with root package name */
    public final AlarmManager f10045d = ((AlarmManager) this.f9600a.f9986a.getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    public n7 f10046e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f10047f;

    public o7(w7 w7Var) {
        super(w7Var);
    }

    public final void j() {
        AlarmManager alarmManager = this.f10045d;
        if (alarmManager != null) {
            alarmManager.cancel(m());
        }
        JobScheduler jobScheduler = (JobScheduler) this.f9600a.f9986a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(l());
        }
    }

    public final void k() {
        h();
        this.f9600a.a().f9835n.a("Unscheduling upload");
        AlarmManager alarmManager = this.f10045d;
        if (alarmManager != null) {
            alarmManager.cancel(m());
        }
        n().a();
        JobScheduler jobScheduler = (JobScheduler) this.f9600a.f9986a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(l());
        }
    }

    public final int l() {
        if (this.f10047f == null) {
            this.f10047f = Integer.valueOf("measurement".concat(String.valueOf(this.f9600a.f9986a.getPackageName())).hashCode());
        }
        return this.f10047f.intValue();
    }

    public final PendingIntent m() {
        Context context = this.f9600a.f9986a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), n0.f8331a);
    }

    public final k n() {
        if (this.f10046e == null) {
            this.f10046e = new n7(this, this.f10066b.f10292l);
        }
        return this.f10046e;
    }
}
