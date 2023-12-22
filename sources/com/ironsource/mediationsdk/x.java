package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import org.json.JSONObject;

public final class x extends a<InterstitialAdListener> implements InterstitialSmashListener {
    public x(AbstractAdapter abstractAdapter, NetworkSettings networkSettings) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.INTERSTITIAL);
    }

    public final IronSource.AD_UNIT a() {
        return IronSource.AD_UNIT.INTERSTITIAL;
    }

    public final void c(JSONObject jSONObject) {
        this.f4064c.showInterstitial(jSONObject, this);
    }

    public final void d(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f4064c.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f4064c.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    public final boolean f(JSONObject jSONObject) {
        return this.f4064c.isInterstitialReady(jSONObject);
    }

    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((InterstitialAdListener) this.f4065d.get()).onAdClicked();
        }
    }

    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((InterstitialAdListener) this.f4065d.get()).onAdClosed();
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(b("error = " + ironSourceError));
        if (this.f4065d.get() != null) {
            ((InterstitialAdListener) this.f4065d.get()).onAdLoadFailed(ironSourceError.getErrorCode() == 1158 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((InterstitialAdListener) this.f4065d.get()).onAdOpened();
        }
    }

    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((InterstitialAdListener) this.f4065d.get()).onAdLoadSuccess();
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(b("error = " + ironSourceError));
        if (this.f4065d.get() != null) {
            ((InterstitialAdListener) this.f4065d.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((InterstitialAdListener) this.f4065d.get()).onAdShowSuccess();
        }
    }

    public final void onInterstitialAdVisible() {
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }
}
