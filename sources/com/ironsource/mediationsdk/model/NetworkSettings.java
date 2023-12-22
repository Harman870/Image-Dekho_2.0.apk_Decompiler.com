package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkSettings {

    /* renamed from: a  reason: collision with root package name */
    public String f4686a;

    /* renamed from: b  reason: collision with root package name */
    public String f4687b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f4688c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f4689d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f4690e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f4691f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f4692g;

    /* renamed from: h  reason: collision with root package name */
    public String f4693h;

    /* renamed from: i  reason: collision with root package name */
    public String f4694i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4695j;
    public String k;

    /* renamed from: l  reason: collision with root package name */
    public int f4696l;

    /* renamed from: m  reason: collision with root package name */
    public int f4697m;

    /* renamed from: n  reason: collision with root package name */
    public int f4698n;

    /* renamed from: o  reason: collision with root package name */
    public int f4699o;

    /* renamed from: p  reason: collision with root package name */
    public String f4700p;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f4686a = networkSettings.getProviderName();
        this.k = networkSettings.getProviderName();
        this.f4687b = networkSettings.getProviderTypeForReflection();
        this.f4689d = networkSettings.getRewardedVideoSettings();
        this.f4690e = networkSettings.getInterstitialSettings();
        this.f4691f = networkSettings.getBannerSettings();
        this.f4692g = networkSettings.getNativeAdSettings();
        this.f4688c = networkSettings.getApplicationSettings();
        this.f4696l = networkSettings.getRewardedVideoPriority();
        this.f4697m = networkSettings.getInterstitialPriority();
        this.f4698n = networkSettings.getBannerPriority();
        this.f4699o = networkSettings.getNativeAdPriority();
        this.f4700p = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f4686a = str;
        this.k = str;
        this.f4687b = str;
        this.f4700p = str;
        this.f4689d = new JSONObject();
        this.f4690e = new JSONObject();
        this.f4691f = new JSONObject();
        this.f4692g = new JSONObject();
        this.f4688c = new JSONObject();
        this.f4696l = -1;
        this.f4697m = -1;
        this.f4698n = -1;
        this.f4699o = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f4686a = str;
        this.k = str;
        this.f4687b = str2;
        this.f4700p = str3;
        this.f4689d = jSONObject2;
        this.f4690e = jSONObject3;
        this.f4691f = jSONObject4;
        this.f4692g = jSONObject5;
        this.f4688c = jSONObject;
        this.f4696l = -1;
        this.f4697m = -1;
        this.f4698n = -1;
        this.f4699o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f4694i;
    }

    public JSONObject getApplicationSettings() {
        return this.f4688c;
    }

    public int getBannerPriority() {
        return this.f4698n;
    }

    public JSONObject getBannerSettings() {
        return this.f4691f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f4688c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f4688c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f4689d) != null) || ((ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f4690e) != null) || (ad_unit.equals(IronSource.AD_UNIT.BANNER) && (jSONObject2 = this.f4691f) != null)))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) || (jSONObject = this.f4692g) == null) {
            return null;
        }
        return jSONObject.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f4688c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
            return 1;
        } else {
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f4697m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f4690e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
            return 99;
        } else {
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("maxAdsPerSession", 99);
    }

    public int getNativeAdPriority() {
        return this.f4699o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f4692g;
    }

    public String getProviderDefaultInstance() {
        return this.f4700p;
    }

    public String getProviderInstanceName() {
        return this.k;
    }

    public String getProviderName() {
        return this.f4686a;
    }

    public String getProviderTypeForReflection() {
        return this.f4687b;
    }

    public int getRewardedVideoPriority() {
        return this.f4696l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f4689d;
    }

    public String getSubProviderId() {
        return this.f4693h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f4695j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f4694i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f4688c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f4698n = i10;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f4691f.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f4691f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f4697m = i10;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f4690e.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f4690e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z9) {
        this.f4695j = z9;
    }

    public void setNativeAdPriority(int i10) {
        this.f4699o = i10;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f4692g.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f4692g = jSONObject;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f4696l = i10;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f4689d.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f4689d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f4693h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f4688c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }
}
