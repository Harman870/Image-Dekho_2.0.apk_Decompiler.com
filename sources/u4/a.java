package u4;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h0.l0;
import h0.y;
import i0.j;
import java.util.WeakHashMap;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f12201a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f12201a = swipeDismissBehavior;
    }

    public final boolean a(View view) {
        boolean z9;
        boolean z10 = false;
        if (!this.f12201a.s(view)) {
            return false;
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.e.d(view) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = this.f12201a.f2905d;
        if ((i10 == 0 && z9) || (i10 == 1 && !z9)) {
            z10 = true;
        }
        int width = view.getWidth();
        if (z10) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        this.f12201a.getClass();
        return true;
    }
}
