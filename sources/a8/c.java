package a8;

import android.app.Activity;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.k.f;

public final /* synthetic */ class c implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f215b;

    public /* synthetic */ c(f fVar, Activity activity) {
        this.f214a = fVar;
        this.f215b = activity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: android.webkit.WebView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: android.webkit.WebView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: android.webkit.WebView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(com.ironsource.sdk.controller.h.a r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            com.ironsource.sdk.k.f r2 = r0.f214a
            android.app.Activity r3 = r0.f215b
            java.lang.String r4 = "this$0"
            x8.f.f(r2, r4)
            java.lang.String r4 = "$activity"
            x8.f.f(r3, r4)
            java.lang.String r4 = "it"
            x8.f.f(r1, r4)
            org.json.JSONObject r4 = r1.f5468a
            if (r4 != 0) goto L_0x0022
            com.ironsource.sdk.k.g$a r1 = r2.f5725f
            if (r1 == 0) goto L_0x022a
            java.lang.String r2 = "failed to load native ad: missing params"
            goto L_0x0041
        L_0x0022:
            java.lang.String r5 = "success"
            r6 = 0
            boolean r4 = r4.optBoolean(r5, r6)
            if (r4 != 0) goto L_0x0046
            org.json.JSONObject r1 = r1.f5468a
            java.lang.String r3 = "reason"
            java.lang.String r4 = "failed to load native ad: unexpected error"
            java.lang.String r1 = r1.optString(r3, r4)
            com.ironsource.sdk.k.g$a r2 = r2.f5725f
            if (r2 == 0) goto L_0x022a
            x8.f.e(r1, r3)
            r20 = r2
            r2 = r1
            r1 = r20
        L_0x0041:
            r1.a((java.lang.String) r2)
            goto L_0x022a
        L_0x0046:
            com.ironsource.sdk.k.c$a r4 = new com.ironsource.sdk.k.c$a
            com.ironsource.sdk.utils.a.d r5 = r2.f5722c
            com.ironsource.sdk.c.a r7 = r2.f5723d
            r4.<init>(r5, r7)
            org.json.JSONObject r1 = r1.f5468a
            java.lang.String r5 = "json"
            x8.f.f(r1, r5)
            java.lang.String r5 = "title"
            org.json.JSONObject r7 = r1.optJSONObject(r5)
            java.lang.String r8 = "text"
            if (r7 == 0) goto L_0x0066
            java.lang.String r7 = com.ironsource.environment.l.a.a((org.json.JSONObject) r7, (java.lang.String) r8)
            r11 = r7
            goto L_0x0067
        L_0x0066:
            r11 = 0
        L_0x0067:
            java.lang.String r7 = "advertiser"
            org.json.JSONObject r10 = r1.optJSONObject(r7)
            if (r10 == 0) goto L_0x0075
            java.lang.String r10 = com.ironsource.environment.l.a.a((org.json.JSONObject) r10, (java.lang.String) r8)
            r12 = r10
            goto L_0x0076
        L_0x0075:
            r12 = 0
        L_0x0076:
            java.lang.String r15 = "body"
            org.json.JSONObject r10 = r1.optJSONObject(r15)
            if (r10 == 0) goto L_0x0084
            java.lang.String r10 = com.ironsource.environment.l.a.a((org.json.JSONObject) r10, (java.lang.String) r8)
            r13 = r10
            goto L_0x0085
        L_0x0084:
            r13 = 0
        L_0x0085:
            java.lang.String r14 = "cta"
            org.json.JSONObject r10 = r1.optJSONObject(r14)
            if (r10 == 0) goto L_0x0092
            java.lang.String r8 = com.ironsource.environment.l.a.a((org.json.JSONObject) r10, (java.lang.String) r8)
            goto L_0x0093
        L_0x0092:
            r8 = 0
        L_0x0093:
            java.lang.String r10 = "icon"
            org.json.JSONObject r9 = r1.optJSONObject(r10)
            java.lang.String r6 = "url"
            if (r9 == 0) goto L_0x00a2
            java.lang.String r9 = com.ironsource.environment.l.a.a((org.json.JSONObject) r9, (java.lang.String) r6)
            goto L_0x00a3
        L_0x00a2:
            r9 = 0
        L_0x00a3:
            java.lang.String r0 = "media"
            r17 = r10
            org.json.JSONObject r10 = r1.optJSONObject(r0)
            r18 = r14
            if (r10 == 0) goto L_0x00b6
            java.lang.String r14 = "adViewId"
            java.lang.String r10 = com.ironsource.environment.l.a.a((org.json.JSONObject) r10, (java.lang.String) r14)
            goto L_0x00b7
        L_0x00b6:
            r10 = 0
        L_0x00b7:
            java.lang.String r14 = "privacyIcon"
            org.json.JSONObject r1 = r1.optJSONObject(r14)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = com.ironsource.environment.l.a.a((org.json.JSONObject) r1, (java.lang.String) r6)
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r10 != 0) goto L_0x00cb
            r19 = r15
            r6 = 0
            goto L_0x0107
        L_0x00cb:
            com.ironsource.sdk.c.a r6 = r4.f5692b
            com.ironsource.sdk.c.f r6 = r6.a(r10)
            if (r6 == 0) goto L_0x00d8
            android.webkit.WebView r6 = r6.a()
            goto L_0x00d9
        L_0x00d8:
            r6 = 0
        L_0x00d9:
            if (r6 != 0) goto L_0x00ff
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r19 = r15
            java.lang.String r15 = "missing adview for id: '"
            r14.<init>(r15)
            r14.append(r10)
            r10 = 39
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            r6.<init>(r10)
            o8.f$a r6 = c.a.d(r6)
            o8.f r10 = new o8.f
            r10.<init>(r6)
            goto L_0x0106
        L_0x00ff:
            r19 = r15
            o8.f r10 = new o8.f
            r10.<init>(r6)
        L_0x0106:
            r6 = r10
        L_0x0107:
            if (r9 != 0) goto L_0x010b
            r15 = 0
            goto L_0x0117
        L_0x010b:
            com.ironsource.sdk.utils.a.d r10 = r4.f5691a
            java.lang.Object r9 = r10.a(r9)
            o8.f r10 = new o8.f
            r10.<init>(r9)
            r15 = r10
        L_0x0117:
            com.ironsource.sdk.k.h$a r9 = com.ironsource.sdk.k.h.f5726a
            com.ironsource.sdk.utils.a.d r4 = r4.f5691a
            java.lang.String r9 = "imageLoader"
            x8.f.f(r4, r9)
            if (r1 == 0) goto L_0x0139
            java.lang.Object r1 = r4.a(r1)
            boolean r4 = r1 instanceof o8.f.a
            if (r4 == 0) goto L_0x012b
            r1 = 0
        L_0x012b:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            if (r1 == 0) goto L_0x0139
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r3)
            r4.setImageDrawable(r1)
            r1 = r4
            goto L_0x0177
        L_0x0139:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r3)
            java.lang.String r3 = "i"
            r1.setText(r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r4 = 1
            r3.setShape(r4)
            java.lang.String r4 = "#000000"
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColor(r4)
            r1.setBackground(r3)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r1.setAlpha(r3)
            r3 = 21
            r4 = 0
            r1.setPadding(r3, r4, r3, r4)
            java.lang.String r3 = "#FFFFFF"
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setTextColor(r3)
        L_0x0177:
            com.ironsource.sdk.k.c$b$a r3 = new com.ironsource.sdk.k.c$b$a
            r4 = r17
            r10 = r3
            r9 = r18
            r14 = r8
            r8 = r19
            r16 = r6
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            com.ironsource.sdk.k.c$b r1 = new com.ironsource.sdk.k.c$b
            r1.<init>(r3)
            com.ironsource.sdk.k.c$b$a r3 = r1.f5693a
            com.ironsource.sdk.k.c r6 = new com.ironsource.sdk.k.c
            java.lang.String r11 = r3.f5694a
            java.lang.String r12 = r3.f5695b
            java.lang.String r13 = r3.f5696c
            java.lang.String r14 = r3.f5697d
            o8.f<android.graphics.drawable.Drawable> r10 = r3.f5698e
            if (r10 == 0) goto L_0x01a8
            java.lang.Object r10 = r10.f10605a
            boolean r15 = r10 instanceof o8.f.a
            if (r15 == 0) goto L_0x01a4
            r10 = 0
        L_0x01a4:
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r15 = r10
            goto L_0x01a9
        L_0x01a8:
            r15 = 0
        L_0x01a9:
            o8.f<android.webkit.WebView> r10 = r3.f5699f
            if (r10 == 0) goto L_0x01bc
            java.lang.Object r10 = r10.f10605a
            r18 = r0
            boolean r0 = r10 instanceof o8.f.a
            if (r0 == 0) goto L_0x01b6
            r10 = 0
        L_0x01b6:
            r0 = r10
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r16 = r0
            goto L_0x01c0
        L_0x01bc:
            r18 = r0
            r16 = 0
        L_0x01c0:
            android.view.View r0 = r3.f5700g
            r10 = r6
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "nativeAd.loadReport."
            r0.<init>(r3)
            java.lang.String r3 = r2.f5720a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.ironsource.sdk.controller.h$b r3 = new com.ironsource.sdk.controller.h$b
            java.lang.String r10 = r2.f5720a
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            com.ironsource.sdk.k.c$b$a r12 = r1.f5693a
            java.lang.String r12 = r12.f5694a
            if (r12 == 0) goto L_0x01ea
            com.ironsource.sdk.k.c.b.a(r11, r5)
        L_0x01ea:
            com.ironsource.sdk.k.c$b$a r5 = r1.f5693a
            java.lang.String r5 = r5.f5695b
            if (r5 == 0) goto L_0x01f3
            com.ironsource.sdk.k.c.b.a(r11, r7)
        L_0x01f3:
            com.ironsource.sdk.k.c$b$a r5 = r1.f5693a
            java.lang.String r5 = r5.f5696c
            if (r5 == 0) goto L_0x01fc
            com.ironsource.sdk.k.c.b.a(r11, r8)
        L_0x01fc:
            com.ironsource.sdk.k.c$b$a r5 = r1.f5693a
            java.lang.String r5 = r5.f5697d
            if (r5 == 0) goto L_0x0205
            com.ironsource.sdk.k.c.b.a(r11, r9)
        L_0x0205:
            com.ironsource.sdk.k.c$b$a r5 = r1.f5693a
            o8.f<android.graphics.drawable.Drawable> r5 = r5.f5698e
            if (r5 == 0) goto L_0x0210
            java.lang.Object r5 = r5.f10605a
            com.ironsource.sdk.k.c.b.b(r11, r4, r5)
        L_0x0210:
            com.ironsource.sdk.k.c$b$a r1 = r1.f5693a
            o8.f<android.webkit.WebView> r1 = r1.f5699f
            if (r1 == 0) goto L_0x021d
            java.lang.Object r1 = r1.f10605a
            r4 = r18
            com.ironsource.sdk.k.c.b.b(r11, r4, r1)
        L_0x021d:
            r3.<init>(r10, r0, r11)
            com.ironsource.sdk.controller.g r0 = r2.f5721b
            a8.f r1 = new a8.f
            r1.<init>(r2, r6)
            r0.a((com.ironsource.sdk.controller.h.b) r3, (com.ironsource.sdk.controller.n.a) r1)
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c.onReceive(com.ironsource.sdk.controller.h$a):void");
    }
}
