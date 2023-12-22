package com.ironsource.mediationsdk.testSuite.e;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.testSuite.c;
import com.ironsource.mediationsdk.testSuite.c.b;
import com.ironsource.mediationsdk.testSuite.d;
import x8.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ironsource.mediationsdk.testSuite.a f4905a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4906b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ironsource.mediationsdk.testSuite.c.a f4907c;

    public a(com.ironsource.mediationsdk.testSuite.a aVar, com.ironsource.mediationsdk.testSuite.c.a aVar2, b bVar) {
        f.f(aVar, "adsManager");
        f.f(aVar2, "uiLifeCycleListener");
        f.f(bVar, "javaScriptEvaluator");
        this.f4905a = aVar;
        this.f4906b = bVar;
        this.f4907c = aVar2;
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d10) {
        this.f4905a.a(d10);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f4907c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f4905a.a();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        boolean g10 = d.g();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        com.ironsource.mediationsdk.testSuite.d.a aVar = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
        this.f4906b.a("isInterstitialReady", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(Boolean.valueOf(g10)));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        boolean i10 = d.i();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        com.ironsource.mediationsdk.testSuite.d.a aVar = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
        this.f4906b.a("isRewardedVideoReady", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(Boolean.valueOf(i10)));
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, boolean z9, boolean z10, String str2, int i10, int i11) {
        f.f(str, ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK);
        f.f(str2, "description");
        this.f4905a.a(new c(str, z9, Boolean.valueOf(z10)), str2, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, boolean z9, boolean z10) {
        f.f(str, ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK);
        c cVar = new c(str, z9, Boolean.valueOf(z10));
        d dVar = d.f4903a;
        d.a(IronSource.AD_UNIT.INTERSTITIAL, cVar);
        d.f();
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, boolean z9, boolean z10) {
        f.f(str, ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK);
        c cVar = new c(str, z9, Boolean.valueOf(z10));
        d dVar = d.f4903a;
        d.a(IronSource.AD_UNIT.REWARDED_VIDEO, cVar);
        d.h();
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f4907c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        com.ironsource.mediationsdk.testSuite.a aVar = this.f4905a;
        d dVar = d.f4903a;
        d.a((Activity) aVar.f4891a.get());
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        com.ironsource.mediationsdk.testSuite.a aVar = this.f4905a;
        d dVar = d.f4903a;
        d.b((Activity) aVar.f4891a.get());
    }
}
