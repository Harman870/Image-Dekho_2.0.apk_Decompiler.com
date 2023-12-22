package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import h0.y;
import l0.f;
import y3.a;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f873a;

    /* renamed from: b  reason: collision with root package name */
    public g1 f874b;

    /* renamed from: c  reason: collision with root package name */
    public int f875c = 0;

    public o(ImageView imageView) {
        this.f873a = imageView;
    }

    public final void a() {
        g1 g1Var;
        Drawable drawable = this.f873a.getDrawable();
        if (drawable != null) {
            o0.a(drawable);
        }
        if (drawable != null && (g1Var = this.f874b) != null) {
            j.e(drawable, g1Var, this.f873a.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        Context context = this.f873a.getContext();
        int[] iArr = a.f13029j;
        i1 m2 = i1.m(context, attributeSet, iArr, i10);
        ImageView imageView = this.f873a;
        y.m(imageView, imageView.getContext(), iArr, attributeSet, m2.f809b, i10);
        try {
            Drawable drawable = this.f873a.getDrawable();
            if (!(drawable != null || (i11 = m2.i(1, -1)) == -1 || (drawable = e.a.a(this.f873a.getContext(), i11)) == null)) {
                this.f873a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                o0.a(drawable);
            }
            if (m2.l(2)) {
                f.c(this.f873a, m2.b(2));
            }
            if (m2.l(3)) {
                f.d(this.f873a, o0.b(m2.h(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            m2.n();
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            Drawable a10 = e.a.a(this.f873a.getContext(), i10);
            if (a10 != null) {
                o0.a(a10);
            }
            this.f873a.setImageDrawable(a10);
        } else {
            this.f873a.setImageDrawable((Drawable) null);
        }
        a();
    }
}
