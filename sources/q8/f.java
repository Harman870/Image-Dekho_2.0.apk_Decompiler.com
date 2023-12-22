package q8;

import q8.e;
import w8.p;
import x8.g;

public interface f {

    public static final class a {

        /* renamed from: q8.f$a$a  reason: collision with other inner class name */
        public static final class C0132a extends g implements p<f, b, f> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0132a f11374c = new C0132a();

            public C0132a() {
                super(2);
            }

            public final Object a(Object obj, Object obj2) {
                c cVar;
                f fVar = (f) obj;
                b bVar = (b) obj2;
                x8.f.f(fVar, "acc");
                x8.f.f(bVar, "element");
                f minusKey = fVar.minusKey(bVar.getKey());
                g gVar = g.f11375a;
                if (minusKey == gVar) {
                    return bVar;
                }
                int i10 = e.f11372n0;
                e.a aVar = e.a.f11373a;
                e eVar = (e) minusKey.get(aVar);
                if (eVar == null) {
                    cVar = new c(bVar, minusKey);
                } else {
                    f minusKey2 = minusKey.minusKey(aVar);
                    if (minusKey2 == gVar) {
                        return new c(eVar, bVar);
                    }
                    cVar = new c(eVar, new c(bVar, minusKey2));
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            x8.f.f(fVar2, "context");
            return fVar2 == g.f11375a ? fVar : (f) fVar2.fold(fVar, C0132a.f11374c);
        }
    }

    public interface b extends f {

        public static final class a {
            public static <R> R a(b bVar, R r4, p<? super R, ? super b, ? extends R> pVar) {
                x8.f.f(pVar, "operation");
                return pVar.a(r4, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                x8.f.f(cVar, "key");
                if (x8.f.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f c(b bVar, c<?> cVar) {
                x8.f.f(cVar, "key");
                return x8.f.a(bVar.getKey(), cVar) ? g.f11375a : bVar;
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r4, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);
}
