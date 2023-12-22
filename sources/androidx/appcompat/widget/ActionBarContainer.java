package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import y3.a;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f520a;

    /* renamed from: b  reason: collision with root package name */
    public b1 f521b;

    /* renamed from: c  reason: collision with root package name */
    public View f522c;

    /* renamed from: d  reason: collision with root package name */
    public View f523d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f524e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f525f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f526g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f527h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f528i;

    /* renamed from: j  reason: collision with root package name */
    public int f529j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13024e);
        boolean z9 = false;
        this.f524e = obtainStyledAttributes.getDrawable(0);
        this.f525f = obtainStyledAttributes.getDrawable(2);
        this.f529j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f527h = true;
            this.f526g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f527h ? this.f524e == null && this.f525f == null : this.f526g == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f524e;
        if (drawable != null && drawable.isStateful()) {
            this.f524e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f525f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f525f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f526g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f526g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f521b;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f524e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f525f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f526g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f522c = findViewById(R.id.action_bar);
        this.f523d = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f520a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            androidx.appcompat.widget.b1 r5 = r4.f521b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f527h
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.f526g
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.f524e
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f522c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x006d
            android.graphics.drawable.Drawable r6 = r4.f524e
            android.view.View r7 = r4.f522c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f522c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f522c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f522c
            goto L_0x008d
        L_0x006d:
            android.view.View r6 = r4.f523d
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.f524e
            android.view.View r7 = r4.f523d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f523d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f523d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f523d
        L_0x008d:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.f524e
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.f528i = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f525f
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f522c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L_0x001c
            int r0 = r6.f529j
            if (r0 < 0) goto L_0x001c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L_0x001c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f522c
            if (r7 != 0) goto L_0x0024
            return
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            androidx.appcompat.widget.b1 r0 = r6.f521b
            if (r0 == 0) goto L_0x0089
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0089
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L_0x0089
            android.view.View r0 = r6.f522c
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x004d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = r4
            goto L_0x004e
        L_0x004d:
            r0 = r3
        L_0x004e:
            if (r0 != 0) goto L_0x0053
            android.view.View r0 = r6.f522c
            goto L_0x0069
        L_0x0053:
            android.view.View r0 = r6.f523d
            if (r0 == 0) goto L_0x0065
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x0065
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r3 = r4
        L_0x0065:
            if (r3 != 0) goto L_0x006d
            android.view.View r0 = r6.f523d
        L_0x0069:
            int r4 = a(r0)
        L_0x006d:
            if (r7 != r1) goto L_0x0074
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x0077
        L_0x0074:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0077:
            int r8 = r6.getMeasuredWidth()
            androidx.appcompat.widget.b1 r0 = r6.f521b
            int r0 = a(r0)
            int r0 = r0 + r4
            int r7 = java.lang.Math.min(r0, r7)
            r6.setMeasuredDimension(r8, r7)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f524e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f524e);
        }
        this.f524e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f522c;
            if (view != null) {
                this.f524e.setBounds(view.getLeft(), this.f522c.getTop(), this.f522c.getRight(), this.f522c.getBottom());
            }
        }
        boolean z9 = true;
        if (!this.f527h ? !(this.f524e == null && this.f525f == null) : this.f526g != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f526g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f526g);
        }
        this.f526g = drawable;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f527h && (drawable2 = this.f526g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f527h ? this.f524e == null && this.f525f == null : this.f526g == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f525f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f525f);
        }
        this.f525f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f528i && (drawable2 = this.f525f) != null) {
                drawable2.setBounds(this.f521b.getLeft(), this.f521b.getTop(), this.f521b.getRight(), this.f521b.getBottom());
            }
        }
        boolean z9 = true;
        if (!this.f527h ? !(this.f524e == null && this.f525f == null) : this.f526g != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b1 b1Var) {
        b1 b1Var2 = this.f521b;
        if (b1Var2 != null) {
            removeView(b1Var2);
        }
        this.f521b = b1Var;
        if (b1Var != null) {
            addView(b1Var);
            ViewGroup.LayoutParams layoutParams = b1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            b1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z9) {
        this.f520a = z9;
        setDescendantFocusability(z9 ? 393216 : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f524e;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f525f;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f526g;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f524e && !this.f527h) || (drawable == this.f525f && this.f528i) || ((drawable == this.f526g && this.f527h) || super.verifyDrawable(drawable));
    }
}
