package a7;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import j6.n;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Intent> f179a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Intent r5) {
        /*
            java.lang.String r0 = "FirebaseMessaging"
            android.os.Bundle r5 = r5.getExtras()     // Catch:{ RuntimeException -> 0x000f }
            if (r5 == 0) goto L_0x0015
            java.lang.String r1 = "gcm.n.analytics_data"
            android.os.Bundle r5 = r5.getBundle(r1)     // Catch:{ RuntimeException -> 0x000f }
            goto L_0x0016
        L_0x000f:
            r5 = move-exception
            java.lang.String r1 = "Failed trying to get analytics data from Intent extras."
            android.util.Log.w(r0, r1, r5)
        L_0x0015:
            r5 = 0
        L_0x0016:
            java.lang.String r1 = "1"
            if (r5 != 0) goto L_0x001c
            r2 = 0
            goto L_0x0026
        L_0x001c:
            java.lang.String r2 = "google.c.a.e"
            java.lang.String r2 = r5.getString(r2)
            boolean r2 = r1.equals(r2)
        L_0x0026:
            if (r2 == 0) goto L_0x008e
            if (r5 != 0) goto L_0x002b
            goto L_0x0089
        L_0x002b:
            java.lang.String r2 = "google.c.a.tc"
            java.lang.String r2 = r5.getString(r2)
            boolean r1 = r1.equals(r2)
            r2 = 3
            if (r1 == 0) goto L_0x007e
            c6.f r1 = c6.f.d()
            java.lang.Class<e6.a> r3 = e6.a.class
            java.lang.Object r1 = r1.b(r3)
            e6.a r1 = (e6.a) r1
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L_0x004f
            java.lang.String r2 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r0, r2)
        L_0x004f:
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r0 = r5.getString(r0)
            r1.b(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r0)
            java.lang.String r0 = "_cmp"
            r1.a(r0, r2)
            goto L_0x0089
        L_0x0078:
            java.lang.String r1 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r0, r1)
            goto L_0x0089
        L_0x007e:
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r0, r1)
        L_0x0089:
            java.lang.String r0 = "_no"
            a7.r.a(r0, r5)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.m.a(android.content.Intent):void");
    }

    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.f179a.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new n(this, 2, intent));
            } else {
                a(intent);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f179a.remove(activity.getIntent());
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
