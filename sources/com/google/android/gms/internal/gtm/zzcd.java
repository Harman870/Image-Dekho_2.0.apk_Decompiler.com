package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.ServiceConnection;
import i3.t;
import r3.o;

public final class zzcd implements ServiceConnection {
    public final /* synthetic */ zzce zza;
    private volatile boolean zzb;
    private volatile zzfa zzc;

    public zzcd(zzce zzce) {
        this.zza = zzce;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|10|11|(4:13|(1:15)(1:17)|16|18)(1:19)|(2:23|24)(3:25|26|(1:28)(1:31))|32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.zza.zzI("Service connect failed to get IAnalyticsService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            r3.o.d(r3)
            monitor-enter(r2)
            if (r4 != 0) goto L_0x0014
            com.google.android.gms.internal.gtm.zzce r3 = r2.zza     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "Service connected with null binder"
            r3.zzI(r4)     // Catch:{ all -> 0x0081 }
            r2.notifyAll()     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            return
        L_0x0014:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0045 }
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch:{ RemoteException -> 0x0045 }
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x0045 }
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.zzfa     // Catch:{ RemoteException -> 0x0045 }
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.internal.gtm.zzfa r0 = (com.google.android.gms.internal.gtm.zzfa) r0     // Catch:{ RemoteException -> 0x0045 }
        L_0x002d:
            r3 = r0
            goto L_0x0035
        L_0x002f:
            com.google.android.gms.internal.gtm.zzfa r0 = new com.google.android.gms.internal.gtm.zzfa     // Catch:{ RemoteException -> 0x0045 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0045 }
            goto L_0x002d
        L_0x0035:
            com.google.android.gms.internal.gtm.zzce r4 = r2.zza     // Catch:{ RemoteException -> 0x0045 }
            java.lang.String r0 = "Bound to IAnalyticsService interface"
            r4.zzN(r0)     // Catch:{ RemoteException -> 0x0045 }
            goto L_0x004c
        L_0x003d:
            com.google.android.gms.internal.gtm.zzce r4 = r2.zza     // Catch:{ RemoteException -> 0x0045 }
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.zzJ(r1, r0)     // Catch:{ RemoteException -> 0x0045 }
            goto L_0x004c
        L_0x0045:
            com.google.android.gms.internal.gtm.zzce r4 = r2.zza     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "Service connect failed to get IAnalyticsService"
            r4.zzI(r0)     // Catch:{ all -> 0x0081 }
        L_0x004c:
            if (r3 != 0) goto L_0x0062
            v3.a r3 = v3.a.b()     // Catch:{ IllegalArgumentException -> 0x0085 }
            com.google.android.gms.internal.gtm.zzce r4 = r2.zza     // Catch:{ IllegalArgumentException -> 0x0085 }
            android.content.Context r4 = r4.zzo()     // Catch:{ IllegalArgumentException -> 0x0085 }
            com.google.android.gms.internal.gtm.zzce r0 = r2.zza     // Catch:{ IllegalArgumentException -> 0x0085 }
            com.google.android.gms.internal.gtm.zzcd r0 = r0.zza     // Catch:{ IllegalArgumentException -> 0x0085 }
            r3.c(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0085 }
            goto L_0x0085
        L_0x0062:
            boolean r4 = r2.zzb     // Catch:{ all -> 0x0081 }
            if (r4 != 0) goto L_0x0083
            com.google.android.gms.internal.gtm.zzce r4 = r2.zza     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "onServiceConnected received after the timeout limit"
            r4.zzQ(r0)     // Catch:{ all -> 0x0081 }
            com.google.android.gms.internal.gtm.zzce r4 = r2.zza     // Catch:{ all -> 0x0081 }
            i3.t r4 = r4.zzq()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.internal.gtm.zzcb r0 = new com.google.android.gms.internal.gtm.zzcb     // Catch:{ all -> 0x0081 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0081 }
            r4.getClass()     // Catch:{ all -> 0x0081 }
            i3.q r3 = r4.f7164c     // Catch:{ all -> 0x0081 }
            r3.submit(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r3 = move-exception
            goto L_0x008a
        L_0x0083:
            r2.zzc = r3     // Catch:{ all -> 0x0081 }
        L_0x0085:
            r2.notifyAll()     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            return
        L_0x008a:
            r2.notifyAll()     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x008e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcd.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        o.d("AnalyticsServiceConnection.onServiceDisconnected");
        t zzq = this.zza.zzq();
        zzcc zzcc = new zzcc(this, componentName);
        zzq.getClass();
        zzq.f7164c.submit(zzcc);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(1:15)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.zzfa zza() {
        /*
            r6 = this;
            i3.t.a()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.analytics.service.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r3 = "com.google.android.gms.analytics.service.AnalyticsService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.internal.gtm.zzce r1 = r6.zza
            android.content.Context r1 = r1.zzo()
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "app_package_name"
            r0.putExtra(r3, r2)
            v3.a r2 = v3.a.b()
            monitor-enter(r6)
            r3 = 0
            r6.zzc = r3     // Catch:{ all -> 0x007b }
            r4 = 1
            r6.zzb = r4     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.zzce r4 = r6.zza     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.zzcd r4 = r4.zza     // Catch:{ all -> 0x007b }
            r5 = 129(0x81, float:1.81E-43)
            boolean r0 = r2.a(r1, r0, r4, r5)     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.zzce r1 = r6.zza     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "Bind to service requested"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007b }
            r1.zzO(r2, r4)     // Catch:{ all -> 0x007b }
            r1 = 0
            if (r0 != 0) goto L_0x004e
            r6.zzb = r1     // Catch:{ all -> 0x007b }
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            return r3
        L_0x004e:
            com.google.android.gms.internal.gtm.zzce r0 = r6.zza     // Catch:{ InterruptedException -> 0x0063 }
            r0.zzw()     // Catch:{ InterruptedException -> 0x0063 }
            com.google.android.gms.internal.gtm.zzev r0 = com.google.android.gms.internal.gtm.zzew.zzL     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ InterruptedException -> 0x0063 }
            long r4 = r0.longValue()     // Catch:{ InterruptedException -> 0x0063 }
            r6.wait(r4)     // Catch:{ InterruptedException -> 0x0063 }
            goto L_0x006a
        L_0x0063:
            com.google.android.gms.internal.gtm.zzce r0 = r6.zza     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "Wait for service connect was interrupted"
            r0.zzQ(r2)     // Catch:{ all -> 0x007b }
        L_0x006a:
            r6.zzb = r1     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.zzfa r0 = r6.zzc     // Catch:{ all -> 0x007b }
            r6.zzc = r3     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x0079
            com.google.android.gms.internal.gtm.zzce r1 = r6.zza     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "Successfully bound to service but never got onServiceConnected callback"
            r1.zzI(r2)     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            return r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcd.zza():com.google.android.gms.internal.gtm.zzfa");
    }
}
