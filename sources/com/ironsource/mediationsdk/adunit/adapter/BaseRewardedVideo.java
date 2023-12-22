package com.ironsource.mediationsdk.adunit.adapter;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;

public abstract class BaseRewardedVideo<NetworkAdapter extends BaseAdapter> extends BaseAdInteractionAdapter<NetworkAdapter, RewardedVideoAdListener> {
    public BaseRewardedVideo(NetworkSettings networkSettings) {
        super(IronSource.AD_UNIT.REWARDED_VIDEO, networkSettings);
    }

    public abstract /* synthetic */ boolean isAdAvailable(AdData adData);

    public abstract /* synthetic */ void loadAd(AdData adData, Activity activity, AdapterAdListener adapterAdListener);

    public abstract /* synthetic */ void showAd(AdData adData, AdapterAdListener adapterAdListener);
}
