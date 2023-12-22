package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.m  reason: case insensitive filesystem */
public final class C0188m extends a<BannerAdListener> implements BannerSmashListener {
    public C0188m(AbstractAdapter abstractAdapter, NetworkSettings networkSettings) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.BANNER);
    }

    public final IronSource.AD_UNIT a() {
        return IronSource.AD_UNIT.BANNER;
    }

    public final void d(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        IronSourceBannerLayout ironSourceBannerLayout = (IronSourceBannerLayout) adData.getAdUnitData().get(IronSourceConstants.BANNER_LAYOUT);
        if (num == null || num.intValue() != 1) {
            this.f4064c.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), ironSourceBannerLayout, this);
            return;
        }
        this.f4064c.loadBanner(jSONObject, jSONObject2, ironSourceBannerLayout, this);
    }

    public final void g(JSONObject jSONObject) {
        this.f4064c.destroyBanner(jSONObject);
    }

    public final void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((BannerAdListener) this.f4065d.get()).onAdClicked();
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((BannerAdListener) this.f4065d.get()).onAdLeftApplication();
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(b("error = " + ironSourceError));
        if (this.f4065d.get() != null) {
            ((BannerAdListener) this.f4065d.get()).onAdLoadFailed(ironSourceError.getErrorCode() == 606 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((BannerAdListener) this.f4065d.get()).onAdLoadSuccess(view, layoutParams);
        }
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((BannerAdListener) this.f4065d.get()).onAdScreenDismissed();
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((BannerAdListener) this.f4065d.get()).onAdScreenPresented();
        }
    }

    public final void onBannerAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(b((String) null));
        if (this.f4065d.get() != null) {
            ((BannerAdListener) this.f4065d.get()).onAdOpened();
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
    }

    public final void onBannerInitSuccess() {
    }
}
