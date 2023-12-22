package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.j.f;

public final class j extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    public Context f5475a;

    /* renamed from: b  reason: collision with root package name */
    public A f5476b;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            ViewGroup viewGroup;
            Activity activity = (Activity) j.this.f5475a;
            if (activity != null) {
                viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.addView(j.this);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ViewGroup viewGroup;
            Activity activity = (Activity) j.this.f5475a;
            if (activity != null) {
                viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(j.this);
            }
        }
    }

    public j(Context context) {
        super(context);
        this.f5475a = context;
        setClickable(true);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5476b.j();
        this.f5476b.a(true, "main");
    }

    public final boolean onBackButtonPressed() {
        new com.ironsource.sdk.i.a();
        return com.ironsource.sdk.i.a.a((Activity) this.f5475a);
    }

    public final void onCloseRequested() {
        ((Activity) this.f5475a).runOnUiThread(new b());
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5476b.i();
        this.f5476b.a(false, "main");
        A a10 = this.f5476b;
        if (a10 != null) {
            a10.f5202x = A.g.Gone;
            a10.G = null;
            a10.p0 = null;
        }
        removeAllViews();
    }

    public final void onOrientationChanged(String str, int i10) {
    }
}
