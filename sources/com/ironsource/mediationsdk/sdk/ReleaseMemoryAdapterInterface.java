package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

public interface ReleaseMemoryAdapterInterface {
    void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject);
}
