package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import b0.a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.imgdkh.app.R;
import j5.n;
import java.util.ArrayList;
import java.util.Iterator;
import r5.m;

public class d {
    public static final w0.a C = s4.a.f11857c;
    public static final int D = R.attr.motionDurationLong2;
    public static final int E = R.attr.motionEasingEmphasizedInterpolator;
    public static final int F = R.attr.motionDurationMedium1;
    public static final int G = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {16842919, 16842910};
    public static final int[] I = {16843623, 16842908, 16842910};
    public static final int[] J = {16842908, 16842910};
    public static final int[] K = {16843623, 16842910};
    public static final int[] L = {16842910};
    public static final int[] M = new int[0];
    public final Matrix A = new Matrix();
    public i5.c B;

    /* renamed from: a  reason: collision with root package name */
    public r5.i f3215a;

    /* renamed from: b  reason: collision with root package name */
    public r5.f f3216b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f3217c;

    /* renamed from: d  reason: collision with root package name */
    public i5.a f3218d;

    /* renamed from: e  reason: collision with root package name */
    public LayerDrawable f3219e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3220f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3221g = true;

    /* renamed from: h  reason: collision with root package name */
    public float f3222h;

    /* renamed from: i  reason: collision with root package name */
    public float f3223i;

    /* renamed from: j  reason: collision with root package name */
    public float f3224j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f3225l;

    /* renamed from: m  reason: collision with root package name */
    public s4.g f3226m;

    /* renamed from: n  reason: collision with root package name */
    public s4.g f3227n;

    /* renamed from: o  reason: collision with root package name */
    public float f3228o;

    /* renamed from: p  reason: collision with root package name */
    public float f3229p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public int f3230q;

    /* renamed from: r  reason: collision with root package name */
    public int f3231r = 0;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3232s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3233t;
    public ArrayList<f> u;

    /* renamed from: v  reason: collision with root package name */
    public final FloatingActionButton f3234v;
    public final q5.b w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f3235x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final RectF f3236y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f3237z = new RectF();

    public class a extends s4.f {
        public a() {
        }

        public final Object evaluate(float f10, Object obj, Object obj2) {
            d.this.f3229p = f10;
            ((Matrix) obj).getValues(this.f11864a);
            ((Matrix) obj2).getValues(this.f11865b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f11865b;
                float f11 = fArr[i10];
                float f12 = this.f11864a[i10];
                fArr[i10] = com.ironsource.adapters.ironsource.a.e(f11, f12, f10, f12);
            }
            this.f11866c.setValues(this.f11865b);
            return this.f11866c;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f3239a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f3240b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f3241c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f3242d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f3243e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f3244f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f3245g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f3246h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f3239a = f10;
            this.f3240b = f11;
            this.f3241c = f12;
            this.f3242d = f13;
            this.f3243e = f14;
            this.f3244f = f15;
            this.f3245g = f16;
            this.f3246h = matrix;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f3234v.setAlpha(s4.a.a(this.f3239a, this.f3240b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = d.this.f3234v;
            float f10 = this.f3241c;
            floatingActionButton.setScaleX(((this.f3242d - f10) * floatValue) + f10);
            FloatingActionButton floatingActionButton2 = d.this.f3234v;
            float f11 = this.f3243e;
            floatingActionButton2.setScaleY(((this.f3242d - f11) * floatValue) + f11);
            d dVar = d.this;
            float f12 = this.f3244f;
            float f13 = this.f3245g;
            dVar.f3229p = com.ironsource.adapters.ironsource.a.e(f13, f12, floatValue, f12);
            dVar.a(com.ironsource.adapters.ironsource.a.e(f13, f12, floatValue, f12), this.f3246h);
            d.this.f3234v.setImageMatrix(this.f3246h);
        }
    }

    public class c extends i {
        public c(i5.d dVar) {
            super(dVar);
        }

        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    public class C0028d extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f3248e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0028d(i5.d dVar) {
            super(dVar);
            this.f3248e = dVar;
        }

        public final float a() {
            d dVar = this.f3248e;
            return dVar.f3222h + dVar.f3223i;
        }
    }

    public class e extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f3249e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(i5.d dVar) {
            super(dVar);
            this.f3249e = dVar;
        }

        public final float a() {
            d dVar = this.f3249e;
            return dVar.f3222h + dVar.f3224j;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
    }

    public class h extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f3250e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(i5.d dVar) {
            super(dVar);
            this.f3250e = dVar;
        }

        public final float a() {
            return this.f3250e.f3222h;
        }
    }

    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3251a;

        /* renamed from: b  reason: collision with root package name */
        public float f3252b;

        /* renamed from: c  reason: collision with root package name */
        public float f3253c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f3254d;

        public i(i5.d dVar) {
            this.f3254d = dVar;
        }

        public abstract float a();

