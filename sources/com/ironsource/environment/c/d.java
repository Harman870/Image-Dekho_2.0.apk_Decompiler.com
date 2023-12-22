package com.ironsource.environment.c;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class d {
    static {
        new d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.HashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap<java.lang.String, java.lang.Object> a(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r7) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x000d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof org.json.JSONObject
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r1.getValue()
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.util.Iterator r4 = r2.keys()
        L_0x0030:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.opt(r5)
            r3.put(r5, r6)
            goto L_0x0030
        L_0x0044:
            java.lang.Object r1 = r1.getKey()
            r0.put(r1, r3)
            goto L_0x000d
        L_0x004c:
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof org.json.JSONArray
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r1.getValue()
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r4 = 0
        L_0x0060:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x0044
            java.lang.Object r5 = r2.opt(r4)
            r3.put(r5)
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0070:
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof java.util.Map
            if (r2 == 0) goto L_0x009f
            java.lang.Object r2 = r1.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x008b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            r3.put(r5, r6)
            goto L_0x008b
        L_0x009f:
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L_0x000d
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.c.d.a(java.util.concurrent.ConcurrentHashMap):java.util.HashMap");
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }
}
