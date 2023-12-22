package e2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o1.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6177a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6178b = new HashMap();

    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f6179a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f6180b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, R> f6181c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f6179a = cls;
            this.f6180b = cls2;
            this.f6181c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f6177a.contains(str)) {
            this.f6177a.add(str);
        }
        list = (List) this.f6178b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f6178b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z9;
        arrayList = new ArrayList();
        Iterator it = this.f6177a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f6178b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (!aVar.f6179a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f6180b)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9 && !arrayList.contains(aVar.f6180b)) {
                        arrayList.add(aVar.f6180b);
                    }
                }
            }
        }
        return arrayList;
    }
}
