package x;

import android.app.Application;
import x.e;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f12765a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f12766b;

    public c(Application application, e.a aVar) {
        this.f12765a = application;
        this.f12766b = aVar;
    }

    public final void run() {
        this.f12765a.unregisterActivityLifecycleCallbacks(this.f12766b);
    }
}
