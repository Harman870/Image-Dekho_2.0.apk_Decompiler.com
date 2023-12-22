package x;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f12769a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f12770b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f12771c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f12772d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f12773e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f12774f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f12775g = new Handler(Looper.getMainLooper());

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f12776a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f12777b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12778c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12779d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f12780e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12781f = false;

        public a(Activity activity) {
            this.f12777b = activity;
            this.f12778c = activity.hashCode();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.f12777b == activity) {
                this.f12777b = null;
                this.f12780e = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.f12780e && !this.f12781f && !this.f12779d) {
                Object obj = this.f12776a;
                int i10 = this.f12778c;
                boolean z9 = false;
                try {
                    Object obj2 = e.f12771c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i10) {
                            e.f12775g.postAtFrontOfQueue(new d(e.f12770b.get(activity), obj2));
                            z9 = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z9) {
                    this.f12781f = true;
                    this.f12776a = null;
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (this.f12777b == activity) {
                this.f12779d = true;
            }
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[SYNTHETIC, Splitter:B:23:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            f12775g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f12769a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f12770b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f12771c = r0
            java.lang.Class<?> r0 = f12769a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x0053 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0053 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0053 }
            r7[r2] = r8     // Catch:{ all -> 0x0053 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x0053 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x0053 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            f12772d = r0
            java.lang.Class<?> r0 = f12769a
            if (r0 != 0) goto L_0x005b
            goto L_0x006d
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x006d }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x006d }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006d }
            r7[r2] = r8     // Catch:{ all -> 0x006d }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x006d }
            r0.setAccessible(r2)     // Catch:{ all -> 0x006d }
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            f12773e = r0
            java.lang.Class<?> r0 = f12769a
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r4 == r7) goto L_0x007f
            r7 = 27
            if (r4 != r7) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r4 = r6
            goto L_0x0080
        L_0x007f:
            r4 = r2
        L_0x0080:
            if (r4 == 0) goto L_0x00b9
            if (r0 != 0) goto L_0x0085
            goto L_0x00b9
        L_0x0085:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00b9 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00b9 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b9 }
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b9 }
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00b9 }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00b9 }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00b9 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00b9 }
            r1 = r0
        L_0x00b9:
            f12774f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.e.<clinit>():void");
    }
}
