package com.ogaclejapan.smarttablayout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.viewpager.widget.ViewPager;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public class SmartTabLayout extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public final a f5779a;

    /* renamed from: b  reason: collision with root package name */
    public int f5780b;

    /* renamed from: c  reason: collision with root package name */
    public int f5781c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5782d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f5783e;

    /* renamed from: f  reason: collision with root package name */
    public float f5784f;

    /* renamed from: g  reason: collision with root package name */
    public int f5785g;

    /* renamed from: h  reason: collision with root package name */
    public int f5786h;

    /* renamed from: i  reason: collision with root package name */
    public ViewPager f5787i;

    /* renamed from: j  reason: collision with root package name */
    public ViewPager.h f5788j;
    public g k;

    /* renamed from: l  reason: collision with root package name */
    public a f5789l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5790m;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            for (int i10 = 0; i10 < SmartTabLayout.this.f5779a.getChildCount(); i10++) {
                if (view == SmartTabLayout.this.f5779a.getChildAt(i10)) {
                    SmartTabLayout.this.getClass();
                    SmartTabLayout.this.f5787i.setCurrentItem(i10);
                    return;
                }
            }
        }
    }

    public class b implements ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public int f5792a;

        public b() {
        }

        public final void a(int i10) {
            this.f5792a = i10;
            ViewPager.h hVar = SmartTabLayout.this.f5788j;
            if (hVar != null) {
                hVar.a(i10);
            }
        }

        public final void b(int i10) {
            boolean z9;
            if (this.f5792a == 0) {
                a aVar = SmartTabLayout.this.f5779a;
                aVar.u = i10;
                aVar.f5816v = 0.0f;
                if (aVar.f5815t != i10) {
                    aVar.f5815t = i10;
                }
                aVar.invalidate();
                SmartTabLayout.this.a(i10, 0.0f);
            }
            int childCount = SmartTabLayout.this.f5779a.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = SmartTabLayout.this.f5779a.getChildAt(i11);
                if (i10 == i11) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                childAt.setSelected(z9);
            }
            ViewPager.h hVar = SmartTabLayout.this.f5788j;
            if (hVar != null) {
                hVar.b(i10);
            }
        }

        public final void c(float f10, int i10, int i11) {
            int childCount = SmartTabLayout.this.f5779a.getChildCount();
            if (childCount != 0 && i10 >= 0 && i10 < childCount) {
                a aVar = SmartTabLayout.this.f5779a;
                aVar.u = i10;
                aVar.f5816v = f10;
                if (f10 == 0.0f && aVar.f5815t != i10) {
                    aVar.f5815t = i10;
                }
                aVar.invalidate();
                SmartTabLayout.this.a(i10, f10);
                ViewPager.h hVar = SmartTabLayout.this.f5788j;
                if (hVar != null) {
                    hVar.c(f10, i10, i11);
                }
            }
        }
    }

    public interface c {
        void onScrollChanged();
    }

    public interface d {
        void a();
    }

    public static class e implements g {

        /* renamed from: a  reason: collision with root package name */
        public final LayoutInflater f5794a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5795b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5796c;

        public e(Context context, int i10, int i11) {
            this.f5794a = LayoutInflater.from(context);
            this.f5795b = i10;
            this.f5796c = i11;
        }
    }

    public interface f {
    }

    public interface g {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SmartTabLayout(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.setHorizontalScrollBarEnabled(r3)
            android.content.res.Resources r4 = r16.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r5 = r4.density
            r6 = 2
            r7 = 1094713344(0x41400000, float:12.0)
            float r4 = android.util.TypedValue.applyDimension(r6, r7, r4)
            r7 = 1098907648(0x41800000, float:16.0)
            float r7 = r7 * r5
            int r7 = (int) r7
            r8 = 0
            float r8 = r8 * r5
            int r8 = (int) r8
            r9 = 1103101952(0x41c00000, float:24.0)
            float r5 = r5 * r9
            int r5 = (int) r5
            int[] r9 = y3.a.G
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r2, r9, r3, r3)
            r10 = 3
            r11 = -1
            int r10 = r9.getResourceId(r10, r11)
            r12 = 4
            r13 = 1
            boolean r12 = r9.getBoolean(r12, r13)
            r14 = 5
            android.content.res.ColorStateList r14 = r9.getColorStateList(r14)
            r15 = 8
            float r4 = r9.getDimension(r15, r4)
            r15 = 6
            int r7 = r9.getDimensionPixelSize(r15, r7)
            r15 = 7
            int r8 = r9.getDimensionPixelSize(r15, r8)
            int r15 = r9.getResourceId(r13, r11)
            int r6 = r9.getResourceId(r6, r11)
            r11 = 9
            boolean r11 = r9.getBoolean(r11, r3)
            boolean r3 = r9.getBoolean(r3, r13)
            r13 = 26
            int r5 = r9.getLayoutDimension(r13, r5)
            r9.recycle()
            r0.f5780b = r5
            r0.f5781c = r10
            r0.f5782d = r12
            if (r14 == 0) goto L_0x0074
            goto L_0x007a
        L_0x0074:
            r5 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r5)
        L_0x007a:
            r0.f5783e = r14
            r0.f5784f = r4
            r0.f5785g = r7
            r0.f5786h = r8
            r4 = 0
            if (r3 == 0) goto L_0x008a
            com.ogaclejapan.smarttablayout.SmartTabLayout$a r4 = new com.ogaclejapan.smarttablayout.SmartTabLayout$a
            r4.<init>()
        L_0x008a:
            r0.f5789l = r4
            r0.f5790m = r11
            r3 = -1
            if (r15 == r3) goto L_0x009c
            com.ogaclejapan.smarttablayout.SmartTabLayout$e r3 = new com.ogaclejapan.smarttablayout.SmartTabLayout$e
            android.content.Context r4 = r16.getContext()
            r3.<init>(r4, r15, r6)
            r0.k = r3
        L_0x009c:
            com.ogaclejapan.smarttablayout.a r3 = new com.ogaclejapan.smarttablayout.a
            r3.<init>(r1, r2)
            r0.f5779a = r3
            if (r11 == 0) goto L_0x00b2
            boolean r1 = r3.f5804h
            if (r1 != 0) goto L_0x00aa
            goto L_0x00b2
        L_0x00aa:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "'distributeEvenly' and 'indicatorAlwaysInCenter' both use does not support"
            r1.<init>(r2)
            throw r1
        L_0x00b2:
            boolean r1 = r3.f5804h
            r2 = 1
            r1 = r1 ^ r2
            r0.setFillViewport(r1)
            r1 = -1
            r0.addView(r3, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogaclejapan.smarttablayout.SmartTabLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(int i10, float f10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int childCount = this.f5779a.getChildCount();
        if (childCount != 0 && i10 >= 0 && i10 < childCount) {
            boolean g10 = e8.b.g(this);
            View childAt = this.f5779a.getChildAt(i10);
            int e10 = e8.b.e(childAt);
            if (childAt == null) {
                i11 = 0;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i11 = h0.g.b(marginLayoutParams) + h0.g.c(marginLayoutParams);
            }
            int i17 = (int) (((float) (i11 + e10)) * f10);
            a aVar = this.f5779a;
            if (aVar.f5804h) {
                if (0.0f < f10 && f10 < 1.0f) {
                    View childAt2 = aVar.getChildAt(i10 + 1);
                    i17 = Math.round(f10 * ((float) (e8.b.c(childAt2) + (e8.b.e(childAt2) / 2) + e8.b.b(childAt) + (e8.b.e(childAt) / 2))));
                }
                View childAt3 = this.f5779a.getChildAt(0);
                int e11 = e8.b.e(childAt3);
                if (g10) {
                    i15 = e8.b.b(childAt3) + e11;
                    i16 = e8.b.b(childAt) + e8.b.e(childAt);
                    i14 = (e8.b.a(childAt, false) - e8.b.b(childAt)) - i17;
                } else {
                    i15 = e8.b.c(childAt3) + e11;
                    i16 = e8.b.c(childAt) + e8.b.e(childAt);
                    i14 = (e8.b.d(childAt, false) - e8.b.c(childAt)) + i17;
                }
                scrollTo(i14 - ((i15 - i16) / 2), 0);
                return;
            }
            int i18 = this.f5780b;
            if (i18 == -1) {
                if (0.0f < f10 && f10 < 1.0f) {
                    View childAt4 = aVar.getChildAt(i10 + 1);
                    i17 = Math.round(f10 * ((float) (e8.b.c(childAt4) + (e8.b.e(childAt4) / 2) + e8.b.b(childAt) + (e8.b.e(childAt) / 2))));
                }
                int f11 = e8.b.f(childAt);
                if (g10) {
                    int width = (getWidth() / 2) + ((-f11) / 2);
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    i12 = width - y.e.f(this);
                } else {
                    int width2 = (f11 / 2) - (getWidth() / 2);
                    WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                    i12 = y.e.f(this) + width2;
                }
            } else if (g10) {
                if (i10 <= 0 && f10 <= 0.0f) {
                    i18 = 0;
                }
                i12 = i18;
            } else if (i10 > 0 || f10 > 0.0f) {
                i12 = -i18;
            } else {
                i12 = 0;
            }
            int d10 = e8.b.d(childAt, false);
            int c10 = e8.b.c(childAt);
            if (g10) {
                i13 = getPaddingRight() + getPaddingLeft() + (((d10 + c10) - i17) - getWidth()) + i12;
            } else {
                i13 = (d10 - c10) + i17 + i12;
            }
            scrollTo(i13, 0);
        }
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        ViewPager viewPager;
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9 && (viewPager = this.f5787i) != null) {
            a(viewPager.getCurrentItem(), 0.0f);
        }
    }

    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f5779a;
        if (aVar.f5804h && aVar.getChildCount() > 0) {
            View childAt = this.f5779a.getChildAt(0);
            a aVar2 = this.f5779a;
            View childAt2 = aVar2.getChildAt(aVar2.getChildCount() - 1);
            if (childAt == null) {
                i14 = 0;
            } else {
                i14 = childAt.getMeasuredWidth();
            }
            int c10 = ((i10 - i14) / 2) - e8.b.c(childAt);
            if (childAt2 == null) {
                i15 = 0;
            } else {
                i15 = childAt2.getMeasuredWidth();
            }
            int b10 = ((i10 - i15) / 2) - e8.b.b(childAt2);
            a aVar3 = this.f5779a;
            aVar3.setMinimumWidth(aVar3.getMeasuredWidth());
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.e.k(this, c10, paddingTop, b10, paddingBottom);
            setClipToPadding(false);
        }
    }

    public void setCustomTabColorizer(f fVar) {
        a aVar = this.f5779a;
        aVar.f5817x = fVar;
        aVar.invalidate();
    }

    public void setCustomTabView(g gVar) {
        this.k = gVar;
    }

    public void setDefaultTabTextColor(int i10) {
        this.f5783e = ColorStateList.valueOf(i10);
    }

    public void setDefaultTabTextColor(ColorStateList colorStateList) {
        this.f5783e = colorStateList;
    }

    public void setDistributeEvenly(boolean z9) {
        this.f5790m = z9;
    }

    public void setDividerColors(int... iArr) {
        a aVar = this.f5779a;
        aVar.f5817x = null;
        aVar.f5813r.f5819b = iArr;
        aVar.invalidate();
    }

    public void setIndicationInterpolator(e8.a aVar) {
        a aVar2 = this.f5779a;
        aVar2.w = aVar;
        aVar2.invalidate();
    }

    public void setOnPageChangeListener(ViewPager.h hVar) {
        this.f5788j = hVar;
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setOnTabClickListener(d dVar) {
    }

    public void setSelectedIndicatorColors(int... iArr) {
        a aVar = this.f5779a;
        aVar.f5817x = null;
        aVar.f5813r.f5818a = iArr;
        aVar.invalidate();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setViewPager(androidx.viewpager.widget.ViewPager r10) {
        /*
            r9 = this;
            com.ogaclejapan.smarttablayout.a r0 = r9.f5779a
            r0.removeAllViews()
            r9.f5787i = r10
            if (r10 == 0) goto L_0x0110
            j1.a r0 = r10.getAdapter()
            if (r0 == 0) goto L_0x0110
            com.ogaclejapan.smarttablayout.SmartTabLayout$b r0 = new com.ogaclejapan.smarttablayout.SmartTabLayout$b
            r1 = 0
            r0.<init>()
            java.util.ArrayList r2 = r10.Q
            if (r2 != 0) goto L_0x0020
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.Q = r2
        L_0x0020:
            java.util.ArrayList r10 = r10.Q
            r10.add(r0)
            androidx.viewpager.widget.ViewPager r10 = r9.f5787i
            j1.a r10 = r10.getAdapter()
            r0 = 0
            r2 = r0
        L_0x002d:
            int r3 = r10.b()
            if (r2 >= r3) goto L_0x0110
            com.ogaclejapan.smarttablayout.SmartTabLayout$g r3 = r9.k
            r4 = -1
            r5 = 1
            if (r3 != 0) goto L_0x009e
            r3 = r10
            g8.b r3 = (g8.b) r3
            g8.c r3 = r3.f6643f
            java.lang.Object r3 = r3.get(r2)
            g8.a r3 = (g8.a) r3
            java.lang.CharSequence r3 = r3.f6640a
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r7 = r9.getContext()
            r6.<init>(r7)
            r7 = 17
            r6.setGravity(r7)
            r6.setText(r3)
            android.content.res.ColorStateList r3 = r9.f5783e
            r6.setTextColor(r3)
            float r3 = r9.f5784f
            r6.setTextSize(r0, r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT_BOLD
            r6.setTypeface(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r3.<init>(r7, r4)
            r6.setLayoutParams(r3)
            int r3 = r9.f5781c
            if (r3 == r4) goto L_0x0074
            goto L_0x0089
        L_0x0074:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.Context r4 = r9.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r7 = 16843534(0x101030e, float:2.369575E-38)
            r4.resolveAttribute(r7, r3, r5)
            int r3 = r3.resourceId
        L_0x0089:
            r6.setBackgroundResource(r3)
            boolean r3 = r9.f5782d
            r6.setAllCaps(r3)
            int r3 = r9.f5785g
            r6.setPadding(r3, r0, r3, r0)
            int r3 = r9.f5786h
            if (r3 <= 0) goto L_0x00db
            r6.setMinWidth(r3)
            goto L_0x00db
        L_0x009e:
            com.ogaclejapan.smarttablayout.a r6 = r9.f5779a
            com.ogaclejapan.smarttablayout.SmartTabLayout$e r3 = (com.ogaclejapan.smarttablayout.SmartTabLayout.e) r3
            int r7 = r3.f5795b
            if (r7 == r4) goto L_0x00ad
            android.view.LayoutInflater r8 = r3.f5794a
            android.view.View r6 = r8.inflate(r7, r6, r0)
            goto L_0x00ae
        L_0x00ad:
            r6 = r1
        L_0x00ae:
            int r3 = r3.f5796c
            if (r3 == r4) goto L_0x00bb
            if (r6 == 0) goto L_0x00bb
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L_0x00bc
        L_0x00bb:
            r3 = r1
        L_0x00bc:
            if (r3 != 0) goto L_0x00c9
            java.lang.Class<android.widget.TextView> r4 = android.widget.TextView.class
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L_0x00c9
            r3 = r6
            android.widget.TextView r3 = (android.widget.TextView) r3
        L_0x00c9:
            if (r3 == 0) goto L_0x00db
            r4 = r10
            g8.b r4 = (g8.b) r4
            g8.c r4 = r4.f6643f
            java.lang.Object r4 = r4.get(r2)
            g8.a r4 = (g8.a) r4
            java.lang.CharSequence r4 = r4.f6640a
            r3.setText(r4)
        L_0x00db:
            if (r6 == 0) goto L_0x0108
            boolean r3 = r9.f5790m
            if (r3 == 0) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r3.width = r0
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.weight = r4
        L_0x00ed:
            com.ogaclejapan.smarttablayout.SmartTabLayout$a r3 = r9.f5789l
            if (r3 == 0) goto L_0x00f4
            r6.setOnClickListener(r3)
        L_0x00f4:
            com.ogaclejapan.smarttablayout.a r3 = r9.f5779a
            r3.addView(r6)
            androidx.viewpager.widget.ViewPager r3 = r9.f5787i
            int r3 = r3.getCurrentItem()
            if (r2 != r3) goto L_0x0104
            r6.setSelected(r5)
        L_0x0104:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "tabView is null."
            r10.<init>(r0)
            throw r10
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogaclejapan.smarttablayout.SmartTabLayout.setViewPager(androidx.viewpager.widget.ViewPager):void");
    }
}
