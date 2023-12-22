package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.sdk.a;
import com.ironsource.sdk.c.d;
import com.ironsource.sdk.j.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

class IronSourceBannerListener implements b {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    public void onBannerClick() {
        a.i(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdClicked();
    }

    public void onBannerInitFailed(String str) {
        a.i(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    public void onBannerInitSuccess() {
        a.i(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    public void onBannerLoadFail(String str) {
        a.i(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    public void onBannerLoadSuccess(com.ironsource.sdk.b bVar, com.ironsource.sdk.c.b bVar2) {
        a aVar;
        a.i(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        if (this.mAdapter.get() == null) {
            return;
        }
        if (bVar2 == null) {
            this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
            return;
        }
        ConcurrentHashMap<String, ArrayList<com.ironsource.sdk.b>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
        if (concurrentHashMap.get(this.mDemandSourceName) == null) {
            concurrentHashMap.put(this.mDemandSourceName, new ArrayList());
        }
        concurrentHashMap.get(this.mDemandSourceName).add(bVar);
        d dVar = bVar2.f5153a;
        if (dVar != null) {
            aVar = dVar.f5161d;
        } else {
            aVar = new a();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar.f5083a, aVar.f5084b);
        layoutParams.gravity = 17;
        this.mListener.onBannerAdLoaded(bVar2, layoutParams);
    }

    public void onBannerShowSuccess() {
        a.i(new StringBuilder(), this.mDemandSourceName, " onBannerShowSuccess", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
