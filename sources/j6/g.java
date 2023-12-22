package j6;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import java.util.Set;
import u6.a;
import x8.f;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8734c;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f8732a = i10;
        this.f8733b = obj;
        this.f8734c = obj2;
    }

    public final void run() {
        Set set;
        Object obj;
        switch (this.f8732a) {
            case 0:
                r rVar = (r) this.f8733b;
                a aVar = (a) this.f8734c;
                synchronized (rVar) {
                    if (rVar.f8762b == null) {
                        set = rVar.f8761a;
                        obj = aVar;
                    } else {
                        set = rVar.f8762b;
                        obj = aVar.get();
                    }
                    set.add(obj);
                }
                return;
            default:
                LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) this.f8733b;
                AdInfo adInfo = (AdInfo) this.f8734c;
                f.f(levelPlayNativeAd, "this$0");
                LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f4095c;
                if (levelPlayNativeAdListener != null) {
                    levelPlayNativeAdListener.onAdImpression(levelPlayNativeAd, adInfo);
                    return;
                }
                return;
        }
    }
}
