package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;

class Fragment$5 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f1404a;

    public Fragment$5(o oVar) {
        this.f1404a = oVar;
    }

    public final void b(l lVar, g.b bVar) {
        View view;
        if (bVar == g.b.ON_STOP && (view = this.f1404a.F) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
