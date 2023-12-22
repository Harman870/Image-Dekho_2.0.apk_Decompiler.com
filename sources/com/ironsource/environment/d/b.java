package com.ironsource.environment.d;

import com.ironsource.environment.c.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import x8.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f3722a = new ArrayList<>(new a().f3721a);

    /* renamed from: b  reason: collision with root package name */
    public final c f3723b = new c();

    public final JSONObject a() {
        JSONObject a10 = this.f3723b.a((List<String>) this.f3722a);
        f.e(a10, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return a10;
    }
}
