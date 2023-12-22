package com.ironsource.mediationsdk.adquality;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.sdk.c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import d9.e;
import d9.g;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONObject;
import x8.d;
import x8.f;

public final class AdQualityBridge {
    public static final Companion Companion = new Companion((d) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public static String a() {
            if (!b()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            f.e(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        public static boolean b() {
            return IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
        }

        public static int c(String str, String str2) {
            int i10 = -1;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            Pattern compile = Pattern.compile("[^0-9.]");
            f.e(compile, "compile(pattern)");
            f.f(str, "input");
            String replaceAll = compile.matcher(str).replaceAll("");
            f.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            Object[] array = g.E(replaceAll, new String[]{"."}).toArray(new String[0]);
            f.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            Pattern compile2 = Pattern.compile("[^0-9.]");
            f.e(compile2, "compile(pattern)");
            f.f(str2, "input");
            String replaceAll2 = compile2.matcher(str2).replaceAll("");
            f.e(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
            Object[] array2 = g.E(replaceAll2, new String[]{"."}).toArray(new String[0]);
            f.d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr2 = (String[]) array2;
            int i11 = 0;
            while (i11 < strArr.length && i11 < strArr2.length && f.a(strArr[i11], strArr2[i11])) {
                i11++;
            }
            if (i11 >= strArr.length || i11 >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int intValue = Integer.valueOf(strArr[i11]).intValue();
            Integer valueOf = Integer.valueOf(strArr2[i11]);
            f.e(valueOf, "valueOf(vals2[i])");
            int intValue2 = valueOf.intValue();
            if (intValue >= intValue2) {
                if (intValue == intValue2) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            }
            return Integer.signum(i10);
        }

        public final boolean adQualityAvailable() {
            return c(a(), "7.9.0") >= 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (java.lang.Boolean.parseBoolean(r0) == true) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdQualityBridge(android.content.Context r3, java.lang.String r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            x8.f.f(r3, r0)
            java.lang.String r0 = "appKey"
            x8.f.f(r4, r0)
            r2.<init>()
            com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder r0 = new com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder
            r0.<init>()
            java.lang.String r1 = "LevelPlay"
            com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder r0 = r0.setInitializationSource(r1)
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r6 = a(r6)
            com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder r6 = r0.setLogLevel(r6)
            com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1 r0 = new com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            r0.<init>(r2)
            com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener r0 = (com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener) r0
            com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder r6 = r6.setAdQualityInitListener(r0)
            com.ironsource.mediationsdk.sdk.c r0 = com.ironsource.mediationsdk.sdk.c.a()
            java.lang.String r1 = "is_coppa"
            java.lang.String r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x003f
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1 = 1
            if (r0 != r1) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder r6 = r6.setCoppa(r1)
            com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType r0 = b()
            com.ironsource.adqualitysdk.sdk.ISAdQualityConfig$Builder r6 = r6.setDeviceIdType(r0)
            if (r5 == 0) goto L_0x0051
            r6.setUserId(r5)
        L_0x0051:
            r5 = 80
            r0 = 0
            c(r5, r0, r0)
            com.ironsource.adqualitysdk.sdk.IronSourceAdQuality r5 = com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance()
            com.ironsource.adqualitysdk.sdk.ISAdQualityConfig r6 = r6.build()
            r5.initialize(r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adquality.AdQualityBridge.<init>(android.content.Context, java.lang.String, java.lang.String, int):void");
    }

    public static ISAdQualityLogLevel a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.VERBOSE;
    }

    public static final /* synthetic */ void access$logEvent(AdQualityBridge adQualityBridge, int i10, Integer num, String str) {
        adQualityBridge.getClass();
        c(i10, num, str);
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    public static ISAdQualityDeviceIdType b() {
        return !TextUtils.isEmpty(c.a().a("AdvIdOptOutReason")) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    public static void c(int i10, Integer num, String str) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (num != null) {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
        }
        if (str != null) {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        i.d().a(new a(i10, mediationAdditionalData));
    }

    public final void changeUserId(String str) {
        f.f(str, DataKeys.USER_ID);
        IronSourceAdQuality.getInstance().changeUserId(str);
    }

    public final void setSegment(IronSourceSegment ironSourceSegment) {
        f.f(ironSourceSegment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (ironSourceSegment.getSegmentName() != null) {
            builder.setSegmentName(ironSourceSegment.getSegmentName());
        }
        if (ironSourceSegment.getAge() >= 0) {
            builder.setAge(ironSourceSegment.getAge());
        }
        if (ironSourceSegment.getGender() != null) {
            builder.setGender(ironSourceSegment.getGender());
        }
        if (ironSourceSegment.getLevel() >= 0) {
            builder.setLevel(ironSourceSegment.getLevel());
        }
        if (ironSourceSegment.getIsPaying() != null) {
            builder.setIsPaying(ironSourceSegment.getIsPaying().get());
        }
        if (ironSourceSegment.getIapt() > -1.0d) {
            builder.setInAppPurchasesTotal(ironSourceSegment.getIapt());
        }
        if (ironSourceSegment.getUcd() > 0) {
            builder.setUserCreationDate(ironSourceSegment.getUcd());
        }
        Iterator<Pair<String, String>> it = ironSourceSegment.getSegmentData().iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            String str = (String) next.first;
            String str2 = (String) next.second;
            f.e(str, "key");
            if (e.v(str, "custom_")) {
                builder.setCustomData(g.B(str), str2);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
