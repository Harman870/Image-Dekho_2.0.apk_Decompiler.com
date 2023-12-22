package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.demandOnly.l;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class a extends l.a<ISDemandOnlyBannerListener> {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a  reason: collision with other inner class name */
    public class C0051a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4387a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4388b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyBannerListener f4389c;

        public C0051a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f4387a = str;
            this.f4388b = ironSourceError;
            this.f4389c = iSDemandOnlyBannerListener;
        }

        public final void run() {
            String str = this.f4387a;
            l.a.a(str, "onBannerAdLoadFailed() error = " + this.f4388b.getErrorMessage());
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = this.f4389c;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdLoadFailed(this.f4387a, this.f4388b);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4390a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyBannerListener f4391b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f4390a = str;
            this.f4391b = iSDemandOnlyBannerListener;
        }

        public final void run() {
            l.a.a(this.f4390a, "onBannerAdLoaded()");
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = this.f4391b;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdLoaded(this.f4390a);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4392a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyBannerListener f4393b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f4392a = str;
            this.f4393b = iSDemandOnlyBannerListener;
        }

        public final void run() {
            l.a.a(this.f4392a, "onBannerAdShown()");
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = this.f4393b;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdShown(this.f4392a);
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4394a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyBannerListener f4395b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f4394a = str;
            this.f4395b = iSDemandOnlyBannerListener;
        }

        public final void run() {
            l.a.a(this.f4394a, "onBannerAdClicked()");
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = this.f4395b;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdClicked(this.f4394a);
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4396a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ ISDemandOnlyBannerListener f4397b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f4396a = str;
            this.f4397b = iSDemandOnlyBannerListener;
        }

        public final void run() {
            l.a.a(this.f4396a, "onBannerAdLeftApplication()");
            this.f4397b.onBannerAdLeftApplication(this.f4396a);
        }
    }

    public final void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListener = (ISDemandOnlyBannerListener) a();
        l.a.a((Runnable) new C0051a(str, ironSourceError, iSDemandOnlyBannerListener), iSDemandOnlyBannerListener != null);
    }
}
