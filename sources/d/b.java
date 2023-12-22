package d;

import android.view.View;
import androidx.activity.f;
import androidx.drawerlayout.widget.DrawerLayout;

public final class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f5859a;

    public b(c cVar) {
        this.f5859a = cVar;
    }

    public final void onClick(View view) {
        boolean z9;
        c cVar = this.f5859a;
        cVar.getClass();
        int h10 = cVar.f5861b.h(8388611);
        View e10 = cVar.f5861b.e(8388611);
        if (e10 != null) {
            z9 = DrawerLayout.p(e10);
        } else {
            z9 = false;
        }
        if (z9 && h10 != 2) {
            cVar.f5861b.c();
        } else if (h10 != 1) {
            DrawerLayout drawerLayout = cVar.f5861b;
            View e11 = drawerLayout.e(8388611);
            if (e11 != null) {
                drawerLayout.q(e11);
                return;
            }
            StringBuilder g10 = f.g("No drawer view found with gravity ");
            g10.append(DrawerLayout.k(8388611));
            throw new IllegalArgumentException(g10.toString());
        }
    }
}
