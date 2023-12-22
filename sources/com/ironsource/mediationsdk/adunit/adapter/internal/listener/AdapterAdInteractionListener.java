package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface AdapterAdInteractionListener extends AdapterAdListener {
    /* synthetic */ void onAdClicked();

    void onAdClosed();

    void onAdEnded();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    /* synthetic */ void onAdLoadSuccess();

    /* synthetic */ void onAdOpened();

    void onAdShowFailed(int i10, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
