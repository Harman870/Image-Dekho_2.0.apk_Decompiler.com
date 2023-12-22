package s;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import s.d;

public final class c extends a implements d.c {

    /* renamed from: i  reason: collision with root package name */
    public boolean f11779i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11780j;
    public float k;

    /* renamed from: l  reason: collision with root package name */
    public View[] f11781l;

    public final void a() {
    }

    public final void b() {
    }

    public float getProgress() {
        return this.k;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z5.c.f13192q);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f11779i = obtainStyledAttributes.getBoolean(index, this.f11779i);
                } else if (index == 0) {
                    this.f11780j = obtainStyledAttributes.getBoolean(index, this.f11780j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.k = f10;
        int i10 = 0;
        if (this.f1104b > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f1109g;
            if (viewArr == null || viewArr.length != this.f1104b) {
                this.f1109g = new View[this.f1104b];
            }
            for (int i11 = 0; i11 < this.f1104b; i11++) {
                this.f1109g[i11] = constraintLayout.f1041a.get(this.f1103a[i11]);
            }
            this.f11781l = this.f1109g;
            while (i10 < this.f1104b) {
                View view = this.f11781l[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z9 = viewGroup.getChildAt(i10) instanceof c;
            i10++;
        }
    }
}
