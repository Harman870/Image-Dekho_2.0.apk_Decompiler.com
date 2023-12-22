package p8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import x8.f;

public class d extends c {
    public static final void v(Iterable iterable, AbstractCollection abstractCollection) {
        f.f(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static final <T> List<T> w(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        Object obj;
        f.f(iterable, "<this>");
        boolean z9 = iterable instanceof Collection;
        if (z9) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return f.f10705a;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            List<T> singletonList = Collections.singletonList(obj);
            f.e(singletonList, "singletonList(element)");
            return singletonList;
        }
        if (z9) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            v(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return f.f10705a;
        }
        if (size2 != 1) {
            return arrayList;
        }
        List<T> singletonList2 = Collections.singletonList(arrayList.get(0));
        f.e(singletonList2, "singletonList(element)");
        return singletonList2;
    }
}
