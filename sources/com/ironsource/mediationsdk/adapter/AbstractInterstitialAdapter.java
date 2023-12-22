package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Map;
import org.json.JSONObject;
import x8.f;

public abstract class AbstractInterstitialAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements InterstitialAdapterInterface {
    public AbstractInterstitialAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        f.f(jSONObject, "config");
        f.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        f.f(jSONObject, "config");
        return null;
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        f.f(jSONObject, "config");
        f.f(interstitialSmashListener, "listener");
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        f.f(jSONObject, "config");
        f.f(interstitialSmashListener, "listener");
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        f.f(jSONObject, "config");
        return false;
    }

    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        f.f(jSONObject, "config");
        f.f(interstitialSmashListener, "listener");
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        f.f(jSONObject, "config");
        f.f(interstitialSmashListener, "listener");
    }

    public abstract /* synthetic */ void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject);

    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        f.f(jSONObject, "config");
        f.f(interstitialSmashListener, "listener");
    }
}
