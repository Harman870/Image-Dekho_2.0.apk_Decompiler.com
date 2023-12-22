package h7;

import e7.h;
import e7.t;
import h7.j;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import k7.a;
import k7.b;

public final class n<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h f6979a;

    /* renamed from: b  reason: collision with root package name */
    public final t<T> f6980b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f6981c;

    public n(h hVar, t<T> tVar, Type type) {
        this.f6979a = hVar;
        this.f6980b = tVar;
        this.f6981c = type;
    }

    public final T a(a aVar) {
        return this.f6980b.a(aVar);
    }

    public final void b(b bVar, T t10) {
        t<T> tVar = this.f6980b;
        Type type = this.f6981c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f6981c) {
            tVar = this.f6979a.b(new j7.a(type));
            if (tVar instanceof j.a) {
                t<T> tVar2 = this.f6980b;
                if (!(tVar2 instanceof j.a)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.b(bVar, t10);
    }
}
