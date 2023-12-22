package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.l;
import com.ironsource.mediationsdk.sdk.d;
import com.ironsource.mediationsdk.sdk.e;
import com.ironsource.mediationsdk.sdk.f;
import com.ironsource.mediationsdk.services.IMediationServiceEditor;
import com.ironsource.mediationsdk.services.IMediationServiceProvider;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class b0 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4314a = b0.class.getName();

    /* renamed from: b  reason: collision with root package name */
    public f f4315b;

    /* renamed from: c  reason: collision with root package name */
    public e f4316c;

    /* renamed from: d  reason: collision with root package name */
    public IronSourceLoggerManager f4317d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f4318e;

    /* renamed from: f  reason: collision with root package name */
    public AtomicBoolean f4319f;

    /* renamed from: g  reason: collision with root package name */
    public k f4320g;

    /* renamed from: h  reason: collision with root package name */
    public NetworkSettings f4321h;

    /* renamed from: i  reason: collision with root package name */
    public String f4322i;

    /* renamed from: j  reason: collision with root package name */
    public final a f4323j;
    public final a.C0056a k;

    public b0() {
        IMediationServiceProvider provider = MediationServices.getProvider();
        IMediationServiceEditor editor = MediationServices.getEditor();
        this.f4323j = provider.getSessionDepthService();
        this.k = editor.getSessionDepthServiceEditor();
        this.f4318e = new AtomicBoolean(true);
        this.f4319f = new AtomicBoolean(false);
        this.f4317d = IronSourceLoggerManager.getLogger();
    }

    public final synchronized void a(IronSourceError ironSourceError) {
        AtomicBoolean atomicBoolean = this.f4319f;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        AtomicBoolean atomicBoolean2 = this.f4318e;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(true);
        }
        e eVar = this.f4316c;
        if (eVar != null) {
            eVar.a(false, ironSourceError);
        }
    }

    public final void a(String str) {
        f fVar;
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f4316c.onOfferwallShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.OFFERWALL_AD_UNIT, "Activity must be provided when initializing SDK"));
            } else if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.f4316c.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
            } else {
                this.f4322i = str;
                l a10 = this.f4320g.f5019c.c().a(str);
                if (a10 == null) {
                    IronSourceLoggerManager ironSourceLoggerManager = this.f4317d;
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                    a10 = this.f4320g.f5019c.c().a();
                    if (a10 == null) {
                        this.f4317d.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                        return;
                    }
                }
                this.f4317d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
                AtomicBoolean atomicBoolean = this.f4319f;
                if (atomicBoolean != null && atomicBoolean.get() && (fVar = this.f4315b) != null) {
                    fVar.showOfferwall(String.valueOf(a10.getPlacementId()), this.f4321h.getRewardedVideoSettings());
                }
            }
        } catch (Exception e10) {
            this.f4317d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b A[SYNTHETIC, Splitter:B:30:0x009b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f4317d     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r2.<init>()     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r7.f4314a     // Catch:{ all -> 0x0107 }
            r2.append(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = ":initOfferwall(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x0107 }
            r2.append(r8)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x0107 }
            r2.append(r9)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0107 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.z r0 = com.ironsource.mediationsdk.z.a()     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.utils.k r0 = r0.f5053f     // Catch:{ all -> 0x0107 }
            r7.f4320g = r0     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0043
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x0107 }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0107 }
            monitor-exit(r7)
            return
        L_0x0043:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0107 }
            android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x005a
            java.lang.String r8 = "Activity must be provided when initializing SDK"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x0107 }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0107 }
            monitor-exit(r7)
            return
        L_0x005a:
            com.ironsource.mediationsdk.utils.k r0 = r7.f4320g     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0080
            com.ironsource.mediationsdk.model.f r1 = r0.f5019c     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x0080
            com.ironsource.mediationsdk.model.k r1 = r1.c()     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x0080
            com.ironsource.mediationsdk.model.f r1 = r0.f5019c     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.model.k r1 = r1.c()     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.b()     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x0075
            goto L_0x0080
        L_0x0075:
            com.ironsource.mediationsdk.model.f r0 = r0.f5019c     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.model.k r0 = r0.c()     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = r0.b()     // Catch:{ all -> 0x0107 }
            goto L_0x0082
        L_0x0080:
            java.lang.String r0 = "SupersonicAds"
        L_0x0082:
            com.ironsource.mediationsdk.utils.k r1 = r7.f4320g     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.model.p r1 = r1.f5018b     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.a((java.lang.String) r0)     // Catch:{ all -> 0x0107 }
            r7.f4321h = r1     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x009b
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x0107 }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0107 }
            monitor-exit(r7)
            return
        L_0x009b:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r7.b(r0)     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x0107 }
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0107 }
            monitor-exit(r7)
            return
        L_0x00ae:
            com.ironsource.mediationsdk.z r1 = com.ironsource.mediationsdk.z.a()     // Catch:{ Exception -> 0x00d8 }
            java.lang.Boolean r1 = r1.M     // Catch:{ Exception -> 0x00d8 }
            if (r1 == 0) goto L_0x00f3
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f4317d     // Catch:{ Exception -> 0x00d8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ Exception -> 0x00d8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r6 = "Offerwall | setConsent(consent:"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00d8 }
            r5.append(r1)     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00d8 }
            r2.log(r4, r5, r3)     // Catch:{ Exception -> 0x00d8 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00d8 }
            r0.setConsent(r1)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00f3
        L_0x00d8:
            r1 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f4317d     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            java.lang.String r5 = ":setCustomParams():"
            r4.<init>(r5)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            r4.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0107 }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ all -> 0x0107 }
        L_0x00f3:
            com.ironsource.mediationsdk.sdk.f r0 = (com.ironsource.mediationsdk.sdk.f) r0     // Catch:{ all -> 0x0107 }
            r7.f4315b = r0     // Catch:{ all -> 0x0107 }
            r0.setInternalOfferwallListener(r7)     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.sdk.f r0 = r7.f4315b     // Catch:{ all -> 0x0107 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r7.f4321h     // Catch:{ all -> 0x0107 }
            org.json.JSONObject r1 = r1.getRewardedVideoSettings()     // Catch:{ all -> 0x0107 }
            r0.initOfferwall(r8, r9, r1)     // Catch:{ all -> 0x0107 }
            monitor-exit(r7)
            return
        L_0x0107:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.b0.a(java.lang.String, java.lang.String):void");
    }

    public final void a(boolean z9, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f4317d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z9 + ")", 1);
        if (z9) {
            this.f4319f.set(true);
            e eVar = this.f4316c;
            if (eVar != null) {
                eVar.onOfferwallAvailable(true);
                return;
            }
            return;
        }
        a(ironSourceError);
    }

    public final synchronized boolean a() {
        boolean z9;
        z9 = false;
        AtomicBoolean atomicBoolean = this.f4319f;
        if (atomicBoolean != null) {
            z9 = atomicBoolean.get();
        }
        return z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        r2 = r8.f4317d;
        r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        r2.log(r3, r9 + " initialization failed - please verify that required dependencies are in you build path.", 2);
        r8.f4317d.logException(r3, androidx.activity.e.c(new java.lang.StringBuilder(), r8.f4314a, ":startOfferwallAdapter"), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.AbstractAdapter b(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            com.ironsource.mediationsdk.z r1 = com.ironsource.mediationsdk.z.a()     // Catch:{ all -> 0x0051 }
            com.ironsource.mediationsdk.AbstractAdapter r2 = r1.A(r9)     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0049
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "com.ironsource.adapters."
            r2.<init>(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = com.ironsource.environment.StringUtils.toLowerCase(r9)     // Catch:{ all -> 0x0051 }
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r9)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Adapter"
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "startAdapter"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0051 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x0051 }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r5)     // Catch:{ all -> 0x0051 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0051 }
            r4[r7] = r9     // Catch:{ all -> 0x0051 }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ all -> 0x0051 }
            com.ironsource.mediationsdk.AbstractAdapter r2 = (com.ironsource.mediationsdk.AbstractAdapter) r2     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0049
            return r0
        L_0x0049:
            monitor-enter(r1)     // Catch:{ all -> 0x0051 }
            r1.f5045b = r2     // Catch:{ all -> 0x004e }
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x004e:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r8.f4317d
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r9 = " initialization failed - please verify that required dependencies are in you build path."
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            r4 = 2
            r2.log(r3, r9, r4)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f4317d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r8.f4314a
            java.lang.String r5 = ":startOfferwallAdapter"
            java.lang.String r2 = androidx.activity.e.c(r2, r4, r5)
            r9.logException(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.b0.b(java.lang.String):com.ironsource.mediationsdk.AbstractAdapter");
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f4317d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        e eVar = this.f4316c;
        if (eVar != null) {
            eVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    public final boolean onOfferwallAdCredited(int i10, int i11, boolean z9) {
        this.f4317d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        e eVar = this.f4316c;
        if (eVar != null) {
            return eVar.onOfferwallAdCredited(i10, i11, z9);
        }
        return false;
    }

    public final void onOfferwallAvailable(boolean z9) {
        a(z9, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        this.f4317d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        e eVar = this.f4316c;
        if (eVar != null) {
            eVar.onOfferwallClosed();
        }
    }

    public final void onOfferwallOpened() {
        this.f4317d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int a10 = this.f4323j.a(IronSource.AD_UNIT.OFFERWALL);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.f4322i)) {
                mediationAdditionalData.put("placement", this.f4322i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, a10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        i.d().a(new com.ironsource.environment.c.a(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        this.k.b(IronSource.AD_UNIT.OFFERWALL);
        e eVar = this.f4316c;
        if (eVar != null) {
            eVar.onOfferwallOpened();
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f4317d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        e eVar = this.f4316c;
        if (eVar != null) {
            eVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
