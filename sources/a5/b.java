package a5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.activity.e;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.i1;
import b0.a;
import com.imgdkh.app.R;
import h1.d;
import j5.s;
import j5.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z.f;

public final class b extends f {
    public static final int[][] A = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @SuppressLint({"DiscouragedApi"})
    public static final int B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f59y = {R.attr.state_indeterminate};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f60z = {R.attr.state_error};

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<c> f61e = new LinkedHashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<C0002b> f62f = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f63g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f64h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f65i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f66j;
    public CharSequence k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f67l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f68m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f69n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f70o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f71p;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f72q;

    /* renamed from: r  reason: collision with root package name */
    public int f73r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f74s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f75t;
    public CharSequence u;

    /* renamed from: v  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f76v;
    public final h1.d w;

    /* renamed from: x  reason: collision with root package name */
    public final a f77x;

    public class a extends h1.c {
        public a() {
        }

        public final void a(Drawable drawable) {
            ColorStateList colorStateList = b.this.f70o;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        public final void b(Drawable drawable) {
            b bVar = b.this;
            ColorStateList colorStateList = bVar.f70o;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(bVar.f74s, colorStateList.getDefaultColor()));
            }
        }
    }

    /* renamed from: a5.b$b  reason: collision with other inner class name */
    public interface C0002b {
        void a();
    }

    public interface c {
        void a();
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f79a;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f79a = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            String str;
            StringBuilder g10 = androidx.activity.f.g("MaterialCheckBox.SavedState{");
            g10.append(Integer.toHexString(System.identityHashCode(this)));
            g10.append(" CheckedState=");
            int i10 = this.f79a;
            if (i10 == 1) {
                str = "checked";
            } else if (i10 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
            return e.c(g10, str, "}");
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f79a));
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(x5.a.a(context, attributeSet, R.attr.checkboxStyle, 2132018226), attributeSet, R.attr.checkboxStyle);
        boolean z9;
        Context context2 = getContext();
        h1.d dVar = new h1.d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = z.f.f13098a;
        Drawable a10 = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.f6815a = a10;
        a10.setCallback(dVar.f6807f);
        new d.c(dVar.f6815a.getConstantState());
        this.w = dVar;
        this.f77x = new a();
        Context context3 = getContext();
        this.f67l = l0.c.a(this);
        this.f70o = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        int[] iArr = c.a.K;
        s.a(context3, attributeSet, R.attr.checkboxStyle, 2132018226);
        s.b(context3, attributeSet, iArr, R.attr.checkboxStyle, 2132018226, new int[0]);
        i1 i1Var = new i1(context3, context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2132018226));
        this.f68m = i1Var.e(2);
        if (this.f67l != null && n5.b.b(context3, R.attr.isMaterial3Theme, false)) {
            int i10 = i1Var.i(0, 0);
            int i11 = i1Var.i(1, 0);
            if (i10 == B && i11 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                super.setButtonDrawable((Drawable) null);
                this.f67l = e.a.a(context3, R.drawable.mtrl_checkbox_button);
                this.f69n = true;
                if (this.f68m == null) {
                    this.f68m = e.a.a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f71p = n5.c.b(context3, i1Var, 3);
        this.f72q = x.b(i1Var.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f64h = i1Var.a(10, false);
        this.f65i = i1Var.a(6, true);
        this.f66j = i1Var.a(9, false);
        this.k = i1Var.k(8);
        if (i1Var.l(7)) {
            setCheckedState(i1Var.h(7, 0));
        }
        i1Var.n();
        b();
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i10;
        int i11 = this.f73r;
        if (i11 == 1) {
            resources = getResources();
            i10 = R.string.mtrl_checkbox_state_description_checked;
        } else if (i11 == 0) {
            resources = getResources();
            i10 = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i10 = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i10);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f63g == null) {
            int[][] iArr = A;
            int t10 = c6.b.t(this, R.attr.colorControlActivated);
            int t11 = c6.b.t(this, R.attr.colorError);
            int t12 = c6.b.t(this, R.attr.colorSurface);
            int t13 = c6.b.t(this, R.attr.colorOnSurface);
            this.f63g = new ColorStateList(iArr, new int[]{c6.b.v(1.0f, t12, t11), c6.b.v(1.0f, t12, t10), c6.b.v(0.54f, t12, t13), c6.b.v(0.38f, t12, t13), c6.b.v(0.38f, t12, t13)});
        }
        return this.f63g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f70o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        int i10;
        int i11;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h1.d dVar;
        h1.e eVar;
        Drawable drawable = this.f67l;
        ColorStateList colorStateList3 = this.f70o;
        PorterDuff.Mode b10 = l0.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b10 != null) {
                a.b.i(drawable, b10);
            }
        }
        this.f67l = drawable;
        Drawable drawable2 = this.f68m;
        ColorStateList colorStateList4 = this.f71p;
        PorterDuff.Mode mode = this.f72q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                a.b.i(drawable2, mode);
            }
        }
        this.f68m = drawable2;
        if (this.f69n) {
            h1.d dVar2 = this.w;
            if (dVar2 != null) {
                a aVar = this.f77x;
                Drawable drawable3 = dVar2.f6815a;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f6802a == null) {
                        aVar.f6802a = new h1.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f6802a);
                }
                ArrayList<h1.c> arrayList = dVar2.f6806e;
                if (!(arrayList == null || aVar == null)) {
                    arrayList.remove(aVar);
                    if (dVar2.f6806e.size() == 0 && (eVar = dVar2.f6805d) != null) {
                        dVar2.f6803b.f6810b.removeListener(eVar);
                        dVar2.f6805d = null;
                    }
                }
                h1.d dVar3 = this.w;
                a aVar2 = this.f77x;
                Drawable drawable4 = dVar3.f6815a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar2.f6802a == null) {
                        aVar2.f6802a = new h1.b(aVar2);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar2.f6802a);
                } else if (aVar2 != null) {
                    if (dVar3.f6806e == null) {
                        dVar3.f6806e = new ArrayList<>();
                    }
                    if (!dVar3.f6806e.contains(aVar2)) {
                        dVar3.f6806e.add(aVar2);
                        if (dVar3.f6805d == null) {
                            dVar3.f6805d = new h1.e(dVar3);
                        }
                        dVar3.f6803b.f6810b.addListener(dVar3.f6805d);
                    }
                }
            }
            Drawable drawable5 = this.f67l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && (dVar = this.w) != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                ((AnimatedStateListDrawable) this.f67l).addTransition(R.id.indeterminate, R.id.unchecked, this.w, false);
            }
        }
        Drawable drawable6 = this.f67l;
        if (!(drawable6 == null || (colorStateList2 = this.f70o) == null)) {
            a.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f68m;
        if (!(drawable7 == null || (colorStateList = this.f71p) == null)) {
            a.b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f67l;
        Drawable drawable9 = this.f68m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            if (drawable9.getIntrinsicWidth() == -1 || drawable9.getIntrinsicHeight() == -1) {
                int intrinsicWidth = drawable8.getIntrinsicWidth();
                i10 = drawable8.getIntrinsicHeight();
                i11 = intrinsicWidth;
            } else if (drawable9.getIntrinsicWidth() > drawable8.getIntrinsicWidth() || drawable9.getIntrinsicHeight() > drawable8.getIntrinsicHeight()) {
                float intrinsicWidth2 = ((float) drawable9.getIntrinsicWidth()) / ((float) drawable9.getIntrinsicHeight());
                if (intrinsicWidth2 >= ((float) drawable8.getIntrinsicWidth()) / ((float) drawable8.getIntrinsicHeight())) {
                    i11 = drawable8.getIntrinsicWidth();
                    i10 = (int) (((float) i11) / intrinsicWidth2);
                } else {
                    i10 = drawable8.getIntrinsicHeight();
                    i11 = (int) (intrinsicWidth2 * ((float) i10));
                }
            } else {
                i11 = drawable9.getIntrinsicWidth();
                i10 = drawable9.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, i11, i10);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.f67l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f68m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f71p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f72q;
    }

    public ColorStateList getButtonTintList() {
        return this.f70o;
    }

    public int getCheckedState() {
        return this.f73r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    public final boolean isChecked() {
        return this.f73r == 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f64h && this.f70o == null && this.f71p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f59y);
        }
        if (this.f66j) {
            View.mergeDrawableStates(onCreateDrawableState, f60z);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i12 = onCreateDrawableState[i11];
            if (i12 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i12 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i11] = 16842912;
                break;
            } else {
                i11++;
            }
        }
        this.f74s = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (!this.f65i || !TextUtils.isEmpty(getText()) || (a10 = l0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (x.a(this)) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f66j) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.k);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f79a);
    }

    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f79a = getCheckedState();
        return dVar;
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(e.a.a(getContext(), i10));
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f67l = drawable;
        this.f69n = false;
        b();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f68m = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(e.a.a(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f71p != colorStateList) {
            this.f71p = colorStateList;
            b();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f72q != mode) {
            this.f72q = mode;
            b();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f70o != colorStateList) {
            this.f70o = colorStateList;
            b();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z9) {
        this.f65i = z9;
    }

    public void setChecked(boolean z9) {
        setCheckedState(z9 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z9;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f73r != i10) {
            this.f73r = i10;
            if (i10 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            super.setChecked(z9);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f75t) {
                this.f75t = true;
                LinkedHashSet<C0002b> linkedHashSet = this.f62f;
                if (linkedHashSet != null) {
                    Iterator<C0002b> it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                }
                if (!(this.f73r == 2 || (onCheckedChangeListener = this.f76v) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f75t = false;
            }
        }
    }

    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z9) {
        if (this.f66j != z9) {
            this.f66j = z9;
            refreshDrawableState();
            Iterator<c> it = this.f61e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f76v = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f64h = z9;
        l0.b.c(this, z9 ? getMaterialThemeColorsTintList() : null);
    }

    public final void toggle() {
        setChecked(!isChecked());
    }
}
