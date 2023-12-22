package n4;

import android.content.Context;
import android.os.Bundle;
import i4.z7;
import j4.d1;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import r3.o;
import w3.b;
import y3.a;

public final class n4 implements c5 {
    public static volatile n4 H;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public final AtomicInteger F = new AtomicInteger(0);
    public final long G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9986a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9987b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9988c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9989d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9990e;

    /* renamed from: f  reason: collision with root package name */
    public final z7 f9991f;

    /* renamed from: g  reason: collision with root package name */
    public final f f9992g;

    /* renamed from: h  reason: collision with root package name */
    public final w3 f9993h;

    /* renamed from: i  reason: collision with root package name */
    public final i3 f9994i;

    /* renamed from: j  reason: collision with root package name */
    public final m4 f9995j;
    public final l7 k;

    /* renamed from: l  reason: collision with root package name */
    public final d8 f9996l;

    /* renamed from: m  reason: collision with root package name */
    public final d3 f9997m;

    /* renamed from: n  reason: collision with root package name */
    public final a f9998n;

    /* renamed from: o  reason: collision with root package name */
    public final l6 f9999o;

    /* renamed from: p  reason: collision with root package name */
    public final a6 f10000p;

    /* renamed from: q  reason: collision with root package name */
    public final q1 f10001q;

    /* renamed from: r  reason: collision with root package name */
    public final e6 f10002r;

    /* renamed from: s  reason: collision with root package name */
    public final String f10003s;

    /* renamed from: t  reason: collision with root package name */
    public c3 f10004t;
    public a7 u;

    /* renamed from: v  reason: collision with root package name */
    public l f10005v;
    public a3 w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f10006x = false;

    /* renamed from: y  reason: collision with root package name */
    public Boolean f10007y;

