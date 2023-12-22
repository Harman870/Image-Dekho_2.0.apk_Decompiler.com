package q3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    public static final b f11201e = new b();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f11202a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f11203b = new AtomicBoolean();
    @GuardedBy("instance")

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f11204c = new ArrayList();
    @GuardedBy("instance")

    /* renamed from: d  reason: collision with root package name */
    public boolean f11205d = false;

    public interface a {
        void a(boolean z9);
    }

    public static void a(Application application) {
        b bVar = f11201e;
        synchronized (bVar) {
            if (!bVar.f11205d) {
                application.registerActivityLifecycleCallbacks(bVar);
                application.registerComponentCallbacks(bVar);
                bVar.f11205d = true;
            }
        }
    }

    public final void b(boolean z9) {
        synchronized (f11201e) {
            Iterator it = this.f11204c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(z9);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f11202a.compareAndSet(true, false);
        this.f11203b.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f11202a.compareAndSet(true, false);
        this.f11203b.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f11202a.compareAndSet(false, true)) {
            this.f11203b.set(true);
            b(true);
        }
    }
}
