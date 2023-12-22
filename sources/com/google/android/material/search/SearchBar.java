package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import h0.l0;
import h0.y;
import j5.t;
import java.util.WeakHashMap;
import r5.f;
import z5.c;

public final class SearchBar extends Toolbar {
    public Drawable U;
    public int V;
    public boolean W;

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g  reason: collision with root package name */
        public boolean f3282g = false;

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.d(coordinatorLayout, view, view2);
            if (!this.f3282g && (view2 instanceof AppBarLayout)) {
                this.f3282g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }
    }

    public static class a extends n0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0030a();

        /* renamed from: c  reason: collision with root package name */
        public String f3283c;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3283c = parcel.readString();
        }

        public a(Toolbar.i iVar) {
            super(iVar);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeString(this.f3283c);
        }

        /* renamed from: com.google.android.material.search.SearchBar$a$a  reason: collision with other inner class name */
        public class C0030a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z9) {
        ImageButton a10 = t.a(this);
        if (a10 != null) {
            a10.setClickable(!z9);
            a10.setFocusable(!z9);
            Drawable background = a10.getBackground();
            if (background != null) {
                this.U = background;
            }
            a10.setBackgroundDrawable(z9 ? null : this.U);
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        return y.i.i(this);
    }

    public float getCornerSize() {
        throw null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.V;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    public final void k(int i10) {
        super.k(i10);
        this.V = i10;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.r(this, (f) null);
        throw null;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f9479a);
        setText((CharSequence) aVar.f3283c);
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a((Toolbar.i) super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f3283c = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z9) {
        this.W = z9;
        if (getLayoutParams() instanceof AppBarLayout.c) {
            AppBarLayout.c cVar = (AppBarLayout.c) getLayoutParams();
            if (this.W) {
                if (cVar.f2877a == 0) {
                    cVar.f2877a = 53;
                }
            } else if (cVar.f2877a == 53) {
                cVar.f2877a = 0;
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
    }

    public void setHint(int i10) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z9) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            ColorStateList.valueOf(i10);
            throw null;
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            throw null;
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(int i10) {
        throw null;
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setTitle(CharSequence charSequence) {
    }
}
