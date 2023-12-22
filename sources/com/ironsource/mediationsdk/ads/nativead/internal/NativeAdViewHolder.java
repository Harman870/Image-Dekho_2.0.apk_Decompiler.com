package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;

public final class NativeAdViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public View f4105a;

    /* renamed from: b  reason: collision with root package name */
    public View f4106b;

    /* renamed from: c  reason: collision with root package name */
    public View f4107c;

    /* renamed from: d  reason: collision with root package name */
    public View f4108d;

    /* renamed from: e  reason: collision with root package name */
    public LevelPlayMediaView f4109e;

    /* renamed from: f  reason: collision with root package name */
    public View f4110f;

    public final View getAdvertiserView() {
        return this.f4106b;
    }

    public final View getBodyView() {
        return this.f4108d;
    }

    public final View getCallToActionView() {
        return this.f4110f;
    }

    public final View getIconView() {
        return this.f4107c;
    }

    public final LevelPlayMediaView getMediaView() {
        return this.f4109e;
    }

    public final View getTitleView() {
        return this.f4105a;
    }

    public final void setAdvertiserView(View view) {
        this.f4106b = view;
    }

    public final void setBodyView(View view) {
        this.f4108d = view;
    }

    public final void setCallToActionView(View view) {
        this.f4110f = view;
    }

    public final void setIconView(View view) {
        this.f4107c = view;
    }

    public final void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f4109e = levelPlayMediaView;
    }

    public final void setTitleView(View view) {
        this.f4105a = view;
    }
}
