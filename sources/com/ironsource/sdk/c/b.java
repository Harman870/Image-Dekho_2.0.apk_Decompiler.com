package com.ironsource.sdk.c;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

public final class b extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    public d f5153a;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5154a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5155b;

        public a(String str, String str2) {
            this.f5154a = str;
            this.f5155b = str2;
        }

        public final void run() {
            b bVar = b.this;
            bVar.removeView(bVar.f5153a.f5160c);
            b.this.f5153a.a(this.f5154a, this.f5155b);
            b.this.f5153a = null;
        }
    }

    public b(d dVar, Context context) {
        super(context);
        com.ironsource.sdk.a aVar = dVar.f5161d;
        setLayoutParams(new FrameLayout.LayoutParams(aVar.f5083a, aVar.f5084b));
        this.f5153a = dVar;
        addView(dVar.f5160c);
    }

    public final WebView a() {
        return this.f5153a.f5160c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.sdk.c.d r0 = r3.f5153a     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            com.ironsource.sdk.b.b r1 = r0.f5162e     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x002c
            android.webkit.WebView r0 = r0.f5160c     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x000e
            goto L_0x002c
        L_0x000e:
            com.ironsource.sdk.b.a r0 = r1.f5135a     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0020
            com.ironsource.sdk.b.d r0 = r1.f5136b     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0017
            goto L_0x0020
        L_0x0017:
            org.json.JSONObject r0 = r1.a()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "containerWasRemoved"
            r1.a((java.lang.String) r2, (org.json.JSONObject) r0)     // Catch:{ all -> 0x002e }
        L_0x0020:
            com.ironsource.environment.thread.a r0 = com.ironsource.environment.thread.a.f3770a     // Catch:{ all -> 0x002e }
            com.ironsource.sdk.c.b$a r1 = new com.ironsource.sdk.c.b$a     // Catch:{ all -> 0x002e }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x002e }
            r0.a(r1)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.c.b.a(java.lang.String, java.lang.String):void");
    }

    public final void a(String str, String str2, String str3) {
        d dVar = this.f5153a;
        if (dVar != null) {
            dVar.a(str, str2, str3);
        }
    }

    public final void a(JSONObject jSONObject, String str, String str2) {
        this.f5153a.a(jSONObject, str, str2);
    }

    public final void b(JSONObject jSONObject, String str, String str2) {
        this.f5153a.b(jSONObject, str, str2);
    }

    public final void onVisibilityChanged(View view, int i10) {
        Logger.i("IronSourceAdContainer", "onVisibilityChanged: " + i10);
        d dVar = this.f5153a;
        if (dVar != null) {
            try {
                dVar.f5162e.a("isVisible", i10, isShown());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void onWindowVisibilityChanged(int i10) {
        Logger.i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i10);
        d dVar = this.f5153a;
        if (dVar != null) {
            try {
                dVar.f5162e.a("isWindowVisible", i10, isShown());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
