package h7;

import e7.t;
import e7.u;
import g7.l;
import java.util.ArrayList;
import k7.b;
import o.g;

public final class h extends t<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6952b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final e7.h f6953a;

    public static class a implements u {
        public final <T> t<T> b(e7.h hVar, j7.a<T> aVar) {
            if (aVar.f8776a == Object.class) {
                return new h(hVar);
            }
            return null;
        }
    }

    public h(e7.h hVar) {
        this.f6953a = hVar;
    }

    public final Object a(k7.a aVar) {
        int b10 = g.b(aVar.W());
        if (b10 == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.A()) {
                arrayList.add(a(aVar));
            }
            aVar.s();
            return arrayList;
        } else if (b10 == 2) {
            l lVar = new l();
            aVar.c();
            while (aVar.A()) {
                lVar.put(aVar.Q(), a(aVar));
            }
            aVar.t();
            return lVar;
        } else if (b10 == 5) {
            return aVar.U();
        } else {
            if (b10 == 6) {
                return Double.valueOf(aVar.N());
            }
            if (b10 == 7) {
                return Boolean.valueOf(aVar.M());
            }
            if (b10 == 8) {
                aVar.S();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public final void b(b bVar, Object obj) {
        if (obj == null) {
            bVar.v();
            return;
        }
        e7.h hVar = this.f6953a;
        Class<?> cls = obj.getClass();
        hVar.getClass();
        t b10 = hVar.b(new j7.a(cls));
        if (b10 instanceof h) {
            bVar.j();
            bVar.t();
            return;
        }
        b10.b(bVar, obj);
    }
}
