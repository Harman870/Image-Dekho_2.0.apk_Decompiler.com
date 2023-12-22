package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import b0.a;
import com.imgdkh.app.R;
import h0.y;
import y3.a;

public final class x extends s {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f991d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f992e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f993f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f994g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f995h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f996i = false;

    public x(SeekBar seekBar) {
        super(seekBar);
        this.f991d = seekBar;
    }

    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        Context context = this.f991d.getContext();
        int[] iArr = a.k;
        i1 m2 = i1.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        SeekBar seekBar = this.f991d;
        y.m(seekBar, seekBar.getContext(), iArr, attributeSet, m2.f809b, R.attr.seekBarStyle);
        Drawable f10 = m2.f(0);
        if (f10 != null) {
            this.f991d.setThumb(f10);
        }
        Drawable e10 = m2.e(1);
        Drawable drawable = this.f992e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f992e = e10;
        if (e10 != null) {
            e10.setCallback(this.f991d);
            a.c.b(e10, y.e.d(this.f991d));
            if (e10.isStateful()) {
                e10.setState(this.f991d.getDrawableState());
            }
            c();
        }
        this.f991d.invalidate();
        if (m2.l(3)) {
            this.f994g = o0.b(m2.h(3, -1), this.f994g);
            this.f996i = true;
        }
        if (m2.l(2)) {
            this.f993f = m2.b(2);
            this.f995h = true;
        }
        m2.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f992e;
        if (drawable == null) {
            return;
        }
        if (this.f995h || this.f996i) {
            Drawable mutate = drawable.mutate();
            this.f992e = mutate;
            if (this.f995h) {
                a.b.h(mutate, this.f993f);
            }
            if (this.f996i) {
                a.b.i(this.f992e, this.f994g);
            }
            if (this.f992e.isStateful()) {
                this.f992e.setState(this.f991d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f992e != null) {
            int max = this.f991d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f992e.getIntrinsicWidth();
                int intrinsicHeight = this.f992e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f992e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f991d.getWidth() - this.f991d.getPaddingLeft()) - this.f991d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f991d.getPaddingLeft(), (float) (this.f991d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f992e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
