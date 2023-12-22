package com.ironsource.mediationsdk.adunit.adapter;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;

public abstract class BaseNativeAd<NetworkAdapter extends BaseAdapter> extends BaseAdAdapter<NetworkAdapter, NativeAdListener> implements AdapterNativeAdInterface<NativeAdListener> {
    public BaseNativeAd(NetworkSettings networkSettings) {
        super(IronSource.AD_UNIT.NATIVE_AD, networkSettings);
    }

    public abstract /* synthetic */ void destroyAd(AdData adData);

    public abstract /* synthetic */ void loadAd(AdData adData, Activity activity, AdapterAdListener adapterAdListener);
}
