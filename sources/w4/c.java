package w4;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i0.j;

public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12754b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f12754b = bottomSheetBehavior;
        this.f12753a = i10;
    }

    public final boolean a(View view) {
        this.f12754b.C(this.f12753a);
        return true;
    }
}
