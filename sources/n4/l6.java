package n4;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import r3.o;

public final class l6 extends o3 {

    /* renamed from: c  reason: collision with root package name */
    public volatile g6 f9919c;

    /* renamed from: d  reason: collision with root package name */
    public volatile g6 f9920d;

    /* renamed from: e  reason: collision with root package name */
    public g6 f9921e;

    /* renamed from: f  reason: collision with root package name */
    public final ConcurrentHashMap f9922f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public Activity f9923g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f9924h;

    /* renamed from: i  reason: collision with root package name */
    public volatile g6 f9925i;

    /* renamed from: j  reason: collision with root package name */
    public g6 f9926j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f9927l = new Object();

    public l6(n4 n4Var) {
        super(n4Var);
    }

    public final boolean j() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        if (r7 == 0) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(n4.g6 r10, n4.g6 r11, long r12, boolean r14, android.os.Bundle r15) {
        /*
            r9 = this;
            r9.g()
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L_0x0026
            long r2 = r11.f9763c
            long r4 = r10.f9763c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = r11.f9762b
            java.lang.String r3 = r10.f9762b
            boolean r2 = z5.c.x(r2, r3)
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = r11.f9761a
            java.lang.String r3 = r10.f9761a
            boolean r2 = z5.c.x(r2, r3)
            if (r2 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = r0
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r14 == 0) goto L_0x002e
            n4.g6 r14 = r9.f9921e
            if (r14 == 0) goto L_0x002e
            r0 = r1
        L_0x002e:
            if (r2 == 0) goto L_0x00b4
            android.os.Bundle r6 = new android.os.Bundle
            if (r15 == 0) goto L_0x0038
            r6.<init>(r15)
            goto L_0x003b
        L_0x0038:
            r6.<init>()
        L_0x003b:
            n4.d8.t(r10, r6, r1)
            if (r11 == 0) goto L_0x0059
            java.lang.String r14 = r11.f9761a
            if (r14 == 0) goto L_0x0049
            java.lang.String r15 = "_pn"
            r6.putString(r15, r14)
        L_0x0049:
            java.lang.String r14 = r11.f9762b
            if (r14 == 0) goto L_0x0052
            java.lang.String r15 = "_pc"
            r6.putString(r15, r14)
        L_0x0052:
            long r14 = r11.f9763c
            java.lang.String r11 = "_pi"
            r6.putLong(r11, r14)
        L_0x0059:
            r14 = 0
            if (r0 == 0) goto L_0x0078
            n4.n4 r11 = r9.f9600a
            n4.l7 r11 = r11.w()
            n4.j7 r11 = r11.f9931f
            long r2 = r11.f9869b
            long r2 = r12 - r2
            r11.f9869b = r12
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x0078
            n4.n4 r11 = r9.f9600a
            n4.d8 r11 = r11.x()
            r11.r(r6, r2)
        L_0x0078:
            n4.n4 r11 = r9.f9600a
            n4.f r11 = r11.f9992g
            boolean r11 = r11.p()
            if (r11 != 0) goto L_0x0089
            r2 = 1
            java.lang.String r11 = "_mst"
            r6.putLong(r11, r2)
        L_0x0089:
            boolean r11 = r10.f9765e
            if (r1 == r11) goto L_0x0090
            java.lang.String r11 = "auto"
            goto L_0x0092
        L_0x0090:
            java.lang.String r11 = "app"
        L_0x0092:
            r4 = r11
            n4.n4 r11 = r9.f9600a
            y3.a r11 = r11.f9998n
            r11.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            boolean r11 = r10.f9765e
            if (r11 == 0) goto L_0x00a8
            long r7 = r10.f9766f
            int r11 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x00a9
        L_0x00a8:
            r7 = r2
        L_0x00a9:
            n4.n4 r11 = r9.f9600a
            n4.a6 r3 = r11.t()
            java.lang.String r5 = "_vs"
            r3.o(r4, r5, r6, r7)
        L_0x00b4:
            if (r0 == 0) goto L_0x00bb
            n4.g6 r11 = r9.f9921e
            r9.l(r11, r1, r12)
        L_0x00bb:
            r9.f9921e = r10
            boolean r11 = r10.f9765e
            if (r11 == 0) goto L_0x00c3
            r9.f9926j = r10
        L_0x00c3:
            n4.n4 r11 = r9.f9600a
            n4.a7 r11 = r11.v()
            r11.g()
            r11.h()
            c4.f r12 = new c4.f
            r13 = 2
            r12.<init>(r11, r10, r13)
            r11.s(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.l6.k(n4.g6, n4.g6, long, boolean, android.os.Bundle):void");
    }

    public final void l(g6 g6Var, boolean z9, long j10) {
        boolean z10;
        q1 l6 = this.f9600a.l();
        this.f9600a.f9998n.getClass();
        l6.j(SystemClock.elapsedRealtime());
        if (g6Var == null || !g6Var.f9764d) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f9600a.w().f9931f.a(z10, j10, z9) && g6Var != null) {
            g6Var.f9764d = false;
        }
    }

    public final g6 m(boolean z9) {
        h();
        g();
        if (!z9) {
            return this.f9921e;
        }
        g6 g6Var = this.f9921e;
        return g6Var != null ? g6Var : this.f9926j;
    }

    public final String n(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        this.f9600a.getClass();
        if (length2 <= 100) {
            return str;
        }
        this.f9600a.getClass();
        return str.substring(0, 100);
    }

    public final void o(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f9600a.f9992g.p() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f9922f.put(activity, new g6(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
        }
    }

    public final g6 p(Activity activity) {
        o.h(activity);
        g6 g6Var = (g6) this.f9922f.get(activity);
        if (g6Var == null) {
            g6 g6Var2 = new g6(this.f9600a.x().j0(), (String) null, n(activity.getClass()));
            this.f9922f.put(activity, g6Var2);
            g6Var = g6Var2;
        }
        return this.f9925i != null ? this.f9925i : g6Var;
    }

    public final void q(Activity activity, g6 g6Var, boolean z9) {
        g6 g6Var2;
        g6 g6Var3;
        String str;
        g6 g6Var4 = g6Var;
        if (this.f9919c == null) {
            g6Var2 = this.f9920d;
        } else {
            g6Var2 = this.f9919c;
        }
        g6 g6Var5 = g6Var2;
        if (g6Var4.f9762b == null) {
            if (activity != null) {
                str = n(activity.getClass());
            } else {
                str = null;
            }
            g6Var3 = new g6(g6Var4.f9761a, str, g6Var4.f9763c, g6Var4.f9765e, g6Var4.f9766f);
        } else {
            g6Var3 = g6Var4;
        }
        this.f9920d = this.f9919c;
        this.f9919c = g6Var3;
        this.f9600a.f9998n.getClass();
        this.f9600a.d().o(new i6(this, g6Var3, g6Var5, SystemClock.elapsedRealtime(), z9));
    }
}
