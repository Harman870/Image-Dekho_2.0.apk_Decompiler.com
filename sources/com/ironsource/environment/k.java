package com.ironsource.environment;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3753a = new a();

    public static class a extends ArrayList<String> {
        public a() {
            add("com.google.market");
            add("com.android.vending");
        }
    }

    public static class b extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ boolean f3754a;

        public b(boolean z9) {
            this.f3754a = z9;
            put("isInstalled", this.f3754a);
        }
    }

    public enum c {
        ;
        

        /* renamed from: c  reason: collision with root package name */
        public static final HashMap f3755c = null;

        /* renamed from: a  reason: collision with root package name */
        public final int f3757a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f3758b;

        /* access modifiers changed from: public */
        static {
            f3755c = new HashMap();
            for (c cVar : values()) {
                for (String put : cVar.f3758b) {
                    f3755c.put(put, cVar);
                }
            }
        }

        /* access modifiers changed from: public */
        c(int i10, String[] strArr) {
            this.f3757a = i10;
            this.f3758b = strArr;
        }
    }

    public static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            List<ApplicationInfo> p5 = h.p(context);
            ArrayList arrayList2 = new ArrayList();
            for (ApplicationInfo next : p5) {
                if (next != null) {
                    arrayList2.add(next.packageName.toLowerCase());
                }
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next2 = it.next();
                jSONObject.put(next2, new b(arrayList2.contains(next2.trim().toLowerCase())));
            }
        } catch (Exception unused) {
            Log.d("k", "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    public static boolean a(Context context) {
        JSONObject a10 = a(context, f3753a);
        Iterator<String> keys = a10.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a10.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    public static Integer b(Context context) {
        HashMap hashMap = c.f3755c;
        JSONObject a10 = a(context, new ArrayList(c.f3755c.keySet()));
        int i10 = 0;
        for (c cVar : c.values()) {
            String[] strArr = cVar.f3758b;
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    JSONObject optJSONObject = a10.optJSONObject(strArr[i11]);
                    if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                        i10 = (int) (Math.pow(2.0d, (double) (cVar.f3757a - 1)) + ((double) i10));
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
        }
        return Integer.valueOf(i10);
    }
}
