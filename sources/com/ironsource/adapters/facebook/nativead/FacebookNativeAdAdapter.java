package com.ironsource.adapters.facebook.nativead;

import android.content.Context;
import android.text.TextUtils;
import androidx.activity.f;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public class FacebookNativeAdAdapter extends AbstractNativeAdAdapter<FacebookAdapter> {
    /* access modifiers changed from: private */
    public WeakReference<NativeAd> mAd;
    private NativeAdSmashListener mSmashListener;

    public FacebookNativeAdAdapter(FacebookAdapter facebookAdapter) {
        super(facebookAdapter);
    }

    private void initNativeAdsInternal(JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
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
            this.mSmashListener = nativeAdSmashListener;
            if (((FacebookAdapter) getAdapter()).getInitState() == FacebookAdapter.InitState.INIT_STATE_SUCCESS) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("onNativeAdInitSuccess - placementId = " + configStringValueFromKey);
                nativeAdSmashListener.onNativeAdInitSuccess();
                return;
            } else if (((FacebookAdapter) getAdapter()).getInitState() == FacebookAdapter.InitState.INIT_STATE_FAILED) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("onNativeAdInitFailed - placementId = " + configStringValueFromKey);
                nativeAdSmashListener.onNativeAdInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", IronSourceConstants.NATIVE_AD_UNIT));
                return;
            } else {
                ((FacebookAdapter) getAdapter()).initSDK(configStringValueFromKey2);
                return;
            }
        }
        nativeAdSmashListener.onNativeAdInitFailed(ErrorBuilder.buildInitFailedError(adUnitIdMissingErrorString, IronSourceConstants.NATIVE_AD_UNIT));
    }

    private void loadNativeAdInternal(JSONObject jSONObject, String str, NativeAdSmashListener nativeAdSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, ((FacebookAdapter) getAdapter()).getPlacementIdKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + configStringValueFromKey);
        final NativeAdProperties nativeAdProperties = getNativeAdProperties(jSONObject);
        final NativeAdSmashListener nativeAdSmashListener2 = nativeAdSmashListener;
        final String str2 = str;
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                    NativeAd nativeAd = new NativeAd(applicationContext, configStringValueFromKey);
                    NativeAdBase.NativeAdLoadConfigBuilder withAdListener = nativeAd.buildLoadAdConfig().withAdListener(new FacebookNativeAdListener(applicationContext, configStringValueFromKey, nativeAdProperties.getAdOptionsPosition(), nativeAdSmashListener2));
                    String str = str2;
                    if (str != null) {
                        withAdListener.withBid(str);
                    }
                    WeakReference unused = FacebookNativeAdAdapter.this.mAd = new WeakReference(nativeAd);
                    nativeAd.loadAd(withAdListener.build());
                } catch (Exception e10) {
                    StringBuilder g10 = f.g("Meta loadNative exception ");
                    g10.append(e10.getMessage());
                    nativeAdSmashListener2.onNativeAdLoadFailed(ErrorBuilder.buildLoadFailedError(g10.toString()));
                }
            }
        });
    }

    public void destroyNativeAd(JSONObject jSONObject) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, ((FacebookAdapter) getAdapter()).getPlacementIdKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + configStringValueFromKey);
        postOnUIThread(new Runnable() {
            public void run() {
                if (FacebookNativeAdAdapter.this.mAd != null && FacebookNativeAdAdapter.this.mAd.get() != null) {
                    try {
                        ((NativeAd) FacebookNativeAdAdapter.this.mAd.get()).destroy();
                        WeakReference unused = FacebookNativeAdAdapter.this.mAd = null;
                    } catch (Exception e10) {
                        IronLog ironLog = IronLog.INTERNAL;
                        StringBuilder g10 = f.g("destroyNativeAd failed for placementId - ");
                        g10.append(configStringValueFromKey);
                        g10.append(" with an exception = ");
                        g10.append(e10);
                        ironLog.error(g10.toString());
                    }
                }
            }
        });
    }

    public Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return ((FacebookAdapter) getAdapter()).getBiddingData();
    }

    public void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        initNativeAdsInternal(jSONObject, nativeAdSmashListener);
    }

    public void initNativeAds(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        initNativeAdsInternal(jSONObject, nativeAdSmashListener);
    }

    public void loadNativeAd(JSONObject jSONObject, JSONObject jSONObject2, NativeAdSmashListener nativeAdSmashListener) {
        loadNativeAdInternal(jSONObject, (String) null, nativeAdSmashListener);
    }

    public void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener) {
        loadNativeAdInternal(jSONObject, str, nativeAdSmashListener);
    }

    public void onNetworkInitCallbackFailed(String str) {
        NativeAdSmashListener nativeAdSmashListener = this.mSmashListener;
        if (nativeAdSmashListener != null) {
            nativeAdSmashListener.onNativeAdInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    public void onNetworkInitCallbackSuccess() {
        NativeAdSmashListener nativeAdSmashListener = this.mSmashListener;
        if (nativeAdSmashListener != null) {
            nativeAdSmashListener.onNativeAdInitSuccess();
        }
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
    }
}
