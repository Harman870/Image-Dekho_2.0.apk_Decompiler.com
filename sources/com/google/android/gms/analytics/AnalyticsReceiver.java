package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfk;

public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public zzfk f2764a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f2764a == null) {
            this.f2764a = new zzfk();
        }
        zzfk.zzb(context, intent);
    }
}
