package q8;

import q8.f;
import q8.f.b;
import w8.l;

public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: a  reason: collision with root package name */
    public final l<f.b, E> f11367a;

    /* renamed from: b  reason: collision with root package name */
    public final f.c<?> f11368b;

    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        x8.f.f(cVar, "baseKey");
        x8.f.f(lVar, "safeCast");
        this.f11367a = lVar;
        this.f11368b = cVar instanceof b ? ((b) cVar).f11368b : cVar;
    }

    public final E a(f.b bVar) {
        x8.f.f(bVar, "element");
        return (f.b) this.f11367a.invoke(bVar);
    }
}
