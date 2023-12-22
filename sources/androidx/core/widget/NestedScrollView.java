package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import h0.l;
import h0.l0;
import h0.m;
import h0.o;
import h0.p;
import h0.y;
import i0.f;
import i0.h;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l0.d;

public class NestedScrollView extends FrameLayout implements o, l {
    public static final float A = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final a B = new a();
    public static final int[] C = {16843130};

    /* renamed from: a  reason: collision with root package name */
    public final float f1269a;

    /* renamed from: b  reason: collision with root package name */
    public long f1270b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1271c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f1272d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f1273e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f1274f;

    /* renamed from: g  reason: collision with root package name */
    public int f1275g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1276h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1277i;

    /* renamed from: j  reason: collision with root package name */
    public View f1278j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f1279l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1280m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1281n;

    /* renamed from: o  reason: collision with root package name */
    public int f1282o;

    /* renamed from: p  reason: collision with root package name */
    public int f1283p;

    /* renamed from: q  reason: collision with root package name */
    public int f1284q;

    /* renamed from: r  reason: collision with root package name */
    public int f1285r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f1286s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f1287t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f1288v;
    public d w;

    /* renamed from: x  reason: collision with root package name */
    public final p f1289x;

    /* renamed from: y  reason: collision with root package name */
    public final m f1290y;

    /* renamed from: z  reason: collision with root package name */
    public float f1291z;

