package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public class ActionBarContextView extends a {

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f530i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f531j;
    public View k;

    /* renamed from: l  reason: collision with root package name */
    public View f532l;

    /* renamed from: m  reason: collision with root package name */
    public View f533m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f534n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f535o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f536p;

    /* renamed from: q  reason: collision with root package name */
    public int f537q;

    /* renamed from: r  reason: collision with root package name */
    public int f538r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f539s;

    /* renamed from: t  reason: collision with root package name */
    public int f540t;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g.a f541a;

        public a(g.a aVar) {
            this.f541a = aVar;
        }

        public final void onClick(View view) {
            this.f541a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y3.a.f13027h, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = e.a.a(context, resourceId);
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.q(this, drawable);
        this.f537q = obtainStyledAttributes.getResourceId(5, 0);
        this.f538r = obtainStyledAttributes.getResourceId(4, 0);
        this.f682e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f540t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(g.a r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.k
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.f540t
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.k = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r5.k
        L_0x001e:
            r5.addView(r0)
        L_0x0021:
            android.view.View r0 = r5.k
            r2 = 2131296337(0x7f090051, float:1.8210588E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.f532l = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.f r6 = r6.e()
            androidx.appcompat.widget.c r0 = r5.f681d
            if (r0 == 0) goto L_0x004e
            r0.g()
            androidx.appcompat.widget.c$a r0 = r0.u
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x004e
            h.d r0 = r0.f496j
            r0.dismiss()
        L_0x004e:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f681d = r0
            r2 = 1
            r0.f718m = r2
            r0.f719n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.c r2 = r5.f681d
            android.content.Context r3 = r5.f679b
            r6.b(r2, r3)
            androidx.appcompat.widget.c r6 = r5.f681d
            androidx.appcompat.view.menu.k r2 = r6.f390h
            if (r2 != 0) goto L_0x0086
            android.view.LayoutInflater r3 = r6.f386d
            int r4 = r6.f388f
            android.view.View r1 = r3.inflate(r4, r5, r1)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.k) r1
            r6.f390h = r1
            androidx.appcompat.view.menu.f r3 = r6.f385c
            r1.b(r3)
            r6.f()
        L_0x0086:
            androidx.appcompat.view.menu.k r1 = r6.f390h
            if (r2 == r1) goto L_0x0090
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L_0x0090:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f680c = r1
            r6 = 0
            java.util.WeakHashMap<android.view.View, h0.l0> r2 = h0.y.f6776a
            h0.y.d.q(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f680c
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(g.a):void");
    }

    public final void g() {
        if (this.f534n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f534n = linearLayout;
            this.f535o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f536p = (TextView) this.f534n.findViewById(R.id.action_bar_subtitle);
            if (this.f537q != 0) {
                this.f535o.setTextAppearance(getContext(), this.f537q);
            }
            if (this.f538r != 0) {
                this.f536p.setTextAppearance(getContext(), this.f538r);
            }
        }
        this.f535o.setText(this.f530i);
        this.f536p.setText(this.f531j);
        boolean z9 = !TextUtils.isEmpty(this.f530i);
        boolean z10 = !TextUtils.isEmpty(this.f531j);
        int i10 = 0;
        this.f536p.setVisibility(z10 ? 0 : 8);
        LinearLayout linearLayout2 = this.f534n;
        if (!z9 && !z10) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f534n.getParent() == null) {
            addView(this.f534n);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f531j;
    }

    public CharSequence getTitle() {
        return this.f530i;
    }

    public final void h() {
        removeAllViews();
        this.f533m = null;
        this.f680c = null;
        this.f681d = null;
        View view = this.f532l;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f681d;
        if (cVar != null) {
            cVar.g();
            c.a aVar = this.f681d.u;
            if (aVar != null && aVar.b()) {
                aVar.f496j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean a10 = r1.a(this);
        int paddingRight = a10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.k;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            int i14 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = a10 ? paddingRight - i14 : paddingRight + i14;
            int d10 = a.d(i16, paddingTop, paddingTop2, this.k, a10) + i16;
            paddingRight = a10 ? d10 - i15 : d10 + i15;
        }
        LinearLayout linearLayout = this.f534n;
        if (!(linearLayout == null || this.f533m != null || linearLayout.getVisibility() == 8)) {
            paddingRight += a.d(paddingRight, paddingTop, paddingTop2, this.f534n, a10);
        }
        View view2 = this.f533m;
        if (view2 != null) {
            a.d(paddingRight, paddingTop, paddingTop2, view2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f680c;
        if (actionMenuView != null) {
            a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f682e;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.k;
            if (view != null) {
                int c10 = a.c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f680c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a.c(this.f680c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f534n;
            if (linearLayout != null && this.f533m == null) {
                if (this.f539s) {
                    this.f534n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f534n.getMeasuredWidth();
                    boolean z9 = measuredWidth <= paddingLeft;
                    if (z9) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f534n.setVisibility(z9 ? 0 : 8);
                } else {
                    paddingLeft = a.c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f533m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f533m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f682e <= 0) {
                int childCount = getChildCount();
                i13 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i13) {
                        i13 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i10) {
        this.f682e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f533m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f533m = view;
        if (!(view == null || (linearLayout = this.f534n) == null)) {
            removeView(linearLayout);
            this.f534n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f531j = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f530i = charSequence;
        g();
        y.o(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.f539s) {
            requestLayout();
        }
        this.f539s = z9;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
