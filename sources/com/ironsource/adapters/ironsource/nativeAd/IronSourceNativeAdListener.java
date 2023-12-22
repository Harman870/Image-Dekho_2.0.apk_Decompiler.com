package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.k.c;
import com.ironsource.sdk.k.d;
import x8.f;

public final class IronSourceNativeAdListener implements d.a {
    private final IronSourceNativeAdViewBinder binder;
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(IronSourceNativeAdViewBinder ironSourceNativeAdViewBinder, NativeAdSmashListener nativeAdSmashListener) {
        f.f(ironSourceNativeAdViewBinder, "binder");
        f.f(nativeAdSmashListener, "smashListener");
        this.binder = ironSourceNativeAdViewBinder;
        this.smashListener = nativeAdSmashListener;
    }

    public final void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    public final void onNativeAdLoadFailed(String str) {
        f.f(str, IronSourceConstants.EVENTS_ERROR_REASON);
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Load failed - " + str));
    }

    public final void onNativeAdLoadSuccess(c cVar) {
        f.f(cVar, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(cVar), this.binder);
    }

    public final void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
