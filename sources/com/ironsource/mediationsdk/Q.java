package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import org.json.JSONObject;

public final class Q extends a<RewardedVideoAdListener> implements RewardedVideoSmashListener {
    public Q(AbstractAdapter abstractAdapter, NetworkSettings networkSettings) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    public final IronSource.AD_UNIT a() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    public final void c(JSONObject jSONObject) {
        this.f4064c.showRewardedVideo(jSONObject, this);
    }

    public final void d(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f4064c.loadRewardedVideoForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f4064c.loadRewardedVideo(jSONObject, jSONObject2, this);
        }
    }

    public final boolean f(JSONObject jSONObject) {
        return this.f4064c.isRewardedVideoAvailable(jSONObject);
    }

    public final void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdClicked();
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdClosed();
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdEnded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdOpened();
        }
    }

    public final void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdRewarded();
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(b("error = " + ironSourceError));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdStarted();
        }
    }

    public final void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdVisible();
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z9) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("available = " + z9));
        if (this.f4065d.get() == null) {
            return;
        }
        if (z9) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdLoadSuccess();
        } else {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, "");
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog.ADAPTER_CALLBACK.verbose(b("error = " + ironSourceError));
        if (this.f4065d.get() != null) {
            boolean z9 = true;
            if (ironSourceError.getErrorCode() == 1058) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                if (ironSourceError.getErrorCode() != 1057) {
                    z9 = false;
                }
                adapterErrorType = z9 ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            ((RewardedVideoAdListener) this.f4065d.get()).onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((RewardedVideoAdListener) this.f4065d.get()).onAdLoadSuccess();
        }
    }
}
