package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import b0.a;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import j5.s;
import j5.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l0.k;
import r5.i;
import r5.m;

public class MaterialButton extends AppCompatButton implements Checkable, m {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f2975r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f2976s = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public final x4.a f2977d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<a> f2978e = new LinkedHashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public b f2979f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f2980g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f2981h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f2982i;

    /* renamed from: j  reason: collision with root package name */
    public String f2983j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public int f2984l;

    /* renamed from: m  reason: collision with root package name */
    public int f2985m;

    /* renamed from: n  reason: collision with root package name */
    public int f2986n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2987o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2988p;

    /* renamed from: q  reason: collision with root package name */
    public int f2989q;

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends n0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f2990c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f2990c = parcel.readInt() != 1 ? false : true;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f2990c ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(x5.a.a(context, attributeSet, R.attr.materialButtonStyle, 2132018202), attributeSet, R.attr.materialButtonStyle);
        boolean z9 = false;
        this.f2987o = false;
        this.f2988p = false;
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, c.a.G, R.attr.materialButtonStyle, 2132018202, new int[0]);
        this.f2986n = d10.getDimensionPixelSize(12, 0);
        this.f2980g = x.b(d10.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f2981h = n5.c.a(getContext(), d10, 14);
        this.f2982i = n5.c.c(getContext(), d10, 10);
        this.f2989q = d10.getInteger(11, 1);
        this.k = d10.getDimensionPixelSize(13, 0);
        x4.a aVar = new x4.a(this, new i(i.b(context2, attributeSet, R.attr.materialButtonStyle, 2132018202)));
        this.f2977d = aVar;
        aVar.f12951c = d10.getDimensionPixelOffset(1, 0);
        aVar.f12952d = d10.getDimensionPixelOffset(2, 0);
        aVar.f12953e = d10.getDimensionPixelOffset(3, 0);
        aVar.f12954f = d10.getDimensionPixelOffset(4, 0);
        if (d10.hasValue(8)) {
            int dimensionPixelSize = d10.getDimensionPixelSize(8, -1);
            aVar.f12955g = dimensionPixelSize;
            i iVar = aVar.f12950b;
            float f10 = (float) dimensionPixelSize;
            iVar.getClass();
            i.a aVar2 = new i.a(iVar);
            aVar2.e(f10);
            aVar2.f(f10);
            aVar2.d(f10);
            aVar2.c(f10);
            aVar.c(new i(aVar2));
            aVar.f12963p = true;
        }
        aVar.f12956h = d10.getDimensionPixelSize(20, 0);
        aVar.f12957i = x.b(d10.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f12958j = n5.c.a(getContext(), d10, 6);
        aVar.k = n5.c.a(getContext(), d10, 19);
        aVar.f12959l = n5.c.a(getContext(), d10, 16);
        aVar.f12964q = d10.getBoolean(5, false);
        aVar.f12967t = d10.getDimensionPixelSize(9, 0);
        aVar.f12965r = d10.getBoolean(21, true);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int f11 = y.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = y.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d10.hasValue(0)) {
            aVar.f12962o = true;
            setSupportBackgroundTintList(aVar.f12958j);
            setSupportBackgroundTintMode(aVar.f12957i);
        } else {
            aVar.e();
        }
        y.e.k(this, f11 + aVar.f12951c, paddingTop + aVar.f12953e, e10 + aVar.f12952d, paddingBottom + aVar.f12954f);
        d10.recycle();
        setCompoundDrawablePadding(this.f2986n);
        c(this.f2982i != null ? true : z9);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil((double) f10);
    }

    public final boolean a() {
        x4.a aVar = this.f2977d;
        return aVar != null && !aVar.f12962o;
    }

    public final void b() {
        boolean z9;
        boolean z10;
        int i10 = this.f2989q;
        boolean z11 = false;
        if (i10 == 1 || i10 == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            k.b.e(this, this.f2982i, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            k.b.e(this, (Drawable) null, (Drawable) null, this.f2982i, (Drawable) null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z11 = true;
        }
        if (z11) {
            k.b.e(this, (Drawable) null, this.f2982i, (Drawable) null, (Drawable) null);
        }
    }

    public final void c(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        Drawable drawable = this.f2982i;
        boolean z13 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2982i = mutate;
            a.b.h(mutate, this.f2981h);
            PorterDuff.Mode mode = this.f2980g;
            if (mode != null) {
                a.b.i(this.f2982i, mode);
            }
            int i10 = this.k;
            if (i10 == 0) {
                i10 = this.f2982i.getIntrinsicWidth();
            }
            int i11 = this.k;
            if (i11 == 0) {
                i11 = this.f2982i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2982i;
            int i12 = this.f2984l;
            int i13 = this.f2985m;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f2982i.setVisible(true, z9);
        }
        if (z9) {
            b();
            return;
        }
        Drawable[] a10 = k.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.f2989q;
        if (i14 == 1 || i14 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || drawable3 == this.f2982i) {
            if (i14 == 3 || i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 || drawable5 == this.f2982i) {
                if (i14 == 16 || i14 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12 || drawable4 == this.f2982i) {
                    z13 = false;
                }
            }
        }
        if (z13) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f2982i != null && getLayout() != null) {
            int i12 = this.f2989q;
            boolean z12 = true;
            if (i12 == 1 || i12 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                if (i12 == 3 || i12 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (!(i12 == 16 || i12 == 32)) {
                        z12 = false;
                    }
                    if (z12) {
                        this.f2984l = 0;
                        if (i12 == 16) {
                            this.f2985m = 0;
                            c(false);
                            return;
                        }
                        int i13 = this.k;
                        if (i13 == 0) {
                            i13 = this.f2982i.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f2986n) - getPaddingBottom()) / 2);
                        if (this.f2985m != max) {
                            this.f2985m = max;
                            c(false);
                        }
                        return;
                    }
                    return;
                }
            }
            this.f2985m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f2989q;
            if (i14 == 1 || i14 == 3 || ((i14 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i14 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.f2984l = 0;
                c(false);
                return;
            }
            int i15 = this.k;
            if (i15 == 0) {
                i15 = this.f2982i.getIntrinsicWidth();
            }
            int textLayoutWidth = i10 - getTextLayoutWidth();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            int e10 = (((textLayoutWidth - y.e.e(this)) - i15) - this.f2986n) - y.e.f(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                e10 /= 2;
            }
            if (y.e.d(this) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f2989q != 4) {
                z12 = false;
            }
            if (z10 != z12) {
                e10 = -e10;
            }
            if (this.f2984l != e10) {
                this.f2984l = e10;
                c(false);
            }
        }
    }

    public String getA11yClassName() {
        boolean z9;
        Class cls;
        if (!TextUtils.isEmpty(this.f2983j)) {
            return this.f2983j;
        }
        x4.a aVar = this.f2977d;
        if (aVar == null || !aVar.f12964q) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f2977d.f12955g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2982i;
    }

    public int getIconGravity() {
        return this.f2989q;
    }

    public int getIconPadding() {
        return this.f2986n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.f2981h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2980g;
    }

    public int getInsetBottom() {
        return this.f2977d.f12954f;
    }

    public int getInsetTop() {
        return this.f2977d.f12953e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f2977d.f12959l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (a()) {
            return this.f2977d.f12950b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f2977d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f2977d.f12956h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f2977d.f12958j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f2977d.f12957i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f2987o;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            z5.c.r(this, this.f2977d.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i10) {
        boolean z9;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        x4.a aVar = this.f2977d;
        if (aVar == null || !aVar.f12964q) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            View.mergeDrawableStates(onCreateDrawableState, f2975r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2976s);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        x4.a aVar = this.f2977d;
        if (aVar == null || !aVar.f12964q) {
            z9 = false;
        } else {
            z9 = true;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f9479a);
        setChecked(cVar.f2990c);
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f2990c = this.f2987o;
        return cVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.f2977d.f12965r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2982i != null) {
            if (this.f2982i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2983j = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (a()) {
            x4.a aVar = this.f2977d;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                x4.a aVar = this.f2977d;
                aVar.f12962o = true;
                aVar.f12949a.setSupportBackgroundTintList(aVar.f12958j);
                aVar.f12949a.setSupportBackgroundTintMode(aVar.f12957i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? e.a.a(getContext(), i10) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z9) {
        if (a()) {
            this.f2977d.f12964q = z9;
        }
    }

    public void setChecked(boolean z9) {
        boolean z10;
        x4.a aVar = this.f2977d;
        if (aVar == null || !aVar.f12964q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && isEnabled() && this.f2987o != z9) {
            this.f2987o = z9;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.f2987o;
                if (!materialButtonToggleGroup.f2996f) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (!this.f2988p) {
                this.f2988p = true;
                Iterator<a> it = this.f2978e.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.f2988p = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            x4.a aVar = this.f2977d;
            if (!aVar.f12963p || aVar.f12955g != i10) {
                aVar.f12955g = i10;
                aVar.f12963p = true;
                i iVar = aVar.f12950b;
                float f10 = (float) i10;
                iVar.getClass();
                i.a aVar2 = new i.a(iVar);
                aVar2.e(f10);
                aVar2.f(f10);
                aVar2.d(f10);
                aVar2.c(f10);
                aVar.c(new i(aVar2));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f2977d.b(false).j(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2982i != drawable) {
            this.f2982i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f2989q != i10) {
            this.f2989q = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f2986n != i10) {
            this.f2986n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? e.a.a(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.k != i10) {
            this.k = i10;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2981h != colorStateList) {
            this.f2981h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2980g != mode) {
            this.f2980g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(y.a.b(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        x4.a aVar = this.f2977d;
        aVar.d(aVar.f12953e, i10);
    }

    public void setInsetTop(int i10) {
        x4.a aVar = this.f2977d;
        aVar.d(i10, aVar.f12954f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f2979f = bVar;
    }

    public void setPressed(boolean z9) {
        b bVar = this.f2979f;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z9);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            x4.a aVar = this.f2977d;
            if (aVar.f12959l != colorStateList) {
                aVar.f12959l = colorStateList;
                if (aVar.f12949a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.f12949a.getBackground()).setColor(o5.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(y.a.b(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        if (a()) {
            this.f2977d.c(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z9) {
        if (a()) {
            x4.a aVar = this.f2977d;
            aVar.f12961n = z9;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            x4.a aVar = this.f2977d;
            if (aVar.k != colorStateList) {
                aVar.k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(y.a.b(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            x4.a aVar = this.f2977d;
            if (aVar.f12956h != i10) {
                aVar.f12956h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            x4.a aVar = this.f2977d;
            if (aVar.f12958j != colorStateList) {
                aVar.f12958j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f12958j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            x4.a aVar = this.f2977d;
            if (aVar.f12957i != mode) {
                aVar.f12957i = mode;
                if (aVar.b(false) != null && aVar.f12957i != null) {
                    a.b.i(aVar.b(false), aVar.f12957i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z9) {
        this.f2977d.f12965r = z9;
    }

    public final void toggle() {
        setChecked(!this.f2987o);
    }
}
