package s5;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f11877a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11878b;

    public /* synthetic */ e(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f11877a = sideSheetBehavior;
        this.f11878b = i10;
    }

    public final void run() {
        SideSheetBehavior sideSheetBehavior = this.f11877a;
        int i10 = this.f11878b;
        View view = (View) sideSheetBehavior.f3303o.get();
        if (view != null) {
            sideSheetBehavior.t(view, i10, false);
        }
    }
}
