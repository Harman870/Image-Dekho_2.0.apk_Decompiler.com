package com.xw.repo.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.widget.NestedScrollView;

public class BounceScrollView extends NestedScrollView {
    public boolean D;
    public float E;
    public boolean F;
    public long G;
    public int H;
    public boolean I;
    public Interpolator J;
    public View K;
    public float L;
    public int M;
    public int N;
    public ObjectAnimator O;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BounceScrollView.this.getClass();
            Math.abs((int) floatValue);
            throw null;
        }
    }

    public static class b implements Interpolator {
        public final float getInterpolation(float f10) {
            return (float) (1.0d - Math.pow((double) (1.0f - f10), 4.0d));
        }
    }

    public interface c {
        void a();
    }

    public interface d {
        void a();
    }

    public BounceScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        setOverScrollMode(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2351m, 0, 0);
        this.E = obtainStyledAttributes.getFloat(1, 4.0f);
        this.D = obtainStyledAttributes.getInt(5, 0) == 1;
        this.F = obtainStyledAttributes.getBoolean(3, true);
        this.G = (long) obtainStyledAttributes.getInt(0, 400);
        this.H = obtainStyledAttributes.getInt(6, 20);
        this.I = obtainStyledAttributes.getBoolean(2, false);
        boolean z9 = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        setNestedScrollingEnabled(z9);
        this.J = new b();
    }

    public final boolean canScrollHorizontally(int i10) {
        return this.D;
    }

    public final boolean canScrollVertically(int i10) {
        return !this.D;
    }

    public long getBounceDelay() {
        return this.G;
    }

    public float getDamping() {
        return this.E;
    }

    public int getTriggerOverScrollThreshold() {
        return this.H;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.O.cancel();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((this.K == null && getChildCount() > 0) || this.K != getChildAt(0)) {
            this.K = getChildAt(0);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0 != 3) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (getScrollX() == r0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        if (getScrollY() == r0) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            android.view.View r0 = r11.K
            if (r0 == 0) goto L_0x013e
            boolean r0 = r11.I
            if (r0 == 0) goto L_0x000a
            goto L_0x013e
        L_0x000a:
            int r0 = r12.getActionMasked()
            if (r0 == 0) goto L_0x012a
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x00e6
            r3 = 2
            if (r0 == r3) goto L_0x001c
            r3 = 3
            if (r0 == r3) goto L_0x00e6
            goto L_0x0139
        L_0x001c:
            boolean r0 = r11.D
            if (r0 == 0) goto L_0x0025
            float r0 = r12.getX()
            goto L_0x0029
        L_0x0025:
            float r0 = r12.getY()
        L_0x0029:
            float r3 = r11.L
            float r3 = r3 - r0
            boolean r4 = r11.D
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x0044
            android.view.View r4 = r11.K
            float r4 = r4.getTranslationX()
            float r4 = java.lang.Math.abs(r4)
            float r4 = r4 * r5
            android.view.View r6 = r11.K
            int r6 = r6.getMeasuredWidth()
            goto L_0x0055
        L_0x0044:
            android.view.View r4 = r11.K
            float r4 = r4.getTranslationY()
            float r4 = java.lang.Math.abs(r4)
            float r4 = r4 * r5
            android.view.View r6 = r11.K
            int r6 = r6.getMeasuredHeight()
        L_0x0055:
            float r6 = (float) r6
            float r4 = r4 / r6
            double r6 = (double) r4
            r8 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r6 = r6 + r8
            float r4 = (float) r6
            boolean r6 = r11.F
            if (r6 == 0) goto L_0x0070
            float r6 = r11.E
            double r7 = (double) r4
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r7, r9)
            float r4 = (float) r7
            float r5 = r5 - r4
            float r6 = r6 / r5
            goto L_0x0072
        L_0x0070:
            float r6 = r11.E
        L_0x0072:
            float r3 = r3 / r6
            int r3 = (int) r3
            r11.L = r0
            int r0 = r11.M
            if (r0 > 0) goto L_0x007d
            if (r3 <= 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            if (r0 < 0) goto L_0x0083
            if (r3 >= 0) goto L_0x0083
        L_0x0081:
            r0 = r2
            goto L_0x0084
        L_0x0083:
            r0 = r1
        L_0x0084:
            r11.M = r3
            if (r0 == 0) goto L_0x0139
            if (r3 >= 0) goto L_0x009c
            boolean r0 = r11.D
            if (r0 == 0) goto L_0x0095
            int r0 = r11.getScrollX()
            if (r0 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x0095:
            int r0 = r11.getScrollY()
            if (r0 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x009c:
            boolean r0 = r11.D
            if (r0 == 0) goto L_0x00b5
            android.view.View r0 = r11.K
            int r0 = r0.getMeasuredWidth()
            int r4 = r11.getWidth()
            int r0 = r0 - r4
            if (r0 >= 0) goto L_0x00ae
            r0 = r2
        L_0x00ae:
            int r4 = r11.getScrollX()
            if (r4 != r0) goto L_0x00ca
            goto L_0x00cb
        L_0x00b5:
            android.view.View r0 = r11.K
            int r0 = r0.getMeasuredHeight()
            int r4 = r11.getHeight()
            int r0 = r0 - r4
            if (r0 >= 0) goto L_0x00c3
            r0 = r2
        L_0x00c3:
            int r4 = r11.getScrollY()
            if (r4 != r0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = r2
        L_0x00cb:
            if (r1 == 0) goto L_0x0139
            int r0 = r11.N
            int r0 = r0 + r3
            r11.N = r0
            boolean r1 = r11.D
            if (r1 == 0) goto L_0x00de
            android.view.View r1 = r11.K
            int r0 = -r0
            float r0 = (float) r0
            r1.setTranslationX(r0)
            goto L_0x0139
        L_0x00de:
            android.view.View r1 = r11.K
            int r0 = -r0
            float r0 = (float) r0
            r1.setTranslationY(r0)
            goto L_0x0139
        L_0x00e6:
            r11.M = r2
            r11.N = r2
            android.animation.ObjectAnimator r0 = r11.O
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00f9
            android.animation.ObjectAnimator r0 = r11.O
            r0.cancel()
        L_0x00f9:
            boolean r0 = r11.D
            r3 = 0
            if (r0 == 0) goto L_0x010b
            android.view.View r0 = r11.K
            android.util.Property r4 = android.view.View.TRANSLATION_X
            float[] r1 = new float[r1]
            r1[r2] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r1)
            goto L_0x0117
        L_0x010b:
            android.view.View r0 = r11.K
            android.util.Property r4 = android.view.View.TRANSLATION_Y
            float[] r1 = new float[r1]
            r1[r2] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r1)
        L_0x0117:
            r11.O = r0
            long r1 = r11.G
            android.animation.ObjectAnimator r0 = r0.setDuration(r1)
            android.view.animation.Interpolator r1 = r11.J
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r11.O
            r0.start()
            goto L_0x0139
        L_0x012a:
            boolean r0 = r11.D
            if (r0 == 0) goto L_0x0133
            float r0 = r12.getX()
            goto L_0x0137
        L_0x0133:
            float r0 = r12.getY()
        L_0x0137:
            r11.L = r0
        L_0x0139:
            boolean r12 = super.onTouchEvent(r12)
            return r12
        L_0x013e:
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xw.repo.widget.BounceScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBounceDelay(long j10) {
        if (j10 >= 0) {
            this.G = j10;
        }
    }

    public void setBounceInterpolator(Interpolator interpolator) {
        this.J = interpolator;
    }

    public void setDamping(float f10) {
        if (this.E > 0.0f) {
            this.E = f10;
        }
    }

    public void setDisableBounce(boolean z9) {
        this.I = z9;
    }

    public void setIncrementalDamping(boolean z9) {
        this.F = z9;
    }

    public void setOnOverScrollListener(c cVar) {
    }

    public void setOnScrollListener(d dVar) {
    }

    public void setScrollHorizontally(boolean z9) {
        this.D = z9;
    }

    public void setTriggerOverScrollThreshold(int i10) {
        if (i10 >= 0) {
            this.H = i10;
        }
    }
}
