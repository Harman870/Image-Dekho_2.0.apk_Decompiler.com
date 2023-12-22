package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import j4.d1;
import n4.e7;
import n4.f7;
import n4.g7;
import n4.i3;
import n4.n4;
import n4.w7;
import n4.z4;
import q3.i0;
import x0.a;

public final class AppMeasurementService extends Service implements f7 {

    /* renamed from: a  reason: collision with root package name */
    public g7 f2840a;

    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a.f12835a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray2 = a.f12835a;
            synchronized (sparseArray2) {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            }
        }
    }

    public final boolean b(int i10) {
        return stopSelfResult(i10);
    }

    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final g7 d() {
        if (this.f2840a == null) {
            this.f2840a = new g7(this);
        }
        return this.f2840a;
    }

    public final IBinder onBind(Intent intent) {
        g7 d10 = d();
        if (intent == null) {
            d10.c().f9828f.a("onBind called with null intent");
        } else {
            d10.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new z4(w7.N(d10.f9767a));
            }
            d10.c().f9831i.b("onBind received unknown action", action);
        }
        return null;
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

    public final int onStartCommand(Intent intent, int i10, int i11) {
        g7 d10 = d();
        i3 a10 = n4.s(d10.f9767a, (d1) null, (Long) null).a();
        if (intent == null) {
            a10.f9831i.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a10.f9835n.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        e7 e7Var = new e7(d10, i11, a10, intent);
        w7 N = w7.N(d10.f9767a);
        N.d().o(new i0(N, e7Var));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
