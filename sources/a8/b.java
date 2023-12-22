package a8;

import com.ironsource.adapters.ironsource.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.h;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.k.f;
import com.ironsource.sdk.k.g;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

public final /* synthetic */ class b implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f213a;

    public /* synthetic */ b(f fVar) {
        this.f213a = fVar;
    }

    public final void onReceive(h.a aVar) {
        String str;
        String str2;
        f fVar = this.f213a;
        x8.f.f(fVar, "this$0");
        x8.f.f(aVar, "it");
        JSONObject jSONObject = aVar.f5468a;
        if (jSONObject == null) {
            str = fVar.f5724e;
            str2 = "failed to handle click on native ad: missing params";
        } else if (!jSONObject.optBoolean("success", false)) {
            String optString = aVar.f5468a.optString(IronSourceConstants.EVENTS_ERROR_REASON, "unexpected error");
            String str3 = fVar.f5724e;
            str2 = a.j("failed to handle click on native ad: ", optString);
            str = str3;
        } else {
            g.a aVar2 = fVar.f5725f;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        Logger.i(str, str2);
    }
}
