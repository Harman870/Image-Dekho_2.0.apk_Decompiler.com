package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f3568a;

    public c(a aVar) {
        this.f3568a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.ironsrc.internal.c c10 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c10 != null) {
            Collection<a> a10 = c10.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a10.size() * 2) + 3);
            for (a c11 : a10) {
                View c12 = c11.c();
                if (c12 != null && h.e(c12) && (rootView = c12.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c13 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c13) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public JSONObject a(View view) {
        JSONObject a10 = com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.ironsrc.utils.c.a(a10, e.a());
        return a10;
    }

    public void a(View view, JSONObject jSONObject, a.C0034a aVar, boolean z9, boolean z10) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            aVar.a(it.next(), this.f3568a, jSONObject, z10);
        }
    }
}
