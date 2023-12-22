package androidx.appcompat.widget;

public final /* synthetic */ class j1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f832a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f833b;

    public /* synthetic */ j1(int i10, Object obj) {
        this.f832a = i10;
        this.f833b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f832a
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007b;
                case 2: goto L_0x0015;
                case 3: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0094
        L_0x0009:
            java.lang.Object r0 = r8.f833b
            com.ironsource.mediationsdk.testSuite.e.b r0 = (com.ironsource.mediationsdk.testSuite.e.b) r0
            java.lang.String r1 = "this$0"
            x8.f.f(r0, r1)
            r0.f4913f = r2
            return
        L_0x0015:
            java.lang.Object r0 = r8.f833b
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            android.content.Context r0 = r0.f3490d
            android.content.Context r3 = r0.getApplicationContext()
            if (r3 != 0) goto L_0x0022
            r3 = r0
        L_0x0022:
            java.lang.String r4 = "com.google.firebase.messaging"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)
            java.lang.String r4 = "proxy_notification_initialized"
            boolean r3 = r3.getBoolean(r4, r5)
            if (r3 == 0) goto L_0x0032
            goto L_0x007a
        L_0x0032:
            java.lang.String r3 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r4 = r0.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x005b }
            android.content.pm.PackageManager r6 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x005b }
            if (r6 == 0) goto L_0x005b
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x005b }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r6.getApplicationInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x005b }
            if (r4 == 0) goto L_0x005b
            android.os.Bundle r6 = r4.metaData     // Catch:{ NameNotFoundException -> 0x005b }
            if (r6 == 0) goto L_0x005b
            boolean r6 = r6.containsKey(r3)     // Catch:{ NameNotFoundException -> 0x005b }
            if (r6 == 0) goto L_0x005b
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x005b }
            boolean r3 = r4.getBoolean(r3)     // Catch:{ NameNotFoundException -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r3 = r2
        L_0x005c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r4 < r6) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r2 = r5
        L_0x0064:
            if (r2 != 0) goto L_0x006a
            com.google.android.gms.tasks.Tasks.forResult(r1)
            goto L_0x007a
        L_0x006a:
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            a7.x r2 = new a7.x
            r2.<init>(r0, r3, r1)
            r2.run()
            r1.getTask()
        L_0x007a:
            return
        L_0x007b:
            java.lang.Object r0 = r8.f833b
            v5.g r0 = (v5.g) r0
            r0.t(r2)
            return
        L_0x0083:
            java.lang.Object r0 = r8.f833b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.Toolbar$f r0 = r0.M
            if (r0 != 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            androidx.appcompat.view.menu.h r1 = r0.f669b
        L_0x008e:
            if (r1 == 0) goto L_0x0093
            r1.collapseActionView()
        L_0x0093:
            return
        L_0x0094:
            java.lang.Object r0 = r8.f833b
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            r0.call()     // Catch:{ Exception -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j1.run():void");
    }
}
