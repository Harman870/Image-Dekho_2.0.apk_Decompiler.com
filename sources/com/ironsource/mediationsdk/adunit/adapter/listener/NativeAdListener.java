package com.ironsource.mediationsdk.adunit.adapter.listener;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface NativeAdListener extends AdapterAdListener {
    /* synthetic */ void onAdClicked();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    /* synthetic */ void onAdLoadSuccess();

    void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder);

    /* synthetic */ void onAdOpened();
}
