package z7;

import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.g.d;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ d.e f13231a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f13232b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ A f13233c;

    public a(A a10, d.e eVar, String str) {
        this.f13233c = a10;
        this.f13231a = eVar;
        this.f13232b = str;
    }

    public final void run() {
        d.e eVar = this.f13231a;
        if (eVar == d.e.RewardedVideo || eVar == d.e.f5649c) {
            A a10 = this.f13233c;
            int i10 = A.f5183q0;
            com.ironsource.sdk.j.a.a j10 = a10.j(eVar);
            if (j10 != null) {
                j10.a(this.f13231a, this.f13232b);
            }
        } else if (eVar == d.e.OfferWall) {
            this.f13233c.B.onOWAdClosed();
        }
    }
}
