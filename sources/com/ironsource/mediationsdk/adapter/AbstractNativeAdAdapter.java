package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import org.json.JSONObject;
import x8.f;

public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements NativeAdAdapterInterface {
    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        f.f(jSONObject, "config");
        f.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyNativeAd(JSONObject jSONObject) {
        f.f(jSONObject, "config");
    }

    public Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        f.f(jSONObject, "config");
        return null;
    }

    public final NativeAdProperties getNativeAdProperties(JSONObject jSONObject) {
        f.f(jSONObject, "config");
        return new NativeAdProperties(jSONObject);
    }

    public void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        f.f(jSONObject, "config");
        f.f(nativeAdSmashListener, "listener");
    }

    public void initNativeAds(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        f.f(jSONObject, "config");
        f.f(nativeAdSmashListener, "listener");
    }

    public void loadNativeAd(JSONObject jSONObject, JSONObject jSONObject2, NativeAdSmashListener nativeAdSmashListener) {
        f.f(jSONObject, "config");
        f.f(nativeAdSmashListener, "listener");
    }

    public void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener) {
        f.f(jSONObject, "config");
        f.f(nativeAdSmashListener, "listener");
    }

    public abstract /* synthetic */ void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject);
}
