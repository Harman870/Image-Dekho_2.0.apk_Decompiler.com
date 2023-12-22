package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f4595a;

    /* renamed from: b  reason: collision with root package name */
    public String f4596b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f4597c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f4598d = null;

    /* renamed from: e  reason: collision with root package name */
    public String f4599e = null;

    /* renamed from: f  reason: collision with root package name */
    public String f4600f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f4601g = null;

    /* renamed from: h  reason: collision with root package name */
    public String f4602h = null;

    /* renamed from: i  reason: collision with root package name */
    public String f4603i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f4604j = null;
    public Double k = null;

    /* renamed from: l  reason: collision with root package name */
    public String f4605l = null;

    /* renamed from: m  reason: collision with root package name */
    public Double f4606m = null;

    /* renamed from: n  reason: collision with root package name */
    public String f4607n = null;

    /* renamed from: o  reason: collision with root package name */
    public DecimalFormat f4608o = new DecimalFormat("#.#####");

    public ImpressionData(ImpressionData impressionData) {
        this.f4595a = impressionData.f4595a;
        this.f4596b = impressionData.f4596b;
        this.f4597c = impressionData.f4597c;
        this.f4598d = impressionData.f4598d;
        this.f4599e = impressionData.f4599e;
        this.f4600f = impressionData.f4600f;
        this.f4601g = impressionData.f4601g;
        this.f4602h = impressionData.f4602h;
        this.f4603i = impressionData.f4603i;
        this.f4604j = impressionData.f4604j;
        this.f4605l = impressionData.f4605l;
        this.f4607n = impressionData.f4607n;
        this.f4606m = impressionData.f4606m;
        this.k = impressionData.k;
    }

    public ImpressionData(JSONObject jSONObject) {
        Double d10 = null;
        if (jSONObject != null) {
            try {
                this.f4595a = jSONObject;
                this.f4596b = jSONObject.optString("auctionId", (String) null);
                this.f4597c = jSONObject.optString("adUnit", (String) null);
                this.f4598d = jSONObject.optString(IMPRESSION_DATA_KEY_COUNTRY, (String) null);
                this.f4599e = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, (String) null);
                this.f4600f = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, (String) null);
                this.f4601g = jSONObject.optString("placement", (String) null);
                this.f4602h = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, (String) null);
                this.f4603i = jSONObject.optString(IMPRESSION_DATA_KEY_INSTANCE_NAME, (String) null);
                this.f4604j = jSONObject.optString(IMPRESSION_DATA_KEY_INSTANCE_ID, (String) null);
                this.f4605l = jSONObject.optString(IMPRESSION_DATA_KEY_PRECISION, (String) null);
                this.f4607n = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, (String) null);
                double optDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f4606m = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble(IMPRESSION_DATA_KEY_REVENUE);
                if (!Double.isNaN(optDouble2)) {
                    d10 = Double.valueOf(optDouble2);
                }
                this.k = d10;
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e10.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f4599e;
    }

    public String getAdNetwork() {
        return this.f4602h;
    }

    public String getAdUnit() {
        return this.f4597c;
    }

    public JSONObject getAllData() {
        return this.f4595a;
    }

    public String getAuctionId() {
        return this.f4596b;
    }

    public String getCountry() {
        return this.f4598d;
    }

    public String getEncryptedCPM() {
        return this.f4607n;
    }

    public String getInstanceId() {
        return this.f4604j;
    }

    public String getInstanceName() {
        return this.f4603i;
    }

    public Double getLifetimeRevenue() {
        return this.f4606m;
    }

    public String getPlacement() {
        return this.f4601g;
    }

    public String getPrecision() {
        return this.f4605l;
    }

    public Double getRevenue() {
        return this.k;
    }

    public String getSegmentName() {
        return this.f4600f;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f4601g;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f4601g = replace;
            JSONObject jSONObject = this.f4595a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("auctionId: '");
        sb.append(this.f4596b);
        sb.append('\'');
        sb.append(", adUnit: '");
        sb.append(this.f4597c);
        sb.append('\'');
        sb.append(", country: '");
        sb.append(this.f4598d);
        sb.append('\'');
        sb.append(", ab: '");
        sb.append(this.f4599e);
        sb.append('\'');
        sb.append(", segmentName: '");
        sb.append(this.f4600f);
        sb.append('\'');
        sb.append(", placement: '");
        sb.append(this.f4601g);
        sb.append('\'');
        sb.append(", adNetwork: '");
        sb.append(this.f4602h);
        sb.append('\'');
        sb.append(", instanceName: '");
        sb.append(this.f4603i);
        sb.append('\'');
        sb.append(", instanceId: '");
        sb.append(this.f4604j);
        sb.append('\'');
        sb.append(", revenue: ");
        Double d10 = this.k;
        String str = null;
        sb.append(d10 == null ? null : this.f4608o.format(d10));
        sb.append(", precision: '");
        sb.append(this.f4605l);
        sb.append('\'');
        sb.append(", lifetimeRevenue: ");
        Double d11 = this.f4606m;
        if (d11 != null) {
            str = this.f4608o.format(d11);
        }
        sb.append(str);
        sb.append(", encryptedCPM: '");
        sb.append(this.f4607n);
        return sb.toString();
    }
}
