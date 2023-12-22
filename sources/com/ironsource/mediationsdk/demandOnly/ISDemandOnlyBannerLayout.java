package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f4378a;

    /* renamed from: b  reason: collision with root package name */
    public ISBannerSize f4379b;

    /* renamed from: c  reason: collision with root package name */
    public String f4380c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f4381d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4382e = false;

    /* renamed from: f  reason: collision with root package name */
    public a f4383f;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ View f4384a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ FrameLayout.LayoutParams f4385b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f4384a = view;
            this.f4385b = layoutParams;
        }

        public final void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f4384a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f4384a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f4384a;
            iSDemandOnlyBannerLayout.f4378a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f4385b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f4381d = activity;
        this.f4379b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f4383f = new a();
    }

    public Activity getActivity() {
        return this.f4381d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return (ISDemandOnlyBannerListener) this.f4383f.a();
    }

    public View getBannerView() {
        return this.f4378a;
    }

    public a getListener() {
        return this.f4383f;
    }

    public String getPlacementName() {
        return this.f4380c;
    }

    public ISBannerSize getSize() {
        return this.f4379b;
    }

    public boolean isDestroyed() {
        return this.f4382e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f4383f.a(null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f4383f.a(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f4380c = str;
    }
}
