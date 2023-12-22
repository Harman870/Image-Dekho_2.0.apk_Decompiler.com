package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import y5.a;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f3436b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void s(View view, View view2, boolean z9, boolean z10) {
        AnimatorSet animatorSet = this.f3436b;
        boolean z11 = animatorSet != null;
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet t10 = t(view, view2, z9, z11);
        this.f3436b = t10;
        t10.addListener(new a(this));
        this.f3436b.start();
        if (!z10) {
            this.f3436b.end();
        }
    }

    public abstract AnimatorSet t(View view, View view2, boolean z9, boolean z10);
}
