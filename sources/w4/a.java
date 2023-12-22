package w4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import r5.f;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12750a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f12750a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f fVar = this.f12750a.f2946i;
        if (fVar != null) {
            f.b bVar = fVar.f11660a;
            if (bVar.f11690j != floatValue) {
                bVar.f11690j = floatValue;
                fVar.f11664e = true;
                fVar.invalidateSelf();
            }
        }
    }
}
