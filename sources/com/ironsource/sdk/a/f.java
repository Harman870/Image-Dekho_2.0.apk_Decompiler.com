package com.ironsource.sdk.a;

import android.util.Log;
import com.ironsource.a.a;
import com.ironsource.a.b;
import com.ironsource.sdk.a.h;
import java.util.HashMap;
import java.util.Map;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static f f5092b;

    /* renamed from: a  reason: collision with root package name */
    public b f5093a;

    private f() {
    }

    public static void a(a aVar, d dVar) {
        if (aVar != null) {
            try {
                if (f5092b == null) {
                    f5092b = new f();
                }
                f5092b.f5093a = new b(aVar, dVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(h.a aVar) {
        a(aVar, (Map<String, Object>) new HashMap());
    }

    public static void a(h.a aVar, Map<String, Object> map) {
        if (f5092b == null) {
            f5092b = new f();
        }
        b bVar = f5092b.f5093a;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f5126b));
        }
        bVar.a(aVar.f5125a, map);
    }
}
