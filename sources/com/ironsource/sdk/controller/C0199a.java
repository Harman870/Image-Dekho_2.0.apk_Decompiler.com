package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.sdk.b.a;
import com.ironsource.sdk.c.e;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.a  reason: case insensitive filesystem */
public final class C0199a implements a {

    /* renamed from: a  reason: collision with root package name */
    public C f5368a;

    /* renamed from: b  reason: collision with root package name */
    public e f5369b = e.a();

    /* renamed from: c  reason: collision with root package name */
    public Context f5370c;

    public C0199a(Context context) {
        this.f5370c = context;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r17, com.ironsource.sdk.controller.A.d.a r18) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "adViewId"
            org.json.JSONObject r0 = new org.json.JSONObject
            r3 = r17
            r0.<init>(r3)
            java.lang.String r3 = "functionName"
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r4 = "functionParams"
            org.json.JSONObject r4 = r0.optJSONObject(r4)
            java.lang.String r5 = "success"
            java.lang.String r5 = r0.optString(r5)
            java.lang.String r6 = "fail"
            java.lang.String r6 = r0.optString(r6)
            com.ironsource.sdk.g.f r7 = new com.ironsource.sdk.g.f
            r7.<init>()
            int r0 = r3.hashCode()     // Catch:{ Exception -> 0x01ec }
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            switch(r0) {
                case -1384357108: goto L_0x005c;
                case 691453791: goto L_0x0052;
                case 842351363: goto L_0x0048;
                case 1182065477: goto L_0x003e;
                case 1491535759: goto L_0x0034;
                default: goto L_0x0033;
            }     // Catch:{ Exception -> 0x01ec }
        L_0x0033:
            goto L_0x0066
        L_0x0034:
            java.lang.String r0 = "webviewAction"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0066
            r0 = r9
            goto L_0x0067
        L_0x003e:
            java.lang.String r0 = "handleGetViewVisibility"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0066
            r0 = r10
            goto L_0x0067
        L_0x0048:
            java.lang.String r0 = "loadWithUrl"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0066
            r0 = 0
            goto L_0x0067
        L_0x0052:
            java.lang.String r0 = "sendMessage"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0066
            r0 = r12
            goto L_0x0067
        L_0x005c:
            java.lang.String r0 = "removeAdView"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0066
            r0 = r11
            goto L_0x0067
        L_0x0066:
            r0 = -1
        L_0x0067:
            java.lang.String r13 = "adViewId is empty"
            if (r0 == 0) goto L_0x018c
            java.lang.String r14 = "collection does not contain adViewId"
            if (r0 == r12) goto L_0x0144
            java.lang.String r15 = "removeAdView fail - collection does not contain adViewId"
            java.lang.String r8 = "removeAdView fail - adViewId is empty"
            if (r0 == r11) goto L_0x0106
            if (r0 == r10) goto L_0x00cd
            if (r0 != r9) goto L_0x00bc
            com.ironsource.sdk.c.e r0 = r1.f5369b     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = r4.getString(r2)     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r3.isEmpty()     // Catch:{ Exception -> 0x01ec }
            if (r8 != 0) goto L_0x00af
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r8 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r8.containsKey(r3)     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x00a2
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r0 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.c.f r0 = (com.ironsource.sdk.c.f) r0     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "actionName"
            java.lang.String r3 = r4.getString(r3)     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0209
            r0.a((java.lang.String) r3, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x01ec }
            goto L_0x0209
        L_0x00a2:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "performWebViewAction fail - collection does not contain adViewId"
            com.ironsource.sdk.utils.Logger.i(r0, r3)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r14)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x00af:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "performWebViewAction fail - adViewId is empty"
            com.ironsource.sdk.utils.Logger.i(r0, r3)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r13)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x00bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01ec }
            java.lang.String r5 = "%s | unsupported AdViews API"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01ec }
            r9 = 0
            r8[r9] = r3     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = java.lang.String.format(r5, r8)     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r3)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x00cd:
            com.ironsource.sdk.c.e r0 = r1.f5369b     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = r4.getString(r2)     // Catch:{ Exception -> 0x01ec }
            boolean r9 = r3.isEmpty()     // Catch:{ Exception -> 0x01ec }
            if (r9 != 0) goto L_0x00fb
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r8 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r8.containsKey(r3)     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x00f0
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r0 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.c.f r0 = (com.ironsource.sdk.c.f) r0     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0209
            r0.a((org.json.JSONObject) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x01ec }
            goto L_0x0209
        L_0x00f0:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.utils.Logger.i(r0, r15)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r14)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x00fb:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.utils.Logger.i(r0, r8)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r13)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x0106:
            com.ironsource.sdk.c.e r0 = r1.f5369b     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = r4.getString(r2)     // Catch:{ Exception -> 0x01ec }
            boolean r9 = r3.isEmpty()     // Catch:{ Exception -> 0x01ec }
            if (r9 != 0) goto L_0x0139
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r8 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r8.containsKey(r3)     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x012e
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r8 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.c.f r8 = (com.ironsource.sdk.c.f) r8     // Catch:{ Exception -> 0x01ec }
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r0 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            r0.remove(r3)     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x0209
            r8.a(r5, r6)     // Catch:{ Exception -> 0x01ec }
            goto L_0x0209
        L_0x012e:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.utils.Logger.i(r0, r15)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r14)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x0139:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.utils.Logger.i(r0, r8)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r13)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x0144:
            com.ironsource.sdk.c.e r0 = r1.f5369b     // Catch:{ Exception -> 0x01ec }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ec }
            java.lang.String r8 = "params"
            java.lang.String r8 = r4.getString(r8)     // Catch:{ Exception -> 0x01ec }
            r3.<init>(r8)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r3.isEmpty()     // Catch:{ Exception -> 0x01ec }
            if (r8 != 0) goto L_0x017f
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r8 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r8.containsKey(r3)     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x0172
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r0 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.c.f r0 = (com.ironsource.sdk.c.f) r0     // Catch:{ Exception -> 0x01ec }
            if (r0 == 0) goto L_0x0209
            r0.b(r4, r5, r6)     // Catch:{ Exception -> 0x01ec }
            goto L_0x0209
        L_0x0172:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "sendMessageToAd fail - collection does not contain adViewId"
            com.ironsource.sdk.utils.Logger.i(r0, r3)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r14)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x017f:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "sendMessageToAd fail - adViewId is empty"
            com.ironsource.sdk.utils.Logger.i(r0, r3)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r13)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x018c:
            com.ironsource.sdk.c.e r0 = r1.f5369b     // Catch:{ Exception -> 0x01ec }
            android.content.Context r3 = r1.f5370c     // Catch:{ Exception -> 0x01ec }
            java.lang.String r8 = r4.getString(r2)     // Catch:{ Exception -> 0x01ec }
            boolean r9 = r8.isEmpty()     // Catch:{ Exception -> 0x01ec }
            if (r9 != 0) goto L_0x01df
            com.ironsource.sdk.a r9 = r0.c(r4)     // Catch:{ Exception -> 0x01ec }
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r10 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            boolean r10 = r10.containsKey(r8)     // Catch:{ Exception -> 0x01ec }
            if (r10 != 0) goto L_0x01d0
            com.ironsource.sdk.c.d r10 = new com.ironsource.sdk.c.d     // Catch:{ Exception -> 0x01ec }
            r10.<init>(r1, r3, r8, r9)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r9 = com.ironsource.sdk.utils.IronSourceStorageUtils.getNetworkStorageDir(r3)     // Catch:{ Exception -> 0x01ec }
            r10.f5158a = r9     // Catch:{ Exception -> 0x01ec }
            com.ironsource.environment.thread.a r9 = com.ironsource.environment.thread.a.f3770a     // Catch:{ Exception -> 0x01ec }
            com.ironsource.sdk.c.d$1 r11 = new com.ironsource.sdk.c.d$1     // Catch:{ Exception -> 0x01ec }
            r11.<init>(r6, r4, r5)     // Catch:{ Exception -> 0x01ec }
            r9.a(r11)     // Catch:{ Exception -> 0x01ec }
            boolean r5 = com.ironsource.sdk.c.e.b(r4)     // Catch:{ Exception -> 0x01ec }
            if (r5 == 0) goto L_0x01ca
            com.ironsource.sdk.c.e$1 r5 = new com.ironsource.sdk.c.e$1     // Catch:{ Exception -> 0x01ec }
            r5.<init>(r10, r3, r8)     // Catch:{ Exception -> 0x01ec }
            r9.a(r5)     // Catch:{ Exception -> 0x01ec }
            return
        L_0x01ca:
            java.util.Map<java.lang.String, com.ironsource.sdk.c.f> r0 = r0.f5175b     // Catch:{ Exception -> 0x01ec }
            r0.put(r8, r10)     // Catch:{ Exception -> 0x01ec }
            goto L_0x0209
        L_0x01d0:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "sendMessageToAd fail - collection already contain adViewId"
            com.ironsource.sdk.utils.Logger.i(r0, r3)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "collection already contain adViewId"
            r0.<init>(r3)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x01df:
            java.lang.String r0 = com.ironsource.sdk.c.e.f5173a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "loadWithUrl fail - adViewId is empty"
            com.ironsource.sdk.utils.Logger.i(r0, r3)     // Catch:{ Exception -> 0x01ec }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01ec }
            r0.<init>(r13)     // Catch:{ Exception -> 0x01ec }
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x01ec:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "errMsg"
            r7.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r0 = com.ironsource.sdk.c.e.a((org.json.JSONObject) r4)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0203
            r7.a((java.lang.String) r2, (java.lang.String) r0)
        L_0x0203:
            r2 = r18
            r3 = 0
            r2.a((boolean) r3, (java.lang.String) r6, (com.ironsource.sdk.g.f) r7)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C0199a.a(java.lang.String, com.ironsource.sdk.controller.A$d$a):void");
    }

    public final void a(String str, String str2, String str3) {
        a(str, a.AnonymousClass1.b(str2, str3));
    }

    public final void a(String str, JSONObject jSONObject) {
        if (this.f5368a != null && !TextUtils.isEmpty(str)) {
            this.f5368a.a(str, jSONObject);
        }
    }
}
