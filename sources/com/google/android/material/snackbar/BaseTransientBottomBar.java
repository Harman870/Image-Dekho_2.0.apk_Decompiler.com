package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import r5.i;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3315a = 0;

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final b f3316i = new b(this);

        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f3316i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (t5.a.a().f12024a) {
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (t5.a.a().f12024a) {
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        public final boolean s(View view) {
            this.f3316i.getClass();
            return view instanceof c;
        }
    }

    public class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            } else if (i10 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
        }
    }

    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f2907f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f2908g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f2905d = 0;
        }
    }

    public static class c extends FrameLayout {

        /* renamed from: j  reason: collision with root package name */
        public static final a f3317j = new a();

        /* renamed from: a  reason: collision with root package name */
        public BaseTransientBottomBar<?> f3318a;

        /* renamed from: b  reason: collision with root package name */
        public i f3319b;

        /* renamed from: c  reason: collision with root package name */
        public int f3320c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3321d;

        /* renamed from: e  reason: collision with root package name */
        public final float f3322e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3323f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3324g;

        /* renamed from: h  reason: collision with root package name */
        public ColorStateList f3325h;

        /* renamed from: i  reason: collision with root package name */
        public PorterDuff.Mode f3326i;

        public class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: r5.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(android.content.Context r5, android.util.AttributeSet r6) {
            /*
                r4 = this;
                r0 = 0
                android.content.Context r5 = x5.a.a(r5, r6, r0, r0)
                r4.<init>(r5, r6)
                android.content.Context r5 = r4.getContext()
                int[] r1 = c.a.W
                android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
                r2 = 6
                boolean r3 = r1.hasValue(r2)
                if (r3 == 0) goto L_0x0023
                int r2 = r1.getDimensionPixelSize(r2, r0)
                float r2 = (float) r2
                java.util.WeakHashMap<android.view.View, h0.l0> r3 = h0.y.f6776a
                h0.y.i.s(r4, r2)
            L_0x0023:
                r2 = 2
                int r2 = r1.getInt(r2, r0)
                r4.f3320c = r2
                r2 = 8
                boolean r2 = r1.hasValue(r2)
                if (r2 != 0) goto L_0x003a
                r2 = 9
                boolean r2 = r1.hasValue(r2)
                if (r2 == 0) goto L_0x0045
            L_0x003a:
                r5.i$a r6 = r5.i.b(r5, r6, r0, r0)
                r5.i r2 = new r5.i
                r2.<init>(r6)
                r4.f3319b = r2
            L_0x0045:
                r6 = 3
                r2 = 1065353216(0x3f800000, float:1.0)
                float r6 = r1.getFloat(r6, r2)
                r4.f3321d = r6
                r6 = 4
                android.content.res.ColorStateList r5 = n5.c.a(r5, r1, r6)
                r4.setBackgroundTintList(r5)
                r5 = 5
                r6 = -1
                int r5 = r1.getInt(r5, r6)
                android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
                android.graphics.PorterDuff$Mode r5 = j5.x.b(r5, r3)
                r4.setBackgroundTintMode(r5)
                r5 = 1
                float r2 = r1.getFloat(r5, r2)
                r4.f3322e = r2
                int r2 = r1.getDimensionPixelSize(r0, r6)
                r4.f3323f = r2
                r2 = 7
                int r6 = r1.getDimensionPixelSize(r2, r6)
                r4.f3324g = r6
                r1.recycle()
                com.google.android.material.snackbar.BaseTransientBottomBar$c$a r6 = f3317j
                r4.setOnTouchListener(r6)
                r4.setFocusable(r5)
                android.graphics.drawable.Drawable r5 = r4.getBackground()
                if (r5 != 0) goto L_0x00db
                float r5 = r4.getBackgroundOverlayColorAlpha()
                r6 = 2130903344(0x7f030130, float:1.7413503E38)
                int r6 = c6.b.t(r4, r6)
                r1 = 2130903321(0x7f030119, float:1.7413457E38)
                int r1 = c6.b.t(r4, r1)
                int r5 = c6.b.v(r5, r6, r1)
                r5.i r6 = r4.f3319b
                if (r6 == 0) goto L_0x00b3
                int r0 = com.google.android.material.snackbar.BaseTransientBottomBar.f3315a
                r5.f r0 = new r5.f
                r0.<init>((r5.i) r6)
                android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
                r0.k(r5)
                goto L_0x00cf
            L_0x00b3:
                android.content.res.Resources r6 = r4.getResources()
                int r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f3315a
                r1 = 2131100381(0x7f0602dd, float:1.7813142E38)
                float r6 = r6.getDimension(r1)
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r1.setShape(r0)
                r1.setCornerRadius(r6)
                r1.setColor(r5)
                r0 = r1
            L_0x00cf:
                android.content.res.ColorStateList r5 = r4.f3325h
                if (r5 == 0) goto L_0x00d6
                b0.a.b.h(r0, r5)
            L_0x00d6:
                java.util.WeakHashMap<android.view.View, h0.l0> r5 = h0.y.f6776a
                h0.y.d.q(r4, r0)
            L_0x00db:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.c.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f3318a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f3322e;
        }

        public int getAnimationMode() {
            return this.f3320c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f3321d;
        }

        public int getMaxInlineActionWidth() {
            return this.f3324g;
        }

        public int getMaxWidth() {
            return this.f3323f;
        }

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f3318a != null) {
                BaseTransientBottomBar.a();
            }
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.h.c(this);
        }

        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f3318a != null) {
                synchronized (t5.a.a().f12024a) {
                }
            }
        }

        public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
            super.onLayout(z9, i10, i11, i12, i13);
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f3323f > 0 && getMeasuredWidth() > (i12 = this.f3323f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setAnimationMode(int i10) {
            this.f3320c = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f3325h == null)) {
                drawable = drawable.mutate();
                a.b.h(drawable, this.f3325h);
                a.b.i(drawable, this.f3326i);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f3325h = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.h(mutate, colorStateList);
                a.b.i(mutate, this.f3326i);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f3326i = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.i(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.f3318a != null) {
                    int i10 = BaseTransientBottomBar.f3315a;
                    throw null;
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f3317j);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = s4.a.f11855a;
        new Handler(Looper.getMainLooper(), new a());
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
    }
}
