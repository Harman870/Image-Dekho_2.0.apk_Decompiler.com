package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import s4.g;
import s4.h;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3437c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f3438d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f3439e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3440f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public float f3441g;

    /* renamed from: h  reason: collision with root package name */
    public float f3442h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3443a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3444b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3445c;

        public a(boolean z9, View view, View view2) {
            this.f3443a = z9;
            this.f3444b = view;
            this.f3445c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f3443a) {
                this.f3444b.setVisibility(4);
                this.f3445c.setAlpha(1.0f);
                this.f3445c.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f3443a) {
                this.f3444b.setVisibility(0);
                this.f3445c.setAlpha(0.0f);
                this.f3445c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f3446a;

        /* renamed from: b  reason: collision with root package name */
        public c6.b f3447b;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Pair u(float f10, float f11, boolean z9, b bVar) {
        String str;
        g gVar;
        h hVar;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVar = bVar.f3446a.d("translationXLinear");
            gVar = bVar.f3446a;
            str = "translationYLinear";
        } else if ((!z9 || f11 >= 0.0f) && (z9 || i10 <= 0)) {
            hVar = bVar.f3446a.d("translationXCurveDownwards");
            gVar = bVar.f3446a;
            str = "translationYCurveDownwards";
        } else {
            hVar = bVar.f3446a.d("translationXCurveUpwards");
            gVar = bVar.f3446a;
            str = "translationYCurveUpwards";
        }
        return new Pair(hVar, gVar.d(str));
    }

    public static float x(b bVar, h hVar, float f10) {
        long j10 = hVar.f11869a;
        long j11 = hVar.f11870b;
        h d10 = bVar.f3446a.d("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((d10.f11869a + d10.f11870b) + 17) - j10)) / ((float) j11));
        LinearInterpolator linearInterpolator = s4.a.f11855a;
        return com.ironsource.adapters.ironsource.a.e(0.0f, f10, interpolation, f10);
    }

    public final boolean b(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f1242h == 0) {
            fVar.f1242h = 80;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x040a A[LOOP:1: B:113:0x0408->B:114:0x040a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x038a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet t(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            android.content.Context r4 = r29.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.z(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r28.getTranslationX()
            r0.f3441g = r5
            float r5 = r28.getTranslationY()
            r0.f3442h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, h0.l0> r7 = h0.y.f6776a
            float r7 = h0.y.i.i(r29)
            float r8 = h0.y.i.i(r28)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r31 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            s4.g r11 = r4.f3446a
            java.lang.String r12 = "elevation"
            s4.h r11 = r11.d(r12)
            r11.a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f3438d
            c6.b r11 = r4.f3447b
            float r11 = r0.v(r1, r2, r11)
            c6.b r12 = r4.f3447b
            float r12 = r0.w(r1, r2, r12)
            android.util.Pair r13 = u(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            s4.h r14 = (s4.h) r14
            java.lang.Object r13 = r13.second
            s4.h r13 = (s4.h) r13
            if (r3 == 0) goto L_0x00c6
            if (r31 != 0) goto L_0x0088
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x0088:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = x(r4, r14, r11)
            float r12 = x(r4, r13, r12)
            android.graphics.Rect r15 = r0.f3437c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f3438d
            r8.set(r15)
            android.graphics.RectF r15 = r0.f3439e
            r0.y(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto L_0x00de
        L_0x00c6:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r9]
            float r11 = -r11
            r8[r10] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        L_0x00de:
            r14.a(r6)
            r13.a(r8)
            r5.add(r6)
            r5.add(r8)
            float r6 = r7.width()
            float r7 = r7.height()
            c6.b r8 = r4.f3447b
            float r8 = r0.v(r1, r2, r8)
            c6.b r11 = r4.f3447b
            float r11 = r0.w(r1, r2, r11)
            android.util.Pair r12 = u(r8, r11, r3, r4)
            java.lang.Object r13 = r12.first
            s4.h r13 = (s4.h) r13
            java.lang.Object r12 = r12.second
            s4.h r12 = (s4.h) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            float r8 = r0.f3441g
        L_0x0113:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            float r11 = r0.f3442h
        L_0x0122:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.a(r8)
            r12.a(r11)
            r5.add(r8)
            r5.add(r11)
            boolean r8 = r2 instanceof c5.d
            if (r8 == 0) goto L_0x018c
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x013d
            goto L_0x018c
        L_0x013d:
            r11 = r2
            c5.d r11 = (c5.d) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x014a
            goto L_0x018c
        L_0x014a:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0161
            if (r31 != 0) goto L_0x0156
            r12.setAlpha(r13)
        L_0x0156:
            s4.d r13 = s4.d.f11862a
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x016b
        L_0x0161:
            s4.d r14 = s4.d.f11862a
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x016b:
            com.google.android.material.transformation.a r14 = new com.google.android.material.transformation.a
            r14.<init>(r2)
            r13.addUpdateListener(r14)
            s4.g r14 = r4.f3446a
            java.lang.String r15 = "iconFade"
            s4.h r14 = r14.d(r15)
            r14.a(r13)
            r5.add(r13)
            com.google.android.material.transformation.b r13 = new com.google.android.material.transformation.b
            r13.<init>(r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x018e
        L_0x018c:
            r11 = r16
        L_0x018e:
            if (r8 != 0) goto L_0x0198
            r26 = r4
            r3 = r5
            r18 = r8
            r1 = r11
            goto L_0x032a
        L_0x0198:
            r12 = r2
            c5.d r12 = (c5.d) r12
            c6.b r13 = r4.f3447b
            android.graphics.RectF r14 = r0.f3438d
            android.graphics.RectF r15 = r0.f3439e
            r0.y(r1, r14)
            float r9 = r0.f3441g
            float r10 = r0.f3442h
            r14.offset(r9, r10)
            r0.y(r2, r15)
            float r9 = r0.v(r1, r2, r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            c6.b r10 = r4.f3447b
            android.graphics.RectF r13 = r0.f3438d
            android.graphics.RectF r14 = r0.f3439e
            r0.y(r1, r13)
            float r15 = r0.f3441g
            r18 = r8
            float r8 = r0.f3442h
            r13.offset(r15, r8)
            r0.y(r2, r14)
            float r8 = r0.w(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.f3437c
            boolean r14 = h0.y.g.c(r10)
            if (r14 == 0) goto L_0x01fd
            int r14 = r10.getWidth()
            int r15 = r10.getHeight()
            r1 = 0
            r13.set(r1, r1, r14, r15)
            r10.k(r13)
        L_0x01fd:
            android.graphics.Rect r1 = r0.f3437c
            int r1 = r1.width()
            float r1 = (float) r1
            r10 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r10
            s4.g r10 = r4.f3446a
            java.lang.String r13 = "expansion"
            s4.h r10 = r10.d(r13)
            if (r3 == 0) goto L_0x0298
            if (r31 != 0) goto L_0x021b
            c5.d$d r15 = new c5.d$d
            r15.<init>(r9, r8, r1)
            r12.setRevealInfo(r15)
        L_0x021b:
            if (r31 == 0) goto L_0x0223
            c5.d$d r1 = r12.getRevealInfo()
            float r1 = r1.f2465c
        L_0x0223:
            r15 = 0
            float r13 = r15 - r9
            float r14 = r15 - r8
            r15 = r4
            double r3 = (double) r13
            double r13 = (double) r14
            r21 = r1
            double r0 = java.lang.Math.hypot(r3, r13)
            float r0 = (float) r0
            float r6 = r6 - r9
            r22 = r5
            double r5 = (double) r6
            double r13 = java.lang.Math.hypot(r5, r13)
            float r1 = (float) r13
            float r7 = r7 - r8
            double r13 = (double) r7
            double r5 = java.lang.Math.hypot(r5, r13)
            float r5 = (float) r5
            double r3 = java.lang.Math.hypot(r3, r13)
            float r3 = (float) r3
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0254
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0254
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0254
            goto L_0x0265
        L_0x0254:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x025e
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x025e
            r0 = r1
            goto L_0x0265
        L_0x025e:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0264
            r0 = r5
            goto L_0x0265
        L_0x0264:
            r0 = r3
        L_0x0265:
            android.animation.AnimatorSet r0 = c5.b.a(r12, r9, r8, r0)
            com.google.android.material.transformation.c r1 = new com.google.android.material.transformation.c
            r1.<init>(r12)
            r0.addListener(r1)
            long r3 = r10.f11869a
            int r1 = (int) r9
            int r5 = (int) r8
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x028d
            r8 = r21
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r5, r8, r8)
            r1.setStartDelay(r6)
            r1.setDuration(r3)
            r3 = r22
            r3.add(r1)
            goto L_0x028f
        L_0x028d:
            r3 = r22
        L_0x028f:
            r1 = r10
            r21 = r11
            r22 = r12
            r26 = r15
            goto L_0x0318
        L_0x0298:
            r15 = r4
            r3 = r5
            c5.d$d r0 = r12.getRevealInfo()
            float r0 = r0.f2465c
            android.animation.AnimatorSet r4 = c5.b.a(r12, r9, r8, r1)
            long r5 = r10.f11869a
            int r7 = (int) r9
            int r8 = (int) r8
            r13 = 0
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x02bb
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r0, r0)
            r0.setStartDelay(r13)
            r0.setDuration(r5)
            r3.add(r0)
        L_0x02bb:
            long r5 = r10.f11869a
            long r13 = r10.f11870b
            r0 = r15
            s4.g r9 = r0.f3446a
            m.h<java.lang.String, s4.h> r15 = r9.f11867a
            int r15 = r15.f9301c
            r19 = r4
            r21 = r11
            r22 = r12
            r4 = 0
            r11 = 0
        L_0x02cf:
            if (r4 >= r15) goto L_0x02f9
            r20 = r15
            m.h<java.lang.String, s4.h> r15 = r9.f11867a
            java.lang.Object r15 = r15.l(r4)
            s4.h r15 = (s4.h) r15
            r24 = r9
            r23 = r10
            long r9 = r15.f11869a
            r26 = r0
            r25 = r1
            long r0 = r15.f11870b
            long r9 = r9 + r0
            long r11 = java.lang.Math.max(r11, r9)
            int r4 = r4 + 1
            r15 = r20
            r10 = r23
            r9 = r24
            r1 = r25
            r0 = r26
            goto L_0x02cf
        L_0x02f9:
            r26 = r0
            r25 = r1
            r23 = r10
            long r5 = r5 + r13
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0314
            r1 = r25
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r1, r1)
            r0.setStartDelay(r5)
            long r11 = r11 - r5
            r0.setDuration(r11)
            r3.add(r0)
        L_0x0314:
            r0 = r19
            r1 = r23
        L_0x0318:
            r1.a(r0)
            r3.add(r0)
            c5.a r0 = new c5.a
            r1 = r22
            r0.<init>(r1)
            r1 = r21
            r1.add(r0)
        L_0x032a:
            if (r18 != 0) goto L_0x0331
            r6 = r30
            r4 = r26
            goto L_0x0385
        L_0x0331:
            r0 = r2
            c5.d r0 = (c5.d) r0
            java.util.WeakHashMap<android.view.View, h0.l0> r4 = h0.y.f6776a
            android.content.res.ColorStateList r4 = h0.y.i.g(r28)
            if (r4 == 0) goto L_0x0349
            int[] r5 = r28.getDrawableState()
            int r6 = r4.getDefaultColor()
            int r4 = r4.getColorForState(r5, r6)
            goto L_0x034a
        L_0x0349:
            r4 = 0
        L_0x034a:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = r30
            if (r6 == 0) goto L_0x0364
            if (r31 != 0) goto L_0x0357
            r0.setCircularRevealScrimColor(r4)
        L_0x0357:
            c5.d$c r4 = c5.d.c.f2462a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
            goto L_0x0370
        L_0x0364:
            r7 = 1
            r9 = 0
            c5.d$c r5 = c5.d.c.f2462a
            int[] r8 = new int[r7]
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r8)
        L_0x0370:
            s4.b r4 = s4.b.f11860a
            r0.setEvaluator(r4)
            r4 = r26
            s4.g r5 = r4.f3446a
            java.lang.String r7 = "color"
            s4.h r5 = r5.d(r7)
            r5.a(r0)
            r3.add(r0)
        L_0x0385:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x038a
            goto L_0x03b7
        L_0x038a:
            r5 = 2131296610(0x7f090162, float:1.8211142E38)
            android.view.View r5 = r2.findViewById(r5)
            r7 = 0
            if (r5 == 0) goto L_0x0395
            goto L_0x03ad
        L_0x0395:
            boolean r5 = r2 instanceof y5.c
            if (r5 != 0) goto L_0x03a4
            boolean r5 = r2 instanceof y5.b
            if (r5 == 0) goto L_0x039e
            goto L_0x03a4
        L_0x039e:
            if (r0 == 0) goto L_0x03b5
            r7 = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x03b5
        L_0x03a4:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = 0
            android.view.View r0 = r0.getChildAt(r5)
            r5 = r0
        L_0x03ad:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x03b5
            r7 = r5
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L_0x03b5:
            if (r7 != 0) goto L_0x03b9
        L_0x03b7:
            r9 = 0
            goto L_0x03f1
        L_0x03b9:
            if (r6 == 0) goto L_0x03d6
            if (r31 != 0) goto L_0x03c7
            s4.c r0 = s4.c.f11861a
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r0.set(r7, r5)
        L_0x03c7:
            s4.c r0 = s4.c.f11861a
            r5 = 1
            float[] r5 = new float[r5]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r5[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r5)
            goto L_0x03e3
        L_0x03d6:
            r5 = 1
            r9 = 0
            s4.c r0 = s4.c.f11861a
            float[] r5 = new float[r5]
            r8 = 0
            r5[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r5)
        L_0x03e3:
            s4.g r4 = r4.f3446a
            java.lang.String r5 = "contentFade"
            s4.h r4 = r4.d(r5)
            r4.a(r0)
            r3.add(r0)
        L_0x03f1:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            z5.c.n(r0, r3)
            com.google.android.material.transformation.FabTransformationBehavior$a r3 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r28
            r3.<init>(r6, r2, r4)
            r0.addListener(r3)
            int r2 = r1.size()
            r10 = r9
        L_0x0408:
            if (r10 >= r2) goto L_0x0416
            java.lang.Object r3 = r1.get(r10)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r10 = r10 + 1
            goto L_0x0408
        L_0x0416:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, c6.b bVar) {
        RectF rectF = this.f3438d;
        RectF rectF2 = this.f3439e;
        y(view, rectF);
        rectF.offset(this.f3441g, this.f3442h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, c6.b bVar) {
        RectF rectF = this.f3438d;
        RectF rectF2 = this.f3439e;
        y(view, rectF);
        rectF.offset(this.f3441g, this.f3442h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f3440f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public abstract b z(Context context, boolean z9);
}
