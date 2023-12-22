package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.o0;
import com.google.android.material.internal.CheckableImageButton;
import com.imgdkh.app.R;
import g1.o;
import h0.l0;
import h0.y;
import j5.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n4.z;
import r5.f;
import r5.i;
import v5.q;
import v5.r;
import v5.s;
import v5.u;
import v5.y;
import y.a;

public class TextInputLayout extends LinearLayout {
    public static final int[][] M0 = {new int[]{16842919}, new int[0]};
    public boolean A;
    public int A0;
    public CharSequence B;
    public int B0;
    public boolean C;
    public int C0;
    public r5.f D;
    public int D0;
    public r5.f E;
    public int E0;
    public StateListDrawable F;
    public boolean F0;
    public boolean G;
    public final j5.c G0;
    public r5.f H;
    public boolean H0;
    public r5.f I;
    public boolean I0;
    public r5.i J;
    public ValueAnimator J0;
    public boolean K;
    public boolean K0;
    public final int L;
    public boolean L0;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public final RectF V = new RectF();
    public Typeface W;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f3332a;

    /* renamed from: b  reason: collision with root package name */
    public final y f3333b;

    /* renamed from: c  reason: collision with root package name */
    public final a f3334c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f3335d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f3336e;

    /* renamed from: f  reason: collision with root package name */
    public int f3337f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f3338g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3339h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f3340i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final r f3341j = new r(this);
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public int f3342l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3343m;

    /* renamed from: n  reason: collision with root package name */
    public f f3344n = new androidx.activity.e();

    /* renamed from: o  reason: collision with root package name */
    public i0 f3345o;

    /* renamed from: o0  reason: collision with root package name */
    public ColorDrawable f3346o0;

    /* renamed from: p  reason: collision with root package name */
    public int f3347p;
    public int p0;

    /* renamed from: q  reason: collision with root package name */
    public int f3348q;

    /* renamed from: q0  reason: collision with root package name */
    public final LinkedHashSet<g> f3349q0 = new LinkedHashSet<>();

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3350r;

    /* renamed from: r0  reason: collision with root package name */
    public ColorDrawable f3351r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3352s;

    /* renamed from: s0  reason: collision with root package name */
    public int f3353s0;

    /* renamed from: t  reason: collision with root package name */
    public i0 f3354t;

    /* renamed from: t0  reason: collision with root package name */
    public Drawable f3355t0;
    public ColorStateList u;
    public ColorStateList u0;

    /* renamed from: v  reason: collision with root package name */
    public int f3356v;

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f3357v0;
    public g1.d w;

    /* renamed from: w0  reason: collision with root package name */
    public int f3358w0;

    /* renamed from: x  reason: collision with root package name */
    public g1.d f3359x;

    /* renamed from: x0  reason: collision with root package name */
    public int f3360x0;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f3361y;

