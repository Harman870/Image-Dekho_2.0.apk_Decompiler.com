package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Map;
import o8.h;
import org.json.JSONObject;
import x8.f;

public abstract class AbstractRewardedVideoAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements RewardedVideoAdapterInterface {
    public AbstractRewardedVideoAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        h hVar;
        f.f(jSONObject, "config");
        f.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
            hVar = h.f10610a;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        f.f(jSONObject, "config");
        return null;
    }

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }

    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }

    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }

    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        f.f(jSONObject, "config");
        return false;
    }

    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }

    public void loadRewardedVideoForDemandOnly(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }

    public void loadRewardedVideoForDemandOnlyForBidding(JSONObject jSONObject, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }

    public abstract /* synthetic */ void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject);

    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        f.f(jSONObject, "config");
        f.f(rewardedVideoSmashListener, "listener");
    }
}
