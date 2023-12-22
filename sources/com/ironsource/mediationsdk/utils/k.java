package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.C0197v;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.f;
import com.ironsource.mediationsdk.model.o;
import com.ironsource.mediationsdk.model.p;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public o f5017a;

    /* renamed from: b  reason: collision with root package name */
    public p f5018b;

    /* renamed from: c  reason: collision with root package name */
    public f f5019c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f5020d;

    /* renamed from: e  reason: collision with root package name */
    public int f5021e = a.f5025a;

    /* renamed from: f  reason: collision with root package name */
    public String f5022f;

    /* renamed from: g  reason: collision with root package name */
    public String f5023g;

    /* renamed from: h  reason: collision with root package name */
    public Context f5024h;

    /* 'enum' modifier removed */
    /* JADX WARNING: Enum class init method not found */
    public static final class a extends Enum<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5025a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5026b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5027c = 3;
    }

    public k(Context context, String str, String str2, String str3) {
        this.f5024h = context;
        try {
            this.f5020d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            i();
            j();
            h();
            this.f5022f = TextUtils.isEmpty(str) ? "" : str;
            this.f5023g = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e10) {
            e10.printStackTrace();
            g();
        }
    }

    public k(k kVar) {
        try {
            this.f5024h = kVar.f5024h;
            this.f5020d = new JSONObject(kVar.f5020d.toString());
            this.f5022f = kVar.f5022f;
            this.f5023g = kVar.f5023g;
            this.f5017a = kVar.f5017a;
            this.f5018b = kVar.f5018b;
            this.f5019c = kVar.f5019c;
            this.f5021e = kVar.f5021e;
        } catch (Exception unused) {
            g();
        }
    }

    public static int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int i11 = 0;
        if (jSONObject.has(str)) {
            i11 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i11 = jSONObject2.optInt(str, 0);
        }
        return i11 == 0 ? i10 : i11;
    }

    public static long b(JSONObject jSONObject, JSONObject jSONObject2) {
        long optLong = jSONObject.has("atim") ? jSONObject.optLong("atim", 0) : jSONObject2.has("atim") ? jSONObject2.optLong("atim", 0) : 0;
        if (optLong == 0) {
            return 10000;
        }
        return optLong;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r6.toString().equals(r5) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.mediationsdk.model.m c(org.json.JSONObject r8) {
        /*
            com.ironsource.mediationsdk.model.m$a r0 = new com.ironsource.mediationsdk.model.m$a
            r0.<init>()
            r1 = 1
            java.lang.String r2 = "delivery"
            boolean r2 = r8.optBoolean(r2, r1)
            r0.f4774a = r2
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r8.optJSONObject(r2)
            java.lang.String r3 = "enabled"
            r4 = 0
            if (r2 == 0) goto L_0x0054
            java.lang.String r5 = "unit"
            java.lang.String r5 = r2.optString(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x003f
            com.ironsource.mediationsdk.model.n r6 = com.ironsource.mediationsdk.model.n.PER_DAY
            java.lang.String r7 = r6.toString()
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0032
            goto L_0x0040
        L_0x0032:
            com.ironsource.mediationsdk.model.n r6 = com.ironsource.mediationsdk.model.n.PER_HOUR
            java.lang.String r7 = r6.toString()
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            java.lang.String r5 = "maxImpressions"
            int r5 = r2.optInt(r5, r4)
            boolean r2 = r2.optBoolean(r3, r4)
            if (r2 == 0) goto L_0x0050
            if (r5 <= 0) goto L_0x0050
            r2 = r1
            goto L_0x0051
        L_0x0050:
            r2 = r4
        L_0x0051:
            r0.a(r2, r6, r5)
        L_0x0054:
            java.lang.String r2 = "pacing"
            org.json.JSONObject r8 = r8.optJSONObject(r2)
            if (r8 == 0) goto L_0x006f
            java.lang.String r2 = "numOfSeconds"
            int r2 = r8.optInt(r2, r4)
            boolean r8 = r8.optBoolean(r3, r4)
            if (r8 == 0) goto L_0x006b
            if (r2 <= 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r1 = r4
        L_0x006c:
            r0.a(r1, r2)
        L_0x006f:
            com.ironsource.mediationsdk.model.m r8 = r0.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.k.c(org.json.JSONObject):com.ironsource.mediationsdk.model.m");
    }

    public static int[] d(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            iArr[i10] = optJSONArray.optInt(i10);
        }
        return iArr;
    }

    public static JSONObject e(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static JSONObject f(JSONObject jSONObject) {
        JSONObject e10 = e("providers", jSONObject);
        return e10 != null ? e10 : new JSONObject();
    }

    public final C0197v a() {
        return new C0197v(this.f5022f, this.f5023g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r8 = this;
            org.json.JSONObject r0 = r8.f5020d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "error"
            boolean r0 = r0.has(r3)
            if (r0 != 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x001e
            com.ironsource.mediationsdk.model.o r0 = r8.f5017a
            if (r0 == 0) goto L_0x001e
            r0 = r2
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0027
            com.ironsource.mediationsdk.model.p r0 = r8.f5018b
            if (r0 == 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            com.ironsource.mediationsdk.model.f r0 = r8.f5019c
            if (r0 == 0) goto L_0x0030
            r0 = r2
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            if (r0 == 0) goto L_0x0084
            org.json.JSONObject r0 = r8.f5020d
            java.lang.String r3 = "providerOrder"
            org.json.JSONObject r0 = e(r3, r0)
            org.json.JSONArray r3 = r0.names()
            if (r3 != 0) goto L_0x0043
        L_0x0041:
            r0 = r2
            goto L_0x0081
        L_0x0043:
            org.json.JSONObject r4 = r8.f5020d
            java.lang.String r5 = "configurations"
            org.json.JSONObject r4 = e(r5, r4)
            java.lang.String r5 = "adUnits"
            org.json.JSONObject r4 = e(r5, r4)
            r5 = r1
        L_0x0052:
            int r6 = r3.length()
            if (r5 >= r6) goto L_0x0041
            java.lang.String r6 = r3.optString(r5)
            org.json.JSONArray r7 = r0.optJSONArray(r6)
            if (r7 == 0) goto L_0x007e
            int r7 = r7.length()
            if (r7 == 0) goto L_0x007e
            org.json.JSONObject r6 = e(r6, r4)
            if (r6 == 0) goto L_0x007e
            java.lang.String r7 = "placements"
            org.json.JSONArray r6 = r6.optJSONArray(r7)
            if (r6 == 0) goto L_0x007c
            int r6 = r6.length()
            if (r6 != 0) goto L_0x007e
        L_0x007c:
            r0 = r1
            goto L_0x0081
        L_0x007e:
            int r5 = r5 + 1
            goto L_0x0052
        L_0x0081:
            if (r0 == 0) goto L_0x0084
            r1 = r2
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.k.b():boolean");
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.f5019c.g().a());
    }

    public final boolean d() {
        return this.f5019c.f().c().f5035d;
    }

    public final void g() {
        this.f5020d = new JSONObject();
        this.f5022f = "";
        this.f5023g = "";
        this.f5017a = new o();
        this.f5018b = p.a();
        this.f5019c = new f.a().a();
    }

    public final void h() {
        f fVar;
        f fVar2;
        try {
            JSONObject e10 = e("providerOrder", this.f5020d);
            JSONArray optJSONArray = e10.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = e10.optJSONArray(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
            JSONArray optJSONArray3 = e10.optJSONArray("banner");
            JSONArray optJSONArray4 = e10.optJSONArray("nativeAd");
            this.f5017a = new o();
            if (!(optJSONArray == null || (fVar2 = this.f5019c) == null || fVar2.a() == null)) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString = optJSONArray.optString(i10);
                    o oVar = this.f5017a;
                    if (!TextUtils.isEmpty(optString)) {
                        oVar.f4784a.add(optString);
                    }
                    NetworkSettings a10 = p.a().a(optString);
                    if (a10 != null) {
                        a10.setRewardedVideoPriority(i10);
                    }
                }
            }
            if (!(optJSONArray2 == null || (fVar = this.f5019c) == null || fVar.b() == null)) {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    String optString2 = optJSONArray2.optString(i11);
                    o oVar2 = this.f5017a;
                    if (!TextUtils.isEmpty(optString2)) {
                        oVar2.f4785b.add(optString2);
                    }
                    NetworkSettings a11 = p.a().a(optString2);
                    if (a11 != null) {
                        a11.setInterstitialPriority(i11);
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                    String optString3 = optJSONArray3.optString(i12);
                    o oVar3 = this.f5017a;
                    if (!TextUtils.isEmpty(optString3)) {
                        oVar3.f4786c.add(optString3);
                    }
                    NetworkSettings a12 = p.a().a(optString3);
                    if (a12 != null) {
                        a12.setBannerPriority(i12);
                    }
                }
            }
            if (optJSONArray4 != null) {
                for (int i13 = 0; i13 < optJSONArray4.length(); i13++) {
                    String optString4 = optJSONArray4.optString(i13);
                    o oVar4 = this.f5017a;
                    if (!TextUtils.isEmpty(optString4)) {
                        oVar4.f4787d.add(optString4);
                    }
                    NetworkSettings a13 = p.a().a(optString4);
                    if (a13 != null) {
                        a13.setNativeAdPriority(i13);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void i() {
        Iterator<String> it;
        String str;
        JSONObject jSONObject;
        p pVar;
        NetworkSettings networkSettings;
        String str2 = "Mediation";
        try {
            this.f5018b = p.a();
            JSONObject e10 = e("providerSettings", this.f5020d);
            Iterator<String> keys = e10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = e10.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, "0");
                    String optString2 = optJSONObject.optString("adSourceName", (String) null);
                    String optString3 = optJSONObject.optString("providerLoadName", next);
                    String optString4 = optJSONObject.optString("providerDefaultInstance", optString3);
                    JSONObject e11 = e("adUnits", optJSONObject);
                    JSONObject e12 = e("application", optJSONObject);
                    JSONObject e13 = e("rewardedVideo", e11);
                    JSONObject e14 = e(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, e11);
                    JSONObject e15 = e("banner", e11);
                    JSONObject e16 = e("nativeAd", e11);
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(e13, e12);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(e14, e12);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(e15, e12);
                    JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(e16, e12);
                    if (this.f5018b.b(next)) {
                        NetworkSettings a10 = this.f5018b.a(next);
                        JSONObject rewardedVideoSettings = a10.getRewardedVideoSettings();
                        JSONObject interstitialSettings = a10.getInterstitialSettings();
                        JSONObject bannerSettings = a10.getBannerSettings();
                        JSONObject nativeAdSettings = a10.getNativeAdSettings();
                        a10.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        a10.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        a10.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        a10.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, mergeJsons4));
                        a10.setIsMultipleInstances(optBoolean);
                        a10.setSubProviderId(optString);
                        a10.setAdSourceNameForEvents(optString2);
                    } else {
                        String lowerCase = StringUtils.toLowerCase(optString3);
                        jSONObject = e10;
                        if (this.f5018b.b(str2) && (StringUtils.toLowerCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME).equals(lowerCase) || StringUtils.toLowerCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME).equals(lowerCase))) {
                            NetworkSettings a11 = this.f5018b.a(str2);
                            JSONObject rewardedVideoSettings2 = a11.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = a11.getInterstitialSettings();
                            JSONObject bannerSettings2 = a11.getBannerSettings();
                            JSONObject nativeAdSettings2 = a11.getNativeAdSettings();
                            str = str2;
                            JSONObject jSONObject2 = new JSONObject(rewardedVideoSettings2.toString());
                            it = keys;
                            JSONObject jSONObject3 = new JSONObject(interstitialSettings2.toString());
                            String str3 = optString2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, e12, IronSourceUtils.mergeJsons(jSONObject2, mergeJsons), IronSourceUtils.mergeJsons(jSONObject3, mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), mergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), mergeJsons4));
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(str3);
                            pVar = this.f5018b;
                        } else {
                            str = str2;
                            it = keys;
                            networkSettings = new NetworkSettings(next, optString3, optString4, e12, mergeJsons, mergeJsons2, mergeJsons3, mergeJsons4);
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            pVar = this.f5018b;
                        }
                        pVar.a(networkSettings);
                    }
                } else {
                    str = str2;
                    jSONObject = e10;
                    it = keys;
                }
                e10 = jSONObject;
                str2 = str;
                keys = it;
            }
            this.f5018b.b();
        } catch (Exception e17) {
            e17.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0ebb: MOVE  (r3v13 java.lang.String) = (r24v1 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0653 A[Catch:{ Exception -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x08c1 A[Catch:{ Exception -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x090d A[Catch:{ Exception -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0b0e A[Catch:{ Exception -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0b5e A[Catch:{ Exception -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0cb2 A[Catch:{ Exception -> 0x06e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x03c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0666 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0920 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0b61 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0cc5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x03aa A[Catch:{ Exception -> 0x03be }] */
    public final void j() {
        /*
            r106 = this;
            r1 = r106
            java.lang.String r2 = "events"
            org.json.JSONObject r3 = r1.f5020d     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r4 = "configurations"
            org.json.JSONObject r3 = e(r4, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r4 = "adUnits"
            org.json.JSONObject r4 = e(r4, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r5 = "application"
            org.json.JSONObject r5 = e(r5, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r6 = "rewardedVideo"
            org.json.JSONObject r6 = e(r6, r4)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r7 = "interstitial"
            org.json.JSONObject r7 = e(r7, r4)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "offerwall"
            org.json.JSONObject r8 = e(r8, r4)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r9 = "banner"
            org.json.JSONObject r9 = e(r9, r4)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "nativeAd"
            org.json.JSONObject r4 = e(r10, r4)     // Catch:{ Exception -> 0x06e5 }
            org.json.JSONObject r10 = e(r2, r5)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r11 = "loggers"
            org.json.JSONObject r11 = e(r11, r5)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r12 = "token"
            org.json.JSONObject r12 = e(r12, r5)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r13 = "segment"
            org.json.JSONObject r13 = e(r13, r5)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r14 = "auction"
            org.json.JSONObject r14 = e(r14, r5)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r15 = "crashReporter"
            org.json.JSONObject r15 = e(r15, r5)     // Catch:{ Exception -> 0x06e5 }
            r16 = r3
            java.lang.String r3 = "settings"
            org.json.JSONObject r3 = e(r3, r5)     // Catch:{ Exception -> 0x06e5 }
            r17 = r3
            java.lang.String r3 = "external"
            org.json.JSONObject r3 = e(r3, r5)     // Catch:{ Exception -> 0x06e5 }
            r18 = r3
            java.lang.String r3 = "pixel"
            org.json.JSONObject r3 = e(r3, r10)     // Catch:{ Exception -> 0x06e5 }
            r19 = r13
            r13 = 1
            if (r5 == 0) goto L_0x0087
            r20 = r15
            java.lang.String r15 = "uuidEnabled"
            boolean r15 = r5.optBoolean(r15, r13)     // Catch:{ Exception -> 0x06e5 }
            android.content.Context r13 = r1.f5024h     // Catch:{ Exception -> 0x06e5 }
            r21 = r11
            java.lang.String r11 = "uuidEnabled"
            com.ironsource.mediationsdk.utils.IronSourceUtils.f(r13, r11, r15)     // Catch:{ Exception -> 0x06e5 }
            goto L_0x008b
        L_0x0087:
            r21 = r11
            r20 = r15
        L_0x008b:
            if (r10 == 0) goto L_0x00a5
            java.lang.String r11 = "abt"
            java.lang.String r11 = r10.optString(r11)     // Catch:{ Exception -> 0x06e5 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x06e5 }
            if (r13 != 0) goto L_0x00a5
            com.ironsource.mediationsdk.events.e r13 = com.ironsource.mediationsdk.events.e.d()     // Catch:{ Exception -> 0x06e5 }
            r13.f4521q = r11     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.events.i r13 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ Exception -> 0x06e5 }
            r13.f4521q = r11     // Catch:{ Exception -> 0x06e5 }
        L_0x00a5:
            java.lang.String r11 = "triggerEvents"
            java.lang.String r13 = "maxEventsPerBatch"
            java.lang.String r15 = "maxNumberOfEvents"
            r22 = r3
            java.lang.String r3 = "backupThreshold"
            r23 = r12
            java.lang.String r12 = "serverEventsType"
            r24 = r8
            java.lang.String r8 = "serverEventsURL"
            r25 = r4
            java.lang.String r4 = "sendEventsToggle"
            r26 = r9
            java.lang.String r9 = "placements"
            r27 = r7
            java.lang.String r7 = "optIn"
            java.lang.String r1 = "optOut"
            r28 = r14
            java.lang.String r14 = "eventsCompressionLevel"
            r29 = r11
            java.lang.String r11 = "eventsCompression"
            r30 = r7
            java.lang.String r7 = ""
            r31 = 0
            r32 = r1
            java.lang.String r1 = "auctionTrials"
            r33 = r1
            java.lang.String r1 = "extAuctioneerURL"
            r34 = r1
            java.lang.String r1 = "auctioneerURL"
            r35 = r1
            java.lang.String r1 = "advancedLoading"
            r36 = r13
            java.lang.String r13 = "delayLoadFailure"
            r37 = r15
            java.lang.String r15 = "waitUntilAllProvidersFinishInit"
            r38 = r3
            java.lang.String r3 = "parallelInit"
            r39 = r12
            java.lang.String r12 = "maxNumOfAdaptersToLoadOnStart"
            r41 = r7
            r40 = r8
            java.lang.String r7 = "collectBiddingDataTimeout"
            java.lang.String r8 = "collectBiddingDataAsyncEnabled"
            r44 = r14
            java.lang.String r14 = "isDefault"
            r45 = r14
            java.lang.String r14 = "placementName"
            r46 = r14
            java.lang.String r14 = "placementId"
            r47 = r14
            java.lang.String r14 = "auctionData"
            r48 = r14
            java.lang.String r14 = "nonConnectivityEvents"
            r49 = r14
            if (r6 == 0) goto L_0x03d8
            org.json.JSONArray r14 = r6.optJSONArray(r9)     // Catch:{ Exception -> 0x0682 }
            r51 = r9
            org.json.JSONObject r9 = e(r2, r6)     // Catch:{ Exception -> 0x0682 }
            r52 = r2
            org.json.JSONObject r2 = f(r6)     // Catch:{ Exception -> 0x0682 }
            r53 = r14
            r14 = 0
            boolean r63 = r6.optBoolean(r8, r14)     // Catch:{ Exception -> 0x0682 }
            r68 = r15
            r14 = 3000(0xbb8, double:1.482E-320)
            long r64 = r6.optLong(r7, r14)     // Catch:{ Exception -> 0x0682 }
            r14 = 0
            boolean r66 = r2.optBoolean(r3, r14)     // Catch:{ Exception -> 0x0682 }
            r15 = r68
            boolean r67 = r2.optBoolean(r15, r14)     // Catch:{ Exception -> 0x0682 }
            r2 = 2
            int r54 = a(r6, r5, r12, r2)     // Catch:{ Exception -> 0x0682 }
            int r2 = a(r6, r5, r1, r14)     // Catch:{ Exception -> 0x0682 }
            if (r2 <= 0) goto L_0x014d
            r55 = r2
            r56 = 1
            goto L_0x0151
        L_0x014d:
            r55 = r54
            r56 = 0
        L_0x0151:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r14 = 60
            int r57 = a(r6, r5, r2, r14)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r2 = "loadRVInterval"
            r14 = 300(0x12c, float:4.2E-43)
            int r58 = a(r6, r5, r2, r14)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r2 = "expiredDurationInMinutes"
            r14 = -1
            int r59 = a(r6, r5, r2, r14)     // Catch:{ Exception -> 0x0682 }
            r2 = 3
            int r62 = a(r6, r5, r13, r2)     // Catch:{ Exception -> 0x0682 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r9, r10)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "sendUltraEvents"
            r9 = 0
            boolean r69 = r2.optBoolean(r6, r9)     // Catch:{ Exception -> 0x0682 }
            boolean r70 = r2.optBoolean(r4, r9)     // Catch:{ Exception -> 0x0682 }
            boolean r71 = r2.optBoolean(r11, r9)     // Catch:{ Exception -> 0x0682 }
            r6 = r44
            r9 = -1
            int r72 = r2.optInt(r6, r9)     // Catch:{ Exception -> 0x0682 }
            r14 = r40
            r9 = r41
            java.lang.String r73 = r2.optString(r14, r9)     // Catch:{ Exception -> 0x0682 }
            r40 = r14
            r14 = r39
            java.lang.String r74 = r2.optString(r14, r9)     // Catch:{ Exception -> 0x0682 }
            r44 = r6
            r39 = r14
            r14 = r38
            r6 = -1
            int r75 = r2.optInt(r14, r6)     // Catch:{ Exception -> 0x0682 }
            r38 = r14
            r14 = r37
            int r76 = r2.optInt(r14, r6)     // Catch:{ Exception -> 0x0682 }
            r37 = r14
            r6 = r36
            r14 = 5000(0x1388, float:7.006E-42)
            int r77 = r2.optInt(r6, r14)     // Catch:{ Exception -> 0x0682 }
            r36 = r6
            r14 = r32
            org.json.JSONArray r6 = r2.optJSONArray(r14)     // Catch:{ Exception -> 0x0682 }
            if (r6 == 0) goto L_0x01df
            r32 = r14
            int r14 = r6.length()     // Catch:{ Exception -> 0x0682 }
            int[] r14 = new int[r14]     // Catch:{ Exception -> 0x0682 }
            r82 = r4
            r41 = r11
            r11 = 0
        L_0x01cb:
            int r4 = r6.length()     // Catch:{ Exception -> 0x0682 }
            if (r11 >= r4) goto L_0x01da
            int r4 = r6.optInt(r11)     // Catch:{ Exception -> 0x0682 }
            r14[r11] = r4     // Catch:{ Exception -> 0x0682 }
            int r11 = r11 + 1
            goto L_0x01cb
        L_0x01da:
            r78 = r14
            r4 = r30
            goto L_0x01e9
        L_0x01df:
            r82 = r4
            r41 = r11
            r32 = r14
            r4 = r30
            r78 = r31
        L_0x01e9:
            org.json.JSONArray r6 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x0682 }
            if (r6 == 0) goto L_0x020c
            int r11 = r6.length()     // Catch:{ Exception -> 0x0682 }
            int[] r11 = new int[r11]     // Catch:{ Exception -> 0x0682 }
            r30 = r4
            r14 = 0
        L_0x01f8:
            int r4 = r6.length()     // Catch:{ Exception -> 0x0682 }
            if (r14 >= r4) goto L_0x0207
            int r4 = r6.optInt(r14)     // Catch:{ Exception -> 0x0682 }
            r11[r14] = r4     // Catch:{ Exception -> 0x0682 }
            int r14 = r14 + 1
            goto L_0x01f8
        L_0x0207:
            r79 = r11
            r4 = r29
            goto L_0x0212
        L_0x020c:
            r30 = r4
            r4 = r29
            r79 = r31
        L_0x0212:
            org.json.JSONArray r6 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x0682 }
            if (r6 == 0) goto L_0x0233
            int r11 = r6.length()     // Catch:{ Exception -> 0x0682 }
            int[] r11 = new int[r11]     // Catch:{ Exception -> 0x0682 }
            r29 = r4
            r14 = 0
        L_0x0221:
            int r4 = r6.length()     // Catch:{ Exception -> 0x0682 }
            if (r14 >= r4) goto L_0x0230
            int r4 = r6.optInt(r14)     // Catch:{ Exception -> 0x0682 }
            r11[r14] = r4     // Catch:{ Exception -> 0x0682 }
            int r14 = r14 + 1
            goto L_0x0221
        L_0x0230:
            r80 = r11
            goto L_0x0237
        L_0x0233:
            r29 = r4
            r80 = r31
        L_0x0237:
            r4 = r49
            org.json.JSONArray r2 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x0682 }
            if (r2 == 0) goto L_0x0258
            int r6 = r2.length()     // Catch:{ Exception -> 0x0682 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x0682 }
            r11 = 0
        L_0x0246:
            int r14 = r2.length()     // Catch:{ Exception -> 0x0682 }
            if (r11 >= r14) goto L_0x0255
            int r14 = r2.optInt(r11)     // Catch:{ Exception -> 0x0682 }
            r6[r11] = r14     // Catch:{ Exception -> 0x0682 }
            int r11 = r11 + 1
            goto L_0x0246
        L_0x0255:
            r81 = r6
            goto L_0x025a
        L_0x0258:
            r81 = r31
        L_0x025a:
            com.ironsource.sdk.controller.x r60 = new com.ironsource.sdk.controller.x     // Catch:{ Exception -> 0x0682 }
            r68 = r60
            r68.<init>(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x0682 }
            if (r28 == 0) goto L_0x0327
            java.lang.String r2 = "rewardedVideo"
            r6 = r28
            org.json.JSONObject r2 = e(r2, r6)     // Catch:{ Exception -> 0x0682 }
            r11 = r48
            java.lang.String r84 = r6.optString(r11, r9)     // Catch:{ Exception -> 0x0682 }
            r14 = r35
            java.lang.String r85 = r6.optString(r14, r9)     // Catch:{ Exception -> 0x0682 }
            r35 = r14
            r14 = r34
            java.lang.String r86 = r6.optString(r14, r9)     // Catch:{ Exception -> 0x0682 }
            r48 = r11
            r34 = r14
            r14 = r33
            r11 = 2
            int r87 = r6.optInt(r14, r11)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r11 = "auctionTimeout"
            r28 = r13
            r33 = r14
            r13 = 10000(0x2710, double:4.9407E-320)
            long r89 = r6.optLong(r11, r13)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r11 = "auctionSavedHistory"
            r13 = 15
            int r88 = r6.optInt(r11, r13)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r11 = "compressAuctionRequest"
            r13 = 0
            boolean r99 = r6.optBoolean(r11, r13)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r11 = "compressAuctionResponse"
            boolean r100 = r6.optBoolean(r11, r13)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r11 = "encryptionVersion"
            r14 = 1
            int r102 = r6.optInt(r11, r14)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r11 = "programmatic"
            r2.optBoolean(r11, r13)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r11 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r11 = r2.optInt(r11, r13)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r13 = "auctionRetryInterval"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r13 = r2.optInt(r13, r14)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r14 = "timeToWaitBeforeAuction"
            r49 = r6
            r6 = 5000(0x1388, float:7.006E-42)
            int r14 = r2.optInt(r14, r6)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "timeToWaitBeforeLoad"
            r68 = r4
            r4 = 50
            r2.optInt(r6, r4)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r4 = "objectPerWaterfall"
            r6 = 0
            boolean r101 = r2.optBoolean(r4, r6)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r4 = "isLoadWhileShow"
            r6 = 1
            boolean r97 = r2.optBoolean(r4, r6)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r4 = "timeToDeleteOldWaterfallAfterAuction"
            r6 = 30000(0x7530, float:4.2039E-41)
            int r98 = r2.optInt(r4, r6)     // Catch:{ Exception -> 0x0682 }
            com.ironsource.mediationsdk.utils.c r4 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0682 }
            r6 = r10
            long r10 = (long) r11     // Catch:{ Exception -> 0x0682 }
            r91 = r10
            long r10 = (long) r13     // Catch:{ Exception -> 0x0682 }
            r93 = r10
            long r10 = (long) r14     // Catch:{ Exception -> 0x0682 }
            r95 = r10
            r103 = 0
            r83 = r4
            r83.<init>(r84, r85, r86, r87, r88, r89, r91, r93, r95, r97, r98, r99, r100, r101, r102, r103)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r10 = "disableLoadWhileShowSupportFor"
            org.json.JSONArray r2 = r2.optJSONArray(r10)     // Catch:{ Exception -> 0x0682 }
            if (r2 == 0) goto L_0x0324
            r10 = 0
        L_0x030c:
            int r11 = r2.length()     // Catch:{ Exception -> 0x0682 }
            if (r10 >= r11) goto L_0x0324
            java.lang.String r11 = r2.optString(r10)     // Catch:{ Exception -> 0x0682 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0682 }
            if (r13 != 0) goto L_0x0321
            java.util.ArrayList<java.lang.String> r13 = r4.k     // Catch:{ Exception -> 0x0682 }
            r13.add(r11)     // Catch:{ Exception -> 0x0682 }
        L_0x0321:
            int r10 = r10 + 1
            goto L_0x030c
        L_0x0324:
            r61 = r4
            goto L_0x0335
        L_0x0327:
            r68 = r4
            r6 = r10
            r49 = r28
            r28 = r13
            com.ironsource.mediationsdk.utils.c r2 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0682 }
            r2.<init>()     // Catch:{ Exception -> 0x0682 }
            r61 = r2
        L_0x0335:
            com.ironsource.mediationsdk.model.q r2 = new com.ironsource.mediationsdk.model.q     // Catch:{ Exception -> 0x0682 }
            r54 = r2
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r66, r67)     // Catch:{ Exception -> 0x0682 }
            if (r53 == 0) goto L_0x03cf
            r4 = 0
        L_0x033f:
            int r10 = r53.length()     // Catch:{ Exception -> 0x0682 }
            if (r4 >= r10) goto L_0x03cf
            r10 = r53
            org.json.JSONObject r11 = r10.optJSONObject(r4)     // Catch:{ Exception -> 0x0682 }
            r13 = r47
            if (r11 == 0) goto L_0x039e
            r14 = -1
            int r54 = r11.optInt(r13, r14)     // Catch:{ Exception -> 0x0682 }
            r14 = r46
            java.lang.String r55 = r11.optString(r14, r9)     // Catch:{ Exception -> 0x0682 }
            r46 = r10
            r10 = r45
            r45 = r14
            r14 = 0
            boolean r56 = r11.optBoolean(r10, r14)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r14 = "virtualItemName"
            java.lang.String r57 = r11.optString(r14, r9)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r14 = "virtualItemCount"
            r47 = r10
            r10 = -1
            int r58 = r11.optInt(r14, r10)     // Catch:{ Exception -> 0x0682 }
            com.ironsource.mediationsdk.model.m r10 = c(r11)     // Catch:{ Exception -> 0x0682 }
            if (r54 < 0) goto L_0x03a4
            boolean r11 = android.text.TextUtils.isEmpty(r55)     // Catch:{ Exception -> 0x0682 }
            if (r11 != 0) goto L_0x03a4
            boolean r11 = android.text.TextUtils.isEmpty(r57)     // Catch:{ Exception -> 0x0682 }
            if (r11 != 0) goto L_0x03a4
            if (r58 <= 0) goto L_0x03a4
            com.ironsource.mediationsdk.model.Placement r11 = new com.ironsource.mediationsdk.model.Placement     // Catch:{ Exception -> 0x0682 }
            r53 = r11
            r59 = r10
            r53.<init>(r54, r55, r56, r57, r58, r59)     // Catch:{ Exception -> 0x0682 }
            if (r10 == 0) goto L_0x039b
            r10 = r106
            android.content.Context r14 = r10.f5024h     // Catch:{ Exception -> 0x03be }
            com.ironsource.mediationsdk.utils.j.a((android.content.Context) r14, (com.ironsource.mediationsdk.model.Placement) r11)     // Catch:{ Exception -> 0x03be }
            goto L_0x03a8
        L_0x039b:
            r10 = r106
            goto L_0x03a8
        L_0x039e:
            r47 = r45
            r45 = r46
            r46 = r10
        L_0x03a4:
            r10 = r106
            r11 = r31
        L_0x03a8:
            if (r11 == 0) goto L_0x03c3
            java.util.ArrayList<com.ironsource.mediationsdk.model.Placement> r14 = r2.f4790a     // Catch:{ Exception -> 0x03be }
            r14.add(r11)     // Catch:{ Exception -> 0x03be }
            com.ironsource.mediationsdk.model.Placement r14 = r2.f4800l     // Catch:{ Exception -> 0x03be }
            if (r14 != 0) goto L_0x03b4
            goto L_0x03bb
        L_0x03b4:
            r14 = 0
            boolean r53 = r11.isPlacementId(r14)     // Catch:{ Exception -> 0x03be }
            if (r53 == 0) goto L_0x03c3
        L_0x03bb:
            r2.f4800l = r11     // Catch:{ Exception -> 0x03be }
            goto L_0x03c3
        L_0x03be:
            r0 = move-exception
            r2 = r0
            r1 = r10
            goto L_0x0eed
        L_0x03c3:
            int r4 = r4 + 1
            r53 = r46
            r46 = r45
            r45 = r47
            r47 = r13
            goto L_0x033f
        L_0x03cf:
            r10 = r106
            r13 = r47
            r47 = r45
            r45 = r46
            goto L_0x03f3
        L_0x03d8:
            r52 = r2
            r82 = r4
            r51 = r9
            r6 = r10
            r9 = r41
            r68 = r49
            r10 = r106
            r41 = r11
            r49 = r28
            r28 = r13
            r13 = r47
            r47 = r45
            r45 = r46
            r2 = r31
        L_0x03f3:
            if (r27 == 0) goto L_0x068b
            r4 = r27
            r11 = r51
            org.json.JSONArray r14 = r4.optJSONArray(r11)     // Catch:{ Exception -> 0x0688 }
            r27 = r2
            r51 = r11
            r2 = r52
            org.json.JSONObject r11 = e(r2, r4)     // Catch:{ Exception -> 0x0688 }
            r52 = r2
            org.json.JSONObject r2 = f(r4)     // Catch:{ Exception -> 0x0688 }
            r10 = 0
            boolean r61 = r4.optBoolean(r8, r10)     // Catch:{ Exception -> 0x0682 }
            r46 = r11
            r10 = 3000(0xbb8, double:1.482E-320)
            long r62 = r4.optLong(r7, r10)     // Catch:{ Exception -> 0x0682 }
            r10 = 0
            boolean r64 = r2.optBoolean(r3, r10)     // Catch:{ Exception -> 0x0682 }
            boolean r65 = r2.optBoolean(r15, r10)     // Catch:{ Exception -> 0x0682 }
            r2 = 2
            int r11 = a(r4, r5, r12, r2)     // Catch:{ Exception -> 0x0682 }
            int r2 = a(r4, r5, r1, r10)     // Catch:{ Exception -> 0x0682 }
            if (r2 <= 0) goto L_0x0433
            r54 = r2
            r55 = 1
            goto L_0x0437
        L_0x0433:
            r54 = r11
            r55 = 0
        L_0x0437:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r10 = 60
            int r56 = a(r4, r5, r2, r10)     // Catch:{ Exception -> 0x0682 }
            r10 = r28
            r2 = 3
            int r59 = a(r4, r5, r10, r2)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r2 = "isOneFlow"
            boolean r11 = r4.has(r2)     // Catch:{ Exception -> 0x0682 }
            if (r11 == 0) goto L_0x0458
            r11 = 0
            boolean r50 = r4.optBoolean(r2, r11)     // Catch:{ Exception -> 0x0456 }
            r60 = r50
            goto L_0x046e
        L_0x0456:
            r0 = move-exception
            goto L_0x0466
        L_0x0458:
            r11 = 0
            boolean r4 = r5.has(r2)     // Catch:{ Exception -> 0x0682 }
            if (r4 == 0) goto L_0x046c
            boolean r2 = r5.optBoolean(r2, r11)     // Catch:{ Exception -> 0x0456 }
            r60 = r2
            goto L_0x046e
        L_0x0466:
            r1 = r0
            r2 = r1
            r1 = r106
            goto L_0x0eed
        L_0x046c:
            r60 = 0
        L_0x046e:
            r2 = r46
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r2, r6)     // Catch:{ Exception -> 0x0682 }
            r4 = r82
            r11 = 0
            boolean r71 = r2.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0682 }
            r28 = r4
            r4 = r41
            boolean r72 = r2.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0682 }
            r41 = r4
            r11 = r44
            r4 = -1
            int r73 = r2.optInt(r11, r4)     // Catch:{ Exception -> 0x0682 }
            r4 = r40
            java.lang.String r74 = r2.optString(r4, r9)     // Catch:{ Exception -> 0x0682 }
            r40 = r4
            r4 = r39
            java.lang.String r75 = r2.optString(r4, r9)     // Catch:{ Exception -> 0x0682 }
            r39 = r4
            r44 = r11
            r4 = r38
            r11 = -1
            int r76 = r2.optInt(r4, r11)     // Catch:{ Exception -> 0x0682 }
            r38 = r4
            r4 = r37
            int r77 = r2.optInt(r4, r11)     // Catch:{ Exception -> 0x0682 }
            r37 = r4
            r11 = r36
            r4 = 5000(0x1388, float:7.006E-42)
            int r78 = r2.optInt(r11, r4)     // Catch:{ Exception -> 0x0682 }
            r36 = r11
            r4 = r32
            org.json.JSONArray r11 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x0682 }
            if (r11 == 0) goto L_0x04e2
            r32 = r4
            int r4 = r11.length()     // Catch:{ Exception -> 0x0682 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0682 }
            r66 = r1
            r46 = r6
            r6 = 0
        L_0x04ce:
            int r1 = r11.length()     // Catch:{ Exception -> 0x0682 }
            if (r6 >= r1) goto L_0x04dd
            int r1 = r11.optInt(r6)     // Catch:{ Exception -> 0x0682 }
            r4[r6] = r1     // Catch:{ Exception -> 0x0682 }
            int r6 = r6 + 1
            goto L_0x04ce
        L_0x04dd:
            r79 = r4
            r1 = r30
            goto L_0x04ec
        L_0x04e2:
            r66 = r1
            r32 = r4
            r46 = r6
            r1 = r30
            r79 = r31
        L_0x04ec:
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0682 }
            if (r4 == 0) goto L_0x050f
            int r6 = r4.length()     // Catch:{ Exception -> 0x0682 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x0682 }
            r30 = r1
            r11 = 0
        L_0x04fb:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0682 }
            if (r11 >= r1) goto L_0x050a
            int r1 = r4.optInt(r11)     // Catch:{ Exception -> 0x0682 }
            r6[r11] = r1     // Catch:{ Exception -> 0x0682 }
            int r11 = r11 + 1
            goto L_0x04fb
        L_0x050a:
            r80 = r6
            r1 = r29
            goto L_0x0515
        L_0x050f:
            r30 = r1
            r1 = r29
            r80 = r31
        L_0x0515:
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0682 }
            if (r4 == 0) goto L_0x0536
            int r6 = r4.length()     // Catch:{ Exception -> 0x0682 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x0682 }
            r29 = r1
            r11 = 0
        L_0x0524:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0682 }
            if (r11 >= r1) goto L_0x0533
            int r1 = r4.optInt(r11)     // Catch:{ Exception -> 0x0682 }
            r6[r11] = r1     // Catch:{ Exception -> 0x0682 }
            int r11 = r11 + 1
            goto L_0x0524
        L_0x0533:
            r81 = r6
            goto L_0x053a
        L_0x0536:
            r29 = r1
            r81 = r31
        L_0x053a:
            r1 = r68
            org.json.JSONArray r2 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0682 }
            if (r2 == 0) goto L_0x055b
            int r4 = r2.length()     // Catch:{ Exception -> 0x0682 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0682 }
            r6 = 0
        L_0x0549:
            int r11 = r2.length()     // Catch:{ Exception -> 0x0682 }
            if (r6 >= r11) goto L_0x0558
            int r11 = r2.optInt(r6)     // Catch:{ Exception -> 0x0682 }
            r4[r6] = r11     // Catch:{ Exception -> 0x0682 }
            int r6 = r6 + 1
            goto L_0x0549
        L_0x0558:
            r82 = r4
            goto L_0x055d
        L_0x055b:
            r82 = r31
        L_0x055d:
            com.ironsource.sdk.controller.x r57 = new com.ironsource.sdk.controller.x     // Catch:{ Exception -> 0x0682 }
            r70 = 0
            r69 = r57
            r69.<init>(r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82)     // Catch:{ Exception -> 0x0682 }
            if (r49 == 0) goto L_0x05e2
            java.lang.String r2 = "interstitial"
            r4 = r49
            org.json.JSONObject r2 = e(r2, r4)     // Catch:{ Exception -> 0x0682 }
            r6 = r48
            java.lang.String r68 = r4.optString(r6, r9)     // Catch:{ Exception -> 0x0682 }
            r11 = r35
            java.lang.String r69 = r4.optString(r11, r9)     // Catch:{ Exception -> 0x0682 }
            r35 = r11
            r11 = r34
            java.lang.String r70 = r4.optString(r11, r9)     // Catch:{ Exception -> 0x0682 }
            r48 = r6
            r34 = r11
            r11 = r33
            r6 = 2
            int r71 = r4.optInt(r11, r6)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "auctionSavedHistory"
            r33 = r11
            r11 = 15
            int r72 = r4.optInt(r6, r11)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "auctionTimeout"
            r11 = r7
            r49 = r8
            r7 = 10000(0x2710, double:4.9407E-320)
            long r73 = r4.optLong(r6, r7)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "compressAuctionRequest"
            r7 = 0
            boolean r83 = r4.optBoolean(r6, r7)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "compressAuctionResponse"
            boolean r84 = r4.optBoolean(r6, r7)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "encryptionVersion"
            r8 = 1
            int r86 = r4.optInt(r6, r8)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "programmatic"
            r2.optBoolean(r6, r7)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "objectPerWaterfall"
            boolean r85 = r2.optBoolean(r6, r7)     // Catch:{ Exception -> 0x0682 }
            java.lang.String r6 = "minTimeBeforeFirstAuction"
            r7 = 2000(0x7d0, float:2.803E-42)
            int r2 = r2.optInt(r6, r7)     // Catch:{ Exception -> 0x0682 }
            com.ironsource.mediationsdk.utils.c r6 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0682 }
            long r7 = (long) r2     // Catch:{ Exception -> 0x0682 }
            r75 = r7
            r77 = 0
            r79 = 0
            r81 = 1
            r82 = 0
            r87 = 0
            r67 = r6
            r67.<init>(r68, r69, r70, r71, r72, r73, r75, r77, r79, r81, r82, r83, r84, r85, r86, r87)     // Catch:{ Exception -> 0x0682 }
            r58 = r6
            goto L_0x05ee
        L_0x05e2:
            r11 = r7
            r4 = r49
            r49 = r8
            com.ironsource.mediationsdk.utils.c r2 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0682 }
            r2.<init>()     // Catch:{ Exception -> 0x0682 }
            r58 = r2
        L_0x05ee:
            com.ironsource.mediationsdk.model.h r2 = new com.ironsource.mediationsdk.model.h     // Catch:{ Exception -> 0x0682 }
            r53 = r2
            r53.<init>(r54, r55, r56, r57, r58, r59, r60, r61, r62, r64, r65)     // Catch:{ Exception -> 0x0682 }
            if (r14 == 0) goto L_0x0675
            r6 = 0
        L_0x05f8:
            int r7 = r14.length()     // Catch:{ Exception -> 0x0682 }
            if (r6 >= r7) goto L_0x0675
            org.json.JSONObject r7 = r14.optJSONObject(r6)     // Catch:{ Exception -> 0x0682 }
            if (r7 == 0) goto L_0x0641
            r53 = r14
            r8 = -1
            int r14 = r7.optInt(r13, r8)     // Catch:{ Exception -> 0x0682 }
            r8 = r45
            r45 = r13
            java.lang.String r13 = r7.optString(r8, r9)     // Catch:{ Exception -> 0x0682 }
            r68 = r1
            r54 = r8
            r8 = r47
            r47 = r4
            r4 = 0
            boolean r1 = r7.optBoolean(r8, r4)     // Catch:{ Exception -> 0x0682 }
            com.ironsource.mediationsdk.model.m r4 = c(r7)     // Catch:{ Exception -> 0x0682 }
            if (r14 < 0) goto L_0x063e
            boolean r7 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0682 }
            if (r7 != 0) goto L_0x063e
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = new com.ironsource.mediationsdk.model.InterstitialPlacement     // Catch:{ Exception -> 0x0682 }
            r7.<init>(r14, r13, r1, r4)     // Catch:{ Exception -> 0x0682 }
            if (r4 == 0) goto L_0x063b
            r1 = r106
            android.content.Context r4 = r1.f5024h     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.utils.j.a((android.content.Context) r4, (com.ironsource.mediationsdk.model.InterstitialPlacement) r7)     // Catch:{ Exception -> 0x06e5 }
            goto L_0x0651
        L_0x063b:
            r1 = r106
            goto L_0x0651
        L_0x063e:
            r1 = r106
            goto L_0x064f
        L_0x0641:
            r68 = r1
            r53 = r14
            r54 = r45
            r8 = r47
            r1 = r106
            r47 = r4
            r45 = r13
        L_0x064f:
            r7 = r31
        L_0x0651:
            if (r7 == 0) goto L_0x0666
            java.util.ArrayList<com.ironsource.mediationsdk.model.InterstitialPlacement> r4 = r2.f4741a     // Catch:{ Exception -> 0x06e5 }
            r4.add(r7)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.InterstitialPlacement r4 = r2.f4752m     // Catch:{ Exception -> 0x06e5 }
            if (r4 != 0) goto L_0x065d
            goto L_0x0664
        L_0x065d:
            r4 = 0
            boolean r13 = r7.isPlacementId(r4)     // Catch:{ Exception -> 0x06e5 }
            if (r13 == 0) goto L_0x0666
        L_0x0664:
            r2.f4752m = r7     // Catch:{ Exception -> 0x06e5 }
        L_0x0666:
            int r6 = r6 + 1
            r13 = r45
            r4 = r47
            r14 = r53
            r45 = r54
            r1 = r68
            r47 = r8
            goto L_0x05f8
        L_0x0675:
            r68 = r1
            r54 = r45
            r8 = r47
            r1 = r106
            r47 = r4
            r45 = r13
            goto L_0x06a5
        L_0x0682:
            r0 = move-exception
            r1 = r106
        L_0x0685:
            r2 = r0
            goto L_0x0eed
        L_0x0688:
            r0 = move-exception
            r1 = r10
            goto L_0x0685
        L_0x068b:
            r66 = r1
            r27 = r2
            r46 = r6
            r11 = r7
            r1 = r10
            r10 = r28
            r54 = r45
            r28 = r82
            r45 = r13
            r105 = r49
            r49 = r8
            r8 = r47
            r47 = r105
            r2 = r31
        L_0x06a5:
            if (r26 == 0) goto L_0x0932
            r4 = r26
            r6 = r51
            org.json.JSONArray r7 = r4.optJSONArray(r6)     // Catch:{ Exception -> 0x06e5 }
            r13 = r52
            org.json.JSONObject r14 = e(r13, r4)     // Catch:{ Exception -> 0x06e5 }
            r26 = r2
            org.json.JSONObject r2 = f(r4)     // Catch:{ Exception -> 0x06e5 }
            r52 = r13
            r13 = 1
            int r51 = a(r4, r5, r12, r13)     // Catch:{ Exception -> 0x06e5 }
            long r71 = b(r4, r5)     // Catch:{ Exception -> 0x06e5 }
            r13 = 3
            int r77 = a(r4, r5, r10, r13)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r13 = "bannerInterval"
            r53 = r10
            r10 = 60
            int r75 = a(r4, r5, r13, r10)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "isOneFlow"
            boolean r13 = r4.has(r10)     // Catch:{ Exception -> 0x06e5 }
            if (r13 == 0) goto L_0x06e7
            r13 = 0
            boolean r50 = r4.optBoolean(r10, r13)     // Catch:{ Exception -> 0x06e5 }
            r78 = r50
            goto L_0x06f7
        L_0x06e5:
            r0 = move-exception
            goto L_0x0685
        L_0x06e7:
            r13 = 0
            boolean r50 = r5.has(r10)     // Catch:{ Exception -> 0x06e5 }
            if (r50 == 0) goto L_0x06f5
            boolean r10 = r5.optBoolean(r10, r13)     // Catch:{ Exception -> 0x06e5 }
            r78 = r10
            goto L_0x06f7
        L_0x06f5:
            r78 = 0
        L_0x06f7:
            r10 = r49
            r13 = 0
            boolean r79 = r4.optBoolean(r10, r13)     // Catch:{ Exception -> 0x06e5 }
            r49 = r14
            r13 = 3000(0xbb8, double:1.482E-320)
            long r80 = r4.optLong(r11, r13)     // Catch:{ Exception -> 0x06e5 }
            r13 = 0
            boolean r82 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x06e5 }
            boolean r83 = r2.optBoolean(r15, r13)     // Catch:{ Exception -> 0x06e5 }
            r2 = r66
            int r4 = a(r4, r5, r2, r13)     // Catch:{ Exception -> 0x06e5 }
            if (r4 <= 0) goto L_0x0720
            r70 = r4
            r4 = r46
            r14 = r49
            r73 = 1
            goto L_0x0728
        L_0x0720:
            r73 = r13
            r4 = r46
            r14 = r49
            r70 = r51
        L_0x0728:
            org.json.JSONObject r14 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r14, r4)     // Catch:{ Exception -> 0x06e5 }
            r46 = r4
            r4 = r28
            boolean r86 = r14.optBoolean(r4, r13)     // Catch:{ Exception -> 0x06e5 }
            r28 = r4
            r4 = r41
            boolean r87 = r14.optBoolean(r4, r13)     // Catch:{ Exception -> 0x06e5 }
            r41 = r4
            r13 = r44
            r4 = -1
            int r88 = r14.optInt(r13, r4)     // Catch:{ Exception -> 0x06e5 }
            r4 = r40
            java.lang.String r89 = r14.optString(r4, r9)     // Catch:{ Exception -> 0x06e5 }
            r40 = r4
            r4 = r39
            java.lang.String r90 = r14.optString(r4, r9)     // Catch:{ Exception -> 0x06e5 }
            r39 = r4
            r44 = r13
            r4 = r38
            r13 = -1
            int r91 = r14.optInt(r4, r13)     // Catch:{ Exception -> 0x06e5 }
            r38 = r4
            r4 = r37
            int r92 = r14.optInt(r4, r13)     // Catch:{ Exception -> 0x06e5 }
            r37 = r4
            r13 = r36
            r4 = 5000(0x1388, float:7.006E-42)
            int r93 = r14.optInt(r13, r4)     // Catch:{ Exception -> 0x06e5 }
            r36 = r13
            r4 = r32
            org.json.JSONArray r13 = r14.optJSONArray(r4)     // Catch:{ Exception -> 0x06e5 }
            if (r13 == 0) goto L_0x079b
            r32 = r4
            int r4 = r13.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x06e5 }
            r66 = r2
            r49 = r15
            r2 = 0
        L_0x0787:
            int r15 = r13.length()     // Catch:{ Exception -> 0x06e5 }
            if (r2 >= r15) goto L_0x0796
            int r15 = r13.optInt(r2)     // Catch:{ Exception -> 0x06e5 }
            r4[r2] = r15     // Catch:{ Exception -> 0x06e5 }
            int r2 = r2 + 1
            goto L_0x0787
        L_0x0796:
            r94 = r4
            r2 = r30
            goto L_0x07a5
        L_0x079b:
            r66 = r2
            r32 = r4
            r49 = r15
            r2 = r30
            r94 = r31
        L_0x07a5:
            org.json.JSONArray r4 = r14.optJSONArray(r2)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x07c8
            int r13 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x06e5 }
            r30 = r2
            r15 = 0
        L_0x07b4:
            int r2 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            if (r15 >= r2) goto L_0x07c3
            int r2 = r4.optInt(r15)     // Catch:{ Exception -> 0x06e5 }
            r13[r15] = r2     // Catch:{ Exception -> 0x06e5 }
            int r15 = r15 + 1
            goto L_0x07b4
        L_0x07c3:
            r95 = r13
            r2 = r29
            goto L_0x07ce
        L_0x07c8:
            r30 = r2
            r2 = r29
            r95 = r31
        L_0x07ce:
            org.json.JSONArray r4 = r14.optJSONArray(r2)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x07ef
            int r13 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x06e5 }
            r29 = r2
            r15 = 0
        L_0x07dd:
            int r2 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            if (r15 >= r2) goto L_0x07ec
            int r2 = r4.optInt(r15)     // Catch:{ Exception -> 0x06e5 }
            r13[r15] = r2     // Catch:{ Exception -> 0x06e5 }
            int r15 = r15 + 1
            goto L_0x07dd
        L_0x07ec:
            r96 = r13
            goto L_0x07f3
        L_0x07ef:
            r29 = r2
            r96 = r31
        L_0x07f3:
            r2 = r68
            org.json.JSONArray r4 = r14.optJSONArray(r2)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0814
            int r13 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x06e5 }
            r14 = 0
        L_0x0802:
            int r15 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            if (r14 >= r15) goto L_0x0811
            int r15 = r4.optInt(r14)     // Catch:{ Exception -> 0x06e5 }
            r13[r14] = r15     // Catch:{ Exception -> 0x06e5 }
            int r14 = r14 + 1
            goto L_0x0802
        L_0x0811:
            r97 = r13
            goto L_0x0816
        L_0x0814:
            r97 = r31
        L_0x0816:
            com.ironsource.sdk.controller.x r74 = new com.ironsource.sdk.controller.x     // Catch:{ Exception -> 0x06e5 }
            r85 = 0
            r84 = r74
            r84.<init>(r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97)     // Catch:{ Exception -> 0x06e5 }
            if (r47 == 0) goto L_0x08ac
            java.lang.String r4 = "banner"
            r13 = r47
            org.json.JSONObject r4 = e(r4, r13)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x08a3
            r14 = r48
            java.lang.String r85 = r13.optString(r14, r9)     // Catch:{ Exception -> 0x06e5 }
            r15 = r35
            java.lang.String r86 = r13.optString(r15, r9)     // Catch:{ Exception -> 0x06e5 }
            r35 = r15
            r15 = r34
            java.lang.String r87 = r13.optString(r15, r9)     // Catch:{ Exception -> 0x06e5 }
            r48 = r14
            r34 = r15
            r15 = r33
            r14 = 2
            int r88 = r13.optInt(r15, r14)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r14 = "auctionSavedHistory"
            r33 = r15
            r15 = 15
            int r89 = r13.optInt(r14, r15)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r14 = "auctionTimeout"
            r68 = r2
            r15 = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            long r90 = r13.optLong(r14, r2)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r2 = "compressAuctionRequest"
            r3 = 0
            boolean r100 = r13.optBoolean(r2, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r2 = "compressAuctionResponse"
            boolean r101 = r13.optBoolean(r2, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r2 = "encryptionVersion"
            r14 = 1
            int r103 = r13.optInt(r2, r14)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r2 = "programmatic"
            r4.optBoolean(r2, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r2 = "objectPerWaterfall"
            boolean r102 = r4.optBoolean(r2, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r2 = "minTimeBeforeFirstAuction"
            r3 = 2000(0x7d0, float:2.803E-42)
            int r2 = r4.optInt(r2, r3)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r3 = "shouldSendBannerBURLFromImpression"
            r14 = 1
            boolean r104 = r4.optBoolean(r3, r14)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.utils.c r3 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x06e5 }
            r4 = r15
            long r14 = (long) r2     // Catch:{ Exception -> 0x06e5 }
            r92 = r14
            r94 = 0
            r96 = 0
            r98 = 1
            r99 = 0
            r84 = r3
            r84.<init>(r85, r86, r87, r88, r89, r90, r92, r94, r96, r98, r99, r100, r101, r102, r103, r104)     // Catch:{ Exception -> 0x06e5 }
            r76 = r3
            goto L_0x08b8
        L_0x08a3:
            r68 = r2
            r4 = r3
            com.ironsource.mediationsdk.utils.c r2 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x06e5 }
            r2.<init>()     // Catch:{ Exception -> 0x06e5 }
            goto L_0x08b6
        L_0x08ac:
            r68 = r2
            r4 = r3
            r13 = r47
            com.ironsource.mediationsdk.utils.c r2 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x06e5 }
            r2.<init>()     // Catch:{ Exception -> 0x06e5 }
        L_0x08b6:
            r76 = r2
        L_0x08b8:
            com.ironsource.mediationsdk.model.d r2 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x06e5 }
            r69 = r2
            r69.<init>(r70, r71, r73, r74, r75, r76, r77, r78, r79, r80, r82, r83)     // Catch:{ Exception -> 0x06e5 }
            if (r7 == 0) goto L_0x092b
            r3 = 0
        L_0x08c2:
            int r14 = r7.length()     // Catch:{ Exception -> 0x06e5 }
            if (r3 >= r14) goto L_0x092b
            org.json.JSONObject r14 = r7.optJSONObject(r3)     // Catch:{ Exception -> 0x06e5 }
            r47 = r7
            if (r14 == 0) goto L_0x0903
            r15 = r45
            r45 = r4
            r4 = -1
            int r7 = r14.optInt(r15, r4)     // Catch:{ Exception -> 0x06e5 }
            r51 = r15
            r4 = r54
            java.lang.String r15 = r14.optString(r4, r9)     // Catch:{ Exception -> 0x06e5 }
            r54 = r4
            r55 = r13
            r4 = 0
            boolean r13 = r14.optBoolean(r8, r4)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.m r4 = c(r14)     // Catch:{ Exception -> 0x06e5 }
            if (r7 < 0) goto L_0x0909
            boolean r14 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x06e5 }
            if (r14 != 0) goto L_0x0909
            com.ironsource.mediationsdk.model.e r14 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x06e5 }
            r14.<init>(r7, r15, r13, r4)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x090b
            android.content.Context r4 = r1.f5024h     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.utils.j.a((android.content.Context) r4, (com.ironsource.mediationsdk.model.e) r14)     // Catch:{ Exception -> 0x06e5 }
            goto L_0x090b
        L_0x0903:
            r55 = r13
            r51 = r45
            r45 = r4
        L_0x0909:
            r14 = r31
        L_0x090b:
            if (r14 == 0) goto L_0x0920
            java.util.ArrayList<com.ironsource.mediationsdk.model.e> r4 = r2.f4716e     // Catch:{ Exception -> 0x06e5 }
            r4.add(r14)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.e r4 = r2.f4717f     // Catch:{ Exception -> 0x06e5 }
            if (r4 != 0) goto L_0x0917
            goto L_0x091e
        L_0x0917:
            r4 = 0
            boolean r7 = r14.isPlacementId(r4)     // Catch:{ Exception -> 0x06e5 }
            if (r7 == 0) goto L_0x0920
        L_0x091e:
            r2.f4717f = r14     // Catch:{ Exception -> 0x06e5 }
        L_0x0920:
            int r3 = r3 + 1
            r4 = r45
            r7 = r47
            r45 = r51
            r13 = r55
            goto L_0x08c2
        L_0x092b:
            r55 = r13
            r51 = r45
            r45 = r4
            goto L_0x0944
        L_0x0932:
            r26 = r2
            r53 = r10
            r55 = r47
            r10 = r49
            r6 = r51
            r49 = r15
            r51 = r45
            r45 = r3
            r2 = r31
        L_0x0944:
            if (r25 == 0) goto L_0x0b77
            r3 = r25
            org.json.JSONArray r4 = r3.optJSONArray(r6)     // Catch:{ Exception -> 0x06e5 }
            r7 = r52
            org.json.JSONObject r13 = e(r7, r3)     // Catch:{ Exception -> 0x06e5 }
            org.json.JSONObject r14 = f(r3)     // Catch:{ Exception -> 0x06e5 }
            r15 = 1
            int r12 = a(r3, r5, r12, r15)     // Catch:{ Exception -> 0x06e5 }
            long r71 = b(r3, r5)     // Catch:{ Exception -> 0x06e5 }
            r25 = r12
            r15 = r53
            r12 = 0
            int r76 = a(r3, r5, r15, r12)     // Catch:{ Exception -> 0x06e5 }
            boolean r77 = r3.optBoolean(r10, r12)     // Catch:{ Exception -> 0x06e5 }
            r10 = r13
            r12 = 3000(0xbb8, double:1.482E-320)
            long r78 = r3.optLong(r11, r12)     // Catch:{ Exception -> 0x06e5 }
            r11 = r45
            r12 = 0
            boolean r80 = r14.optBoolean(r11, r12)     // Catch:{ Exception -> 0x06e5 }
            r11 = r49
            boolean r81 = r14.optBoolean(r11, r12)     // Catch:{ Exception -> 0x06e5 }
            r11 = r66
            int r3 = a(r3, r5, r11, r12)     // Catch:{ Exception -> 0x06e5 }
            if (r3 <= 0) goto L_0x098f
            r70 = r3
            r3 = r46
            r73 = 1
            goto L_0x0995
        L_0x098f:
            r73 = r12
            r70 = r25
            r3 = r46
        L_0x0995:
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r3)     // Catch:{ Exception -> 0x06e5 }
            r11 = r28
            boolean r84 = r10.optBoolean(r11, r12)     // Catch:{ Exception -> 0x06e5 }
            r13 = r41
            boolean r85 = r10.optBoolean(r13, r12)     // Catch:{ Exception -> 0x06e5 }
            r12 = r44
            r14 = -1
            int r86 = r10.optInt(r12, r14)     // Catch:{ Exception -> 0x06e5 }
            r15 = r40
            java.lang.String r87 = r10.optString(r15, r9)     // Catch:{ Exception -> 0x06e5 }
            r14 = r39
            java.lang.String r88 = r10.optString(r14, r9)     // Catch:{ Exception -> 0x06e5 }
            r25 = r2
            r28 = r5
            r2 = r38
            r5 = -1
            int r89 = r10.optInt(r2, r5)     // Catch:{ Exception -> 0x06e5 }
            r38 = r6
            r6 = r37
            int r90 = r10.optInt(r6, r5)     // Catch:{ Exception -> 0x06e5 }
            r37 = r6
            r5 = r36
            r6 = 5000(0x1388, float:7.006E-42)
            int r91 = r10.optInt(r5, r6)     // Catch:{ Exception -> 0x06e5 }
            r36 = r5
            r6 = r32
            org.json.JSONArray r5 = r10.optJSONArray(r6)     // Catch:{ Exception -> 0x06e5 }
            if (r5 == 0) goto L_0x0a00
            r32 = r6
            int r6 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x06e5 }
            r39 = r2
            r40 = r14
            r2 = 0
        L_0x09ec:
            int r14 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            if (r2 >= r14) goto L_0x09fb
            int r14 = r5.optInt(r2)     // Catch:{ Exception -> 0x06e5 }
            r6[r2] = r14     // Catch:{ Exception -> 0x06e5 }
            int r2 = r2 + 1
            goto L_0x09ec
        L_0x09fb:
            r92 = r6
            r2 = r30
            goto L_0x0a0a
        L_0x0a00:
            r39 = r2
            r32 = r6
            r40 = r14
            r2 = r30
            r92 = r31
        L_0x0a0a:
            org.json.JSONArray r5 = r10.optJSONArray(r2)     // Catch:{ Exception -> 0x06e5 }
            if (r5 == 0) goto L_0x0a2d
            int r6 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x06e5 }
            r30 = r2
            r14 = 0
        L_0x0a19:
            int r2 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            if (r14 >= r2) goto L_0x0a28
            int r2 = r5.optInt(r14)     // Catch:{ Exception -> 0x06e5 }
            r6[r14] = r2     // Catch:{ Exception -> 0x06e5 }
            int r14 = r14 + 1
            goto L_0x0a19
        L_0x0a28:
            r93 = r6
            r2 = r29
            goto L_0x0a33
        L_0x0a2d:
            r30 = r2
            r2 = r29
            r93 = r31
        L_0x0a33:
            org.json.JSONArray r5 = r10.optJSONArray(r2)     // Catch:{ Exception -> 0x06e5 }
            if (r5 == 0) goto L_0x0a54
            int r6 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x06e5 }
            r29 = r2
            r14 = 0
        L_0x0a42:
            int r2 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            if (r14 >= r2) goto L_0x0a51
            int r2 = r5.optInt(r14)     // Catch:{ Exception -> 0x06e5 }
            r6[r14] = r2     // Catch:{ Exception -> 0x06e5 }
            int r14 = r14 + 1
            goto L_0x0a42
        L_0x0a51:
            r94 = r6
            goto L_0x0a58
        L_0x0a54:
            r29 = r2
            r94 = r31
        L_0x0a58:
            r2 = r68
            org.json.JSONArray r5 = r10.optJSONArray(r2)     // Catch:{ Exception -> 0x06e5 }
            if (r5 == 0) goto L_0x0a79
            int r6 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x06e5 }
            r10 = 0
        L_0x0a67:
            int r14 = r5.length()     // Catch:{ Exception -> 0x06e5 }
            if (r10 >= r14) goto L_0x0a76
            int r14 = r5.optInt(r10)     // Catch:{ Exception -> 0x06e5 }
            r6[r10] = r14     // Catch:{ Exception -> 0x06e5 }
            int r10 = r10 + 1
            goto L_0x0a67
        L_0x0a76:
            r95 = r6
            goto L_0x0a7b
        L_0x0a79:
            r95 = r31
        L_0x0a7b:
            com.ironsource.sdk.controller.x r74 = new com.ironsource.sdk.controller.x     // Catch:{ Exception -> 0x06e5 }
            r83 = 0
            r82 = r74
            r82.<init>(r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95)     // Catch:{ Exception -> 0x06e5 }
            if (r55 == 0) goto L_0x0afa
            java.lang.String r5 = "nativeAd"
            r6 = r55
            org.json.JSONObject r5 = e(r5, r6)     // Catch:{ Exception -> 0x06e5 }
            if (r5 == 0) goto L_0x0af2
            r10 = r48
            java.lang.String r83 = r6.optString(r10, r9)     // Catch:{ Exception -> 0x06e5 }
            r14 = r35
            java.lang.String r84 = r6.optString(r14, r9)     // Catch:{ Exception -> 0x06e5 }
            r14 = r34
            java.lang.String r85 = r6.optString(r14, r9)     // Catch:{ Exception -> 0x06e5 }
            r48 = r10
            r14 = r33
            r10 = 2
            int r86 = r6.optInt(r14, r10)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "auctionSavedHistory"
            r14 = 15
            int r87 = r6.optInt(r10, r14)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "auctionTimeout"
            r33 = r15
            r14 = 10000(0x2710, double:4.9407E-320)
            long r88 = r6.optLong(r10, r14)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "compressAuctionRequest"
            r14 = 0
            boolean r98 = r6.optBoolean(r10, r14)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "compressAuctionResponse"
            boolean r99 = r6.optBoolean(r10, r14)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "encryptionVersion"
            r14 = 1
            int r101 = r6.optInt(r10, r14)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r10 = "minTimeBeforeFirstAuction"
            r14 = 2000(0x7d0, float:2.803E-42)
            int r5 = r5.optInt(r10, r14)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.utils.c r10 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x06e5 }
            long r14 = (long) r5     // Catch:{ Exception -> 0x06e5 }
            r90 = r14
            r92 = 0
            r94 = 0
            r96 = 1
            r97 = 0
            r100 = 1
            r102 = 0
            r82 = r10
            r82.<init>(r83, r84, r85, r86, r87, r88, r90, r92, r94, r96, r97, r98, r99, r100, r101, r102)     // Catch:{ Exception -> 0x06e5 }
            r75 = r10
            goto L_0x0b05
        L_0x0af2:
            r33 = r15
            com.ironsource.mediationsdk.utils.c r5 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x06e5 }
            r5.<init>()     // Catch:{ Exception -> 0x06e5 }
            goto L_0x0b03
        L_0x0afa:
            r33 = r15
            r6 = r55
            com.ironsource.mediationsdk.utils.c r5 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x06e5 }
            r5.<init>()     // Catch:{ Exception -> 0x06e5 }
        L_0x0b03:
            r75 = r5
        L_0x0b05:
            com.ironsource.mediationsdk.model.i r5 = new com.ironsource.mediationsdk.model.i     // Catch:{ Exception -> 0x06e5 }
            r69 = r5
            r69.<init>(r70, r71, r73, r74, r75, r76, r77, r78, r80, r81)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0b6e
            r10 = 0
        L_0x0b0f:
            int r14 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            if (r10 >= r14) goto L_0x0b6e
            org.json.JSONObject r14 = r4.optJSONObject(r10)     // Catch:{ Exception -> 0x06e5 }
            if (r14 == 0) goto L_0x0b50
            r34 = r4
            r49 = r6
            r15 = r51
            r4 = -1
            int r6 = r14.optInt(r15, r4)     // Catch:{ Exception -> 0x06e5 }
            r47 = r15
            r4 = r54
            java.lang.String r15 = r14.optString(r4, r9)     // Catch:{ Exception -> 0x06e5 }
            r68 = r2
            r46 = r4
            r4 = 0
            boolean r2 = r14.optBoolean(r8, r4)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.m r4 = c(r14)     // Catch:{ Exception -> 0x06e5 }
            if (r6 < 0) goto L_0x0b5a
            boolean r14 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x06e5 }
            if (r14 != 0) goto L_0x0b5a
            com.ironsource.mediationsdk.model.j r14 = new com.ironsource.mediationsdk.model.j     // Catch:{ Exception -> 0x06e5 }
            r14.<init>(r6, r15, r2, r4)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0b5c
            android.content.Context r2 = r1.f5024h     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.utils.j.a((android.content.Context) r2, (com.ironsource.mediationsdk.model.j) r14)     // Catch:{ Exception -> 0x06e5 }
            goto L_0x0b5c
        L_0x0b50:
            r68 = r2
            r34 = r4
            r49 = r6
            r47 = r51
            r46 = r54
        L_0x0b5a:
            r14 = r31
        L_0x0b5c:
            if (r14 == 0) goto L_0x0b61
            r5.a((com.ironsource.mediationsdk.model.j) r14)     // Catch:{ Exception -> 0x06e5 }
        L_0x0b61:
            int r10 = r10 + 1
            r4 = r34
            r54 = r46
            r51 = r47
            r6 = r49
            r2 = r68
            goto L_0x0b0f
        L_0x0b6e:
            r68 = r2
            r49 = r6
            r47 = r51
            r46 = r54
            goto L_0x0b95
        L_0x0b77:
            r25 = r2
            r11 = r28
            r33 = r40
            r13 = r41
            r12 = r44
            r3 = r46
            r47 = r51
            r7 = r52
            r46 = r54
            r49 = r55
            r28 = r5
            r40 = r39
            r39 = r38
            r38 = r6
            r5 = r31
        L_0x0b95:
            if (r24 == 0) goto L_0x0cca
            r2 = r24
            org.json.JSONObject r4 = e(r7, r2)     // Catch:{ Exception -> 0x06e5 }
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r4, r3)     // Catch:{ Exception -> 0x06e5 }
            r6 = 0
            boolean r53 = r4.optBoolean(r11, r6)     // Catch:{ Exception -> 0x06e5 }
            boolean r54 = r4.optBoolean(r13, r6)     // Catch:{ Exception -> 0x06e5 }
            r6 = -1
            int r55 = r4.optInt(r12, r6)     // Catch:{ Exception -> 0x06e5 }
            r10 = r33
            java.lang.String r56 = r4.optString(r10, r9)     // Catch:{ Exception -> 0x06e5 }
            r10 = r40
            java.lang.String r57 = r4.optString(r10, r9)     // Catch:{ Exception -> 0x06e5 }
            r10 = r39
            int r58 = r4.optInt(r10, r6)     // Catch:{ Exception -> 0x06e5 }
            r10 = r37
            int r59 = r4.optInt(r10, r6)     // Catch:{ Exception -> 0x06e5 }
            r6 = r36
            r10 = 5000(0x1388, float:7.006E-42)
            int r60 = r4.optInt(r6, r10)     // Catch:{ Exception -> 0x06e5 }
            r6 = r32
            org.json.JSONArray r10 = r4.optJSONArray(r6)     // Catch:{ Exception -> 0x06e5 }
            if (r10 == 0) goto L_0x0bf2
            int r11 = r10.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r11 = new int[r11]     // Catch:{ Exception -> 0x06e5 }
            r14 = 0
        L_0x0bde:
            int r15 = r10.length()     // Catch:{ Exception -> 0x06e5 }
            if (r14 >= r15) goto L_0x0bed
            int r15 = r10.optInt(r14)     // Catch:{ Exception -> 0x06e5 }
            r11[r14] = r15     // Catch:{ Exception -> 0x06e5 }
            int r14 = r14 + 1
            goto L_0x0bde
        L_0x0bed:
            r61 = r11
            r10 = r30
            goto L_0x0bf6
        L_0x0bf2:
            r10 = r30
            r61 = r31
        L_0x0bf6:
            org.json.JSONArray r11 = r4.optJSONArray(r10)     // Catch:{ Exception -> 0x06e5 }
            if (r11 == 0) goto L_0x0c19
            int r14 = r11.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r14 = new int[r14]     // Catch:{ Exception -> 0x06e5 }
            r24 = r7
            r15 = 0
        L_0x0c05:
            int r7 = r11.length()     // Catch:{ Exception -> 0x06e5 }
            if (r15 >= r7) goto L_0x0c14
            int r7 = r11.optInt(r15)     // Catch:{ Exception -> 0x06e5 }
            r14[r15] = r7     // Catch:{ Exception -> 0x06e5 }
            int r15 = r15 + 1
            goto L_0x0c05
        L_0x0c14:
            r62 = r14
            r7 = r29
            goto L_0x0c1f
        L_0x0c19:
            r24 = r7
            r7 = r29
            r62 = r31
        L_0x0c1f:
            org.json.JSONArray r7 = r4.optJSONArray(r7)     // Catch:{ Exception -> 0x06e5 }
            if (r7 == 0) goto L_0x0c3e
            int r11 = r7.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r11 = new int[r11]     // Catch:{ Exception -> 0x06e5 }
            r14 = 0
        L_0x0c2c:
            int r15 = r7.length()     // Catch:{ Exception -> 0x06e5 }
            if (r14 >= r15) goto L_0x0c3b
            int r15 = r7.optInt(r14)     // Catch:{ Exception -> 0x06e5 }
            r11[r14] = r15     // Catch:{ Exception -> 0x06e5 }
            int r14 = r14 + 1
            goto L_0x0c2c
        L_0x0c3b:
            r63 = r11
            goto L_0x0c40
        L_0x0c3e:
            r63 = r31
        L_0x0c40:
            r7 = r68
            org.json.JSONArray r4 = r4.optJSONArray(r7)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0c61
            int r7 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x06e5 }
            r11 = 0
        L_0x0c4f:
            int r14 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            if (r11 >= r14) goto L_0x0c5e
            int r14 = r4.optInt(r11)     // Catch:{ Exception -> 0x06e5 }
            r7[r11] = r14     // Catch:{ Exception -> 0x06e5 }
            int r11 = r11 + 1
            goto L_0x0c4f
        L_0x0c5e:
            r64 = r7
            goto L_0x0c63
        L_0x0c61:
            r64 = r31
        L_0x0c63:
            com.ironsource.sdk.controller.x r4 = new com.ironsource.sdk.controller.x     // Catch:{ Exception -> 0x06e5 }
            r52 = 0
            r51 = r4
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.k r7 = new com.ironsource.mediationsdk.model.k     // Catch:{ Exception -> 0x06e5 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x06e5 }
            r7.f4767d = r2     // Catch:{ Exception -> 0x06e5 }
            r4 = r38
            org.json.JSONArray r2 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x06e5 }
            if (r2 == 0) goto L_0x0cd2
            r4 = 0
        L_0x0c7c:
            int r11 = r2.length()     // Catch:{ Exception -> 0x06e5 }
            if (r4 >= r11) goto L_0x0cd2
            org.json.JSONObject r11 = r2.optJSONObject(r4)     // Catch:{ Exception -> 0x06e5 }
            r29 = r2
            if (r11 == 0) goto L_0x0cae
            r14 = r47
            r15 = -1
            int r2 = r11.optInt(r14, r15)     // Catch:{ Exception -> 0x06e5 }
            r47 = r14
            r15 = r46
            java.lang.String r14 = r11.optString(r15, r9)     // Catch:{ Exception -> 0x06e5 }
            r46 = r15
            r15 = 0
            boolean r11 = r11.optBoolean(r8, r15)     // Catch:{ Exception -> 0x06e5 }
            if (r2 < 0) goto L_0x0cae
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x06e5 }
            if (r15 != 0) goto L_0x0cae
            com.ironsource.mediationsdk.model.l r15 = new com.ironsource.mediationsdk.model.l     // Catch:{ Exception -> 0x06e5 }
            r15.<init>(r2, r14, r11)     // Catch:{ Exception -> 0x06e5 }
            goto L_0x0cb0
        L_0x0cae:
            r15 = r31
        L_0x0cb0:
            if (r15 == 0) goto L_0x0cc5
            java.util.ArrayList<com.ironsource.mediationsdk.model.l> r2 = r7.f4764a     // Catch:{ Exception -> 0x06e5 }
            r2.add(r15)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.l r2 = r7.f4765b     // Catch:{ Exception -> 0x06e5 }
            if (r2 != 0) goto L_0x0cbc
            goto L_0x0cc3
        L_0x0cbc:
            r2 = 0
            boolean r11 = r15.isPlacementId(r2)     // Catch:{ Exception -> 0x06e5 }
            if (r11 == 0) goto L_0x0cc5
        L_0x0cc3:
            r7.f4765b = r15     // Catch:{ Exception -> 0x06e5 }
        L_0x0cc5:
            int r4 = r4 + 1
            r2 = r29
            goto L_0x0c7c
        L_0x0cca:
            r24 = r7
            r10 = r30
            r6 = r32
            r7 = r31
        L_0x0cd2:
            com.ironsource.mediationsdk.utils.n r2 = new com.ironsource.mediationsdk.utils.n     // Catch:{ Exception -> 0x06e5 }
            r2.<init>()     // Catch:{ Exception -> 0x06e5 }
            if (r23 == 0) goto L_0x0d18
            java.lang.String r4 = "optInKeys"
            r8 = r23
            org.json.JSONArray r4 = r8.optJSONArray(r4)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0cfc
            r11 = 0
        L_0x0ce4:
            int r14 = r4.length()     // Catch:{ Exception -> 0x06e5 }
            if (r11 >= r14) goto L_0x0cfc
            java.lang.String r14 = r4.optString(r11)     // Catch:{ Exception -> 0x06e5 }
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x06e5 }
            if (r15 != 0) goto L_0x0cf9
            java.util.ArrayList<java.lang.String> r15 = r2.f5032a     // Catch:{ Exception -> 0x06e5 }
            r15.add(r14)     // Catch:{ Exception -> 0x06e5 }
        L_0x0cf9:
            int r11 = r11 + 1
            goto L_0x0ce4
        L_0x0cfc:
            java.lang.String r4 = "tokenGenericParams"
            org.json.JSONObject r4 = r8.optJSONObject(r4)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0d06
            r2.f5034c = r4     // Catch:{ Exception -> 0x06e5 }
        L_0x0d06:
            java.lang.String r4 = "oneToken"
            r11 = 0
            boolean r4 = r8.optBoolean(r4, r11)     // Catch:{ Exception -> 0x06e5 }
            r2.f5035d = r4     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r4 = "compressToken"
            r11 = 1
            boolean r4 = r8.optBoolean(r4, r11)     // Catch:{ Exception -> 0x06e5 }
            r2.f5036e = r4     // Catch:{ Exception -> 0x06e5 }
        L_0x0d18:
            com.ironsource.mediationsdk.utils.i r4 = new com.ironsource.mediationsdk.utils.i     // Catch:{ Exception -> 0x06e5 }
            r4.<init>()     // Catch:{ Exception -> 0x06e5 }
            if (r22 == 0) goto L_0x0d35
            java.lang.String r8 = "pixelEventsUrl"
            java.lang.String r11 = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3"
            r14 = r22
            java.lang.String r8 = r14.optString(r8, r11)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r11 = "pixelEventsEnabled"
            r15 = 1
            boolean r11 = r14.optBoolean(r11, r15)     // Catch:{ Exception -> 0x06e5 }
            r4.a((java.lang.String) r8)     // Catch:{ Exception -> 0x06e5 }
            r15 = r11
            goto L_0x0d36
        L_0x0d35:
            r15 = 1
        L_0x0d36:
            r4.a((boolean) r15)     // Catch:{ Exception -> 0x06e5 }
            if (r15 == 0) goto L_0x0d59
            int[] r6 = d(r6, r3)     // Catch:{ Exception -> 0x06e5 }
            r4.a((int[]) r6)     // Catch:{ Exception -> 0x06e5 }
            int[] r6 = d(r10, r3)     // Catch:{ Exception -> 0x06e5 }
            r4.b((int[]) r6)     // Catch:{ Exception -> 0x06e5 }
            r6 = 0
            boolean r8 = r3.optBoolean(r13, r6)     // Catch:{ Exception -> 0x06e5 }
            r4.b((boolean) r8)     // Catch:{ Exception -> 0x06e5 }
            r6 = -1
            int r6 = r3.optInt(r12, r6)     // Catch:{ Exception -> 0x06e5 }
            r4.a((int) r6)     // Catch:{ Exception -> 0x06e5 }
        L_0x0d59:
            java.lang.String r6 = "server"
            r8 = r21
            r10 = 3
            int r6 = r8.optInt(r6, r10)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r11 = "publisher"
            int r11 = r8.optInt(r11, r10)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r12 = "console"
            int r10 = r8.optInt(r12, r10)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r12 = "shouldSendPublisherLogsOnUIThread"
            r13 = 0
            boolean r8 = r8.optBoolean(r12, r13)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.sdk.g.d r12 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x06e5 }
            r12.<init>(r6, r11, r10, r8)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.sdk.f.a r6 = new com.ironsource.sdk.f.a     // Catch:{ Exception -> 0x06e5 }
            r6.<init>()     // Catch:{ Exception -> 0x06e5 }
            if (r20 == 0) goto L_0x0dd7
            java.lang.String r8 = "enabled"
            r10 = r20
            r11 = 0
            boolean r8 = r10.optBoolean(r8, r11)     // Catch:{ Exception -> 0x06e5 }
            r6.a((boolean) r8)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "reporterURL"
            java.lang.String r8 = r10.optString(r8, r9)     // Catch:{ Exception -> 0x06e5 }
            r6.b((java.lang.String) r8)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "reporterKeyword"
            java.lang.String r8 = r10.optString(r8, r9)     // Catch:{ Exception -> 0x06e5 }
            r6.c((java.lang.String) r8)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "includeANR"
            r11 = 0
            boolean r8 = r10.optBoolean(r8, r11)     // Catch:{ Exception -> 0x06e5 }
            r6.b((boolean) r8)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "timeout"
            r11 = 5000(0x1388, float:7.006E-42)
            int r8 = r10.optInt(r8, r11)     // Catch:{ Exception -> 0x06e5 }
            r6.a((int) r8)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "setIgnoreDebugger"
            r11 = 0
            boolean r8 = r10.optBoolean(r8, r11)     // Catch:{ Exception -> 0x06e5 }
            r6.c((boolean) r8)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "keysToInclude"
            org.json.JSONArray r8 = r10.optJSONArray(r8)     // Catch:{ Exception -> 0x06e5 }
            if (r8 == 0) goto L_0x0dd7
            r14 = 0
        L_0x0dc7:
            int r10 = r8.length()     // Catch:{ Exception -> 0x06e5 }
            if (r14 >= r10) goto L_0x0dd7
            java.lang.String r10 = r8.optString(r14)     // Catch:{ Exception -> 0x06e5 }
            r6.a((java.lang.String) r10)     // Catch:{ Exception -> 0x06e5 }
            int r14 = r14 + 1
            goto L_0x0dc7
        L_0x0dd7:
            if (r19 == 0) goto L_0x0df7
            java.lang.String r8 = "name"
            r10 = r19
            java.lang.String r8 = r10.optString(r8, r9)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r9 = "id"
            java.lang.String r11 = "-1"
            java.lang.String r9 = r10.optString(r9, r11)     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r11 = "custom"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.r r11 = new com.ironsource.mediationsdk.model.r     // Catch:{ Exception -> 0x06e5 }
            r11.<init>(r8, r9, r10)     // Catch:{ Exception -> 0x06e5 }
            r39 = r11
            goto L_0x0df9
        L_0x0df7:
            r39 = r31
        L_0x0df9:
            com.ironsource.mediationsdk.utils.b r8 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x06e5 }
            if (r17 == 0) goto L_0x0e00
            r9 = r17
            goto L_0x0e05
        L_0x0e00:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x06e5 }
            r9.<init>()     // Catch:{ Exception -> 0x06e5 }
        L_0x0e05:
            r8.<init>(r9)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.c r9 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x06e5 }
            r9.<init>()     // Catch:{ Exception -> 0x06e5 }
            if (r18 == 0) goto L_0x0e27
            java.lang.String r9 = "mediationTypes"
            r10 = r18
            org.json.JSONObject r9 = r10.optJSONObject(r9)     // Catch:{ Exception -> 0x06e5 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x06e5 }
            r10.<init>()     // Catch:{ Exception -> 0x06e5 }
            if (r9 == 0) goto L_0x0e22
            java.util.Map r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r9)     // Catch:{ Exception -> 0x06e5 }
        L_0x0e22:
            com.ironsource.mediationsdk.model.c r9 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x06e5 }
            r9.<init>(r10)     // Catch:{ Exception -> 0x06e5 }
        L_0x0e27:
            r44 = r9
            com.ironsource.mediationsdk.model.b r9 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x06e5 }
            r9.<init>()     // Catch:{ Exception -> 0x06e5 }
            if (r49 == 0) goto L_0x0e40
            r10 = r48
            r9 = r49
            java.lang.String r9 = r9.optString(r10)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.b r10 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x06e5 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x06e5 }
            r46 = r10
            goto L_0x0e42
        L_0x0e40:
            r46 = r9
        L_0x0e42:
            java.lang.String r9 = "integration"
            r10 = r28
            r11 = 0
            boolean r41 = r10.optBoolean(r9, r11)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.sdk.a.g r9 = new com.ironsource.sdk.a.g     // Catch:{ Exception -> 0x06e5 }
            r37 = r9
            r38 = r12
            r40 = r2
            r42 = r6
            r43 = r8
            r45 = r4
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.s r2 = new com.ironsource.mediationsdk.model.s     // Catch:{ Exception -> 0x06e5 }
            r2.<init>()     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r4 = "testSuite"
            r6 = r16
            org.json.JSONObject r4 = e(r4, r6)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0e74
            java.lang.String r8 = "controllerUrl"
            java.lang.String r4 = r4.optString(r8)     // Catch:{ Exception -> 0x06e5 }
            r2.a(r4)     // Catch:{ Exception -> 0x06e5 }
        L_0x0e74:
            com.ironsource.mediationsdk.utils.g r4 = new com.ironsource.mediationsdk.utils.g     // Catch:{ Exception -> 0x06e5 }
            r4.<init>()     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r8 = "AdQuality"
            org.json.JSONObject r6 = e(r8, r6)     // Catch:{ Exception -> 0x06e5 }
            if (r6 == 0) goto L_0x0e8a
            java.lang.String r8 = "initSDK"
            boolean r6 = r6.optBoolean(r8)     // Catch:{ Exception -> 0x06e5 }
            r4.a((boolean) r6)     // Catch:{ Exception -> 0x06e5 }
        L_0x0e8a:
            com.ironsource.mediationsdk.model.f$a r6 = new com.ironsource.mediationsdk.model.f$a     // Catch:{ Exception -> 0x06e5 }
            r6.<init>()     // Catch:{ Exception -> 0x06e5 }
            r8 = r27
            r6.a((com.ironsource.mediationsdk.model.q) r8)     // Catch:{ Exception -> 0x06e5 }
            r8 = r26
            r6.a((com.ironsource.mediationsdk.model.h) r8)     // Catch:{ Exception -> 0x06e5 }
            r6.a((com.ironsource.mediationsdk.model.k) r7)     // Catch:{ Exception -> 0x06e5 }
            r7 = r25
            r6.a((com.ironsource.mediationsdk.model.d) r7)     // Catch:{ Exception -> 0x06e5 }
            r6.a((com.ironsource.mediationsdk.model.i) r5)     // Catch:{ Exception -> 0x06e5 }
            r6.a((com.ironsource.sdk.a.g) r9)     // Catch:{ Exception -> 0x06e5 }
            r6.a((com.ironsource.mediationsdk.model.s) r2)     // Catch:{ Exception -> 0x06e5 }
            r6.a((com.ironsource.mediationsdk.utils.g) r4)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.model.f r2 = r6.a()     // Catch:{ Exception -> 0x06e5 }
            r1.f5019c = r2     // Catch:{ Exception -> 0x06e5 }
            java.lang.String r2 = "genericParams"
            org.json.JSONObject r2 = e(r2, r3)     // Catch:{ Exception -> 0x06e5 }
            if (r2 == 0) goto L_0x0ed8
            r3 = r24
            org.json.JSONObject r4 = e(r3, r2)     // Catch:{ Exception -> 0x06e5 }
            if (r4 == 0) goto L_0x0ed8
            r2.remove(r3)     // Catch:{ Exception -> 0x06e5 }
            java.util.Map r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r4)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.events.i r4 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ Exception -> 0x06e5 }
            r4.b((java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.events.e r4 = com.ironsource.mediationsdk.events.e.d()     // Catch:{ Exception -> 0x06e5 }
            r4.b((java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ Exception -> 0x06e5 }
        L_0x0ed8:
            if (r2 == 0) goto L_0x0eec
            java.util.Map r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r2)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.events.i r3 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ Exception -> 0x06e5 }
            r3.a((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x06e5 }
            com.ironsource.mediationsdk.events.e r3 = com.ironsource.mediationsdk.events.e.d()     // Catch:{ Exception -> 0x06e5 }
            r3.a((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x06e5 }
        L_0x0eec:
            return
        L_0x0eed:
            r2.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.k.j():void");
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f5022f);
            jSONObject.put(DataKeys.USER_ID, this.f5023g);
            jSONObject.put("response", this.f5020d);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }
}
