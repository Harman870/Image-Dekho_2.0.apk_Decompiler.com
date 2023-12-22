package c9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p8.f;

public final class c extends e {
    public static final List a0(b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object add : bVar) {
            arrayList.add(add);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f.f10705a;
        }
        if (size != 1) {
            return arrayList;
        }
        List singletonList = Collections.singletonList(arrayList.get(0));
        x8.f.e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
