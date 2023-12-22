package com.ironsource.environment.c;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c.a;
import com.ironsource.environment.c.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class c {
    public static JSONObject a(JSONObject jSONObject, String[] strArr) {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    public JSONObject a(Context context, a.C0041a aVar) {
        String name = aVar.name();
        JSONObject a10 = b.a.f3719a.a(context);
        JSONObject optJSONObject = a10.optJSONObject("adunit_data");
        a10.remove("adunit_data");
        if (!(optJSONObject == null || optJSONObject.optJSONObject(name) == null)) {
            JSONObject jSONObject = optJSONObject.getJSONObject(name);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a10.putOpt(next, jSONObject.opt(next));
            }
        }
        return a10;
    }

    public final JSONObject a(Context context, String[] strArr) {
        JSONObject a10 = b.a.f3719a.a(context);
        a10.remove("adunit_data");
        return a(a10, strArr);
    }

    public final JSONObject a(List<String> list) {
        JSONObject a10 = b.a.f3719a.a(ContextProvider.getInstance().getApplicationContext());
        a10.remove("adunit_data");
        return a(a10, (String[]) list.toArray(new String[list.size()]));
    }

    public final JSONObject a(String[] strArr) {
        JSONObject a10 = b.a.f3719a.a(ContextProvider.getInstance().getApplicationContext());
        a10.remove("adunit_data");
        return a(a10, strArr);
    }
}
