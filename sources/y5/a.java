package y5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f13048a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f13048a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13048a.f3436b = null;
    }
}
