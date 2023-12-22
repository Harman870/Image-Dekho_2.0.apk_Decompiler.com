package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import c4.f;
import com.google.android.gms.common.util.DynamiteApi;
import j4.a1;
import j4.c1;
import j4.d1;
import j4.t0;
import j4.x0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.b;
import n3.o;
import n4.a6;
import n4.b7;
import n4.d8;
import n4.e8;
import n4.f8;
import n4.g6;
import n4.h5;
import n4.j5;
import n4.m5;
import n4.m6;
import n4.n4;
import n4.p;
import n4.q5;
import n4.r;
import n4.s5;
import n4.u4;
import n4.u5;
import n4.x5;
import n4.z5;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import q3.i0;
import y3.a;

@DynamiteApi
public class AppMeasurementDynamiteService extends t0 {

    /* renamed from: a  reason: collision with root package name */
    public n4 f2841a = null;

    /* renamed from: b  reason: collision with root package name */
    public final b f2842b = new b();

    public void beginAdUnitExposure(String str, long j10) {
        c();
        this.f2841a.l().h(j10, str);
    }

    @EnsuresNonNull({"scion"})
    public final void c() {
        if (this.f2841a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        c();
        this.f2841a.t().k(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) {
        c();
        a6 t10 = this.f2841a.t();
        t10.h();
        t10.f9600a.d().o(new u5(t10, (Object) null, 0));
    }

    public final void d(String str, x0 x0Var) {
        c();
        this.f2841a.x().F(str, x0Var);
    }

    public void endAdUnitExposure(String str, long j10) {
        c();
        this.f2841a.l().i(j10, str);
    }

    public void generateEventId(x0 x0Var) {
        c();
        long j02 = this.f2841a.x().j0();
        c();
        this.f2841a.x().E(x0Var, j02);
    }

    public void getAppInstanceId(x0 x0Var) {
        c();
        this.f2841a.d().o(new o((Object) this, (Object) x0Var, 3));
    }

    public void getCachedAppInstanceId(x0 x0Var) {
        c();
        d(this.f2841a.t().B(), x0Var);
    }

    public void getConditionalUserProperties(String str, String str2, x0 x0Var) {
        c();
        this.f2841a.d().o(new e8(this, x0Var, str, str2));
    }

    public void getCurrentScreenClass(x0 x0Var) {
        String str;
        c();
        g6 g6Var = this.f2841a.t().f9600a.u().f9919c;
        if (g6Var != null) {
            str = g6Var.f9762b;
        } else {
            str = null;
        }
        d(str, x0Var);
    }

    public void getCurrentScreenName(x0 x0Var) {
        String str;
        c();
        g6 g6Var = this.f2841a.t().f9600a.u().f9919c;
        if (g6Var != null) {
            str = g6Var.f9761a;
        } else {
            str = null;
        }
        d(str, x0Var);
    }

    public void getGmpAppId(x0 x0Var) {
        c();
        a6 t10 = this.f2841a.t();
        n4 n4Var = t10.f9600a;
        String str = n4Var.f9987b;
        if (str == null) {
            try {
                str = a.U(n4Var.f9986a, n4Var.f10003s);
            } catch (IllegalStateException e10) {
                t10.f9600a.a().f9828f.b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        d(str, x0Var);
    }

    public void getMaxUserProperties(String str, x0 x0Var) {
        c();
        a6 t10 = this.f2841a.t();
        t10.getClass();
        r3.o.e(str);
        t10.f9600a.getClass();
        c();
        this.f2841a.x().D(x0Var, 25);
    }

    public void getSessionId(x0 x0Var) {
        c();
        a6 t10 = this.f2841a.t();
        t10.f9600a.d().o(new f(t10, x0Var, 1));
    }

    public void getTestFlag(x0 x0Var, int i10) {
        c();
        if (i10 == 0) {
            d8 x9 = this.f2841a.x();
            a6 t10 = this.f2841a.t();
            t10.getClass();
            AtomicReference atomicReference = new AtomicReference();
            x9.F((String) t10.f9600a.d().l(atomicReference, 15000, "String test flag value", new i3.o(t10, 5, atomicReference)), x0Var);
        } else if (i10 == 1) {
            d8 x10 = this.f2841a.x();
            a6 t11 = this.f2841a.t();
            t11.getClass();
            AtomicReference atomicReference2 = new AtomicReference();
            x10.E(x0Var, ((Long) t11.f9600a.d().l(atomicReference2, 15000, "long test flag value", new u4(t11, 2, atomicReference2))).longValue());
        } else if (i10 == 2) {
            d8 x11 = this.f2841a.x();
            a6 t12 = this.f2841a.t();
            t12.getClass();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) t12.f9600a.d().l(atomicReference3, 15000, "double test flag value", new s5(t12, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                x0Var.w(bundle);
            } catch (RemoteException e10) {
                x11.f9600a.a().f9831i.b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            d8 x12 = this.f2841a.x();
            a6 t13 = this.f2841a.t();
            t13.getClass();
            AtomicReference atomicReference4 = new AtomicReference();
            x12.D(x0Var, ((Integer) t13.f9600a.d().l(atomicReference4, 15000, "int test flag value", new i0(t13, 2, atomicReference4))).intValue());
        } else if (i10 == 4) {
            d8 x13 = this.f2841a.x();
            a6 t14 = this.f2841a.t();
            t14.getClass();
            AtomicReference atomicReference5 = new AtomicReference();
            x13.z(x0Var, ((Boolean) t14.f9600a.d().l(atomicReference5, 15000, "boolean test flag value", new s5(t14, atomicReference5, 0))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z9, x0 x0Var) {
        c();
        this.f2841a.d().o(new b7(this, x0Var, str, str2, z9));
    }

    public void initForTests(Map map) {
        c();
    }

    public void initialize(z3.a aVar, d1 d1Var, long j10) {
        n4 n4Var = this.f2841a;
        if (n4Var == null) {
            Context context = (Context) z3.b.F(aVar);
            r3.o.h(context);
            this.f2841a = n4.s(context, d1Var, Long.valueOf(j10));
            return;
        }
        n4Var.a().f9831i.a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(x0 x0Var) {
        c();
        this.f2841a.d().o(new i0(this, 6, x0Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10) {
        c();
        this.f2841a.t().m(str, str2, bundle, z9, z10, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, x0 x0Var, long j10) {
        Bundle bundle2;
        c();
        r3.o.e(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f2841a.d().o(new m6(this, x0Var, new r(str2, new p(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, z3.a aVar, z3.a aVar2, z3.a aVar3) {
        c();
        Object obj = null;
        Object F = aVar == null ? null : z3.b.F(aVar);
        Object F2 = aVar2 == null ? null : z3.b.F(aVar2);
        if (aVar3 != null) {
            obj = z3.b.F(aVar3);
        }
        this.f2841a.a().u(i10, true, false, str, F, F2, obj);
    }

    public void onActivityCreated(z3.a aVar, Bundle bundle, long j10) {
        c();
        z5 z5Var = this.f2841a.t().f9601c;
        if (z5Var != null) {
            this.f2841a.t().l();
            z5Var.onActivityCreated((Activity) z3.b.F(aVar), bundle);
        }
    }

    public void onActivityDestroyed(z3.a aVar, long j10) {
        c();
        z5 z5Var = this.f2841a.t().f9601c;
        if (z5Var != null) {
            this.f2841a.t().l();
            z5Var.onActivityDestroyed((Activity) z3.b.F(aVar));
        }
    }

    public void onActivityPaused(z3.a aVar, long j10) {
        c();
        z5 z5Var = this.f2841a.t().f9601c;
        if (z5Var != null) {
            this.f2841a.t().l();
            z5Var.onActivityPaused((Activity) z3.b.F(aVar));
        }
    }

    public void onActivityResumed(z3.a aVar, long j10) {
        c();
        z5 z5Var = this.f2841a.t().f9601c;
        if (z5Var != null) {
            this.f2841a.t().l();
            z5Var.onActivityResumed((Activity) z3.b.F(aVar));
        }
    }

    public void onActivitySaveInstanceState(z3.a aVar, x0 x0Var, long j10) {
        c();
        z5 z5Var = this.f2841a.t().f9601c;
        Bundle bundle = new Bundle();
        if (z5Var != null) {
            this.f2841a.t().l();
            z5Var.onActivitySaveInstanceState((Activity) z3.b.F(aVar), bundle);
        }
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f2841a.a().f9831i.b("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(z3.a aVar, long j10) {
        c();
        if (this.f2841a.t().f9601c != null) {
            this.f2841a.t().l();
            Activity activity = (Activity) z3.b.F(aVar);
        }
    }

    public void onActivityStopped(z3.a aVar, long j10) {
        c();
        if (this.f2841a.t().f9601c != null) {
            this.f2841a.t().l();
            Activity activity = (Activity) z3.b.F(aVar);
        }
    }

    public void performAction(Bundle bundle, x0 x0Var, long j10) {
        c();
        x0Var.w((Bundle) null);
    }

    public void registerOnMeasurementEventListener(a1 a1Var) {
        h5 h5Var;
        c();
        synchronized (this.f2842b) {
            h5Var = (h5) this.f2842b.getOrDefault(Integer.valueOf(a1Var.a()), null);
            if (h5Var == null) {
                h5Var = new f8(this, a1Var);
                this.f2842b.put(Integer.valueOf(a1Var.a()), h5Var);
            }
        }
        this.f2841a.t().q(h5Var);
    }

    public void resetAnalyticsData(long j10) {
        c();
        a6 t10 = this.f2841a.t();
        t10.f9605g.set((Object) null);
        t10.f9600a.d().o(new q5(t10, j10));
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) {
        c();
        if (bundle == null) {
            this.f2841a.a().f9828f.a("Conditional user property must not be null");
        } else {
            this.f2841a.t().s(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) {
        c();
        a6 t10 = this.f2841a.t();
        t10.f9600a.d().p(new j5(t10, bundle, j10));
    }

    public void setConsentThirdParty(Bundle bundle, long j10) {
        c();
        this.f2841a.t().u(bundle, -20, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (r0 <= 100) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        if (r0 <= 100) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(z3.a r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.c()
            n4.n4 r6 = r2.f2841a
            n4.l6 r6 = r6.u()
            java.lang.Object r3 = z3.b.F(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            n4.n4 r7 = r6.f9600a
            n4.f r7 = r7.f9992g
            boolean r7 = r7.p()
            if (r7 != 0) goto L_0x0024
            n4.n4 r3 = r6.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.k
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            goto L_0x006b
        L_0x0024:
            n4.g6 r7 = r6.f9919c
            if (r7 != 0) goto L_0x0033
            n4.n4 r3 = r6.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.k
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            goto L_0x006b
        L_0x0033:
            java.util.concurrent.ConcurrentHashMap r0 = r6.f9922f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x0046
            n4.n4 r3 = r6.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.k
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            goto L_0x006b
        L_0x0046:
            if (r5 != 0) goto L_0x0050
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.n(r5)
        L_0x0050:
            java.lang.String r0 = r7.f9762b
            boolean r0 = z5.c.x(r0, r5)
            java.lang.String r7 = r7.f9761a
            boolean r7 = z5.c.x(r7, r4)
            if (r0 == 0) goto L_0x0070
            if (r7 != 0) goto L_0x0061
            goto L_0x0070
        L_0x0061:
            n4.n4 r3 = r6.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.k
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
        L_0x006b:
            r3.a(r4)
            goto L_0x00ee
        L_0x0070:
            r7 = 100
            if (r4 == 0) goto L_0x0099
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0086
            int r0 = r4.length()
            n4.n4 r1 = r6.f9600a
            r1.getClass()
            if (r0 > r7) goto L_0x0086
            goto L_0x0099
        L_0x0086:
            n4.n4 r3 = r6.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.k
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            goto L_0x00bf
        L_0x0099:
            if (r5 == 0) goto L_0x00c3
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00ad
            int r0 = r5.length()
            n4.n4 r1 = r6.f9600a
            r1.getClass()
            if (r0 > r7) goto L_0x00ad
            goto L_0x00c3
        L_0x00ad:
            n4.n4 r3 = r6.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.k
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
        L_0x00bf:
            r3.b(r5, r4)
            goto L_0x00ee
        L_0x00c3:
            n4.n4 r7 = r6.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9835n
            if (r4 != 0) goto L_0x00d0
            java.lang.String r0 = "null"
            goto L_0x00d1
        L_0x00d0:
            r0 = r4
        L_0x00d1:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.c(r1, r0, r5)
            n4.g6 r7 = new n4.g6
            n4.n4 r0 = r6.f9600a
            n4.d8 r0 = r0.x()
            long r0 = r0.j0()
            r7.<init>(r0, r4, r5)
            java.util.concurrent.ConcurrentHashMap r4 = r6.f9922f
            r4.put(r3, r7)
            r4 = 1
            r6.q(r3, r7, r4)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(z3.a, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z9) {
        c();
        a6 t10 = this.f2841a.t();
        t10.h();
        t10.f9600a.d().o(new x5(t10, z9));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        c();
        a6 t10 = this.f2841a.t();
        t10.f9600a.d().o(new o((Object) t10, 2, (Object) bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(a1 a1Var) {
        c();
        i4.b7 b7Var = new i4.b7((Object) this, (Object) a1Var);
        if (this.f2841a.d().q()) {
            this.f2841a.t().v(b7Var);
        } else {
            this.f2841a.d().o(new u4(this, 5, b7Var));
        }
    }

    public void setInstanceIdProvider(c1 c1Var) {
        c();
    }

    public void setMeasurementEnabled(boolean z9, long j10) {
        c();
        a6 t10 = this.f2841a.t();
        Boolean valueOf = Boolean.valueOf(z9);
        t10.h();
        t10.f9600a.d().o(new u5(t10, valueOf, 0));
    }

    public void setMinimumSessionDuration(long j10) {
        c();
    }

    public void setSessionTimeoutDuration(long j10) {
        c();
        a6 t10 = this.f2841a.t();
        t10.f9600a.d().o(new m5(t10, j10, 0));
    }

    public void setUserId(String str, long j10) {
        c();
        a6 t10 = this.f2841a.t();
        if (str == null || !TextUtils.isEmpty(str)) {
            t10.f9600a.d().o(new i3.o(t10, str));
            t10.x((String) null, "_id", str, true, j10);
            return;
        }
        t10.f9600a.a().f9831i.a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, z3.a aVar, boolean z9, long j10) {
        c();
        this.f2841a.t().x(str, str2, z3.b.F(aVar), z9, j10);
    }

    public void unregisterOnMeasurementEventListener(a1 a1Var) {
        Object obj;
        c();
        synchronized (this.f2842b) {
            obj = (h5) this.f2842b.remove(Integer.valueOf(a1Var.a()));
        }
        if (obj == null) {
            obj = new f8(this, a1Var);
        }
        a6 t10 = this.f2841a.t();
        t10.h();
        if (!t10.f9603e.remove(obj)) {
            t10.f9600a.a().f9831i.a("OnEventListener had not been registered");
        }
    }
}
