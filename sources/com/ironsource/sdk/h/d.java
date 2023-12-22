package com.ironsource.sdk.h;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f5667a;

    public d(String str) {
        this.f5667a = str;
    }

    public final synchronized JSONObject a() {
        return new JSONObject(IronSourceStorageUtils.readFile(c()));
    }

    public final synchronized boolean a(String str) {
        JSONObject a10 = a();
        if (!a10.has(str)) {
            return true;
        }
        a10.remove(str);
        return b(a10);
    }

    public final boolean a(ArrayList<c> arrayList) {
        Iterator<c> it = arrayList.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z9 = false;
            }
        }
        return z9;
    }

    public final synchronized boolean b(String str, JSONObject jSONObject) {
        JSONObject a10;
        a10 = a();
        JSONObject optJSONObject = a10.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            a10.putOpt(str, jSONObject);
        }
        return b(a10);
    }

    public final boolean b(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), c().getPath()) != 0;
    }

    public final c c() {
        c cVar = new c(this.f5667a, "metadata.json");
        if (!cVar.exists()) {
            IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), cVar.getPath());
        }
        return cVar;
    }
}
