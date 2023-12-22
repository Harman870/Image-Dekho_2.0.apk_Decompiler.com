package i5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.imgdkh.app.R;
import java.util.ArrayList;
import r5.f;
import r5.i;
import y.a;

public final class d extends com.google.android.material.floatingactionbutton.d {
    public StateListAnimator N;

    public static class a extends f {
        public a(i iVar) {
            super(iVar);
        }

        public final boolean isStateful() {
            return true;
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    public final float e() {
        return this.f3234v.getElevation();
    }

    public final void f(Rect rect) {
        boolean z9;
        if (FloatingActionButton.this.f3197l) {
            super.f(rect);
            return;
        }
        int i10 = 0;
        if (!this.f3220f || this.f3234v.getSizeDimension() >= this.k) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            i10 = (this.k - this.f3234v.getSizeDimension()) / 2;
        }
        rect.set(i10, i10, i10, i10);
    }

    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        f s10 = s();
        this.f3216b = s10;
        s10.setTintList(colorStateList);
        if (mode != null) {
            this.f3216b.setTintMode(mode);
        }
        this.f3216b.i(this.f3234v.getContext());
        if (i10 > 0) {
            Context context = this.f3234v.getContext();
            i iVar = this.f3215a;
            iVar.getClass();
            a aVar = new a(iVar);
            Object obj = y.a.f13006a;
            int a10 = a.c.a(context, R.color.design_fab_stroke_top_outer_color);
            int a11 = a.c.a(context, R.color.design_fab_stroke_top_inner_color);
            int a12 = a.c.a(context, R.color.design_fab_stroke_end_inner_color);
            int a13 = a.c.a(context, R.color.design_fab_stroke_end_outer_color);
            aVar.f7864i = a10;
            aVar.f7865j = a11;
            aVar.k = a12;
            aVar.f7866l = a13;
            float f10 = (float) i10;
            if (aVar.f7863h != f10) {
                aVar.f7863h = f10;
                aVar.f7857b.setStrokeWidth(f10 * 1.3333f);
                aVar.f7868n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f7867m = colorStateList.getColorForState(aVar.getState(), aVar.f7867m);
            }
            aVar.f7870p = colorStateList;
            aVar.f7868n = true;
            aVar.invalidateSelf();
            this.f3218d = aVar;
            a aVar2 = this.f3218d;
            aVar2.getClass();
            f fVar = this.f3216b;
            fVar.getClass();
            drawable = new LayerDrawable(new Drawable[]{aVar2, fVar});
        } else {
            this.f3218d = null;
            drawable = this.f3216b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(o5.a.a(colorStateList2), drawable, (Drawable) null);
        this.f3217c = rippleDrawable;
        this.f3219e = rippleDrawable;
    }

    public final void h() {
    }

    public final void i() {
        q();
    }

    public final void j(int[] iArr) {
    }

    public final void k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (this.f3234v.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.H, r(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.I, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.J, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.K, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f3234v, "elevation", new float[]{f10}).setDuration(0));
            if (i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f3234v;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f3234v, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.L, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.M, r(0.0f, 0.0f));
            this.N = stateListAnimator;
            this.f3234v.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f3217c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(o5.a.a(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    public final boolean o() {
        boolean z9;
        if (!FloatingActionButton.this.f3197l) {
            if (!this.f3220f || this.f3234v.getSizeDimension() >= this.k) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return false;
            }
        }
        return true;
    }

    public final void p() {
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f3234v, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f3234v, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
        return animatorSet;
    }

    public final f s() {
        i iVar = this.f3215a;
        iVar.getClass();
        return new a(iVar);
    }
}
