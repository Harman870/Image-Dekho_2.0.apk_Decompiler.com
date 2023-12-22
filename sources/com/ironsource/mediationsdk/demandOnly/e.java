package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p8.g;
import x8.f;
import z5.c;

public interface e {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f4409a;

        public a(String str) {
            f.f(str, "providerName");
            o8.e eVar = new o8.e(IronSourceConstants.EVENTS_PROVIDER, str);
            o8.e[] eVarArr = {eVar, new o8.e(IronSourceConstants.EVENTS_DEMAND_ONLY, 1)};
            LinkedHashMap linkedHashMap = new LinkedHashMap(c.m(2));
            for (int i10 = 0; i10 < 2; i10++) {
                o8.e eVar2 = eVarArr[i10];
                linkedHashMap.put(eVar2.f10603a, eVar2.f10604b);
            }
            this.f4409a = linkedHashMap;
        }

        public final void a(String str, Object obj) {
            f.f(str, "key");
            f.f(obj, "value");
            this.f4409a.put(str, obj);
        }
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final com.ironsource.b.c f4410a;

        /* renamed from: b  reason: collision with root package name */
        public final a f4411b;

        public b(com.ironsource.b.c cVar, a aVar) {
            f.f(cVar, "eventManager");
            f.f(aVar, "eventBaseData");
            this.f4410a = cVar;
            this.f4411b = aVar;
        }

        public final void a(int i10, String str) {
            Map map;
            f.f(str, ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID);
            LinkedHashMap linkedHashMap = this.f4411b.f4409a;
            f.f(linkedHashMap, "<this>");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            linkedHashMap2.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
            int size = linkedHashMap2.size();
            if (size == 0) {
                map = g.f10706a;
            } else if (size != 1) {
                map = new LinkedHashMap(linkedHashMap2);
            } else {
                map = c.s(linkedHashMap2);
            }
            this.f4410a.a(new com.ironsource.environment.c.a(i10, new JSONObject(map)));
        }
    }

    void a(int i10, String str);
}
