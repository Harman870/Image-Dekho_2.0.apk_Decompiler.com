package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

public interface SetAPSInterface {
    void setAPSData(IronSource.AD_UNIT ad_unit, JSONObject jSONObject);
}
