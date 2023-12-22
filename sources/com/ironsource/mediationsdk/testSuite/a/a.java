package com.ironsource.mediationsdk.testSuite.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.testSuite.d;
import x8.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ironsource.mediationsdk.testSuite.c.b f4895a;

    /* renamed from: com.ironsource.mediationsdk.testSuite.a.a$a  reason: collision with other inner class name */
    public static final class C0057a implements LevelPlayInterstitialListener {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ a f4896a;

        public C0057a(a aVar) {
            this.f4896a = aVar;
        }

        public final void onAdClicked(AdInfo adInfo) {
            this.f4896a.f4895a.a("onAdClicked", IronSource.AD_UNIT.INTERSTITIAL, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdClosed(AdInfo adInfo) {
            this.f4896a.f4895a.a("onAdClosed", IronSource.AD_UNIT.INTERSTITIAL, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdLoadFailed(IronSourceError ironSourceError) {
            a aVar = this.f4896a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            com.ironsource.mediationsdk.testSuite.d.a aVar2 = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            aVar.f4895a.a("onAdLoadFailed", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(objArr));
        }

        public final void onAdOpened(AdInfo adInfo) {
            this.f4896a.f4895a.a("onAdOpened", IronSource.AD_UNIT.INTERSTITIAL, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdReady(AdInfo adInfo) {
            this.f4896a.f4895a.a("onAdReady", IronSource.AD_UNIT.INTERSTITIAL, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            a aVar = this.f4896a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            com.ironsource.mediationsdk.testSuite.d.a aVar2 = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
            Object[] objArr = new Object[2];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            objArr[1] = adInfo;
            aVar.f4895a.a("onAdShowFailed", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(objArr));
        }

        public final void onAdShowSucceeded(AdInfo adInfo) {
            this.f4896a.f4895a.a("onAdShowSucceeded", IronSource.AD_UNIT.INTERSTITIAL, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }
    }

    public static final class b implements LevelPlayRewardedVideoListener, LevelPlayRewardedVideoManualListener {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ a f4897a;

        public b(a aVar) {
            this.f4897a = aVar;
        }

        public final void onAdAvailable(AdInfo adInfo) {
            this.f4897a.f4895a.a("onAdAvailable", IronSource.AD_UNIT.REWARDED_VIDEO, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdClicked(Placement placement, AdInfo adInfo) {
            a aVar = this.f4897a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            com.ironsource.mediationsdk.testSuite.d.a aVar2 = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
            aVar.f4895a.a("onAdClicked", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(d.a(placement), adInfo));
        }

        public final void onAdClosed(AdInfo adInfo) {
            this.f4897a.f4895a.a("onAdClosed", IronSource.AD_UNIT.REWARDED_VIDEO, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdLoadFailed(IronSourceError ironSourceError) {
            a aVar = this.f4897a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            com.ironsource.mediationsdk.testSuite.d.a aVar2 = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            aVar.f4895a.a("onAdLoadFailed", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(objArr));
        }

        public final void onAdOpened(AdInfo adInfo) {
            this.f4897a.f4895a.a("onAdOpened", IronSource.AD_UNIT.REWARDED_VIDEO, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdReady(AdInfo adInfo) {
            this.f4897a.f4895a.a("onAdReady", IronSource.AD_UNIT.REWARDED_VIDEO, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdRewarded(Placement placement, AdInfo adInfo) {
            a aVar = this.f4897a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            com.ironsource.mediationsdk.testSuite.d.a aVar2 = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
            aVar.f4895a.a("onAdRewarded", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(d.a(placement), adInfo));
        }

        public final void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            a aVar = this.f4897a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            com.ironsource.mediationsdk.testSuite.d.a aVar2 = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
            Object[] objArr = new Object[2];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            objArr[1] = adInfo;
            aVar.f4895a.a("onAdShowFailed", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(objArr));
        }

        public final void onAdUnavailable() {
            this.f4897a.f4895a.a("onAdUnavailable", IronSource.AD_UNIT.REWARDED_VIDEO, com.ironsource.mediationsdk.testSuite.d.a.a(new Object[0]));
        }
    }

    public static final class c implements LevelPlayBannerListener {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ a f4898a;

        public c(a aVar) {
            this.f4898a = aVar;
        }

        public final void onAdClicked(AdInfo adInfo) {
            this.f4898a.f4895a.a("onAdClicked", IronSource.AD_UNIT.BANNER, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdLeftApplication(AdInfo adInfo) {
            this.f4898a.f4895a.a("onAdLeftApplication", IronSource.AD_UNIT.BANNER, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdLoadFailed(IronSourceError ironSourceError) {
            a aVar = this.f4898a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            com.ironsource.mediationsdk.testSuite.d.a aVar2 = com.ironsource.mediationsdk.testSuite.d.a.f4904a;
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            aVar.f4895a.a("onAdLoadFailed", ad_unit, com.ironsource.mediationsdk.testSuite.d.a.a(objArr));
        }

        public final void onAdLoaded(AdInfo adInfo) {
            this.f4898a.f4895a.a("onAdLoaded", IronSource.AD_UNIT.BANNER, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdScreenDismissed(AdInfo adInfo) {
            this.f4898a.f4895a.a("onAdScreenDismissed", IronSource.AD_UNIT.BANNER, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }

        public final void onAdScreenPresented(AdInfo adInfo) {
            this.f4898a.f4895a.a("onAdScreenPresented", IronSource.AD_UNIT.BANNER, com.ironsource.mediationsdk.testSuite.d.a.a(adInfo));
        }
    }

    public a(com.ironsource.mediationsdk.testSuite.c.b bVar) {
        f.f(bVar, "javaScriptEvaluator");
        this.f4895a = bVar;
    }
}
