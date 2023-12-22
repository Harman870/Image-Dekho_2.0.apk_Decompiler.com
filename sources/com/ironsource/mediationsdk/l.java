package com.ironsource.mediationsdk;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

public final class l extends com.ironsource.mediationsdk.sdk.a {

    /* renamed from: g  reason: collision with root package name */
    public static final l f4628g = new l();

    /* renamed from: c  reason: collision with root package name */
    public LevelPlayBannerListener f4629c = null;

    /* renamed from: e  reason: collision with root package name */
    public BannerListener f4630e = null;

    /* renamed from: f  reason: collision with root package name */
    public LevelPlayBannerListener f4631f = null;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4632a;

        public a(AdInfo adInfo) {
            this.f4632a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4631f;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdClicked(lVar.f(this.f4632a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + l.this.f(this.f4632a));
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            BannerListener bannerListener = l.this.f4630e;
            if (bannerListener != null) {
                bannerListener.onBannerAdLoaded();
                IronLog.CALLBACK.info("onBannerAdLoaded()");
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4635a;

        public c(AdInfo adInfo) {
            this.f4635a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4631f;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoaded(lVar.f(this.f4635a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoaded() adInfo = " + l.this.f(this.f4635a));
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4637a;

        public d(IronSourceError ironSourceError) {
            this.f4637a = ironSourceError;
        }

        public final void run() {
            LevelPlayBannerListener levelPlayBannerListener = l.this.f4629c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoadFailed(this.f4637a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f4637a.getErrorMessage());
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4639a;

        public e(IronSourceError ironSourceError) {
            this.f4639a = ironSourceError;
        }

        public final void run() {
            BannerListener bannerListener = l.this.f4630e;
            if (bannerListener != null) {
                bannerListener.onBannerAdLoadFailed(this.f4639a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onBannerAdLoadFailed() error = " + this.f4639a.getErrorMessage());
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4641a;

        public f(IronSourceError ironSourceError) {
            this.f4641a = ironSourceError;
        }

        public final void run() {
            LevelPlayBannerListener levelPlayBannerListener = l.this.f4631f;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoadFailed(this.f4641a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f4641a.getErrorMessage());
            }
        }
    }

    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4643a;

        public g(AdInfo adInfo) {
            this.f4643a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4629c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenPresented(lVar.f(this.f4643a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenPresented() adInfo = " + l.this.f(this.f4643a));
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        public final void run() {
            BannerListener bannerListener = l.this.f4630e;
            if (bannerListener != null) {
                bannerListener.onBannerAdScreenPresented();
                IronLog.CALLBACK.info("onBannerAdScreenPresented()");
            }
        }
    }

    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4646a;

        public i(AdInfo adInfo) {
            this.f4646a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4631f;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenPresented(lVar.f(this.f4646a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenPresented() adInfo = " + l.this.f(this.f4646a));
            }
        }
    }

    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4648a;

        public j(AdInfo adInfo) {
            this.f4648a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4629c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLoaded(lVar.f(this.f4648a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoaded() adInfo = " + l.this.f(this.f4648a));
            }
        }
    }

    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4650a;

        public k(AdInfo adInfo) {
            this.f4650a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4629c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenDismissed(lVar.f(this.f4650a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenDismissed() adInfo = " + l.this.f(this.f4650a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.l$l  reason: collision with other inner class name */
    public class C0054l implements Runnable {
        public C0054l() {
        }

        public final void run() {
            BannerListener bannerListener = l.this.f4630e;
            if (bannerListener != null) {
                bannerListener.onBannerAdScreenDismissed();
                IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
            }
        }
    }

    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4653a;

        public m(AdInfo adInfo) {
            this.f4653a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4631f;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdScreenDismissed(lVar.f(this.f4653a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenDismissed() adInfo = " + l.this.f(this.f4653a));
            }
        }
    }

    public class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4655a;

        public n(AdInfo adInfo) {
            this.f4655a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4629c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLeftApplication(lVar.f(this.f4655a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLeftApplication() adInfo = " + l.this.f(this.f4655a));
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        public final void run() {
            BannerListener bannerListener = l.this.f4630e;
            if (bannerListener != null) {
                bannerListener.onBannerAdLeftApplication();
                IronLog.CALLBACK.info("onBannerAdLeftApplication()");
            }
        }
    }

    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4658a;

        public p(AdInfo adInfo) {
            this.f4658a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4631f;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdLeftApplication(lVar.f(this.f4658a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLeftApplication() adInfo = " + l.this.f(this.f4658a));
            }
        }
    }

    public class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4660a;

        public q(AdInfo adInfo) {
            this.f4660a = adInfo;
        }

        public final void run() {
            l lVar = l.this;
            LevelPlayBannerListener levelPlayBannerListener = lVar.f4629c;
            if (levelPlayBannerListener != null) {
                levelPlayBannerListener.onAdClicked(lVar.f(this.f4660a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + l.this.f(this.f4660a));
            }
        }
    }

    public class r implements Runnable {
        public r() {
        }

        public final void run() {
            BannerListener bannerListener = l.this.f4630e;
            if (bannerListener != null) {
                bannerListener.onBannerAdClicked();
                IronLog.CALLBACK.info("onBannerAdClicked()");
            }
        }
    }

    private l() {
    }

    public static l a() {
        return f4628g;
    }

    public final void a(AdInfo adInfo) {
        if (this.f4629c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
            return;
        }
        if (this.f4630e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h());
        }
        if (this.f4631f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public final void a(AdInfo adInfo, boolean z9) {
        if (this.f4629c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
            return;
        }
        if (this.f4630e != null && !z9) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b());
        }
        if (this.f4631f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError, boolean z9) {
        if (this.f4629c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError));
            return;
        }
        if (this.f4630e != null && !z9) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError));
        }
        if (this.f4631f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        }
    }

    public final void b(AdInfo adInfo) {
        if (this.f4629c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
            return;
        }
        if (this.f4630e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new C0054l());
        }
        if (this.f4631f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public final void c(AdInfo adInfo) {
        if (this.f4629c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
            return;
        }
        if (this.f4630e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o());
        }
        if (this.f4631f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(adInfo));
        }
    }

    public final void d(AdInfo adInfo) {
        if (this.f4629c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q(adInfo));
            return;
        }
        if (this.f4630e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r());
        }
        if (this.f4631f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }
}
