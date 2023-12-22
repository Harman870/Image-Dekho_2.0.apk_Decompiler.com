package com.ironsource.mediationsdk.adunit.adapter.listener;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface BannerAdListener extends AdapterAdViewListener {
    /* synthetic */ void onAdClicked();

    /* synthetic */ void onAdLeftApplication();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    /* synthetic */ void onAdLoadSuccess();

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    /* synthetic */ void onAdOpened();

    /* synthetic */ void onAdScreenDismissed();

    /* synthetic */ void onAdScreenPresented();
}
