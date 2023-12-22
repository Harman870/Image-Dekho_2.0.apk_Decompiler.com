package com.ironsource.adapters.supersonicads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adapters.ironsource.a;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.d;
import com.ironsource.mediationsdk.sdk.f;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.z;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.SSAFactory;
import com.ironsource.sdk.j.e;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class SupersonicAdsAdapter extends AbstractAdapter implements ContextProvider.a, f, e {
    private static final String VERSION = "7.5.0";
    /* access modifiers changed from: private */
    public static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static AtomicBoolean mDidSetInitParams = new AtomicBoolean(false);
    private final String APPLICATION_PRIVATE_KEY = "privateKey";
    private final String CAMPAIGN_ID = "campaignId";
    private final String CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final String DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    private final String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final String ITEM_COUNT = "itemCount";
    private final String ITEM_NAME = "itemName";
    private final String ITEM_SIGNATURE = "itemSignature";
    private final String LANGUAGE = "language";
    private final String MAX_VIDEO_LENGTH = "maxVideoLength";
    private final String OW_PLACEMENT_ID = "placementId";
    private final String SDK_PLUGIN_TYPE = "SDKPluginType";
    private final String SESSION_ID = "sessionid";
    private final String TIMESTAMP = "timestamp";
    /* access modifiers changed from: private */
    public boolean mConsent;
    /* access modifiers changed from: private */
    public boolean mDidSetConsent;
    /* access modifiers changed from: private */
    public d mOfferwallListener;
    /* access modifiers changed from: private */
    public com.ironsource.sdk.f mSSAPublisher;

    private SupersonicAdsAdapter(String str) {
        super(str);
        IronLog.INTERNAL.verbose("");
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    private void addItemNameCountSignature(HashMap<String, String> hashMap, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("itemName");
            int optInt = jSONObject.optInt("itemCount", -1);
            String optString2 = jSONObject.optString("privateKey");
            boolean z9 = true;
            boolean z10 = false;
            if (TextUtils.isEmpty(optString)) {
                z9 = false;
            } else {
                hashMap.put("itemName", optString);
            }
            if (TextUtils.isEmpty(optString2)) {
                z9 = false;
            }
            if (optInt != -1) {
                hashMap.put("itemCount", String.valueOf(optInt));
                z10 = z9;
            }
            if (z10) {
                int currentTimestamp = IronSourceUtils.getCurrentTimestamp();
                hashMap.put("timestamp", String.valueOf(currentTimestamp));
                hashMap.put("itemSignature", createItemSig(currentTimestamp, optString, optInt, optString2));
            }
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error(" addItemNameCountSignature" + e10);
        }
    }

    /* access modifiers changed from: private */
    public void applyConsent(boolean z9) {
        if (this.mSSAPublisher != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("gdprConsentStatus", String.valueOf(z9));
                jSONObject.put("demandSourceName", getProviderName());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            this.mSSAPublisher.a(jSONObject);
        }
    }

    private String createItemSig(int i10, String str, int i11, String str2) {
        return IronSourceUtils.getMD5(i10 + str + i11 + str2);
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    private HashMap<String, String> getGenenralExtraParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        return hashMap;
    }

    private HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        if (!TextUtils.isEmpty(z.a().f5064m)) {
            hashMap.put("sessionid", z.a().f5064m);
        }
        return hashMap;
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData(IronSourceConstants.SUPERSONIC_CONFIG_NAME, "7.5.0");
    }

    /* access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String optString = jSONObject.optString("language");
        if (!TextUtils.isEmpty(optString)) {
            genenralExtraParams.put("language", optString);
        }
        genenralExtraParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            genenralExtraParams.putAll(offerwallCustomParams);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        return genenralExtraParams;
    }

    private void setParamsBeforeInit(JSONObject jSONObject) {
        if (mDidSetInitParams.compareAndSet(false, true)) {
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            SDKUtils.setDebugMode(optInt);
            JSONObject optJSONObject = jSONObject.optJSONObject("controllerConfig");
            String jSONObject2 = optJSONObject != null ? optJSONObject.toString() : "";
            SDKUtils.setControllerConfig(jSONObject2);
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + "setting controller url to " + jSONObject.optString("controllerUrl"));
            ironLog.verbose(getProviderName() + "setting controller config to " + jSONObject2);
            ironLog.verbose(getProviderName() + "setting debug mode to " + optInt);
        }
    }

    public static SupersonicAdsAdapter startAdapter(String str) {
        return new SupersonicAdsAdapter(str);
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        IronSourceUtils.sendAutomationLog(getProviderName() + ": earlyInit");
        if (mDidInitSdk.compareAndSet(false, true)) {
            SDKUtils.setDebugMode(isAdaptersDebugEnabled() ? 3 : jSONObject.optInt("debugMode", 0));
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller url to  " + jSONObject.optString("controllerUrl"));
            SDKUtils.setControllerConfig(jSONObject.optString("controllerConfig", ""));
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller config to  " + jSONObject.optString("controllerConfig"));
            HashMap<String, String> initParams = getInitParams();
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), z.a().f5055g, str2, initParams);
            ironLog.verbose("initSDK with appKey=" + z.a().f5055g + " userId=" + str2 + " parameters " + initParams);
        }
    }

    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public void getOfferwallCredits() {
        if (this.mSSAPublisher != null) {
            z.a();
            String str = z.a().f5057h;
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.getOfferWallCredits userId=" + str);
            this.mSSAPublisher.a(z.a().f5055g, str, this);
            return;
        }
        IronLog.INTERNAL.error("Please call init before calling getOfferwallCredits");
    }

    public String getVersion() {
        return "7.5.0";
    }

    public void initOfferwall(String str, final String str2, final JSONObject jSONObject) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " userId=" + str2);
        setParamsBeforeInit(jSONObject);
        AbstractAdapter.postOnUIThread(new Runnable() {
            public void run() {
                try {
                    HashMap access$000 = SupersonicAdsAdapter.this.getOfferwallExtraParams(jSONObject);
                    com.ironsource.sdk.f unused = SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                        supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                    }
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initOfferWall");
                    SupersonicAdsAdapter.this.mSSAPublisher.a(z.a().f5055g, str2, access$000, SupersonicAdsAdapter.this);
                    SupersonicAdsAdapter.mDidInitSdk.set(true);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.error(SupersonicAdsAdapter.this.getProviderName() + ":initOfferwall(userId:" + str2 + ")" + e10);
                    d access$600 = SupersonicAdsAdapter.this.mOfferwallListener;
                    StringBuilder sb = new StringBuilder("Adapter initialization failure - ");
                    sb.append(SupersonicAdsAdapter.this.getProviderName());
                    sb.append(" - ");
                    sb.append(e10.getMessage());
                    access$600.a(false, ErrorBuilder.buildInitFailedError(sb.toString(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOWAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        d dVar = this.mOfferwallListener;
        if (dVar != null) {
            dVar.onOfferwallClosed();
        }
    }

    public boolean onOWAdCredited(int i10, int i11, boolean z9) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        d dVar = this.mOfferwallListener;
        return dVar != null && dVar.onOfferwallAdCredited(i10, i11, z9);
    }

    public void onOWShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onOfferwallShowFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOWShowSuccess(String str) {
        if (TextUtils.isEmpty(str)) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        } else {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(getProviderName() + ":onOWShowSuccess(placementId:" + str + ")");
        }
        d dVar = this.mOfferwallListener;
        if (dVar != null) {
            dVar.onOfferwallOpened();
        }
    }

    public void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        }
    }

    public void onOfferwallInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a(false, ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOfferwallInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        d dVar = this.mOfferwallListener;
        if (dVar != null) {
            dVar.onOfferwallAvailable(true);
        }
    }

    public void onPause(Activity activity) {
        if (this.mSSAPublisher != null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.onPause");
            this.mSSAPublisher.b(activity);
        }
    }

    public void onResume(Activity activity) {
        if (this.mSSAPublisher != null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.onResume");
            this.mSSAPublisher.c(activity);
        }
    }

    public void setConsent(boolean z9) {
        String str;
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb = new StringBuilder();
        sb.append(getProviderName());
        sb.append(": setConsent (");
        if (z9) {
            str = "true";
        } else {
            str = "false";
        }
        a.i(sb, str, ")", ironLog);
        this.mDidSetConsent = true;
        this.mConsent = z9;
        applyConsent(z9);
    }

    public void setInternalOfferwallListener(d dVar) {
        this.mOfferwallListener = dVar;
    }

    public void setMetaData(String str, List<String> list) {
        if (!list.isEmpty()) {
            String str2 = list.get(0);
            if (!mDidInitSdk.get()) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("key=" + str + ", value=" + str2);
                if (!MetaDataUtils.isValidCCPAMetaData(str, str2)) {
                    ironLog.verbose("not valid");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(str, str2);
                    IronSourceNetwork.updateMetadata(jSONObject);
                } catch (JSONException e10) {
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.error("error - " + e10);
                    e10.printStackTrace();
                }
            }
        }
    }

    public void showOfferwall(String str, JSONObject jSONObject) {
        HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams(jSONObject);
        if (offerwallExtraParams != null) {
            offerwallExtraParams.put("placementId", str);
        }
        if (this.mSSAPublisher != null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.showOfferWall");
            this.mSSAPublisher.a(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
            return;
        }
        IronLog.INTERNAL.error("Please call init before calling showOfferwall");
    }
}
