package com.ironsource.mediationsdk.d;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: c  reason: collision with root package name */
    public static c f4375c;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<ImpressionDataListener> f4376a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<String, List<String>> f4377b = new ConcurrentHashMap<>();

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f4375c == null) {
                f4375c = new c();
            }
            cVar = f4375c;
        }
        return cVar;
    }

    public static List<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, b(jSONObject.get(next)));
            } catch (JSONException e10) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", new Object[]{next, e10.getMessage()}));
            }
        }
        return hashMap;
    }

    public static JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), c(next.getValue()));
                } catch (JSONException unused) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", new Object[]{next.getKey(), next.getValue()}));
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < 2; i10++) {
            JSONObject jSONObject2 = jSONObjectArr[i10];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e10) {
                        IronLog.INTERNAL.error(e10.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static Object b(Object obj) {
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(b(jSONArray.get(i10)));
            } catch (JSONException e10) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", new Object[]{e10.getMessage()}));
            }
        }
        return arrayList;
    }

    public static Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? new JSONObject((Map) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj instanceof Enum ? obj.toString() : obj.getClass().getPackage().getName().startsWith("java.") ? obj.toString() : obj;
            }
            return new JSONArray(Arrays.asList(new Object[]{obj}));
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f4376a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f4377b.put(str, list);
    }

    public HashSet<ImpressionDataListener> b() {
        return this.f4376a;
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f4376a.remove(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f4377b;
    }
}
