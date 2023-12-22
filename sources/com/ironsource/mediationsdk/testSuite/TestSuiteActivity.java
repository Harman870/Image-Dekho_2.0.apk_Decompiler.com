package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.i;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.testSuite.c.a;
import com.ironsource.mediationsdk.testSuite.e.b;
import java.util.LinkedHashMap;
import java.util.Map;
import x8.f;

public final class TestSuiteActivity extends Activity implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f4887d = 0;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f4888a;

    /* renamed from: b  reason: collision with root package name */
    public b f4889b;

    /* renamed from: c  reason: collision with root package name */
    public com.ironsource.mediationsdk.testSuite.a.a f4890c;

    public final void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public final View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f4888a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f.k("mContainer");
        throw null;
    }

    public final void onBackPressed() {
    }

    public final void onClosed() {
        runOnUiThread(new a5.a(1, this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout
            r6.<init>(r5)
            r5.f4888a = r6
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r5.setContentView(r6, r0)
            com.ironsource.mediationsdk.testSuite.e.b r6 = new com.ironsource.mediationsdk.testSuite.e.b
            android.content.Intent r0 = r5.getIntent()
            r2 = 0
            if (r0 == 0) goto L_0x004c
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x004c
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0037
            java.lang.String r3 = "dataString"
            java.lang.String r0 = r0.getString(r3)
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            if (r0 == 0) goto L_0x0043
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r3 = 0
            goto L_0x0044
        L_0x0043:
            r3 = 1
        L_0x0044:
            if (r3 != 0) goto L_0x004c
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r0)
            goto L_0x0051
        L_0x004c:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L_0x0051:
            android.content.Intent r0 = r5.getIntent()
            if (r0 == 0) goto L_0x0072
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0072
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0072
            java.lang.String r4 = "controllerUrl"
            java.lang.String r0 = r0.getString(r4)
            goto L_0x0073
        L_0x0072:
            r0 = r2
        L_0x0073:
            r6.<init>(r5, r5, r3, r0)
            r5.f4889b = r6
            com.ironsource.mediationsdk.testSuite.a.a r0 = new com.ironsource.mediationsdk.testSuite.a.a
            r0.<init>(r6)
            r5.f4890c = r0
            com.ironsource.mediationsdk.testSuite.d r6 = com.ironsource.mediationsdk.testSuite.d.f4903a
            com.ironsource.mediationsdk.testSuite.a.a$a r6 = new com.ironsource.mediationsdk.testSuite.a.a$a
            r6.<init>(r0)
            com.ironsource.mediationsdk.testSuite.d.a((com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener) r6)
            com.ironsource.mediationsdk.testSuite.a.a$b r6 = new com.ironsource.mediationsdk.testSuite.a.a$b
            r6.<init>(r0)
            com.ironsource.mediationsdk.testSuite.d.a((com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener) r6)
            com.ironsource.mediationsdk.testSuite.a.a$c r6 = new com.ironsource.mediationsdk.testSuite.a.a$c
            r6.<init>(r0)
            com.ironsource.mediationsdk.testSuite.d.a((com.ironsource.mediationsdk.sdk.LevelPlayBannerListener) r6)
            android.widget.RelativeLayout r6 = r5.f4888a
            if (r6 == 0) goto L_0x00b2
            com.ironsource.mediationsdk.testSuite.e.b r0 = r5.f4889b
            if (r0 == 0) goto L_0x00ac
            android.webkit.WebView r0 = r0.f4909b
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r1, r1)
            r6.addView(r0, r2)
            return
        L_0x00ac:
            java.lang.String r6 = "mWebViewWrapper"
            x8.f.k(r6)
            throw r2
        L_0x00b2:
            java.lang.String r6 = "mContainer"
            x8.f.k(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.testSuite.TestSuiteActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        if (this.f4890c != null) {
            d.a((LevelPlayInterstitialListener) null);
            d.a((LevelPlayRewardedVideoBaseListener) null);
            d.a((LevelPlayBannerListener) null);
            d.e();
            RelativeLayout relativeLayout = this.f4888a;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                b bVar = this.f4889b;
                if (bVar != null) {
                    bVar.a();
                    bVar.f4910c.destroy();
                    super.onDestroy();
                    return;
                }
                f.k("mWebViewWrapper");
                throw null;
            }
            f.k("mContainer");
            throw null;
        }
        f.k("mNativeBridge");
        throw null;
    }

    public final void onUIReady() {
        runOnUiThread(new i(7, this));
    }
}
