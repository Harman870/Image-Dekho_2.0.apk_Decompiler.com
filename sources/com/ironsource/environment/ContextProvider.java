package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

public class ContextProvider {

    /* renamed from: d  reason: collision with root package name */
    public static volatile ContextProvider f3673d;

    /* renamed from: a  reason: collision with root package name */
    public Activity f3674a;

    /* renamed from: b  reason: collision with root package name */
    public Context f3675b;

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap<String, a> f3676c = new ConcurrentHashMap<>();

    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f3673d == null) {
            synchronized (ContextProvider.class) {
                if (f3673d == null) {
                    f3673d = new ContextProvider();
                }
            }
        }
        return f3673d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f3674a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getApplicationContext() {
        /*
            r2 = this;
            android.content.Context r0 = r2.f3675b
            if (r0 != 0) goto L_0x000c
            android.app.Activity r1 = r2.f3674a
            if (r1 == 0) goto L_0x000c
            android.content.Context r0 = r1.getApplicationContext()
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.ContextProvider.getApplicationContext():android.content.Context");
    }

    public Activity getCurrentActiveActivity() {
        return this.f3674a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (a onPause : this.f3676c.values()) {
                onPause.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f3674a = activity;
            for (a onResume : this.f3676c.values()) {
                onResume.onResume(this.f3674a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f3676c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f3674a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f3675b = context;
        }
    }
}
