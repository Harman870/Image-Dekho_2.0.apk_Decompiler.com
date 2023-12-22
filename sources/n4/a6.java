package n4;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import c.a;
import j4.fb;
import j4.gb;
import j4.pa;
import j4.qa;
import j4.tc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q3.i0;
import r3.o;
import u1.t;
import w3.i;
import z5.c;

public final class a6 extends o3 {

    /* renamed from: c  reason: collision with root package name */
    public z5 f9601c;

    /* renamed from: d  reason: collision with root package name */
    public g5 f9602d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArraySet f9603e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f9604f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f9605g = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    public final Object f9606h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public f5 f9607i = f5.f9743c;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicLong f9608j = new AtomicLong(0);
    public long k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final i8 f9609l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9610m = true;

    /* renamed from: n  reason: collision with root package name */
    public final t f9611n = new t((Object) this);

    public a6(n4 n4Var) {
        super(n4Var);
        this.f9609l = new i8(n4Var);
    }

    public static /* bridge */ /* synthetic */ void C(a6 a6Var, f5 f5Var, f5 f5Var2) {
        boolean z9;
        e5 e5Var = e5.AD_STORAGE;
        e5 e5Var2 = e5.ANALYTICS_STORAGE;
        e5[] e5VarArr = {e5Var2, e5Var};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z9 = false;
                break;
            }
            e5 e5Var3 = e5VarArr[i10];
            if (!f5Var2.f(e5Var3) && f5Var.f(e5Var3)) {
                z9 = true;
                break;
            }
            i10++;
        }
        boolean g10 = f5Var.g(f5Var2, e5Var2, e5Var);
        if (z9 || g10) {
            a6Var.f9600a.o().n();
        }
    }

    public static void D(a6 a6Var, f5 f5Var, long j10, boolean z9, boolean z10) {
        g3 g3Var;
        String str;
        Object obj;
        boolean z11;
        a6Var.g();
        a6Var.h();
        f5 m2 = a6Var.f9600a.r().m();
        if (j10 <= a6Var.k) {
            if (m2.f9745b <= f5Var.f9745b) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                g3Var = a6Var.f9600a.a().f9833l;
                str = "Dropped out-of-date consent setting, proposed settings";
                obj = f5Var;
                g3Var.b(str, obj);
            }
        }
        w3 r4 = a6Var.f9600a.r();
        n4 n4Var = r4.f9600a;
        r4.g();
        int i10 = f5Var.f9745b;
        if (r4.r(i10)) {
            SharedPreferences.Editor edit = r4.k().edit();
            edit.putString("consent_settings", f5Var.e());
            edit.putInt("consent_source", i10);
            edit.apply();
            a6Var.k = j10;
            a7 v10 = a6Var.f9600a.v();
            v10.g();
            v10.h();
            if (z9) {
                v10.f9600a.getClass();
                v10.f9600a.p().l();
            }
            if (v10.n()) {
                v10.s(new u6(v10, 0, v10.p(false)));
            }
            if (z10) {
                a6Var.f9600a.v().w(new AtomicReference());
                return;
            }
            return;
        }
        g3Var = a6Var.f9600a.a().f9833l;
        str = "Lower precedence consent source ignored, proposed source";
        obj = Integer.valueOf(f5Var.f9745b);
        g3Var.b(str, obj);
    }

    public final void A() {
        long j10;
        g();
        String a10 = this.f9600a.r().f10261l.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                this.f9600a.f9998n.getClass();
                y(System.currentTimeMillis(), (Object) null, "app", "_npa");
            } else {
                if (true != "true".equals(a10)) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                Long valueOf = Long.valueOf(j10);
                this.f9600a.f9998n.getClass();
                y(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!this.f9600a.g() || !this.f9610m) {
            this.f9600a.a().f9834m.a("Updating Scion state (FE)");
            a7 v10 = this.f9600a.v();
            v10.g();
            v10.h();
            v10.s(new i0(v10, 3, v10.p(true)));
            return;
        }
        this.f9600a.a().f9834m.a("Recording app launch after enabling measurement for the first time (FE)");
        E();
        ((gb) fb.f8153b.f8154a.zza()).zza();
        if (this.f9600a.f9992g.o((String) null, w2.f10214e0)) {
            this.f9600a.w().f9930e.a();
        }
        this.f9600a.d().o(new l5(this));
    }

    public final String B() {
        return (String) this.f9605g.get();
    }

    public final void E() {
        g();
        h();
        if (this.f9600a.h()) {
            if (this.f9600a.f9992g.o((String) null, w2.Y)) {
                f fVar = this.f9600a.f9992g;
                fVar.f9600a.getClass();
                Boolean n2 = fVar.n("google_analytics_deferred_deep_link_enabled");
                if (n2 != null && n2.booleanValue()) {
                    this.f9600a.a().f9834m.a("Deferred Deep Link feature enabled.");
                    this.f9600a.d().o(new k5(this));
                }
            }
            a7 v10 = this.f9600a.v();
            v10.g();
            v10.h();
            g8 p5 = v10.p(true);
            v10.f9600a.p().n(3, new byte[0]);
            v10.s(new u5(v10, p5, 1));
            this.f9610m = false;
            w3 r4 = this.f9600a.r();
            r4.g();
            String string = r4.k().getString("previous_os_version", (String) null);
            r4.f9600a.n().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = r4.k().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f9600a.n().i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    n("auto", "_ou", bundle);
                }
            }
        }
    }

    public final boolean j() {
        return false;
    }

    public final void k(String str, String str2, Bundle bundle) {
        this.f9600a.f9998n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        o.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f9600a.d().o(new u4(this, 1, bundle2));
    }

    public final void l() {
        if ((this.f9600a.f9986a.getApplicationContext() instanceof Application) && this.f9601c != null) {
            ((Application) this.f9600a.f9986a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f9601c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ee, code lost:
        if (r5 > 100) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011d, code lost:
        if (r6 > 100) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0171, code lost:
        r2 = r0.f9600a.a().f9835n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0179, code lost:
        if (r13 != null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017b, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017e, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017f, code lost:
        if (r14 != null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0181, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0184, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0185, code lost:
        r2.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018c, code lost:
        if (r0.f9919c != null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018e, code lost:
        r2 = r0.f9920d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0191, code lost:
        r2 = r0.f9919c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0193, code lost:
        r12 = new n4.g6(r13, r14, r0.f9600a.x().j0(), true, r26);
        r0.f9919c = r12;
        r0.f9920d = r2;
        r0.f9925i = r12;
        r0.f9600a.f9998n.getClass();
        r0.f9600a.d().o(new n4.h6(r0, r1, r12, r2, android.os.SystemClock.elapsedRealtime()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            r0 = r22
            if (r23 != 0) goto L_0x000c
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r23
        L_0x000e:
            java.lang.String r2 = "screen_view"
            r3 = 0
            if (r0 == r2) goto L_0x00b9
            if (r0 == 0) goto L_0x001b
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00b9
        L_0x001b:
            if (r25 == 0) goto L_0x002a
            n4.g5 r2 = r11.f9602d
            if (r2 == 0) goto L_0x002a
            boolean r2 = n4.d8.T(r22)
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r9 = r3
            goto L_0x002c
        L_0x002a:
            r2 = 1
            r9 = r2
        L_0x002c:
            if (r21 != 0) goto L_0x0032
            java.lang.String r2 = "app"
            r4 = r2
            goto L_0x0034
        L_0x0032:
            r4 = r21
        L_0x0034:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r1)
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r7.get(r2)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0060
            android.os.Bundle r6 = new android.os.Bundle
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6.<init>(r5)
            r7.putBundle(r2, r6)
            goto L_0x0041
        L_0x0060:
            boolean r2 = r5 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x007c
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            r2 = r3
        L_0x0067:
            int r6 = r5.length
            if (r2 >= r6) goto L_0x0041
            r6 = r5[r2]
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x0079
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5[r2] = r8
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x0067
        L_0x007c:
            boolean r2 = r5 instanceof java.util.List
            if (r2 == 0) goto L_0x0041
            java.util.List r5 = (java.util.List) r5
            r2 = r3
        L_0x0083:
            int r6 = r5.size()
            if (r2 >= r6) goto L_0x0041
            java.lang.Object r6 = r5.get(r2)
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x009b
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5.set(r2, r8)
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x009e:
            n4.n4 r1 = r11.f9600a
            n4.m4 r12 = r1.d()
            n4.n5 r13 = new n4.n5
            r1 = r13
            r2 = r20
            r3 = r4
            r4 = r22
            r5 = r26
            r8 = r25
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r12.o(r13)
            return
        L_0x00b9:
            n4.n4 r0 = r11.f9600a
            n4.l6 r0 = r0.u()
            java.lang.Object r2 = r0.f9927l
            monitor-enter(r2)
            boolean r4 = r0.k     // Catch:{ all -> 0x016e }
            if (r4 != 0) goto L_0x00d5
            n4.n4 r0 = r0.f9600a     // Catch:{ all -> 0x016e }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x016e }
            n4.g3 r0 = r0.k     // Catch:{ all -> 0x016e }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
        L_0x00d0:
            r0.a(r1)     // Catch:{ all -> 0x016e }
            goto L_0x016c
        L_0x00d5:
            java.lang.String r4 = "screen_name"
            java.lang.String r13 = r1.getString(r4)     // Catch:{ all -> 0x016e }
            r4 = 100
            if (r13 == 0) goto L_0x0106
            int r5 = r13.length()     // Catch:{ all -> 0x016e }
            if (r5 <= 0) goto L_0x00f0
            int r5 = r13.length()     // Catch:{ all -> 0x016e }
            n4.n4 r6 = r0.f9600a     // Catch:{ all -> 0x016e }
            r6.getClass()     // Catch:{ all -> 0x016e }
            if (r5 <= r4) goto L_0x0106
        L_0x00f0:
            n4.n4 r0 = r0.f9600a     // Catch:{ all -> 0x016e }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x016e }
            n4.g3 r0 = r0.k     // Catch:{ all -> 0x016e }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r3 = r13.length()     // Catch:{ all -> 0x016e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x016e }
        L_0x0102:
            r0.b(r1, r3)     // Catch:{ all -> 0x016e }
            goto L_0x016c
        L_0x0106:
            java.lang.String r5 = "screen_class"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x0132
            int r6 = r5.length()     // Catch:{ all -> 0x016e }
            if (r6 <= 0) goto L_0x011f
            int r6 = r5.length()     // Catch:{ all -> 0x016e }
            n4.n4 r7 = r0.f9600a     // Catch:{ all -> 0x016e }
            r7.getClass()     // Catch:{ all -> 0x016e }
            if (r6 <= r4) goto L_0x0132
        L_0x011f:
            n4.n4 r0 = r0.f9600a     // Catch:{ all -> 0x016e }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x016e }
            n4.g3 r0 = r0.k     // Catch:{ all -> 0x016e }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r3 = r5.length()     // Catch:{ all -> 0x016e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x016e }
            goto L_0x0102
        L_0x0132:
            if (r5 != 0) goto L_0x0145
            android.app.Activity r4 = r0.f9923g     // Catch:{ all -> 0x016e }
            if (r4 == 0) goto L_0x0141
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x016e }
            java.lang.String r4 = r0.n(r4)     // Catch:{ all -> 0x016e }
            goto L_0x0143
        L_0x0141:
            java.lang.String r4 = "Activity"
        L_0x0143:
            r14 = r4
            goto L_0x0146
        L_0x0145:
            r14 = r5
        L_0x0146:
            n4.g6 r4 = r0.f9919c     // Catch:{ all -> 0x016e }
            boolean r5 = r0.f9924h     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x0170
            if (r4 == 0) goto L_0x0170
            r0.f9924h = r3     // Catch:{ all -> 0x016e }
            java.lang.String r3 = r4.f9762b     // Catch:{ all -> 0x016e }
            boolean r3 = z5.c.x(r3, r14)     // Catch:{ all -> 0x016e }
            java.lang.String r4 = r4.f9761a     // Catch:{ all -> 0x016e }
            boolean r4 = z5.c.x(r4, r13)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x0170
            if (r4 == 0) goto L_0x0170
            n4.n4 r0 = r0.f9600a     // Catch:{ all -> 0x016e }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x016e }
            n4.g3 r0 = r0.k     // Catch:{ all -> 0x016e }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            goto L_0x00d0
        L_0x016c:
            monitor-exit(r2)     // Catch:{ all -> 0x016e }
            goto L_0x01d2
        L_0x016e:
            r0 = move-exception
            goto L_0x01d3
        L_0x0170:
            monitor-exit(r2)     // Catch:{ all -> 0x016e }
            n4.n4 r2 = r0.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9835n
            if (r13 != 0) goto L_0x017e
            java.lang.String r3 = "null"
            goto L_0x017f
        L_0x017e:
            r3 = r13
        L_0x017f:
            if (r14 != 0) goto L_0x0184
            java.lang.String r4 = "null"
            goto L_0x0185
        L_0x0184:
            r4 = r14
        L_0x0185:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.c(r5, r3, r4)
            n4.g6 r2 = r0.f9919c
            if (r2 != 0) goto L_0x0191
            n4.g6 r2 = r0.f9920d
            goto L_0x0193
        L_0x0191:
            n4.g6 r2 = r0.f9919c
        L_0x0193:
            n4.g6 r3 = new n4.g6
            n4.n4 r4 = r0.f9600a
            n4.d8 r4 = r4.x()
            long r15 = r4.j0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r0.f9919c = r3
            r0.f9920d = r2
            r0.f9925i = r3
            n4.n4 r4 = r0.f9600a
            y3.a r4 = r4.f9998n
            r4.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            n4.n4 r6 = r0.f9600a
            n4.m4 r6 = r6.d()
            n4.h6 r7 = new n4.h6
            r21 = r7
            r22 = r0
            r23 = r1
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.o(r7)
        L_0x01d2:
            return
        L_0x01d3:
            monitor-exit(r2)     // Catch:{ all -> 0x016e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a6.m(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void n(String str, String str2, Bundle bundle) {
        g();
        this.f9600a.f9998n.getClass();
        o(str, str2, bundle, System.currentTimeMillis());
    }

    public final void o(String str, String str2, Bundle bundle, long j10) {
        g();
        p(str, str2, j10, bundle, true, this.f9602d == null || d8.T(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v8 */
    public final void p(String str, String str2, long j10, Bundle bundle, boolean z9, boolean z10, boolean z11, String str3) {
        ? r14;
        boolean z12;
        boolean z13;
        long j11;
        String str4;
        String str5;
        boolean z14;
        boolean z15;
        Bundle[] bundleArr;
        Object[] objArr;
        String str6 = str;
        String str7 = str2;
        long j12 = j10;
        Bundle bundle2 = bundle;
        boolean z16 = z11;
        o.e(str);
        o.h(bundle);
        g();
        h();
        if (this.f9600a.g()) {
            List list = this.f9600a.o().f9593i;
            if (list == null || list.contains(str7)) {
                if (!this.f9604f) {
                    this.f9604f = true;
                    try {
                        n4 n4Var = this.f9600a;
                        try {
                            (!n4Var.f9990e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, n4Var.f9986a.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.f9600a.f9986a});
                        } catch (Exception e10) {
                            this.f9600a.a().f9831i.b("Failed to invoke Tag Manager's initialize() method", e10);
                        }
                    } catch (ClassNotFoundException unused) {
                        this.f9600a.a().f9833l.a("Tag Manager is not found and thus will not be used");
                    }
                }
                if (!"_cmp".equals(str7) || !bundle2.containsKey("gclid")) {
                    r14 = 0;
                } else {
                    this.f9600a.getClass();
                    String string = bundle2.getString("gclid");
                    this.f9600a.f9998n.getClass();
                    r14 = 0;
                    y(System.currentTimeMillis(), string, "auto", "_lgclid");
                }
                this.f9600a.getClass();
                if (z9 && (!d8.f9707h[r14].equals(str7))) {
                    this.f9600a.x().u(bundle2, this.f9600a.r().w.a());
                }
                if (!z16) {
                    this.f9600a.getClass();
                    if (!"_iap".equals(str7)) {
                        d8 x9 = this.f9600a.x();
                        int i10 = 2;
                        if (x9.O("event", str7)) {
                            if (!x9.L("event", a.f2356q, a.f2358r, str7)) {
                                i10 = 13;
                            } else {
                                x9.f9600a.getClass();
                                if (x9.I(40, "event", str7)) {
                                    i10 = r14;
                                }
                            }
                        }
                        if (i10 != 0) {
                            this.f9600a.a().f9830h.b("Invalid public event name. Event will not be logged (FE)", this.f9600a.f9997m.d(str7));
                            d8 x10 = this.f9600a.x();
                            this.f9600a.getClass();
                            x10.getClass();
                            String n2 = d8.n(40, str7, true);
                            int i11 = r14;
                            if (str7 != null) {
                                i11 = str2.length();
                            }
                            d8 x11 = this.f9600a.x();
                            t tVar = this.f9611n;
                            x11.getClass();
                            d8.x(tVar, (String) null, i10, "_ev", n2, i11);
                            return;
                        }
                    }
                }
                this.f9600a.getClass();
                g6 m2 = this.f9600a.u().m(r14);
                if (m2 != null && !bundle2.containsKey("_sc")) {
                    m2.f9764d = true;
                }
                d8.t(m2, bundle2, (!z9 || z16) ? r14 : true);
                boolean equals = "am".equals(str6);
                boolean T = d8.T(str2);
                if (!z9 || this.f9602d == null || T) {
                    z12 = equals;
                } else if (equals) {
                    z12 = true;
                } else {
                    this.f9600a.a().f9834m.c("Passing event to registered event handler (FE)", this.f9600a.f9997m.d(str7), this.f9600a.f9997m.b(bundle2));
                    o.h(this.f9602d);
                    this.f9602d.interceptEvent(str, str2, bundle, j10);
                    return;
                }
                if (this.f9600a.h()) {
                    int d02 = this.f9600a.x().d0(str7);
                    if (d02 != 0) {
                        this.f9600a.a().f9830h.b("Invalid event name. Event will not be logged (FE)", this.f9600a.f9997m.d(str7));
                        d8 x12 = this.f9600a.x();
                        this.f9600a.getClass();
                        x12.getClass();
                        String n10 = d8.n(40, str7, true);
                        int length = str7 != null ? str2.length() : r14;
                        d8 x13 = this.f9600a.x();
                        t tVar2 = this.f9611n;
                        x13.getClass();
                        d8.x(tVar2, str3, d02, "_ev", n10, length);
                        return;
                    }
                    Bundle m02 = this.f9600a.x().m0(str7, bundle2, Collections.unmodifiableList(Arrays.asList(new String[]{"_o", "_sn", "_sc", "_si"})), z16);
                    o.h(m02);
                    this.f9600a.getClass();
                    if (this.f9600a.u().m(r14) != null && "_ae".equals(str7)) {
                        j7 j7Var = this.f9600a.w().f9931f;
                        j7Var.f9871d.f9600a.f9998n.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j13 = elapsedRealtime - j7Var.f9869b;
                        j7Var.f9869b = elapsedRealtime;
                        if (j13 > 0) {
                            this.f9600a.x().r(m02, j13);
                        }
                    }
                    ((qa) pa.f8389b.f8390a.zza()).zza();
                    if (this.f9600a.f9992g.o((String) null, w2.f10212d0)) {
                        if (!"auto".equals(str6) && "_ssr".equals(str7)) {
                            d8 x14 = this.f9600a.x();
                            String string2 = m02.getString("_ffr");
                            if (i.b(string2)) {
                                string2 = null;
                            } else if (string2 != null) {
                                string2 = string2.trim();
                            }
                            String a10 = x14.f9600a.r().f10269t.a();
                            if (!(string2 == a10 || (string2 != null && string2.equals(a10)))) {
                                x14.f9600a.r().f10269t.b(string2);
                            } else {
                                x14.f9600a.a().f9834m.a("Not logging duplicate session_start_with_rollout event");
                                return;
                            }
                        } else if ("_ae".equals(str7)) {
                            String a11 = this.f9600a.x().f9600a.r().f10269t.a();
                            if (!TextUtils.isEmpty(a11)) {
                                m02.putString("_ffr", a11);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(m02);
                    if (this.f9600a.f9992g.o((String) null, w2.f10249y0)) {
                        l7 w = this.f9600a.w();
                        w.g();
                        z13 = w.f9929d;
                    } else {
                        z13 = this.f9600a.r().f10266q.b();
                    }
                    if (this.f9600a.r().f10263n.a() <= 0 || !this.f9600a.r().q(j12) || !z13) {
                        j11 = 0;
                    } else {
                        this.f9600a.a().f9835n.a("Current session is expired, remove the session number, ID, and engagement time");
                        this.f9600a.f9998n.getClass();
                        j11 = 0;
                        y(System.currentTimeMillis(), (Object) null, "auto", "_sid");
                        this.f9600a.f9998n.getClass();
                        y(System.currentTimeMillis(), (Object) null, "auto", "_sno");
                        this.f9600a.f9998n.getClass();
                        y(System.currentTimeMillis(), (Object) null, "auto", "_se");
                        this.f9600a.r().f10264o.b(0);
                    }
                    if (m02.getLong("extend_session", j11) == 1) {
                        this.f9600a.a().f9835n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        this.f9600a.w().f9930e.b(j12, true);
                    }
                    ArrayList arrayList2 = new ArrayList(m02.keySet());
                    Collections.sort(arrayList2);
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        String str8 = (String) arrayList2.get(i12);
                        if (str8 != null) {
                            this.f9600a.x();
                            Object obj = m02.get(str8);
                            if (obj instanceof Bundle) {
                                bundleArr = new Bundle[]{(Bundle) obj};
                            } else {
                                if (obj instanceof Parcelable[]) {
                                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                                    objArr = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                } else if (obj instanceof ArrayList) {
                                    ArrayList arrayList3 = (ArrayList) obj;
                                    objArr = arrayList3.toArray(new Bundle[arrayList3.size()]);
                                } else {
                                    bundleArr = null;
                                }
                                bundleArr = (Bundle[]) objArr;
                            }
                            if (bundleArr != null) {
                                m02.putParcelableArray(str8, bundleArr);
                            }
                        }
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Bundle bundle3 = (Bundle) arrayList.get(i13);
                        if (i13 != 0) {
                            str5 = "_ep";
                            str4 = str;
                        } else {
                            str4 = str;
                            str5 = str2;
                        }
                        bundle3.putString("_o", str4);
                        if (z10) {
                            bundle3 = this.f9600a.x().l0(bundle3);
                        }
                        Bundle bundle4 = bundle3;
                        r rVar = new r(str5, new p(bundle4), str, j10);
                        a7 v10 = this.f9600a.v();
                        v10.getClass();
                        v10.g();
                        v10.h();
                        v10.f9600a.getClass();
                        c3 p5 = v10.f9600a.p();
                        p5.getClass();
                        Parcel obtain = Parcel.obtain();
                        s.a(rVar, obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            p5.f9600a.a().f9829g.a("Event is too long for local database. Sending event directly to service");
                            z15 = true;
                            z14 = false;
                        } else {
                            z14 = p5.n(0, marshall);
                            z15 = true;
                        }
                        v10.s(new t5(v10, v10.p(z15), z14, rVar, str3));
                        if (!z12) {
                            Iterator it = this.f9603e.iterator();
                            while (it.hasNext()) {
                                ((h5) it.next()).onEvent(str, str2, new Bundle(bundle4), j10);
                            }
                        }
                    }
                    this.f9600a.getClass();
                    if (this.f9600a.u().m(false) != null && "_ae".equals(str2)) {
                        l7 w10 = this.f9600a.w();
                        this.f9600a.f9998n.getClass();
                        w10.f9931f.a(true, SystemClock.elapsedRealtime(), true);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f9600a.a().f9834m.c("Dropping non-safelisted event. event name, origin", str7, str6);
            return;
        }
        this.f9600a.a().f9834m.a("Event not sent since app measurement is disabled");
    }

    public final void q(h5 h5Var) {
        h();
        if (!this.f9603e.add(h5Var)) {
            this.f9600a.a().f9831i.a("OnEventListener already registered");
        }
    }

    public final void r(long j10, boolean z9) {
        g();
        h();
        this.f9600a.a().f9834m.a("Resetting analytics data (FE)");
        l7 w = this.f9600a.w();
        w.g();
        j7 j7Var = w.f9931f;
        j7Var.f9870c.a();
        j7Var.f9868a = 0;
        j7Var.f9869b = 0;
        tc.b();
        if (this.f9600a.f9992g.o((String) null, w2.f10224j0)) {
            this.f9600a.o().n();
        }
        boolean g10 = this.f9600a.g();
        w3 r4 = this.f9600a.r();
        r4.f10255e.b(j10);
        if (!TextUtils.isEmpty(r4.f9600a.r().f10269t.a())) {
            r4.f10269t.b((String) null);
        }
        fb fbVar = fb.f8153b;
        ((gb) fbVar.f8154a.zza()).zza();
        f fVar = r4.f9600a.f9992g;
        v2 v2Var = w2.f10214e0;
        if (fVar.o((String) null, v2Var)) {
            r4.f10263n.b(0);
        }
        r4.f10264o.b(0);
        if (!r4.f9600a.f9992g.q()) {
            r4.p(!g10);
        }
        r4.u.b((String) null);
        r4.f10270v.b(0);
        r4.w.b((Bundle) null);
        if (z9) {
            a7 v10 = this.f9600a.v();
            v10.g();
            v10.h();
            g8 p5 = v10.p(false);
            v10.f9600a.getClass();
            v10.f9600a.p().l();
            v10.s(new u4(v10, 3, p5));
        }
        ((gb) fbVar.f8154a.zza()).zza();
        if (this.f9600a.f9992g.o((String) null, v2Var)) {
            this.f9600a.w().f9930e.a();
        }
        this.f9610m = !g10;
    }

    public final void s(Bundle bundle, long j10) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        o.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f9600a.a().f9831i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        c.u(bundle2, "app_id", cls2, (Object) null);
        c.u(bundle2, "origin", cls2, (Object) null);
        c.u(bundle2, "name", cls2, (Object) null);
        c.u(bundle2, "value", Object.class, (Object) null);
        c.u(bundle2, "trigger_event_name", cls2, (Object) null);
        c.u(bundle2, "trigger_timeout", cls, 0L);
        c.u(bundle2, "timed_out_event_name", cls2, (Object) null);
        c.u(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        c.u(bundle2, "triggered_event_name", cls2, (Object) null);
        c.u(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        c.u(bundle2, "time_to_live", cls, 0L);
        c.u(bundle2, "expired_event_name", cls2, (Object) null);
        c.u(bundle2, "expired_event_params", Bundle.class, (Object) null);
        o.e(bundle2.getString("name"));
        o.e(bundle2.getString("origin"));
        o.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f9600a.x().g0(string) != 0) {
            this.f9600a.a().f9828f.b("Invalid conditional user property name", this.f9600a.f9997m.f(string));
        } else if (this.f9600a.x().c0(obj, string) == 0) {
            Object l6 = this.f9600a.x().l(obj, string);
            if (l6 == null) {
                this.f9600a.a().f9828f.c("Unable to normalize conditional user property value", this.f9600a.f9997m.f(string), obj);
                return;
            }
            c.y(bundle2, l6);
            long j11 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f9600a.getClass();
                if (j11 > 15552000000L || j11 < 1) {
                    this.f9600a.a().f9828f.c("Invalid conditional user property timeout", this.f9600a.f9997m.f(string), Long.valueOf(j11));
                    return;
                }
            }
            long j12 = bundle2.getLong("time_to_live");
            this.f9600a.getClass();
            if (j12 > 15552000000L || j12 < 1) {
                this.f9600a.a().f9828f.c("Invalid conditional user property time to live", this.f9600a.f9997m.f(string), Long.valueOf(j12));
            } else {
                this.f9600a.d().o(new i3.o(this, 4, bundle2));
            }
        } else {
            this.f9600a.a().f9828f.c("Invalid conditional user property value", this.f9600a.f9997m.f(string), obj);
        }
    }

    public final void t(f5 f5Var, long j10) {
        f5 f5Var2;
        boolean z9;
        boolean z10;
        boolean z11;
        f5 f5Var3;
        boolean z12;
        f5 f5Var4 = f5Var;
        e5 e5Var = e5.ANALYTICS_STORAGE;
        h();
        int i10 = f5Var4.f9745b;
        if (i10 != -10 && ((Boolean) f5Var4.f9744a.get(e5.AD_STORAGE)) == null && ((Boolean) f5Var4.f9744a.get(e5Var)) == null) {
            this.f9600a.a().k.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f9606h) {
            try {
                f5Var2 = this.f9607i;
                z9 = true;
                z10 = false;
                if (i10 <= f5Var2.f9745b) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    boolean g10 = f5Var4.g(f5Var2, (e5[]) f5Var4.f9744a.keySet().toArray(new e5[0]));
                    if (f5Var4.f(e5Var) && !this.f9607i.f(e5Var)) {
                        z10 = true;
                    }
                    f5 d10 = f5Var4.d(this.f9607i);
                    this.f9607i = d10;
                    boolean z13 = g10;
                    f5Var3 = d10;
                    z12 = z10;
                    z10 = z13;
                } else {
                    f5Var3 = f5Var4;
                    z12 = false;
                    z9 = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z9) {
            this.f9600a.a().f9833l.b("Ignoring lower-priority consent settings, proposed settings", f5Var3);
            return;
        }
        long andIncrement = this.f9608j.getAndIncrement();
        if (z10) {
            this.f9605g.set((Object) null);
            this.f9600a.d().p(new v5(this, f5Var3, j10, andIncrement, z12, f5Var2));
            return;
        }
        w5 w5Var = new w5(this, f5Var3, andIncrement, z12, f5Var2);
        if (i10 == 30 || i10 == -10) {
            this.f9600a.d().p(w5Var);
        } else {
            this.f9600a.d().o(w5Var);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(android.os.Bundle r7, int r8, long r9) {
        /*
            r6 = this;
            r6.h()
            n4.f5 r0 = n4.f5.f9743c
            n4.e5[] r0 = n4.e5.values()
            int r1 = r0.length
            r2 = 0
        L_0x000b:
            r3 = 0
            if (r2 >= r1) goto L_0x003d
            r4 = r0[r2]
            java.lang.String r5 = r4.f9721a
            boolean r5 = r7.containsKey(r5)
            if (r5 == 0) goto L_0x003a
            java.lang.String r4 = r4.f9721a
            java.lang.String r4 = r7.getString(r4)
            if (r4 == 0) goto L_0x003a
            java.lang.String r5 = "granted"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x002b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0035
        L_0x002b:
            java.lang.String r5 = "denied"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0035
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L_0x0035:
            if (r3 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r3 = r4
            goto L_0x003d
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x003d:
            if (r3 == 0) goto L_0x0059
            n4.n4 r0 = r6.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.k
            java.lang.String r1 = "Ignoring invalid consent setting"
            r0.b(r1, r3)
            n4.n4 r0 = r6.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.k
            java.lang.String r1 = "Valid consent values are 'granted', 'denied'"
            r0.a(r1)
        L_0x0059:
            n4.f5 r7 = n4.f5.a(r8, r7)
            r6.t(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a6.u(android.os.Bundle, int, long):void");
    }

    public final void v(g5 g5Var) {
        g5 g5Var2;
        g();
        h();
        if (!(g5Var == null || g5Var == (g5Var2 = this.f9602d))) {
            o.j("EventInterceptor already set.", g5Var2 == null);
        }
        this.f9602d = g5Var;
    }

    public final void w(f5 f5Var) {
        boolean z9;
        Boolean bool;
        g();
        if ((!f5Var.f(e5.ANALYTICS_STORAGE) || !f5Var.f(e5.AD_STORAGE)) && !this.f9600a.v().n()) {
            z9 = false;
        } else {
            z9 = true;
        }
        n4 n4Var = this.f9600a;
        n4Var.d().g();
        if (z9 != n4Var.D) {
            n4 n4Var2 = this.f9600a;
            n4Var2.d().g();
            n4Var2.D = z9;
            w3 r4 = this.f9600a.r();
            n4 n4Var3 = r4.f9600a;
            r4.g();
            if (r4.k().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(r4.k().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z9 || bool == null || bool.booleanValue()) {
                z(Boolean.valueOf(z9), false);
            }
        }
    }

    public final void x(String str, String str2, Object obj, boolean z9, long j10) {
        int i10;
        t tVar;
        String str3;
        int i11;
        String str4;
        String str5;
        String str6 = str2;
        Object obj2 = obj;
        int i12 = 0;
        d8 x9 = this.f9600a.x();
        if (z9) {
            i10 = x9.g0(str2);
        } else {
            if (x9.O("user property", str2)) {
                if (!x9.L("user property", c.f13183g, (String[]) null, str2)) {
                    i10 = 15;
                } else {
                    x9.f9600a.getClass();
                    if (x9.I(24, "user property", str2)) {
                        i10 = 0;
                    }
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            d8 x10 = this.f9600a.x();
            this.f9600a.getClass();
            x10.getClass();
            String n2 = d8.n(24, str2, true);
            if (str6 != null) {
                i12 = str2.length();
            }
            d8 x11 = this.f9600a.x();
            t tVar2 = this.f9611n;
            x11.getClass();
            tVar = tVar2;
            str3 = null;
            i11 = i10;
            str4 = "_ev";
            str5 = n2;
        } else {
            String str7 = str == null ? "app" : str;
            if (obj2 != null) {
                int c02 = this.f9600a.x().c0(obj, str2);
                if (c02 != 0) {
                    d8 x12 = this.f9600a.x();
                    this.f9600a.getClass();
                    x12.getClass();
                    String n10 = d8.n(24, str2, true);
                    if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                        i12 = obj.toString().length();
                    }
                    d8 x13 = this.f9600a.x();
                    t tVar3 = this.f9611n;
                    x13.getClass();
                    tVar = tVar3;
                    str3 = null;
                    i11 = c02;
                    str4 = "_ev";
                    str5 = n10;
                } else {
                    Object l6 = this.f9600a.x().l(obj, str2);
                    if (l6 != null) {
                        this.f9600a.d().o(new o5(this, str7, str2, l6, j10));
                        return;
                    }
                    return;
                }
            } else {
                this.f9600a.d().o(new o5(this, str7, str2, (Object) null, j10));
                return;
            }
        }
        d8.x(tVar, str3, i11, str4, str5, i12);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(long r9, java.lang.Object r11, java.lang.String r12, java.lang.String r13) {
        /*
            r8 = this;
            r3.o.e(r12)
            r3.o.e(r13)
            r8.g()
            r8.h()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r13)
            r1 = 1
            if (r0 == 0) goto L_0x0061
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0050
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r13 = "false"
            boolean r11 = r13.equals(r11)
            r2 = 1
            if (r1 == r11) goto L_0x0035
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = r2
        L_0x0036:
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            n4.n4 r0 = r8.f9600a
            n4.w3 r0 = r0.r()
            n4.v3 r0 = r0.f10261l
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004c
            java.lang.String r13 = "true"
        L_0x004c:
            r0.b(r13)
            goto L_0x005f
        L_0x0050:
            if (r11 != 0) goto L_0x0061
            n4.n4 r13 = r8.f9600a
            n4.w3 r13 = r13.r()
            n4.v3 r13 = r13.f10261l
            java.lang.String r0 = "unset"
            r13.b(r0)
        L_0x005f:
            java.lang.String r13 = "_npa"
        L_0x0061:
            r5 = r11
            r6 = r13
            n4.n4 r11 = r8.f9600a
            boolean r11 = r11.g()
            if (r11 != 0) goto L_0x0079
            n4.n4 r9 = r8.f9600a
            n4.i3 r9 = r9.a()
            n4.g3 r9 = r9.f9835n
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0079:
            n4.n4 r11 = r8.f9600a
            boolean r11 = r11.h()
            if (r11 != 0) goto L_0x0082
            return
        L_0x0082:
            n4.z7 r11 = new n4.z7
            r2 = r11
            r3 = r9
            r7 = r12
            r2.<init>(r3, r5, r6, r7)
            n4.n4 r9 = r8.f9600a
            n4.a7 r9 = r9.v()
            r9.g()
            r9.h()
            n4.n4 r10 = r9.f9600a
            r10.getClass()
            n4.n4 r10 = r9.f9600a
            n4.c3 r10 = r10.p()
            r10.getClass()
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r13 = 0
            n4.a8.a(r11, r12)
            byte[] r0 = r12.marshall()
            r12.recycle()
            int r12 = r0.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r12 <= r2) goto L_0x00c6
            n4.n4 r10 = r10.f9600a
            n4.i3 r10 = r10.a()
            n4.g3 r10 = r10.f9829g
            java.lang.String r12 = "User property too long for local database. Sending directly to service"
            r10.a(r12)
            goto L_0x00ca
        L_0x00c6:
            boolean r13 = r10.n(r1, r0)
        L_0x00ca:
            n4.g8 r10 = r9.p(r1)
            n4.p6 r12 = new n4.p6
            r12.<init>(r9, r10, r13, r11)
            r9.s(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a6.y(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void z(Boolean bool, boolean z9) {
        g();
        h();
        this.f9600a.a().f9834m.b("Setting app measurement enabled (FE)", bool);
        this.f9600a.r().o(bool);
        if (z9) {
            w3 r4 = this.f9600a.r();
            n4 n4Var = r4.f9600a;
            r4.g();
            SharedPreferences.Editor edit = r4.k().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        n4 n4Var2 = this.f9600a;
        n4Var2.d().g();
        if (n4Var2.D || (bool != null && !bool.booleanValue())) {
            A();
        }
    }
}
