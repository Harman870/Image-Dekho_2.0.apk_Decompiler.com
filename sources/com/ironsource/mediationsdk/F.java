package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;
import x8.f;

public final class F extends a<NativeAdListener> implements NativeAdSmashListener {
    public F(AbstractAdapter abstractAdapter, NetworkSettings networkSettings) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.NATIVE_AD);
    }

    public final IronSource.AD_UNIT a() {
        return IronSource.AD_UNIT.NATIVE_AD;
    }

    public final void d(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        f.f(jSONObject, "config");
        f.f(jSONObject2, "adUnitData");
        f.f(adData, "adData");
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f4064c.loadNativeAdForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f4064c.loadNativeAd(jSONObject, jSONObject2, this);
        }
    }

    public final void g(JSONObject jSONObject) {
        f.f(jSONObject, "config");
        this.f4064c.destroyNativeAd(jSONObject);
    }

    public final void onNativeAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        NativeAdListener nativeAdListener = (NativeAdListener) this.f4065d.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdClicked();
        }
    }

    public final void onNativeAdInitFailed(IronSourceError ironSourceError) {
    }

    public final void onNativeAdInitSuccess() {
    }

    public final void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(b("error = " + ironSourceError));
        int errorCode = ironSourceError != null ? ironSourceError.getErrorCode() : 1000;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        if (this.f4065d.get() != null) {
            boolean z9 = false;
            if (ironSourceError != null && ironSourceError.getErrorCode() == 706) {
                z9 = true;
            }
            AdapterErrorType adapterErrorType = z9 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            NativeAdListener nativeAdListener = (NativeAdListener) this.f4065d.get();
            if (nativeAdListener != null) {
                nativeAdListener.onAdLoadFailed(adapterErrorType, errorCode, errorMessage);
            }
        }
    }

    public final void onNativeAdLoaded(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        f.f(adapterNativeAdData, "adapterNativeAdData");
        f.f(adapterNativeAdViewBinder, "nativeAdViewBinder");
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        NativeAdListener nativeAdListener = (NativeAdListener) this.f4065d.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadSuccess(adapterNativeAdData, adapterNativeAdViewBinder);
        }
    }

    public final void onNativeAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        NativeAdListener nativeAdListener = (NativeAdListener) this.f4065d.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdOpened();
        }
    }
}
