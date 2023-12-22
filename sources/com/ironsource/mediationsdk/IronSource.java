package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.I;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.c.h;
import com.ironsource.mediationsdk.d.b;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.r;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.e;
import com.ironsource.mediationsdk.model.l;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.sdk.f;
import com.ironsource.mediationsdk.testSuite.b.a;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.j;
import com.ironsource.mediationsdk.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE),
        OFFERWALL("offerwall"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");
        

        /* renamed from: a  reason: collision with root package name */
        public String f3930a;

        /* access modifiers changed from: public */
        AD_UNIT(String str) {
            this.f3930a = str;
        }

        public final String toString() {
            return this.f3930a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        z a10 = z.a();
        if (b.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            c.a().a(impressionDataListener);
            a0 a0Var = a10.N;
            if (a0Var != null) {
                a0Var.a(impressionDataListener);
            }
            c0 c0Var = a10.P;
            if (c0Var != null) {
                c0Var.a(impressionDataListener);
            }
            I i10 = a10.Q;
            if (i10 != null) {
                i10.a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        z.a().f5061j = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        return z.a().a(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        z a10 = z.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            a10.f5049d.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        com.ironsource.mediationsdk.adunit.c.b bVar;
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!a10.Y || (bVar = a10.C) == null) {
                I i10 = a10.Q;
                if (i10 != null) {
                    IronLog.INTERNAL.verbose();
                    I.b bVar2 = new I.b(ironSourceBannerLayout);
                    if (ironSourceBannerLayout != null) {
                        if (!ironSourceBannerLayout.isDestroyed()) {
                            bVar2.a();
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                    bVar2.a(String.format("can't destroy banner - %s", objArr));
                    return;
                }
                return;
            }
            bVar.a(ironSourceBannerLayout);
        } catch (Throwable th) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static void destroyISDemandOnlyBanner(String str) {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = a10.f5054f0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        z.a();
        return z.a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b10;
        synchronized (IronSource.class) {
            b10 = z.a().b(context);
        }
        return b10;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return z.a().i(str);
    }

    @Deprecated
    public static void getOfferwallCredits() {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            f fVar = a10.f5047c.f4315b;
            if (fVar != null) {
                fVar.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return z.a().j(str);
    }

    public static void init(Context context, String str) {
        init(context, str, (AD_UNIT[]) null);
    }

    public static void init(Context context, String str, InitializationListener initializationListener) {
        init(context, str, initializationListener, (AD_UNIT[]) null);
    }

    public static void init(Context context, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        z.a().a(context, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Context context, String str, AD_UNIT... ad_unitArr) {
        z.a().a(context, str, false, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        z.a().a(context, str, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        z a10 = z.a();
        if (!a10.h()) {
            return false;
        }
        e eVar = null;
        try {
            eVar = a10.f5053f.f5019c.d().a(str);
            if (eVar == null && (eVar = a10.f5053f.f5019c.d().a()) == null) {
                a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (eVar == null) {
            return false;
        }
        return j.b(ContextProvider.getInstance().getApplicationContext(), eVar.getPlacementName());
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return z.a().g(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return z.a().f(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isInterstitialPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.z r0 = com.ironsource.mediationsdk.z.a()
            boolean r1 = r0.E
            r2 = 0
            if (r1 == 0) goto L_0x000a
            goto L_0x006d
        L_0x000a:
            com.ironsource.mediationsdk.utils.k r1 = r0.f5053f
            if (r1 == 0) goto L_0x0045
            com.ironsource.mediationsdk.model.f r1 = r1.f5019c
            if (r1 == 0) goto L_0x0045
            com.ironsource.mediationsdk.model.h r1 = r1.b()
            if (r1 != 0) goto L_0x0019
            goto L_0x0045
        L_0x0019:
            r1 = 0
            com.ironsource.mediationsdk.model.InterstitialPlacement r1 = r0.O(r7)     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x0035
            com.ironsource.mediationsdk.model.InterstitialPlacement r1 = r0.e()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x0035
            java.lang.String r3 = "Default placement was not found"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r0.f5049d     // Catch:{ Exception -> 0x0031 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0031 }
            r6 = 3
            r4.log(r5, r3, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0035:
            if (r1 != 0) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r3 = r3.getApplicationContext()
            int r1 = com.ironsource.mediationsdk.utils.j.b((android.content.Context) r3, (com.ironsource.mediationsdk.model.InterstitialPlacement) r1)
            goto L_0x0047
        L_0x0045:
            int r1 = com.ironsource.mediationsdk.utils.j.a.f5014d
        L_0x0047:
            int r3 = com.ironsource.mediationsdk.utils.j.a.f5014d
            r4 = 1
            if (r1 == r3) goto L_0x004d
            r2 = r4
        L_0x004d:
            if (r2 == 0) goto L_0x006d
            boolean r0 = r0.E
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r0, r4, r4)
            java.lang.String r1 = "placement"
            r0.put(r1, r7)     // Catch:{ Exception -> 0x005f }
            java.lang.String r7 = "programmatic"
            r0.put(r7, r4)     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            com.ironsource.environment.c.a r7 = new com.ironsource.environment.c.a
            r1 = 2103(0x837, float:2.947E-42)
            r7.<init>(r1, r0)
            com.ironsource.mediationsdk.events.e r0 = com.ironsource.mediationsdk.events.e.d()
            r0.a((com.ironsource.environment.c.a) r7)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isInterstitialPlacementCapped(java.lang.String):boolean");
    }

    public static boolean isInterstitialReady() {
        return z.a().f();
    }

    @Deprecated
    public static boolean isOfferwallAvailable() {
        return z.a().i();
    }

    public static boolean isRewardedVideoAvailable() {
        return z.a().d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.z r0 = com.ironsource.mediationsdk.z.a()
            com.ironsource.mediationsdk.utils.k r1 = r0.f5053f
            r2 = 3
            if (r1 == 0) goto L_0x003f
            com.ironsource.mediationsdk.model.f r1 = r1.f5019c
            if (r1 == 0) goto L_0x003f
            com.ironsource.mediationsdk.model.q r1 = r1.a()
            if (r1 != 0) goto L_0x0014
            goto L_0x003f
        L_0x0014:
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r1 = r0.N(r7)     // Catch:{ Exception -> 0x002b }
            if (r1 != 0) goto L_0x002f
            com.ironsource.mediationsdk.model.Placement r1 = r0.R()     // Catch:{ Exception -> 0x002b }
            if (r1 != 0) goto L_0x002f
            java.lang.String r3 = "Default placement was not found"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r0.f5049d     // Catch:{ Exception -> 0x002b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x002b }
            r4.log(r5, r3, r2)     // Catch:{ Exception -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r3 = move-exception
            r3.printStackTrace()
        L_0x002f:
            if (r1 != 0) goto L_0x0032
            goto L_0x003f
        L_0x0032:
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r3 = r3.getApplicationContext()
            int r1 = com.ironsource.mediationsdk.utils.j.b((android.content.Context) r3, (com.ironsource.mediationsdk.model.Placement) r1)
            goto L_0x0041
        L_0x003f:
            int r1 = com.ironsource.mediationsdk.utils.j.a.f5014d
        L_0x0041:
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0054
            int[] r6 = com.ironsource.mediationsdk.z.AnonymousClass2.f5078c
            int r1 = r1 - r5
            r1 = r6[r1]
            if (r1 == r5) goto L_0x0052
            if (r1 == r3) goto L_0x0052
            if (r1 == r2) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r1 = r5
            goto L_0x0055
        L_0x0054:
            r1 = r4
        L_0x0055:
            if (r1 == 0) goto L_0x0075
            boolean r2 = r0.D
            int r0 = r0.Z
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r5, r0)
            if (r7 == 0) goto L_0x0070
            java.lang.Object[][] r2 = new java.lang.Object[r5][]
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = "placement"
            r3[r4] = r6
            r3[r5] = r7
            r2[r4] = r3
            com.ironsource.mediationsdk.z.w(r0, r2)
        L_0x0070:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.z.r(r7, r0)
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void launchTestSuite(Context context) {
        boolean z9;
        z a10 = z.a();
        a aVar = a.f4899a;
        aVar.a();
        if (!a10.f5068q) {
            aVar.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        k kVar = a10.f5053f;
        if (kVar == null || !kVar.c()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            aVar.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
        } else if (!IronSourceUtils.isNetworkConnected(context)) {
            aVar.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
        } else {
            com.ironsource.mediationsdk.adunit.c.f fVar = a10.A;
            if (fVar != null) {
                fVar.o();
            }
            h hVar = a10.B;
            if (hVar != null) {
                hVar.o();
            }
            com.ironsource.mediationsdk.adunit.c.b bVar = a10.C;
            if (bVar != null) {
                bVar.o();
                com.ironsource.mediationsdk.adunit.c.b bVar2 = a10.C;
                IronSourceBannerLayout ironSourceBannerLayout = bVar2.f4207a;
                if (ironSourceBannerLayout != null) {
                    bVar2.a(ironSourceBannerLayout);
                }
            }
            new com.ironsource.mediationsdk.testSuite.b().a(context, a10.f5055g, a10.f5053f.f5020d, IronSourceUtils.getSDKVersion(), a10.f5053f.f5019c.g().a(), a10.M, a10.T);
            a10.O = true;
            aVar.b();
        }
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        z.a().a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        z.a().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        z.a().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        z.a().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        z.a().c(activity, str);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        z.a().c(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        z.a().b(activity, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        z.a().a(activity, str, str2);
    }

    public static void loadInterstitial() {
        z a10 = z.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (a10.E) {
                a10.f5049d.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C0192q.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a10.H) {
                a10.f5049d.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                C0192q.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                E.a b10 = E.a().b();
                if (b10 == E.a.INIT_FAILED) {
                    a10.f5049d.log(ironSourceTag, "init() had failed", 3);
                    C0192q.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b10 == E.a.INIT_IN_PROGRESS) {
                    if (E.a().c()) {
                        a10.f5049d.log(ironSourceTag, "init() had failed", 3);
                        C0192q.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    a10.X = true;
                } else if (!a10.K()) {
                    a10.f5049d.log(ironSourceTag, "No interstitial configurations found", 3);
                    C0192q.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else {
                    if (a10.W) {
                        com.ironsource.mediationsdk.adunit.c.f fVar = a10.A;
                        if (fVar != null) {
                            fVar.i();
                            return;
                        }
                    } else {
                        c0 c0Var = a10.P;
                        if (c0Var != null) {
                            c0Var.d();
                            return;
                        }
                    }
                    a10.X = true;
                }
            }
        } catch (Throwable th) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C0192q.a().a(AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        z a10 = z.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (a10.D) {
                a10.f5049d.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C0192q.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a10.T && !a10.O) {
                a10.f5049d.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a10.G) {
                a10.f5049d.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                C0192q.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                E.a b10 = E.a().b();
                if (b10 == E.a.INIT_FAILED) {
                    a10.f5049d.log(ironSourceTag, "init() had failed", 3);
                    C0192q.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b10 == E.a.INIT_IN_PROGRESS) {
                    if (E.a().c()) {
                        a10.f5049d.log(ironSourceTag, "init() had failed", 3);
                        C0192q.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    a10.U = true;
                } else if (!a10.J()) {
                    a10.f5049d.log(ironSourceTag, "No rewarded video configurations found", 3);
                    C0192q.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    h hVar = a10.B;
                    if (hVar == null) {
                        a10.U = true;
                    } else {
                        hVar.i();
                    }
                }
            }
        } catch (Throwable th) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C0192q.a().a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        z a10 = z.a();
        try {
            a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        z a10 = z.a();
        try {
            a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        z a10 = z.a();
        if (b.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            c.a().b(impressionDataListener);
            a0 a0Var = a10.N;
            if (a0Var != null) {
                a0Var.b(impressionDataListener);
            }
            c0 c0Var = a10.P;
            if (c0Var != null) {
                c0Var.b(impressionDataListener);
            }
            I i10 = a10.Q;
            if (i10 != null) {
                i10.b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a10.f5051e.f4838b = null;
        C0196u.a().a((InterstitialListener) null);
        C0196u.a().a((LevelPlayInterstitialListener) null);
    }

    @Deprecated
    public static void removeOfferwallListener() {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a10.f5051e.f4839c = null;
    }

    public static void removeRewardedVideoListener() {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a10.f5051e.f4837a = null;
        P.a().f3993a = null;
        P.a().f3994b = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        z a10 = z.a();
        if (b.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && b.a((Object) str, "setAdRevenueData - dataSource is null")) {
            a10.f5056g0.a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z9) {
        z.a();
        z.a(z9);
    }

    public static void setConsent(boolean z9) {
        z.a().b(z9);
    }

    public static boolean setDynamicUserId(String str) {
        return z.a().c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        z.a().f5062j0.a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        z.a();
        r.a().f4474a = iSDemandOnlyRewardedVideoListener;
    }

    @Deprecated
    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a10.f5051e.f4838b = interstitialListener;
        C0196u.a().a(interstitialListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        z.a();
        z.a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        z.a();
        z.a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        z.a().a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        z a10 = z.a();
        if (logListener == null) {
            a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a10.f5063l.f4672c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a10.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        z.a().a(rewardedVideoManualListener);
    }

    public static void setMediationType(String str) {
        z.a().d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        z.a().a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        z.a().a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        z.a();
        z.a(str, jSONObject);
    }

    @Deprecated
    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a10.f5051e.f4839c = offerwallListener;
    }

    @Deprecated
    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        z a10 = z.a();
        a10.f5049d.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a10.f5051e.f4837a = rewardedVideoListener;
        P.a().f3993a = rewardedVideoListener;
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        z a10 = z.a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a10.f5049d.log(IronSourceLogger.IronSourceTag.API, a10.f5043a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a10.f5061j = new HashMap(map);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager ironSourceLoggerManager = a10.f5049d;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a10.f5043a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e10);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        z a10 = z.a();
        a10.f5074y = ironSourceSegment;
        h hVar = a10.B;
        if (hVar != null) {
            hVar.a(ironSourceSegment);
        }
        a0 a0Var = a10.N;
        if (a0Var != null) {
            a0Var.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.adunit.c.f fVar = a10.A;
        if (fVar != null) {
            fVar.a(ironSourceSegment);
        }
        c0 c0Var = a10.P;
        if (c0Var != null) {
            c0Var.a(ironSourceSegment);
        }
        I i10 = a10.Q;
        if (i10 != null) {
            i10.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.adunit.c.b bVar = a10.C;
        if (bVar != null) {
            bVar.a(ironSourceSegment);
        }
        AdQualityBridge adQualityBridge = a10.f5060i0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        com.ironsource.mediationsdk.events.e.d().w = a10.f5074y;
        i d10 = i.d();
        IronSourceSegment ironSourceSegment2 = a10.f5074y;
        d10.w = ironSourceSegment2;
        com.ironsource.mediationsdk.events.h.f4553x.w = ironSourceSegment2;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        z a10 = z.a();
        com.ironsource.mediationsdk.sdk.e eVar = a10.f5051e;
        if (eVar != null) {
            eVar.f4840d = segmentListener;
            E.a().f3871t = a10.f5051e;
        }
    }

    public static void setUserId(String str) {
        z a10 = z.a();
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str);
        a10.f5057h = str;
        i.d().a(new com.ironsource.environment.c.a(52, IronSourceUtils.getJsonForUserId(false)));
        AdQualityBridge adQualityBridge = a10.f5060i0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public static void setWaterfallConfiguration(WaterfallConfiguration waterfallConfiguration, AD_UNIT ad_unit) {
        z a10 = z.a();
        if (ad_unit == null) {
            IronLog.API.error("AdUnit should not be null.");
            return;
        }
        IronLog ironLog = IronLog.API;
        Object[] objArr = new Object[2];
        objArr[0] = ad_unit.name();
        objArr[1] = waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString();
        ironLog.info(String.format("(%s, %s)", objArr));
        com.ironsource.environment.c.a aVar = new com.ironsource.environment.c.a(53, IronSourceUtils.getMediationAdditionalData(false));
        aVar.a(IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        i.d().a(aVar, ad_unit);
        a10.f5058h0.a(ad_unit, waterfallConfiguration);
    }

    public static void shouldTrackNetworkState(Context context, boolean z9) {
        z a10 = z.a();
        a10.f5070s = context;
        a10.f5071t = Boolean.valueOf(z9);
        if (a10.W) {
            com.ironsource.mediationsdk.adunit.c.f fVar = a10.A;
            if (fVar != null) {
                fVar.a(context, z9);
            }
        } else {
            c0 c0Var = a10.P;
            if (c0Var != null) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Should Track Network State: " + z9, 0);
                c0Var.A = z9;
            }
        }
        if (a10.V) {
            h hVar = a10.B;
            if (hVar != null) {
                hVar.a(context, z9);
                return;
            }
            return;
        }
        a0 a0Var = a10.N;
        if (a0Var != null) {
            a0Var.a(context, z9);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        z a10 = z.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a10.E) {
                a10.f5049d.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = a10.f5050d0;
            if (fVar == null) {
                a10.f5049d.log(ironSourceTag, "Interstitial video was not initiated", 3);
                ((ISDemandOnlyInterstitialListener) a10.f5062j0.a(str)).onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
                return;
            }
            fVar.a(str);
        } catch (Exception e10) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e10);
            ((ISDemandOnlyInterstitialListener) a10.f5062j0.a(str)).onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        z.a().e(str);
    }

    public static void showInterstitial() {
        z.a().b((Activity) null);
    }

    public static void showInterstitial(Activity activity) {
        z.a().b(activity);
    }

    public static void showInterstitial(Activity activity, String str) {
        z.a().b(activity, str);
    }

    public static void showInterstitial(String str) {
        z.a().b((Activity) null, str);
    }

    @Deprecated
    public static void showOfferwall() {
        z a10 = z.a();
        try {
            a10.f5049d.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a10.L()) {
                a10.f5051e.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            l a11 = a10.f5053f.f5019c.c().a();
            if (a11 != null) {
                a10.h(a11.getPlacementName());
            }
        } catch (Exception e10) {
            a10.f5049d.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e10);
            a10.f5051e.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    @Deprecated
    public static void showOfferwall(String str) {
        z.a().h(str);
    }

    public static void showRewardedVideo() {
        z.a().a((Activity) null);
    }

    public static void showRewardedVideo(Activity activity) {
        z.a().a(activity);
    }

    public static void showRewardedVideo(Activity activity, String str) {
        z.a().a(activity, str);
    }

    public static void showRewardedVideo(String str) {
        z.a().a((Activity) null, str);
    }
}
