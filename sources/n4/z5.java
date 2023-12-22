package n4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import n3.k;

@TargetApi(14)
public final class z5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a6 f10349a;

    public z5(a6 a6Var) {
        this.f10349a = a6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ RuntimeException -> 0x00b4, all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ RuntimeException -> 0x00b4, all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d A[Catch:{ RuntimeException -> 0x00b4, all -> 0x00b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r11, android.os.Bundle r12) {
        /*
            r10 = this;
            n4.a6 r0 = r10.f10349a     // Catch:{ RuntimeException -> 0x00b4 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RuntimeException -> 0x00b4 }
            n4.i3 r0 = r0.a()     // Catch:{ RuntimeException -> 0x00b4 }
            n4.g3 r0 = r0.f9835n     // Catch:{ RuntimeException -> 0x00b4 }
            java.lang.String r1 = "onActivityCreated"
            r0.a(r1)     // Catch:{ RuntimeException -> 0x00b4 }
            android.content.Intent r0 = r11.getIntent()     // Catch:{ RuntimeException -> 0x00b4 }
            if (r0 != 0) goto L_0x0017
            goto L_0x00c4
        L_0x0017:
            j4.za r1 = j4.za.f8594b     // Catch:{ RuntimeException -> 0x00b4 }
            j4.m5 r1 = r1.f8595a     // Catch:{ RuntimeException -> 0x00b4 }
            java.lang.Object r1 = r1.zza()     // Catch:{ RuntimeException -> 0x00b4 }
            j4.ab r1 = (j4.ab) r1     // Catch:{ RuntimeException -> 0x00b4 }
            r1.zza()     // Catch:{ RuntimeException -> 0x00b4 }
            n4.a6 r1 = r10.f10349a     // Catch:{ RuntimeException -> 0x00b4 }
            n4.n4 r1 = r1.f9600a     // Catch:{ RuntimeException -> 0x00b4 }
            n4.f r1 = r1.f9992g     // Catch:{ RuntimeException -> 0x00b4 }
            n4.v2 r2 = n4.w2.f10247x0     // Catch:{ RuntimeException -> 0x00b4 }
            r3 = 0
            boolean r1 = r1.o(r3, r2)     // Catch:{ RuntimeException -> 0x00b4 }
            if (r1 != 0) goto L_0x0038
            android.net.Uri r3 = r0.getData()     // Catch:{ RuntimeException -> 0x00b4 }
            goto L_0x005d
        L_0x0038:
            android.net.Uri r1 = r0.getData()     // Catch:{ RuntimeException -> 0x00b4 }
            if (r1 == 0) goto L_0x0047
            boolean r2 = r1.isHierarchical()     // Catch:{ RuntimeException -> 0x00b4 }
            if (r2 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r7 = r1
            goto L_0x005e
        L_0x0047:
            android.os.Bundle r1 = r0.getExtras()     // Catch:{ RuntimeException -> 0x00b4 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ RuntimeException -> 0x00b4 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RuntimeException -> 0x00b4 }
            if (r2 != 0) goto L_0x005d
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x00b4 }
        L_0x005d:
            r7 = r3
        L_0x005e:
            if (r7 == 0) goto L_0x00c4
            boolean r1 = r7.isHierarchical()     // Catch:{ RuntimeException -> 0x00b4 }
            if (r1 != 0) goto L_0x0067
            goto L_0x00c4
        L_0x0067:
            n4.a6 r1 = r10.f10349a     // Catch:{ RuntimeException -> 0x00b4 }
            n4.n4 r1 = r1.f9600a     // Catch:{ RuntimeException -> 0x00b4 }
            r1.x()     // Catch:{ RuntimeException -> 0x00b4 }
            java.lang.String r1 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RuntimeException -> 0x00b4 }
            java.lang.String r1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00b4 }
            if (r1 != 0) goto L_0x0090
            java.lang.String r1 = "https://www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00b4 }
            if (r1 != 0) goto L_0x0090
            java.lang.String r1 = "android-app://com.google.appcrawler"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00b4 }
            if (r0 == 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            java.lang.String r0 = "auto"
            goto L_0x0092
        L_0x0090:
            java.lang.String r0 = "gs"
        L_0x0092:
            r8 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r9 = r7.getQueryParameter(r0)     // Catch:{ RuntimeException -> 0x00b4 }
            if (r12 != 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            r6 = r0
            n4.a6 r0 = r10.f10349a     // Catch:{ RuntimeException -> 0x00b4 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RuntimeException -> 0x00b4 }
            n4.m4 r0 = r0.d()     // Catch:{ RuntimeException -> 0x00b4 }
            n4.y5 r1 = new n4.y5     // Catch:{ RuntimeException -> 0x00b4 }
            r4 = r1
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x00b4 }
            r0.o(r1)     // Catch:{ RuntimeException -> 0x00b4 }
            goto L_0x00c4
        L_0x00b2:
            r0 = move-exception
            goto L_0x00d0
        L_0x00b4:
            r0 = move-exception
            n4.a6 r1 = r10.f10349a     // Catch:{ all -> 0x00b2 }
            n4.n4 r1 = r1.f9600a     // Catch:{ all -> 0x00b2 }
            n4.i3 r1 = r1.a()     // Catch:{ all -> 0x00b2 }
            n4.g3 r1 = r1.f9828f     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.b(r2, r0)     // Catch:{ all -> 0x00b2 }
        L_0x00c4:
            n4.a6 r0 = r10.f10349a
            n4.n4 r0 = r0.f9600a
            n4.l6 r0 = r0.u()
            r0.o(r11, r12)
            return
        L_0x00d0:
            n4.a6 r1 = r10.f10349a
            n4.n4 r1 = r1.f9600a
            n4.l6 r1 = r1.u()
            r1.o(r11, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.z5.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        l6 u = this.f10349a.f9600a.u();
        synchronized (u.f9927l) {
            if (activity == u.f9923g) {
                u.f9923g = null;
            }
        }
        if (u.f9600a.f9992g.p()) {
            u.f9922f.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        l6 u = this.f10349a.f9600a.u();
        synchronized (u.f9927l) {
            u.k = false;
            u.f9924h = true;
        }
        u.f9600a.f9998n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!u.f9600a.f9992g.p()) {
            u.f9919c = null;
            u.f9600a.d().o(new p0(u, elapsedRealtime, 1));
        } else {
            g6 p5 = u.p(activity);
            u.f9920d = u.f9919c;
            u.f9919c = null;
            u.f9600a.d().o(new k6(u, p5, elapsedRealtime));
        }
        l7 w = this.f10349a.f9600a.w();
        w.f9600a.f9998n.getClass();
        w.f9600a.d().o(new h7(w, SystemClock.elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        l7 w = this.f10349a.f9600a.w();
        w.f9600a.f9998n.getClass();
        w.f9600a.d().o(new m5(w, SystemClock.elapsedRealtime(), 1));
        l6 u = this.f10349a.f9600a.u();
        synchronized (u.f9927l) {
            u.k = true;
            if (activity != u.f9923g) {
                synchronized (u.f9927l) {
                    u.f9923g = activity;
                    u.f9924h = false;
                }
                if (u.f9600a.f9992g.p()) {
                    u.f9925i = null;
                    u.f9600a.d().o(new k(2, u));
                }
            }
        }
        if (!u.f9600a.f9992g.p()) {
            u.f9919c = u.f9925i;
            u.f9600a.d().o(new j6(u));
            return;
        }
        u.q(activity, u.p(activity), false);
        q1 l6 = u.f9600a.l();
        l6.f9600a.f9998n.getClass();
        l6.f9600a.d().o(new p0(l6, SystemClock.elapsedRealtime(), 0));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        g6 g6Var;
        l6 u = this.f10349a.f9600a.u();
        if (u.f9600a.f9992g.p() && bundle != null && (g6Var = (g6) u.f9922f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", g6Var.f9763c);
            bundle2.putString("name", g6Var.f9761a);
            bundle2.putString("referrer_name", g6Var.f9762b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
