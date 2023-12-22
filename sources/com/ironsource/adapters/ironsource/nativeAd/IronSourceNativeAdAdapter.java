package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.a.b;
import com.ironsource.sdk.a.c;
import com.ironsource.sdk.a.h;
import com.ironsource.sdk.controller.g;
import com.ironsource.sdk.k.a;
import com.ironsource.sdk.k.e;
import com.ironsource.sdk.utils.a.d;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import x8.f;

public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private a nativeAd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter ironSourceAdapter) {
        super(ironSourceAdapter);
        f.f(ironSourceAdapter, "adapter");
    }

    /* access modifiers changed from: private */
    /* renamed from: loadNativeAdForBidding$lambda-0  reason: not valid java name */
    public static final void m11loadNativeAdForBidding$lambda0(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        f.f(ironSourceNativeAdAdapter, "this$0");
        f.f(jSONObject, "$config");
        f.f(nativeAdSmashListener, "$listener");
        try {
            a.C0069a aVar = a.f5670a;
            String uuid = UUID.randomUUID().toString();
            f.e(uuid, "randomUUID().toString()");
            g controllerManager = IronSourceNetwork.getControllerManager();
            f.e(controllerManager, "controllerManager");
            a aVar2 = new a(uuid, new com.ironsource.sdk.k.f(uuid, controllerManager, (d) null, (com.ironsource.sdk.c.a) null, 12), new c());
            aVar2.f5676g = new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(aVar2, ironSourceNativeAdAdapter.getNativeAdProperties(jSONObject)), nativeAdSmashListener);
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject prepareLoadParams = ironSourceNativeAdAdapter.prepareLoadParams(jSONObject, str);
            f.e(currentActiveActivity, "activity");
            f.f(prepareLoadParams, "loadParams");
            aVar2.f5675f = Long.valueOf(Calendar.getInstance().getTimeInMillis());
            aVar2.f5673d = prepareLoadParams.optString("demandSourceName");
            aVar2.f5674e = prepareLoadParams.optString("inAppBidding");
            b bVar = aVar2.f5672c;
            h.a aVar3 = h.f5108f;
            f.e(aVar3, "loadAd");
            HashMap<String, Object> hashMap = aVar2.b().f5086a;
            f.e(hashMap, "baseEventParams().data");
            bVar.a(aVar3, hashMap);
            JSONObject jSONObject2 = new JSONObject(prepareLoadParams.toString());
            jSONObject2.put("loadStartTime", String.valueOf(aVar2.f5675f));
            aVar2.f5671b.a(currentActiveActivity, jSONObject2);
            ironSourceNativeAdAdapter.nativeAd = aVar2;
        } catch (Exception e10) {
            nativeAdSmashListener.onNativeAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "IronSourceAdapter loadNativeAd exception " + e10.getMessage()));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) {
        JSONObject put = new JSONObject().put("demandSourceName", ((IronSourceAdapter) getAdapter()).getDemandSourceName(jSONObject)).put("apiVersion", "2").put("inAppBidding", true);
        String str2 = ((IronSourceAdapter) getAdapter()).ADM_KEY;
        C0182e.a();
        JSONObject put2 = put.put(str2, C0182e.c(str));
        HashMap<String, String> initParams = ((IronSourceAdapter) getAdapter()).getInitParams();
        f.e(initParams, "extraParams");
        for (Map.Entry next : initParams.entrySet()) {
            put2.put((String) next.getKey(), (String) next.getValue());
        }
        f.e(put2, "loadParams");
        return put2;
    }

    public final void destroyNativeAd(JSONObject jSONObject) {
        f.f(jSONObject, "config");
        a aVar = this.nativeAd;
        if (aVar != null) {
            e eVar = aVar.f5677h;
            if (eVar != null) {
                eVar.f5701a = null;
            }
            aVar.f5671b.a();
        }
    }

    public final Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        f.f(jSONObject, "config");
        return ((IronSourceAdapter) getAdapter()).getBiddingData();
    }

    public final void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        f.f(jSONObject, "config");
        f.f(nativeAdSmashListener, "listener");
        ((IronSourceAdapter) getAdapter()).initSDK(str, jSONObject);
        nativeAdSmashListener.onNativeAdInitSuccess();
    }

    public final void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener) {
        f.f(jSONObject, "config");
        f.f(nativeAdSmashListener, "listener");
        postOnUIThread(new l7.a(this, jSONObject, nativeAdSmashListener, str));
    }

    public final void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        f.f(ad_unit, "adUnit");
    }
}
