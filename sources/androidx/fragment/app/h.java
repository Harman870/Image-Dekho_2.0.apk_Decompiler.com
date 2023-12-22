package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;
import d0.d;

public final class h implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1486a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1487b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m.a f1488c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t0.b f1489d;

    public h(View view, ViewGroup viewGroup, m.a aVar, t0.b bVar) {
        this.f1486a = view;
        this.f1487b = viewGroup;
        this.f1488c = aVar;
        this.f1489d = bVar;
    }

    public final void onCancel() {
        this.f1486a.clearAnimation();
        this.f1487b.endViewTransition(this.f1486a);
        this.f1488c.a();
        if (y.I(2)) {
            StringBuilder g10 = f.g("Animation from operation ");
            g10.append(this.f1489d);
            g10.append(" has been cancelled.");
            Log.v("FragmentManager", g10.toString());
        }
    }
}
