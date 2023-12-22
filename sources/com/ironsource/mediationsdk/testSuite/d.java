package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.C0196u;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.P;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.c.b;
import com.ironsource.mediationsdk.adunit.c.h;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.c;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o8.e;
import org.json.JSONObject;
import x8.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f4903a = new d();

    private d() {
    }

    public static ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public static IronSourceBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        f.f(activity, "activity");
        f.f(iSBannerSize, "size");
        IronSourceBannerLayout a10 = z.a().a(activity, iSBannerSize);
        f.e(a10, "getInstance().createBanner(activity, size)");
        return a10;
    }

    public static String a(Context context) {
        f.f(context, "context");
        return context.getPackageName();
    }

    public static String a(NetworkSettings networkSettings) {
        f.f(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.getPlacementName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(com.ironsource.mediationsdk.model.Placement r0) {
        /*
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.getPlacementName()
            if (r0 != 0) goto L_0x000d
        L_0x0008:
            java.lang.String r0 = new java.lang.String
            r0.<init>()
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.testSuite.d.a(com.ironsource.mediationsdk.model.Placement):java.lang.String");
    }

    public static JSONObject a() {
        JSONObject b10 = c.a().b();
        f.e(b10, "getProperties().toJSON()");
        return b10;
    }

    public static JSONObject a(boolean z9) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        f.e(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    public static void a(int i10, JSONObject jSONObject) {
        f.f(jSONObject, "data");
        i.d().a(new a(i10, jSONObject));
    }

    public static void a(Activity activity) {
        if (activity != null) {
            IronSource.showInterstitial(activity);
        } else {
            IronSource.showInterstitial();
        }
    }

    public static void a(IronSource.AD_UNIT ad_unit, c cVar) {
        b bVar;
        h hVar;
        com.ironsource.mediationsdk.adunit.c.f fVar;
        f.f(ad_unit, "adUnit");
        f.f(cVar, "loadAdConfig");
        z a10 = z.a();
        if (a10.O) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL && (fVar = a10.A) != null) {
                fVar.a(cVar);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO && (hVar = a10.B) != null) {
                hVar.a(cVar);
            }
            if (ad_unit == IronSource.AD_UNIT.BANNER && (bVar = a10.C) != null) {
                bVar.a(cVar);
            }
        }
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.loadBanner(ironSourceBannerLayout);
    }

    public static void a(LevelPlayBannerListener levelPlayBannerListener) {
        l.a().f4629c = levelPlayBannerListener;
    }

    public static void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        C0196u.a().b(levelPlayInterstitialListener);
    }

    public static void a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        P.a().f3995c = levelPlayRewardedVideoBaseListener;
    }

    public static void a(String str) {
        f.f(str, "message");
        IronLog.INTERNAL.error(str);
    }

    public static boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        f.f(networkSettings, "networkSettings");
        f.f(ad_unit, "adUnit");
        return networkSettings.isBidder(ad_unit);
    }

    public static ConcurrentHashMap<String, List<String>> b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(C0180c.a().f4335d);
        concurrentHashMap.putAll(com.ironsource.mediationsdk.d.c.a().c());
        return concurrentHashMap;
    }

    public static void b(Activity activity) {
        if (activity != null) {
            IronSource.showRewardedVideo(activity);
        } else {
            IronSource.showRewardedVideo();
        }
    }

    public static void b(IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.destroyBanner(ironSourceBannerLayout);
    }

    public static JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMap = C0180c.a().f4332a;
            f.e(concurrentHashMap, "networkAdaptersMap");
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                if (((AdapterBaseWrapper) next.getValue()).getAdapterBaseInterface() != null) {
                    String str = (String) next.getKey();
                    AdapterBaseInterface adapterBaseInterface = ((AdapterBaseWrapper) next.getValue()).getAdapterBaseInterface();
                    f.e(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    f.e(adapterVersion, "adapterBaseInterface.adapterVersion");
                    String networkSDKVersion = adapterBaseInterface.getNetworkSDKVersion();
                    e eVar = new e("adapterVersion", adapterVersion);
                    e[] eVarArr = {eVar, new e("sdkVersion", networkSDKVersion)};
                    LinkedHashMap linkedHashMap = new LinkedHashMap(z5.c.m(2));
                    for (int i10 = 0; i10 < 2; i10++) {
                        e eVar2 = eVarArr[i10];
                        linkedHashMap.put(eVar2.f10603a, eVar2.f10604b);
                    }
                    jSONObject.putOpt(str, new JSONObject(linkedHashMap));
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static int d() {
        return com.ironsource.environment.h.l();
    }

    public static void e() {
        z a10 = z.a();
        com.ironsource.mediationsdk.adunit.c.f fVar = a10.A;
        if (fVar != null) {
            fVar.a((c) null);
        }
        h hVar = a10.B;
        if (hVar != null) {
            hVar.a((c) null);
        }
        b bVar = a10.C;
        if (bVar != null) {
            bVar.a((c) null);
        }
        a10.O = false;
    }

    public static void f() {
        IronSource.loadInterstitial();
    }

    public static boolean g() {
        return IronSource.isInterstitialReady();
    }

    public static void h() {
        IronSource.loadRewardedVideo();
    }

    public static boolean i() {
        return IronSource.isRewardedVideoAvailable();
    }
}
