package com.ironsource.adapters.facebook;

import android.content.Context;
import android.text.TextUtils;
import androidx.activity.f;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.CacheFlag;
import com.ironsource.adapters.facebook.banner.FacebookBannerAdapter;
import com.ironsource.adapters.facebook.interstitial.FacebookInterstitialAdapter;
import com.ironsource.adapters.facebook.nativead.FacebookNativeAdAdapter;
import com.ironsource.adapters.facebook.rewardedvideo.FacebookRewardedVideoAdapter;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class FacebookAdapter extends AbstractAdapter implements AudienceNetworkAds.InitListener {
    private static final String GitHash = "0c73bb274";
    private static final String MEDIATION_NAME = "ironSource";
    public static final String META_NETWORK_NAME = "Facebook";
    private static final String VERSION = "4.3.44";
    public static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    public static InitState mInitState = InitState.INIT_STATE_NONE;
    public static EnumSet<CacheFlag> mInterstitialFacebookCacheFlags = EnumSet.allOf(CacheFlag.class);
    public static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    public final String ALL_PLACEMENT_IDS = "placementIds";
    public final String FACEBOOK_INTERSTITIAL_CACHE_FLAG = "facebook_is_cacheflag";
    public final String META_INTERSTITIAL_CACHE_FLAG = "meta_is_cacheflag";
    public final String META_MIXED_AUDIENCE = "meta_mixed_audience";
    public final String PLACEMENT_ID = "placementId";

    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    private FacebookAdapter(String str) {
        super(str);
        IronLog.INTERNAL.verbose();
        setRewardedVideoAdapter(new FacebookRewardedVideoAdapter(this));
        setInterstitialAdapter(new FacebookInterstitialAdapter(this));
        setBannerAdapter(new FacebookBannerAdapter(this));
        setNativeAdAdapter(new FacebookNativeAdAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static String getAdapterSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private EnumSet<CacheFlag> getFacebookAllCacheFlags() {
        IronLog.ADAPTER_API.verbose();
        return EnumSet.allOf(CacheFlag.class);
    }

    private CacheFlag getFacebookCacheFlag(String str) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + str);
        return CacheFlag.valueOf(StringUtils.toUpperCase(str));
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData(META_NETWORK_NAME, "4.3.44");
    }

    private String getMediationServiceInfo() {
        String format = String.format("%s_%s:%s", new Object[]{MEDIATION_NAME, IronSourceUtils.getSDKVersion(), "4.3.44"});
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("mediationServiceInfo = " + format);
        return format;
    }

    public static boolean isNoFillError(AdError adError) {
        return adError.getErrorCode() == 1001;
    }

    private boolean isValidMixedAudienceMetaData(String str) {
        return !TextUtils.isEmpty(str);
    }

    private void setMixedAudience(boolean z9) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("isMixedAudience = " + z9);
        AdSettings.setMixedAudience(z9);
    }

    public static FacebookAdapter startAdapter(String str) {
        return new FacebookAdapter(str);
    }

    public String getAllPlacementIdsKey() {
        return "placementIds";
    }

    public Map<String, Object> getBiddingData() {
        if (mInitState == InitState.INIT_STATE_FAILED) {
            IronLog.INTERNAL.verbose("returning null as token since init failed");
            return null;
        }
        String bidderToken = BidderTokenProvider.getBidderToken(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("token = " + bidderToken);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, bidderToken);
        return hashMap;
    }

    public EnumSet<CacheFlag> getCacheFlags() {
        return mInterstitialFacebookCacheFlags;
    }

    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    public InitState getInitState() {
        return mInitState;
    }

    public String getPlacementIdKey() {
        return "placementId";
    }

    public String getVersion() {
        return "4.3.44";
    }

    public void initSDK(String str) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            List asList = Arrays.asList(str.split(","));
            IronLog ironLog = IronLog.ADAPTER_API;
            StringBuilder g10 = f.g("Initialize Meta with placement ids = ");
            g10.append(asList.toString());
            ironLog.verbose(g10.toString());
            AudienceNetworkAds.buildInitSettings(ContextProvider.getInstance().getApplicationContext()).withInitListener(this).withMediationService(getMediationServiceInfo()).withPlacementIds(asList).initialize();
        }
    }

    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("init SDK is completed with status: ");
        g10.append(initResult.isSuccess());
        g10.append(", ");
        g10.append(initResult.getMessage());
        ironLog.verbose(g10.toString());
        if (initResult.isSuccess()) {
            mInitState = InitState.INIT_STATE_SUCCESS;
            Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
            while (it.hasNext()) {
                it.next().onNetworkInitCallbackSuccess();
            }
        } else {
            mInitState = InitState.INIT_STATE_FAILED;
            Iterator<INetworkInitCallbackListener> it2 = initCallbackListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onNetworkInitCallbackFailed(initResult.getMessage());
            }
        }
        initCallbackListeners.clear();
    }

    public void setMetaData(String str, List<String> list) {
        if (!list.isEmpty()) {
            String lowerCase = StringUtils.toLowerCase(str);
            lowerCase.getClass();
            char c10 = 65535;
            switch (lowerCase.hashCode()) {
                case -2119383230:
                    if (lowerCase.equals("meta_mixed_audience")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1227342573:
                    if (lowerCase.equals("meta_is_cacheflag")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 5585394:
                    if (lowerCase.equals("facebook_is_cacheflag")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    String str2 = list.get(0);
                    IronLog.ADAPTER_API.verbose("key = " + str + ", value = " + str2);
                    String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
                    if (isValidMixedAudienceMetaData(formatValueForType)) {
                        setMixedAudience(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
                        return;
                    }
                    return;
                case 1:
                case 2:
                    IronLog.ADAPTER_API.verbose("key = " + str + ", values = " + list);
                    mInterstitialFacebookCacheFlags.clear();
                    try {
                        for (String next : list) {
                            CacheFlag facebookCacheFlag = getFacebookCacheFlag(next);
                            IronLog.ADAPTER_API.verbose("flag for value " + next + " is " + facebookCacheFlag.name());
                            mInterstitialFacebookCacheFlags.add(facebookCacheFlag);
                        }
                        return;
                    } catch (Exception unused) {
                        IronLog.INTERNAL.error("flag is unknown or all, set all as default");
                        mInterstitialFacebookCacheFlags = getFacebookAllCacheFlags();
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
