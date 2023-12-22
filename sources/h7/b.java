package h7;

import e7.h;
import e7.t;
import e7.u;
import g7.c;
import g7.m;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashSet;

public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final c f6931a;

    public static final class a<E> extends t<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final n f6932a;

        /* renamed from: b  reason: collision with root package name */
        public final m<? extends Collection<E>> f6933b;

        public a(h hVar, Type type, t<E> tVar, m<? extends Collection<E>> mVar) {
            this.f6932a = new n(hVar, tVar, type);
            this.f6933b = mVar;
        }

        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            Collection collection = (Collection) this.f6933b.j();
            aVar.a();
            while (aVar.A()) {
                collection.add(this.f6932a.a(aVar));
            }
            aVar.s();
            return collection;
        }

        public final void b(k7.b bVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                bVar.v();
                return;
            }
            bVar.c();
            for (Object b10 : collection) {
                this.f6932a.b(bVar, b10);
            }
            bVar.s();
        }
    }

    public b(c cVar) {
        this.f6931a = cVar;
    }

    public final <T> t<T> b(h hVar, j7.a<T> aVar) {
        Type type;
        Type type2 = aVar.f8777b;
        Class<? super T> cls = aVar.f8776a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Class<Collection> cls2 = Collection.class;
        c6.b.m(cls2.isAssignableFrom(cls));
        Type f10 = g7.a.f(type2, cls, g7.a.d(type2, cls, cls2), new HashSet());
        if (f10 instanceof WildcardType) {
            f10 = ((WildcardType) f10).getUpperBounds()[0];
        }
        if (f10 instanceof ParameterizedType) {
            type = ((ParameterizedType) f10).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new a(hVar, type, hVar.b(new j7.a(type)), this.f6931a.a(aVar));
    }
}
