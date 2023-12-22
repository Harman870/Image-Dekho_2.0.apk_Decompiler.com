package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import h0.t;

public final class r extends AnimationSet implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1611a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1612b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1613c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1614d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1615e = true;

    public r(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1611a = viewGroup;
        this.f1612b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f1615e = true;
        if (this.f1613c) {
            return !this.f1614d;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f1613c = true;
            t.a(this.f1611a, this);
        }
        return true;
    }

    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f1615e = true;
        if (this.f1613c) {
            return !this.f1614d;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f1613c = true;
            t.a(this.f1611a, this);
        }
        return true;
    }

    public final void run() {
        if (this.f1613c || !this.f1615e) {
            this.f1611a.endViewTransition(this.f1612b);
            this.f1614d = true;
            return;
        }
        this.f1615e = false;
        this.f1611a.post(this);
    }
}
