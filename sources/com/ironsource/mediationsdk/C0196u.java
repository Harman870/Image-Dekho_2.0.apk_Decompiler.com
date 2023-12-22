package com.ironsource.mediationsdk;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* renamed from: com.ironsource.mediationsdk.u  reason: case insensitive filesystem */
public final class C0196u extends com.ironsource.mediationsdk.sdk.a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0196u f4918h = new C0196u();

    /* renamed from: e  reason: collision with root package name */
    public InterstitialListener f4919e = null;

    /* renamed from: f  reason: collision with root package name */
    public LevelPlayInterstitialListener f4920f;

    /* renamed from: g  reason: collision with root package name */
    public LevelPlayInterstitialListener f4921g;

    /* renamed from: com.ironsource.mediationsdk.u$a */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4922a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4923b;

        public a(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f4922a = ironSourceError;
            this.f4923b = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4920f;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowFailed(this.f4922a, uVar.f(this.f4923b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + C0196u.this.f(this.f4923b) + ", error = " + this.f4922a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$b */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4925a;

        public b(AdInfo adInfo) {
            this.f4925a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4921g;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClicked(uVar.f(this.f4925a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + C0196u.this.f(this.f4925a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$c */
    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            InterstitialListener interstitialListener = C0196u.this.f4919e;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdReady();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$d */
    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            InterstitialListener interstitialListener = C0196u.this.f4919e;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdClicked();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$e */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4929a;

        public e(AdInfo adInfo) {
            this.f4929a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4920f;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClicked(uVar.f(this.f4929a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + C0196u.this.f(this.f4929a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$f */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4931a;

        public f(AdInfo adInfo) {
            this.f4931a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4920f;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdReady(uVar.f(this.f4931a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + C0196u.this.f(this.f4931a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$g */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4933a;

        public g(IronSourceError ironSourceError) {
            this.f4933a = ironSourceError;
        }

        public final void run() {
            LevelPlayInterstitialListener levelPlayInterstitialListener = C0196u.this.f4921g;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdLoadFailed(this.f4933a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f4933a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$h */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4935a;

        public h(IronSourceError ironSourceError) {
            this.f4935a = ironSourceError;
        }

        public final void run() {
            InterstitialListener interstitialListener = C0196u.this.f4919e;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdLoadFailed(this.f4935a);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + this.f4935a.getErrorMessage(), 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$i */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4937a;

        public i(IronSourceError ironSourceError) {
            this.f4937a = ironSourceError;
        }

        public final void run() {
            LevelPlayInterstitialListener levelPlayInterstitialListener = C0196u.this.f4920f;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdLoadFailed(this.f4937a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f4937a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$j */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4939a;

        public j(AdInfo adInfo) {
            this.f4939a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4921g;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdOpened(uVar.f(this.f4939a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + C0196u.this.f(this.f4939a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$k */
    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4941a;

        public k(AdInfo adInfo) {
            this.f4941a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4921g;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdReady(uVar.f(this.f4941a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + C0196u.this.f(this.f4941a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$l */
    public class l implements Runnable {
        public l() {
        }

        public final void run() {
            InterstitialListener interstitialListener = C0196u.this.f4919e;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdOpened();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$m */
    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4944a;

        public m(AdInfo adInfo) {
            this.f4944a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4920f;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdOpened(uVar.f(this.f4944a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + C0196u.this.f(this.f4944a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$n */
    public class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4946a;

        public n(AdInfo adInfo) {
            this.f4946a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4921g;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClosed(uVar.f(this.f4946a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + C0196u.this.f(this.f4946a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$o */
    public class o implements Runnable {
        public o() {
        }

        public final void run() {
            InterstitialListener interstitialListener = C0196u.this.f4919e;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdClosed();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$p */
    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4949a;

        public p(AdInfo adInfo) {
            this.f4949a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4920f;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdClosed(uVar.f(this.f4949a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + C0196u.this.f(this.f4949a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$q */
    public class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4951a;

        public q(AdInfo adInfo) {
            this.f4951a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4921g;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowSucceeded(uVar.f(this.f4951a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowSucceeded() adInfo = " + C0196u.this.f(this.f4951a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$r */
    public class r implements Runnable {
        public r() {
        }

        public final void run() {
            InterstitialListener interstitialListener = C0196u.this.f4919e;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdShowSucceeded();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$s */
    public class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4954a;

        public s(AdInfo adInfo) {
            this.f4954a = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4920f;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowSucceeded(uVar.f(this.f4954a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowSucceeded() adInfo = " + C0196u.this.f(this.f4954a));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$t */
    public class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4956a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4957b;

        public t(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f4956a = ironSourceError;
            this.f4957b = adInfo;
        }

        public final void run() {
            C0196u uVar = C0196u.this;
            LevelPlayInterstitialListener levelPlayInterstitialListener = uVar.f4921g;
            if (levelPlayInterstitialListener != null) {
                levelPlayInterstitialListener.onAdShowFailed(this.f4956a, uVar.f(this.f4957b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + C0196u.this.f(this.f4957b) + ", error = " + this.f4956a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.u$u  reason: collision with other inner class name */
    public class C0059u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4959a;

        public C0059u(IronSourceError ironSourceError) {
            this.f4959a = ironSourceError;
        }

        public final void run() {
            InterstitialListener interstitialListener = C0196u.this.f4919e;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdShowFailed(this.f4959a);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + this.f4959a.getErrorMessage(), 1);
            }
        }
    }

    private C0196u() {
    }

    public static synchronized C0196u a() {
        C0196u uVar;
        synchronized (C0196u.class) {
            uVar = f4918h;
        }
        return uVar;
    }

    public final void a(AdInfo adInfo) {
        if (this.f4921g != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
            return;
        }
        if (this.f4919e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c());
        }
        if (this.f4920f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError) {
        if (this.f4921g != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
            return;
        }
        if (this.f4919e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        }
        if (this.f4920f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f4921g != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new t(ironSourceError, adInfo));
            return;
        }
        if (this.f4919e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new C0059u(ironSourceError));
        }
        if (this.f4920f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ironSourceError, adInfo));
        }
    }

    public final synchronized void a(InterstitialListener interstitialListener) {
        this.f4919e = interstitialListener;
    }

    public final synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f4920f = levelPlayInterstitialListener;
    }

    public final void b(AdInfo adInfo) {
        if (this.f4921g != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
            return;
        }
        if (this.f4919e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l());
        }
        if (this.f4920f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public final synchronized void b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f4921g = levelPlayInterstitialListener;
    }

    public final void c(AdInfo adInfo) {
        if (this.f4921g != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
            return;
        }
        if (this.f4919e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o());
        }
        if (this.f4920f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(adInfo));
        }
    }

    public final void d(AdInfo adInfo) {
        if (this.f4921g != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q(adInfo));
            return;
        }
        if (this.f4919e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r());
        }
        if (this.f4920f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new s(adInfo));
        }
    }

    public final void e(AdInfo adInfo) {
        if (this.f4921g != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
            return;
        }
        if (this.f4919e != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d());
        }
        if (this.f4920f != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }
}
