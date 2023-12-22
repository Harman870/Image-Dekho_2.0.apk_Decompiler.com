package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.f;
import com.imgdkh.app.R;
import d.i;
import d.z;
import h0.l0;
import h0.n;
import h0.o;
import h0.p;
import h0.s0;
import h0.y;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements m0, n, o {
    public static final int[] B = {R.attr.actionBarSize, 16842841};
    public final p A;

    /* renamed from: a  reason: collision with root package name */
    public int f542a;

    /* renamed from: b  reason: collision with root package name */
    public int f543b = 0;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f544c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f545d;

    /* renamed from: e  reason: collision with root package name */
    public n0 f546e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f547f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f548g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f549h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f550i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f551j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public int f552l;

    /* renamed from: m  reason: collision with root package name */
    public int f553m;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f554n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    public final Rect f555o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    public final Rect f556p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public s0 f557q;

    /* renamed from: r  reason: collision with root package name */
    public s0 f558r;

    /* renamed from: s  reason: collision with root package name */
    public s0 f559s;

    /* renamed from: t  reason: collision with root package name */
    public s0 f560t;
    public d u;

    /* renamed from: v  reason: collision with root package name */
    public OverScroller f561v;
    public ViewPropertyAnimator w;

    /* renamed from: x  reason: collision with root package name */
    public final a f562x;

    /* renamed from: y  reason: collision with root package name */
    public final b f563y;

    /* renamed from: z  reason: collision with root package name */
    public final c f564z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.w = null;
            actionBarOverlayLayout.k = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.w = null;
            actionBarOverlayLayout.k = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.w = actionBarOverlayLayout.f545d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f562x);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.w = actionBarOverlayLayout.f545d.animate().translationY((float) (-ActionBarOverlayLayout.this.f545d.getHeight())).setListener(ActionBarOverlayLayout.this.f562x);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        s0 s0Var = s0.f6742b;
        this.f557q = s0Var;
        this.f558r = s0Var;
        this.f559s = s0Var;
        this.f560t = s0Var;
        this.f562x = new a();
        this.f563y = new b();
        this.f564z = new c();
        r(context);
        this.A = new p();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z9) {
        boolean z10;
        int i10;
        e eVar = (e) frameLayout.getLayoutParams();
        int i11 = eVar.leftMargin;
        int i12 = rect.left;
        if (i11 != i12) {
            eVar.leftMargin = i12;
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = eVar.topMargin;
        int i14 = rect.top;
        if (i13 != i14) {
            eVar.topMargin = i14;
            z10 = true;
        }
        int i15 = eVar.rightMargin;
        int i16 = rect.right;
        if (i15 != i16) {
            eVar.rightMargin = i16;
            z10 = true;
        }
        if (!z9 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z10;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    public final boolean a() {
        s();
        return this.f546e.a();
    }

    public final void b(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public final void c() {
        s();
        this.f546e.c();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final boolean d() {
        s();
        return this.f546e.d();
    }

    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f547f != null && !this.f548g) {
            if (this.f545d.getVisibility() == 0) {
                i10 = (int) (this.f545d.getTranslationY() + ((float) this.f545d.getBottom()) + 0.5f);
            } else {
                i10 = 0;
            }
            this.f547f.setBounds(0, i10, getWidth(), this.f547f.getIntrinsicHeight() + i10);
            this.f547f.draw(canvas);
        }
    }

    public final boolean e() {
        s();
        return this.f546e.e();
    }

    public final boolean f() {
        s();
        return this.f546e.f();
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g(f fVar, i.d dVar) {
        s();
        this.f546e.g(fVar, dVar);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f545d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        p pVar = this.A;
        return pVar.f6714b | pVar.f6713a;
    }

    public CharSequence getTitle() {
        s();
        return this.f546e.getTitle();
    }

    public final boolean h() {
        s();
        return this.f546e.h();
    }

    public final void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public final void k(int i10) {
        s();
        if (i10 == 2) {
            this.f546e.t();
        } else if (i10 == 5) {
            this.f546e.u();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public final void l() {
        s();
        this.f546e.i();
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        s0 i10 = s0.i(this, windowInsets);
        boolean p5 = p(this.f545d, new Rect(i10.c(), i10.e(), i10.d(), i10.b()), false);
        Rect rect = this.f554n;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.i.b(this, i10, rect);
        Rect rect2 = this.f554n;
        s0 l6 = i10.f6743a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f557q = l6;
        boolean z9 = true;
        if (!this.f558r.equals(l6)) {
            this.f558r = this.f557q;
            p5 = true;
        }
        if (!this.f555o.equals(this.f554n)) {
            this.f555o.set(this.f554n);
        } else {
            z9 = p5;
        }
        if (z9) {
            requestLayout();
        }
        return i10.f6743a.a().f6743a.c().f6743a.b().h();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.h.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z9;
        int i12;
        s0 s0Var;
        s0.e eVar;
        s();
        measureChildWithMargins(this.f545d, i10, 0, i11, 0);
        e eVar2 = (e) this.f545d.getLayoutParams();
        int max = Math.max(0, this.f545d.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max2 = Math.max(0, this.f545d.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f545d.getMeasuredState());
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if ((y.d.g(this) & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i12 = this.f542a;
            if (this.f550i && this.f545d.getTabContainer() != null) {
                i12 += this.f542a;
            }
        } else {
            i12 = this.f545d.getVisibility() != 8 ? this.f545d.getMeasuredHeight() : 0;
        }
        this.f556p.set(this.f554n);
        s0 s0Var2 = this.f557q;
        this.f559s = s0Var2;
        if (this.f549h || z9) {
            a0.b b10 = a0.b.b(s0Var2.c(), this.f559s.e() + i12, this.f559s.d(), this.f559s.b() + 0);
            s0 s0Var3 = this.f559s;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                eVar = new s0.d(s0Var3);
            } else if (i13 >= 29) {
                eVar = new s0.c(s0Var3);
            } else {
                eVar = new s0.b(s0Var3);
            }
            eVar.g(b10);
            s0Var = eVar.b();
        } else {
            Rect rect = this.f556p;
            rect.top += i12;
            rect.bottom += 0;
            s0Var = s0Var2.f6743a.l(0, i12, 0, 0);
        }
        this.f559s = s0Var;
        p(this.f544c, this.f556p, true);
        if (!this.f560t.equals(this.f559s)) {
            s0 s0Var4 = this.f559s;
            this.f560t = s0Var4;
            y.b(this.f544c, s0Var4);
        }
        measureChildWithMargins(this.f544c, i10, 0, i11, 0);
        e eVar3 = (e) this.f544c.getLayoutParams();
        int max3 = Math.max(max, this.f544c.getMeasuredWidth() + eVar3.leftMargin + eVar3.rightMargin);
        int max4 = Math.max(max2, this.f544c.getMeasuredHeight() + eVar3.topMargin + eVar3.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f544c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        boolean z10 = false;
        if (!this.f551j || !z9) {
            return false;
        }
        this.f561v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f561v.getFinalY() > this.f545d.getHeight()) {
            z10 = true;
        }
        if (z10) {
            q();
            this.f564z.run();
        } else {
            q();
            this.f563y.run();
        }
        this.k = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f552l + i11;
        this.f552l = i14;
        setActionBarHideOffset(i14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (d.z) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            h0.p r1 = r0.A
            r1.f6713a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f552l = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.u
            if (r1 == 0) goto L_0x001d
            d.z r1 = (d.z) r1
            g.g r2 = r1.f6018t
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f6018t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f545d.getVisibility() != 0) {
            return false;
        }
        return this.f551j;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f551j && !this.k) {
            if (this.f552l <= this.f545d.getHeight()) {
                q();
                postDelayed(this.f563y, 600);
                return;
            }
            q();
            postDelayed(this.f564z, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z9;
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.f553m ^ i10;
        this.f553m = i10;
        if ((i10 & 4) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d dVar = this.u;
        if (dVar != null) {
            ((z) dVar).f6014p = !z10;
            if (z9 || !z10) {
                z zVar = (z) dVar;
                if (zVar.f6015q) {
                    zVar.f6015q = false;
                    zVar.u(true);
                }
            } else {
                z zVar2 = (z) dVar;
                if (!zVar2.f6015q) {
                    zVar2.f6015q = true;
                    zVar2.u(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.u != null) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.h.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f543b = i10;
        d dVar = this.u;
        if (dVar != null) {
            ((z) dVar).f6013o = i10;
        }
    }

    public final void q() {
        removeCallbacks(this.f563y);
        removeCallbacks(this.f564z);
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(B);
        boolean z9 = false;
        this.f542a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f547f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z9 = true;
        }
        this.f548g = z9;
        this.f561v = new OverScroller(context);
    }

    public final void s() {
        n0 n0Var;
        if (this.f544c == null) {
            this.f544c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f545d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof n0) {
                n0Var = (n0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                n0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder g10 = androidx.activity.f.g("Can't make a decor toolbar out of ");
                g10.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(g10.toString());
            }
            this.f546e = n0Var;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f545d.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f545d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.u = dVar;
        if (getWindowToken() != null) {
            ((z) this.u).f6013o = this.f543b;
            int i10 = this.f553m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.f550i = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.f551j) {
            this.f551j = z9;
            if (!z9) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        s();
        this.f546e.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f546e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        s();
        this.f546e.p(i10);
    }

    public void setOverlayMode(boolean z9) {
        this.f549h = z9;
        this.f548g = z9 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f546e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f546e.setWindowTitle(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
