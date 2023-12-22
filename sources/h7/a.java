package h7;

import e7.h;
import e7.t;
import e7.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import k7.b;

public final class a<E> extends t<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final C0097a f6928c = new C0097a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f6929a;

    /* renamed from: b  reason: collision with root package name */
    public final n f6930b;

    /* renamed from: h7.a$a  reason: collision with other inner class name */
    public static class C0097a implements u {
        public final <T> t<T> b(h hVar, j7.a<T> aVar) {
            Type type;
            Type type2 = aVar.f8777b;
            boolean z9 = type2 instanceof GenericArrayType;
            if (!z9 && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                return null;
            }
            if (z9) {
                type = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                type = ((Class) type2).getComponentType();
            }
            return new a(hVar, hVar.b(new j7.a(type)), g7.a.e(type));
        }
    }

    public a(h hVar, t<E> tVar, Class<E> cls) {
        this.f6930b = new n(hVar, tVar, cls);
        this.f6929a = cls;
    }

    public final Object a(k7.a aVar) {
        if (aVar.W() == 9) {
            aVar.S();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.A()) {
            arrayList.add(this.f6930b.a(aVar));
        }
        aVar.s();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f6929a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public final void b(b bVar, Object obj) {
        if (obj == null) {
            bVar.v();
            return;
        }
        bVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f6930b.b(bVar, Array.get(obj, i10));
        }
        bVar.s();
    }
}
