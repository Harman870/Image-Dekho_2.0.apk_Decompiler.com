package t4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class g<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public h f12016a;

    /* renamed from: b  reason: collision with root package name */
    public int f12017b = 0;

    public g() {
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        t(coordinatorLayout, v10, i10);
        if (this.f12016a == null) {
            this.f12016a = new h(v10);
        }
        h hVar = this.f12016a;
        hVar.f12019b = hVar.f12018a.getTop();
        hVar.f12020c = hVar.f12018a.getLeft();
        this.f12016a.a();
        int i11 = this.f12017b;
        if (i11 == 0) {
            return true;
        }
        h hVar2 = this.f12016a;
        if (hVar2.f12021d != i11) {
            hVar2.f12021d = i11;
            hVar2.a();
        }
        this.f12017b = 0;
        return true;
    }

    public final int s() {
        h hVar = this.f12016a;
        if (hVar != null) {
            return hVar.f12021d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.r(v10, i10);
    }
}
