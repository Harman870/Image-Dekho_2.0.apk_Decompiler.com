package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

@Deprecated
public interface RewardedVideoManualListener extends RewardedVideoListener {
    @Deprecated
    /* synthetic */ void onRewardedVideoAdClicked(Placement placement);

    @Deprecated
    /* synthetic */ void onRewardedVideoAdClosed();

    @Deprecated
    /* synthetic */ void onRewardedVideoAdEnded();

    @Deprecated
    void onRewardedVideoAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    /* synthetic */ void onRewardedVideoAdOpened();

    @Deprecated
    void onRewardedVideoAdReady();

    @Deprecated
    /* synthetic */ void onRewardedVideoAdRewarded(Placement placement);

    @Deprecated
    /* synthetic */ void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    @Deprecated
    /* synthetic */ void onRewardedVideoAdStarted();

    @Deprecated
    /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z9);
}