    /* renamed from: z  reason: collision with root package name */
    public long f10008z;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public n4(n4.i5 r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f10006x = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r9.F = r1
            android.content.Context r1 = r10.f9836a
            i4.z7 r2 = new i4.z7
            r2.<init>(r0)
            r9.f9991f = r2
            y3.a.f13023d = r2
            r9.f9986a = r1
            java.lang.String r2 = r10.f9837b
            r9.f9987b = r2
            java.lang.String r2 = r10.f9838c
            r9.f9988c = r2
            java.lang.String r2 = r10.f9839d
            r9.f9989d = r2
            boolean r2 = r10.f9843h
            r9.f9990e = r2
            java.lang.Boolean r2 = r10.f9840e
            r9.A = r2
            java.lang.String r2 = r10.f9845j
            r9.f10003s = r2
            r2 = 1
            r9.D = r2
            j4.d1 r3 = r10.f9842g
            if (r3 == 0) goto L_0x005b
            android.os.Bundle r4 = r3.f8101g
            if (r4 == 0) goto L_0x005b
            java.lang.String r5 = "measurementEnabled"
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof java.lang.Boolean
            if (r5 == 0) goto L_0x004b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r9.B = r4
        L_0x004b:
            android.os.Bundle r3 = r3.f8101g
            java.lang.String r4 = "measurementDeactivated"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x005b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r9.C = r3
        L_0x005b:
            j4.m4 r3 = j4.f5.f8138g
            r4 = 0
            if (r3 != 0) goto L_0x00c0
            if (r1 != 0) goto L_0x0063
            goto L_0x00c0
        L_0x0063:
            java.lang.Object r3 = j4.f5.f8137f
            monitor-enter(r3)
            j4.m4 r5 = j4.f5.f8138g     // Catch:{ all -> 0x00bd }
            if (r5 != 0) goto L_0x00bb
            monitor-enter(r3)     // Catch:{ all -> 0x00bd }
            j4.m4 r5 = j4.f5.f8138g     // Catch:{ all -> 0x00b8 }
            android.content.Context r6 = r1.getApplicationContext()     // Catch:{ all -> 0x00b8 }
            if (r6 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r6 = r1
        L_0x0075:
            if (r5 == 0) goto L_0x007b
            android.content.Context r5 = r5.f8323a     // Catch:{ all -> 0x00b8 }
            if (r5 == r6) goto L_0x00b3
        L_0x007b:
            j4.o4.c()     // Catch:{ all -> 0x00b8 }
            j4.g5.a()     // Catch:{ all -> 0x00b8 }
            java.lang.Class<j4.s4> r5 = j4.s4.class
            monitor-enter(r5)     // Catch:{ all -> 0x00b8 }
            j4.s4 r7 = j4.s4.f8457c     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x009b
            android.content.Context r8 = r7.f8458a     // Catch:{ all -> 0x00b5 }
            if (r8 == 0) goto L_0x009b
            j4.r4 r7 = r7.f8459b     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x009b
            android.content.ContentResolver r7 = r8.getContentResolver()     // Catch:{ all -> 0x00b5 }
            j4.s4 r8 = j4.s4.f8457c     // Catch:{ all -> 0x00b5 }
            j4.r4 r8 = r8.f8459b     // Catch:{ all -> 0x00b5 }
            r7.unregisterContentObserver(r8)     // Catch:{ all -> 0x00b5 }
        L_0x009b:
            j4.s4.f8457c = r4     // Catch:{ all -> 0x00b5 }
            monitor-exit(r5)     // Catch:{ all -> 0x00b8 }
            j4.x4 r4 = new j4.x4     // Catch:{ all -> 0x00b8 }
            r4.<init>(r6)     // Catch:{ all -> 0x00b8 }
            j4.m5 r4 = y3.a.K(r4)     // Catch:{ all -> 0x00b8 }
            j4.m4 r5 = new j4.m4     // Catch:{ all -> 0x00b8 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x00b8 }
            j4.f5.f8138g = r5     // Catch:{ all -> 0x00b8 }
            java.util.concurrent.atomic.AtomicInteger r4 = j4.f5.f8139h     // Catch:{ all -> 0x00b8 }
            r4.incrementAndGet()     // Catch:{ all -> 0x00b8 }
        L_0x00b3:
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            goto L_0x00bb
        L_0x00b5:
            r10 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b8 }
            throw r10     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            throw r10     // Catch:{ all -> 0x00bd }
        L_0x00bb:
            monitor-exit(r3)     // Catch:{ all -> 0x00bd }
            goto L_0x00c0
        L_0x00bd:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00bd }
            throw r10
        L_0x00c0:
            y3.a r3 = y3.a.P
            r9.f9998n = r3
            java.lang.Long r3 = r10.f9844i
            if (r3 == 0) goto L_0x00cd
            long r3 = r3.longValue()
            goto L_0x00d1
        L_0x00cd:
            long r3 = java.lang.System.currentTimeMillis()
        L_0x00d1:
            r9.G = r3
            n4.f r3 = new n4.f
            r3.<init>(r9)
            r9.f9992g = r3
            n4.w3 r3 = new n4.w3
            r3.<init>(r9)
            r3.j()
            r9.f9993h = r3
            n4.i3 r3 = new n4.i3
            r3.<init>(r9)
            r3.j()
            r9.f9994i = r3
            n4.d8 r3 = new n4.d8
            r3.<init>(r9)
            r3.j()
            r9.f9996l = r3
            g1.t r3 = new g1.t
            r3.<init>((n4.n4) r9)
            n4.d3 r4 = new n4.d3
            r4.<init>(r3)
            r9.f9997m = r4
            n4.q1 r3 = new n4.q1
            r3.<init>(r9)
            r9.f10001q = r3
            n4.l6 r3 = new n4.l6
            r3.<init>(r9)
            r3.i()
            r9.f9999o = r3
            n4.a6 r3 = new n4.a6
            r3.<init>(r9)
            r3.i()
            r9.f10000p = r3
            n4.l7 r3 = new n4.l7
            r3.<init>(r9)
            r3.i()
            r9.k = r3
            n4.e6 r3 = new n4.e6
            r3.<init>(r9)
            r3.j()
            r9.f10002r = r3
            n4.m4 r3 = new n4.m4
            r3.<init>(r9)
            r3.j()
            r9.f9995j = r3
            j4.d1 r4 = r10.f9842g
            if (r4 == 0) goto L_0x014a
            long r4 = r4.f8096b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x014a
            goto L_0x014b
        L_0x014a:
            r0 = r2
        L_0x014b:
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L_0x018f
            n4.a6 r1 = r9.t()
            n4.n4 r4 = r1.f9600a
            android.content.Context r4 = r4.f9986a
            android.content.Context r4 = r4.getApplicationContext()
            boolean r4 = r4 instanceof android.app.Application
            if (r4 == 0) goto L_0x019a
            n4.n4 r4 = r1.f9600a
            android.content.Context r4 = r4.f9986a
            android.content.Context r4 = r4.getApplicationContext()
            android.app.Application r4 = (android.app.Application) r4
            n4.z5 r5 = r1.f9601c
            if (r5 != 0) goto L_0x0178
            n4.z5 r5 = new n4.z5
            r5.<init>(r1)
            r1.f9601c = r5
        L_0x0178:
            if (r0 == 0) goto L_0x019a
            n4.z5 r0 = r1.f9601c
            r4.unregisterActivityLifecycleCallbacks(r0)
            n4.z5 r0 = r1.f9601c
            r4.registerActivityLifecycleCallbacks(r0)
            n4.n4 r0 = r1.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r1 = "Registered activity lifecycle callback"
            goto L_0x0197
        L_0x018f:
            n4.i3 r0 = r9.a()
            n4.g3 r0 = r0.f9831i
            java.lang.String r1 = "Application context is not an Application"
        L_0x0197:
            r0.a(r1)
        L_0x019a:
            n3.o r0 = new n3.o
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r10, (int) r2)
            r3.o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.n4.<init>(n4.i5):void");
    }

    public static final void i(o3 o3Var) {
        if (o3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!o3Var.f10031b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o3Var.getClass())));
        }
    }

    public static final void j(b5 b5Var) {
        if (b5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b5Var.f9629b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b5Var.getClass())));
        }
    }

    public static n4 s(Context context, d1 d1Var, Long l6) {
        Bundle bundle;
        if (d1Var != null && (d1Var.f8099e == null || d1Var.f8100f == null)) {
            d1Var = new d1(d1Var.f8095a, d1Var.f8096b, d1Var.f8097c, d1Var.f8098d, (String) null, (String) null, d1Var.f8101g, (String) null);
        }
        o.h(context);
        o.h(context.getApplicationContext());
        if (H == null) {
            synchronized (n4.class) {
                if (H == null) {
                    H = new n4(new i5(context, d1Var, l6));
                }
            }
        } else if (!(d1Var == null || (bundle = d1Var.f8101g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            o.h(H);
            H.A = Boolean.valueOf(d1Var.f8101g.getBoolean("dataCollectionDefaultEnabled"));
        }
        o.h(H);
        return H;
    }

    @Pure
    public final i3 a() {
        j(this.f9994i);
        return this.f9994i;
    }

    public final void b() {
        this.F.incrementAndGet();
    }

    @Pure
    public final b c() {
        return this.f9998n;
    }

    @Pure
    public final m4 d() {
        j(this.f9995j);
        return this.f9995j;
    }

    @Pure
    public final z7 e() {
        return this.f9991f;
    }

    @Pure
    public final Context f() {
        return this.f9986a;
    }

    public final boolean g() {
        return k() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r0 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        if (android.text.TextUtils.isEmpty(r0.f9596m) == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f10008z) > 1000) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r6 = this;
            boolean r0 = r6.f10006x
            if (r0 == 0) goto L_0x00dd
            n4.m4 r0 = r6.d()
            r0.g()
            java.lang.Boolean r0 = r6.f10007y
            if (r0 == 0) goto L_0x0033
            long r1 = r6.f10008z
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d6
            y3.a r0 = r6.f9998n
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.f10008z
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d6
        L_0x0033:
            y3.a r0 = r6.f9998n
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f10008z = r0
            n4.d8 r0 = r6.x()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.P(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0098
            n4.d8 r0 = r6.x()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.P(r3)
            if (r0 == 0) goto L_0x0098
            android.content.Context r0 = r6.f9986a
            y3.b r0 = y3.c.a(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0096
            n4.f r0 = r6.f9992g
            boolean r0 = r0.s()
            if (r0 != 0) goto L_0x0096
            android.content.Context r0 = r6.f9986a
            boolean r0 = n4.d8.V(r0)
            if (r0 == 0) goto L_0x0098
            android.content.Context r0 = r6.f9986a
            r3.o.h(r0)
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0093 }
            if (r4 != 0) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0093 }
            r5.<init>(r0, r3)     // Catch:{ NameNotFoundException -> 0x0093 }
            android.content.pm.ServiceInfo r0 = r4.getServiceInfo(r5, r1)     // Catch:{ NameNotFoundException -> 0x0093 }
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0093 }
            if (r0 == 0) goto L_0x0093
            r0 = r2
            goto L_0x0094
        L_0x0093:
            r0 = r1
        L_0x0094:
            if (r0 == 0) goto L_0x0098
        L_0x0096:
            r0 = r2
            goto L_0x0099
        L_0x0098:
            r0 = r1
        L_0x0099:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f10007y = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d6
            n4.d8 r0 = r6.x()
            n4.a3 r3 = r6.o()
            java.lang.String r3 = r3.m()
            n4.a3 r4 = r6.o()
            r4.h()
            java.lang.String r4 = r4.f9596m
            boolean r0 = r0.H(r3, r4)
            if (r0 != 0) goto L_0x00cf
            n4.a3 r0 = r6.o()
            r0.h()
            java.lang.String r0 = r0.f9596m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d0
        L_0x00cf:
            r1 = r2
        L_0x00d0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f10007y = r0
        L_0x00d6:
            java.lang.Boolean r0 = r6.f10007y
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.n4.h():boolean");
    }

    public final int k() {
        d().g();
        if (this.f9992g.q()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        d().g();
        if (!this.D) {
            return 8;
        }
        Boolean n2 = r().n();
        if (n2 != null) {
            return n2.booleanValue() ? 0 : 3;
        }
        f fVar = this.f9992g;
        z7 z7Var = fVar.f9600a.f9991f;
        Boolean n10 = fVar.n("firebase_analytics_collection_enabled");
        if (n10 != null) {
            return n10.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    @Pure
    public final q1 l() {
        q1 q1Var = this.f10001q;
        if (q1Var != null) {
            return q1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final f m() {
        return this.f9992g;
    }

    @Pure
    public final l n() {
        j(this.f10005v);
        return this.f10005v;
    }

    @Pure
    public final a3 o() {
        i(this.w);
        return this.w;
    }

    @Pure
    public final c3 p() {
        i(this.f10004t);
        return this.f10004t;
    }

    @Pure
    public final d3 q() {
        return this.f9997m;
    }

    @Pure
    public final w3 r() {
        w3 w3Var = this.f9993h;
        if (w3Var != null) {
            return w3Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final a6 t() {
        i(this.f10000p);
        return this.f10000p;
    }

    @Pure
    public final l6 u() {
        i(this.f9999o);
        return this.f9999o;
    }

    @Pure
    public final a7 v() {
        i(this.u);
        return this.u;
    }

    @Pure
    public final l7 w() {
        i(this.k);
        return this.k;
    }

    @Pure
    public final d8 x() {
        d8 d8Var = this.f9996l;
        if (d8Var != null) {
            return d8Var;
        }
        throw new IllegalStateException("Component not created");
    }
}
