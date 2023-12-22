package j5;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import f0.e;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import n5.a;
import n5.f;
import w0.b;

public final class c {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public boolean D = true;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f8600a;

    /* renamed from: a0  reason: collision with root package name */
    public float f8601a0;

    /* renamed from: b  reason: collision with root package name */
    public float f8602b;

    /* renamed from: b0  reason: collision with root package name */
    public float f8603b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f8604c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f8605c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f8606d;

    /* renamed from: d0  reason: collision with root package name */
    public int f8607d0 = 1;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f8608e;

    /* renamed from: e0  reason: collision with root package name */
    public float f8609e0 = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f8610f = 16;

    /* renamed from: f0  reason: collision with root package name */
    public int f8611f0 = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f8612g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f8613h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f8614i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f8615j;
    public ColorStateList k;

    /* renamed from: l  reason: collision with root package name */
    public float f8616l;

    /* renamed from: m  reason: collision with root package name */
    public float f8617m;

    /* renamed from: n  reason: collision with root package name */
    public float f8618n;

    /* renamed from: o  reason: collision with root package name */
    public float f8619o;

    /* renamed from: p  reason: collision with root package name */
    public float f8620p;

    /* renamed from: q  reason: collision with root package name */
    public float f8621q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f8622r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f8623s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f8624t;
    public Typeface u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f8625v;
    public Typeface w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f8626x;

    /* renamed from: y  reason: collision with root package name */
    public a f8627y;

    /* renamed from: z  reason: collision with root package name */
    public TextUtils.TruncateAt f8628z = TextUtils.TruncateAt.END;

