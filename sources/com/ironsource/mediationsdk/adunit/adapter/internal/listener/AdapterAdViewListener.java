package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface AdapterAdViewListener extends AdapterAdListener {
    /* synthetic */ void onAdClicked();

    void onAdLeftApplication();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    /* synthetic */ void onAdLoadSuccess();

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    /* synthetic */ void onAdOpened();

    void onAdScreenDismissed();

    void onAdScreenPresented();
}
