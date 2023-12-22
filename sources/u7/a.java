package u7;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.utils.d;
import com.ironsource.mediationsdk.utils.j;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class a implements BiddingDataCallback {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ d f12203a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ BlockingQueue f12204b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ com.ironsource.mediationsdk.bidding.a f12205c;

    public a(com.ironsource.mediationsdk.bidding.a aVar, d dVar, ArrayBlockingQueue arrayBlockingQueue) {
        this.f12205c = aVar;
        this.f12203a = dVar;
        this.f12204b = arrayBlockingQueue;
    }

    public final void onFailure(String str) {
        com.ironsource.mediationsdk.bidding.a aVar = this.f12205c;
        this.f12204b.add(new j(aVar.f4324a, aVar.f4325b, (Map<String, Object>) null, d.a(this.f12203a), str));
    }

    public final void onSuccess(Map<String, Object> map) {
        com.ironsource.mediationsdk.bidding.a aVar = this.f12205c;
        this.f12204b.add(new j(aVar.f4324a, aVar.f4325b, map, d.a(this.f12203a), (String) null));
    }
}
