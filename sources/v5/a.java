package v5;

import android.animation.ValueAnimator;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12524a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f12525b;

    public /* synthetic */ a(p pVar, int i10) {
        this.f12524a = i10;
        this.f12525b = pVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12524a) {
            case 0:
                g gVar = (g) this.f12525b;
                gVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f12564d.setScaleX(floatValue);
                gVar.f12564d.setScaleY(floatValue);
                return;
            default:
                o oVar = (o) this.f12525b;
                oVar.getClass();
                oVar.f12564d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
