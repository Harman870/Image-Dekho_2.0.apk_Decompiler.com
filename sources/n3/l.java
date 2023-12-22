package n3;

import android.content.ServiceConnection;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9545a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9546b;

    public /* synthetic */ l(ServiceConnection serviceConnection, int i10) {
        this.f9545a = i10;
        this.f9546b = serviceConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r4 = java.lang.String.valueOf(r2);
        r6 = new java.lang.StringBuilder(r4.length() + 8);
        r6.append("Sending ");
        r6.append(r4);
        android.util.Log.d("MessengerIpcClient", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r4 = r0.f9560f.f9566a;
        r5 = r0.f9556b;
        r6 = android.os.Message.obtain();
        r6.what = r2.f9563c;
        r6.arg1 = r2.f9561a;
        r6.replyTo = r5;
        r5 = new android.os.Bundle();
        r5.putBoolean("oneWay", r2.b());
        r5.putString("pkg", r4.getPackageName());
        r5.putBundle("data", r2.f9564d);
        r6.setData(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2 = r0.f9557c;
        r4 = (android.os.Messenger) r2.f6175a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        if (r4 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b1, code lost:
        r4.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        r2 = (n3.h) r2.f6176b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        if (r2 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r2 = r2.f9536a;
        r2.getClass();
        r2.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cd, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cf, code lost:
        r0.a(2, r2.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f9545a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00db
        L_0x0008:
            android.os.Process.setThreadPriority(r1)
            java.lang.Object r0 = r9.f9546b
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0013:
            java.lang.Object r0 = r9.f9546b
            n3.p r0 = (n3.p) r0
        L_0x0017:
            monitor-enter(r0)
            int r2 = r0.f9555a     // Catch:{ all -> 0x00d8 }
            r3 = 2
            if (r2 == r3) goto L_0x001e
            goto L_0x0029
        L_0x001e:
            java.util.ArrayDeque r2 = r0.f9558d     // Catch:{ all -> 0x00d8 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00d8 }
            if (r2 == 0) goto L_0x002b
            r0.c()     // Catch:{ all -> 0x00d8 }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            return
        L_0x002b:
            java.util.ArrayDeque r2 = r0.f9558d     // Catch:{ all -> 0x00d8 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00d8 }
            n3.r r2 = (n3.r) r2     // Catch:{ all -> 0x00d8 }
            android.util.SparseArray<n3.r<?>> r4 = r0.f9559e     // Catch:{ all -> 0x00d8 }
            int r5 = r2.f9561a     // Catch:{ all -> 0x00d8 }
            r4.put(r5, r2)     // Catch:{ all -> 0x00d8 }
            n3.u r4 = r0.f9560f     // Catch:{ all -> 0x00d8 }
            java.util.concurrent.ScheduledExecutorService r4 = r4.f9567b     // Catch:{ all -> 0x00d8 }
            n3.o r5 = new n3.o     // Catch:{ all -> 0x00d8 }
            r5.<init>((java.lang.Object) r0, (int) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x00d8 }
            r6 = 30
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00d8 }
            r4.schedule(r5, r6, r8)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "MessengerIpcClient"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 == 0) goto L_0x0074
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r5 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 8
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "MessengerIpcClient"
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r4, r5)
        L_0x0074:
            n3.u r4 = r0.f9560f
            android.content.Context r4 = r4.f9566a
            android.os.Messenger r5 = r0.f9556b
            android.os.Message r6 = android.os.Message.obtain()
            int r7 = r2.f9563c
            r6.what = r7
            int r7 = r2.f9561a
            r6.arg1 = r7
            r6.replyTo = r5
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "oneWay"
            boolean r8 = r2.b()
            r5.putBoolean(r7, r8)
            java.lang.String r7 = "pkg"
            java.lang.String r4 = r4.getPackageName()
            r5.putString(r7, r4)
            java.lang.String r4 = "data"
            android.os.Bundle r2 = r2.f9564d
            r5.putBundle(r4, r2)
            r6.setData(r5)
            e2.c r2 = r0.f9557c     // Catch:{ RemoteException -> 0x00ce }
            java.lang.Object r4 = r2.f6175a     // Catch:{ RemoteException -> 0x00ce }
            android.os.Messenger r4 = (android.os.Messenger) r4     // Catch:{ RemoteException -> 0x00ce }
            if (r4 == 0) goto L_0x00b6
            r4.send(r6)     // Catch:{ RemoteException -> 0x00ce }
            goto L_0x0017
        L_0x00b6:
            java.lang.Object r2 = r2.f6176b     // Catch:{ RemoteException -> 0x00ce }
            n3.h r2 = (n3.h) r2     // Catch:{ RemoteException -> 0x00ce }
            if (r2 == 0) goto L_0x00c6
            android.os.Messenger r2 = r2.f9536a     // Catch:{ RemoteException -> 0x00ce }
            r2.getClass()     // Catch:{ RemoteException -> 0x00ce }
            r2.send(r6)     // Catch:{ RemoteException -> 0x00ce }
            goto L_0x0017
        L_0x00c6:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00ce }
            java.lang.String r4 = "Both messengers are null"
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x00ce }
            throw r2     // Catch:{ RemoteException -> 0x00ce }
        L_0x00ce:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r0.a(r3, r2)
            goto L_0x0017
        L_0x00d8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            throw r1
        L_0x00db:
            java.lang.Object r0 = r9.f9546b
            n4.z6 r0 = (n4.z6) r0
            n4.a7 r0 = r0.f10352c
            android.content.ComponentName r1 = new android.content.ComponentName
            n4.n4 r2 = r0.f9600a
            android.content.Context r2 = r2.f9986a
            java.lang.Object r3 = r9.f9546b
            n4.z6 r3 = (n4.z6) r3
            n4.a7 r3 = r3.f10352c
            n4.n4 r3 = r3.f9600a
            r3.getClass()
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            n4.a7.t(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.l.run():void");
    }

    public l(Runnable runnable) {
        this.f9545a = 1;
        this.f9546b = runnable;
    }
}
