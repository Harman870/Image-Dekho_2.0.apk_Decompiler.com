package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.demandOnly.l;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class m extends l.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4450a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyInterstitialListener f4451b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f4450a = str;
            this.f4451b = iSDemandOnlyInterstitialListener;
        }

        public final void run() {
            l.a.a(this.f4450a, "onInterstitialAdReady()");
            this.f4451b.onInterstitialAdReady(this.f4450a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4452a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4453b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyInterstitialListener f4454c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f4452a = str;
            this.f4453b = ironSourceError;
            this.f4454c = iSDemandOnlyInterstitialListener;
        }

        public final void run() {
            String str = this.f4452a;
            l.a.a(str, "onInterstitialAdLoadFailed() error = " + this.f4453b.getErrorMessage());
            this.f4454c.onInterstitialAdLoadFailed(this.f4452a, this.f4453b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4455a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyInterstitialListener f4456b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f4455a = str;
            this.f4456b = iSDemandOnlyInterstitialListener;
        }

        public final void run() {
            l.a.a(this.f4455a, "onInterstitialAdOpened()");
            this.f4456b.onInterstitialAdOpened(this.f4455a);
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4457a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4458b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyInterstitialListener f4459c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f4457a = str;
            this.f4458b = ironSourceError;
            this.f4459c = iSDemandOnlyInterstitialListener;
        }

        public final void run() {
            String str = this.f4457a;
            l.a.a(str, "onInterstitialAdShowFailed()  error = " + this.f4458b.getErrorMessage());
            this.f4459c.onInterstitialAdShowFailed(this.f4457a, this.f4458b);
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4460a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyInterstitialListener f4461b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f4460a = str;
            this.f4461b = iSDemandOnlyInterstitialListener;
        }

        public final void run() {
            l.a.a(this.f4460a, "onInterstitialAdClicked()");
            this.f4461b.onInterstitialAdClicked(this.f4460a);
        }
    }

    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4462a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyInterstitialListener f4463b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f4462a = str;
            this.f4463b = iSDemandOnlyInterstitialListener;
        }

        public final void run() {
            l.a.a(this.f4462a, "onInterstitialAdClosed()");
            this.f4463b.onInterstitialAdClosed(this.f4462a);
        }
    }

    public m() {
    }

    public m(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        a(iSDemandOnlyInterstitialListener);
    }

    public final void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) a();
        l.a.a((Runnable) new e(str, iSDemandOnlyInterstitialListener), iSDemandOnlyInterstitialListener != null);
    }

    public final void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) a();
        l.a.a((Runnable) new f(str, iSDemandOnlyInterstitialListener), iSDemandOnlyInterstitialListener != null);
    }

    public final void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) a();
        l.a.a((Runnable) new b(str, ironSourceError, iSDemandOnlyInterstitialListener), iSDemandOnlyInterstitialListener != null);
    }

    public final void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) a();
        l.a.a((Runnable) new c(str, iSDemandOnlyInterstitialListener), iSDemandOnlyInterstitialListener != null);
    }

    public final void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) a();
        l.a.a((Runnable) new a(str, iSDemandOnlyInterstitialListener), iSDemandOnlyInterstitialListener != null);
    }

    public final void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = (ISDemandOnlyInterstitialListener) a();
        l.a.a((Runnable) new d(str, ironSourceError, iSDemandOnlyInterstitialListener), iSDemandOnlyInterstitialListener != null);
    }
}
