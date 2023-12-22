package com.ironsource.mediationsdk.testSuite;

import android.content.Context;
import android.content.Intent;
import com.ironsource.environment.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o8.e;
import org.json.JSONArray;
import org.json.JSONObject;
import x8.f;

public final class b {
    public final void a(Context context, String str, JSONObject jSONObject, String str2, String str3, Boolean bool, boolean z9) {
        JSONObject jSONObject2;
        Context context2 = context;
        String str4 = str;
        JSONObject jSONObject3 = jSONObject;
        String str5 = str2;
        f.f(context2, "context");
        f.f(str4, "appKey");
        f.f(jSONObject3, "initResponse");
        f.f(str5, "sdkVersion");
        f.f(str3, "testSuiteControllerUrl");
        String a10 = d.a(context);
        String d10 = c.d(context2, d.a(context));
        String c10 = c.c(context2, d.a(context));
        JSONObject a11 = d.a();
        JSONObject c11 = d.c();
        JSONObject jSONObject4 = new JSONObject();
        for (Iterator<Map.Entry<String, List<String>>> it = d.b().entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry next = it.next();
            jSONObject4.putOpt((String) next.getKey(), new JSONArray((List) next.getValue()));
            String str6 = str3;
        }
        e[] eVarArr = {new e("deviceOS", "Android"), new e("appKey", str4), new e("sdkVersion", str5), new e("bundleId", a10), new e("appName", d10), new e("appVersion", c10), new e("initResponse", jSONObject3), new e("isRvManual", Boolean.valueOf(z9)), new e("generalProperties", a11), new e("adaptersVersion", c11), new e("metaData", jSONObject4), new e("gdprConsent", bool)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(z5.c.m(12));
        for (int i10 = 0; i10 < 12; i10++) {
            e eVar = eVarArr[i10];
            linkedHashMap.put(eVar.f10603a, eVar.f10604b);
        }
        jSONObject2 = new JSONObject(linkedHashMap);
        String jSONObject5 = jSONObject2.toString();
        f.e(jSONObject5, "JSONObject(mapOf(\n      …ent\n        )).toString()");
        Context context3 = context;
        Intent intent = new Intent(context3, TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("dataString", jSONObject5);
        intent.putExtra("controllerUrl", str3);
        context3.startActivity(intent);
    }
}
