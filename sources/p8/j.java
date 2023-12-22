package p8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o8.e;
import x8.f;
import z5.c;

public class j extends c {
    public static final void A(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            linkedHashMap.put(eVar.f10603a, eVar.f10604b);
        }
    }

    public static final Map z(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return g.f10706a;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c.m(arrayList.size()));
            A(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        e eVar = (e) arrayList.get(0);
        f.f(eVar, "pair");
        Map singletonMap = Collections.singletonMap(eVar.f10603a, eVar.f10604b);
        f.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }
}
