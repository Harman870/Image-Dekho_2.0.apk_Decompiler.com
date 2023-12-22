package com.ironsource.mediationsdk.adunit.adapter.internal.nativead;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;

public interface AdapterNativeAdViewBinderInterface extends NativeAdViewBinderInterface {
    ViewGroup getNetworkNativeAdView();

    /* synthetic */ void setAdvertiserView(View view);

    /* synthetic */ void setBodyView(View view);

    /* synthetic */ void setCallToActionView(View view);

    /* synthetic */ void setIconView(View view);

    /* synthetic */ void setMediaView(LevelPlayMediaView levelPlayMediaView);

    void setNativeAdView(View view);

    /* synthetic */ void setTitleView(View view);
}
