package com.ironsource.mediationsdk.demandOnly;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final r f4473b = new r();

    /* renamed from: a  reason: collision with root package name */
    public ISDemandOnlyRewardedVideoListener f4474a = null;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4475a;

        public a(String str) {
            this.f4475a = str;
        }

        public final void run() {
            r.this.f4474a.onRewardedVideoAdLoadSuccess(this.f4475a);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadSuccess() instanceId=" + this.f4475a, 1);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4477a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4478b;

        public b(String str, IronSourceError ironSourceError) {
            this.f4477a = str;
            this.f4478b = ironSourceError;
        }

        public final void run() {
            r.this.f4474a.onRewardedVideoAdLoadFailed(this.f4477a, this.f4478b);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() instanceId=" + this.f4477a + "error=" + this.f4478b.getErrorMessage(), 1);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4480a;

        public c(String str) {
            this.f4480a = str;
        }

        public final void run() {
            r.this.f4474a.onRewardedVideoAdOpened(this.f4480a);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened() instanceId=" + this.f4480a, 1);
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4482a;

        public d(String str) {
            this.f4482a = str;
        }

        public final void run() {
            r.this.f4474a.onRewardedVideoAdClosed(this.f4482a);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed() instanceId=" + this.f4482a, 1);
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4484a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4485b;

        public e(String str, IronSourceError ironSourceError) {
            this.f4484a = str;
            this.f4485b = ironSourceError;
        }

        public final void run() {
            r.this.f4474a.onRewardedVideoAdShowFailed(this.f4484a, this.f4485b);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() instanceId=" + this.f4484a + "error=" + this.f4485b.getErrorMessage(), 1);
        }
    }

    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4487a;

        public f(String str) {
            this.f4487a = str;
        }

        public final void run() {
            r.this.f4474a.onRewardedVideoAdClicked(this.f4487a);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked() instanceId=" + this.f4487a, 1);
        }
    }

    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4489a;

        public g(String str) {
            this.f4489a = str;
        }

        public final void run() {
            r.this.f4474a.onRewardedVideoAdRewarded(this.f4489a);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded() instanceId=" + this.f4489a, 1);
        }
    }

    private r() {
    }

    public static r a() {
        return f4473b;
    }

    public final void a(String str, IronSourceError ironSourceError) {
        if (this.f4474a != null) {
            new Handler(Looper.getMainLooper()).post(new b(str, ironSourceError));
        }
    }

    public final void b(String str, IronSourceError ironSourceError) {
        if (this.f4474a != null) {
            new Handler(Looper.getMainLooper()).post(new e(str, ironSourceError));
        }
    }
}
