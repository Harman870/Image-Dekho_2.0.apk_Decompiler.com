package s5;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f11874a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f11874a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f11874a;
        return Math.max(0, (sideSheetBehavior.f3301m - sideSheetBehavior.f3300l) - sideSheetBehavior.f3302n);
    }
}
