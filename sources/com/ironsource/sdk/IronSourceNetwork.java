package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.g;
import com.ironsource.sdk.j.d;
import com.ironsource.sdk.j.e;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class IronSourceNetwork {

    /* renamed from: a  reason: collision with root package name */
    public static e f5080a;

    /* renamed from: b  reason: collision with root package name */
    public static d f5081b;

    /* renamed from: c  reason: collision with root package name */
    public static JSONObject f5082c;

    public static synchronized void a() {
        synchronized (IronSourceNetwork.class) {
            if (f5080a == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }

    public static synchronized void applyConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            e eVar = f5080a;
            if (eVar != null) {
                if (jSONObject != null) {
                    eVar.a(jSONObject);
                }
            }
        }
    }

    public static synchronized void destroyAd(b bVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            f5080a.a(bVar);
        }
    }

    public static synchronized g getControllerManager() {
        g a10;
        synchronized (IronSourceNetwork.class) {
            a10 = f5080a.a();
        }
        return a10;
    }

    public static d getInitListener() {
        return f5081b;
    }

    public static synchronized void getOfferWallCredits(e eVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            f5080a.a(eVar);
        }
    }

    public static synchronized JSONObject getRawToken(Context context) {
        JSONObject b10;
        synchronized (IronSourceNetwork.class) {
            b10 = com.ironsource.sdk.service.d.a().b(context);
        }
        return b10;
    }

    public static synchronized String getToken(Context context) {
        String a10;
        synchronized (IronSourceNetwork.class) {
            a10 = com.ironsource.sdk.service.d.a().a(context);
        }
        return a10;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initOfferWall(Map<String, String> map, e eVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            f5080a.a(map, eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void initSDK(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            java.lang.Class<com.ironsource.sdk.IronSourceNetwork> r0 = com.ironsource.sdk.IronSourceNetwork.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x0012
            java.lang.String r6 = "IronSourceNetwork"
            java.lang.String r7 = "applicationKey is NULL"
            com.ironsource.sdk.utils.Logger.e(r6, r7)     // Catch:{ all -> 0x00be }
            monitor-exit(r0)
            return
        L_0x0012:
            com.ironsource.sdk.e r1 = f5080a     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00bc
            com.ironsource.sdk.utils.SDKUtils.setInitSDKParams(r9)     // Catch:{ all -> 0x00be }
            org.json.JSONObject r1 = com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "events"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0099 }
            if (r1 == 0) goto L_0x00b1
            com.ironsource.a.a$a r2 = new com.ironsource.a.a$a     // Catch:{ Exception -> 0x0099 }
            java.lang.String r3 = "endpoint"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0099 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r3 = "GET"
            r2.f3640c = r3     // Catch:{ Exception -> 0x0099 }
            java.lang.String r3 = "enabled"
            boolean r1 = r1.optBoolean(r3)     // Catch:{ Exception -> 0x0099 }
            r2.f3639b = r1     // Catch:{ Exception -> 0x0099 }
            com.ironsource.sdk.a.e r1 = new com.ironsource.sdk.a.e     // Catch:{ Exception -> 0x0099 }
            r1.<init>()     // Catch:{ Exception -> 0x0099 }
            r2.f3641d = r1     // Catch:{ Exception -> 0x0099 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0099 }
            r1.<init>()     // Catch:{ Exception -> 0x0099 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ Exception -> 0x0099 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r1.add(r3)     // Catch:{ Exception -> 0x0099 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ Exception -> 0x0099 }
            java.lang.String r4 = "charset"
            java.lang.String r5 = "utf-8"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r1.add(r3)     // Catch:{ Exception -> 0x0099 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r2.f3643f     // Catch:{ Exception -> 0x0099 }
            r3.addAll(r1)     // Catch:{ Exception -> 0x0099 }
            r1 = 0
            r2.f3642e = r1     // Catch:{ Exception -> 0x0099 }
            com.ironsource.a.a r3 = new com.ironsource.a.a     // Catch:{ Exception -> 0x0099 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0099 }
            boolean r2 = r3.f3633b     // Catch:{ Exception -> 0x0099 }
            if (r2 == 0) goto L_0x00b1
            com.ironsource.sdk.a.d$a r2 = new com.ironsource.sdk.a.d$a     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            if (r9 == 0) goto L_0x008a
            java.lang.String r4 = "sessionid"
            boolean r4 = r9.containsKey(r4)     // Catch:{ Exception -> 0x0099 }
            if (r4 == 0) goto L_0x008a
            java.lang.String r4 = "sessionid"
            java.lang.Object r9 = r9.get(r4)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0099 }
            r2.f5088a = r9     // Catch:{ Exception -> 0x0099 }
        L_0x008a:
            r2.f5090c = r6     // Catch:{ Exception -> 0x0099 }
            r2.f5091d = r8     // Catch:{ Exception -> 0x0099 }
            r2.f5089b = r7     // Catch:{ Exception -> 0x0099 }
            com.ironsource.sdk.a.d r9 = new com.ironsource.sdk.a.d     // Catch:{ Exception -> 0x0099 }
            r9.<init>(r2, r1)     // Catch:{ Exception -> 0x0099 }
            com.ironsource.sdk.a.f.a((com.ironsource.a.a) r3, (com.ironsource.sdk.a.d) r9)     // Catch:{ Exception -> 0x0099 }
            goto L_0x00b1
        L_0x0099:
            r9 = move-exception
            java.lang.String r1 = "IronSourceNetwork"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "Failed to init event tracker: "
            r2.<init>(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00be }
            r2.append(r9)     // Catch:{ all -> 0x00be }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x00be }
            com.ironsource.sdk.utils.Logger.e(r1, r9)     // Catch:{ all -> 0x00be }
        L_0x00b1:
            com.ironsource.sdk.e r6 = com.ironsource.sdk.d.b.a((java.lang.String) r7, (java.lang.String) r8, (android.content.Context) r6)     // Catch:{ all -> 0x00be }
            f5080a = r6     // Catch:{ all -> 0x00be }
            org.json.JSONObject r6 = f5082c     // Catch:{ all -> 0x00be }
            applyConsentInfo(r6)     // Catch:{ all -> 0x00be }
        L_0x00bc:
            monitor-exit(r0)
            return
        L_0x00be:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.IronSourceNetwork.initSDK(android.content.Context, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static synchronized boolean isAdAvailableForInstance(b bVar) {
        synchronized (IronSourceNetwork.class) {
            e eVar = f5080a;
            if (eVar == null) {
                return false;
            }
            boolean b10 = eVar.b(bVar);
            return b10;
        }
    }

    public static synchronized void loadAd(b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f5080a.a(bVar, map);
        }
    }

    public static synchronized void loadAdView(Activity activity, b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f5080a.a(activity, bVar, map);
        }
    }

    public static void onPause(Activity activity) {
        e eVar = f5080a;
        if (eVar != null) {
            eVar.b(activity);
        }
    }

    public static void onResume(Activity activity) {
        e eVar = f5080a;
        if (eVar != null) {
            eVar.c(activity);
        }
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            e eVar = f5080a;
            if (eVar != null) {
                eVar.a(activity);
            }
        }
    }

    public static synchronized void setInitListener(d dVar) {
        synchronized (IronSourceNetwork.class) {
            f5081b = dVar;
        }
    }

    public static synchronized void showAd(Activity activity, b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f5080a.b(activity, bVar, map);
        }
    }

    public static synchronized void showOfferWall(Activity activity, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f5080a.a(activity, map);
        }
    }

    public static synchronized void updateConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            f5082c = jSONObject;
            applyConsentInfo(jSONObject);
        }
    }

    public static synchronized void updateMetadata(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            com.ironsource.sdk.service.d a10 = com.ironsource.sdk.service.d.a();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a10.a("metadata_" + next, jSONObject.opt(next));
            }
        }
    }
}
