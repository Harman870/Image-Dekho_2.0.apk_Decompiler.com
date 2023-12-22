package com.ironsource.mediationsdk.adunit.c.d;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import x8.f;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public final InternalNativeAdListener f4251a;

    public e(InternalNativeAdListener internalNativeAdListener) {
        f.f(internalNativeAdListener, "mNativeAdListener");
        this.f4251a = internalNativeAdListener;
    }

    public final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        f.f(adapterNativeAdData, "adapterNativeAdData");
        f.f(adapterNativeAdViewBinder, "nativeAdViewBinder");
        this.f4251a.onNativeAdLoaded(adInfo, adapterNativeAdData, adapterNativeAdViewBinder);
    }

    public final void a(IronSourceError ironSourceError) {
        this.f4251a.onNativeAdLoadFailed(ironSourceError);
    }

    public final void a(Placement placement, AdInfo adInfo) {
        f.f(placement, "placement");
        this.f4251a.onNativeAdClicked(adInfo);
    }

    public final void c(AdInfo adInfo) {
        this.f4251a.onNativeAdImpression(adInfo);
    }
}
