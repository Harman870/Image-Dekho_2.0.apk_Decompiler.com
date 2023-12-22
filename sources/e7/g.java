package e7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import k7.a;
import k7.b;

public final class g extends t<AtomicLongArray> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f6201a;

    public g(t tVar) {
        this.f6201a = tVar;
    }

    public final Object a(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.A()) {
            arrayList.add(Long.valueOf(((Number) this.f6201a.a(aVar)).longValue()));
        }
        aVar.s();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
        }
        return atomicLongArray;
    }

    public final void b(b bVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        bVar.c();
        int length = atomicLongArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.f6201a.b(bVar, Long.valueOf(atomicLongArray.get(i10)));
        }
        bVar.s();
    }
}
