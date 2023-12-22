package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c3.f;
import c3.q;
import g3.a;
import w2.j;
import w2.s;
import w2.x;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2747a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        x.b(context);
        j.a a10 = s.a();
        a10.b(queryParameter);
        a10.c(a.b(intValue));
        if (queryParameter2 != null) {
            a10.f12708b = Base64.decode(queryParameter2, 0);
        }
        q qVar = x.a().f12734d;
        qVar.f2423e.execute(new f(qVar, a10.a(), i10, new c3.a()));
    }
}
