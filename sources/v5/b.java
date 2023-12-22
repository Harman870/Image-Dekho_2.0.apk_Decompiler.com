package v5;

import android.animation.ValueAnimator;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12526a;

    public /* synthetic */ b(g gVar) {
        this.f12526a = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        g gVar = this.f12526a;
        gVar.getClass();
        gVar.f12564d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
