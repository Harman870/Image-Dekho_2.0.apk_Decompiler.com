package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

public class AdInfo {

    /* renamed from: a  reason: collision with root package name */
    public final ImpressionData f4128a;

    public AdInfo() {
        this.f4128a = null;
    }

    public AdInfo(ImpressionData impressionData) {
        this.f4128a = impressionData;
    }

    public String getAb() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getAb() == null) ? "" : this.f4128a.getAb();
    }

    public String getAdNetwork() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getAdNetwork() == null) ? "" : this.f4128a.getAdNetwork();
    }

    public String getAdUnit() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getAdUnit() == null) ? "" : this.f4128a.getAdUnit();
    }

    public String getAuctionId() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getAuctionId() == null) ? "" : this.f4128a.getAuctionId();
    }

    public String getCountry() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getCountry() == null) ? "" : this.f4128a.getCountry();
    }

    public String getEncryptedCPM() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getEncryptedCPM() == null) ? "" : this.f4128a.getEncryptedCPM();
    }

    public String getInstanceId() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getInstanceId() == null) ? "" : this.f4128a.getInstanceId();
    }

    public String getInstanceName() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getInstanceName() == null) ? "" : this.f4128a.getInstanceName();
    }

    public Double getLifetimeRevenue() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getLifetimeRevenue() == null) ? Double.valueOf(0.0d) : this.f4128a.getLifetimeRevenue();
    }

    public String getPrecision() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getPrecision() == null) ? "" : this.f4128a.getPrecision();
    }

    public Double getRevenue() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getRevenue() == null) ? Double.valueOf(0.0d) : this.f4128a.getRevenue();
    }

    public String getSegmentName() {
        ImpressionData impressionData = this.f4128a;
        return (impressionData == null || impressionData.getSegmentName() == null) ? "" : this.f4128a.getSegmentName();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("adUnit", getAdUnit());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, getCountry());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, getAb());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, getSegmentName());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, getAdNetwork());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME, getInstanceName());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, getInstanceId());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_REVENUE, getRevenue());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_PRECISION, getPrecision());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_LIFETIME_REVENUE, getLifetimeRevenue());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, getEncryptedCPM());
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("error while parsing ad info " + e10.getMessage());
        }
        return jSONObject.toString();
    }
}