        public final void onAnimationEnd(Animator animator) {
            d dVar = this.f3254d;
            float f10 = (float) ((int) this.f3253c);
            r5.f fVar = dVar.f3216b;
            if (fVar != null) {
                fVar.j(f10);
            }
            this.f3251a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            if (!this.f3251a) {
                r5.f fVar = this.f3254d.f3216b;
                if (fVar == null) {
                    f10 = 0.0f;
                } else {
                    f10 = fVar.f11660a.f11693n;
                }
                this.f3252b = f10;
                this.f3253c = a();
                this.f3251a = true;
            }
            d dVar = this.f3254d;
            float f11 = this.f3252b;
            float animatedFraction = (float) ((int) ((valueAnimator.getAnimatedFraction() * (this.f3253c - f11)) + f11));
            r5.f fVar2 = dVar.f3216b;
            if (fVar2 != null) {
                fVar2.j(animatedFraction);
            }
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f3234v = floatingActionButton;
        this.w = bVar;
        n nVar = new n();
        i5.d dVar = (i5.d) this;
        nVar.a(H, d(new e(dVar)));
        nVar.a(I, d(new C0028d(dVar)));
        nVar.a(J, d(new C0028d(dVar)));
        nVar.a(K, d(new C0028d(dVar)));
        nVar.a(L, d(new h(dVar)));
        nVar.a(M, d(new c(dVar)));
        this.f3228o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f3234v.getDrawable();
        if (drawable != null && this.f3230q != 0) {
            RectF rectF = this.f3236y;
            RectF rectF2 = this.f3237z;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f3230q;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f3230q;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    public final AnimatorSet b(s4.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f3234v, View.ALPHA, new float[]{f10});
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f3234v, View.SCALE_X, new float[]{f11});
        gVar.d("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new i5.b());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f3234v, View.SCALE_Y, new float[]{f11});
        gVar.d("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new i5.b());
        }
        arrayList.add(ofFloat3);
        a(f12, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f3234v, new s4.e(), new a(), new Matrix[]{new Matrix(this.A)});
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        z5.c.n(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this.f3234v.getAlpha(), f10, this.f3234v.getScaleX(), f11, this.f3234v.getScaleY(), this.f3229p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        z5.c.n(animatorSet, arrayList);
        animatorSet.setDuration((long) k5.a.c(this.f3234v.getContext(), i10, this.f3234v.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(k5.a.d(this.f3234v.getContext(), i11, s4.a.f11856b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int sizeDimension = this.f3220f ? (this.k - this.f3234v.getSizeDimension()) / 2 : 0;
        float e10 = this.f3221g ? e() + this.f3224j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) e10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (e10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f10, float f11, float f12) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f3217c;
        if (drawable != null) {
            a.b.h(drawable, o5.a.a(colorStateList));
        }
    }

    public final void n(r5.i iVar) {
        this.f3215a = iVar;
        r5.f fVar = this.f3216b;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(iVar);
        }
        Drawable drawable = this.f3217c;
        if (drawable instanceof m) {
            ((m) drawable).setShapeAppearanceModel(iVar);
        }
        i5.a aVar = this.f3218d;
        if (aVar != null) {
            aVar.f7869o = iVar;
            aVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r8 = this;
            android.graphics.Rect r0 = r8.f3235x
            r8.f(r0)
            android.graphics.drawable.LayerDrawable r1 = r8.f3219e
            java.lang.String r2 = "Didn't initialize content background"
            c6.b.o(r1, r2)
            boolean r1 = r8.o()
            if (r1 == 0) goto L_0x0025
            android.graphics.drawable.InsetDrawable r1 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.LayerDrawable r3 = r8.f3219e
            int r4 = r0.left
            int r5 = r0.top
            int r6 = r0.right
            int r7 = r0.bottom
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            q5.b r2 = r8.w
            goto L_0x0029
        L_0x0025:
            q5.b r2 = r8.w
            android.graphics.drawable.LayerDrawable r1 = r8.f3219e
        L_0x0029:
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton.b) r2
            if (r1 == 0) goto L_0x0033
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = com.google.android.material.floatingactionbutton.FloatingActionButton.this
            com.google.android.material.floatingactionbutton.d.super.setBackgroundDrawable(r1)
            goto L_0x0036
        L_0x0033:
            r2.getClass()
        L_0x0036:
            q5.b r1 = r8.w
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r0 = r0.bottom
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton.b) r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = com.google.android.material.floatingactionbutton.FloatingActionButton.this
            android.graphics.Rect r5 = r5.f3198m
            r5.set(r2, r3, r4, r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.this
            int r5 = r1.f3196j
            int r2 = r2 + r5
            int r3 = r3 + r5
            int r4 = r4 + r5
            int r0 = r0 + r5
            r1.setPadding(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.d.q():void");
    }
}
