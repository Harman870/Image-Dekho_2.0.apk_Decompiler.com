package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

public interface AdUnitAdapterInterface extends INetworkInitCallbackListener, ReleaseMemoryAdapterInterface {
    /* synthetic */ void onNetworkInitCallbackFailed(String str);

    /* synthetic */ void onNetworkInitCallbackSuccess();

    /* synthetic */ void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject);
}
