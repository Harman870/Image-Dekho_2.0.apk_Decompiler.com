package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.C0182e;
import org.json.JSONObject;
import x8.f;

public final class k implements l<String, C0182e.a> {
    public final /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        f.f(str, "input");
        C0182e.a();
        C0182e.a a10 = C0182e.a(new JSONObject(str));
        f.e(a10, "getInstance().getAuction…sponse(JSONObject(input))");
        return a10;
    }
}
