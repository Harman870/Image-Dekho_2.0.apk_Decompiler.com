package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

public interface LevelPlayRewardedVideoManualListener extends LevelPlayRewardedVideoBaseListener {
    /* synthetic */ void onAdClicked(Placement placement, AdInfo adInfo);

    /* synthetic */ void onAdClosed(AdInfo adInfo);

    void onAdLoadFailed(IronSourceError ironSourceError);

    /* synthetic */ void onAdOpened(AdInfo adInfo);

    void onAdReady(AdInfo adInfo);

    /* synthetic */ void onAdRewarded(Placement placement, AdInfo adInfo);

    /* synthetic */ void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo);
}
