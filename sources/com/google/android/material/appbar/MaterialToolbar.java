package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b0.a;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import j5.s;
import j5.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import r5.f;
import x5.a;
import z5.c;

public class MaterialToolbar extends Toolbar {

    /* renamed from: q0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f2880q0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer U;
    public boolean V;
    public boolean W;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView.ScaleType f2881o0;
    public Boolean p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2132018302), attributeSet, 0);
        int i10 = 0;
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, c.a.P, R.attr.toolbarStyle, 2132018302, new int[0]);
        if (d10.hasValue(2)) {
            setNavigationIconTint(d10.getColor(2, -1));
        }
        this.V = d10.getBoolean(4, false);
        this.W = d10.getBoolean(3, false);
        int i11 = d10.getInt(1, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2880q0;
            if (i11 < scaleTypeArr.length) {
                this.f2881o0 = scaleTypeArr[i11];
            }
        }
        if (d10.hasValue(0)) {
            this.p0 = Boolean.valueOf(d10.getBoolean(0, false));
        }
        d10.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i10));
            fVar.i(context2);
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            fVar.j(y.i.i(this));
            y.d.q(this, fVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2881o0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    public final void k(int i10) {
        Menu menu = getMenu();
        boolean z9 = menu instanceof androidx.appcompat.view.menu.f;
        if (z9) {
            ((androidx.appcompat.view.menu.f) menu).w();
        }
        super.k(i10);
        if (z9) {
            ((androidx.appcompat.view.menu.f) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.q(this);
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z9, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.V || this.W) {
            ArrayList b10 = t.b(this, getTitle());
            if (b10.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(b10, t.f8708a);
            }
            ArrayList b11 = t.b(this, getSubtitle());
            if (b11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(b11, t.f8708a);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.V && textView != null) {
                    t(textView, pair);
                }
                if (this.W && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.p0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2881o0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof f) {
            ((f) background).j(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z9) {
        Boolean bool = this.p0;
        if (bool == null || bool.booleanValue() != z9) {
            this.p0 = Boolean.valueOf(z9);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2881o0 != scaleType) {
            this.f2881o0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.U == null)) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z9) {
        if (this.W != z9) {
            this.W = z9;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z9) {
        if (this.V != z9) {
            this.V = z9;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
