package j4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class b2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c2 f8052a;

    public b2(c2 c2Var) {
        this.f8052a = c2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f8052a.b(new u1(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f8052a.b(new k1(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f8052a.b(new p1(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f8052a.b(new o1(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        q0 q0Var = new q0();
        this.f8052a.b(new a2(this, activity, q0Var));
        Bundle c10 = q0Var.c(50);
        if (c10 != null) {
            bundle.putAll(c10);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f8052a.b(new f1(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f8052a.b(new q1(this, activity));
    }
}
