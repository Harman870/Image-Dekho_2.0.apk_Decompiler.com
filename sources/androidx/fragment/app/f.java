package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.t0;
import d0.d;

public final class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f1469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0.b f1470b;

    public f(Animator animator, t0.b bVar) {
        this.f1469a = animator;
        this.f1470b = bVar;
    }

    public final void onCancel() {
        this.f1469a.end();
        if (y.I(2)) {
            StringBuilder g10 = androidx.activity.f.g("Animator from operation ");
            g10.append(this.f1470b);
            g10.append(" has been canceled.");
            Log.v("FragmentManager", g10.toString());
        }
    }
}
