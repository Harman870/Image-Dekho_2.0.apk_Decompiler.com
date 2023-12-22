package z;

import android.graphics.Typeface;
import android.util.Log;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import k6.l;
import v0.c;
import z.f;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13107b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13108c;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f13106a = i10;
        this.f13107b = obj;
        this.f13108c = obj2;
    }

    public final void run() {
        switch (this.f13106a) {
            case 0:
                ((f.e) this.f13107b).d((Typeface) this.f13108c);
                return;
            case 1:
                v0.f fVar = (v0.f) this.f13108c;
                c.C0160c cVar = c.f12386a;
                x8.f.f(fVar, "$violation");
                Log.e("FragmentStrictMode", x8.f.j((String) this.f13107b, "Policy violation with PENALTY_DEATH in "), fVar);
                throw fVar;
            case 2:
                Runnable runnable = (Runnable) this.f13107b;
                l.b bVar = (l.b) this.f13108c;
                try {
                    runnable.run();
                    return;
                } catch (Exception e10) {
                    ((l.a) bVar).a(e10);
                    throw e10;
                }
            default:
                LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) this.f13107b;
                AdInfo adInfo = (AdInfo) this.f13108c;
                x8.f.f(levelPlayNativeAd, "this$0");
                LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f4095c;
                if (levelPlayNativeAdListener != null) {
                    levelPlayNativeAdListener.onAdClicked(levelPlayNativeAd, adInfo);
                    return;
                }
                return;
        }
    }
}
