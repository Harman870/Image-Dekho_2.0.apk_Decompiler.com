package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AdData {

    /* renamed from: a  reason: collision with root package name */
    public final String f4125a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f4126b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f4127c;

    public AdData(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.f4125a = str;
        this.f4126b = map;
        this.f4127c = map2;
    }

    public static AdData createAdDataForNetworkAdapter(JSONObject jSONObject, IronSource.AD_UNIT ad_unit, String str) {
        return createAdDataForNetworkAdapter(jSONObject, ad_unit, str, (IronSourceBannerLayout) null);
    }

    public static AdData createAdDataForNetworkAdapter(JSONObject jSONObject, IronSource.AD_UNIT ad_unit, String str, IronSourceBannerLayout ironSourceBannerLayout) {
        HashMap hashMap = new HashMap();
        hashMap.put("adUnit", ad_unit);
        if (str != null) {
            hashMap.put(DataKeys.USER_ID, str);
        }
        if (ironSourceBannerLayout != null) {
            hashMap.put(IronSourceConstants.BANNER_LAYOUT, ironSourceBannerLayout);
        }
        return new AdData((String) null, c.a(jSONObject), hashMap);
    }

    public Map<String, Object> getAdUnitData() {
        return this.f4127c;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.f4126b.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.f4126b;
    }

    public Integer getInt(String str) {
        return (Integer) this.f4126b.get(str);
    }

    public String getServerData() {
        return this.f4125a;
    }

    public String getString(String str) {
        return (String) this.f4126b.get(str);
    }
}