    public c(View view) {
        this.f8600a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f8606d = new Rect();
        this.f8604c = new Rect();
        this.f8608e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i11)) * f10) + (((float) Color.alpha(i10)) * f11)), Math.round((((float) Color.red(i11)) * f10) + (((float) Color.red(i10)) * f11)), Math.round((((float) Color.green(i11)) * f10) + (((float) Color.green(i10)) * f11)), Math.round((((float) Color.blue(i11)) * f10) + (((float) Color.blue(i10)) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = s4.a.f11855a;
        return com.ironsource.adapters.ironsource.a.e(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        e.d dVar;
        View view = this.f8600a;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        boolean z9 = true;
        if (y.e.d(view) != 1) {
            z9 = false;
        }
        if (!this.D) {
            return z9;
        }
        if (z9) {
            dVar = e.f6311d;
        } else {
            dVar = e.f6310c;
        }
        return dVar.b(charSequence, charSequence.length());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0113, code lost:
        if (r12.C != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(float r13, boolean r14) {
        /*
            r12 = this;
            java.lang.CharSequence r0 = r12.A
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.Rect r0 = r12.f8606d
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r12.f8604c
            int r1 = r1.width()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r13 - r2
            float r3 = java.lang.Math.abs(r3)
            r4 = 925353388(0x3727c5ac, float:1.0E-5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 >= 0) goto L_0x0026
            r3 = r5
            goto L_0x0027
        L_0x0026:
            r3 = r6
        L_0x0027:
            r7 = 0
            if (r3 == 0) goto L_0x0033
            float r13 = r12.f8614i
            float r14 = r12.V
            r12.F = r2
            android.graphics.Typeface r1 = r12.f8622r
            goto L_0x0073
        L_0x0033:
            float r3 = r12.f8613h
            float r8 = r12.W
            android.graphics.Typeface r9 = r12.u
            float r10 = r13 - r7
            float r10 = java.lang.Math.abs(r10)
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0045
            r4 = r5
            goto L_0x0046
        L_0x0045:
            r4 = r6
        L_0x0046:
            if (r4 == 0) goto L_0x004b
            r12.F = r2
            goto L_0x005a
        L_0x004b:
            float r4 = r12.f8613h
            float r10 = r12.f8614i
            android.animation.TimeInterpolator r11 = r12.Q
            float r13 = f(r4, r10, r13, r11)
            float r4 = r12.f8613h
            float r13 = r13 / r4
            r12.F = r13
        L_0x005a:
            float r13 = r12.f8614i
            float r4 = r12.f8613h
            float r13 = r13 / r4
            float r4 = r1 * r13
            if (r14 == 0) goto L_0x0064
            goto L_0x006f
        L_0x0064:
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x006f
            float r0 = r0 / r13
            float r13 = java.lang.Math.min(r0, r1)
            r0 = r13
            goto L_0x0070
        L_0x006f:
            r0 = r1
        L_0x0070:
            r13 = r3
            r14 = r8
            r1 = r9
        L_0x0073:
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c7
            float r3 = r12.G
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x007f
            r3 = r5
            goto L_0x0080
        L_0x007f:
            r3 = r6
        L_0x0080:
            float r4 = r12.X
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0088
            r4 = r5
            goto L_0x0089
        L_0x0088:
            r4 = r6
        L_0x0089:
            android.graphics.Typeface r8 = r12.f8626x
            if (r8 == r1) goto L_0x008f
            r8 = r5
            goto L_0x0090
        L_0x008f:
            r8 = r6
        L_0x0090:
            android.text.StaticLayout r9 = r12.Y
            if (r9 == 0) goto L_0x009f
            int r9 = r9.getWidth()
            float r9 = (float) r9
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x009f
            r9 = r5
            goto L_0x00a0
        L_0x009f:
            r9 = r6
        L_0x00a0:
            if (r3 != 0) goto L_0x00af
            if (r4 != 0) goto L_0x00af
            if (r9 != 0) goto L_0x00af
            if (r8 != 0) goto L_0x00af
            boolean r3 = r12.M
            if (r3 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r3 = r6
            goto L_0x00b0
        L_0x00af:
            r3 = r5
        L_0x00b0:
            r12.G = r13
            r12.X = r14
            r12.f8626x = r1
            r12.M = r6
            android.text.TextPaint r13 = r12.N
            float r14 = r12.F
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x00c2
            r14 = r5
            goto L_0x00c3
        L_0x00c2:
            r14 = r6
        L_0x00c3:
            r13.setLinearText(r14)
            goto L_0x00c8
        L_0x00c7:
            r3 = r6
        L_0x00c8:
            java.lang.CharSequence r13 = r12.B
            if (r13 == 0) goto L_0x00ce
            if (r3 == 0) goto L_0x015b
        L_0x00ce:
            android.text.TextPaint r13 = r12.N
            float r14 = r12.G
            r13.setTextSize(r14)
            android.text.TextPaint r13 = r12.N
            android.graphics.Typeface r14 = r12.f8626x
            r13.setTypeface(r14)
            android.text.TextPaint r13 = r12.N
            float r14 = r12.X
            r13.setLetterSpacing(r14)
            java.lang.CharSequence r13 = r12.A
            boolean r13 = r12.b(r13)
            r12.C = r13
            int r14 = r12.f8607d0
            if (r14 <= r5) goto L_0x00f4
            if (r13 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r1 = r5
            goto L_0x00f5
        L_0x00f4:
            r1 = r6
        L_0x00f5:
            if (r1 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r14 = r5
        L_0x00f9:
            r1 = 0
            if (r14 != r5) goto L_0x00ff
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ a -> 0x0142 }
            goto L_0x011d
        L_0x00ff:
            int r2 = r12.f8610f     // Catch:{ a -> 0x0142 }
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r13)     // Catch:{ a -> 0x0142 }
            r2 = r2 & 7
            if (r2 == r5) goto L_0x011b
            r3 = 5
            if (r2 == r3) goto L_0x0111
            boolean r2 = r12.C     // Catch:{ a -> 0x0142 }
            if (r2 == 0) goto L_0x0115
            goto L_0x0118
        L_0x0111:
            boolean r2 = r12.C     // Catch:{ a -> 0x0142 }
            if (r2 == 0) goto L_0x0118
        L_0x0115:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ a -> 0x0142 }
            goto L_0x011d
        L_0x0118:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ a -> 0x0142 }
            goto L_0x011d
        L_0x011b:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ a -> 0x0142 }
        L_0x011d:
            java.lang.CharSequence r3 = r12.A     // Catch:{ a -> 0x0142 }
            android.text.TextPaint r4 = r12.N     // Catch:{ a -> 0x0142 }
            int r0 = (int) r0     // Catch:{ a -> 0x0142 }
            j5.o r5 = new j5.o     // Catch:{ a -> 0x0142 }
            r5.<init>(r3, r4, r0)     // Catch:{ a -> 0x0142 }
            android.text.TextUtils$TruncateAt r0 = r12.f8628z     // Catch:{ a -> 0x0142 }
            r5.f8698l = r0     // Catch:{ a -> 0x0142 }
            r5.k = r13     // Catch:{ a -> 0x0142 }
            r5.f8692e = r2     // Catch:{ a -> 0x0142 }
            r5.f8697j = r6     // Catch:{ a -> 0x0142 }
            r5.f8693f = r14     // Catch:{ a -> 0x0142 }
            float r13 = r12.f8609e0     // Catch:{ a -> 0x0142 }
            r5.f8694g = r7     // Catch:{ a -> 0x0142 }
            r5.f8695h = r13     // Catch:{ a -> 0x0142 }
            int r13 = r12.f8611f0     // Catch:{ a -> 0x0142 }
            r5.f8696i = r13     // Catch:{ a -> 0x0142 }
            android.text.StaticLayout r1 = r5.a()     // Catch:{ a -> 0x0142 }
            goto L_0x0150
        L_0x0142:
            r13 = move-exception
            java.lang.Throwable r14 = r13.getCause()
            java.lang.String r14 = r14.getMessage()
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r14, r13)
        L_0x0150:
            r1.getClass()
            r12.Y = r1
            java.lang.CharSequence r13 = r1.getText()
            r12.B = r13
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.c.c(float, boolean):void");
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f8614i);
        textPaint.setTypeface(this.f8622r);
        textPaint.setLetterSpacing(this.V);
        return -this.O.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f8624t;
            if (typeface != null) {
                this.f8623s = f.a(configuration, typeface);
            }
            Typeface typeface2 = this.w;
            if (typeface2 != null) {
                this.f8625v = f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f8623s;
            if (typeface3 == null) {
                typeface3 = this.f8624t;
            }
            this.f8622r = typeface3;
            Typeface typeface4 = this.f8625v;
            if (typeface4 == null) {
                typeface4 = this.w;
            }
            this.u = typeface4;
            h(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r14) {
        /*
            r13 = this;
            android.view.View r0 = r13.f8600a
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0010
            android.view.View r0 = r13.f8600a
            int r0 = r0.getWidth()
            if (r0 > 0) goto L_0x0012
        L_0x0010:
            if (r14 == 0) goto L_0x022e
        L_0x0012:
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.c(r0, r14)
            java.lang.CharSequence r1 = r13.B
            if (r1 == 0) goto L_0x002e
            android.text.StaticLayout r2 = r13.Y
            if (r2 == 0) goto L_0x002e
            android.text.TextPaint r3 = r13.N
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r4 = r13.f8628z
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r3, r2, r4)
            r13.f8605c0 = r1
        L_0x002e:
            java.lang.CharSequence r1 = r13.f8605c0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0041
            android.text.TextPaint r4 = r13.N
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            r13.Z = r1
            goto L_0x0043
        L_0x0041:
            r13.Z = r3
        L_0x0043:
            int r1 = r13.f8612g
            boolean r4 = r13.C
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r4)
            r4 = r1 & 112(0x70, float:1.57E-43)
            r5 = 80
            r6 = 48
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x007d
            if (r4 == r5) goto L_0x006e
            android.text.TextPaint r4 = r13.N
            float r4 = r4.descent()
            android.text.TextPaint r8 = r13.N
            float r8 = r8.ascent()
            float r4 = r4 - r8
            float r4 = r4 / r7
            android.graphics.Rect r8 = r13.f8606d
            int r8 = r8.centerY()
            float r8 = (float) r8
            float r8 = r8 - r4
            goto L_0x007a
        L_0x006e:
            android.graphics.Rect r4 = r13.f8606d
            int r4 = r4.bottom
            float r4 = (float) r4
            android.text.TextPaint r8 = r13.N
            float r8 = r8.ascent()
            float r8 = r8 + r4
        L_0x007a:
            r13.f8617m = r8
            goto L_0x0084
        L_0x007d:
            android.graphics.Rect r4 = r13.f8606d
            int r4 = r4.top
            float r4 = (float) r4
            r13.f8617m = r4
        L_0x0084:
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r4
            r8 = 5
            r9 = 1
            if (r1 == r9) goto L_0x009c
            if (r1 == r8) goto L_0x0094
            android.graphics.Rect r1 = r13.f8606d
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x00a7
        L_0x0094:
            android.graphics.Rect r1 = r13.f8606d
            int r1 = r1.right
            float r1 = (float) r1
            float r10 = r13.Z
            goto L_0x00a6
        L_0x009c:
            android.graphics.Rect r1 = r13.f8606d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r10 = r13.Z
            float r10 = r10 / r7
        L_0x00a6:
            float r1 = r1 - r10
        L_0x00a7:
            r13.f8619o = r1
            r13.c(r3, r14)
            android.text.StaticLayout r14 = r13.Y
            if (r14 == 0) goto L_0x00b6
            int r14 = r14.getHeight()
            float r14 = (float) r14
            goto L_0x00b7
        L_0x00b6:
            r14 = r3
        L_0x00b7:
            android.text.StaticLayout r1 = r13.Y
            if (r1 == 0) goto L_0x00c5
            int r10 = r13.f8607d0
            if (r10 <= r9) goto L_0x00c5
            int r1 = r1.getWidth()
            float r1 = (float) r1
            goto L_0x00d5
        L_0x00c5:
            java.lang.CharSequence r1 = r13.B
            if (r1 == 0) goto L_0x00d4
            android.text.TextPaint r10 = r13.N
            int r11 = r1.length()
            float r1 = r10.measureText(r1, r2, r11)
            goto L_0x00d5
        L_0x00d4:
            r1 = r3
        L_0x00d5:
            android.text.StaticLayout r2 = r13.Y
            if (r2 == 0) goto L_0x00dc
            r2.getLineCount()
        L_0x00dc:
            int r2 = r13.f8610f
            boolean r10 = r13.C
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r10)
            r10 = r2 & 112(0x70, float:1.57E-43)
            if (r10 == r6) goto L_0x0104
            if (r10 == r5) goto L_0x00f6
            float r14 = r14 / r7
            android.graphics.Rect r5 = r13.f8604c
            int r5 = r5.centerY()
            float r5 = (float) r5
            float r5 = r5 - r14
            r13.f8616l = r5
            goto L_0x010b
        L_0x00f6:
            android.graphics.Rect r5 = r13.f8604c
            int r5 = r5.bottom
            float r5 = (float) r5
            float r5 = r5 - r14
            android.text.TextPaint r14 = r13.N
            float r14 = r14.descent()
            float r14 = r14 + r5
            goto L_0x0109
        L_0x0104:
            android.graphics.Rect r14 = r13.f8604c
            int r14 = r14.top
            float r14 = (float) r14
        L_0x0109:
            r13.f8616l = r14
        L_0x010b:
            r14 = r2 & r4
            if (r14 == r9) goto L_0x011d
            if (r14 == r8) goto L_0x0117
            android.graphics.Rect r14 = r13.f8604c
            int r14 = r14.left
            float r14 = (float) r14
            goto L_0x0126
        L_0x0117:
            android.graphics.Rect r14 = r13.f8604c
            int r14 = r14.right
            float r14 = (float) r14
            goto L_0x0125
        L_0x011d:
            android.graphics.Rect r14 = r13.f8604c
            int r14 = r14.centerX()
            float r14 = (float) r14
            float r1 = r1 / r7
        L_0x0125:
            float r14 = r14 - r1
        L_0x0126:
            r13.f8618n = r14
            android.graphics.Bitmap r14 = r13.E
            r1 = 0
            if (r14 == 0) goto L_0x0132
            r14.recycle()
            r13.E = r1
        L_0x0132:
            float r14 = r13.f8602b
            r13.l(r14)
            float r14 = r13.f8602b
            android.graphics.RectF r2 = r13.f8608e
            android.graphics.Rect r4 = r13.f8604c
            int r4 = r4.left
            float r4 = (float) r4
            android.graphics.Rect r5 = r13.f8606d
            int r5 = r5.left
            float r5 = (float) r5
            android.animation.TimeInterpolator r6 = r13.P
            float r4 = f(r4, r5, r14, r6)
            r2.left = r4
            android.graphics.RectF r2 = r13.f8608e
            float r4 = r13.f8616l
            float r5 = r13.f8617m
            android.animation.TimeInterpolator r6 = r13.P
            float r4 = f(r4, r5, r14, r6)
            r2.top = r4
            android.graphics.RectF r2 = r13.f8608e
            android.graphics.Rect r4 = r13.f8604c
            int r4 = r4.right
            float r4 = (float) r4
            android.graphics.Rect r5 = r13.f8606d
            int r5 = r5.right
            float r5 = (float) r5
            android.animation.TimeInterpolator r6 = r13.P
            float r4 = f(r4, r5, r14, r6)
            r2.right = r4
            android.graphics.RectF r2 = r13.f8608e
            android.graphics.Rect r4 = r13.f8604c
            int r4 = r4.bottom
            float r4 = (float) r4
            android.graphics.Rect r5 = r13.f8606d
            int r5 = r5.bottom
            float r5 = (float) r5
            android.animation.TimeInterpolator r6 = r13.P
            float r4 = f(r4, r5, r14, r6)
            r2.bottom = r4
            float r2 = r13.f8618n
            float r4 = r13.f8619o
            android.animation.TimeInterpolator r5 = r13.P
            float r2 = f(r2, r4, r14, r5)
            r13.f8620p = r2
            float r2 = r13.f8616l
            float r4 = r13.f8617m
            android.animation.TimeInterpolator r5 = r13.P
            float r2 = f(r2, r4, r14, r5)
            r13.f8621q = r2
            r13.l(r14)
            float r2 = r0 - r14
            w0.b r4 = s4.a.f11856b
            float r2 = f(r3, r0, r2, r4)
            float r2 = r0 - r2
            r13.f8601a0 = r2
            android.view.View r2 = r13.f8600a
            java.util.WeakHashMap<android.view.View, h0.l0> r5 = h0.y.f6776a
            h0.y.d.k(r2)
            float r0 = f(r0, r3, r14, r4)
            r13.f8603b0 = r0
            android.view.View r0 = r13.f8600a
            h0.y.d.k(r0)
            android.content.res.ColorStateList r0 = r13.k
            android.content.res.ColorStateList r2 = r13.f8615j
            if (r0 == r2) goto L_0x01d3
            android.text.TextPaint r0 = r13.N
            int r2 = r13.e(r2)
            android.content.res.ColorStateList r5 = r13.k
            int r5 = r13.e(r5)
            int r2 = a(r14, r2, r5)
            goto L_0x01dc
        L_0x01d3:
            android.text.TextPaint r2 = r13.N
            int r0 = r13.e(r0)
            r12 = r2
            r2 = r0
            r0 = r12
        L_0x01dc:
            r0.setColor(r2)
            float r0 = r13.V
            float r2 = r13.W
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x01f1
            android.text.TextPaint r5 = r13.N
            float r0 = f(r2, r0, r14, r4)
            r5.setLetterSpacing(r0)
            goto L_0x01f6
        L_0x01f1:
            android.text.TextPaint r2 = r13.N
            r2.setLetterSpacing(r0)
        L_0x01f6:
            float r0 = r13.R
            float r0 = f(r3, r0, r14, r1)
            r13.H = r0
            float r0 = r13.S
            float r0 = f(r3, r0, r14, r1)
            r13.I = r0
            float r0 = r13.T
            float r0 = f(r3, r0, r14, r1)
            r13.J = r0
            int r0 = r13.e(r1)
            android.content.res.ColorStateList r1 = r13.U
            int r1 = r13.e(r1)
            int r14 = a(r14, r0, r1)
            r13.K = r14
            android.text.TextPaint r0 = r13.N
            float r1 = r13.H
            float r2 = r13.I
            float r3 = r13.J
            r0.setShadowLayer(r1, r2, r3, r14)
            android.view.View r14 = r13.f8600a
            h0.y.d.k(r14)
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.c.h(boolean):void");
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k != colorStateList || this.f8615j != colorStateList) {
            this.k = colorStateList;
            this.f8615j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        a aVar = this.f8627y;
        if (aVar != null) {
            aVar.f10362d = true;
        }
        if (this.f8624t == typeface) {
            return false;
        }
        this.f8624t = typeface;
        Typeface a10 = f.a(this.f8600a.getContext().getResources().getConfiguration(), typeface);
        this.f8623s = a10;
        if (a10 == null) {
            a10 = this.f8624t;
        }
        this.f8622r = a10;
        return true;
    }

    public final void k(float f10) {
        int i10;
        TextPaint textPaint;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f8602b) {
            this.f8602b = f10;
            this.f8608e.left = f((float) this.f8604c.left, (float) this.f8606d.left, f10, this.P);
            this.f8608e.top = f(this.f8616l, this.f8617m, f10, this.P);
            this.f8608e.right = f((float) this.f8604c.right, (float) this.f8606d.right, f10, this.P);
            this.f8608e.bottom = f((float) this.f8604c.bottom, (float) this.f8606d.bottom, f10, this.P);
            this.f8620p = f(this.f8618n, this.f8619o, f10, this.P);
            this.f8621q = f(this.f8616l, this.f8617m, f10, this.P);
            l(f10);
            b bVar = s4.a.f11856b;
            this.f8601a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
            View view = this.f8600a;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.d.k(view);
            this.f8603b0 = f(1.0f, 0.0f, f10, bVar);
            y.d.k(this.f8600a);
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.f8615j;
            if (colorStateList != colorStateList2) {
                textPaint = this.N;
                i10 = a(f10, e(colorStateList2), e(this.k));
            } else {
                TextPaint textPaint2 = this.N;
                i10 = e(colorStateList);
                textPaint = textPaint2;
            }
            textPaint.setColor(i10);
            float f11 = this.V;
            float f12 = this.W;
            if (f11 != f12) {
                this.N.setLetterSpacing(f(f12, f11, f10, bVar));
            } else {
                this.N.setLetterSpacing(f11);
            }
            this.H = f(0.0f, this.R, f10, (TimeInterpolator) null);
            this.I = f(0.0f, this.S, f10, (TimeInterpolator) null);
            this.J = f(0.0f, this.T, f10, (TimeInterpolator) null);
            int a10 = a(f10, e((ColorStateList) null), e(this.U));
            this.K = a10;
            this.N.setShadowLayer(this.H, this.I, this.J, a10);
            y.d.k(this.f8600a);
        }
    }

    public final void l(float f10) {
        c(f10, false);
        View view = this.f8600a;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.k(view);
    }

    public final void m(Typeface typeface) {
        boolean z9;
        boolean j10 = j(typeface);
        if (this.w != typeface) {
            this.w = typeface;
            Typeface a10 = f.a(this.f8600a.getContext().getResources().getConfiguration(), typeface);
            this.f8625v = a10;
            if (a10 == null) {
                a10 = this.w;
            }
            this.u = a10;
            z9 = true;
        } else {
            z9 = false;
        }
        if (j10 || z9) {
            h(false);
        }
    }
}
