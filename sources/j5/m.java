package j5;

import a0.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import h0.l0;
import h0.q;
import h0.s0;
import h0.y;
import java.util.WeakHashMap;

public class m extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f8676a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f8677b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f8678c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8679d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8680e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8681f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8682g;

    public class a implements q {
        public a() {
        }

        public final s0 a(View view, s0 s0Var) {
            m mVar = m.this;
            if (mVar.f8677b == null) {
                mVar.f8677b = new Rect();
            }
            m.this.f8677b.set(s0Var.c(), s0Var.e(), s0Var.d(), s0Var.b());
            m.this.a(s0Var);
            m mVar2 = m.this;
            boolean z9 = true;
            if ((!s0Var.f6743a.j().equals(b.f3e)) && m.this.f8676a != null) {
                z9 = false;
            }
            mVar2.setWillNotDraw(z9);
            m mVar3 = m.this;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.d.k(mVar3);
            return s0Var.f6743a.c();
        }
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8678c = new Rect();
        this.f8679d = true;
        this.f8680e = true;
        this.f8681f = true;
        this.f8682g = true;
        TypedArray d10 = s.d(context, attributeSet, c.a.S, i10, 2132018015, new int[0]);
        this.f8676a = d10.getDrawable(0);
        d10.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.i.u(this, aVar);
    }

    public void a(s0 s0Var) {
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f8677b != null && this.f8676a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f8679d) {
                this.f8678c.set(0, 0, width, this.f8677b.top);
                this.f8676a.setBounds(this.f8678c);
                this.f8676a.draw(canvas);
            }
            if (this.f8680e) {
                this.f8678c.set(0, height - this.f8677b.bottom, width, height);
                this.f8676a.setBounds(this.f8678c);
                this.f8676a.draw(canvas);
            }
            if (this.f8681f) {
                Rect rect = this.f8678c;
                Rect rect2 = this.f8677b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f8676a.setBounds(this.f8678c);
                this.f8676a.draw(canvas);
            }
            if (this.f8682g) {
                Rect rect3 = this.f8678c;
                Rect rect4 = this.f8677b;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f8676a.setBounds(this.f8678c);
                this.f8676a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f8676a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f8676a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z9) {
        this.f8680e = z9;
    }

    public void setDrawLeftInsetForeground(boolean z9) {
        this.f8681f = z9;
    }

    public void setDrawRightInsetForeground(boolean z9) {
        this.f8682g = z9;
    }

    public void setDrawTopInsetForeground(boolean z9) {
        this.f8679d = z9;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f8676a = drawable;
    }
}
