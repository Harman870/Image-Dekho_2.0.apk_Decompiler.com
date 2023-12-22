package n3;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9553b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9554c;

    public /* synthetic */ o(Object obj, int i10, Object obj2) {
        this.f9552a = i10;
        this.f9553b = obj;
        this.f9554c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0425, code lost:
        if (android.text.TextUtils.isEmpty(r4.f9596m) == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0584, code lost:
        if (android.text.TextUtils.isEmpty(r3.f9596m) == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0312, code lost:
        if (r6 == false) goto L_0x0314;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.f9552a
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x060d;
                case 1: goto L_0x014b;
                case 2: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0651
        L_0x000a:
            java.lang.Object r0 = r15.f9553b
            n4.a6 r0 = (n4.a6) r0
            java.lang.Object r3 = r15.f9554c
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 != 0) goto L_0x0026
            n4.n4 r0 = r0.f9600a
            n4.w3 r0 = r0.r()
            n4.s3 r0 = r0.w
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.b(r1)
            goto L_0x014a
        L_0x0026:
            n4.n4 r4 = r0.f9600a
            n4.w3 r4 = r4.r()
            n4.s3 r4 = r4.w
            android.os.Bundle r4 = r4.a()
            java.util.Set r5 = r3.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003a:
            boolean r6 = r5.hasNext()
            r7 = 100
            if (r6 == 0) goto L_0x00c3
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r3.get(r6)
            if (r8 == 0) goto L_0x008b
            boolean r9 = r8 instanceof java.lang.String
            if (r9 != 0) goto L_0x008b
            boolean r9 = r8 instanceof java.lang.Long
            if (r9 != 0) goto L_0x008b
            boolean r9 = r8 instanceof java.lang.Double
            if (r9 != 0) goto L_0x008b
            n4.n4 r7 = r0.f9600a
            n4.d8 r7 = r7.x()
            r7.getClass()
            boolean r7 = n4.d8.Q(r8)
            if (r7 == 0) goto L_0x007d
            n4.n4 r7 = r0.f9600a
            n4.d8 r7 = r7.x()
            u1.t r9 = r0.f9611n
            r10 = 0
            r11 = 27
            r12 = 0
            r13 = 0
            r14 = 0
            r7.getClass()
            n4.d8.x(r9, r10, r11, r12, r13, r14)
        L_0x007d:
            n4.n4 r7 = r0.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.k
            java.lang.String r9 = "Invalid default event parameter type. Name, value"
            r7.c(r9, r6, r8)
            goto L_0x003a
        L_0x008b:
            boolean r9 = n4.d8.T(r6)
            if (r9 == 0) goto L_0x009f
            n4.n4 r7 = r0.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.k
            java.lang.String r8 = "Invalid default event parameter name. Name"
            r7.b(r8, r6)
            goto L_0x003a
        L_0x009f:
            if (r8 != 0) goto L_0x00a5
            r4.remove(r6)
            goto L_0x003a
        L_0x00a5:
            n4.n4 r9 = r0.f9600a
            n4.d8 r9 = r9.x()
            n4.n4 r10 = r0.f9600a
            r10.getClass()
            java.lang.String r10 = "param"
            boolean r7 = r9.M(r10, r6, r7, r8)
            if (r7 == 0) goto L_0x003a
            n4.n4 r7 = r0.f9600a
            n4.d8 r7 = r7.x()
            r7.y(r4, r6, r8)
            goto L_0x003a
        L_0x00c3:
            n4.n4 r3 = r0.f9600a
            r3.x()
            n4.n4 r3 = r0.f9600a
            n4.f r3 = r3.f9992g
            n4.n4 r3 = r3.f9600a
            n4.d8 r3 = r3.x()
            r5 = 201500000(0xc02a560, float:1.0064601E-31)
            boolean r3 = r3.S(r5)
            if (r3 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r7 = 25
        L_0x00de:
            int r3 = r4.size()
            if (r3 > r7) goto L_0x00e5
            goto L_0x0127
        L_0x00e5:
            java.util.TreeSet r3 = new java.util.TreeSet
            java.util.Set r5 = r4.keySet()
            r3.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
            r5 = r2
        L_0x00f3:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0106
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r5 + r1
            if (r5 <= r7) goto L_0x00f3
            r4.remove(r6)
            goto L_0x00f3
        L_0x0106:
            n4.n4 r1 = r0.f9600a
            n4.d8 r1 = r1.x()
            u1.t r5 = r0.f9611n
            r6 = 0
            r7 = 26
            r8 = 0
            r9 = 0
            r10 = 0
            r1.getClass()
            n4.d8.x(r5, r6, r7, r8, r9, r10)
            n4.n4 r1 = r0.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.k
            java.lang.String r3 = "Too many default event parameters set. Discarding beyond event parameter limit"
            r1.a(r3)
        L_0x0127:
            n4.n4 r1 = r0.f9600a
            n4.w3 r1 = r1.r()
            n4.s3 r1 = r1.w
            r1.b(r4)
            n4.n4 r0 = r0.f9600a
            n4.a7 r0 = r0.v()
            r0.g()
            r0.h()
            n4.g8 r1 = r0.p(r2)
            n4.q6 r2 = new n4.q6
            r2.<init>(r0, r1, r4)
            r0.s(r2)
        L_0x014a:
            return
        L_0x014b:
            java.lang.Object r0 = r15.f9554c
            n4.n4 r0 = (n4.n4) r0
            java.lang.Object r4 = r15.f9553b
            n4.i5 r4 = (n4.i5) r4
            n4.m4 r5 = r0.d()
            r5.g()
            n4.f r5 = r0.f9992g
            n4.n4 r5 = r5.f9600a
            r5.getClass()
            n4.l r5 = new n4.l
            r5.<init>(r0)
            r5.j()
            r0.f10005v = r5
            n4.a3 r5 = new n4.a3
            long r6 = r4.f9841f
            r5.<init>(r0, r6)
            r5.i()
            r0.w = r5
            n4.c3 r4 = new n4.c3
            r4.<init>(r0)
            r4.i()
            r0.f10004t = r4
            n4.a7 r4 = new n4.a7
            r4.<init>(r0)
            r4.i()
            r0.u = r4
            n4.d8 r4 = r0.f9996l
            boolean r6 = r4.f9629b
            if (r6 != 0) goto L_0x0605
            r4.K()
            n4.n4 r6 = r4.f9600a
            r6.b()
            r4.f9629b = r1
            n4.w3 r4 = r0.f9993h
            boolean r6 = r4.f9629b
            if (r6 != 0) goto L_0x05fd
            r4.l()
            n4.n4 r6 = r4.f9600a
            r6.b()
            r4.f9629b = r1
            n4.a3 r4 = r0.w
            boolean r6 = r4.f10031b
            if (r6 != 0) goto L_0x05f5
            r4.k()
            n4.n4 r6 = r4.f9600a
            r6.b()
            r4.f10031b = r1
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9833l
            n4.f r6 = r0.f9992g
            r6.k()
            r6 = 79000(0x13498, double:3.9031E-319)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "App measurement initialized, version"
            r4.b(r7, r6)
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9833l
            java.lang.String r6 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r4.a(r6)
            java.lang.String r4 = r5.l()
            java.lang.String r5 = r0.f9987b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x022c
            n4.d8 r5 = r0.x()
            r5.getClass()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x01f8
            r5 = r2
            goto L_0x020b
        L_0x01f8:
            n4.n4 r6 = r5.f9600a
            n4.f r6 = r6.f9992g
            java.lang.String r7 = "debug.firebase.analytics.app"
            java.lang.String r6 = r6.h(r7)
            n4.n4 r5 = r5.f9600a
            r5.getClass()
            boolean r5 = r6.equals(r4)
        L_0x020b:
            if (r5 == 0) goto L_0x0219
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9833l
            java.lang.String r5 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r4.a(r5)
            goto L_0x022c
        L_0x0219:
            n4.i3 r5 = r0.a()
            n4.g3 r5 = r5.f9833l
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            java.lang.String r4 = r6.concat(r4)
            r5.a(r4)
        L_0x022c:
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9834m
            java.lang.String r5 = "Debug-level message logging enabled"
            r4.a(r5)
            int r4 = r0.E
            java.util.concurrent.atomic.AtomicInteger r5 = r0.F
            int r5 = r5.get()
            if (r4 == r5) goto L_0x025c
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9828f
            int r5 = r0.E
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.concurrent.atomic.AtomicInteger r6 = r0.F
            int r6 = r6.get()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "Not all components initialized"
            r4.c(r7, r5, r6)
        L_0x025c:
            r0.f10006x = r1
            java.lang.Object r0 = r15.f9554c
            n4.n4 r0 = (n4.n4) r0
            java.lang.Object r4 = r15.f9553b
            n4.i5 r4 = (n4.i5) r4
            j4.d1 r4 = r4.f9842g
            n4.m4 r5 = r0.d()
            r5.g()
            n4.w3 r5 = r0.r()
            n4.f5 r5 = r5.m()
            int r6 = r5.f9745b
            n4.f r7 = r0.f9992g
            n4.n4 r8 = r7.f9600a
            java.lang.String r8 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r7 = r7.n(r8)
            n4.f r8 = r0.f9992g
            n4.n4 r9 = r8.f9600a
            java.lang.String r9 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r8 = r8.n(r9)
            r9 = -10
            if (r7 != 0) goto L_0x0293
            if (r8 == 0) goto L_0x02a4
        L_0x0293:
            n4.w3 r10 = r0.r()
            boolean r10 = r10.r(r9)
            if (r10 == 0) goto L_0x02a4
            n4.f5 r4 = new n4.f5
            r4.<init>(r7, r8, r9)
            goto L_0x0315
        L_0x02a4:
            n4.a3 r7 = r0.o()
            java.lang.String r7 = r7.m()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 30
            if (r7 != 0) goto L_0x02d3
            if (r6 == 0) goto L_0x02c4
            if (r6 == r8) goto L_0x02c4
            r7 = 10
            if (r6 == r7) goto L_0x02c4
            if (r6 == r8) goto L_0x02c4
            if (r6 == r8) goto L_0x02c4
            r7 = 40
            if (r6 != r7) goto L_0x02d3
        L_0x02c4:
            n4.a6 r4 = r0.t()
            n4.f5 r6 = new n4.f5
            r6.<init>(r3, r3, r9)
            long r7 = r0.G
            r4.t(r6, r7)
            goto L_0x0314
        L_0x02d3:
            n4.a3 r6 = r0.o()
            java.lang.String r6 = r6.m()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0314
            if (r4 == 0) goto L_0x0314
            android.os.Bundle r6 = r4.f8101g
            if (r6 == 0) goto L_0x0314
            n4.w3 r6 = r0.r()
            boolean r6 = r6.r(r8)
            if (r6 == 0) goto L_0x0314
            android.os.Bundle r4 = r4.f8101g
            n4.f5 r4 = n4.f5.a(r8, r4)
            java.util.EnumMap r6 = r4.f9744a
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0301:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0311
            java.lang.Object r7 = r6.next()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x0301
            r6 = r1
            goto L_0x0312
        L_0x0311:
            r6 = r2
        L_0x0312:
            if (r6 != 0) goto L_0x0315
        L_0x0314:
            r4 = r3
        L_0x0315:
            if (r4 == 0) goto L_0x0321
            n4.a6 r5 = r0.t()
            long r6 = r0.G
            r5.t(r4, r6)
            r5 = r4
        L_0x0321:
            n4.a6 r4 = r0.t()
            r4.w(r5)
            n4.w3 r4 = r0.r()
            n4.t3 r4 = r4.f10255e
            long r4 = r4.a()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0354
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9835n
            long r5 = r0.G
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "Persisting first open"
            r4.b(r6, r5)
            n4.w3 r4 = r0.r()
            n4.t3 r4 = r4.f10255e
            long r5 = r0.G
            r4.b(r5)
        L_0x0354:
            n4.a6 r4 = r0.t()
            n4.i8 r4 = r4.f9609l
            boolean r5 = r4.b()
            if (r5 == 0) goto L_0x0371
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0371
            n4.n4 r4 = r4.f9854a
            n4.w3 r4 = r4.r()
            n4.v3 r4 = r4.u
            r4.b(r3)
        L_0x0371:
            boolean r4 = r0.h()
            if (r4 != 0) goto L_0x040a
            boolean r3 = r0.g()
            if (r3 == 0) goto L_0x05eb
            n4.d8 r3 = r0.x()
            java.lang.String r4 = "android.permission.INTERNET"
            boolean r3 = r3.P(r4)
            if (r3 != 0) goto L_0x0394
            n4.i3 r3 = r0.a()
            n4.g3 r3 = r3.f9828f
            java.lang.String r4 = "App is missing INTERNET permission"
            r3.a(r4)
        L_0x0394:
            n4.d8 r3 = r0.x()
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r3 = r3.P(r4)
            if (r3 != 0) goto L_0x03ab
            n4.i3 r3 = r0.a()
            n4.g3 r3 = r3.f9828f
            java.lang.String r4 = "App is missing ACCESS_NETWORK_STATE permission"
            r3.a(r4)
        L_0x03ab:
            android.content.Context r3 = r0.f9986a
            y3.b r3 = y3.c.a(r3)
            boolean r3 = r3.c()
            if (r3 != 0) goto L_0x03fd
            n4.f r3 = r0.f9992g
            boolean r3 = r3.s()
            if (r3 != 0) goto L_0x03fd
            android.content.Context r3 = r0.f9986a
            boolean r3 = n4.d8.V(r3)
            if (r3 != 0) goto L_0x03d2
            n4.i3 r3 = r0.a()
            n4.g3 r3 = r3.f9828f
            java.lang.String r4 = "AppMeasurementReceiver not registered/enabled"
            r3.a(r4)
        L_0x03d2:
            android.content.Context r3 = r0.f9986a
            r3.o.h(r3)
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x03f0 }
            if (r5 != 0) goto L_0x03e0
            goto L_0x03f0
        L_0x03e0:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x03f0 }
            r6.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x03f0 }
            android.content.pm.ServiceInfo r3 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x03f0 }
            if (r3 == 0) goto L_0x03f0
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x03f0 }
            if (r3 == 0) goto L_0x03f0
            r2 = r1
        L_0x03f0:
            if (r2 != 0) goto L_0x03fd
            n4.i3 r2 = r0.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r3 = "AppMeasurementService not registered/enabled"
            r2.a(r3)
        L_0x03fd:
            n4.i3 r2 = r0.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r3 = "Uploading is not possible. App measurement disabled"
            r2.a(r3)
            goto L_0x05eb
        L_0x040a:
            n4.a3 r4 = r0.o()
            java.lang.String r4 = r4.m()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0427
            n4.a3 r4 = r0.o()
            r4.h()
            java.lang.String r4 = r4.f9596m
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x04f0
        L_0x0427:
            n4.d8 r4 = r0.x()
            n4.a3 r5 = r0.o()
            java.lang.String r5 = r5.m()
            n4.w3 r6 = r0.r()
            r6.g()
            android.content.SharedPreferences r6 = r6.k()
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r6 = r6.getString(r7, r3)
            n4.a3 r8 = r0.o()
            r8.h()
            java.lang.String r8 = r8.f9596m
            n4.w3 r9 = r0.r()
            r9.g()
            android.content.SharedPreferences r9 = r9.k()
            java.lang.String r10 = "admob_app_id"
            java.lang.String r9 = r9.getString(r10, r3)
            r4.getClass()
            boolean r4 = n4.d8.W(r5, r6, r8, r9)
            if (r4 == 0) goto L_0x04b5
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9833l
            java.lang.String r5 = "Rechecking which service to use due to a GMP App Id change"
            r4.a(r5)
            n4.w3 r4 = r0.r()
            r4.g()
            java.lang.Boolean r5 = r4.n()
            android.content.SharedPreferences r6 = r4.k()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r6.clear()
            r6.apply()
            if (r5 == 0) goto L_0x0490
            r4.o(r5)
        L_0x0490:
            n4.c3 r4 = r0.p()
            r4.l()
            n4.a7 r4 = r0.u
            r4.v()
            n4.a7 r4 = r0.u
            r4.u()
            n4.w3 r4 = r0.r()
            n4.t3 r4 = r4.f10255e
            long r5 = r0.G
            r4.b(r5)
            n4.w3 r4 = r0.r()
            n4.v3 r4 = r4.f10256f
            r4.b(r3)
        L_0x04b5:
            n4.w3 r4 = r0.r()
            n4.a3 r5 = r0.o()
            java.lang.String r5 = r5.m()
            r4.g()
            android.content.SharedPreferences r4 = r4.k()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.putString(r7, r5)
            r4.apply()
            n4.w3 r4 = r0.r()
            n4.a3 r5 = r0.o()
            r5.h()
            java.lang.String r5 = r5.f9596m
            r4.g()
            android.content.SharedPreferences r4 = r4.k()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.putString(r10, r5)
            r4.apply()
        L_0x04f0:
            n4.w3 r4 = r0.r()
            n4.f5 r4 = r4.m()
            n4.e5 r5 = n4.e5.ANALYTICS_STORAGE
            boolean r4 = r4.f(r5)
            if (r4 != 0) goto L_0x0509
            n4.w3 r4 = r0.r()
            n4.v3 r4 = r4.f10256f
            r4.b(r3)
        L_0x0509:
            n4.a6 r4 = r0.t()
            n4.w3 r5 = r0.r()
            n4.v3 r5 = r5.f10256f
            java.lang.String r5 = r5.a()
            java.util.concurrent.atomic.AtomicReference r4 = r4.f9605g
            r4.set(r5)
            j4.pa r4 = j4.pa.f8389b
            j4.m5 r4 = r4.f8390a
            java.lang.Object r4 = r4.zza()
            j4.qa r4 = (j4.qa) r4
            r4.zza()
            n4.f r4 = r0.f9992g
            n4.v2 r5 = n4.w2.f10212d0
            boolean r4 = r4.o(r3, r5)
            if (r4 == 0) goto L_0x0569
            n4.d8 r4 = r0.x()
            n4.n4 r4 = r4.f9600a     // Catch:{ ClassNotFoundException -> 0x0545 }
            android.content.Context r4 = r4.f9986a     // Catch:{ ClassNotFoundException -> 0x0545 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0545 }
            java.lang.String r5 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r4.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x0545 }
            goto L_0x0569
        L_0x0545:
            n4.w3 r4 = r0.r()
            n4.v3 r4 = r4.f10269t
            java.lang.String r4 = r4.a()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0569
            n4.i3 r4 = r0.a()
            n4.g3 r4 = r4.f9831i
            java.lang.String r5 = "Remote config removed with active feature rollouts"
            r4.a(r5)
            n4.w3 r4 = r0.r()
            n4.v3 r4 = r4.f10269t
            r4.b(r3)
        L_0x0569:
            n4.a3 r3 = r0.o()
            java.lang.String r3 = r3.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0586
            n4.a3 r3 = r0.o()
            r3.h()
            java.lang.String r3 = r3.f9596m
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x05eb
        L_0x0586:
            boolean r3 = r0.g()
            n4.w3 r4 = r0.r()
            android.content.SharedPreferences r4 = r4.f10253c
            if (r4 != 0) goto L_0x0594
            r4 = r2
            goto L_0x059a
        L_0x0594:
            java.lang.String r5 = "deferred_analytics_collection"
            boolean r4 = r4.contains(r5)
        L_0x059a:
            if (r4 != 0) goto L_0x05ad
            n4.f r4 = r0.f9992g
            boolean r4 = r4.q()
            if (r4 != 0) goto L_0x05ad
            n4.w3 r4 = r0.r()
            r5 = r3 ^ 1
            r4.p(r5)
        L_0x05ad:
            if (r3 == 0) goto L_0x05b6
            n4.a6 r3 = r0.t()
            r3.E()
        L_0x05b6:
            n4.l7 r3 = r0.w()
            n4.k7 r3 = r3.f9930e
            r3.a()
            n4.a7 r3 = r0.v()
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            r3.w(r4)
            n4.a7 r3 = r0.v()
            n4.w3 r4 = r0.r()
            n4.s3 r4 = r4.w
            android.os.Bundle r4 = r4.a()
            r3.g()
            r3.h()
            n4.g8 r2 = r3.p(r2)
            n4.q6 r5 = new n4.q6
            r5.<init>(r3, r2, r4)
            r3.s(r5)
        L_0x05eb:
            n4.w3 r0 = r0.r()
            n4.r3 r0 = r0.f10262m
            r0.a(r1)
            return
        L_0x05f5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x05fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x0605:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x060d:
            java.lang.Object r0 = r15.f9553b
            n3.p r0 = (n3.p) r0
            java.lang.Object r1 = r15.f9554c
            n3.r r1 = (n3.r) r1
            int r1 = r1.f9561a
            monitor-enter(r0)
            android.util.SparseArray<n3.r<?>> r2 = r0.f9559e     // Catch:{ all -> 0x064e }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x064e }
            n3.r r2 = (n3.r) r2     // Catch:{ all -> 0x064e }
            if (r2 == 0) goto L_0x064c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x064e }
            r5 = 31
            r4.<init>(r5)     // Catch:{ all -> 0x064e }
            java.lang.String r5 = "Timing out request: "
            r4.append(r5)     // Catch:{ all -> 0x064e }
            r4.append(r1)     // Catch:{ all -> 0x064e }
            java.lang.String r5 = "MessengerIpcClient"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x064e }
            android.util.Log.w(r5, r4)     // Catch:{ all -> 0x064e }
            android.util.SparseArray<n3.r<?>> r4 = r0.f9559e     // Catch:{ all -> 0x064e }
            r4.remove(r1)     // Catch:{ all -> 0x064e }
            n3.s r1 = new n3.s     // Catch:{ all -> 0x064e }
            java.lang.String r4 = "Timed out waiting for response"
            r1.<init>(r4, r3)     // Catch:{ all -> 0x064e }
            r2.c(r1)     // Catch:{ all -> 0x064e }
            r0.c()     // Catch:{ all -> 0x064e }
        L_0x064c:
            monitor-exit(r0)
            return
        L_0x064e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0651:
            java.lang.Object r0 = r15.f9554c
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            n4.n4 r0 = r0.f2841a
            n4.a7 r0 = r0.v()
            java.lang.Object r3 = r15.f9553b
            j4.x0 r3 = (j4.x0) r3
            r0.g()
            r0.h()
            n4.g8 r2 = r0.p(r2)
            n4.v4 r4 = new n4.v4
            r4.<init>(r0, r2, r3, r1)
            r0.s(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.o.run():void");
    }

    public /* synthetic */ o(Object obj, Object obj2, int i10) {
        this.f9552a = i10;
        this.f9554c = obj;
        this.f9553b = obj2;
    }
}
