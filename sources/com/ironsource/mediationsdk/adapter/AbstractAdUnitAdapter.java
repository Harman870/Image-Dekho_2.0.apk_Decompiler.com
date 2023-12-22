package com.ironsource.mediationsdk.adapter;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import org.json.JSONObject;
import x8.f;

public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }

    public final String getAdUnitIdMissingErrorString(String str) {
        f.f(str, "key");
        return "Missing params - " + str;
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    public final String getConfigStringValueFromKey(JSONObject jSONObject, String str) {
        f.f(jSONObject, "config");
        f.f(str, "key");
        String optString = jSONObject.optString(str);
        f.e(optString, "config.optString(key)");
        return optString;
    }

    public void onNetworkInitCallbackFailed(String str) {
    }

    public void onNetworkInitCallbackSuccess() {
    }

    public final void postBackgroundThread(Runnable runnable) {
        f.f(runnable, "runnable");
        IronSourceThreadManager.postAdapterBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0, 2, (Object) null);
    }

    public final void postOnUIThread(Runnable runnable) {
        f.f(runnable, "runnable");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0, 2, (Object) null);
    }
}
