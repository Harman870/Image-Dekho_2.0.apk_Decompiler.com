package com.ironsource.mediationsdk.adunit.adapter.internal.nativead;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;

public abstract class AdapterNativeAdViewBinder implements AdapterNativeAdViewBinderInterface {
    private final NativeAdViewHolder nativeAdViewHolder = new NativeAdViewHolder();

    public final NativeAdViewHolder getNativeAdViewHolder() {
        return this.nativeAdViewHolder;
    }

    public abstract /* synthetic */ ViewGroup getNetworkNativeAdView();

    public void setAdvertiserView(View view) {
        this.nativeAdViewHolder.setAdvertiserView(view);
    }

    public void setBodyView(View view) {
        this.nativeAdViewHolder.setBodyView(view);
    }

    public void setCallToActionView(View view) {
        this.nativeAdViewHolder.setCallToActionView(view);
    }

    public void setIconView(View view) {
        this.nativeAdViewHolder.setIconView(view);
    }

    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.nativeAdViewHolder.setMediaView(levelPlayMediaView);
    }

    public abstract /* synthetic */ void setNativeAdView(View view);

    public void setTitleView(View view) {
        this.nativeAdViewHolder.setTitleView(view);
    }
}