    public static class a extends h0.a {
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z9;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            accessibilityEvent.setScrollable(z9);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            h.c(accessibilityEvent, nestedScrollView.getScrollX());
            h.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public final void d(View view, f fVar) {
            int scrollRange;
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            fVar.g(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                fVar.k(true);
                if (nestedScrollView.getScrollY() > 0) {
                    fVar.b(f.a.f7098i);
                    fVar.b(f.a.f7101m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    fVar.b(f.a.f7097h);
                    fVar.b(f.a.f7102n);
                }
            }
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1292a;

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
            this.f1292a = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("HorizontalScrollView.SavedState{");
            g10.append(Integer.toHexString(System.identityHashCode(this)));
            g10.append(" scrollPosition=");
            g10.append(this.f1292a);
            g10.append("}");
            return g10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1292a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f1271c = new Rect();
        this.f1276h = true;
        this.f1277i = false;
        this.f1278j = null;
        this.k = false;
        this.f1281n = true;
        this.f1285r = -1;
        this.f1286s = new int[2];
        this.f1287t = new int[2];
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            edgeEffect = d.b.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1273e = edgeEffect;
        if (i11 >= 31) {
            edgeEffect2 = d.b.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1274f = edgeEffect2;
        this.f1269a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1272d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1282o = viewConfiguration.getScaledTouchSlop();
        this.f1283p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1284q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1289x = new p();
        this.f1290y = new m(this);
        setNestedScrollingEnabled(true);
        y.n(this, B);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1291z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1291z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1291z;
    }

    public static boolean k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, view2);
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            d(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1271c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1271c);
            d(c(this.f1271c));
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && (!l(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, View view2, int i10, int i11) {
        p pVar = this.f1289x;
        if (i11 == 1) {
            pVar.f6714b = i10;
        } else {
            pVar.f6713a = i10;
        }
        this.f1290y.g(2, i11);
    }

    public final int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r18 = this;
            r0 = r18
            android.widget.OverScroller r1 = r0.f1272d
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            android.widget.OverScroller r1 = r0.f1272d
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r0.f1272d
            int r1 = r1.getCurrY()
            int r2 = r0.f1288v
            int r2 = r1 - r2
            int r3 = r18.getHeight()
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 1082130432(0x40800000, float:4.0)
            if (r2 <= 0) goto L_0x004a
            android.widget.EdgeEffect r7 = r0.f1273e
            float r7 = l0.d.a(r7)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x004a
            int r5 = -r2
            float r5 = (float) r5
            float r5 = r5 * r6
            float r7 = (float) r3
            float r5 = r5 / r7
            int r3 = -r3
            float r3 = (float) r3
            float r3 = r3 / r6
            android.widget.EdgeEffect r6 = r0.f1273e
            float r4 = l0.d.b(r6, r5, r4)
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            if (r3 == r2) goto L_0x006b
            android.widget.EdgeEffect r4 = r0.f1273e
        L_0x0046:
            r4.finish()
            goto L_0x006b
        L_0x004a:
            if (r2 >= 0) goto L_0x006c
            android.widget.EdgeEffect r7 = r0.f1274f
            float r7 = l0.d.a(r7)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x006c
            float r5 = (float) r2
            float r5 = r5 * r6
            float r3 = (float) r3
            float r5 = r5 / r3
            float r3 = r3 / r6
            android.widget.EdgeEffect r6 = r0.f1274f
            float r4 = l0.d.b(r6, r5, r4)
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            if (r3 == r2) goto L_0x006b
            android.widget.EdgeEffect r4 = r0.f1274f
            goto L_0x0046
        L_0x006b:
            int r2 = r2 - r3
        L_0x006c:
            r0.f1288v = r1
            int[] r6 = r0.f1287t
            r1 = 0
            r9 = 1
            r6[r9] = r1
            r4 = 0
            r7 = 0
            r8 = 1
            h0.m r3 = r0.f1290y
            r5 = r2
            r3.c(r4, r5, r6, r7, r8)
            int[] r3 = r0.f1287t
            r3 = r3[r9]
            int r2 = r2 - r3
            int r3 = r18.getScrollRange()
            if (r2 == 0) goto L_0x00b1
            int r4 = r18.getScrollY()
            int r5 = r18.getScrollX()
            r0.r(r2, r5, r4, r3)
            int r5 = r18.getScrollY()
            int r12 = r5 - r4
            int r2 = r2 - r12
            int[] r4 = r0.f1287t
            r4[r9] = r1
            int[] r15 = r0.f1286s
            r16 = 1
            h0.m r10 = r0.f1290y
            r11 = 0
            r13 = 0
            r14 = r2
            r17 = r4
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            int[] r4 = r0.f1287t
            r4 = r4[r9]
            int r2 = r2 - r4
        L_0x00b1:
            if (r2 == 0) goto L_0x00e9
            int r4 = r18.getOverScrollMode()
            if (r4 == 0) goto L_0x00bd
            if (r4 != r9) goto L_0x00be
            if (r3 <= 0) goto L_0x00be
        L_0x00bd:
            r1 = r9
        L_0x00be:
            if (r1 == 0) goto L_0x00e1
            if (r2 >= 0) goto L_0x00cd
            android.widget.EdgeEffect r1 = r0.f1273e
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00e1
            android.widget.EdgeEffect r1 = r0.f1273e
            goto L_0x00d7
        L_0x00cd:
            android.widget.EdgeEffect r1 = r0.f1274f
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00e1
            android.widget.EdgeEffect r1 = r0.f1274f
        L_0x00d7:
            android.widget.OverScroller r2 = r0.f1272d
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
        L_0x00e1:
            android.widget.OverScroller r1 = r0.f1272d
            r1.abortAnimation()
            r0.w(r9)
        L_0x00e9:
            android.widget.OverScroller r1 = r0.f1272d
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00f7
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            h0.y.d.k(r18)
            goto L_0x00fa
        L_0x00f7:
            r0.w(r9)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f1281n) {
            u(0, i10, false);
        } else {
            scrollBy(0, i10);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.f1290y.a(f10, f11, z9);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f1290y.b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f1290y.c(i10, i11, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f1290y.e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f1273e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f1273e.setSize(width, height);
            if (this.f1273e.draw(canvas)) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f1274f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f1274f.setSize(width2, height2);
            if (this.f1274f.draw(canvas)) {
                WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                y.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e() {
        this.k = false;
        VelocityTracker velocityTracker = this.f1279l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1279l = null;
        }
        w(0);
        this.f1273e.onRelease();
        this.f1274f.onRelease();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f1271c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fa
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00eb
            r4 = 20
            if (r0 == r4) goto L_0x00db
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fa
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != r3) goto L_0x0088
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r2
        L_0x0089:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00be
            android.graphics.Rect r7 = r6.f1271c
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d0
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f1271c
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d0
            int r1 = r1 - r0
            goto L_0x00ce
        L_0x00be:
            android.graphics.Rect r7 = r6.f1271c
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f1271c
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d0
            r1 = r2
        L_0x00ce:
            r7.top = r1
        L_0x00d0:
            android.graphics.Rect r7 = r6.f1271c
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.s(r5, r1, r0)
            goto L_0x00fa
        L_0x00db:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e6
            boolean r2 = r6.a(r3)
            goto L_0x00fa
        L_0x00e6:
            boolean r2 = r6.h(r3)
            goto L_0x00fa
        L_0x00eb:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f6
            boolean r2 = r6.a(r5)
            goto L_0x00fa
        L_0x00f6:
            boolean r2 = r6.h(r5)
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.f(android.view.KeyEvent):boolean");
    }

    public final void g(int i10) {
        if (getChildCount() > 0) {
            this.f1272d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1290y.g(2, 1);
            this.f1288v = getScrollY();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.d.k(this);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        p pVar = this.f1289x;
        return pVar.f6714b | pVar.f6713a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final boolean h(int i10) {
        int childCount;
        boolean z9 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1271c;
        rect.top = 0;
        rect.bottom = height;
        if (z9 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1271c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1271c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1271c;
        return s(i10, rect3.top, rect3.bottom);
    }

    public final boolean hasNestedScrollingParent() {
        if (this.f1290y.f(0) != null) {
            return true;
        }
        return false;
    }

    public final void i(View view, int i10) {
        p pVar = this.f1289x;
        if (i10 == 1) {
            pVar.f6714b = 0;
        } else {
            pVar.f6713a = 0;
        }
        w(i10);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f1290y.f6711d;
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        this.f1290y.c(i10, i11, iArr, (int[]) null, i12);
    }

    public final boolean l(View view, int i10, int i11) {
        view.getDrawingRect(this.f1271c);
        offsetDescendantRectToMyCoords(view, this.f1271c);
        return this.f1271c.bottom + i10 >= getScrollY() && this.f1271c.top - i10 <= getScrollY() + i11;
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        p(i13, i14, iArr);
    }

    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        p(i13, i14, (int[]) null);
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1277i = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00c2
            boolean r0 = r8.k
            if (r0 != 0) goto L_0x00c2
            r0 = 2
            boolean r0 = z5.c.l(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0018
            r0 = 9
            goto L_0x0022
        L_0x0018:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = z5.c.l(r9, r0)
            if (r0 == 0) goto L_0x0027
            r0 = 26
        L_0x0022:
            float r0 = r9.getAxisValue(r0)
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00c2
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x007b
            int r2 = r8.getOverScrollMode()
            if (r2 == 0) goto L_0x0054
            if (r2 != r6) goto L_0x0052
            int r2 = r8.getScrollRange()
            if (r2 <= 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r2 = r1
            goto L_0x0055
        L_0x0054:
            r2 = r6
        L_0x0055:
            if (r2 == 0) goto L_0x005f
            boolean r9 = z5.c.l(r9, r5)
            if (r9 != 0) goto L_0x005f
            r9 = r6
            goto L_0x0060
        L_0x005f:
            r9 = r1
        L_0x0060:
            if (r9 == 0) goto L_0x0079
            android.widget.EdgeEffect r9 = r8.f1273e
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            l0.d.b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f1273e
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto L_0x00b7
        L_0x0079:
            r9 = r1
            goto L_0x00b7
        L_0x007b:
            if (r0 <= r2) goto L_0x00b5
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L_0x008e
            if (r7 != r6) goto L_0x008c
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r7 = r1
            goto L_0x008f
        L_0x008e:
            r7 = r6
        L_0x008f:
            if (r7 == 0) goto L_0x0099
            boolean r9 = z5.c.l(r9, r5)
            if (r9 != 0) goto L_0x0099
            r9 = r6
            goto L_0x009a
        L_0x0099:
            r9 = r1
        L_0x009a:
            if (r9 == 0) goto L_0x00b2
            android.widget.EdgeEffect r9 = r8.f1274f
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            l0.d.b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f1274f
            r9.onRelease()
            r8.invalidate()
            r1 = r6
        L_0x00b2:
            r9 = r1
            r1 = r2
            goto L_0x00b7
        L_0x00b5:
            r9 = r1
            r1 = r0
        L_0x00b7:
            if (r1 == r3) goto L_0x00c1
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00c1:
            return r9
        L_0x00c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r12.k
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00b4
            r5 = -1
            if (r0 == r2) goto L_0x0086
            if (r0 == r1) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x0086
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x013e
        L_0x0020:
            r12.q(r13)
            goto L_0x013e
        L_0x0025:
            int r0 = r12.f1285r
            if (r0 != r5) goto L_0x002b
            goto L_0x013e
        L_0x002b:
            int r4 = r13.findPointerIndex(r0)
            if (r4 != r5) goto L_0x004e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x013e
        L_0x004e:
            float r0 = r13.getY(r4)
            int r0 = (int) r0
            int r4 = r12.f1275g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r12.f1282o
            if (r4 <= r5) goto L_0x013e
            int r4 = r12.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x013e
            r12.k = r2
            r12.f1275g = r0
            android.view.VelocityTracker r0 = r12.f1279l
            if (r0 != 0) goto L_0x0074
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f1279l = r0
        L_0x0074:
            android.view.VelocityTracker r0 = r12.f1279l
            r0.addMovement(r13)
            r12.u = r3
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x013e
            r13.requestDisallowInterceptTouchEvent(r2)
            goto L_0x013e
        L_0x0086:
            r12.k = r3
            r12.f1285r = r5
            android.view.VelocityTracker r13 = r12.f1279l
            if (r13 == 0) goto L_0x0093
            r13.recycle()
            r12.f1279l = r4
        L_0x0093:
            android.widget.OverScroller r5 = r12.f1272d
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x00af
            java.util.WeakHashMap<android.view.View, h0.l0> r13 = h0.y.f6776a
            h0.y.d.k(r12)
        L_0x00af:
            r12.w(r3)
            goto L_0x013e
        L_0x00b4:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00e8
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r3)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00e8
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00e8
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00e8
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00e8
            r5 = r2
            goto L_0x00e9
        L_0x00e8:
            r5 = r3
        L_0x00e9:
            if (r5 != 0) goto L_0x0107
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L_0x00fb
            android.widget.OverScroller r13 = r12.f1272d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r2 = r3
        L_0x00fb:
            r12.k = r2
            android.view.VelocityTracker r13 = r12.f1279l
            if (r13 == 0) goto L_0x013e
            r13.recycle()
            r12.f1279l = r4
            goto L_0x013e
        L_0x0107:
            r12.f1275g = r0
            int r0 = r13.getPointerId(r3)
            r12.f1285r = r0
            android.view.VelocityTracker r0 = r12.f1279l
            if (r0 != 0) goto L_0x011a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f1279l = r0
            goto L_0x011d
        L_0x011a:
            r0.clear()
        L_0x011d:
            android.view.VelocityTracker r0 = r12.f1279l
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f1272d
            r0.computeScrollOffset()
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L_0x0137
            android.widget.OverScroller r13 = r12.f1272d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r2 = r3
        L_0x0137:
            r12.k = r2
            h0.m r13 = r12.f1290y
            r13.g(r1, r3)
        L_0x013e:
            boolean r13 = r12.k
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z9, i10, i11, i12, i13);
        int i15 = 0;
        this.f1276h = false;
        View view = this.f1278j;
        if (view != null && k(view, this)) {
            View view2 = this.f1278j;
            view2.getDrawingRect(this.f1271c);
            offsetDescendantRectToMyCoords(view2, this.f1271c);
            int c10 = c(this.f1271c);
            if (c10 != 0) {
                scrollBy(0, c10);
            }
        }
        this.f1278j = null;
        if (!this.f1277i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.f1292a);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1277i = true;
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1280m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (z9) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        g((int) f11);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        p(i13, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        b(view, view2, i10, 0);
    }

    public final void onOverScrolled(int i10, int i11, boolean z9, boolean z10) {
        super.scrollTo(i10, i11);
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (rect == null) {
            view = instance.findNextFocus(this, (View) null, i10);
        } else {
            view = instance.findNextFocusFromRect(this, rect, i10);
        }
        if (view != null && !(true ^ l(view, 0, getHeight()))) {
            return view.requestFocus(i10, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.w = dVar;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1292a = getScrollY();
        return dVar;
    }

    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && l(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f1271c);
            offsetDescendantRectToMyCoords(findFocus, this.f1271c);
            d(c(this.f1271c));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a2, code lost:
        if (r0.f1272d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r0.f1272d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x02a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            android.view.VelocityTracker r2 = r0.f1279l
            if (r2 != 0) goto L_0x000e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.f1279l = r2
        L_0x000e:
            int r2 = r22.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L_0x0017
            r0.u = r3
        L_0x0017:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r22)
            int r5 = r0.u
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            r5 = 2
            r7 = 1
            if (r2 == 0) goto L_0x02af
            r8 = -1
            if (r2 == r7) goto L_0x022d
            if (r2 == r5) goto L_0x007e
            r3 = 3
            if (r2 == r3) goto L_0x005b
            r3 = 5
            if (r2 == r3) goto L_0x0048
            r3 = 6
            if (r2 == r3) goto L_0x0036
            goto L_0x02e5
        L_0x0036:
            r21.q(r22)
            int r2 = r0.f1285r
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.f1275g = r1
            goto L_0x02e5
        L_0x0048:
            int r2 = r22.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.f1275g = r3
            int r1 = r1.getPointerId(r2)
            r0.f1285r = r1
            goto L_0x02e5
        L_0x005b:
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x02a9
            int r1 = r21.getChildCount()
            if (r1 <= 0) goto L_0x02a9
            android.widget.OverScroller r9 = r0.f1272d
            int r10 = r21.getScrollX()
            int r11 = r21.getScrollY()
            r12 = 0
            r13 = 0
            r14 = 0
            int r15 = r21.getScrollRange()
            boolean r1 = r9.springBack(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x02a9
            goto L_0x02a4
        L_0x007e:
            int r2 = r0.f1285r
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r8) goto L_0x00a1
            java.lang.String r1 = "Invalid pointerId="
            java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
            int r2 = r0.f1285r
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L_0x02e5
        L_0x00a1:
            float r5 = r1.getY(r2)
            int r5 = (int) r5
            int r8 = r0.f1275g
            int r8 = r8 - r5
            float r9 = r1.getX(r2)
            int r10 = r21.getWidth()
            float r10 = (float) r10
            float r9 = r9 / r10
            float r10 = (float) r8
            int r11 = r21.getHeight()
            float r11 = (float) r11
            float r10 = r10 / r11
            android.widget.EdgeEffect r11 = r0.f1273e
            float r11 = l0.d.a(r11)
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x00dd
            android.widget.EdgeEffect r11 = r0.f1273e
            float r10 = -r10
            float r9 = l0.d.b(r11, r10, r9)
            float r9 = -r9
            android.widget.EdgeEffect r10 = r0.f1273e
            float r10 = l0.d.a(r10)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00db
            android.widget.EdgeEffect r6 = r0.f1273e
            goto L_0x00fb
        L_0x00db:
            r6 = r9
            goto L_0x00ff
        L_0x00dd:
            android.widget.EdgeEffect r11 = r0.f1274f
            float r11 = l0.d.a(r11)
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00ff
            android.widget.EdgeEffect r11 = r0.f1274f
            float r9 = r12 - r9
            float r9 = l0.d.b(r11, r10, r9)
            android.widget.EdgeEffect r10 = r0.f1274f
            float r10 = l0.d.a(r10)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00db
            android.widget.EdgeEffect r6 = r0.f1274f
        L_0x00fb:
            r6.onRelease()
            goto L_0x00db
        L_0x00ff:
            int r9 = r21.getHeight()
            float r9 = (float) r9
            float r6 = r6 * r9
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L_0x010e
            r21.invalidate()
        L_0x010e:
            int r8 = r8 - r6
            boolean r6 = r0.k
            if (r6 != 0) goto L_0x012d
            int r6 = java.lang.Math.abs(r8)
            int r9 = r0.f1282o
            if (r6 <= r9) goto L_0x012d
            android.view.ViewParent r6 = r21.getParent()
            if (r6 == 0) goto L_0x0124
            r6.requestDisallowInterceptTouchEvent(r7)
        L_0x0124:
            r0.k = r7
            int r6 = r0.f1282o
            if (r8 <= 0) goto L_0x012c
            int r8 = r8 - r6
            goto L_0x012d
        L_0x012c:
            int r8 = r8 + r6
        L_0x012d:
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x02e5
            r14 = 0
            int[] r6 = r0.f1287t
            int[] r9 = r0.f1286s
            r18 = 0
            h0.m r13 = r0.f1290y
            r15 = r8
            r16 = r6
            r17 = r9
            boolean r6 = r13.c(r14, r15, r16, r17, r18)
            if (r6 == 0) goto L_0x0153
            int[] r6 = r0.f1287t
            r6 = r6[r7]
            int r8 = r8 - r6
            int r6 = r0.u
            int[] r9 = r0.f1286s
            r9 = r9[r7]
            int r6 = r6 + r9
            r0.u = r6
        L_0x0153:
            int[] r6 = r0.f1286s
            r6 = r6[r7]
            int r5 = r5 - r6
            r0.f1275g = r5
            int r5 = r21.getScrollY()
            int r6 = r21.getScrollRange()
            int r9 = r21.getOverScrollMode()
            if (r9 == 0) goto L_0x016f
            if (r9 != r7) goto L_0x016d
            if (r6 <= 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r9 = r3
            goto L_0x0170
        L_0x016f:
            r9 = r7
        L_0x0170:
            int r10 = r21.getScrollY()
            boolean r10 = r0.r(r8, r3, r10, r6)
            if (r10 == 0) goto L_0x0189
            h0.m r10 = r0.f1290y
            android.view.ViewParent r10 = r10.f(r3)
            if (r10 == 0) goto L_0x0184
            r10 = r7
            goto L_0x0185
        L_0x0184:
            r10 = r3
        L_0x0185:
            if (r10 != 0) goto L_0x0189
            r10 = r7
            goto L_0x018a
        L_0x0189:
            r10 = r3
        L_0x018a:
            int r11 = r21.getScrollY()
            int r15 = r11 - r5
            int r17 = r8 - r15
            int[] r11 = r0.f1287t
            r11[r7] = r3
            int[] r14 = r0.f1286s
            r19 = 0
            h0.m r13 = r0.f1290y
            r16 = 0
            r18 = 0
            r20 = r14
            r14 = r16
            r16 = r18
            r18 = r20
            r20 = r11
            r13.e(r14, r15, r16, r17, r18, r19, r20)
            int r11 = r0.f1275g
            int[] r13 = r0.f1286s
            r13 = r13[r7]
            int r11 = r11 - r13
            r0.f1275g = r11
            int r11 = r0.u
            int r11 = r11 + r13
            r0.u = r11
            if (r9 == 0) goto L_0x0223
            int[] r9 = r0.f1287t
            r9 = r9[r7]
            int r8 = r8 - r9
            int r5 = r5 + r8
            if (r5 >= 0) goto L_0x01e7
            android.widget.EdgeEffect r5 = r0.f1273e
            int r6 = -r8
            float r6 = (float) r6
            int r8 = r21.getHeight()
            float r8 = (float) r8
            float r6 = r6 / r8
            float r1 = r1.getX(r2)
            int r2 = r21.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            l0.d.b(r5, r6, r1)
            android.widget.EdgeEffect r1 = r0.f1274f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x020d
            android.widget.EdgeEffect r1 = r0.f1274f
            goto L_0x020a
        L_0x01e7:
            if (r5 <= r6) goto L_0x020d
            android.widget.EdgeEffect r5 = r0.f1274f
            float r6 = (float) r8
            int r8 = r21.getHeight()
            float r8 = (float) r8
            float r6 = r6 / r8
            float r1 = r1.getX(r2)
            int r2 = r21.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r12 = r12 - r1
            l0.d.b(r5, r6, r12)
            android.widget.EdgeEffect r1 = r0.f1273e
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x020d
            android.widget.EdgeEffect r1 = r0.f1273e
        L_0x020a:
            r1.onRelease()
        L_0x020d:
            android.widget.EdgeEffect r1 = r0.f1273e
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x021d
            android.widget.EdgeEffect r1 = r0.f1274f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0223
        L_0x021d:
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            h0.y.d.k(r21)
            goto L_0x0224
        L_0x0223:
            r3 = r10
        L_0x0224:
            if (r3 == 0) goto L_0x02e5
            android.view.VelocityTracker r1 = r0.f1279l
            r1.clear()
            goto L_0x02e5
        L_0x022d:
            android.view.VelocityTracker r1 = r0.f1279l
            r2 = 1000(0x3e8, float:1.401E-42)
            int r5 = r0.f1284q
            float r5 = (float) r5
            r1.computeCurrentVelocity(r2, r5)
            int r2 = r0.f1285r
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r5 = r0.f1283p
            if (r2 < r5) goto L_0x028d
            android.widget.EdgeEffect r2 = r0.f1273e
            float r2 = l0.d.a(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x025e
            android.widget.EdgeEffect r2 = r0.f1273e
            boolean r2 = r0.t(r2, r1)
            if (r2 == 0) goto L_0x025c
            android.widget.EdgeEffect r2 = r0.f1273e
            r3 = r1
            goto L_0x0273
        L_0x025c:
            int r2 = -r1
            goto L_0x0278
        L_0x025e:
            android.widget.EdgeEffect r2 = r0.f1274f
            float r2 = l0.d.a(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x027c
            android.widget.EdgeEffect r2 = r0.f1274f
            int r3 = -r1
            boolean r2 = r0.t(r2, r3)
            if (r2 == 0) goto L_0x0277
            android.widget.EdgeEffect r2 = r0.f1274f
        L_0x0273:
            r2.onAbsorb(r3)
            goto L_0x027b
        L_0x0277:
            r2 = r3
        L_0x0278:
            r0.g(r2)
        L_0x027b:
            r3 = r7
        L_0x027c:
            if (r3 != 0) goto L_0x02a9
            int r1 = -r1
            float r2 = (float) r1
            boolean r3 = r0.dispatchNestedPreFling(r6, r2)
            if (r3 != 0) goto L_0x02a9
            r0.dispatchNestedFling(r6, r2, r7)
            r0.g(r1)
            goto L_0x02a9
        L_0x028d:
            android.widget.OverScroller r9 = r0.f1272d
            int r10 = r21.getScrollX()
            int r11 = r21.getScrollY()
            r12 = 0
            r13 = 0
            r14 = 0
            int r15 = r21.getScrollRange()
            boolean r1 = r9.springBack(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x02a9
        L_0x02a4:
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            h0.y.d.k(r21)
        L_0x02a9:
            r0.f1285r = r8
            r21.e()
            goto L_0x02e5
        L_0x02af:
            int r2 = r21.getChildCount()
            if (r2 != 0) goto L_0x02b6
            return r3
        L_0x02b6:
            boolean r2 = r0.k
            if (r2 == 0) goto L_0x02c3
            android.view.ViewParent r2 = r21.getParent()
            if (r2 == 0) goto L_0x02c3
            r2.requestDisallowInterceptTouchEvent(r7)
        L_0x02c3:
            android.widget.OverScroller r2 = r0.f1272d
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x02d3
            android.widget.OverScroller r2 = r0.f1272d
            r2.abortAnimation()
            r0.w(r7)
        L_0x02d3:
            float r2 = r22.getY()
            int r2 = (int) r2
            r0.f1275g = r2
            int r1 = r1.getPointerId(r3)
            r0.f1285r = r1
            h0.m r1 = r0.f1290y
            r1.g(r5, r3)
        L_0x02e5:
            android.view.VelocityTracker r1 = r0.f1279l
            if (r1 == 0) goto L_0x02ec
            r1.addMovement(r4)
        L_0x02ec:
            r4.recycle()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1290y.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1285r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1275g = (int) motionEvent.getY(i10);
            this.f1285r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1279l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x001a
        L_0x0017:
            r11 = r0
            r10 = r1
            goto L_0x001e
        L_0x001a:
            if (r11 >= 0) goto L_0x001d
            goto L_0x0017
        L_0x001d:
            r10 = r0
        L_0x001e:
            if (r12 <= r13) goto L_0x0023
            r12 = r13
        L_0x0021:
            r13 = r1
            goto L_0x0028
        L_0x0023:
            if (r12 >= 0) goto L_0x0027
            r12 = r0
            goto L_0x0021
        L_0x0027:
            r13 = r0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            h0.m r2 = r9.f1290y
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r1
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f1272d
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int, int):boolean");
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f1276h) {
            view2.getDrawingRect(this.f1271c);
            offsetDescendantRectToMyCoords(view2, this.f1271c);
            int c10 = c(this.f1271c);
            if (c10 != 0) {
                scrollBy(0, c10);
            }
        } else {
            this.f1278j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        boolean z10;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c10 = c(rect);
        if (c10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z9) {
                scrollBy(0, c10);
            } else {
                u(0, c10, false);
            }
        }
        return z10;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        VelocityTracker velocityTracker;
        if (z9 && (velocityTracker = this.f1279l) != null) {
            velocityTracker.recycle();
            this.f1279l = null;
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public final void requestLayout() {
        this.f1276h = true;
        super.requestLayout();
    }

    public final boolean s(int i10, int i11, int i12) {
        boolean z9;
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int height = getHeight();
        int scrollY = getScrollY();
        int i17 = height + scrollY;
        if (i14 == 33) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z13 = false;
        for (int i18 = 0; i18 < size; i18++) {
            View view2 = focusables.get(i18);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i15 < bottom && top < i16) {
                if (i15 >= top || bottom >= i16) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (view == null) {
                    view = view2;
                    z13 = z11;
                } else {
                    if ((!z9 || top >= view.getTop()) && (z9 || bottom <= view.getBottom())) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z13) {
                        if (z11) {
                            if (!z12) {
                            }
                        }
                    } else if (z11) {
                        view = view2;
                        z13 = true;
                    } else if (!z12) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i15 < scrollY || i16 > i17) {
            if (z9) {
                i13 = i15 - scrollY;
            } else {
                i13 = i16 - i17;
            }
            d(i13);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i14);
        }
        return z10;
    }

    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z9) {
        if (z9 != this.f1280m) {
            this.f1280m = z9;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z9) {
        m mVar = this.f1290y;
        if (mVar.f6711d) {
            View view = mVar.f6710c;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.i.z(view);
        }
        mVar.f6711d = z9;
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z9) {
        this.f1281n = z9;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i10) {
        return this.f1290y.g(i10, 0);
    }

    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float a10 = l0.d.a(edgeEffect) * ((float) getHeight());
        double log = Math.log((double) ((((float) Math.abs(-i10)) * 0.35f) / (this.f1269a * 0.015f)));
        double d10 = (double) A;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) (this.f1269a * 0.015f)))) < a10;
    }

    public final void u(int i10, int i11, boolean z9) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1270b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1272d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
                if (z9) {
                    this.f1290y.g(2, 1);
                } else {
                    w(1);
                }
                this.f1288v = getScrollY();
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.d.k(this);
            } else {
                if (!this.f1272d.isFinished()) {
                    this.f1272d.abortAnimation();
                    w(1);
                }
                scrollBy(i10, i11);
            }
            this.f1270b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z9;
        if (l0.d.a(this.f1273e) != 0.0f) {
            l0.d.b(this.f1273e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z9 = true;
        } else {
            z9 = false;
        }
        if (l0.d.a(this.f1274f) == 0.0f) {
            return z9;
        }
        l0.d.b(this.f1274f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void w(int i10) {
        this.f1290y.h(i10);
    }
}
