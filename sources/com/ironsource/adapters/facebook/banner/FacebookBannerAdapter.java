package com.ironsource.adapters.facebook.banner;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.activity.f;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class FacebookBannerAdapter extends AbstractBannerAdapter<FacebookAdapter> {
    public ConcurrentHashMap<String, AdView> mPlacementIdToAd = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, BannerSmashListener> mPlacementIdToSmashListener = new ConcurrentHashMap<>();

    public FacebookBannerAdapter(FacebookAdapter facebookAdapter) {
        super(facebookAdapter);
    }

    private AdSize calculateBannerSize(ISBannerSize iSBannerSize, Context context) {
        String description = iSBannerSize.getDescription();
        description.getClass();
        char c10 = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals("RECTANGLE")) {
                    c10 = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals("LARGE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return AdSize.RECTANGLE_HEIGHT_250;
            case 1:
                return AdSize.BANNER_HEIGHT_90;
            case 2:
                return AdapterUtils.isLargeScreen(context) ? AdSize.BANNER_HEIGHT_90 : AdSize.BANNER_HEIGHT_50;
            case 3:
                return AdSize.BANNER_HEIGHT_50;
            case 4:
                if (iSBannerSize.getHeight() == 50) {
                    return AdSize.BANNER_HEIGHT_50;
                }
                if (iSBannerSize.getHeight() == 90) {
                    return AdSize.BANNER_HEIGHT_90;
                }
                if (iSBannerSize.getHeight() == 250) {
                    return AdSize.RECTANGLE_HEIGHT_250;
                }
                return null;
            default:
                return null;
        }
    }

    private void initBannersInternal(JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
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
            this.mPlacementIdToSmashListener.put(configStringValueFromKey, bannerSmashListener);
            if (((FacebookAdapter) getAdapter()).getInitState() == FacebookAdapter.InitState.INIT_STATE_SUCCESS) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("onBannerInitSuccess - placementId = " + configStringValueFromKey);
                bannerSmashListener.onBannerInitSuccess();
                return;
            } else if (((FacebookAdapter) getAdapter()).getInitState() == FacebookAdapter.InitState.INIT_STATE_FAILED) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("onBannerInitFailed - placementId = " + configStringValueFromKey);
                bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", IronSourceConstants.BANNER_AD_UNIT));
                return;
            } else {
                ((FacebookAdapter) getAdapter()).initSDK(configStringValueFromKey2);
                return;
            }
        }
        bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(adUnitIdMissingErrorString, IronSourceConstants.BANNER_AD_UNIT));
    }

    private void loadBannerInternal(JSONObject jSONObject, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, ((FacebookAdapter) getAdapter()).getPlacementIdKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + configStringValueFromKey);
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is null"));
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final AdSize calculateBannerSize = calculateBannerSize(ironSourceBannerLayout.getSize(), applicationContext);
        if (calculateBannerSize == null) {
            IronLog ironLog2 = IronLog.INTERNAL;
            StringBuilder g10 = f.g("size not supported, size = ");
            g10.append(ironSourceBannerLayout.getSize().getDescription());
            ironLog2.error(g10.toString());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(((FacebookAdapter) getAdapter()).getProviderName()));
            return;
        }
        final IronSourceBannerLayout ironSourceBannerLayout2 = ironSourceBannerLayout;
        final BannerSmashListener bannerSmashListener2 = bannerSmashListener;
        final String str2 = str;
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    AdView adView = new AdView(applicationContext, configStringValueFromKey, calculateBannerSize);
                    FacebookBannerAdListener facebookBannerAdListener = new FacebookBannerAdListener(FacebookBannerAdapter.this, FacebookBannerAdapter.this.calcLayoutParams(ironSourceBannerLayout2.getSize(), applicationContext), configStringValueFromKey, bannerSmashListener2);
                    AdView.AdViewLoadConfigBuilder buildLoadAdConfig = adView.buildLoadAdConfig();
                    buildLoadAdConfig.withAdListener(facebookBannerAdListener);
                    String str = str2;
                    if (str != null) {
                        buildLoadAdConfig.withBid(str);
                    }
                    FacebookBannerAdapter.this.mPlacementIdToAd.put(configStringValueFromKey, adView);
                    adView.loadAd(buildLoadAdConfig.build());
                } catch (Exception e10) {
                    StringBuilder g10 = f.g("Meta loadBanner exception ");
                    g10.append(e10.getMessage());
                    bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(g10.toString()));
                }
            }
        });
    }

    public FrameLayout.LayoutParams calcLayoutParams(ISBannerSize iSBannerSize, Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, iSBannerSize.getDescription().equals("RECTANGLE") ? 300 : (!iSBannerSize.getDescription().equals("SMART") || !AdapterUtils.isLargeScreen(context)) ? 320 : 728), -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public void destroyBanner(JSONObject jSONObject) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, ((FacebookAdapter) getAdapter()).getPlacementIdKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + configStringValueFromKey);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    if (FacebookBannerAdapter.this.mPlacementIdToAd.containsKey(configStringValueFromKey)) {
                        FacebookBannerAdapter.this.mPlacementIdToAd.get(configStringValueFromKey).destroy();
                        FacebookBannerAdapter.this.mPlacementIdToAd.remove(configStringValueFromKey);
                    }
                } catch (Exception e10) {
                    IronLog ironLog = IronLog.INTERNAL;
                    StringBuilder g10 = f.g("destroyBanner failed for placementId - ");
                    g10.append(configStringValueFromKey);
                    g10.append(" with an exception = ");
                    g10.append(e10);
                    ironLog.error(g10.toString());
                }
            }
        });
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return ((FacebookAdapter) getAdapter()).getBiddingData();
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, (String) null, ironSourceBannerLayout, bannerSmashListener);
    }

    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, str, ironSourceBannerLayout, bannerSmashListener);
    }

    public void onNetworkInitCallbackFailed(String str) {
        for (BannerSmashListener onBannerInitFailed : this.mPlacementIdToSmashListener.values()) {
            onBannerInitFailed.onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.BANNER_AD_UNIT));
        }
    }

    public void onNetworkInitCallbackSuccess() {
        for (BannerSmashListener onBannerInitSuccess : this.mPlacementIdToSmashListener.values()) {
            onBannerInitSuccess.onBannerInitSuccess();
        }
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        for (AdView destroy : this.mPlacementIdToAd.values()) {
            destroy.destroy();
        }
        this.mPlacementIdToAd.clear();
        this.mPlacementIdToSmashListener.clear();
    }
}