    /* renamed from: y0  reason: collision with root package name */
    public int f3362y0;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f3363z;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f3364z0;

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s(!textInputLayout.L0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.k) {
                textInputLayout2.m(editable);
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f3352s) {
                textInputLayout3.t(editable);
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            a aVar = TextInputLayout.this.f3334c;
            aVar.f3378g.performClick();
            aVar.f3378g.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            TextInputLayout.this.f3335d.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.G0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends h0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f3369d;

        public e(TextInputLayout textInputLayout) {
            this.f3369d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
            if (r2 != null) goto L_0x00a4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(android.view.View r14, i0.f r15) {
            /*
                r13 = this;
                android.view.View$AccessibilityDelegate r0 = r13.f6677a
                android.view.accessibility.AccessibilityNodeInfo r1 = r15.f7091a
                r0.onInitializeAccessibilityNodeInfo(r14, r1)
                com.google.android.material.textfield.TextInputLayout r14 = r13.f3369d
                android.widget.EditText r14 = r14.getEditText()
                if (r14 == 0) goto L_0x0014
                android.text.Editable r14 = r14.getText()
                goto L_0x0015
            L_0x0014:
                r14 = 0
            L_0x0015:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f3369d
                java.lang.CharSequence r0 = r0.getHint()
                com.google.android.material.textfield.TextInputLayout r1 = r13.f3369d
                java.lang.CharSequence r1 = r1.getError()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f3369d
                java.lang.CharSequence r2 = r2.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f3369d
                int r3 = r3.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f3369d
                java.lang.CharSequence r4 = r4.getCounterOverflowDescription()
                boolean r5 = android.text.TextUtils.isEmpty(r14)
                r6 = 1
                r5 = r5 ^ r6
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                r7 = r7 ^ r6
                com.google.android.material.textfield.TextInputLayout r8 = r13.f3369d
                boolean r8 = r8.F0
                r8 = r8 ^ r6
                boolean r9 = android.text.TextUtils.isEmpty(r1)
                r9 = r9 ^ r6
                if (r9 != 0) goto L_0x0053
                boolean r10 = android.text.TextUtils.isEmpty(r4)
                if (r10 != 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                r10 = 0
                goto L_0x0054
            L_0x0053:
                r10 = r6
            L_0x0054:
                if (r7 == 0) goto L_0x005b
                java.lang.String r0 = r0.toString()
                goto L_0x005d
            L_0x005b:
                java.lang.String r0 = ""
            L_0x005d:
                com.google.android.material.textfield.TextInputLayout r7 = r13.f3369d
                v5.y r7 = r7.f3333b
                androidx.appcompat.widget.i0 r11 = r7.f12609b
                int r11 = r11.getVisibility()
                if (r11 != 0) goto L_0x0073
                androidx.appcompat.widget.i0 r11 = r7.f12609b
                android.view.accessibility.AccessibilityNodeInfo r12 = r15.f7091a
                r12.setLabelFor(r11)
                androidx.appcompat.widget.i0 r7 = r7.f12609b
                goto L_0x0075
            L_0x0073:
                com.google.android.material.internal.CheckableImageButton r7 = r7.f12611d
            L_0x0075:
                android.view.accessibility.AccessibilityNodeInfo r11 = r15.f7091a
                r11.setTraversalAfter(r7)
                java.lang.String r7 = ", "
                if (r5 == 0) goto L_0x0082
                r15.l(r14)
                goto L_0x00a7
            L_0x0082:
                boolean r11 = android.text.TextUtils.isEmpty(r0)
                if (r11 != 0) goto L_0x00a2
                r15.l(r0)
                if (r8 == 0) goto L_0x00a7
                if (r2 == 0) goto L_0x00a7
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r0)
                r8.append(r7)
                r8.append(r2)
                java.lang.String r2 = r8.toString()
                goto L_0x00a4
            L_0x00a2:
                if (r2 == 0) goto L_0x00a7
            L_0x00a4:
                r15.l(r2)
            L_0x00a7:
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L_0x00dc
                int r2 = android.os.Build.VERSION.SDK_INT
                r8 = 26
                if (r2 < r8) goto L_0x00b7
                r15.j(r0)
                goto L_0x00ce
            L_0x00b7:
                if (r5 == 0) goto L_0x00cb
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r14)
                r11.append(r7)
                r11.append(r0)
                java.lang.String r0 = r11.toString()
            L_0x00cb:
                r15.l(r0)
            L_0x00ce:
                r0 = r5 ^ 1
                if (r2 < r8) goto L_0x00d8
                android.view.accessibility.AccessibilityNodeInfo r2 = r15.f7091a
                r2.setShowingHintText(r0)
                goto L_0x00dc
            L_0x00d8:
                r2 = 4
                r15.f(r2, r0)
            L_0x00dc:
                if (r14 == 0) goto L_0x00e5
                int r14 = r14.length()
                if (r14 != r3) goto L_0x00e5
                goto L_0x00e6
            L_0x00e5:
                r3 = -1
            L_0x00e6:
                android.view.accessibility.AccessibilityNodeInfo r14 = r15.f7091a
                r14.setMaxTextLength(r3)
                if (r10 == 0) goto L_0x00f6
                if (r9 == 0) goto L_0x00f0
                goto L_0x00f1
            L_0x00f0:
                r1 = r4
            L_0x00f1:
                android.view.accessibility.AccessibilityNodeInfo r14 = r15.f7091a
                r14.setError(r1)
            L_0x00f6:
                com.google.android.material.textfield.TextInputLayout r14 = r13.f3369d
                v5.r r14 = r14.f3341j
                androidx.appcompat.widget.i0 r14 = r14.f12586y
                if (r14 == 0) goto L_0x0103
                android.view.accessibility.AccessibilityNodeInfo r0 = r15.f7091a
                r0.setLabelFor(r14)
            L_0x0103:
                com.google.android.material.textfield.TextInputLayout r14 = r13.f3369d
                com.google.android.material.textfield.a r14 = r14.f3334c
                v5.p r14 = r14.b()
                r14.n(r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.d(android.view.View, i0.f):void");
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f3369d.f3334c.b().o(accessibilityEvent);
        }
    }

    public interface f {
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public interface h {
        void a();
    }

    public static class i extends n0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f3370c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3371d;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new i[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3370c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3371d = parcel.readInt() != 1 ? false : true;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("TextInputLayout.SavedState{");
            g10.append(Integer.toHexString(System.identityHashCode(this)));
            g10.append(" error=");
            g10.append(this.f3370c);
            g10.append("}");
            return g10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            TextUtils.writeToParcel(this.f3370c, parcel, i10);
            parcel.writeInt(this.f3371d ? 1 : 0);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = 2130904262(0x7f0304c6, float:1.7415365E38)
            r9 = 2132018019(0x7f140363, float:1.9674333E38)
            r1 = r19
            android.content.Context r1 = x5.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f3337f = r10
            r0.f3338g = r10
            r0.f3339h = r10
            r0.f3340i = r10
            v5.r r1 = new v5.r
            r1.<init>(r0)
            r0.f3341j = r1
            androidx.activity.e r1 = new androidx.activity.e
            r1.<init>()
            r0.f3344n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.T = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.U = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.V = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f3349q0 = r1
            j5.c r1 = new j5.c
            r1.<init>(r0)
            r0.G0 = r1
            android.content.Context r11 = r18.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r13 = 0
            r0.setWillNotDraw(r13)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r11)
            r0.f3332a = r14
            r14.setAddStatesFromChildren(r12)
            android.view.animation.LinearInterpolator r2 = s4.a.f11855a
            r1.Q = r2
            r1.h(r13)
            r1.P = r2
            r1.h(r13)
            int r2 = r1.f8612g
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x007e
            r1.f8612g = r3
            r1.h(r13)
        L_0x007e:
            int[] r15 = c.a.Z
            r6 = 5
            int[] r5 = new int[r6]
            r5 = {22, 20, 38, 43, 47} // fill-array
            j5.s.a(r11, r7, r8, r9)
            r4 = 2130904262(0x7f0304c6, float:1.7415365E38)
            r16 = 2132018019(0x7f140363, float:1.9674333E38)
            r1 = r11
            r2 = r20
            r3 = r15
            r17 = r5
            r5 = r16
            r13 = r6
            r6 = r17
            j5.s.b(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.i1 r1 = new androidx.appcompat.widget.i1
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r7, r15, r8, r9)
            r1.<init>(r11, r2)
            v5.y r3 = new v5.y
            r3.<init>(r0, r1)
            r0.f3333b = r3
            r4 = 46
            boolean r4 = r1.a(r4, r12)
            r0.A = r4
            r4 = 4
            java.lang.CharSequence r4 = r1.k(r4)
            r0.setHint((java.lang.CharSequence) r4)
            r4 = 45
            boolean r4 = r1.a(r4, r12)
            r0.I0 = r4
            r4 = 40
            boolean r4 = r1.a(r4, r12)
            r0.H0 = r4
            r4 = 6
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x00dc
            int r4 = r1.h(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00ea
        L_0x00dc:
            r4 = 3
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x00ea
            int r4 = r1.d(r4, r10)
            r0.setMinWidth(r4)
        L_0x00ea:
            boolean r4 = r1.l(r13)
            r5 = 2
            if (r4 == 0) goto L_0x00f9
            int r4 = r1.h(r13, r10)
            r0.setMaxEms(r4)
            goto L_0x0106
        L_0x00f9:
            boolean r4 = r1.l(r5)
            if (r4 == 0) goto L_0x0106
            int r4 = r1.d(r5, r10)
            r0.setMaxWidth(r4)
        L_0x0106:
            r5.i$a r4 = r5.i.b(r11, r7, r8, r9)
            r5.i r6 = new r5.i
            r6.<init>(r4)
            r0.J = r6
            android.content.res.Resources r4 = r11.getResources()
            r6 = 2131100393(0x7f0602e9, float:1.7813166E38)
            int r4 = r4.getDimensionPixelOffset(r6)
            r0.L = r4
            r4 = 9
            r6 = 0
            int r4 = r1.c(r4, r6)
            r0.N = r4
            r4 = 16
            android.content.res.Resources r6 = r11.getResources()
            r7 = 2131100394(0x7f0602ea, float:1.7813168E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r4 = r1.d(r4, r6)
            r0.P = r4
            r4 = 17
            android.content.res.Resources r6 = r11.getResources()
            r7 = 2131100395(0x7f0602eb, float:1.781317E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r4 = r1.d(r4, r6)
            r0.Q = r4
            int r4 = r0.P
            r0.O = r4
            r4 = 13
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r6)
            r7 = 12
            float r7 = r2.getDimension(r7, r6)
            r8 = 10
            float r8 = r2.getDimension(r8, r6)
            r9 = 11
            float r6 = r2.getDimension(r9, r6)
            r5.i r9 = r0.J
            r9.getClass()
            r5.i$a r13 = new r5.i$a
            r13.<init>(r9)
            r9 = 0
            int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r15 < 0) goto L_0x017d
            r13.e(r4)
        L_0x017d:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0184
            r13.f(r7)
        L_0x0184:
            int r4 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x018b
            r13.d(r8)
        L_0x018b:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0192
            r13.c(r6)
        L_0x0192:
            r5.i r4 = new r5.i
            r4.<init>(r13)
            r0.J = r4
            r4 = 7
            android.content.res.ColorStateList r4 = n5.c.b(r11, r1, r4)
            if (r4 == 0) goto L_0x01f6
            int r6 = r4.getDefaultColor()
            r0.A0 = r6
            r0.S = r6
            boolean r6 = r4.isStateful()
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r6 == 0) goto L_0x01d2
            int[] r6 = new int[r12]
            r8 = 0
            r6[r8] = r7
            int r6 = r4.getColorForState(r6, r10)
            r0.B0 = r6
            int[] r6 = new int[r5]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r4.getColorForState(r6, r10)
            r0.C0 = r6
            int[] r6 = new int[r5]
            r6 = {16843623, 16842910} // fill-array
            int r4 = r4.getColorForState(r6, r10)
            r8 = 0
            goto L_0x01f3
        L_0x01d2:
            int r4 = r0.A0
            r0.C0 = r4
            r4 = 2131034832(0x7f0502d0, float:1.7680193E38)
            android.content.res.ColorStateList r4 = y.a.b(r11, r4)
            int[] r6 = new int[r12]
            r8 = 0
            r6[r8] = r7
            int r6 = r4.getColorForState(r6, r10)
            r0.B0 = r6
            int[] r6 = new int[r12]
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r6[r8] = r7
            int r4 = r4.getColorForState(r6, r10)
        L_0x01f3:
            r0.D0 = r4
            goto L_0x0201
        L_0x01f6:
            r8 = 0
            r0.S = r8
            r0.A0 = r8
            r0.B0 = r8
            r0.C0 = r8
            r0.D0 = r8
        L_0x0201:
            boolean r4 = r1.l(r12)
            if (r4 == 0) goto L_0x020f
            android.content.res.ColorStateList r4 = r1.b(r12)
            r0.f3357v0 = r4
            r0.u0 = r4
        L_0x020f:
            r4 = 14
            android.content.res.ColorStateList r6 = n5.c.b(r11, r1, r4)
            r7 = 0
            int r2 = r2.getColor(r4, r7)
            r0.f3362y0 = r2
            r2 = 2131034859(0x7f0502eb, float:1.7680247E38)
            java.lang.Object r4 = y.a.f13006a
            int r2 = y.a.c.a(r11, r2)
            r0.f3358w0 = r2
            r2 = 2131034860(0x7f0502ec, float:1.768025E38)
            int r2 = y.a.c.a(r11, r2)
            r0.E0 = r2
            r2 = 2131034863(0x7f0502ef, float:1.7680256E38)
            int r2 = y.a.c.a(r11, r2)
            r0.f3360x0 = r2
            if (r6 == 0) goto L_0x023e
            r0.setBoxStrokeColorStateList(r6)
        L_0x023e:
            r2 = 15
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x024d
            android.content.res.ColorStateList r2 = n5.c.b(r11, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x024d:
            r2 = 47
            int r4 = r1.i(r2, r10)
            if (r4 == r10) goto L_0x025e
            r4 = 0
            int r2 = r1.i(r2, r4)
            r0.setHintTextAppearance(r2)
            goto L_0x025f
        L_0x025e:
            r4 = 0
        L_0x025f:
            r2 = 38
            int r2 = r1.i(r2, r4)
            r6 = 33
            java.lang.CharSequence r6 = r1.k(r6)
            r7 = 32
            int r7 = r1.h(r7, r12)
            r8 = 34
            boolean r8 = r1.a(r8, r4)
            r9 = 43
            int r9 = r1.i(r9, r4)
            r11 = 42
            boolean r11 = r1.a(r11, r4)
            r13 = 41
            java.lang.CharSequence r13 = r1.k(r13)
            r15 = 55
            int r15 = r1.i(r15, r4)
            r5 = 54
            java.lang.CharSequence r5 = r1.k(r5)
            r12 = 18
            boolean r12 = r1.a(r12, r4)
            r4 = 19
            int r4 = r1.h(r4, r10)
            r0.setCounterMaxLength(r4)
            r4 = 22
            r10 = 0
            int r4 = r1.i(r4, r10)
            r0.f3348q = r4
            r4 = 20
            int r4 = r1.i(r4, r10)
            r0.f3347p = r4
            r4 = 8
            int r4 = r1.h(r4, r10)
            r0.setBoxBackgroundMode(r4)
            r0.setErrorContentDescription(r6)
            r0.setErrorAccessibilityLiveRegion(r7)
            int r4 = r0.f3347p
            r0.setCounterOverflowTextAppearance(r4)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorTextAppearance(r2)
            int r2 = r0.f3348q
            r0.setCounterTextAppearance(r2)
            r0.setPlaceholderText(r5)
            r0.setPlaceholderTextAppearance(r15)
            r2 = 39
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x02e9
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setErrorTextColor(r2)
        L_0x02e9:
            r2 = 44
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x02f8
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHelperTextColor(r2)
        L_0x02f8:
            r2 = 48
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0307
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHintTextColor(r2)
        L_0x0307:
            r2 = 23
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0316
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterTextColor(r2)
        L_0x0316:
            r2 = 21
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0325
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x0325:
            r2 = 56
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0334
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x0334:
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0, r1)
            r0.f3334c = r2
            r4 = 1
            r5 = 0
            boolean r5 = r1.a(r5, r4)
            r1.n()
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            r1 = 2
            h0.y.d.s(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r1 < r6) goto L_0x0355
            if (r1 < r6) goto L_0x0355
            h0.y.k.l(r0, r4)
        L_0x0355:
            r14.addView(r3)
            r14.addView(r2)
            r0.addView(r14)
            r0.setEnabled(r5)
            r0.setHelperTextEnabled(r11)
            r0.setErrorEnabled(r8)
            r0.setCounterEnabled(r12)
            r0.setHelperText(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        boolean z9;
        int i10;
        EditText editText = this.f3335d;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                int t10 = c6.b.t(this.f3335d, R.attr.colorControlHighlight);
                int i11 = this.M;
                if (i11 == 2) {
                    Context context = getContext();
                    r5.f fVar = this.D;
                    int[][] iArr = M0;
                    TypedValue c10 = n5.b.c(context, "TextInputLayout", R.attr.colorSurface);
                    int i12 = c10.resourceId;
                    if (i12 != 0) {
                        Object obj = y.a.f13006a;
                        i10 = a.c.a(context, i12);
                    } else {
                        i10 = c10.data;
                    }
                    r5.f fVar2 = new r5.f(fVar.f11660a.f11681a);
                    int v10 = c6.b.v(0.1f, t10, i10);
                    fVar2.k(new ColorStateList(iArr, new int[]{v10, 0}));
                    fVar2.setTint(i10);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{v10, i10});
                    r5.f fVar3 = new r5.f(fVar.f11660a.f11681a);
                    fVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar2, fVar3), fVar});
                } else if (i11 != 1) {
                    return null;
                } else {
                    r5.f fVar4 = this.D;
                    int i13 = this.S;
                    return new RippleDrawable(new ColorStateList(M0, new int[]{c6.b.v(0.1f, t10, i13), i13}), fVar4, fVar4);
                }
            }
        }
        return this.D;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.F = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.F.addState(new int[0], f(false));
        }
        return this.F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.E == null) {
            this.E = f(true);
        }
        return this.E;
    }

    public static void j(ViewGroup viewGroup, boolean z9) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z9);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z9);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f3335d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f3335d = editText;
            int i10 = this.f3337f;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f3339h);
            }
            int i11 = this.f3338g;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f3340i);
            }
            this.G = false;
            h();
            setTextInputAccessibilityDelegate(new e(this));
            this.G0.m(this.f3335d.getTypeface());
            j5.c cVar = this.G0;
            float textSize = this.f3335d.getTextSize();
            if (cVar.f8613h != textSize) {
                cVar.f8613h = textSize;
                cVar.h(false);
            }
            j5.c cVar2 = this.G0;
            float letterSpacing = this.f3335d.getLetterSpacing();
            if (cVar2.W != letterSpacing) {
                cVar2.W = letterSpacing;
                cVar2.h(false);
            }
            int gravity = this.f3335d.getGravity();
            j5.c cVar3 = this.G0;
            int i12 = (gravity & -113) | 48;
            if (cVar3.f8612g != i12) {
                cVar3.f8612g = i12;
                cVar3.h(false);
            }
            j5.c cVar4 = this.G0;
            if (cVar4.f8610f != gravity) {
                cVar4.f8610f = gravity;
                cVar4.h(false);
            }
            this.f3335d.addTextChangedListener(new a());
            if (this.u0 == null) {
                this.u0 = this.f3335d.getHintTextColors();
            }
            if (this.A) {
                if (TextUtils.isEmpty(this.B)) {
                    CharSequence hint = this.f3335d.getHint();
                    this.f3336e = hint;
                    setHint(hint);
                    this.f3335d.setHint((CharSequence) null);
                }
                this.C = true;
            }
            if (this.f3345o != null) {
                m(this.f3335d.getText());
            }
            p();
            this.f3341j.b();
            this.f3333b.bringToFront();
            this.f3334c.bringToFront();
            Iterator<g> it = this.f3349q0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            this.f3334c.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.B)) {
            this.B = charSequence;
            j5.c cVar = this.G0;
            if (charSequence == null || !TextUtils.equals(cVar.A, charSequence)) {
                cVar.A = charSequence;
                cVar.B = null;
                Bitmap bitmap = cVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.E = null;
                }
                cVar.h(false);
            }
            if (!this.F0) {
                i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z9) {
        if (this.f3352s != z9) {
            if (z9) {
                i0 i0Var = this.f3354t;
                if (i0Var != null) {
                    this.f3332a.addView(i0Var);
                    this.f3354t.setVisibility(0);
                }
            } else {
                i0 i0Var2 = this.f3354t;
                if (i0Var2 != null) {
                    i0Var2.setVisibility(8);
                }
                this.f3354t = null;
            }
            this.f3352s = z9;
        }
    }

    public final void a(float f10) {
        if (this.G0.f8602b != f10) {
            if (this.J0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.J0 = valueAnimator;
                valueAnimator.setInterpolator(k5.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, s4.a.f11856b));
                this.J0.setDuration((long) k5.a.c(getContext(), R.attr.motionDurationMedium4, 167));
                this.J0.addUpdateListener(new d());
            }
            this.J0.setFloatValues(new float[]{this.G0.f8602b, f10});
            this.J0.start();
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f3332a.addView(view, layoutParams2);
            this.f3332a.setLayoutParams(layoutParams);
            r();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r7 = this;
            r5.f r0 = r7.D
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r5.f$b r1 = r0.f11660a
            r5.i r1 = r1.f11681a
            r5.i r2 = r7.J
            if (r1 == r2) goto L_0x0010
            r0.setShapeAppearanceModel(r2)
        L_0x0010:
            int r0 = r7.M
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0027
            int r0 = r7.O
            if (r0 <= r2) goto L_0x0022
            int r0 = r7.R
            if (r0 == 0) goto L_0x0022
            r0 = r4
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 == 0) goto L_0x0027
            r0 = r4
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            if (r0 == 0) goto L_0x004b
            r5.f r0 = r7.D
            int r1 = r7.O
            float r1 = (float) r1
            int r5 = r7.R
            r5.f$b r6 = r0.f11660a
            r6.k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            r5.f$b r5 = r0.f11660a
            android.content.res.ColorStateList r6 = r5.f11684d
            if (r6 == r1) goto L_0x004b
            r5.f11684d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L_0x004b:
            int r0 = r7.S
            int r1 = r7.M
            if (r1 != r4) goto L_0x0062
            r0 = 2130903344(0x7f030130, float:1.7413503E38)
            android.content.Context r1 = r7.getContext()
            int r0 = c6.b.s(r1, r0, r3)
            int r1 = r7.S
            int r0 = a0.a.b(r1, r0)
        L_0x0062:
            r7.S = r0
            r5.f r1 = r7.D
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.k(r0)
            r5.f r0 = r7.H
            if (r0 == 0) goto L_0x00a3
            r5.f r1 = r7.I
            if (r1 != 0) goto L_0x0076
            goto L_0x00a3
        L_0x0076:
            int r1 = r7.O
            if (r1 <= r2) goto L_0x007f
            int r1 = r7.R
            if (r1 == 0) goto L_0x007f
            r3 = r4
        L_0x007f:
            if (r3 == 0) goto L_0x00a0
            android.widget.EditText r1 = r7.f3335d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x008c
            int r1 = r7.f3358w0
            goto L_0x008e
        L_0x008c:
            int r1 = r7.R
        L_0x008e:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
            r5.f r0 = r7.I
            int r1 = r7.R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
        L_0x00a0:
            r7.invalidate()
        L_0x00a3:
            r7.q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float d10;
        if (!this.A) {
            return 0;
        }
        int i10 = this.M;
        if (i10 == 0) {
            d10 = this.G0.d();
        } else if (i10 != 2) {
            return 0;
        } else {
            d10 = this.G0.d() / 2.0f;
        }
        return (int) d10;
    }

    public final g1.d d() {
        g1.d dVar = new g1.d();
        dVar.f6506c = (long) k5.a.c(getContext(), R.attr.motionDurationShort2, 87);
        dVar.f6507d = k5.a.d(getContext(), R.attr.motionEasingLinearInterpolator, s4.a.f11855a);
        return dVar;
    }

    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f3335d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f3336e != null) {
            boolean z9 = this.C;
            this.C = false;
            CharSequence hint = editText.getHint();
            this.f3335d.setHint(this.f3336e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f3335d.setHint(hint);
                this.C = z9;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f3332a.getChildCount());
            for (int i11 = 0; i11 < this.f3332a.getChildCount(); i11++) {
                View childAt = this.f3332a.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f3335d) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.L0 = false;
    }

    public final void draw(Canvas canvas) {
        r5.f fVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        if (this.A) {
            j5.c cVar = this.G0;
            cVar.getClass();
            int save = canvas.save();
            if (cVar.B != null && cVar.f8608e.width() > 0.0f && cVar.f8608e.height() > 0.0f) {
                cVar.N.setTextSize(cVar.G);
                float f10 = cVar.f8620p;
                float f11 = cVar.f8621q;
                float f12 = cVar.F;
                if (f12 != 1.0f) {
                    canvas2.scale(f12, f12, f10, f11);
                }
                boolean z9 = true;
                if (cVar.f8607d0 <= 1 || cVar.C) {
                    z9 = false;
                }
                if (z9) {
                    float lineStart = cVar.f8620p - ((float) cVar.Y.getLineStart(0));
                    int alpha = cVar.N.getAlpha();
                    canvas2.translate(lineStart, f11);
                    float f13 = (float) alpha;
                    cVar.N.setAlpha((int) (cVar.f8603b0 * f13));
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        TextPaint textPaint = cVar.N;
                        float f14 = cVar.H;
                        float f15 = cVar.I;
                        float f16 = cVar.J;
                        int i11 = cVar.K;
                        textPaint.setShadowLayer(f14, f15, f16, a0.a.c(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                    }
                    cVar.Y.draw(canvas2);
                    cVar.N.setAlpha((int) (cVar.f8601a0 * f13));
                    if (i10 >= 31) {
                        TextPaint textPaint2 = cVar.N;
                        float f17 = cVar.H;
                        float f18 = cVar.I;
                        float f19 = cVar.J;
                        int i12 = cVar.K;
                        textPaint2.setShadowLayer(f17, f18, f19, a0.a.c(i12, (Color.alpha(i12) * textPaint2.getAlpha()) / 255));
                    }
                    int lineBaseline = cVar.Y.getLineBaseline(0);
                    CharSequence charSequence = cVar.f8605c0;
                    float f20 = (float) lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, cVar.N);
                    if (i10 >= 31) {
                        cVar.N.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String trim = cVar.f8605c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    cVar.N.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(cVar.Y.getLineEnd(0), str.length()), 0.0f, f20, cVar.N);
                } else {
                    canvas2.translate(f10, f11);
                    cVar.Y.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.I != null && (fVar = this.H) != null) {
            fVar.draw(canvas2);
            if (this.f3335d.isFocused()) {
                Rect bounds = this.I.getBounds();
                Rect bounds2 = this.H.getBounds();
                float f21 = this.G0.f8602b;
                int centerX = bounds2.centerX();
                int i13 = bounds2.left;
                LinearInterpolator linearInterpolator = s4.a.f11855a;
                bounds.left = Math.round(((float) (i13 - centerX)) * f21) + centerX;
                bounds.right = Math.round(f21 * ((float) (bounds2.right - centerX))) + centerX;
                this.I.draw(canvas2);
            }
        }
    }

    public final void drawableStateChanged() {
        boolean z9;
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (!this.K0) {
            boolean z12 = true;
            this.K0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            j5.c cVar = this.G0;
            if (cVar != null) {
                cVar.L = drawableState;
                ColorStateList colorStateList2 = cVar.k;
                if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = cVar.f8615j) == null || !colorStateList.isStateful())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    cVar.h(false);
                    z11 = true;
                } else {
                    z11 = false;
                }
                z9 = z11 | false;
            } else {
                z9 = false;
            }
            if (this.f3335d != null) {
                WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                if (!y.g.c(this) || !isEnabled()) {
                    z12 = false;
                }
                s(z12, false);
            }
            p();
            v();
            if (z9) {
                invalidate();
            }
            this.K0 = false;
        }
    }

    public final boolean e() {
        return this.A && !TextUtils.isEmpty(this.B) && (this.D instanceof v5.i);
    }

    public final r5.f f(boolean z9) {
        float f10;
        float f11;
        int i10;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z9) {
            f10 = dimensionPixelOffset;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f3335d;
        if (editText instanceof u) {
            f11 = ((u) editText).getPopupElevation();
        } else {
            f11 = (float) getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i.a aVar = new i.a();
        aVar.e(f10);
        aVar.f(f10);
        aVar.c(dimensionPixelOffset);
        aVar.d(dimensionPixelOffset);
        r5.i iVar = new r5.i(aVar);
        Context context = getContext();
        String str = r5.f.w;
        TypedValue c10 = n5.b.c(context, r5.f.class.getSimpleName(), R.attr.colorSurface);
        int i11 = c10.resourceId;
        if (i11 != 0) {
            Object obj = y.a.f13006a;
            i10 = a.c.a(context, i11);
        } else {
            i10 = c10.data;
        }
        r5.f fVar = new r5.f();
        fVar.i(context);
        fVar.k(ColorStateList.valueOf(i10));
        fVar.j(f11);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f11660a;
        if (bVar.f11688h == null) {
            bVar.f11688h = new Rect();
        }
        fVar.f11660a.f11688h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fVar.invalidateSelf();
        return fVar;
    }

    public final int g(int i10, boolean z9) {
        int compoundPaddingLeft = this.f3335d.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z9) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public int getBaseline() {
        EditText editText = this.f3335d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public r5.f getBoxBackground() {
        int i10 = this.M;
        if (i10 == 1 || i10 == 2) {
            return this.D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.S;
    }

    public int getBoxBackgroundMode() {
        return this.M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        r5.c cVar;
        if (x.a(this)) {
            cVar = this.J.f11710h;
        } else {
            cVar = this.J.f11709g;
        }
        return cVar.a(this.V);
    }

    public float getBoxCornerRadiusBottomStart() {
        r5.c cVar;
        if (x.a(this)) {
            cVar = this.J.f11709g;
        } else {
            cVar = this.J.f11710h;
        }
        return cVar.a(this.V);
    }

    public float getBoxCornerRadiusTopEnd() {
        r5.c cVar;
        if (x.a(this)) {
            cVar = this.J.f11707e;
        } else {
            cVar = this.J.f11708f;
        }
        return cVar.a(this.V);
    }

    public float getBoxCornerRadiusTopStart() {
        r5.c cVar;
        if (x.a(this)) {
            cVar = this.J.f11708f;
        } else {
            cVar = this.J.f11707e;
        }
        return cVar.a(this.V);
    }

    public int getBoxStrokeColor() {
        return this.f3362y0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3364z0;
    }

    public int getBoxStrokeWidth() {
        return this.P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Q;
    }

    public int getCounterMaxLength() {
        return this.f3342l;
    }

    public CharSequence getCounterOverflowDescription() {
        i0 i0Var;
        if (!this.k || !this.f3343m || (i0Var = this.f3345o) == null) {
            return null;
        }
        return i0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3363z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3361y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.u0;
    }

    public EditText getEditText() {
        return this.f3335d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3334c.f3378g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3334c.f3378g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3334c.f3383m;
    }

    public int getEndIconMode() {
        return this.f3334c.f3380i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3334c.f3384n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3334c.f3378g;
    }

    public CharSequence getError() {
        r rVar = this.f3341j;
        if (rVar.f12580q) {
            return rVar.f12579p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3341j.f12583t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3341j.f12582s;
    }

    public int getErrorCurrentTextColors() {
        i0 i0Var = this.f3341j.f12581r;
        if (i0Var != null) {
            return i0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3334c.f3374c.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.f3341j;
        if (rVar.f12585x) {
            return rVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        i0 i0Var = this.f3341j.f12586y;
        if (i0Var != null) {
            return i0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.G0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        j5.c cVar = this.G0;
        return cVar.e(cVar.k);
    }

    public ColorStateList getHintTextColor() {
        return this.f3357v0;
    }

    public f getLengthCounter() {
        return this.f3344n;
    }

    public int getMaxEms() {
        return this.f3338g;
    }

    public int getMaxWidth() {
        return this.f3340i;
    }

    public int getMinEms() {
        return this.f3337f;
    }

    public int getMinWidth() {
        return this.f3339h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3334c.f3378g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3334c.f3378g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3352s) {
            return this.f3350r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3356v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.f3333b.f12610c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3333b.f12609b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3333b.f12609b;
    }

    public r5.i getShapeAppearanceModel() {
        return this.J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3333b.f12611d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3333b.f12611d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3333b.f12614g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3333b.f12615h;
    }

    public CharSequence getSuffixText() {
        return this.f3334c.f3386p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3334c.f3387q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3334c.f3387q;
    }

    public Typeface getTypeface() {
        return this.W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r8 = this;
            int r0 = r8.M
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x006c
            if (r0 == r1) goto L_0x0054
            if (r0 != r3) goto L_0x003b
            boolean r0 = r8.A
            if (r0 == 0) goto L_0x0031
            r5.f r0 = r8.D
            boolean r0 = r0 instanceof v5.i
            if (r0 != 0) goto L_0x0031
            r5.i r0 = r8.J
            int r4 = v5.i.f12539z
            v5.i$a r4 = new v5.i$a
            if (r0 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            r5.i r0 = new r5.i
            r0.<init>()
        L_0x0023:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.<init>(r0, r5)
            v5.i$b r0 = new v5.i$b
            r0.<init>(r4)
            goto L_0x0038
        L_0x0031:
            r5.f r0 = new r5.f
            r5.i r4 = r8.J
            r0.<init>((r5.i) r4)
        L_0x0038:
            r8.D = r0
            goto L_0x006e
        L_0x003b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.M
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0054:
            r5.f r0 = new r5.f
            r5.i r2 = r8.J
            r0.<init>((r5.i) r2)
            r8.D = r0
            r5.f r0 = new r5.f
            r0.<init>()
            r8.H = r0
            r5.f r0 = new r5.f
            r0.<init>()
            r8.I = r0
            goto L_0x0072
        L_0x006c:
            r8.D = r2
        L_0x006e:
            r8.H = r2
            r8.I = r2
        L_0x0072:
            r8.q()
            r8.v()
            int r0 = r8.M
            r2 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x00b5
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            r0 = r1
            goto L_0x0094
        L_0x0093:
            r0 = r2
        L_0x0094:
            if (r0 == 0) goto L_0x009e
            android.content.res.Resources r0 = r8.getResources()
            r5 = 2131100200(0x7f060228, float:1.7812775E38)
            goto L_0x00af
        L_0x009e:
            android.content.Context r0 = r8.getContext()
            boolean r0 = n5.c.d(r0)
            if (r0 == 0) goto L_0x00b5
            android.content.res.Resources r0 = r8.getResources()
            r5 = 2131100199(0x7f060227, float:1.7812773E38)
        L_0x00af:
            int r0 = r0.getDimensionPixelSize(r5)
            r8.N = r0
        L_0x00b5:
            android.widget.EditText r0 = r8.f3335d
            if (r0 == 0) goto L_0x0125
            int r0 = r8.M
            if (r0 == r1) goto L_0x00be
            goto L_0x0125
        L_0x00be:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
            r2 = r1
        L_0x00d1:
            if (r2 == 0) goto L_0x00f4
            android.widget.EditText r0 = r8.f3335d
            java.util.WeakHashMap<android.view.View, h0.l0> r2 = h0.y.f6776a
            int r2 = h0.y.e.f(r0)
            android.content.res.Resources r4 = r8.getResources()
            r5 = 2131100198(0x7f060226, float:1.781277E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.f3335d
            int r5 = h0.y.e.e(r5)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131100197(0x7f060225, float:1.7812769E38)
            goto L_0x011e
        L_0x00f4:
            android.content.Context r0 = r8.getContext()
            boolean r0 = n5.c.d(r0)
            if (r0 == 0) goto L_0x0125
            android.widget.EditText r0 = r8.f3335d
            java.util.WeakHashMap<android.view.View, h0.l0> r2 = h0.y.f6776a
            int r2 = h0.y.e.f(r0)
            android.content.res.Resources r4 = r8.getResources()
            r5 = 2131100196(0x7f060224, float:1.7812767E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.f3335d
            int r5 = h0.y.e.e(r5)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131100195(0x7f060223, float:1.7812765E38)
        L_0x011e:
            int r6 = r6.getDimensionPixelSize(r7)
            h0.y.e.k(r0, r2, r4, r5, r6)
        L_0x0125:
            int r0 = r8.M
            if (r0 == 0) goto L_0x012c
            r8.r()
        L_0x012c:
            android.widget.EditText r0 = r8.f3335d
            boolean r2 = r0 instanceof android.widget.AutoCompleteTextView
            if (r2 != 0) goto L_0x0133
            goto L_0x014d
        L_0x0133:
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            android.graphics.drawable.Drawable r2 = r0.getDropDownBackground()
            if (r2 != 0) goto L_0x014d
            int r2 = r8.M
            if (r2 != r3) goto L_0x0144
            android.graphics.drawable.Drawable r1 = r8.getOrCreateOutlinedDropDownMenuBackground()
            goto L_0x014a
        L_0x0144:
            if (r2 != r1) goto L_0x014d
            android.graphics.drawable.Drawable r1 = r8.getOrCreateFilledDropDownMenuBackground()
        L_0x014a:
            r0.setDropDownBackgroundDrawable(r1)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.V
            j5.c r1 = r12.G0
            android.widget.EditText r2 = r12.f3335d
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r12.f3335d
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.A
            boolean r4 = r1.b(r4)
            r1.C = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 17
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 5
            if (r3 == r7) goto L_0x004b
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x003b
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003b:
            if (r4 == 0) goto L_0x0043
        L_0x003d:
            android.graphics.Rect r4 = r1.f8606d
            int r4 = r4.left
            float r4 = (float) r4
            goto L_0x0051
        L_0x0043:
            android.graphics.Rect r4 = r1.f8606d
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.Z
            goto L_0x0050
        L_0x004b:
            float r4 = (float) r2
            float r4 = r4 / r8
            float r10 = r1.Z
            float r10 = r10 / r8
        L_0x0050:
            float r4 = r4 - r10
        L_0x0051:
            android.graphics.Rect r10 = r1.f8606d
            int r10 = r10.left
            float r10 = (float) r10
            float r4 = java.lang.Math.max(r4, r10)
            r0.left = r4
            android.graphics.Rect r10 = r1.f8606d
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r3 == r7) goto L_0x0088
            r7 = r3 & 7
            if (r7 != r6) goto L_0x006a
            goto L_0x0088
        L_0x006a:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x007c
            r2 = r3 & 5
            if (r2 != r9) goto L_0x0073
            goto L_0x007c
        L_0x0073:
            boolean r2 = r1.C
            if (r2 == 0) goto L_0x0078
            goto L_0x0084
        L_0x0078:
            float r2 = r1.Z
            float r2 = r2 + r4
            goto L_0x008e
        L_0x007c:
            boolean r2 = r1.C
            if (r2 == 0) goto L_0x0084
            float r2 = r1.Z
            float r2 = r2 + r4
            goto L_0x008e
        L_0x0084:
            int r2 = r10.right
            float r2 = (float) r2
            goto L_0x008e
        L_0x0088:
            float r2 = (float) r2
            float r2 = r2 / r8
            float r3 = r1.Z
            float r3 = r3 / r8
            float r2 = r2 + r3
        L_0x008e:
            int r3 = r10.right
            float r3 = (float) r3
            float r2 = java.lang.Math.min(r2, r3)
            r0.right = r2
            android.graphics.Rect r2 = r1.f8606d
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1.d()
            float r1 = r1 + r2
            r0.bottom = r1
            float r1 = r0.width()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ed
            float r1 = r0.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00b5
            goto L_0x00ed
        L_0x00b5:
            float r1 = r0.left
            int r2 = r12.L
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r12.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r8
            float r2 = r2 - r3
            int r3 = r12.O
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            r5.f r1 = r12.D
            v5.i r1 = (v5.i) r1
            r1.getClass()
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.o(r2, r3, r4, r0)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    public final void k(TextView textView, int i10) {
        boolean z9 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z9 = false;
            }
        } catch (Exception unused) {
        }
        if (z9) {
            textView.setTextAppearance(com.ironsource.sdk.mediation.R.style.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            Object obj = y.a.f13006a;
            textView.setTextColor(a.c.a(context, R.color.design_error));
        }
    }

    public final boolean l() {
        r rVar = this.f3341j;
        if (rVar.f12578o != 1 || rVar.f12581r == null || TextUtils.isEmpty(rVar.f12579p)) {
            return false;
        }
        return true;
    }

    public final void m(Editable editable) {
        int i10;
        boolean z9;
        int i11;
        ((androidx.activity.e) this.f3344n).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z10 = this.f3343m;
        int i12 = this.f3342l;
        String str = null;
        if (i12 == -1) {
            this.f3345o.setText(String.valueOf(i10));
            this.f3345o.setContentDescription((CharSequence) null);
            this.f3343m = false;
        } else {
            if (i10 > i12) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f3343m = z9;
            Context context = getContext();
            i0 i0Var = this.f3345o;
            int i13 = this.f3342l;
            if (this.f3343m) {
                i11 = R.string.character_counter_overflowed_content_description;
            } else {
                i11 = R.string.character_counter_content_description;
            }
            i0Var.setContentDescription(context.getString(i11, new Object[]{Integer.valueOf(i10), Integer.valueOf(i13)}));
            if (z10 != this.f3343m) {
                n();
            }
            f0.a c10 = f0.a.c();
            i0 i0Var2 = this.f3345o;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f3342l)});
            f0.d dVar = c10.f6298c;
            if (string != null) {
                str = c10.d(string, dVar).toString();
            }
            i0Var2.setText(str);
        }
        if (this.f3335d != null && z10 != this.f3343m) {
            s(false, false);
            v();
            p();
        }
    }

    public final void n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i0 i0Var = this.f3345o;
        if (i0Var != null) {
            k(i0Var, this.f3343m ? this.f3347p : this.f3348q);
            if (!this.f3343m && (colorStateList2 = this.f3361y) != null) {
                this.f3345o.setTextColor(colorStateList2);
            }
            if (this.f3343m && (colorStateList = this.f3363z) != null) {
                this.f3345o.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        if (r6.c() != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r10.f3334c.f3386p != null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f3335d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x001d
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001d:
            v5.y r0 = r10.f3333b
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r3 = 2
            r4 = 0
            r5 = 3
            if (r0 == 0) goto L_0x0066
            v5.y r0 = r10.f3333b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f3335d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f3346o0
            if (r6 == 0) goto L_0x0042
            int r6 = r10.p0
            if (r6 == r0) goto L_0x004e
        L_0x0042:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f3346o0 = r6
            r10.p0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x004e:
            android.widget.EditText r0 = r10.f3335d
            android.graphics.drawable.Drawable[] r0 = l0.k.b.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f3346o0
            if (r6 == r7) goto L_0x007f
            android.widget.EditText r6 = r10.f3335d
            r8 = r0[r2]
            r9 = r0[r3]
            r0 = r0[r5]
            l0.k.b.e(r6, r7, r8, r9, r0)
            goto L_0x007d
        L_0x0066:
            android.graphics.drawable.ColorDrawable r0 = r10.f3346o0
            if (r0 == 0) goto L_0x007f
            android.widget.EditText r0 = r10.f3335d
            android.graphics.drawable.Drawable[] r0 = l0.k.b.a(r0)
            android.widget.EditText r6 = r10.f3335d
            r7 = r0[r2]
            r8 = r0[r3]
            r0 = r0[r5]
            l0.k.b.e(r6, r4, r7, r8, r0)
            r10.f3346o0 = r4
        L_0x007d:
            r0 = r2
            goto L_0x0080
        L_0x007f:
            r0 = r1
        L_0x0080:
            com.google.android.material.textfield.a r6 = r10.f3334c
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x009f
            com.google.android.material.textfield.a r6 = r10.f3334c
            int r7 = r6.f3380i
            if (r7 == 0) goto L_0x0090
            r7 = r2
            goto L_0x0091
        L_0x0090:
            r7 = r1
        L_0x0091:
            if (r7 == 0) goto L_0x0099
            boolean r6 = r6.c()
            if (r6 != 0) goto L_0x009f
        L_0x0099:
            com.google.android.material.textfield.a r6 = r10.f3334c
            java.lang.CharSequence r6 = r6.f3386p
            if (r6 == 0) goto L_0x00a9
        L_0x009f:
            com.google.android.material.textfield.a r6 = r10.f3334c
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x00a9
            r6 = r2
            goto L_0x00aa
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 == 0) goto L_0x012c
            com.google.android.material.textfield.a r6 = r10.f3334c
            androidx.appcompat.widget.i0 r6 = r6.f3387q
            int r6 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f3335d
            int r7 = r7.getPaddingRight()
            int r6 = r6 - r7
            com.google.android.material.textfield.a r7 = r10.f3334c
            boolean r8 = r7.d()
            if (r8 == 0) goto L_0x00c6
            com.google.android.material.internal.CheckableImageButton r4 = r7.f3374c
            goto L_0x00d7
        L_0x00c6:
            int r8 = r7.f3380i
            if (r8 == 0) goto L_0x00cc
            r8 = r2
            goto L_0x00cd
        L_0x00cc:
            r8 = r1
        L_0x00cd:
            if (r8 == 0) goto L_0x00d7
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x00d7
            com.google.android.material.internal.CheckableImageButton r4 = r7.f3378g
        L_0x00d7:
            if (r4 == 0) goto L_0x00ea
            int r7 = r4.getMeasuredWidth()
            int r7 = r7 + r6
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r4 = h0.g.c(r4)
            int r6 = r4 + r7
        L_0x00ea:
            android.widget.EditText r4 = r10.f3335d
            android.graphics.drawable.Drawable[] r4 = l0.k.b.a(r4)
            android.graphics.drawable.ColorDrawable r7 = r10.f3351r0
            if (r7 == 0) goto L_0x0108
            int r8 = r10.f3353s0
            if (r8 == r6) goto L_0x0108
            r10.f3353s0 = r6
            r7.setBounds(r1, r1, r6, r2)
            android.widget.EditText r0 = r10.f3335d
            r1 = r4[r1]
            r3 = r4[r2]
            android.graphics.drawable.ColorDrawable r6 = r10.f3351r0
            r4 = r4[r5]
            goto L_0x0126
        L_0x0108:
            if (r7 != 0) goto L_0x0116
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f3351r0 = r7
            r10.f3353s0 = r6
            r7.setBounds(r1, r1, r6, r2)
        L_0x0116:
            r3 = r4[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f3351r0
            if (r3 == r6) goto L_0x012a
            r10.f3355t0 = r3
            android.widget.EditText r0 = r10.f3335d
            r1 = r4[r1]
            r3 = r4[r2]
            r4 = r4[r5]
        L_0x0126:
            l0.k.b.e(r0, r1, r3, r6, r4)
            goto L_0x014d
        L_0x012a:
            r2 = r0
            goto L_0x014d
        L_0x012c:
            android.graphics.drawable.ColorDrawable r6 = r10.f3351r0
            if (r6 == 0) goto L_0x014e
            android.widget.EditText r6 = r10.f3335d
            android.graphics.drawable.Drawable[] r6 = l0.k.b.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f3351r0
            if (r3 != r7) goto L_0x014a
            android.widget.EditText r0 = r10.f3335d
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f3355t0
            r5 = r6[r5]
            l0.k.b.e(r0, r1, r3, r7, r5)
            goto L_0x014b
        L_0x014a:
            r2 = r0
        L_0x014b:
            r10.f3351r0 = r4
        L_0x014d:
            r0 = r2
        L_0x014e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o():boolean");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G0.g(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.widget.EditText r6 = r5.f3335d
            if (r6 == 0) goto L_0x01c7
            android.graphics.Rect r7 = r5.T
            j5.d.a(r5, r6, r7)
            r5.f r6 = r5.H
            if (r6 == 0) goto L_0x001d
            int r8 = r7.bottom
            int r9 = r5.P
            int r9 = r8 - r9
            int r10 = r7.left
            int r0 = r7.right
            r6.setBounds(r10, r9, r0, r8)
        L_0x001d:
            r5.f r6 = r5.I
            if (r6 == 0) goto L_0x002e
            int r8 = r7.bottom
            int r9 = r5.Q
            int r9 = r8 - r9
            int r10 = r7.left
            int r0 = r7.right
            r6.setBounds(r10, r9, r0, r8)
        L_0x002e:
            boolean r6 = r5.A
            if (r6 == 0) goto L_0x01c7
            j5.c r6 = r5.G0
            android.widget.EditText r8 = r5.f3335d
            float r8 = r8.getTextSize()
            float r9 = r6.f8613h
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L_0x0046
            r6.f8613h = r8
            r6.h(r10)
        L_0x0046:
            android.widget.EditText r6 = r5.f3335d
            int r6 = r6.getGravity()
            j5.c r8 = r5.G0
            r9 = r6 & -113(0xffffffffffffff8f, float:NaN)
            r9 = r9 | 48
            int r0 = r8.f8612g
            if (r0 == r9) goto L_0x005b
            r8.f8612g = r9
            r8.h(r10)
        L_0x005b:
            j5.c r8 = r5.G0
            int r9 = r8.f8610f
            if (r9 == r6) goto L_0x0066
            r8.f8610f = r6
            r8.h(r10)
        L_0x0066:
            j5.c r6 = r5.G0
            android.widget.EditText r8 = r5.f3335d
            if (r8 == 0) goto L_0x01c1
            android.graphics.Rect r8 = r5.U
            boolean r9 = j5.x.a(r5)
            int r0 = r7.bottom
            r8.bottom = r0
            int r0 = r5.M
            r1 = 1
            if (r0 == r1) goto L_0x00a9
            r2 = 2
            if (r0 == r2) goto L_0x008b
            int r0 = r7.left
            int r0 = r5.g(r0, r9)
            r8.left = r0
            int r0 = r5.getPaddingTop()
            goto L_0x00b6
        L_0x008b:
            int r9 = r7.left
            android.widget.EditText r0 = r5.f3335d
            int r0 = r0.getPaddingLeft()
            int r0 = r0 + r9
            r8.left = r0
            int r9 = r7.top
            int r0 = r5.c()
            int r9 = r9 - r0
            r8.top = r9
            int r9 = r7.right
            android.widget.EditText r0 = r5.f3335d
            int r0 = r0.getPaddingRight()
            int r9 = r9 - r0
            goto L_0x00dd
        L_0x00a9:
            int r0 = r7.left
            int r0 = r5.g(r0, r9)
            r8.left = r0
            int r0 = r7.top
            int r2 = r5.N
            int r0 = r0 + r2
        L_0x00b6:
            r8.top = r0
            int r0 = r7.right
            android.widget.EditText r2 = r5.f3335d
            int r2 = r2.getCompoundPaddingRight()
            int r0 = r0 - r2
            java.lang.CharSequence r2 = r5.getPrefixText()
            if (r2 == 0) goto L_0x00dc
            if (r9 == 0) goto L_0x00dc
            android.widget.TextView r9 = r5.getPrefixTextView()
            int r9 = r9.getMeasuredWidth()
            android.widget.TextView r2 = r5.getPrefixTextView()
            int r2 = r2.getPaddingRight()
            int r9 = r9 - r2
            int r9 = r9 + r0
            goto L_0x00dd
        L_0x00dc:
            r9 = r0
        L_0x00dd:
            r8.right = r9
            r6.getClass()
            int r9 = r8.left
            int r0 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            android.graphics.Rect r3 = r6.f8606d
            int r4 = r3.left
            if (r4 != r9) goto L_0x00fe
            int r4 = r3.top
            if (r4 != r0) goto L_0x00fe
            int r4 = r3.right
            if (r4 != r2) goto L_0x00fe
            int r4 = r3.bottom
            if (r4 != r8) goto L_0x00fe
            r4 = r1
            goto L_0x00ff
        L_0x00fe:
            r4 = r10
        L_0x00ff:
            if (r4 != 0) goto L_0x0106
            r3.set(r9, r0, r2, r8)
            r6.M = r1
        L_0x0106:
            j5.c r6 = r5.G0
            android.widget.EditText r8 = r5.f3335d
            if (r8 == 0) goto L_0x01bb
            android.graphics.Rect r8 = r5.U
            android.text.TextPaint r9 = r6.O
            float r0 = r6.f8613h
            r9.setTextSize(r0)
            android.graphics.Typeface r0 = r6.u
            r9.setTypeface(r0)
            float r0 = r6.W
            r9.setLetterSpacing(r0)
            android.text.TextPaint r9 = r6.O
            float r9 = r9.ascent()
            float r9 = -r9
            int r0 = r7.left
            android.widget.EditText r2 = r5.f3335d
            int r2 = r2.getCompoundPaddingLeft()
            int r2 = r2 + r0
            r8.left = r2
            int r0 = r5.M
            if (r0 != r1) goto L_0x013f
            android.widget.EditText r0 = r5.f3335d
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x013f
            r0 = r1
            goto L_0x0140
        L_0x013f:
            r0 = r10
        L_0x0140:
            if (r0 == 0) goto L_0x014e
            int r0 = r7.centerY()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r9 / r2
            float r0 = r0 - r2
            int r0 = (int) r0
            goto L_0x0157
        L_0x014e:
            int r0 = r7.top
            android.widget.EditText r2 = r5.f3335d
            int r2 = r2.getCompoundPaddingTop()
            int r0 = r0 + r2
        L_0x0157:
            r8.top = r0
            int r0 = r7.right
            android.widget.EditText r2 = r5.f3335d
            int r2 = r2.getCompoundPaddingRight()
            int r0 = r0 - r2
            r8.right = r0
            int r0 = r5.M
            if (r0 != r1) goto L_0x0172
            android.widget.EditText r0 = r5.f3335d
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x0172
            r0 = r1
            goto L_0x0173
        L_0x0172:
            r0 = r10
        L_0x0173:
            if (r0 == 0) goto L_0x017b
            int r7 = r8.top
            float r7 = (float) r7
            float r7 = r7 + r9
            int r7 = (int) r7
            goto L_0x0184
        L_0x017b:
            int r7 = r7.bottom
            android.widget.EditText r9 = r5.f3335d
            int r9 = r9.getCompoundPaddingBottom()
            int r7 = r7 - r9
        L_0x0184:
            r8.bottom = r7
            int r9 = r8.left
            int r0 = r8.top
            int r8 = r8.right
            android.graphics.Rect r2 = r6.f8604c
            int r3 = r2.left
            if (r3 != r9) goto L_0x01a0
            int r3 = r2.top
            if (r3 != r0) goto L_0x01a0
            int r3 = r2.right
            if (r3 != r8) goto L_0x01a0
            int r3 = r2.bottom
            if (r3 != r7) goto L_0x01a0
            r3 = r1
            goto L_0x01a1
        L_0x01a0:
            r3 = r10
        L_0x01a1:
            if (r3 != 0) goto L_0x01a8
            r2.set(r9, r0, r8, r7)
            r6.M = r1
        L_0x01a8:
            j5.c r6 = r5.G0
            r6.h(r10)
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x01c7
            boolean r6 = r5.F0
            if (r6 != 0) goto L_0x01c7
            r5.i()
            goto L_0x01c7
        L_0x01bb:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x01c1:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i10, int i11) {
        boolean z9;
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        if (this.f3335d != null && this.f3335d.getMeasuredHeight() < (max = Math.max(this.f3334c.getMeasuredHeight(), this.f3333b.getMeasuredHeight()))) {
            this.f3335d.setMinimumHeight(max);
            z9 = true;
        } else {
            z9 = false;
        }
        boolean o10 = o();
        if (z9 || o10) {
            this.f3335d.post(new c());
        }
        if (!(this.f3354t == null || (editText = this.f3335d) == null)) {
            this.f3354t.setGravity(editText.getGravity());
            this.f3354t.setPadding(this.f3335d.getCompoundPaddingLeft(), this.f3335d.getCompoundPaddingTop(), this.f3335d.getCompoundPaddingRight(), this.f3335d.getCompoundPaddingBottom());
        }
        this.f3334c.l();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f9479a);
        setError(iVar.f3370c);
        if (iVar.f3371d) {
            post(new b());
        }
        requestLayout();
    }

    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        if (z9 != this.K) {
            float a10 = this.J.f11707e.a(this.V);
            float a11 = this.J.f11708f.a(this.V);
            float a12 = this.J.f11710h.a(this.V);
            float a13 = this.J.f11709g.a(this.V);
            r5.i iVar = this.J;
            z zVar = iVar.f11703a;
            z zVar2 = iVar.f11704b;
            z zVar3 = iVar.f11706d;
            z zVar4 = iVar.f11705c;
            i.a aVar = new i.a();
            aVar.f11714a = zVar2;
            float b10 = i.a.b(zVar2);
            if (b10 != -1.0f) {
                aVar.e(b10);
            }
            aVar.f11715b = zVar;
            float b11 = i.a.b(zVar);
            if (b11 != -1.0f) {
                aVar.f(b11);
            }
            aVar.f11717d = zVar4;
            float b12 = i.a.b(zVar4);
            if (b12 != -1.0f) {
                aVar.c(b12);
            }
            aVar.f11716c = zVar3;
            float b13 = i.a.b(zVar3);
            if (b13 != -1.0f) {
                aVar.d(b13);
            }
            aVar.e(a11);
            aVar.f(a10);
            aVar.c(a13);
            aVar.d(a12);
            r5.i iVar2 = new r5.i(aVar);
            this.K = z9;
            setShapeAppearanceModel(iVar2);
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean z9;
        i iVar = new i(super.onSaveInstanceState());
        if (l()) {
            iVar.f3370c = getError();
        }
        a aVar = this.f3334c;
        boolean z10 = true;
        if (aVar.f3380i != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || !aVar.f3378g.isChecked()) {
            z10 = false;
        }
        iVar.f3371d = z10;
        return iVar;
    }

    public final void p() {
        Drawable background;
        int i10;
        i0 i0Var;
        EditText editText = this.f3335d;
        if (editText != null && this.M == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = o0.f876a;
            Drawable mutate = background.mutate();
            if (l()) {
                i10 = getErrorCurrentTextColors();
            } else if (!this.f3343m || (i0Var = this.f3345o) == null) {
                mutate.clearColorFilter();
                this.f3335d.refreshDrawableState();
                return;
            } else {
                i10 = i0Var.getCurrentTextColor();
            }
            mutate.setColorFilter(j.c(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void q() {
        EditText editText = this.f3335d;
        if (editText != null && this.D != null) {
            if ((this.G || editText.getBackground() == null) && this.M != 0) {
                EditText editText2 = this.f3335d;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                y.d.q(editText2, editTextBoxBackground);
                this.G = true;
            }
        }
    }

    public final void r() {
        if (this.M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3332a.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                this.f3332a.requestLayout();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(boolean r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = r8.isEnabled()
            android.widget.EditText r1 = r8.f3335d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            android.widget.EditText r4 = r8.f3335d
            if (r4 == 0) goto L_0x0023
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x0023
            r4 = r3
            goto L_0x0024
        L_0x0023:
            r4 = r2
        L_0x0024:
            android.content.res.ColorStateList r5 = r8.u0
            if (r5 == 0) goto L_0x002d
            j5.c r6 = r8.G0
            r6.i(r5)
        L_0x002d:
            r5 = 0
            if (r0 != 0) goto L_0x004b
            android.content.res.ColorStateList r0 = r8.u0
            if (r0 == 0) goto L_0x0042
            int[] r6 = new int[r3]
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r6[r2] = r7
            int r7 = r8.E0
            int r0 = r0.getColorForState(r6, r7)
            goto L_0x0044
        L_0x0042:
            int r0 = r8.E0
        L_0x0044:
            j5.c r6 = r8.G0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x0071
        L_0x004b:
            boolean r0 = r8.l()
            if (r0 == 0) goto L_0x0063
            j5.c r0 = r8.G0
            v5.r r6 = r8.f3341j
            androidx.appcompat.widget.i0 r6 = r6.f12581r
            if (r6 == 0) goto L_0x005e
            android.content.res.ColorStateList r6 = r6.getTextColors()
            goto L_0x005f
        L_0x005e:
            r6 = r5
        L_0x005f:
            r0.i(r6)
            goto L_0x0086
        L_0x0063:
            boolean r0 = r8.f3343m
            if (r0 == 0) goto L_0x0075
            androidx.appcompat.widget.i0 r0 = r8.f3345o
            if (r0 == 0) goto L_0x0075
            j5.c r6 = r8.G0
            android.content.res.ColorStateList r0 = r0.getTextColors()
        L_0x0071:
            r6.i(r0)
            goto L_0x0086
        L_0x0075:
            if (r4 == 0) goto L_0x0086
            android.content.res.ColorStateList r0 = r8.f3357v0
            if (r0 == 0) goto L_0x0086
            j5.c r6 = r8.G0
            android.content.res.ColorStateList r7 = r6.k
            if (r7 == r0) goto L_0x0086
            r6.k = r0
            r6.h(r2)
        L_0x0086:
            if (r1 != 0) goto L_0x0106
            boolean r0 = r8.H0
            if (r0 == 0) goto L_0x0106
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x0096
            if (r4 == 0) goto L_0x0096
            goto L_0x0106
        L_0x0096:
            if (r10 != 0) goto L_0x009c
            boolean r10 = r8.F0
            if (r10 != 0) goto L_0x0151
        L_0x009c:
            android.animation.ValueAnimator r10 = r8.J0
            if (r10 == 0) goto L_0x00ab
            boolean r10 = r10.isRunning()
            if (r10 == 0) goto L_0x00ab
            android.animation.ValueAnimator r10 = r8.J0
            r10.cancel()
        L_0x00ab:
            r10 = 0
            if (r9 == 0) goto L_0x00b6
            boolean r9 = r8.I0
            if (r9 == 0) goto L_0x00b6
            r8.a(r10)
            goto L_0x00bb
        L_0x00b6:
            j5.c r9 = r8.G0
            r9.k(r10)
        L_0x00bb:
            boolean r9 = r8.e()
            if (r9 == 0) goto L_0x00dd
            r5.f r9 = r8.D
            v5.i r9 = (v5.i) r9
            v5.i$a r9 = r9.f12540y
            android.graphics.RectF r9 = r9.f12541v
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x00dd
            boolean r9 = r8.e()
            if (r9 == 0) goto L_0x00dd
            r5.f r9 = r8.D
            v5.i r9 = (v5.i) r9
            r9.o(r10, r10, r10, r10)
        L_0x00dd:
            r8.F0 = r3
            androidx.appcompat.widget.i0 r9 = r8.f3354t
            if (r9 == 0) goto L_0x00f7
            boolean r10 = r8.f3352s
            if (r10 == 0) goto L_0x00f7
            r9.setText(r5)
            android.widget.FrameLayout r9 = r8.f3332a
            g1.d r10 = r8.f3359x
            g1.o.a(r9, r10)
            androidx.appcompat.widget.i0 r9 = r8.f3354t
            r10 = 4
            r9.setVisibility(r10)
        L_0x00f7:
            v5.y r9 = r8.f3333b
            r9.f12617j = r3
            r9.d()
            com.google.android.material.textfield.a r9 = r8.f3334c
            r9.f3388r = r3
            r9.m()
            goto L_0x0151
        L_0x0106:
            if (r10 != 0) goto L_0x010c
            boolean r10 = r8.F0
            if (r10 == 0) goto L_0x0151
        L_0x010c:
            android.animation.ValueAnimator r10 = r8.J0
            if (r10 == 0) goto L_0x011b
            boolean r10 = r10.isRunning()
            if (r10 == 0) goto L_0x011b
            android.animation.ValueAnimator r10 = r8.J0
            r10.cancel()
        L_0x011b:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x0127
            boolean r9 = r8.I0
            if (r9 == 0) goto L_0x0127
            r8.a(r10)
            goto L_0x012c
        L_0x0127:
            j5.c r9 = r8.G0
            r9.k(r10)
        L_0x012c:
            r8.F0 = r2
            boolean r9 = r8.e()
            if (r9 == 0) goto L_0x0137
            r8.i()
        L_0x0137:
            android.widget.EditText r9 = r8.f3335d
            if (r9 != 0) goto L_0x013c
            goto L_0x0140
        L_0x013c:
            android.text.Editable r5 = r9.getText()
        L_0x0140:
            r8.t(r5)
            v5.y r9 = r8.f3333b
            r9.f12617j = r2
            r9.d()
            com.google.android.material.textfield.a r9 = r8.f3334c
            r9.f3388r = r2
            r9.m()
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s(boolean, boolean):void");
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.S != i10) {
            this.S = i10;
            this.A0 = i10;
            this.C0 = i10;
            this.D0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        Context context = getContext();
        Object obj = y.a.f13006a;
        setBoxBackgroundColor(a.c.a(context, i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0 = defaultColor;
        this.S = defaultColor;
        this.B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.C0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.M) {
            this.M = i10;
            if (this.f3335d != null) {
                h();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.N = i10;
    }

    public void setBoxCornerFamily(int i10) {
        r5.i iVar = this.J;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        r5.c cVar = this.J.f11707e;
        z f10 = z5.c.f(i10);
        aVar.f11714a = f10;
        float b10 = i.a.b(f10);
        if (b10 != -1.0f) {
            aVar.e(b10);
        }
        aVar.f11718e = cVar;
        r5.c cVar2 = this.J.f11708f;
        z f11 = z5.c.f(i10);
        aVar.f11715b = f11;
        float b11 = i.a.b(f11);
        if (b11 != -1.0f) {
            aVar.f(b11);
        }
        aVar.f11719f = cVar2;
        r5.c cVar3 = this.J.f11710h;
        z f12 = z5.c.f(i10);
        aVar.f11717d = f12;
        float b12 = i.a.b(f12);
        if (b12 != -1.0f) {
            aVar.c(b12);
        }
        aVar.f11721h = cVar3;
        r5.c cVar4 = this.J.f11709g;
        z f13 = z5.c.f(i10);
        aVar.f11716c = f13;
        float b13 = i.a.b(f13);
        if (b13 != -1.0f) {
            aVar.d(b13);
        }
        aVar.f11720g = cVar4;
        this.J = new r5.i(aVar);
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f3362y0 != i10) {
            this.f3362y0 = i10;
            v();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f3358w0 = colorStateList.getDefaultColor();
            this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3360x0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f3362y0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            v();
        }
        this.f3362y0 = defaultColor;
        v();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3364z0 != colorStateList) {
            this.f3364z0 = colorStateList;
            v();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.P = i10;
        v();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.Q = i10;
        v();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z9) {
        if (this.k != z9) {
            Editable editable = null;
            if (z9) {
                i0 i0Var = new i0(getContext(), (AttributeSet) null);
                this.f3345o = i0Var;
                i0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.W;
                if (typeface != null) {
                    this.f3345o.setTypeface(typeface);
                }
                this.f3345o.setMaxLines(1);
                this.f3341j.a(this.f3345o, 2);
                h0.g.h((ViewGroup.MarginLayoutParams) this.f3345o.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                n();
                if (this.f3345o != null) {
                    EditText editText = this.f3335d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    m(editable);
                }
            } else {
                this.f3341j.g(this.f3345o, 2);
                this.f3345o = null;
            }
            this.k = z9;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f3342l != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f3342l = i10;
            if (this.k && this.f3345o != null) {
                EditText editText = this.f3335d;
                m(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f3347p != i10) {
            this.f3347p = i10;
            n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3363z != colorStateList) {
            this.f3363z = colorStateList;
            n();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f3348q != i10) {
            this.f3348q = i10;
            n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3361y != colorStateList) {
            this.f3361y = colorStateList;
            n();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        this.f3357v0 = colorStateList;
        if (this.f3335d != null) {
            s(false, false);
        }
    }

    public void setEnabled(boolean z9) {
        j(this, z9);
        super.setEnabled(z9);
    }

    public void setEndIconActivated(boolean z9) {
        this.f3334c.f3378g.setActivated(z9);
    }

    public void setEndIconCheckable(boolean z9) {
        this.f3334c.f3378g.setCheckable(z9);
    }

    public void setEndIconContentDescription(int i10) {
        a aVar = this.f3334c;
        CharSequence text = i10 != 0 ? aVar.getResources().getText(i10) : null;
        if (aVar.f3378g.getContentDescription() != text) {
            aVar.f3378g.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        a aVar = this.f3334c;
        Drawable a10 = i10 != 0 ? e.a.a(aVar.getContext(), i10) : null;
        aVar.f3378g.setImageDrawable(a10);
        if (a10 != null) {
            q.a(aVar.f3372a, aVar.f3378g, aVar.k, aVar.f3382l);
            q.c(aVar.f3372a, aVar.f3378g, aVar.k);
        }
    }

    public void setEndIconMinSize(int i10) {
        a aVar = this.f3334c;
        if (i10 < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i10 != aVar.f3383m) {
            aVar.f3383m = i10;
            CheckableImageButton checkableImageButton = aVar.f3378g;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = aVar.f3374c;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f3334c.f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        a aVar = this.f3334c;
        CheckableImageButton checkableImageButton = aVar.f3378g;
        View.OnLongClickListener onLongClickListener = aVar.f3385o;
        checkableImageButton.setOnClickListener(onClickListener);
        q.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        a aVar = this.f3334c;
        aVar.f3385o = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f3378g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        a aVar = this.f3334c;
        aVar.f3384n = scaleType;
        aVar.f3378g.setScaleType(scaleType);
        aVar.f3374c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        a aVar = this.f3334c;
        if (aVar.k != colorStateList) {
            aVar.k = colorStateList;
            q.a(aVar.f3372a, aVar.f3378g, colorStateList, aVar.f3382l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        a aVar = this.f3334c;
        if (aVar.f3382l != mode) {
            aVar.f3382l = mode;
            q.a(aVar.f3372a, aVar.f3378g, aVar.k, mode);
        }
    }

    public void setEndIconVisible(boolean z9) {
        this.f3334c.g(z9);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f3341j.f12580q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            r rVar = this.f3341j;
            rVar.c();
            rVar.f12579p = charSequence;
            rVar.f12581r.setText(charSequence);
            int i10 = rVar.f12577n;
            if (i10 != 1) {
                rVar.f12578o = 1;
            }
            rVar.i(i10, rVar.f12578o, rVar.h(rVar.f12581r, charSequence));
            return;
        }
        this.f3341j.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        r rVar = this.f3341j;
        rVar.f12583t = i10;
        i0 i0Var = rVar.f12581r;
        if (i0Var != null) {
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.g.f(i0Var, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.f3341j;
        rVar.f12582s = charSequence;
        i0 i0Var = rVar.f12581r;
        if (i0Var != null) {
            i0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z9) {
        r rVar = this.f3341j;
        if (rVar.f12580q != z9) {
            rVar.c();
            if (z9) {
                i0 i0Var = new i0(rVar.f12571g, (AttributeSet) null);
                rVar.f12581r = i0Var;
                i0Var.setId(R.id.textinput_error);
                rVar.f12581r.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f12581r.setTypeface(typeface);
                }
                int i10 = rVar.u;
                rVar.u = i10;
                i0 i0Var2 = rVar.f12581r;
                if (i0Var2 != null) {
                    rVar.f12572h.k(i0Var2, i10);
                }
                ColorStateList colorStateList = rVar.f12584v;
                rVar.f12584v = colorStateList;
                i0 i0Var3 = rVar.f12581r;
                if (!(i0Var3 == null || colorStateList == null)) {
                    i0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = rVar.f12582s;
                rVar.f12582s = charSequence;
                i0 i0Var4 = rVar.f12581r;
                if (i0Var4 != null) {
                    i0Var4.setContentDescription(charSequence);
                }
                int i11 = rVar.f12583t;
                rVar.f12583t = i11;
                i0 i0Var5 = rVar.f12581r;
                if (i0Var5 != null) {
                    WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                    y.g.f(i0Var5, i11);
                }
                rVar.f12581r.setVisibility(4);
                rVar.a(rVar.f12581r, 0);
            } else {
                rVar.f();
                rVar.g(rVar.f12581r, 0);
                rVar.f12581r = null;
                rVar.f12572h.p();
                rVar.f12572h.v();
            }
            rVar.f12580q = z9;
        }
    }

    public void setErrorIconDrawable(int i10) {
        Drawable drawable;
        a aVar = this.f3334c;
        if (i10 != 0) {
            drawable = e.a.a(aVar.getContext(), i10);
        } else {
            drawable = null;
        }
        aVar.h(drawable);
        q.c(aVar.f3372a, aVar.f3374c, aVar.f3375d);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3334c.h(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        a aVar = this.f3334c;
        CheckableImageButton checkableImageButton = aVar.f3374c;
        View.OnLongClickListener onLongClickListener = aVar.f3377f;
        checkableImageButton.setOnClickListener(onClickListener);
        q.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        a aVar = this.f3334c;
        aVar.f3377f = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f3374c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        a aVar = this.f3334c;
        if (aVar.f3375d != colorStateList) {
            aVar.f3375d = colorStateList;
            q.a(aVar.f3372a, aVar.f3374c, colorStateList, aVar.f3376e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        a aVar = this.f3334c;
        if (aVar.f3376e != mode) {
            aVar.f3376e = mode;
            q.a(aVar.f3372a, aVar.f3374c, aVar.f3375d, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        r rVar = this.f3341j;
        rVar.u = i10;
        i0 i0Var = rVar.f12581r;
        if (i0Var != null) {
            rVar.f12572h.k(i0Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.f3341j;
        rVar.f12584v = colorStateList;
        i0 i0Var = rVar.f12581r;
        if (i0Var != null && colorStateList != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z9) {
        if (this.H0 != z9) {
            this.H0 = z9;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f3341j.f12585x) {
                setHelperTextEnabled(true);
            }
            r rVar = this.f3341j;
            rVar.c();
            rVar.w = charSequence;
            rVar.f12586y.setText(charSequence);
            int i10 = rVar.f12577n;
            if (i10 != 2) {
                rVar.f12578o = 2;
            }
            rVar.i(i10, rVar.f12578o, rVar.h(rVar.f12586y, charSequence));
        } else if (this.f3341j.f12585x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.f3341j;
        rVar.A = colorStateList;
        i0 i0Var = rVar.f12586y;
        if (i0Var != null && colorStateList != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z9) {
        r rVar = this.f3341j;
        if (rVar.f12585x != z9) {
            rVar.c();
            if (z9) {
                i0 i0Var = new i0(rVar.f12571g, (AttributeSet) null);
                rVar.f12586y = i0Var;
                i0Var.setId(R.id.textinput_helper_text);
                rVar.f12586y.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f12586y.setTypeface(typeface);
                }
                rVar.f12586y.setVisibility(4);
                i0 i0Var2 = rVar.f12586y;
                WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                y.g.f(i0Var2, 1);
                int i10 = rVar.f12587z;
                rVar.f12587z = i10;
                i0 i0Var3 = rVar.f12586y;
                if (i0Var3 != null) {
                    i0Var3.setTextAppearance(i10);
                }
                ColorStateList colorStateList = rVar.A;
                rVar.A = colorStateList;
                i0 i0Var4 = rVar.f12586y;
                if (!(i0Var4 == null || colorStateList == null)) {
                    i0Var4.setTextColor(colorStateList);
                }
                rVar.a(rVar.f12586y, 1);
                rVar.f12586y.setAccessibilityDelegate(new s(rVar));
            } else {
                rVar.c();
                int i11 = rVar.f12577n;
                if (i11 == 2) {
                    rVar.f12578o = 0;
                }
                rVar.i(i11, rVar.f12578o, rVar.h(rVar.f12586y, ""));
                rVar.g(rVar.f12586y, 1);
                rVar.f12586y = null;
                rVar.f12572h.p();
                rVar.f12572h.v();
            }
            rVar.f12585x = z9;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        r rVar = this.f3341j;
        rVar.f12587z = i10;
        i0 i0Var = rVar.f12586y;
        if (i0Var != null) {
            i0Var.setTextAppearance(i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z9) {
        this.I0 = z9;
    }

    public void setHintEnabled(boolean z9) {
        if (z9 != this.A) {
            this.A = z9;
            if (!z9) {
                this.C = false;
                if (!TextUtils.isEmpty(this.B) && TextUtils.isEmpty(this.f3335d.getHint())) {
                    this.f3335d.setHint(this.B);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f3335d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.B)) {
                        setHint(hint);
                    }
                    this.f3335d.setHint((CharSequence) null);
                }
                this.C = true;
            }
            if (this.f3335d != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        j5.c cVar = this.G0;
        n5.d dVar = new n5.d(cVar.f8600a.getContext(), i10);
        ColorStateList colorStateList = dVar.f10372j;
        if (colorStateList != null) {
            cVar.k = colorStateList;
        }
        float f10 = dVar.k;
        if (f10 != 0.0f) {
            cVar.f8614i = f10;
        }
        ColorStateList colorStateList2 = dVar.f10363a;
        if (colorStateList2 != null) {
            cVar.U = colorStateList2;
        }
        cVar.S = dVar.f10367e;
        cVar.T = dVar.f10368f;
        cVar.R = dVar.f10369g;
        cVar.V = dVar.f10371i;
        n5.a aVar = cVar.f8627y;
        if (aVar != null) {
            aVar.f10362d = true;
        }
        j5.b bVar = new j5.b(cVar);
        dVar.a();
        cVar.f8627y = new n5.a(bVar, dVar.f10375n);
        dVar.c(cVar.f8600a.getContext(), cVar.f8627y);
        cVar.h(false);
        this.f3357v0 = this.G0.k;
        if (this.f3335d != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3357v0 != colorStateList) {
            if (this.u0 == null) {
                j5.c cVar = this.G0;
                if (cVar.k != colorStateList) {
                    cVar.k = colorStateList;
                    cVar.h(false);
                }
            }
            this.f3357v0 = colorStateList;
            if (this.f3335d != null) {
                s(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f3344n = fVar;
    }

    public void setMaxEms(int i10) {
        this.f3338g = i10;
        EditText editText = this.f3335d;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f3340i = i10;
        EditText editText = this.f3335d;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f3337f = i10;
        EditText editText = this.f3335d;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f3339h = i10;
        EditText editText = this.f3335d;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        a aVar = this.f3334c;
        aVar.f3378g.setContentDescription(i10 != 0 ? aVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        a aVar = this.f3334c;
        aVar.f3378g.setImageDrawable(i10 != 0 ? e.a.a(aVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z9) {
        a aVar = this.f3334c;
        if (z9 && aVar.f3380i != 1) {
            aVar.f(1);
        } else if (!z9) {
            aVar.f(0);
        } else {
            aVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        a aVar = this.f3334c;
        aVar.k = colorStateList;
        q.a(aVar.f3372a, aVar.f3378g, colorStateList, aVar.f3382l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        a aVar = this.f3334c;
        aVar.f3382l = mode;
        q.a(aVar.f3372a, aVar.f3378g, aVar.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f3354t == null) {
            i0 i0Var = new i0(getContext(), (AttributeSet) null);
            this.f3354t = i0Var;
            i0Var.setId(R.id.textinput_placeholder);
            i0 i0Var2 = this.f3354t;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.d.s(i0Var2, 2);
            g1.d d10 = d();
            this.w = d10;
            d10.f6505b = 67;
            this.f3359x = d();
            setPlaceholderTextAppearance(this.f3356v);
            setPlaceholderTextColor(this.u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3352s) {
                setPlaceholderTextEnabled(true);
            }
            this.f3350r = charSequence;
        }
        EditText editText = this.f3335d;
        if (editText != null) {
            editable = editText.getText();
        }
        t(editable);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f3356v = i10;
        i0 i0Var = this.f3354t;
        if (i0Var != null) {
            i0Var.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            i0 i0Var = this.f3354t;
            if (i0Var != null && colorStateList != null) {
                i0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v5.y yVar = this.f3333b;
        yVar.getClass();
        yVar.f12610c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f12609b.setText(charSequence);
        yVar.d();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f3333b.f12609b.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3333b.f12609b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(r5.i iVar) {
        r5.f fVar = this.D;
        if (fVar != null && fVar.f11660a.f11681a != iVar) {
            this.J = iVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z9) {
        this.f3333b.f12611d.setCheckable(z9);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        v5.y yVar = this.f3333b;
        if (yVar.f12611d.getContentDescription() != charSequence) {
            yVar.f12611d.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? e.a.a(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3333b.a(drawable);
    }

    public void setStartIconMinSize(int i10) {
        v5.y yVar = this.f3333b;
        if (i10 < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i10 != yVar.f12614g) {
            yVar.f12614g = i10;
            CheckableImageButton checkableImageButton = yVar.f12611d;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v5.y yVar = this.f3333b;
        CheckableImageButton checkableImageButton = yVar.f12611d;
        View.OnLongClickListener onLongClickListener = yVar.f12616i;
        checkableImageButton.setOnClickListener(onClickListener);
        q.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v5.y yVar = this.f3333b;
        yVar.f12616i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.f12611d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v5.y yVar = this.f3333b;
        yVar.f12615h = scaleType;
        yVar.f12611d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v5.y yVar = this.f3333b;
        if (yVar.f12612e != colorStateList) {
            yVar.f12612e = colorStateList;
            q.a(yVar.f12608a, yVar.f12611d, colorStateList, yVar.f12613f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v5.y yVar = this.f3333b;
        if (yVar.f12613f != mode) {
            yVar.f12613f = mode;
            q.a(yVar.f12608a, yVar.f12611d, yVar.f12612e, mode);
        }
    }

    public void setStartIconVisible(boolean z9) {
        this.f3333b.b(z9);
    }

    public void setSuffixText(CharSequence charSequence) {
        a aVar = this.f3334c;
        aVar.getClass();
        aVar.f3386p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.f3387q.setText(charSequence);
        aVar.m();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f3334c.f3387q.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3334c.f3387q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f3335d;
        if (editText != null) {
            h0.y.n(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.W) {
            this.W = typeface;
            this.G0.m(typeface);
            r rVar = this.f3341j;
            if (typeface != rVar.B) {
                rVar.B = typeface;
                i0 i0Var = rVar.f12581r;
                if (i0Var != null) {
                    i0Var.setTypeface(typeface);
                }
                i0 i0Var2 = rVar.f12586y;
                if (i0Var2 != null) {
                    i0Var2.setTypeface(typeface);
                }
            }
            i0 i0Var3 = this.f3345o;
            if (i0Var3 != null) {
                i0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(Editable editable) {
        int i10;
        ((androidx.activity.e) this.f3344n).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        if (i10 != 0 || this.F0) {
            i0 i0Var = this.f3354t;
            if (i0Var != null && this.f3352s) {
                i0Var.setText((CharSequence) null);
                o.a(this.f3332a, this.f3359x);
                this.f3354t.setVisibility(4);
            }
        } else if (this.f3354t != null && this.f3352s && !TextUtils.isEmpty(this.f3350r)) {
            this.f3354t.setText(this.f3350r);
            o.a(this.f3332a, this.w);
            this.f3354t.setVisibility(0);
            this.f3354t.bringToFront();
            announceForAccessibility(this.f3350r);
        }
    }

    public final void u(boolean z9, boolean z10) {
        int defaultColor = this.f3364z0.getDefaultColor();
        int colorForState = this.f3364z0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f3364z0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z9) {
            this.R = colorForState2;
        } else if (z10) {
            this.R = colorForState;
        } else {
            this.R = defaultColor;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r8 = this;
            r5.f r0 = r8.D
            if (r0 == 0) goto L_0x017a
            int r0 = r8.M
            if (r0 != 0) goto L_0x000a
            goto L_0x017a
        L_0x000a:
            boolean r0 = r8.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r8.f3335d
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r8.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r8.f3335d
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r8.l()
            if (r4 != 0) goto L_0x0042
            androidx.appcompat.widget.i0 r4 = r8.f3345o
            if (r4 == 0) goto L_0x0043
            boolean r4 = r8.f3343m
            if (r4 == 0) goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            boolean r4 = r8.isEnabled()
            if (r4 != 0) goto L_0x004c
            int r4 = r8.E0
            goto L_0x007d
        L_0x004c:
            boolean r4 = r8.l()
            if (r4 == 0) goto L_0x005c
            android.content.res.ColorStateList r4 = r8.f3364z0
            if (r4 == 0) goto L_0x0057
            goto L_0x0068
        L_0x0057:
            int r4 = r8.getErrorCurrentTextColors()
            goto L_0x007d
        L_0x005c:
            boolean r4 = r8.f3343m
            if (r4 == 0) goto L_0x0071
            androidx.appcompat.widget.i0 r4 = r8.f3345o
            if (r4 == 0) goto L_0x0071
            android.content.res.ColorStateList r5 = r8.f3364z0
            if (r5 == 0) goto L_0x006c
        L_0x0068:
            r8.u(r0, r3)
            goto L_0x007f
        L_0x006c:
            int r4 = r4.getCurrentTextColor()
            goto L_0x007d
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            int r4 = r8.f3362y0
            goto L_0x007d
        L_0x0076:
            if (r3 == 0) goto L_0x007b
            int r4 = r8.f3360x0
            goto L_0x007d
        L_0x007b:
            int r4 = r8.f3358w0
        L_0x007d:
            r8.R = r4
        L_0x007f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x00c9
            android.content.Context r4 = r8.getContext()
            r5 = 2130903302(0x7f030106, float:1.7413418E38)
            android.util.TypedValue r5 = n5.b.a(r4, r5)
            r6 = 0
            if (r5 != 0) goto L_0x0094
            goto L_0x00a5
        L_0x0094:
            int r7 = r5.resourceId
            if (r7 == 0) goto L_0x009d
            android.content.res.ColorStateList r6 = y.a.b(r4, r7)
            goto L_0x00a5
        L_0x009d:
            int r4 = r5.data
            if (r4 == 0) goto L_0x00a5
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r4)
        L_0x00a5:
            android.widget.EditText r4 = r8.f3335d
            if (r4 == 0) goto L_0x00c9
            android.graphics.drawable.Drawable r4 = r4.getTextCursorDrawable()
            if (r4 == 0) goto L_0x00c9
            if (r6 != 0) goto L_0x00b2
            goto L_0x00c9
        L_0x00b2:
            android.widget.EditText r4 = r8.f3335d
            android.graphics.drawable.Drawable r4 = r4.getTextCursorDrawable()
            if (r1 == 0) goto L_0x00c6
            android.content.res.ColorStateList r1 = r8.f3364z0
            if (r1 == 0) goto L_0x00bf
            goto L_0x00c5
        L_0x00bf:
            int r1 = r8.R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x00c5:
            r6 = r1
        L_0x00c6:
            b0.a.b.h(r4, r6)
        L_0x00c9:
            com.google.android.material.textfield.a r1 = r8.f3334c
            r1.k()
            com.google.android.material.textfield.TextInputLayout r4 = r1.f3372a
            com.google.android.material.internal.CheckableImageButton r5 = r1.f3374c
            android.content.res.ColorStateList r6 = r1.f3375d
            v5.q.c(r4, r5, r6)
            com.google.android.material.textfield.TextInputLayout r4 = r1.f3372a
            com.google.android.material.internal.CheckableImageButton r5 = r1.f3378g
            android.content.res.ColorStateList r6 = r1.k
            v5.q.c(r4, r5, r6)
            v5.p r4 = r1.b()
            boolean r4 = r4 instanceof v5.o
            if (r4 == 0) goto L_0x011c
            com.google.android.material.textfield.TextInputLayout r4 = r1.f3372a
            boolean r4 = r4.l()
            if (r4 == 0) goto L_0x0111
            com.google.android.material.internal.CheckableImageButton r4 = r1.f3378g
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x0111
            com.google.android.material.internal.CheckableImageButton r4 = r1.f3378g
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            android.graphics.drawable.Drawable r4 = r4.mutate()
            com.google.android.material.textfield.TextInputLayout r5 = r1.f3372a
            int r5 = r5.getErrorCurrentTextColors()
            b0.a.b.g(r4, r5)
            com.google.android.material.internal.CheckableImageButton r1 = r1.f3378g
            r1.setImageDrawable(r4)
            goto L_0x011c
        L_0x0111:
            com.google.android.material.textfield.TextInputLayout r4 = r1.f3372a
            com.google.android.material.internal.CheckableImageButton r5 = r1.f3378g
            android.content.res.ColorStateList r6 = r1.k
            android.graphics.PorterDuff$Mode r1 = r1.f3382l
            v5.q.a(r4, r5, r6, r1)
        L_0x011c:
            v5.y r1 = r8.f3333b
            com.google.android.material.textfield.TextInputLayout r4 = r1.f12608a
            com.google.android.material.internal.CheckableImageButton r5 = r1.f12611d
            android.content.res.ColorStateList r1 = r1.f12612e
            v5.q.c(r4, r5, r1)
            int r1 = r8.M
            r4 = 2
            if (r1 != r4) goto L_0x015a
            int r1 = r8.O
            if (r0 == 0) goto L_0x0139
            boolean r4 = r8.isEnabled()
            if (r4 == 0) goto L_0x0139
            int r4 = r8.Q
            goto L_0x013b
        L_0x0139:
            int r4 = r8.P
        L_0x013b:
            r8.O = r4
            if (r4 == r1) goto L_0x015a
            boolean r1 = r8.e()
            if (r1 == 0) goto L_0x015a
            boolean r1 = r8.F0
            if (r1 != 0) goto L_0x015a
            boolean r1 = r8.e()
            if (r1 == 0) goto L_0x0157
            r5.f r1 = r8.D
            v5.i r1 = (v5.i) r1
            r4 = 0
            r1.o(r4, r4, r4, r4)
        L_0x0157:
            r8.i()
        L_0x015a:
            int r1 = r8.M
            if (r1 != r2) goto L_0x0177
            boolean r1 = r8.isEnabled()
            if (r1 != 0) goto L_0x0167
            int r0 = r8.B0
            goto L_0x0175
        L_0x0167:
            if (r3 == 0) goto L_0x016e
            if (r0 != 0) goto L_0x016e
            int r0 = r8.D0
            goto L_0x0175
        L_0x016e:
            if (r0 == 0) goto L_0x0173
            int r0 = r8.C0
            goto L_0x0175
        L_0x0173:
            int r0 = r8.A0
        L_0x0175:
            r8.S = r0
        L_0x0177:
            r8.b()
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v():void");
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3334c.f3378g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3334c.f3378g.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        a aVar = this.f3334c;
        if (aVar.f3378g.getContentDescription() != charSequence) {
            aVar.f3378g.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        a aVar = this.f3334c;
        aVar.f3378g.setImageDrawable(drawable);
        if (drawable != null) {
            q.a(aVar.f3372a, aVar.f3378g, aVar.k, aVar.f3382l);
            q.c(aVar.f3372a, aVar.f3378g, aVar.k);
        }
    }
}
