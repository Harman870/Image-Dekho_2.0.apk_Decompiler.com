package j4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import d.u;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.i4;
import r3.o;
import y3.a;

public final class c2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile c2 f8072i;

    /* renamed from: a  reason: collision with root package name */
    public final String f8073a = "FA";

    /* renamed from: b  reason: collision with root package name */
    public final a f8074b = a.P;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f8075c;

    /* renamed from: d  reason: collision with root package name */
    public final u f8076d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f8077e;

    /* renamed from: f  reason: collision with root package name */
    public int f8078f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8079g;

    /* renamed from: h  reason: collision with root package name */
    public volatile u0 f8080h;

    public c2(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new t1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8075c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f8076d = new u(this);
        this.f8077e = new ArrayList();
        try {
            if (a.U(context, i4.a(context)) != null) {
                boolean z9 = false;
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, c2.class.getClassLoader());
                    z9 = true;
                } catch (ClassNotFoundException unused) {
                }
                if (!z9) {
                    this.f8079g = true;
                    Log.w(this.f8073a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        b(new j1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f8073a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b2(this));
        }
    }

    public static c2 c(Context context, Bundle bundle) {
        o.h(context);
        if (f8072i == null) {
            synchronized (c2.class) {
                if (f8072i == null) {
                    f8072i = new c2(context, bundle);
                }
            }
        }
        return f8072i;
    }

    public final void a(Exception exc, boolean z9, boolean z10) {
        this.f8079g |= z9;
        if (z9) {
            Log.w(this.f8073a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            b(new s1(this, exc));
        }
        Log.w(this.f8073a, "Error with data collection. Data lost.", exc);
    }

    public final void b(w1 w1Var) {
        this.f8075c.execute(w1Var);
    }
}
