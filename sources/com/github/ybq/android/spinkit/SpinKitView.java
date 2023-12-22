package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import c6.b;
import com.imgdkh.app.R;
import o.g;
import q2.f;
import r2.a;
import r2.c;
import r2.d;
import r2.e;
import r2.h;
import r2.i;
import r2.j;
import r2.k;
import r2.l;
import r2.m;
import r2.n;
import r2.o;

public class SpinKitView extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    public int f2744a;

    /* renamed from: b  reason: collision with root package name */
    public int f2745b;

    /* renamed from: c  reason: collision with root package name */
    public f f2746c;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.SpinKitViewStyle, R.style.SpinKitView);
        f fVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2482o, R.attr.SpinKitViewStyle, R.style.SpinKitView);
        this.f2744a = androidx.activity.f._values()[obtainStyledAttributes.getInt(1, 0)];
        this.f2745b = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        switch (g.b(this.f2744a)) {
            case 0:
                fVar = new l();
                break;
            case 1:
                fVar = new d();
                break;
            case 2:
                fVar = new o();
                break;
            case 3:
                fVar = new n();
                break;
            case 4:
                fVar = new i();
                break;
            case 5:
                fVar = new a();
                break;
            case 6:
                fVar = new m();
                break;
            case 7:
                fVar = new r2.b();
                break;
            case 8:
                fVar = new c();
                break;
            case 9:
                fVar = new e();
                break;
            case 10:
                fVar = new r2.f();
                break;
            case 11:
                fVar = new k();
                break;
            case 12:
                fVar = new r2.g();
                break;
            case 13:
                fVar = new j();
                break;
            case 14:
                fVar = new h();
                break;
            default:
                fVar = null;
                break;
        }
        fVar.e(this.f2745b);
        setIndeterminateDrawable(fVar);
        setIndeterminate(true);
    }

    public f getIndeterminateDrawable() {
        return this.f2746c;
    }

    public final void onScreenStateChanged(int i10) {
        f fVar;
        super.onScreenStateChanged(i10);
        if (i10 == 0 && (fVar = this.f2746c) != null) {
            fVar.stop();
        }
    }

    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9 && this.f2746c != null && getVisibility() == 0) {
            this.f2746c.start();
        }
    }

    public void setColor(int i10) {
        this.f2745b = i10;
        f fVar = this.f2746c;
        if (fVar != null) {
            fVar.e(i10);
        }
        invalidate();
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof f) {
            setIndeterminateDrawable((f) drawable);
            return;
        }
        throw new IllegalArgumentException("this d must be instanceof Sprite");
    }

    public void setIndeterminateDrawable(f fVar) {
        super.setIndeterminateDrawable(fVar);
        this.f2746c = fVar;
        if (fVar.c() == 0) {
            this.f2746c.e(this.f2745b);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f2746c.start();
        }
    }

    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof f) {
            ((f) drawable).stop();
        }
    }
}
