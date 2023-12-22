package com.ironsource.environment.b;

import com.ironsource.environment.c.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import x8.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f3702a = new ArrayList<>(new a().f3701a);

    /* renamed from: b  reason: collision with root package name */
    public final c f3703b = new c();

    public final JSONObject a() {
        JSONObject a10 = this.f3703b.a((List<String>) this.f3702a);
        f.e(a10, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a10;
    }
}
