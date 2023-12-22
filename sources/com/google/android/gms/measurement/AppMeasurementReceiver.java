package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import j4.d1;
import n4.a4;
import n4.b4;
import n4.g3;
import n4.i3;
import n4.n4;
import x0.a;

public final class AppMeasurementReceiver extends a implements a4 {

    /* renamed from: c  reason: collision with root package name */
    public b4 f2839c;

    public final void onReceive(Context context, Intent intent) {
        String str;
        g3 g3Var;
        if (this.f2839c == null) {
            this.f2839c = new b4(this);
        }
        b4 b4Var = this.f2839c;
        b4Var.getClass();
        i3 a10 = n4.s(context, (d1) null, (Long) null).a();
        if (intent == null) {
            g3Var = a10.f9831i;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            a10.f9835n.b("Local receiver got", action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                a10.f9835n.a("Starting wakeful intent.");
                ((AppMeasurementReceiver) b4Var.f9628a).getClass();
                SparseArray<PowerManager.WakeLock> sparseArray = a.f12835a;
                synchronized (sparseArray) {
                    int i10 = a.f12836b;
                    int i11 = i10 + 1;
                    a.f12836b = i11;
                    if (i11 <= 0) {
                        a.f12836b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i10);
                    ComponentName startService = context.startService(className);
                    if (startService != null) {
                        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                        newWakeLock.setReferenceCounted(false);
                        newWakeLock.acquire(60000);
                        sparseArray.put(i10, newWakeLock);
                    }
                }
                return;
            } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                g3Var = a10.f9831i;
                str = "Install Referrer Broadcasts are deprecated";
            } else {
                return;
            }
        }
        g3Var.a(str);
    }
}
