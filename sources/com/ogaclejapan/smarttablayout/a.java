package com.ogaclejapan.smarttablayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import androidx.activity.e;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import e8.a;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final int f5797a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5798b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5799c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5800d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f5801e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f5802f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5803g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5804h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5805i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5806j;
    public final int k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5807l;

    /* renamed from: m  reason: collision with root package name */
    public final float f5808m;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f5809n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5810o;

    /* renamed from: p  reason: collision with root package name */
    public final Paint f5811p;

    /* renamed from: q  reason: collision with root package name */
    public final float f5812q;

    /* renamed from: r  reason: collision with root package name */
    public final C0072a f5813r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f5814s;

    /* renamed from: t  reason: collision with root package name */
    public int f5815t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public float f5816v;
    public e8.a w;

    /* renamed from: x  reason: collision with root package name */
    public SmartTabLayout.f f5817x;

    /* renamed from: com.ogaclejapan.smarttablayout.a$a  reason: collision with other inner class name */
    public static class C0072a implements SmartTabLayout.f {

        /* renamed from: a  reason: collision with root package name */
        public int[] f5818a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f5819b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context);
        int[] iArr;
        int i10;
        int[] iArr2;
        e8.a aVar;
        setWillNotDraw(false);
        float f10 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int i11 = typedValue.data;
        float f11 = 0.0f * f10;
        int b10 = b(i11, (byte) 38);
        int i12 = (int) f11;
        int b11 = b(i11, (byte) 38);
        int b12 = b(i11, (byte) 32);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y3.a.G);
        boolean z9 = obtainStyledAttributes.getBoolean(14, false);
        boolean z10 = obtainStyledAttributes.getBoolean(23, false);
        boolean z11 = obtainStyledAttributes.getBoolean(19, false);
        int i13 = obtainStyledAttributes.getInt(20, 0);
        int i14 = obtainStyledAttributes.getInt(18, 0);
        int i15 = i13;
        int color = obtainStyledAttributes.getColor(15, -13388315);
        int i16 = i14;
        int resourceId = obtainStyledAttributes.getResourceId(16, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(21, (int) (8.0f * f10));
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(22, -1);
        float dimension = obtainStyledAttributes.getDimension(17, f11);
        int color2 = obtainStyledAttributes.getColor(24, b10);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(25, i12);
        int color3 = obtainStyledAttributes.getColor(27, b11);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(28, (int) (2.0f * f10));
        int color4 = obtainStyledAttributes.getColor(10, b12);
        float f12 = dimension;
        int resourceId2 = obtainStyledAttributes.getResourceId(11, -1);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(12, (int) (f10 * 1.0f));
        boolean z12 = obtainStyledAttributes.getBoolean(13, false);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            i10 = 1;
            iArr = new int[]{color};
        } else {
            iArr = getResources().getIntArray(resourceId);
            i10 = 1;
        }
        if (resourceId2 == -1) {
            iArr2 = new int[i10];
            iArr2[0] = color4;
        } else {
            iArr2 = getResources().getIntArray(resourceId2);
        }
        C0072a aVar2 = new C0072a();
        this.f5813r = aVar2;
        aVar2.f5818a = iArr;
        aVar2.f5819b = iArr2;
        this.f5797a = dimensionPixelSize2;
        this.f5798b = color2;
        this.f5799c = dimensionPixelSize3;
        this.f5800d = color3;
        this.f5801e = new Paint(1);
        this.f5804h = z9;
        this.f5803g = z10;
        this.f5805i = z11;
        this.f5806j = dimensionPixelSize;
        this.k = layoutDimension;
        this.f5809n = new Paint(1);
        this.f5808m = f12;
        this.f5807l = i16;
        this.f5812q = 0.5f;
        Paint paint = new Paint(1);
        this.f5811p = paint;
        int i17 = dimensionPixelSize4;
        paint.setStrokeWidth((float) i17);
        this.f5810o = i17;
        this.f5814s = z12;
        if (i15 != 0) {
            int i18 = i15;
            if (i18 == 1) {
                aVar = e8.a.f6215b;
            } else {
                a.b bVar = e8.a.f6214a;
                throw new IllegalArgumentException(e.a("Unknown id: ", i18));
            }
        } else {
            aVar = e8.a.f6214a;
        }
        this.w = aVar;
    }

    public static int b(int i10, byte b10) {
        return Color.argb(b10, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r7 = r18
            int r8 = r17.getHeight()
            int r9 = r17.getWidth()
            int r10 = r17.getChildCount()
            com.ogaclejapan.smarttablayout.SmartTabLayout$f r1 = r0.f5817x
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            com.ogaclejapan.smarttablayout.a$a r1 = r0.f5813r
        L_0x0017:
            r11 = r1
            boolean r12 = e8.b.g(r17)
            boolean r1 = r0.f5805i
            r13 = 0
            if (r1 == 0) goto L_0x0055
            int r1 = r0.f5797a
            if (r1 > 0) goto L_0x0026
            goto L_0x003a
        L_0x0026:
            android.graphics.Paint r1 = r0.f5801e
            int r2 = r0.f5798b
            r1.setColor(r2)
            float r2 = (float) r13
            r3 = 0
            float r4 = (float) r9
            int r1 = r0.f5797a
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f5801e
            r1 = r18
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x003a:
            int r1 = r0.f5799c
            if (r1 > 0) goto L_0x003f
            goto L_0x0055
        L_0x003f:
            android.graphics.Paint r1 = r0.f5801e
            int r2 = r0.f5800d
            r1.setColor(r2)
            float r2 = (float) r13
            int r1 = r0.f5799c
            int r1 = r8 - r1
            float r3 = (float) r1
            float r4 = (float) r9
            float r5 = (float) r8
            android.graphics.Paint r6 = r0.f5801e
            r1 = r18
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x0055:
            r15 = -1
            r6 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r10 <= 0) goto L_0x0180
            int r1 = r0.u
            android.view.View r1 = r0.getChildAt(r1)
            boolean r2 = r0.f5803g
            int r2 = e8.b.d(r1, r2)
            boolean r3 = r0.f5803g
            int r1 = e8.b.a(r1, r3)
            if (r12 == 0) goto L_0x0074
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x0074:
            int r3 = r0.u
            com.ogaclejapan.smarttablayout.a$a r11 = (com.ogaclejapan.smarttablayout.a.C0072a) r11
            int[] r4 = r11.f5818a
            int r13 = r4.length
            int r13 = r3 % r13
            r4 = r4[r13]
            int r13 = r0.f5806j
            float r13 = (float) r13
            float r14 = r0.f5816v
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            r6 = 1
            if (r14 <= 0) goto L_0x0122
            int r14 = r17.getChildCount()
            int r14 = r14 + r15
            if (r3 >= r14) goto L_0x0122
            int r3 = r0.u
            int r3 = r3 + r6
            int[] r11 = r11.f5818a
            int r14 = r11.length
            int r3 = r3 % r14
            r3 = r11[r3]
            if (r4 == r3) goto L_0x00cd
            float r11 = r0.f5816v
            float r14 = r5 - r11
            int r15 = android.graphics.Color.red(r3)
            float r15 = (float) r15
            float r15 = r15 * r11
            int r5 = android.graphics.Color.red(r4)
            float r5 = (float) r5
            float r5 = r5 * r14
            float r5 = r5 + r15
            int r15 = android.graphics.Color.green(r3)
            float r15 = (float) r15
            float r15 = r15 * r11
            int r6 = android.graphics.Color.green(r4)
            float r6 = (float) r6
            float r6 = r6 * r14
            float r6 = r6 + r15
            int r3 = android.graphics.Color.blue(r3)
            float r3 = (float) r3
            float r3 = r3 * r11
            int r4 = android.graphics.Color.blue(r4)
            float r4 = (float) r4
            float r4 = r4 * r14
            float r4 = r4 + r3
            int r3 = (int) r5
            int r5 = (int) r6
            int r4 = (int) r4
            int r4 = android.graphics.Color.rgb(r3, r5, r4)
        L_0x00cd:
            e8.a r3 = r0.w
            float r5 = r0.f5816v
            float r3 = r3.a(r5)
            e8.a r5 = r0.w
            float r6 = r0.f5816v
            float r5 = r5.b(r6)
            e8.a r6 = r0.w
            float r11 = r0.f5816v
            float r6 = r6.c(r11)
            int r11 = r0.u
            r14 = 1
            int r11 = r11 + r14
            android.view.View r11 = r0.getChildAt(r11)
            boolean r14 = r0.f5803g
            int r14 = e8.b.d(r11, r14)
            boolean r15 = r0.f5803g
            int r11 = e8.b.a(r11, r15)
            if (r12 == 0) goto L_0x010e
            float r11 = (float) r11
            float r11 = r11 * r5
            r12 = 1065353216(0x3f800000, float:1.0)
            float r5 = r12 - r5
            float r2 = (float) r2
            float r5 = r5 * r2
            float r5 = r5 + r11
            int r2 = (int) r5
            float r5 = (float) r14
            float r5 = r5 * r3
            float r3 = r12 - r3
            float r1 = (float) r1
            float r3 = r3 * r1
            float r3 = r3 + r5
            int r1 = (int) r3
            goto L_0x0120
        L_0x010e:
            r12 = 1065353216(0x3f800000, float:1.0)
            float r14 = (float) r14
            float r14 = r14 * r3
            float r3 = r12 - r3
            float r2 = (float) r2
            float r3 = r3 * r2
            float r3 = r3 + r14
            int r2 = (int) r3
            float r3 = (float) r11
            float r3 = r3 * r5
            float r5 = r12 - r5
            float r1 = (float) r1
            float r5 = r5 * r1
            float r5 = r5 + r3
            int r1 = (int) r5
        L_0x0120:
            float r13 = r13 * r6
            goto L_0x0123
        L_0x0122:
            r12 = r5
        L_0x0123:
            int r3 = r0.f5806j
            if (r3 <= 0) goto L_0x017e
            int r5 = r0.k
            if (r5 != 0) goto L_0x012c
            goto L_0x017e
        L_0x012c:
            int r5 = r0.f5807l
            r6 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r5 == r11) goto L_0x013b
            float r11 = (float) r8
            r14 = 2
            if (r5 == r14) goto L_0x013c
            float r3 = (float) r3
            float r3 = r3 / r6
            float r11 = r11 - r3
            goto L_0x013d
        L_0x013b:
            float r11 = (float) r3
        L_0x013c:
            float r11 = r11 / r6
        L_0x013d:
            float r13 = r13 / r6
            float r3 = r11 - r13
            float r11 = r11 + r13
            android.graphics.Paint r5 = r0.f5809n
            r5.setColor(r4)
            int r4 = r0.k
            r5 = -1
            if (r4 != r5) goto L_0x0153
            android.graphics.RectF r4 = r0.f5802f
            float r2 = (float) r2
            float r1 = (float) r1
            r4.set(r2, r3, r1, r11)
            goto L_0x0167
        L_0x0153:
            int r4 = r2 - r1
            int r4 = java.lang.Math.abs(r4)
            int r5 = r0.k
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 / r6
            android.graphics.RectF r5 = r0.f5802f
            float r2 = (float) r2
            float r2 = r2 + r4
            float r1 = (float) r1
            float r1 = r1 - r4
            r5.set(r2, r3, r1, r11)
        L_0x0167:
            float r1 = r0.f5808m
            r6 = 0
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0176
            android.graphics.RectF r2 = r0.f5802f
            android.graphics.Paint r3 = r0.f5809n
            r7.drawRoundRect(r2, r1, r1, r3)
            goto L_0x0181
        L_0x0176:
            android.graphics.RectF r1 = r0.f5802f
            android.graphics.Paint r2 = r0.f5809n
            r7.drawRect(r1, r2)
            goto L_0x0181
        L_0x017e:
            r6 = 0
            goto L_0x0181
        L_0x0180:
            r12 = r5
        L_0x0181:
            boolean r1 = r0.f5805i
            if (r1 != 0) goto L_0x01ca
            int r1 = r0.f5797a
            if (r1 > 0) goto L_0x018c
            r11 = r12
            r12 = r6
            goto L_0x01a4
        L_0x018c:
            android.graphics.Paint r1 = r0.f5801e
            int r2 = r0.f5798b
            r1.setColor(r2)
            r1 = 0
            float r2 = (float) r1
            r3 = 0
            float r4 = (float) r9
            int r1 = r0.f5797a
            float r5 = (float) r1
            android.graphics.Paint r9 = r0.f5801e
            r1 = r18
            r11 = r12
            r12 = r6
            r6 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x01a4:
            int r1 = r17.getWidth()
            int r2 = r0.f5799c
            if (r2 > 0) goto L_0x01ad
            goto L_0x01cc
        L_0x01ad:
            android.graphics.Paint r2 = r0.f5801e
            int r3 = r0.f5800d
            r2.setColor(r3)
            r2 = 0
            float r3 = (float) r2
            int r2 = r0.f5799c
            int r2 = r8 - r2
            float r4 = (float) r2
            float r5 = (float) r1
            float r6 = (float) r8
            android.graphics.Paint r9 = r0.f5801e
            r1 = r18
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x01cc
        L_0x01ca:
            r11 = r12
            r12 = r6
        L_0x01cc:
            int r1 = r0.f5810o
            if (r1 > 0) goto L_0x01d1
            goto L_0x0224
        L_0x01d1:
            float r1 = r0.f5812q
            float r1 = java.lang.Math.max(r12, r1)
            float r1 = java.lang.Math.min(r1, r11)
            float r2 = (float) r8
            float r1 = r1 * r2
            int r1 = (int) r1
            com.ogaclejapan.smarttablayout.SmartTabLayout$f r2 = r0.f5817x
            if (r2 == 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            com.ogaclejapan.smarttablayout.a$a r2 = r0.f5813r
        L_0x01e5:
            r9 = r2
            int r8 = r8 - r1
            r2 = 2
            int r8 = r8 / r2
            int r11 = r1 + r8
            boolean r12 = e8.b.g(r17)
            r13 = 0
            r14 = -1
        L_0x01f1:
            int r15 = r10 + -1
            if (r13 >= r15) goto L_0x0224
            android.view.View r1 = r0.getChildAt(r13)
            r15 = 0
            int r2 = e8.b.a(r1, r15)
            int r1 = e8.b.b(r1)
            if (r12 == 0) goto L_0x0206
            int r2 = r2 - r1
            goto L_0x0207
        L_0x0206:
            int r2 = r2 + r1
        L_0x0207:
            android.graphics.Paint r1 = r0.f5811p
            r3 = r9
            com.ogaclejapan.smarttablayout.a$a r3 = (com.ogaclejapan.smarttablayout.a.C0072a) r3
            int[] r3 = r3.f5819b
            int r4 = r3.length
            int r4 = r13 % r4
            r3 = r3[r4]
            r1.setColor(r3)
            float r4 = (float) r2
            float r3 = (float) r8
            float r5 = (float) r11
            android.graphics.Paint r6 = r0.f5811p
            r1 = r18
            r2 = r4
            r1.drawLine(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x01f1
        L_0x0224:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogaclejapan.smarttablayout.a.a(android.graphics.Canvas):void");
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f5814s) {
            a(canvas);
        }
    }

    public final void onDraw(Canvas canvas) {
        if (!this.f5814s) {
            a(canvas);
        }
    }
}
