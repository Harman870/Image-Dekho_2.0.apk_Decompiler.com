package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.j.c;
import org.json.JSONObject;

public class IronSourceRewardedVideoListener implements c {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    public boolean mIsRvDemandOnly;
    public RewardedVideoSmashListener mListener;

    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z9) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z9;
    }

    public void onInterstitialAdRewarded(String str, int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener demandSourceId=" + str + " amount=" + i10);
        this.mListener.onRewardedVideoAdRewarded();
    }

    public void onInterstitialClick() {
        a.i(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClicked();
    }

    public void onInterstitialClose() {
        a.i(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClosed();
    }

    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
            if ("impressions".equals(str)) {
                this.mListener.onRewardedVideoAdVisible();
            }
        }
    }

    public void onInterstitialInitFailed(String str) {
        a.i(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    public void onInterstitialInitSuccess() {
        a.i(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    public void onInterstitialLoadFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (!this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    public void onInterstitialLoadSuccess() {
        a.i(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    public void onInterstitialOpen() {
        a.i(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdOpened();
    }

    public void onInterstitialShowFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    public void onInterstitialShowSuccess() {
        a.i(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }
}
