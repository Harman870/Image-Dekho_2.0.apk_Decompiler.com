package c2;

import java.util.ArrayList;
import java.util.Iterator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2375a = new ArrayList();

    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f2376a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f2377b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Z, R> f2378c;

        public a(Class<Z> cls, Class<R> cls2, d<Z, R> dVar) {
            this.f2376a = cls;
            this.f2377b = cls2;
            this.f2378c = dVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f2375a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!aVar.f2376a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f2377b)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 && !arrayList.contains(aVar.f2377b)) {
                arrayList.add(aVar.f2377b);
            }
        }
        return arrayList;
    }
}
