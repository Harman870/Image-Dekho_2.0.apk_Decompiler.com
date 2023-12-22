package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.s0;
import d.w;
import java.util.Iterator;

public class ActionMenuView extends s0 implements f.b, k {
    public e A;

    /* renamed from: p  reason: collision with root package name */
    public f f568p;

    /* renamed from: q  reason: collision with root package name */
    public Context f569q;

    /* renamed from: r  reason: collision with root package name */
    public int f570r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f571s;

    /* renamed from: t  reason: collision with root package name */
    public c f572t;
    public j.a u;

    /* renamed from: v  reason: collision with root package name */
    public f.a f573v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public int f574x;

    /* renamed from: y  reason: collision with root package name */
    public int f575y;

    /* renamed from: z  reason: collision with root package name */
    public int f576z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements j.a {
        public final void a(f fVar, boolean z9) {
        }

        public final boolean b(f fVar) {
            return false;
        }
    }

    public static class c extends s0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f577a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f578b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f579c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f580d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f581e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f582f;

        public c() {
            super(-2, -2);
            this.f577a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f577a = cVar.f577a;
        }
    }

    public class d implements f.a {
        public d() {
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            boolean z9;
            boolean z10;
            e eVar = ActionMenuView.this.A;
            if (eVar == null) {
                return false;
            }
            Toolbar.a aVar = (Toolbar.a) eVar;
            Iterator<h0.k> it = Toolbar.this.G.f6701a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().b()) {
                        z9 = true;
                        break;
                    }
                } else {
                    z9 = false;
                    break;
                }
            }
            if (z9) {
                z10 = true;
            } else {
                Toolbar.h hVar = Toolbar.this.I;
                if (hVar != null) {
                    z10 = w.this.f5976b.onMenuItemSelected(0, menuItem);
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                return true;
            }
            return false;
        }

        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.f573v;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f575y = (int) (56.0f * f10);
        this.f576z = (int) (f10 * 4.0f);
        this.f569q = context;
        this.f570r = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.gravity <= 0) {
                cVar.gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        cVar2.gravity = 16;
        return cVar2;
    }

    public final boolean a(h hVar) {
        return this.f568p.q(hVar, (j) null, 0);
    }

    public final void b(f fVar) {
        this.f568p = fVar;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final s0.a f() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final s0.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f568p == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.f568p = fVar;
            fVar.f443e = new d();
            c cVar = new c(context);
            this.f572t = cVar;
            cVar.f718m = true;
            cVar.f719n = true;
            j.a aVar = this.u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f387e = aVar;
            this.f568p.b(cVar, this.f569q);
            c cVar2 = this.f572t;
            cVar2.f390h = this;
            this.f568p = cVar2.f385c;
        }
        return this.f568p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.f572t;
        c.d dVar = cVar.f716j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f717l) {
            return cVar.k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f570r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ s0.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i10) {
        boolean z9 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z9 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z9 : z9 | ((a) childAt2).b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.f572t;
        if (cVar != null) {
            cVar.f();
            if (this.f572t.m()) {
                this.f572t.g();
                this.f572t.n();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f572t;
        if (cVar != null) {
            cVar.g();
            c.a aVar = cVar.u;
            if (aVar != null && aVar.b()) {
                aVar.f496j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.w) {
            super.onLayout(z9, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = r1.a(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f577a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    k(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (a10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f577a) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f577a) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i29;
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        boolean z13;
        int i19;
        ActionMenuItemView actionMenuItemView;
        boolean z14;
        int i20;
        boolean z15;
        f fVar;
        boolean z16 = this.w;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.w = z9;
        if (z16 != z9) {
            this.f574x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.w || (fVar = this.f568p) == null || size == this.f574x)) {
            this.f574x = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.w || childCount <= 0) {
            int i21 = i11;
            for (int i22 = 0; i22 < childCount; i22++) {
                c cVar = (c) getChildAt(i22).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i23 = size2 - paddingRight;
        int i24 = this.f575y;
        int i25 = i23 / i24;
        int i26 = i23 % i24;
        if (i25 == 0) {
            setMeasuredDimension(i23, 0);
            return;
        }
        int i27 = (i26 / i25) + i24;
        int childCount2 = getChildCount();
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z17 = false;
        int i32 = 0;
        long j10 = 0;
        while (i31 < childCount2) {
            View childAt = getChildAt(i31);
            int i33 = size3;
            if (childAt.getVisibility() == 8) {
                i15 = mode;
                i16 = i23;
                i17 = paddingBottom;
            } else {
                boolean z18 = childAt instanceof ActionMenuItemView;
                int i34 = i29 + 1;
                if (z18) {
                    int i35 = this.f576z;
                    i18 = i34;
                    z12 = false;
                    childAt.setPadding(i35, 0, i35, 0);
                } else {
                    i18 = i34;
                    z12 = false;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f582f = z12;
                cVar2.f579c = z12 ? 1 : 0;
                cVar2.f578b = z12;
                cVar2.f580d = z12;
                cVar2.leftMargin = z12;
                cVar2.rightMargin = z12;
                if (!z18 || !((ActionMenuItemView) childAt).l()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                cVar2.f581e = z13;
                if (cVar2.f577a) {
                    i19 = 1;
                } else {
                    i19 = i25;
                }
                i16 = i23;
                c cVar3 = (c) childAt.getLayoutParams();
                i15 = mode;
                i17 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z18) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || !actionMenuItemView.l()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (i19 <= 0 || (z14 && i19 < 2)) {
                    i20 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i27, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i20 = measuredWidth / i27;
                    if (measuredWidth % i27 != 0) {
                        i20++;
                    }
                    if (z14 && i20 < 2) {
                        i20 = 2;
                    }
                }
                if (cVar3.f577a || !z14) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                cVar3.f580d = z15;
                cVar3.f578b = i20;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i20, 1073741824), makeMeasureSpec);
                i30 = Math.max(i30, i20);
                if (cVar2.f580d) {
                    i32++;
                }
                if (cVar2.f577a) {
                    z17 = true;
                }
                i25 -= i20;
                i28 = Math.max(i28, childAt.getMeasuredHeight());
                if (i20 == 1) {
                    j10 |= (long) (1 << i31);
                }
                i29 = i18;
            }
            i31++;
            size3 = i33;
            paddingBottom = i17;
            i23 = i16;
            mode = i15;
        }
        int i36 = mode;
        int i37 = i23;
        int i38 = size3;
        if (!z17 || i29 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z19 = false;
        while (i32 > 0 && i25 > 0) {
            int i39 = Integer.MAX_VALUE;
            int i40 = 0;
            long j11 = 0;
            for (int i41 = 0; i41 < childCount2; i41++) {
                c cVar4 = (c) getChildAt(i41).getLayoutParams();
                if (cVar4.f580d) {
                    int i42 = cVar4.f578b;
                    if (i42 < i39) {
                        j11 = 1 << i41;
                        i39 = i42;
                        i40 = 1;
                    } else if (i42 == i39) {
                        i40++;
                        j11 |= 1 << i41;
                    }
                }
            }
            j10 |= j11;
            if (i40 > i25) {
                break;
            }
            int i43 = i39 + 1;
            int i44 = 0;
            while (i44 < childCount2) {
                View childAt2 = getChildAt(i44);
                c cVar5 = (c) childAt2.getLayoutParams();
                int i45 = childMeasureSpec;
                int i46 = childCount2;
                long j12 = (long) (1 << i44);
                if ((j11 & j12) != 0) {
                    if (z10 && cVar5.f581e && i25 == 1) {
                        int i47 = this.f576z;
                        childAt2.setPadding(i47 + i27, 0, i47, 0);
                    }
                    cVar5.f578b++;
                    cVar5.f582f = true;
                    i25--;
                } else if (cVar5.f578b == i43) {
                    j10 |= j12;
                }
                i44++;
                childMeasureSpec = i45;
                childCount2 = i46;
            }
            z19 = true;
        }
        int i48 = childMeasureSpec;
        int i49 = childCount2;
        if (z17 || i29 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i25 <= 0 || j10 == 0 || (i25 >= i29 - 1 && !z11 && i30 <= 1)) {
            i12 = i49;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z11) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f581e) {
                    bitCount -= 0.5f;
                }
                int i50 = i49 - 1;
                if ((j10 & ((long) (1 << i50))) != 0 && !((c) getChildAt(i50).getLayoutParams()).f581e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i14 = (int) (((float) (i25 * i27)) / bitCount);
            } else {
                i14 = 0;
            }
            boolean z20 = z19;
            i12 = i49;
            for (int i51 = 0; i51 < i12; i51++) {
                if ((j10 & ((long) (1 << i51))) != 0) {
                    View childAt3 = getChildAt(i51);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f579c = i14;
                        cVar6.f582f = true;
                        if (i51 == 0 && !cVar6.f581e) {
                            cVar6.leftMargin = (-i14) / 2;
                        }
                        z20 = true;
                    } else {
                        if (cVar6.f577a) {
                            cVar6.f579c = i14;
                            cVar6.f582f = true;
                            cVar6.rightMargin = (-i14) / 2;
                            z20 = true;
                        } else {
                            if (i51 != 0) {
                                cVar6.leftMargin = i14 / 2;
                            }
                            if (i51 != i12 - 1) {
                                cVar6.rightMargin = i14 / 2;
                            }
                        }
                    }
                }
            }
            z19 = z20;
        }
        if (z19) {
            for (int i52 = 0; i52 < i12; i52++) {
                View childAt4 = getChildAt(i52);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f582f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f578b * i27) + cVar7.f579c, 1073741824), i48);
                }
            }
        }
        if (i36 != 1073741824) {
            i13 = i28;
        } else {
            i13 = i38;
        }
        setMeasuredDimension(i37, i13);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.f572t.f723r = z9;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.f572t;
        c.d dVar = cVar.f716j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f717l = true;
        cVar.k = drawable;
    }

    public void setOverflowReserved(boolean z9) {
        this.f571s = z9;
    }

    public void setPopupTheme(int i10) {
        if (this.f570r != i10) {
            this.f570r = i10;
            if (i10 == 0) {
                this.f569q = getContext();
            } else {
                this.f569q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.f572t = cVar;
        cVar.f390h = this;
        this.f568p = cVar.f385c;
    }
}
