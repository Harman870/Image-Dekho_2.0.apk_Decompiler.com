package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import d.s;
import java.lang.ref.WeakReference;
import x8.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<TestSuiteActivity> f4891a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4892b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f4893c;

    /* renamed from: d  reason: collision with root package name */
    public IronSourceBannerLayout f4894d;

    public a(TestSuiteActivity testSuiteActivity, Handler handler) {
        f.f(testSuiteActivity, "activity");
        f.f(handler, "handler");
        this.f4891a = new WeakReference<>(testSuiteActivity);
        this.f4892b = handler;
    }

    public final void a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f4894d;
        if (ironSourceBannerLayout != null) {
            d.b(ironSourceBannerLayout);
        }
        this.f4892b.post(new s5.f(4, this));
        this.f4894d = null;
    }

    public final void a(double d10) {
        if (this.f4893c == null) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f4894d;
            if (ironSourceBannerLayout != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = (int) (((double) d.d()) * d10);
                ironSourceBannerLayout.setLayoutParams(layoutParams);
            }
            TestSuiteActivity testSuiteActivity = this.f4891a.get();
            if (testSuiteActivity != null) {
                RelativeLayout relativeLayout = new RelativeLayout(testSuiteActivity);
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f4893c = relativeLayout;
                this.f4892b.post(new s(this, 4, testSuiteActivity));
            }
        }
    }

    public final void a(c cVar, String str, int i10, int i11) {
        f.f(cVar, "loadAdConfig");
        f.f(str, "description");
        a();
        d dVar = d.f4903a;
        d.a(IronSource.AD_UNIT.BANNER, cVar);
        TestSuiteActivity testSuiteActivity = this.f4891a.get();
        if (testSuiteActivity != null) {
            IronSourceBannerLayout a10 = d.a((Activity) testSuiteActivity, d.a(str, i10, i11));
            this.f4894d = a10;
            d.a(a10);
        }
    }
}
