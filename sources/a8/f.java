package a8;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.h;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.k.c;
import com.ironsource.sdk.k.g;
import org.json.JSONObject;

public final /* synthetic */ class f implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.ironsource.sdk.k.f f218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f219b;

    public /* synthetic */ f(com.ironsource.sdk.k.f fVar, c cVar) {
        this.f218a = fVar;
        this.f219b = cVar;
    }

    public final void onReceive(h.a aVar) {
        g.a aVar2;
        String str;
        com.ironsource.sdk.k.f fVar = this.f218a;
        c cVar = this.f219b;
        x8.f.f(fVar, "this$0");
        x8.f.f(cVar, "$adData");
        x8.f.f(aVar, "it");
        JSONObject jSONObject = aVar.f5468a;
        if (jSONObject == null) {
            aVar2 = fVar.f5725f;
            if (aVar2 != null) {
                str = "failed to load native ad: missing report params";
            } else {
                return;
            }
        } else if (!jSONObject.optBoolean("success", false)) {
            String optString = aVar.f5468a.optString(IronSourceConstants.EVENTS_ERROR_REASON, "failed to load native ad: unexpected error");
            g.a aVar3 = fVar.f5725f;
            if (aVar3 != null) {
                x8.f.e(optString, IronSourceConstants.EVENTS_ERROR_REASON);
                g.a aVar4 = aVar3;
                str = optString;
                aVar2 = aVar4;
            } else {
                return;
            }
        } else {
            g.a aVar5 = fVar.f5725f;
            if (aVar5 != null) {
                aVar5.a(cVar);
                return;
            }
            return;
        }
        aVar2.a(str);
    }
}
