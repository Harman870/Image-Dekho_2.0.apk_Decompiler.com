package com.ironsource.adapters.facebook.interstitial;

import android.text.TextUtils;
import androidx.activity.f;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class FacebookInterstitialAdapter extends AbstractInterstitialAdapter<FacebookAdapter> {
    public ConcurrentHashMap<String, Boolean> mAdsAvailability = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */
    public final ConcurrentHashMap<String, InterstitialAd> mPlacementIdToAd = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */
    public final ConcurrentHashMap<String, FacebookInterstitialAdListener> mPlacementIdToFacebookAdListener = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Boolean> mPlacementIdToShowAttempts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, InterstitialSmashListener> mPlacementIdToSmashListener = new ConcurrentHashMap<>();

    public FacebookInterstitialAdapter(FacebookAdapter facebookAdapter) {
        super(facebookAdapter);
    }

    private void initInterstitialInternal(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String adUnitIdMissingErrorString;
        String placementIdKey = ((FacebookAdapter) getAdapter()).getPlacementIdKey();
        String allPlacementIdsKey = ((FacebookAdapter) getAdapter()).getAllPlacementIdsKey();
        String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, placementIdKey);
        String configStringValueFromKey2 = getConfigStringValueFromKey(jSONObject, allPlacementIdsKey);
        if (TextUtils.isEmpty(configStringValueFromKey)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(placementIdKey));
            adUnitIdMissingErrorString = getAdUnitIdMissingErrorString(placementIdKey);
        } else if (TextUtils.isEmpty(configStringValueFromKey2)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(allPlacementIdsKey));
            adUnitIdMissingErrorString = getAdUnitIdMissingErrorString(allPlacementIdsKey);
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + configStringValueFromKey);
            this.mPlacementIdToSmashListener.put(configStringValueFromKey, interstitialSmashListener);
            if (((FacebookAdapter) getAdapter()).getInitState() == FacebookAdapter.InitState.INIT_STATE_SUCCESS) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("onInterstitialInitSuccess - placementId = " + configStringValueFromKey);
                interstitialSmashListener.onInterstitialInitSuccess();
                return;
            } else if (((FacebookAdapter) getAdapter()).getInitState() == FacebookAdapter.InitState.INIT_STATE_FAILED) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("onInterstitialInitFailed - placementId = " + configStringValueFromKey);
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                return;
            } else {
                ((FacebookAdapter) getAdapter()).initSDK(configStringValueFromKey2);
                return;
            }
        }
        interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(adUnitIdMissingErrorString, IronSourceConstants.INTERSTITIAL_AD_UNIT));
    }

    private void loadInterstitialInternal(JSONObject jSONObject, final String str, final InterstitialSmashListener interstitialSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, ((FacebookAdapter) getAdapter()).getPlacementIdKey());
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.mPlacementIdToShowAttempts;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(configStringValueFromKey, bool);
        this.mAdsAvailability.put(configStringValueFromKey, bool);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("placementId = " + configStringValueFromKey);
                    if (FacebookInterstitialAdapter.this.mPlacementIdToAd.containsKey(configStringValueFromKey)) {
                        ironLog.verbose("destroying previous ad with placementId " + configStringValueFromKey);
                        ((InterstitialAd) FacebookInterstitialAdapter.this.mPlacementIdToAd.get(configStringValueFromKey)).destroy();
                        FacebookInterstitialAdapter.this.mPlacementIdToAd.remove(configStringValueFromKey);
                    }
                    InterstitialAd interstitialAd = new InterstitialAd(ContextProvider.getInstance().getApplicationContext(), configStringValueFromKey);
                    FacebookInterstitialAdListener facebookInterstitialAdListener = new FacebookInterstitialAdListener(FacebookInterstitialAdapter.this, configStringValueFromKey, interstitialSmashListener);
                    FacebookInterstitialAdapter.this.mPlacementIdToFacebookAdListener.put(configStringValueFromKey, facebookInterstitialAdListener);
                    InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig = interstitialAd.buildLoadAdConfig();
                    EnumSet<CacheFlag> cacheFlags = ((FacebookAdapter) FacebookInterstitialAdapter.this.getAdapter()).getCacheFlags();
                    buildLoadAdConfig.withCacheFlags(cacheFlags);
                    buildLoadAdConfig.withAdListener(facebookInterstitialAdListener);
                    if (!TextUtils.isEmpty(str)) {
                        buildLoadAdConfig.withBid(str);
                    }
                    ironLog.verbose("loading placementId = " + configStringValueFromKey + " with facebook cache flags = " + cacheFlags.toString());
                    interstitialAd.loadAd(buildLoadAdConfig.build());
                    FacebookInterstitialAdapter.this.mPlacementIdToAd.put(configStringValueFromKey, interstitialAd);
                } catch (Exception e10) {
                    interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(e10.getLocalizedMessage()));
                }
            }
        });
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return ((FacebookAdapter) getAdapter()).getBiddingData();
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        initInterstitialInternal(jSONObject, interstitialSmashListener);
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        initInterstitialInternal(jSONObject, interstitialSmashListener);
    }

    public final boolean isInterstitialReady(JSONObject jSONObject) {
        String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, ((FacebookAdapter) getAdapter()).getPlacementIdKey());
        return this.mAdsAvailability.containsKey(configStringValueFromKey) && Boolean.TRUE.equals(this.mAdsAvailability.get(configStringValueFromKey));
    }

    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitialInternal(jSONObject, (String) null, interstitialSmashListener);
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitialInternal(jSONObject, str, interstitialSmashListener);
    }

    public void onNetworkInitCallbackFailed(String str) {
        for (InterstitialSmashListener onInterstitialInitFailed : this.mPlacementIdToSmashListener.values()) {
            onInterstitialInitFailed.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public void onNetworkInitCallbackSuccess() {
        for (InterstitialSmashListener onInterstitialInitSuccess : this.mPlacementIdToSmashListener.values()) {
            onInterstitialInitSuccess.onInterstitialInitSuccess();
        }
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        for (InterstitialAd destroy : this.mPlacementIdToAd.values()) {
            destroy.destroy();
        }
        this.mPlacementIdToAd.clear();
        this.mPlacementIdToFacebookAdListener.clear();
        this.mPlacementIdToSmashListener.clear();
        this.mAdsAvailability.clear();
        this.mPlacementIdToShowAttempts.clear();
    }

    public void showInterstitial(JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, ((FacebookAdapter) getAdapter()).getPlacementIdKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + configStringValueFromKey);
        this.mAdsAvailability.put(configStringValueFromKey, Boolean.FALSE);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    InterstitialAd interstitialAd = (InterstitialAd) FacebookInterstitialAdapter.this.mPlacementIdToAd.get(configStringValueFromKey);
                    if (interstitialAd == null || !interstitialAd.isAdLoaded() || interstitialAd.isAdInvalidated()) {
                        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    FacebookInterstitialAdapter.this.mPlacementIdToShowAttempts.put(configStringValueFromKey, Boolean.TRUE);
                    interstitialAd.show();
                } catch (Exception e10) {
                    IronLog ironLog = IronLog.INTERNAL;
                    StringBuilder g10 = f.g("ex.getMessage() = ");
                    g10.append(e10.getMessage());
                    ironLog.error(g10.toString());
                    interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, e10.getMessage()));
                }
            }
        });
    }
}
