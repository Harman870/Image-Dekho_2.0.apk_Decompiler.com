package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.b;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.HashMap;
import java.util.WeakHashMap;
import s4.g;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public HashMap f3452i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void s(View view, View view2, boolean z9, boolean z10) {
        boolean z11;
        int i10;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                this.f3452i = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.f) || !(((CoordinatorLayout.f) childAt.getLayoutParams()).f1235a instanceof FabTransformationScrimBehavior)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (childAt != view2 && !z11) {
                    HashMap hashMap = this.f3452i;
                    if (z9) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i10 = 4;
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        i10 = ((Integer) this.f3452i.get(childAt)).intValue();
                    }
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.s(childAt, i10);
                }
            }
            if (!z9) {
                this.f3452i = null;
            }
        }
        super.s(view, view2, z9, z10);
    }

    public final FabTransformationBehavior.b z(Context context, boolean z9) {
        int i10 = z9 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f3446a = g.b(context, i10);
        bVar.f3447b = new b();
        return bVar;
    }
}
