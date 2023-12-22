package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.m1;
import androidx.appcompat.widget.s0;
import b0.a;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import j5.f;
import java.util.WeakHashMap;
import l0.k;
import z.f;

public class NavigationMenuItemView extends f implements k.a {
    public static final int[] F = {16842912};
    public h A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final a E;

    /* renamed from: v  reason: collision with root package name */
    public int f3261v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3262x;

    /* renamed from: y  reason: collision with root package name */
    public final CheckedTextView f3263y;

    /* renamed from: z  reason: collision with root package name */
    public FrameLayout f3264z;

    public class a extends h0.a {
        public a() {
        }

        public final void d(View view, i0.f fVar) {
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            fVar.f7091a.setCheckable(NavigationMenuItemView.this.f3262x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f3263y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        y.n(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3264z == null) {
                this.f3264z = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f3264z.removeAllViews();
            this.f3264z.addView(view);
        }
    }

    public final void c(h hVar) {
        int i10;
        s0.a aVar;
        int i11;
        StateListDrawable stateListDrawable;
        this.A = hVar;
        int i12 = hVar.f463a;
        if (i12 > 0) {
            setId(i12);
        }
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z9 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f467e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f478q);
        m1.a(this, hVar.f479r);
        h hVar2 = this.A;
        if (!(hVar2.f467e == null && hVar2.getIcon() == null && this.A.getActionView() != null)) {
            z9 = false;
        }
        if (z9) {
            this.f3263y.setVisibility(8);
            FrameLayout frameLayout = this.f3264z;
            if (frameLayout != null) {
                aVar = (s0.a) frameLayout.getLayoutParams();
                i11 = -1;
            } else {
                return;
            }
        } else {
            this.f3263y.setVisibility(0);
            FrameLayout frameLayout2 = this.f3264z;
            if (frameLayout2 != null) {
                aVar = (s0.a) frameLayout2.getLayoutParams();
                i11 = -2;
            } else {
                return;
            }
        }
        aVar.width = i11;
        this.f3264z.setLayoutParams(aVar);
    }

    public h getItemData() {
        return this.A;
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.A;
        if (hVar != null && hVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.f3262x != z9) {
            this.f3262x = z9;
            this.E.h(this.f3263y, 2048);
        }
    }

    public void setChecked(boolean z9) {
        refreshDrawableState();
        this.f3263y.setChecked(z9);
        CheckedTextView checkedTextView = this.f3263y;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z9 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.B);
            }
            int i10 = this.f3261v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.w) {
            if (this.D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = z.f.f13098a;
                Drawable a10 = f.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.D = a10;
                if (a10 != null) {
                    int i11 = this.f3261v;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.D;
        }
        k.b.e(this.f3263y, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.f3263y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f3261v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        h hVar = this.A;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f3263y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.w = z9;
    }

    public void setTextAppearance(int i10) {
        this.f3263y.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3263y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3263y.setText(charSequence);
    }
}
