package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class FeaturesManager {

    /* renamed from: c  reason: collision with root package name */
    public static volatile FeaturesManager f5352c;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ?> f5353a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5354b = new a();

    public class a extends ArrayList<String> {
        public a() {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
            add("bannersOpenMeasurement");
            add("initRecovery");
        }
    }

    private FeaturesManager() {
        if (f5352c == null) {
            this.f5353a = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f5352c == null) {
            synchronized (FeaturesManager.class) {
                if (f5352c == null) {
                    f5352c = new FeaturesManager();
                }
            }
        }
        return f5352c;
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has("dataManager") ? networkConfiguration.optJSONObject("dataManager") : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f5353a.containsKey("debugMode")) {
                num = (Integer) this.f5353a.get("debugMode");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (optJSONObject != null) {
            return optJSONObject.optInt("recoverTrials", 0);
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map != null) {
            this.f5353a = map;
        }
    }
}
