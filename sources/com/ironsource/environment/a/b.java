package com.ironsource.environment.a;

import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c.a;
import com.ironsource.environment.c.c;
import com.ironsource.environment.c.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import x8.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a.C0041a f3698a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f3699b = new ArrayList<>(new a().f3696a);

    /* renamed from: c  reason: collision with root package name */
    public final c f3700c = new c();

    public b(a.C0041a aVar) {
        this.f3698a = aVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        a.C0041a aVar = this.f3698a;
        if (aVar != null) {
            c cVar = this.f3700c;
            ArrayList<String> arrayList = this.f3699b;
            jSONObject = c.a(cVar.a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) arrayList.toArray(new String[arrayList.size()]));
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = this.f3700c.a((List<String>) this.f3699b);
            f.e(jSONObject, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        JSONObject a10 = d.a(jSONObject.optJSONObject("md"));
        if (a10 != null) {
            jSONObject.put("md", a10);
        }
        return jSONObject;
    }
}
