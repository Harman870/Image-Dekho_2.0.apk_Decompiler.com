package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

public interface LevelPlayRewardedVideoListener extends LevelPlayRewardedVideoBaseListener {
    void onAdAvailable(AdInfo adInfo);

    /* synthetic */ void onAdClicked(Placement placement, AdInfo adInfo);

    /* synthetic */ void onAdClosed(AdInfo adInfo);

    /* synthetic */ void onAdOpened(AdInfo adInfo);

    /* synthetic */ void onAdRewarded(Placement placement, AdInfo adInfo);

    /* synthetic */ void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo);

    void onAdUnavailable();
}
