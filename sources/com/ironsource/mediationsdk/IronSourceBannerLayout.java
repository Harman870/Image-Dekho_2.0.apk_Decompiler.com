package com.ironsource.mediationsdk;

import android.app.Activity;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ISBannerSize f3931a;

    /* renamed from: b  reason: collision with root package name */
    public String f3932b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f3933c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3934d = false;

    /* renamed from: e  reason: collision with root package name */
    public a f3935e;

    @Deprecated
    public interface a extends com.ironsource.sdk.j.a {
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f3933c = activity;
        this.f3931a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public Activity getActivity() {
        return this.f3933c;
    }

    public BannerListener getBannerListener() {
        return l.a().f4630e;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return l.a().f4631f;
    }

    public String getPlacementName() {
        return this.f3932b;
    }

    public ISBannerSize getSize() {
        return this.f3931a;
    }

    public a getWindowFocusChangedListener() {
        return this.f3935e;
    }

    public boolean isDestroyed() {
        return this.f3934d;
    }

    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }

    public void removeBannerListener() {
        IronLog.API.info();
        l.a().f4630e = null;
        l.a().f4631f = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info();
        l.a().f4630e = bannerListener;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        l.a().f4631f = levelPlayBannerListener;
    }

    public void setPlacementName(String str) {
        this.f3932b = str;
    }

    public void setWindowFocusChangedListener(a aVar) {
        this.f3935e = aVar;
    }
}
