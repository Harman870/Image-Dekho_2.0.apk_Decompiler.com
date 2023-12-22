package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s4.g;

public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3185a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3186b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3187c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3186b = false;
            this.f3187c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.B);
            this.f3186b = obtainStyledAttributes.getBoolean(0, false);
            this.f3187c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1242h == 0) {
                fVar.f1242h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z9;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z9 = ((CoordinatorLayout.f) layoutParams).f1235a instanceof BottomSheetBehavior;
                } else {
                    z9 = false;
                }
                if (z9) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z9;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList f10 = coordinatorLayout.f(extendedFloatingActionButton);
            int size = f10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) f10.get(i11);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z9 = ((CoordinatorLayout.f) layoutParams).f1235a instanceof BottomSheetBehavior;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.r(extendedFloatingActionButton, i10);
            return true;
        }

        public final void s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z9;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            int i10 = 1;
            int i11 = 0;
            if ((this.f3186b || this.f3187c) && fVar.f1240f == appBarLayout.getId()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (this.f3185a == null) {
                    this.f3185a = new Rect();
                }
                Rect rect = this.f3185a;
                j5.d.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    if (this.f3187c) {
                        i10 = 2;
                    }
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                    throw null;
                }
                if (this.f3187c) {
                    i11 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
                throw null;
            }
        }

        public final void t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z9;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            int i10 = 1;
            int i11 = 0;
            if ((this.f3186b || this.f3187c) && fVar.f1240f == view.getId()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                    if (this.f3187c) {
                        i10 = 2;
                    }
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                    throw null;
                }
                if (this.f3187c) {
                    i11 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
                throw null;
            }
        }
    }

    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            return Float.valueOf((float) y.e.f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.e.k(view, intValue, paddingTop, y.e.e(view), view.getPaddingBottom());
        }
    }

    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            return Float.valueOf((float) y.e.e((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.e.k(view, y.e.f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            throw null;
        }
        throw new IllegalStateException(e.a("Unknown strategy type: ", i10));
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z9) {
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(g.b(getContext(), i10));
    }

    public void setExtended(boolean z9) {
        if (z9) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(g.b(getContext(), i10));
    }

    public void setTextColor(int i10) {
        super.setTextColor(i10);
        getTextColors();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
