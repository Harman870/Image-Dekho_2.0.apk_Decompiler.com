package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.a;
import com.imgdkh.app.R;
import h0.l;
import h0.l0;
import h0.s0;
import h0.y;
import i0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t4.e;
import t4.i;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f2843x = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f2844a;

    /* renamed from: b  reason: collision with root package name */
    public int f2845b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f2846c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2847d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2848e;

    /* renamed from: f  reason: collision with root package name */
    public int f2849f = 0;

    /* renamed from: g  reason: collision with root package name */
    public s0 f2850g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2851h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2852i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2853j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public int f2854l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<View> f2855m;

    /* renamed from: n  reason: collision with root package name */
    public final ColorStateList f2856n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f2857o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f2858p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f2859q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final long f2860r;

    /* renamed from: s  reason: collision with root package name */
    public final TimeInterpolator f2861s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f2862t;
    public Drawable u;

    /* renamed from: v  reason: collision with root package name */
    public final float f2863v;
    public Behavior w;

    public static class BaseBehavior<T extends AppBarLayout> extends e<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f2864j;
        public int k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f2865l;

        /* renamed from: m  reason: collision with root package name */
        public b f2866m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f2867n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2868o;

        public class a extends h0.a {
            public a() {
            }

            public final void d(View view, f fVar) {
                this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
                fVar.k(BaseBehavior.this.f2868o);
                fVar.g(ScrollView.class.getName());
            }
        }

        public static class b extends n0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            public boolean f2870c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2871d;

            /* renamed from: e  reason: collision with root package name */
            public int f2872e;

            /* renamed from: f  reason: collision with root package name */
            public float f2873f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f2874g;

            public class a implements Parcelable.ClassLoaderCreator<b> {
                public final Object createFromParcel(Parcel parcel) {
                    return new b(parcel, (ClassLoader) null);
                }

                public final Object[] newArray(int i10) {
                    return new b[i10];
                }

                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z9 = true;
                this.f2870c = parcel.readByte() != 0;
                this.f2871d = parcel.readByte() != 0;
                this.f2872e = parcel.readInt();
                this.f2873f = parcel.readFloat();
                this.f2874g = parcel.readByte() == 0 ? false : z9;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f9479a, i10);
                parcel.writeByte(this.f2870c ? (byte) 1 : 0);
                parcel.writeByte(this.f2871d ? (byte) 1 : 0);
                parcel.writeInt(this.f2872e);
                parcel.writeFloat(this.f2873f);
                parcel.writeByte(this.f2874g ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static void C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (((double) view.getScrollY()) < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof l) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void I(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                r0 = 1
                if (r5 == 0) goto L_0x005e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f2877a
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005e
                java.util.WeakHashMap<android.view.View, h0.l0> r3 = h0.y.f6776a
                int r3 = h0.y.d.d(r5)
                if (r10 <= 0) goto L_0x004b
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x005e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
            L_0x005c:
                r9 = r0
                goto L_0x005f
            L_0x005e:
                r9 = r2
            L_0x005f:
                boolean r10 = r8.k
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = D(r7)
                boolean r9 = r8.e(r9)
            L_0x006b:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto L_0x00b3
                if (r9 == 0) goto L_0x00b6
                v.a r9 = r7.f1216b
                java.lang.Object r9 = r9.f12378b
                m.h r9 = (m.h) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r10 = r7.f1218d
                r10.clear()
                if (r9 == 0) goto L_0x008b
                java.util.ArrayList r10 = r7.f1218d
                r10.addAll(r9)
            L_0x008b:
                java.util.ArrayList r7 = r7.f1218d
                int r9 = r7.size()
                r10 = r2
            L_0x0092:
                if (r10 >= r9) goto L_0x00b1
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1235a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x00ae
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f12015f
                if (r7 == 0) goto L_0x00b1
                r2 = r0
                goto L_0x00b1
            L_0x00ae:
                int r10 = r10 + 1
                goto L_0x0092
            L_0x00b1:
                if (r2 == 0) goto L_0x00b6
            L_0x00b3:
                r8.jumpDrawablesToCurrentState()
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.I(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(x() - i10);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            int x9 = x();
            if (x9 == i10) {
                ValueAnimator valueAnimator = this.f2865l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2865l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f2865l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2865l = valueAnimator3;
                valueAnimator3.setInterpolator(s4.a.f11859e);
                this.f2865l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f2865l.setDuration((long) Math.min(round, 600));
            this.f2865l.setIntValues(new int[]{x9, i10});
            this.f2865l.start();
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    i12 = -appBarLayout.getTotalScrollRange();
                    i11 = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    i11 = 0;
                }
                int i13 = i12;
                int i14 = i11;
                if (i13 != i14) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i10, i13, i14);
                }
            }
            if (appBarLayout.k) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public final b F(Parcelable parcelable, T t10) {
            boolean z9;
            boolean z10;
            int s10 = s();
            int childCount = t10.getChildCount();
            boolean z11 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 > 0 || bottom < 0) {
                    i10++;
                } else {
                    if (parcelable == null) {
                        parcelable = n0.a.f9478b;
                    }
                    b bVar = new b(parcelable);
                    if (s10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bVar.f2871d = z9;
                    if (z9 || (-s10) < t10.getTotalScrollRange()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    bVar.f2870c = z10;
                    bVar.f2872e = i10;
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    if (bottom == t10.getTopInset() + y.d.d(childAt)) {
                        z11 = true;
                    }
                    bVar.f2874g = z11;
                    bVar.f2873f = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t10) {
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int x9 = x() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                z9 = true;
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t10.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.f2877a & 32) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i11 = -x9;
                if (top <= i11 && bottom >= i11) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i12 = cVar2.f2877a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, l0> weakHashMap = y.f6776a;
                        if (y.d.b(t10) && y.d.b(childAt2)) {
                            i13 -= t10.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                        i14 += y.d.d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            WeakHashMap<View, l0> weakHashMap3 = y.f6776a;
                            int d10 = y.d.d(childAt2) + i14;
                            if (x9 < d10) {
                                i13 = d10;
                            } else {
                                i14 = d10;
                            }
                        }
                    }
                    if ((i12 & 32) != 32) {
                        z9 = false;
                    }
                    if (z9) {
                        i13 += cVar2.topMargin;
                        i14 -= cVar2.bottomMargin;
                    }
                    if (x9 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    B(coordinatorLayout, t10, z5.c.e(i13 + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public final void H(CoordinatorLayout coordinatorLayout, T t10) {
            View view;
            boolean z9;
            boolean z10;
            boolean z11;
            y.k(coordinatorLayout, f.a.f7097h.a());
            boolean z12 = false;
            y.h(coordinatorLayout, 0);
            y.k(coordinatorLayout, f.a.f7098i.a());
            y.h(coordinatorLayout, 0);
            if (t10.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                int i10 = 0;
                while (true) {
                    view = null;
                    if (i10 >= childCount) {
                        break;
                    }
                    view = coordinatorLayout.getChildAt(i10);
                    if (((CoordinatorLayout.f) view.getLayoutParams()).f1235a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i10++;
                }
                View view2 = view;
                if (view2 != null) {
                    int childCount2 = t10.getChildCount();
                    int i11 = 0;
                    while (true) {
                        z9 = true;
                        if (i11 >= childCount2) {
                            z10 = false;
                            break;
                        } else if (((c) t10.getChildAt(i11).getLayoutParams()).f2877a != 0) {
                            z10 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (z10) {
                        if (y.d(coordinatorLayout) != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            y.n(coordinatorLayout, new a());
                        }
                        if (x() != (-t10.getTotalScrollRange())) {
                            y.l(coordinatorLayout, f.a.f7097h, new c(t10, false));
                            z12 = true;
                        }
                        if (x() != 0) {
                            if (view2.canScrollVertically(-1)) {
                                int i12 = -t10.getDownNestedPreScrollRange();
                                if (i12 != 0) {
                                    y.l(coordinatorLayout, f.a.f7098i, new b(this, coordinatorLayout, t10, view2, i12));
                                }
                            } else {
                                y.l(coordinatorLayout, f.a.f7098i, new c(t10, true));
                            }
                            this.f2868o = z9;
                        }
                        z9 = z12;
                        this.f2868o = z9;
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
            /*
                r4 = this;
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                super.h(r5, r6, r7)
                int r7 = r6.getPendingAction()
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r0 = r4.f2866m
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0054
                r3 = r7 & 8
                if (r3 != 0) goto L_0x0054
                boolean r7 = r0.f2870c
                if (r7 == 0) goto L_0x001d
                int r7 = r6.getTotalScrollRange()
                int r7 = -r7
                goto L_0x006c
            L_0x001d:
                boolean r7 = r0.f2871d
                if (r7 == 0) goto L_0x0022
                goto L_0x0079
            L_0x0022:
                int r7 = r0.f2872e
                android.view.View r7 = r6.getChildAt(r7)
                int r0 = r7.getBottom()
                int r0 = -r0
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r3 = r4.f2866m
                boolean r3 = r3.f2874g
                if (r3 == 0) goto L_0x0040
                java.util.WeakHashMap<android.view.View, h0.l0> r3 = h0.y.f6776a
                int r7 = h0.y.d.d(r7)
                int r3 = r6.getTopInset()
                int r3 = r3 + r7
                int r3 = r3 + r0
                goto L_0x0050
            L_0x0040:
                int r7 = r7.getHeight()
                float r7 = (float) r7
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r3 = r4.f2866m
                float r3 = r3.f2873f
                float r7 = r7 * r3
                int r7 = java.lang.Math.round(r7)
                int r3 = r7 + r0
            L_0x0050:
                r4.A(r5, r6, r3)
                goto L_0x007c
            L_0x0054:
                if (r7 == 0) goto L_0x007c
                r0 = r7 & 4
                if (r0 == 0) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x005c:
                r0 = r2
            L_0x005d:
                r3 = r7 & 2
                if (r3 == 0) goto L_0x0070
                int r7 = r6.getUpNestedPreScrollRange()
                int r7 = -r7
                if (r0 == 0) goto L_0x006c
                r4.B(r5, r6, r7)
                goto L_0x007c
            L_0x006c:
                r4.A(r5, r6, r7)
                goto L_0x007c
            L_0x0070:
                r7 = r7 & r1
                if (r7 == 0) goto L_0x007c
                if (r0 == 0) goto L_0x0079
                r4.B(r5, r6, r2)
                goto L_0x007c
            L_0x0079:
                r4.A(r5, r6, r2)
            L_0x007c:
                r6.f2849f = r2
                r7 = 0
                r4.f2866m = r7
                int r7 = r4.s()
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                int r7 = z5.c.e(r7, r0, r2)
                t4.h r0 = r4.f12016a
                if (r0 == 0) goto L_0x009c
                int r3 = r0.f12021d
                if (r3 == r7) goto L_0x009e
                r0.f12021d = r7
                r0.a()
                goto L_0x009e
            L_0x009c:
                r4.f12017b = r7
            L_0x009e:
                int r7 = r4.s()
                I(r5, r6, r7, r2, r1)
                int r7 = r4.s()
                r6.f2844a = r7
                boolean r7 = r6.willNotDraw()
                if (r7 != 0) goto L_0x00b6
                java.util.WeakHashMap<android.view.View, h0.l0> r7 = h0.y.f6776a
                h0.y.d.k(r6)
            L_0x00b6:
                r4.H(r5, r6)
                android.view.View r5 = D(r5)
                if (r5 == 0) goto L_0x00d6
                int r7 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r7 < r0) goto L_0x00ce
                t4.c r7 = new t4.c
                r7.<init>(r4, r5, r6)
                r5.addOnUnhandledKeyEventListener(r7)
                goto L_0x00d6
            L_0x00ce:
                t4.d r7 = new t4.d
                r7.<init>(r4, r5, r6)
                r5.setOnKeyListener(r7)
            L_0x00d6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
        }

        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout2, x() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                H(coordinatorLayout, appBarLayout);
            }
        }

        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                b bVar = this.f2866m;
                this.f2866m = (b) parcelable;
                return;
            }
            this.f2866m = null;
        }

        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b F = F(absSavedState, (AppBarLayout) view);
            if (F == null) {
                return absSavedState;
            }
            return F;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (r2 != false) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.k
                if (r5 != 0) goto L_0x002d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = r6
                goto L_0x0015
            L_0x0014:
                r5 = r0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = r6
                goto L_0x0029
            L_0x0028:
                r2 = r0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = r0
            L_0x002d:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f2865l
                if (r2 == 0) goto L_0x0036
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.f2867n = r2
                r1.k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i10 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.k) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f2867n = new WeakReference<>(view2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r2 = r2.get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean u(android.view.View r2) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                java.lang.ref.WeakReference<android.view.View> r2 = r1.f2867n
                if (r2 == 0) goto L_0x001e
                java.lang.Object r2 = r2.get()
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x001c
                boolean r0 = r2.isShown()
                if (r0 == 0) goto L_0x001c
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L_0x001c
                goto L_0x001e
            L_0x001c:
                r2 = 0
                goto L_0x001f
            L_0x001e:
                r2 = 1
            L_0x001f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(android.view.View):boolean");
        }

        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final int x() {
            return s() + this.f2864j;
        }

        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.k) {
                appBarLayout.d(appBarLayout.e(D(coordinatorLayout)));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x015f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r21
                r3 = r19
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                int r4 = r17.x()
                r5 = 0
                if (r2 == 0) goto L_0x0165
                if (r4 < r2) goto L_0x0165
                r6 = r22
                if (r4 > r6) goto L_0x0165
                int r2 = z5.c.e(r20, r21, r22)
                if (r4 == r2) goto L_0x0167
                boolean r6 = r3.f2848e
                if (r6 == 0) goto L_0x0092
                int r6 = java.lang.Math.abs(r2)
                int r7 = r3.getChildCount()
                r8 = r5
            L_0x002a:
                if (r8 >= r7) goto L_0x0092
                android.view.View r9 = r3.getChildAt(r8)
                android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r10 = (com.google.android.material.appbar.AppBarLayout.c) r10
                android.view.animation.Interpolator r11 = r10.f2879c
                int r12 = r9.getTop()
                if (r6 < r12) goto L_0x008f
                int r12 = r9.getBottom()
                if (r6 > r12) goto L_0x008f
                if (r11 == 0) goto L_0x0092
                int r7 = r10.f2877a
                r8 = r7 & 1
                if (r8 == 0) goto L_0x0063
                int r8 = r9.getHeight()
                int r12 = r10.topMargin
                int r8 = r8 + r12
                int r10 = r10.bottomMargin
                int r8 = r8 + r10
                int r8 = r8 + r5
                r7 = r7 & 2
                if (r7 == 0) goto L_0x0064
                java.util.WeakHashMap<android.view.View, h0.l0> r7 = h0.y.f6776a
                int r7 = h0.y.d.d(r9)
                int r8 = r8 - r7
                goto L_0x0064
            L_0x0063:
                r8 = r5
            L_0x0064:
                java.util.WeakHashMap<android.view.View, h0.l0> r7 = h0.y.f6776a
                boolean r7 = h0.y.d.b(r9)
                if (r7 == 0) goto L_0x0071
                int r7 = r3.getTopInset()
                int r8 = r8 - r7
            L_0x0071:
                if (r8 <= 0) goto L_0x0092
                int r7 = r9.getTop()
                int r6 = r6 - r7
                float r7 = (float) r8
                float r6 = (float) r6
                float r6 = r6 / r7
                float r6 = r11.getInterpolation(r6)
                float r6 = r6 * r7
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Integer.signum(r2)
                int r8 = r9.getTop()
                int r8 = r8 + r6
                int r8 = r8 * r7
                goto L_0x0093
            L_0x008f:
                int r8 = r8 + 1
                goto L_0x002a
            L_0x0092:
                r8 = r2
            L_0x0093:
                t4.h r6 = r0.f12016a
                r7 = 1
                if (r6 == 0) goto L_0x00a5
                int r9 = r6.f12021d
                if (r9 == r8) goto L_0x00a3
                r6.f12021d = r8
                r6.a()
                r6 = r7
                goto L_0x00a8
            L_0x00a3:
                r6 = r5
                goto L_0x00a8
            L_0x00a5:
                r0.f12017b = r8
                goto L_0x00a3
            L_0x00a8:
                int r9 = r4 - r2
                int r8 = r2 - r8
                r0.f2864j = r8
                if (r6 == 0) goto L_0x0143
                r8 = r5
            L_0x00b1:
                int r10 = r3.getChildCount()
                if (r8 >= r10) goto L_0x0143
                android.view.View r10 = r3.getChildAt(r8)
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r10 = (com.google.android.material.appbar.AppBarLayout.c) r10
                com.google.android.material.appbar.AppBarLayout$b r11 = r10.f2878b
                if (r11 == 0) goto L_0x013f
                int r10 = r10.f2877a
                r10 = r10 & r7
                if (r10 == 0) goto L_0x013f
                android.view.View r10 = r3.getChildAt(r8)
                int r12 = r17.s()
                float r12 = (float) r12
                android.graphics.Rect r13 = r11.f2875a
                r10.getDrawingRect(r13)
                r3.offsetDescendantRectToMyCoords(r10, r13)
                int r14 = r3.getTopInset()
                int r14 = -r14
                r13.offset(r5, r14)
                android.graphics.Rect r13 = r11.f2875a
                int r13 = r13.top
                float r13 = (float) r13
                float r12 = java.lang.Math.abs(r12)
                float r13 = r13 - r12
                r12 = 0
                int r14 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                if (r14 > 0) goto L_0x0136
                android.graphics.Rect r14 = r11.f2875a
                int r14 = r14.height()
                float r14 = (float) r14
                float r14 = r13 / r14
                float r14 = java.lang.Math.abs(r14)
                r15 = 1065353216(0x3f800000, float:1.0)
                int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                if (r16 >= 0) goto L_0x0106
                goto L_0x010d
            L_0x0106:
                int r12 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
                if (r12 <= 0) goto L_0x010c
                r12 = r15
                goto L_0x010d
            L_0x010c:
                r12 = r14
            L_0x010d:
                float r13 = -r13
                float r12 = r15 - r12
                float r12 = r12 * r12
                float r15 = r15 - r12
                android.graphics.Rect r12 = r11.f2875a
                int r12 = r12.height()
                float r12 = (float) r12
                r14 = 1050253722(0x3e99999a, float:0.3)
                float r12 = r12 * r14
                float r12 = r12 * r15
                float r13 = r13 - r12
                r10.setTranslationY(r13)
                android.graphics.Rect r12 = r11.f2876b
                r10.getDrawingRect(r12)
                android.graphics.Rect r12 = r11.f2876b
                float r13 = -r13
                int r13 = (int) r13
                r12.offset(r5, r13)
                android.graphics.Rect r11 = r11.f2876b
                java.util.WeakHashMap<android.view.View, h0.l0> r12 = h0.y.f6776a
                h0.y.f.c(r10, r11)
                goto L_0x013f
            L_0x0136:
                r11 = 0
                java.util.WeakHashMap<android.view.View, h0.l0> r13 = h0.y.f6776a
                h0.y.f.c(r10, r11)
                r10.setTranslationY(r12)
            L_0x013f:
                int r8 = r8 + 1
                goto L_0x00b1
            L_0x0143:
                if (r6 != 0) goto L_0x014c
                boolean r6 = r3.f2848e
                if (r6 == 0) goto L_0x014c
                r1.d(r3)
            L_0x014c:
                int r6 = r17.s()
                r3.f2844a = r6
                boolean r6 = r3.willNotDraw()
                if (r6 != 0) goto L_0x015d
                java.util.WeakHashMap<android.view.View, h0.l0> r6 = h0.y.f6776a
                h0.y.d.k(r3)
            L_0x015d:
                if (r2 >= r4) goto L_0x0160
                r7 = -1
            L_0x0160:
                I(r1, r3, r2, r7, r5)
                r5 = r9
                goto L_0x0167
            L_0x0165:
                r0.f2864j = r5
            L_0x0167:
                r0.H(r1, r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends t4.f {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.T);
            this.f12015f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i10;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1235a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f2864j + this.f12014e;
                if (this.f12015f == 0) {
                    i10 = 0;
                } else {
                    float v10 = v(view2);
                    int i11 = this.f12015f;
                    i10 = z5.c.e((int) (v10 * ((float) i11)), 0, i11);
                }
                int i12 = bottom - i10;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                view.offsetTopAndBottom(i12);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.k) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                y.k(coordinatorLayout, f.a.f7097h.a());
                y.h(coordinatorLayout, 0);
                y.k(coordinatorLayout, f.a.f7098i.a());
                y.h(coordinatorLayout, 0);
                y.n(coordinatorLayout, (h0.a) null);
            }
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout appBarLayout;
            ArrayList f10 = coordinatorLayout.f(view);
            int size = f10.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) f10.get(i10);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i10++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f12012c;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayout.c(false, !z9, true);
                    return true;
                }
            }
            return false;
        }

        public final AppBarLayout u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final float v(View view) {
            int i10;
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1235a;
                if (cVar instanceof BaseBehavior) {
                    i10 = ((BaseBehavior) cVar).x();
                } else {
                    i10 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) i10) / ((float) i11)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public final int w(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f2875a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2876b = new Rect();
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2877a = 1;

        /* renamed from: b  reason: collision with root package name */
        public b f2878b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f2879c;

        public c() {
            super(-1, -2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.w);
            this.f2877a = obtainStyledAttributes.getInt(1, 0);
            this.f2878b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f2879c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface d {
        void a();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r15, android.util.AttributeSet r16) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r2 = 2130903105(0x7f030041, float:1.7413019E38)
            r3 = 2132018009(0x7f140359, float:1.9674313E38)
            r4 = r15
            android.content.Context r3 = x5.a.a(r15, r0, r2, r3)
            r14.<init>(r3, r0, r2)
            r8 = -1
            r1.f2845b = r8
            r1.f2846c = r8
            r1.f2847d = r8
            r9 = 0
            r1.f2849f = r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2859q = r2
            android.content.Context r10 = r14.getContext()
            r11 = 1
            r14.setOrientation(r11)
            int r12 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r2 = r14.getOutlineProvider()
            android.view.ViewOutlineProvider r3 = android.view.ViewOutlineProvider.BACKGROUND
            if (r2 != r3) goto L_0x0039
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BOUNDS
            r14.setOutlineProvider(r2)
        L_0x0039:
            r6 = 2132018009(0x7f140359, float:1.9674313E38)
            android.content.Context r13 = r14.getContext()
            int[] r4 = t4.i.f12022a
            int[] r7 = new int[r9]
            r5 = 2130903105(0x7f030041, float:1.7413019E38)
            r2 = r13
            r3 = r16
            android.content.res.TypedArray r2 = j5.s.d(r2, r3, r4, r5, r6, r7)
            boolean r3 = r2.hasValue(r9)     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x005f
            int r3 = r2.getResourceId(r9, r9)     // Catch:{ all -> 0x0152 }
            android.animation.StateListAnimator r3 = android.animation.AnimatorInflater.loadStateListAnimator(r13, r3)     // Catch:{ all -> 0x0152 }
            r14.setStateListAnimator(r3)     // Catch:{ all -> 0x0152 }
        L_0x005f:
            r2.recycle()
            int[] r4 = c.a.f2364v
            r6 = 2132018009(0x7f140359, float:1.9674313E38)
            int[] r7 = new int[r9]
            r5 = 2130903105(0x7f030041, float:1.7413019E38)
            r2 = r10
            r3 = r16
            android.content.res.TypedArray r0 = j5.s.d(r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r9)
            java.util.WeakHashMap<android.view.View, h0.l0> r3 = h0.y.f6776a
            h0.y.d.q(r14, r2)
            r2 = 6
            android.content.res.ColorStateList r2 = n5.c.a(r10, r0, r2)
            r1.f2856n = r2
            android.graphics.drawable.Drawable r3 = r14.getBackground()
            boolean r3 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x00c6
            android.graphics.drawable.Drawable r3 = r14.getBackground()
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            r5.f r4 = new r5.f
            r4.<init>()
            int r3 = r3.getColor()
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r4.k(r3)
            if (r2 == 0) goto L_0x00b9
            boolean r3 = r1.f2853j
            if (r3 == 0) goto L_0x00aa
            r3 = 255(0xff, float:3.57E-43)
            goto L_0x00ab
        L_0x00aa:
            r3 = r9
        L_0x00ab:
            r4.setAlpha(r3)
            r4.k(r2)
            t4.a r2 = new t4.a
            r2.<init>(r14, r4)
            r1.f2858p = r2
            goto L_0x00c3
        L_0x00b9:
            r4.i(r10)
            h0.j0 r2 = new h0.j0
            r2.<init>(r14, r11, r4)
            r1.f2858p = r2
        L_0x00c3:
            h0.y.d.q(r14, r4)
        L_0x00c6:
            r2 = 2130903879(0x7f030347, float:1.7414588E38)
            android.content.res.Resources r3 = r14.getResources()
            r4 = 2131361794(0x7f0a0002, float:1.834335E38)
            int r3 = r3.getInteger(r4)
            int r2 = k5.a.c(r10, r2, r3)
            long r2 = (long) r2
            r1.f2860r = r2
            r2 = 2130903897(0x7f030359, float:1.7414625E38)
            android.view.animation.LinearInterpolator r3 = s4.a.f11855a
            android.animation.TimeInterpolator r2 = k5.a.d(r10, r2, r3)
            r1.f2861s = r2
            r2 = 4
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00f4
            boolean r2 = r0.getBoolean(r2, r9)
            r14.c(r2, r9, r9)
        L_0x00f4:
            r2 = 3
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x0103
            int r2 = r0.getDimensionPixelSize(r2, r9)
            float r2 = (float) r2
            t4.i.a(r14, r2)
        L_0x0103:
            r2 = 26
            if (r12 < r2) goto L_0x0122
            r2 = 2
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x0115
            boolean r2 = r0.getBoolean(r2, r9)
            r14.setKeyboardNavigationCluster(r2)
        L_0x0115:
            boolean r2 = r0.hasValue(r11)
            if (r2 == 0) goto L_0x0122
            boolean r2 = r0.getBoolean(r11, r9)
            r14.setTouchscreenBlocksFocus(r2)
        L_0x0122:
            android.content.res.Resources r2 = r14.getResources()
            r3 = 2131099748(0x7f060064, float:1.7811858E38)
            float r2 = r2.getDimension(r3)
            r1.f2863v = r2
            r2 = 5
            boolean r2 = r0.getBoolean(r2, r9)
            r1.k = r2
            r2 = 7
            int r2 = r0.getResourceId(r2, r8)
            r1.f2854l = r2
            r2 = 8
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r14.setStatusBarForeground(r2)
            r0.recycle()
            t4.b r0 = new t4.b
            r0.<init>(r14)
            h0.y.i.u(r14, r0)
            return
        L_0x0152:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static c a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void b() {
        BaseBehavior.b bVar;
        Behavior behavior = this.w;
        if (behavior == null || this.f2845b == -1 || this.f2849f != 0) {
            bVar = null;
        } else {
            bVar = behavior.F(n0.a.f9478b, this);
        }
        this.f2845b = -1;
        this.f2846c = -1;
        this.f2847d = -1;
        if (bVar != null) {
            Behavior behavior2 = this.w;
            if (behavior2.f2866m == null) {
                behavior2.f2866m = bVar;
            }
        }
    }

    public final void c(boolean z9, boolean z10, boolean z11) {
        int i10 = 0;
        int i11 = (z9 ? 1 : 2) | (z10 ? 4 : 0);
        if (z11) {
            i10 = 8;
        }
        this.f2849f = i11 | i10;
        requestLayout();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(boolean z9) {
        if (!(!this.f2851h) || this.f2853j == z9) {
            return false;
        }
        this.f2853j = z9;
        refreshDrawableState();
        if (!this.k || !(getBackground() instanceof r5.f)) {
            return true;
        }
        float f10 = 0.0f;
        if (this.f2856n != null) {
            float f11 = z9 ? 0.0f : 255.0f;
            if (z9) {
                f10 = 255.0f;
            }
            g(f11, f10);
            return true;
        }
        float f12 = z9 ? 0.0f : this.f2863v;
        if (z9) {
            f10 = this.f2863v;
        }
        g(f12, f10);
        return true;
    }

    public final void draw(Canvas canvas) {
        boolean z9;
        super.draw(canvas);
        if (this.u == null || getTopInset() <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f2844a));
            this.u.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.f2855m == null && (i10 = this.f2854l) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f2854l);
            }
            if (view2 != null) {
                this.f2855m = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f2855m;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        return !y.d.b(childAt);
    }

    public final void g(float f10, float f11) {
        ValueAnimator valueAnimator = this.f2857o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, f11});
        this.f2857o = ofFloat;
        ofFloat.setDuration(this.f2860r);
        this.f2857o.setInterpolator(this.f2861s);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f2858p;
        if (animatorUpdateListener != null) {
            this.f2857o.addUpdateListener(animatorUpdateListener);
        }
        this.f2857o.start();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.w = behavior;
        return behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f2846c
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x0069
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x001d
            goto L_0x0066
        L_0x001d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f2877a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0063
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x003f
            java.util.WeakHashMap<android.view.View, h0.l0> r4 = h0.y.f6776a
            int r4 = h0.y.d.d(r3)
        L_0x003d:
            int r4 = r4 + r7
            goto L_0x004e
        L_0x003f:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x004c
            java.util.WeakHashMap<android.view.View, h0.l0> r4 = h0.y.f6776a
            int r4 = h0.y.d.d(r3)
            int r4 = r5 - r4
            goto L_0x003d
        L_0x004c:
            int r4 = r7 + r5
        L_0x004e:
            if (r0 != 0) goto L_0x0061
            java.util.WeakHashMap<android.view.View, h0.l0> r6 = h0.y.f6776a
            boolean r3 = h0.y.d.b(r3)
            if (r3 == 0) goto L_0x0061
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0061:
            int r2 = r2 + r4
            goto L_0x0066
        L_0x0063:
            if (r2 <= 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0069:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f2846c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f2847d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = cVar.topMargin + cVar.bottomMargin + childAt.getMeasuredHeight();
                int i13 = cVar.f2877a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    i12 -= y.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f2847d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f2854l;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int d10 = y.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d10 = y.d.d(getChildAt(childCount - 1));
            } else {
                d10 = 0;
            }
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f2849f;
    }

    public Drawable getStatusBarForeground() {
        return this.u;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        s0 s0Var = this.f2850g;
        if (s0Var != null) {
            return s0Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f2845b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = cVar.f2877a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int i14 = measuredHeight + cVar.topMargin + cVar.bottomMargin + i12;
                if (i11 == 0) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    if (y.d.b(childAt)) {
                        i14 -= getTopInset();
                    }
                }
                i12 = i14;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                    i12 -= y.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f2845b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z5.c.q(this);
    }

    public final int[] onCreateDrawableState(int i10) {
        if (this.f2862t == null) {
            this.f2862t = new int[4];
        }
        int[] iArr = this.f2862t;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z9 = this.f2852i;
        iArr[0] = z9 ? R.attr.state_liftable : -2130904107;
        iArr[1] = (!z9 || !this.f2853j) ? -2130904108 : R.attr.state_lifted;
        iArr[2] = z9 ? R.attr.state_collapsible : -2130904103;
        iArr[3] = (!z9 || !this.f2853j) ? -2130904102 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f2855m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2855m = null;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        super.onLayout(z9, i10, i11, i12, i13);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        boolean z12 = true;
        if (y.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.f2848e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((c) getChildAt(i14).getLayoutParams()).f2879c != null) {
                this.f2848e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f2851h) {
            if (!this.k) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount3) {
                        z10 = false;
                        break;
                    }
                    int i16 = ((c) getChildAt(i15).getLayoutParams()).f2877a;
                    if ((i16 & 1) != 1 || (i16 & 10) == 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        z10 = true;
                        break;
                    }
                    i15++;
                }
                if (!z10) {
                    z12 = false;
                }
            }
            if (this.f2852i != z12) {
                this.f2852i = z12;
                refreshDrawableState();
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = z5.c.e(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof r5.f) {
            ((r5.f) background).j(f10);
        }
    }

    public void setExpanded(boolean z9) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        c(z9, y.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z9) {
        this.k = z9;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f2854l = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.f2855m;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2855m = null;
            return;
        }
        this.f2855m = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f2854l = i10;
        WeakReference<View> weakReference = this.f2855m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2855m = null;
    }

    public void setLiftableOverrideEnabled(boolean z9) {
        this.f2851h = z9;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z9;
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.u = drawable3;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                Drawable drawable4 = this.u;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                a.c.b(drawable4, y.e.d(this));
                Drawable drawable5 = this.u;
                if (getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawable5.setVisible(z9, false);
                this.u.setCallback(this);
            }
            if (this.u != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            y.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(e.a.a(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        i.a(this, f10);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m9generateDefaultLayoutParams() {
        return new c();
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m10generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
