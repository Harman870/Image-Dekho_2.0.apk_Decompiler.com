package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f3431a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3432a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f3433b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h5.a f3434c;

        public a(View view, int i10, h5.a aVar) {
            this.f3432a = view;
            this.f3433b = i10;
            this.f3434c = aVar;
        }

        public final boolean onPreDraw() {
            this.f3432a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f3431a == this.f3433b) {
                h5.a aVar = this.f3434c;
                expandableBehavior.s((View) aVar, this.f3432a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract boolean b(View view, View view2);

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z9;
        int i10;
        h5.a aVar = (h5.a) view2;
        int i11 = 2;
        if (!aVar.a() ? this.f3431a != 1 : !((i10 = this.f3431a) == 0 || i10 == 2)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return false;
        }
        if (aVar.a()) {
            i11 = 1;
        }
        this.f3431a = i11;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        h5.a aVar;
        boolean z9;
        int i11;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (!y.g.c(view)) {
            ArrayList f10 = coordinatorLayout.f(view);
            int size = f10.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) f10.get(i12);
                if (b(view, view2)) {
                    aVar = (h5.a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null) {
                int i13 = 2;
                if (!aVar.a() ? this.f3431a != 1 : !((i11 = this.f3431a) == 0 || i11 == 2)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    if (aVar.a()) {
                        i13 = 1;
                    }
                    this.f3431a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z9, boolean z10);
}
