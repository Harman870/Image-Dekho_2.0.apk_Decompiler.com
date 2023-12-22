package androidx.fragment.app;

import android.util.Log;
import androidx.activity.f;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m.c f1526a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0.b f1527b;

    public l(m.c cVar, t0.b bVar) {
        this.f1526a = cVar;
        this.f1527b = bVar;
    }

    public final void run() {
        this.f1526a.a();
        if (y.I(2)) {
            StringBuilder g10 = f.g("Transition for operation ");
            g10.append(this.f1527b);
            g10.append("has completed");
            Log.v("FragmentManager", g10.toString());
        }
    }
}
