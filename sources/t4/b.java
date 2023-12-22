package t4;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import h0.l0;
import h0.q;
import h0.s0;
import h0.y;
import java.util.WeakHashMap;

public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11995a;

    public b(AppBarLayout appBarLayout) {
        this.f11995a = appBarLayout;
    }

    public final s0 a(View view, s0 s0Var) {
        s0 s0Var2;
        boolean z9;
        AppBarLayout appBarLayout = this.f11995a;
        appBarLayout.getClass();
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.d.b(appBarLayout)) {
            s0Var2 = s0Var;
        } else {
            s0Var2 = null;
        }
        if (!g0.b.a(appBarLayout.f2850g, s0Var2)) {
            appBarLayout.f2850g = s0Var2;
            if (appBarLayout.u == null || appBarLayout.getTopInset() <= 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            appBarLayout.setWillNotDraw(!z9);
            appBarLayout.requestLayout();
        }
        return s0Var;
    }
}
