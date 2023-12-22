package a8;

import com.ironsource.adapters.ironsource.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.controller.r;
import com.ironsource.sdk.k.f;
import com.ironsource.sdk.k.g;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

public final /* synthetic */ class d implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f216a;

    public /* synthetic */ d(f fVar) {
        this.f216a = fVar;
    }

    public final void onReceive(r rVar) {
        String str;
        String str2;
        f fVar = this.f216a;
        x8.f.f(fVar, "this$0");
        x8.f.f(rVar, "msg");
        if (x8.f.a(rVar.f5496a, "nativeAd.click")) {
            JSONObject jSONObject = rVar.f5497b;
            if (jSONObject == null) {
                str = fVar.f5724e;
                str2 = "failed to handle click on native ad: missing params";
            } else if (!jSONObject.optBoolean("success", false)) {
                String optString = rVar.f5497b.optString(IronSourceConstants.EVENTS_ERROR_REASON, "unexpected error");
                String str3 = fVar.f5724e;
                str2 = a.j("failed to handle click on native ad: ", optString);
                str = str3;
            } else {
                g.a aVar = fVar.f5725f;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            Logger.i(str, str2);
        }
    }
}
