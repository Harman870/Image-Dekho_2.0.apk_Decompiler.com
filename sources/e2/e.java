package e2;

import java.util.ArrayList;
import o1.k;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6182a = new ArrayList();

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f6183a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f6184b;

        public a(Class<T> cls, k<T> kVar) {
            this.f6183a = cls;
            this.f6184b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f6182a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f6182a.get(i10);
            if (aVar.f6183a.isAssignableFrom(cls)) {
                return aVar.f6184b;
            }
        }
        return null;
    }
}
