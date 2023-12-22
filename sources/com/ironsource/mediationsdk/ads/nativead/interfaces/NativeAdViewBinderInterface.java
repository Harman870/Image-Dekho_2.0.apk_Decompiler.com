package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;

public interface NativeAdViewBinderInterface {
    void setAdvertiserView(View view);

    void setBodyView(View view);

    void setCallToActionView(View view);

    void setIconView(View view);

    void setMediaView(LevelPlayMediaView levelPlayMediaView);

    void setTitleView(View view);
}
