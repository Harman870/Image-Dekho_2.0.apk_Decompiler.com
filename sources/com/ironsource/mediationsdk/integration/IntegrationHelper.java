package com.ironsource.mediationsdk.integration;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.z;

public class IntegrationHelper {

    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Context f4611a;

        public a(Context context) {
            this.f4611a = context;
        }

        public final void run() {
            try {
                Log.w("IntegrationHelper", "--------------- Google Play Services --------------");
                if (this.f4611a.getPackageManager().getApplicationInfo(this.f4611a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.i("IntegrationHelper", "Google Play Services - VERIFIED");
                    z.a();
                    String a10 = z.a(this.f4611a);
                    if (!TextUtils.isEmpty(a10)) {
                        Log.i("IntegrationHelper", "GAID is: " + a10 + " (use this for test devices)");
                        return;
                    }
                    return;
                }
                Log.e("IntegrationHelper", "Google Play Services - MISSING");
            } catch (Exception unused) {
                Log.e("IntegrationHelper", "Google Play Services - MISSING");
            }
        }
    }

    public static IntegrationData a(Context context, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Log.i("IntegrationHelper", "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException unused) {
            str2 = "Adapter - MISSING";
            Log.e("IntegrationHelper", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Adapter version - NOT VERIFIED";
            Log.e("IntegrationHelper", str2);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0150, code lost:
        if (r13 != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        if (r0.equals("facebook") == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f4, code lost:
        if (r0.equals("facebook") == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0228, code lost:
        android.util.Log.e("IntegrationHelper", r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0 A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void validateIntegration(android.content.Context r26) {
        /*
            r1 = r26
            java.lang.String r2 = "facebook"
            java.lang.String r3 = "admob"
            java.lang.String r4 = "supersonicads"
            java.lang.String r5 = "IntegrationHelper"
            java.lang.String r0 = "Verifying Integration:"
            android.util.Log.i(r5, r0)
            java.lang.String r0 = "*** Permissions ***"
            android.util.Log.i(r5, r0)
            android.content.pm.PackageManager r0 = r26.getPackageManager()
            java.lang.String r6 = r26.getPackageName()
            java.lang.String r7 = "android.permission.INTERNET"
            int r6 = r0.checkPermission(r7, r6)
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "android.permission.INTERNET - VERIFIED"
            android.util.Log.i(r5, r6)
            goto L_0x002f
        L_0x002a:
            java.lang.String r6 = "android.permission.INTERNET - MISSING"
            android.util.Log.e(r5, r6)
        L_0x002f:
            java.lang.String r6 = r26.getPackageName()
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r0.checkPermission(r7, r6)
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE - VERIFIED"
            android.util.Log.i(r5, r0)
            goto L_0x0046
        L_0x0041:
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE - MISSING"
            android.util.Log.e(r5, r0)
        L_0x0046:
            java.lang.String r6 = "AdColony"
            java.lang.String r7 = "AppLovin"
            java.lang.String r8 = "APS"
            java.lang.String r9 = "BidMachine"
            java.lang.String r10 = "Chartboost"
            java.lang.String r11 = "Fyber"
            java.lang.String r12 = "AdMob"
            java.lang.String r13 = "HyprMX"
            java.lang.String r14 = "InMobi"
            java.lang.String r15 = "SupersonicAds"
            java.lang.String r16 = "Maio"
            java.lang.String r17 = "Facebook"
            java.lang.String r18 = "Mintegral"
            java.lang.String r19 = "MyTarget"
            java.lang.String r20 = "Pangle"
            java.lang.String r21 = "Smaato"
            java.lang.String r22 = "SuperAwesome"
            java.lang.String r23 = "Tapjoy"
            java.lang.String r24 = "UnityAds"
            java.lang.String r25 = "Vungle"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            r7 = 0
            r8 = r7
        L_0x0074:
            r0 = 20
            if (r8 >= r0) goto L_0x022f
            r9 = r6[r8]
            r10 = 2
            r11 = -1
            r12 = 1
            java.lang.String r0 = com.ironsource.environment.StringUtils.toLowerCase(r9)     // Catch:{ Exception -> 0x0183 }
            int r13 = r0.hashCode()     // Catch:{ Exception -> 0x0183 }
            r14 = -1875652737(0xffffffff9033cf7f, float:-3.5461375E-29)
            if (r13 == r14) goto L_0x00a5
            r14 = 92668925(0x58603fd, float:1.2602765E-35)
            if (r13 == r14) goto L_0x009d
            r14 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r13 == r14) goto L_0x0095
            goto L_0x00ad
        L_0x0095:
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0183 }
            if (r0 == 0) goto L_0x00ad
            r0 = r12
            goto L_0x00ae
        L_0x009d:
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0183 }
            if (r0 == 0) goto L_0x00ad
            r0 = r10
            goto L_0x00ae
        L_0x00a5:
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x0183 }
            if (r0 == 0) goto L_0x00ad
            r0 = r7
            goto L_0x00ae
        L_0x00ad:
            r0 = r11
        L_0x00ae:
            if (r0 == 0) goto L_0x00ce
            if (r0 == r12) goto L_0x00cb
            if (r0 == r10) goto L_0x00c8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = "--------------- "
            r0.<init>(r13)     // Catch:{ Exception -> 0x0183 }
            r0.append(r9)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = " --------------"
            r0.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0183 }
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r0 = "--------------- Google (AdMob and Ad Manager) --------------"
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r0 = "--------------- Meta --------------"
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r0 = "--------------- IronSource --------------"
        L_0x00d0:
            android.util.Log.i(r5, r0)     // Catch:{ Exception -> 0x0183 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = "com.ironsource.adapters."
            r0.<init>(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = com.ironsource.environment.StringUtils.toLowerCase(r9)     // Catch:{ Exception -> 0x0183 }
            r0.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = "."
            r0.append(r13)     // Catch:{ Exception -> 0x0183 }
            r0.append(r9)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = "Adapter"
            r0.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0183 }
            com.ironsource.mediationsdk.IntegrationData r13 = a(r1, r0)     // Catch:{ Exception -> 0x0183 }
            if (r13 != 0) goto L_0x00fa
        L_0x00f8:
            goto L_0x0195
        L_0x00fa:
            java.lang.String r14 = "SupersonicAds"
            boolean r14 = r9.equalsIgnoreCase(r14)     // Catch:{ Exception -> 0x0183 }
            if (r14 != 0) goto L_0x0153
            java.lang.String r14 = r13.version     // Catch:{ Exception -> 0x0183 }
            java.lang.String r15 = "4.1"
            boolean r14 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0183 }
            if (r14 != 0) goto L_0x014a
            java.lang.String r14 = r13.version     // Catch:{ Exception -> 0x0183 }
            java.lang.String r15 = "4.3"
            boolean r14 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0183 }
            if (r14 == 0) goto L_0x0117
            goto L_0x014a
        L_0x0117:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            r14.<init>()     // Catch:{ Exception -> 0x0183 }
            java.lang.String r15 = r13.name     // Catch:{ Exception -> 0x0183 }
            r14.append(r15)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r15 = " adapter "
            r14.append(r15)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = r13.version     // Catch:{ Exception -> 0x0183 }
            r14.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = " is incompatible with SDK version "
            r14.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ Exception -> 0x0183 }
            r14.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = ", please update your adapter to version 4.1"
            r14.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = ".*"
            r14.append(r13)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r13 = r14.toString()     // Catch:{ Exception -> 0x0183 }
            android.util.Log.e(r5, r13)     // Catch:{ Exception -> 0x0183 }
            r13 = r7
            goto L_0x0150
        L_0x014a:
            java.lang.String r13 = "Adapter - VERIFIED"
            android.util.Log.i(r5, r13)     // Catch:{ Exception -> 0x0183 }
            r13 = r12
        L_0x0150:
            if (r13 != 0) goto L_0x0153
            goto L_0x00f8
        L_0x0153:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x017a }
            java.lang.String r13 = "getAdapterSDKVersion"
            java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x017a }
            java.lang.reflect.Method r0 = r0.getMethod(r13, r14)     // Catch:{ Exception -> 0x017a }
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x017a }
            java.lang.Object r0 = r0.invoke(r13, r14)     // Catch:{ Exception -> 0x017a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x017a }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017a }
            java.lang.String r14 = "SDK Version - "
            r13.<init>(r14)     // Catch:{ Exception -> 0x017a }
            r13.append(r0)     // Catch:{ Exception -> 0x017a }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x017a }
            android.util.Log.i(r5, r0)     // Catch:{ Exception -> 0x017a }
            goto L_0x0181
        L_0x017a:
            java.lang.String r0 = "validateSDKVersion"
            java.lang.String r13 = "Unable to get SDK version"
            android.util.Log.w(r0, r13)     // Catch:{ Exception -> 0x0183 }
        L_0x0181:
            r0 = r12
            goto L_0x0196
        L_0x0183:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "isAdapterValid "
            r13.<init>(r14)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            android.util.Log.e(r5, r13, r0)
        L_0x0195:
            r0 = r7
        L_0x0196:
            java.lang.String r13 = ">>>> "
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = com.ironsource.environment.StringUtils.toLowerCase(r9)
            r0.getClass()
            int r14 = r0.hashCode()
            switch(r14) {
                case -1875652737: goto L_0x01ba;
                case 92668925: goto L_0x01b1;
                case 497130182: goto L_0x01aa;
                default: goto L_0x01a8;
            }
        L_0x01a8:
            r10 = r11
            goto L_0x01c2
        L_0x01aa:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01c2
            goto L_0x01a8
        L_0x01b1:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01b8
            goto L_0x01a8
        L_0x01b8:
            r10 = r12
            goto L_0x01c2
        L_0x01ba:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01c1
            goto L_0x01a8
        L_0x01c1:
            r10 = r7
        L_0x01c2:
            switch(r10) {
                case 0: goto L_0x01dd;
                case 1: goto L_0x01da;
                case 2: goto L_0x01d7;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            r0.append(r9)
            java.lang.String r9 = " - VERIFIED"
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            goto L_0x021f
        L_0x01d7:
            java.lang.String r0 = ">>>> Meta - VERIFIED"
            goto L_0x021f
        L_0x01da:
            java.lang.String r0 = ">>>> Google (AdMob and Ad Manager) - VERIFIED"
            goto L_0x021f
        L_0x01dd:
            java.lang.String r0 = ">>>> IronSource - VERIFIED"
            goto L_0x021f
        L_0x01e0:
            java.lang.String r0 = com.ironsource.environment.StringUtils.toLowerCase(r9)
            r0.getClass()
            int r14 = r0.hashCode()
            switch(r14) {
                case -1875652737: goto L_0x0200;
                case 92668925: goto L_0x01f7;
                case 497130182: goto L_0x01f0;
                default: goto L_0x01ee;
            }
        L_0x01ee:
            r10 = r11
            goto L_0x0208
        L_0x01f0:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0208
            goto L_0x01ee
        L_0x01f7:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01fe
            goto L_0x01ee
        L_0x01fe:
            r10 = r12
            goto L_0x0208
        L_0x0200:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0207
            goto L_0x01ee
        L_0x0207:
            r10 = r7
        L_0x0208:
            switch(r10) {
                case 0: goto L_0x0226;
                case 1: goto L_0x0223;
                case 2: goto L_0x021d;
                default: goto L_0x020b;
            }
        L_0x020b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            r0.append(r9)
            java.lang.String r9 = " - NOT VERIFIED"
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            goto L_0x0228
        L_0x021d:
            java.lang.String r0 = ">>>> Meta - NOT VERIFIED"
        L_0x021f:
            android.util.Log.i(r5, r0)
            goto L_0x022b
        L_0x0223:
            java.lang.String r0 = ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED"
            goto L_0x021f
        L_0x0226:
            java.lang.String r0 = ">>>> IronSource - NOT VERIFIED"
        L_0x0228:
            android.util.Log.e(r5, r0)
        L_0x022b:
            int r8 = r8 + 1
            goto L_0x0074
        L_0x022f:
            com.ironsource.mediationsdk.integration.IntegrationHelper$a r0 = new com.ironsource.mediationsdk.integration.IntegrationHelper$a
            r0.<init>(r1)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(android.content.Context):void");
    }
}
