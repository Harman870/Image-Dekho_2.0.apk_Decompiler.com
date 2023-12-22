package com.ironsource.mediationsdk.testSuite.b;

import com.ironsource.mediationsdk.testSuite.d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4899a = new a();

    private a() {
    }

    public final void a() {
        a(70, (Integer) null, (String) null);
    }

    public final void a(int i10) {
        a(72, Integer.valueOf(i10), (String) null);
    }

    public final void a(int i10, Integer num, String str) {
        JSONArray jSONArray;
        JSONObject a10 = d.a(false);
        if (num != null) {
            a10.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            ConcurrentHashMap<String, List<String>> b10 = d.b();
            if (b10.containsKey("is_test_suite")) {
                jSONArray = new JSONArray(b10.get("is_test_suite"));
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                a10.put("is_test_suite", jSONArray);
            }
        }
        if (str != null) {
            a10.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        d.a(i10, a10);
    }

    public final void b() {
        a(71, (Integer) null, (String) null);
    }
}
