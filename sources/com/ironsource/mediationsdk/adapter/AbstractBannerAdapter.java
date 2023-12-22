package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Map;
import org.json.JSONObject;
import x8.f;

public abstract class AbstractBannerAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements BannerAdapterInterface {
    public AbstractBannerAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        f.f(jSONObject, "config");
        f.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyBanner(JSONObject jSONObject) {
        f.f(jSONObject, "config");
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        f.f(jSONObject, "config");
        return null;
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        f.f(jSONObject, "config");
        f.f(bannerSmashListener, "listener");
    }

    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        f.f(jSONObject, "config");
        f.f(bannerSmashListener, "listener");
    }

    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        f.f(jSONObject, "config");
        f.f(ironSourceBannerLayout, "banner");
        f.f(bannerSmashListener, "listener");
    }

    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        f.f(jSONObject, "config");
        f.f(ironSourceBannerLayout, "banner");
        f.f(bannerSmashListener, "listener");
    }

    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        f.f(jSONObject, "config");
        f.f(bannerSmashListener, "listener");
    }

    public abstract /* synthetic */ void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject);
}
