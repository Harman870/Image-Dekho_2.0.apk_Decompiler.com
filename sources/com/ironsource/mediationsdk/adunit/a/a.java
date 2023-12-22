package com.ironsource.mediationsdk.adunit.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f4111a;

    /* renamed from: b  reason: collision with root package name */
    public String f4112b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f4113c;

    /* renamed from: d  reason: collision with root package name */
    public String f4114d;

    /* renamed from: e  reason: collision with root package name */
    public int f4115e;

    /* renamed from: f  reason: collision with root package name */
    public int f4116f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4117g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4118h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f4119i;

    /* renamed from: j  reason: collision with root package name */
    public ImpressionData f4120j;
    public boolean k;

    public a(String str) {
        this.f4111a = null;
        this.f4112b = "";
        this.f4113c = null;
        this.f4114d = "";
        this.f4115e = -1;
        this.f4116f = -1;
        this.f4117g = new ArrayList();
        this.f4118h = new ArrayList();
        this.f4119i = new ArrayList();
        this.f4120j = null;
        this.k = true;
        this.f4111a = str;
    }

    public a(JSONObject jSONObject) {
        this(jSONObject, -1, (JSONObject) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075 A[Catch:{ Exception -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac A[Catch:{ Exception -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(org.json.JSONObject r12, int r13, org.json.JSONObject r14) {
        /*
            r11 = this;
            java.lang.String r0 = "notifications"
            java.lang.String r1 = "price"
            java.lang.String r2 = "serverData"
            java.lang.String r3 = "adMarkup"
            java.lang.String r4 = "instance"
            r11.<init>()
            r5 = 0
            r11.f4111a = r5
            java.lang.String r6 = ""
            r11.f4112b = r6
            r11.f4113c = r5
            r11.f4114d = r6
            r6 = -1
            r11.f4115e = r6
            r11.f4116f = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r11.f4117g = r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r11.f4118h = r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r11.f4119i = r8
            r11.f4120j = r5
            r5 = 1
            r11.k = r5
            r9 = 0
            boolean r10 = r12.has(r4)     // Catch:{ Exception -> 0x00bb }
            if (r10 == 0) goto L_0x0044
            java.lang.String r4 = r12.getString(r4)     // Catch:{ Exception -> 0x00bb }
            r11.f4111a = r4     // Catch:{ Exception -> 0x00bb }
        L_0x0044:
            boolean r4 = r12.has(r3)     // Catch:{ Exception -> 0x00bb }
            if (r4 == 0) goto L_0x004f
            java.lang.String r2 = r12.getString(r3)     // Catch:{ Exception -> 0x00bb }
            goto L_0x005d
        L_0x004f:
            boolean r3 = r12.has(r2)     // Catch:{ Exception -> 0x00bb }
            if (r3 == 0) goto L_0x005f
            org.json.JSONObject r2 = r12.getJSONObject(r2)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00bb }
        L_0x005d:
            r11.f4112b = r2     // Catch:{ Exception -> 0x00bb }
        L_0x005f:
            java.lang.String r2 = "adData"
            org.json.JSONObject r2 = r12.optJSONObject(r2)     // Catch:{ Exception -> 0x00bb }
            r11.f4113c = r2     // Catch:{ Exception -> 0x00bb }
            java.lang.String r2 = "0"
            java.lang.String r2 = r12.optString(r1, r2)     // Catch:{ Exception -> 0x00bb }
            r11.f4114d = r2     // Catch:{ Exception -> 0x00bb }
            boolean r2 = r12.has(r0)     // Catch:{ Exception -> 0x00bb }
            if (r2 == 0) goto L_0x0088
            org.json.JSONObject r0 = r12.getJSONObject(r0)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r2 = "burl"
            b(r2, r6, r0)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r2 = "lurl"
            b(r2, r7, r0)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r2 = "nurl"
            b(r2, r8, r0)     // Catch:{ Exception -> 0x00bb }
        L_0x0088:
            java.lang.String r0 = "armData"
            org.json.JSONObject r0 = r12.optJSONObject(r0)     // Catch:{ Exception -> 0x00bb }
            com.ironsource.mediationsdk.impressionData.ImpressionData r2 = new com.ironsource.mediationsdk.impressionData.ImpressionData     // Catch:{ Exception -> 0x00bb }
            r3 = 2
            org.json.JSONObject[] r3 = new org.json.JSONObject[r3]     // Catch:{ Exception -> 0x00bb }
            r3[r9] = r14     // Catch:{ Exception -> 0x00bb }
            r3[r5] = r0     // Catch:{ Exception -> 0x00bb }
            org.json.JSONObject r14 = com.ironsource.mediationsdk.d.c.a((org.json.JSONObject[]) r3)     // Catch:{ Exception -> 0x00bb }
            r2.<init>((org.json.JSONObject) r14)     // Catch:{ Exception -> 0x00bb }
            r11.f4120j = r2     // Catch:{ Exception -> 0x00bb }
            java.lang.String r14 = "order"
            org.json.JSONObject r12 = r12.optJSONObject(r14)     // Catch:{ Exception -> 0x00bb }
            r11.f4115e = r13     // Catch:{ Exception -> 0x00bb }
            r11.f4116f = r13     // Catch:{ Exception -> 0x00bb }
            if (r12 == 0) goto L_0x00ba
            java.lang.String r14 = "show"
            int r13 = r12.optInt(r14, r13)     // Catch:{ Exception -> 0x00bb }
            r11.f4115e = r13     // Catch:{ Exception -> 0x00bb }
            int r12 = r12.optInt(r1, r13)     // Catch:{ Exception -> 0x00bb }
            r11.f4116f = r12     // Catch:{ Exception -> 0x00bb }
        L_0x00ba:
            return
        L_0x00bb:
            r12 = move-exception
            r11.k = r9
            com.ironsource.mediationsdk.logger.IronLog r13 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "exception "
            r14.<init>(r0)
            java.lang.String r12 = r12.getMessage()
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.error(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.a.a.<init>(org.json.JSONObject, int, org.json.JSONObject):void");
    }

    public static int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static int b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1021;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return 1020;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return IronSourceError.ERROR_BN_EMPTY_DEFAULT_PLACEMENT;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return IronSourceError.ERROR_NT_EMPTY_DEFAULT_PLACEMENT;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static void b(String str, ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            arrayList.addAll(c.a(jSONObject.getJSONArray(str)));
        }
    }

    public static int c(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_LOAD_DURING_SHOW;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static int d(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static int e(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static int f(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData = this.f4120j;
        if (impressionData == null) {
            return null;
        }
        ImpressionData impressionData2 = new ImpressionData(impressionData);
        impressionData2.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        return impressionData2;
    }

    public String a() {
        return this.f4111a;
    }

    public String b() {
        return this.f4112b;
    }

    public JSONObject c() {
        return this.f4113c;
    }

    public String d() {
        return this.f4114d;
    }

    public int e() {
        return this.f4115e;
    }

    public int f() {
        return this.f4116f;
    }

    public List<String> g() {
        return this.f4117g;
    }

    public List<String> h() {
        return this.f4118h;
    }

    public List<String> i() {
        return this.f4119i;
    }

    public boolean j() {
        return this.k;
    }
}
