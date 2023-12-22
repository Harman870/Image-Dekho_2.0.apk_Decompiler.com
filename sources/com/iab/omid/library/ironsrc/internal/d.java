package com.iab.omid.library.ironsrc.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3548a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3549b;

    /* renamed from: c  reason: collision with root package name */
    private a f3550c;

    public interface a {
        void a(boolean z9);
    }

    private void a(boolean z9) {
        if (this.f3549b != z9) {
            this.f3549b = z9;
            if (this.f3548a) {
                b(z9);
                a aVar = this.f3550c;
                if (aVar != null) {
                    aVar.a(z9);
                }
            }
        }
    }

    private boolean a() {
        return (b().importance == 100) || d();
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f3550c = aVar;
    }

    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void b(boolean z9) {
    }

    public boolean c() {
        return this.f3549b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.f3548a = true;
        boolean a10 = a();
        this.f3549b = a10;
        b(a10);
    }

    public void f() {
        this.f3548a = false;
        this.f3550c = null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a(true);
    }

    public void onActivityStopped(Activity activity) {
        a(a());
    }
}
