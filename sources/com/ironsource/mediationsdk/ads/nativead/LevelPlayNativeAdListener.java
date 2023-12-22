package com.ironsource.mediationsdk.ads.nativead;

import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

public interface LevelPlayNativeAdListener extends NativeAdInteractionListener, NativeAdLoadListener {
    /* synthetic */ void onAdClicked(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo);

    /* synthetic */ void onAdImpression(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo);

    /* synthetic */ void onAdLoadFailed(LevelPlayNativeAd levelPlayNativeAd, IronSourceError ironSourceError);

    /* synthetic */ void onAdLoaded(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo);
}
