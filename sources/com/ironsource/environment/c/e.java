package com.ironsource.environment.c;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.c.a;
import com.ironsource.environment.c.b;
import com.ironsource.environment.h;
import com.ironsource.environment.k;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    public static void a(Context context) {
        b bVar = b.a.f3719a;
        bVar.getClass();
        if (context != null) {
            try {
                if (!bVar.f3718c.getAndSet(true)) {
                    bVar.b("auid", h.y(context));
                    bVar.b("model", h.g());
                    bVar.b("make", h.h());
                    bVar.b("os", h.i());
                    String e10 = h.e();
                    if (e10 != null) {
                        bVar.b("osv", e10.replaceAll("[^0-9/.]", ""));
                        bVar.b("osvf", e10);
                    }
                    bVar.b("apilvl", String.valueOf(h.f()));
                    String i10 = h.i(context);
                    if (!TextUtils.isEmpty(i10)) {
                        bVar.b("carrier", i10);
                    }
                    String d10 = c.d(context);
                    if (!TextUtils.isEmpty(d10)) {
                        bVar.b("instlr", d10);
                    }
                    String A = h.A(context);
                    if (!TextUtils.isEmpty(A)) {
                        bVar.b("dt", A);
                    }
                    bVar.b("bid", context.getPackageName());
                    bVar.b("mem", String.valueOf(h.d(context)));
                    bVar.b("tkv", "2.0");
                    bVar.b("tsu", Long.valueOf(c.b(context)));
                    bVar.b("tai", Long.valueOf(c.a(context)));
                    bVar.b("apv", c.c(context));
                    bVar.b("ptype", Integer.valueOf(a.AnonymousClass1.f(context)));
                    bVar.b("simop", a.AnonymousClass1.e(context));
                    bVar.b("stid", k.b(context));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        bVar.c(context);
    }

    public static void a(String str, a.C0041a aVar) {
        JSONObject optJSONObject;
        try {
            String name = aVar.name();
            b bVar = b.a.f3719a;
            JSONObject optJSONObject2 = bVar.a(ContextProvider.getInstance().getApplicationContext()).optJSONObject("adunit_data");
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject(name)) != null && optJSONObject.remove(str) != null) {
                bVar.b("adunit_data", optJSONObject2.put(name, optJSONObject));
            }
        } catch (JSONException unused) {
        }
    }

    public static void a(String str, Object obj) {
        b.a.f3719a.b(str, obj);
    }

    public static void a(String str, Object obj, a.C0041a aVar) {
        try {
            String name = aVar.name();
            b bVar = b.a.f3719a;
            JSONObject optJSONObject = bVar.a(ContextProvider.getInstance().getApplicationContext()).optJSONObject("adunit_data");
            if (optJSONObject == null) {
                bVar.b("adunit_data", new JSONObject().put(name, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
            if (optJSONObject2 == null) {
                bVar.b("adunit_data", optJSONObject.put(name, new JSONObject().put(str, obj)));
            } else {
                bVar.b("adunit_data", optJSONObject.put(name, optJSONObject2.put(str, obj)));
            }
        } catch (JSONException unused) {
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        b bVar = b.a.f3719a;
        if (jSONObject != null) {
            try {
                Object obj = bVar.f3716a.get(str);
                if (!(obj instanceof JSONObject)) {
                    bVar.b(str, jSONObject);
                    return;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                bVar.b(str, jSONObject2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(Map<String, Object> map) {
        b bVar = b.a.f3719a;
        if (map != null) {
            try {
                for (String next : map.keySet()) {
                    if (map.containsKey(next)) {
                        bVar.b(next, map.get(next));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
