package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import q.j;
import z5.c;

public abstract class f extends a {

    /* renamed from: i  reason: collision with root package name */
    public boolean f11931i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11932j;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f11931i = true;
                } else if (index == 22) {
                    this.f11932j = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void l(j jVar, int i10, int i11) {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11931i || this.f11932j) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f1104b; i10++) {
                    View view = constraintLayout.f1041a.get(this.f1103a[i10]);
                    if (view != null) {
                        if (this.f11931i) {
                            view.setVisibility(visibility);
                        }
                        if (this.f11932j && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
