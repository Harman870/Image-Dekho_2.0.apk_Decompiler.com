package v0;

import android.webkit.WebView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.Callable;
import k6.l;
import n.a;
import v0.c;
import x8.f;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12384b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f12385c;

    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        this.f12383a = i10;
        this.f12384b = obj;
        this.f12385c = obj2;
    }

    public final void run() {
        switch (this.f12383a) {
            case 0:
                c.C0160c cVar = (c.C0160c) this.f12384b;
                f.f(cVar, "$policy");
                f.f((f) this.f12385c, "$violation");
                cVar.getClass();
                throw null;
            case 1:
                Callable callable = (Callable) this.f12384b;
                l.b bVar = (l.b) this.f12385c;
                try {
                    Object call = callable.call();
                    l lVar = l.this;
                    lVar.getClass();
                    if (call == null) {
                        call = a.f9457g;
                    }
                    if (a.f9456f.b(lVar, (Object) null, call)) {
                        a.c(lVar);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ((l.a) bVar).a(e10);
                    return;
                }
            case 2:
                LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) this.f12384b;
                IronSourceError ironSourceError = (IronSourceError) this.f12385c;
                f.f(levelPlayNativeAd, "this$0");
                LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f4095c;
                if (levelPlayNativeAdListener != null) {
                    levelPlayNativeAdListener.onAdLoadFailed(levelPlayNativeAd, ironSourceError);
                    return;
                }
                return;
            default:
                com.ironsource.mediationsdk.testSuite.e.b bVar2 = (com.ironsource.mediationsdk.testSuite.e.b) this.f12384b;
                String str = (String) this.f12385c;
                f.f(bVar2, "this$0");
                f.f(str, "$script");
                WebView webView = bVar2.f4910c;
                webView.loadUrl("javascript:" + str);
                return;
        }
    }
}
