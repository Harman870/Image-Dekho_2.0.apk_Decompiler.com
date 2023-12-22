package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.ironsource.environment.thread.IronSourceThreadManager;

public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public ConnectivityManager f3682a;

    /* renamed from: b  reason: collision with root package name */
    public j f3683b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3684c = false;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            j jVar = networkStateReceiver.f3683b;
            if (jVar != null) {
                jVar.a(networkStateReceiver.f3684c);
            }
        }
    }

    public NetworkStateReceiver(Context context, j jVar) {
        this.f3683b = jVar;
        if (context != null) {
            this.f3682a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r4 = this;
            boolean r0 = r4.f3684c
            android.net.ConnectivityManager r1 = r4.f3682a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            r4.f3684c = r1     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r4.f3684c = r3
        L_0x001c:
            boolean r1 = r4.f3684c
            if (r0 == r1) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.a():boolean");
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getExtras() != null && a()) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
        }
    }
}
