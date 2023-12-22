package v5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.u0;
import b0.a;
import com.google.android.material.textfield.TextInputLayout;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import j5.s;
import java.util.Locale;
import java.util.WeakHashMap;
import n5.c;

public final class u extends d {

    /* renamed from: e  reason: collision with root package name */
    public final u0 f12595e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f12596f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f12597g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final int f12598h;

    /* renamed from: i  reason: collision with root package name */
    public final float f12599i;

    /* renamed from: j  reason: collision with root package name */
    public int f12600j;
    public ColorStateList k;

    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: a  reason: collision with root package name */
        public ColorStateList f12601a;

        /* renamed from: b  reason: collision with root package name */
        public ColorStateList f12602b;

        public a(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            b();
        }

        public final void b() {
            boolean z9;
            ColorStateList colorStateList;
            boolean z10;
            boolean z11;
            ColorStateList colorStateList2 = u.this.k;
            if (colorStateList2 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z9) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f12602b = colorStateList;
            u uVar = u.this;
            if (uVar.f12600j != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ColorStateList colorStateList4 = uVar.k;
                if (colorStateList4 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{a0.a.b(colorStateList4.getColorForState(iArr3, 0), u.this.f12600j), a0.a.b(u.this.k.getColorForState(iArr2, 0), u.this.f12600j), u.this.f12600j});
                }
            }
            this.f12601a = colorStateList3;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            boolean z9;
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                RippleDrawable rippleDrawable = null;
                if (u.this.getText().toString().contentEquals(textView.getText())) {
                    if (u.this.f12600j != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        ColorDrawable colorDrawable = new ColorDrawable(u.this.f12600j);
                        if (this.f12602b != null) {
                            a.b.h(colorDrawable, this.f12601a);
                            rippleDrawable = new RippleDrawable(this.f12602b, colorDrawable, (Drawable) null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.d.q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public u(Context context, AttributeSet attributeSet) {
        super(x5.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, c.a.F, R.attr.autoCompleteTextViewStyle, com.ironsource.sdk.mediation.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f12598h = d10.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f12599i = (float) d10.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f12600j = d10.getColor(3, 0);
        this.k = c.a(context2, d10, 4);
        this.f12596f = (AccessibilityManager) context2.getSystemService("accessibility");
        u0 u0Var = new u0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f12595e = u0Var;
        u0Var.f979y = true;
        u0Var.f980z.setFocusable(true);
        u0Var.f971o = this;
        u0Var.f980z.setInputMethodMode(2);
        u0Var.o(getAdapter());
        u0Var.f972p = new t(this);
        if (d10.hasValue(5)) {
            setSimpleItems(d10.getResourceId(5, 0));
        }
        d10.recycle();
    }

    public static void a(u uVar, Object obj) {
        uVar.setText(uVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void dismissDropDown() {
        boolean z9;
        AccessibilityManager accessibilityManager = this.f12596f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f12595e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 == null || !b10.C) {
            return super.getHint();
        }
        return b10.getHint();
    }

    public float getPopupElevation() {
        return this.f12599i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f12600j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.k;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.C && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12595e.dismiss();
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i13 = 0;
            if (!(adapter == null || b10 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                u0 u0Var = this.f12595e;
                if (!u0Var.b()) {
                    i12 = -1;
                } else {
                    i12 = u0Var.f960c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i12) + 15);
                View view = null;
                int i14 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i13) {
                        view = null;
                        i13 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i14 = Math.max(i14, view.getMeasuredWidth());
                }
                Drawable e10 = this.f12595e.e();
                if (e10 != null) {
                    e10.getPadding(this.f12597g);
                    Rect rect = this.f12597g;
                    i14 += rect.left + rect.right;
                }
                i13 = b10.getEndIconView().getMeasuredWidth() + i14;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i13), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z9) {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f12596f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            super.onWindowFocusChanged(z9);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f12595e.o(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        u0 u0Var = this.f12595e;
        if (u0Var != null) {
            u0Var.h(drawable);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f12595e.f973q = getOnItemSelectedListener();
    }

    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.q();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f12600j = i10;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f12598h, strArr));
    }

    public final void showDropDown() {
        boolean z9;
        AccessibilityManager accessibilityManager = this.f12596f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f12595e.show();
        } else {
            super.showDropDown();
        }
    }
}
