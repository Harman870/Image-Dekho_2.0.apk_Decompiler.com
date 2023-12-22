package u9;

import e9.f;
import j9.d;
import j9.d0;
import javax.annotation.Nullable;

public abstract class k<ResponseT, ReturnT> extends e0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f12281a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f12282b;

    /* renamed from: c  reason: collision with root package name */
    public final f<d0, ResponseT> f12283c;

    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, ReturnT> f12284d;

        public a(a0 a0Var, d.a aVar, f<d0, ResponseT> fVar, c<ResponseT, ReturnT> cVar) {
            super(a0Var, aVar, fVar);
            this.f12284d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            return this.f12284d.a(tVar);
        }
    }

    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f12285d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f12286e = false;

        public b(a0 a0Var, d.a aVar, f fVar, c cVar) {
            super(a0Var, aVar, fVar);
            this.f12285d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            b bVar = (b) this.f12285d.a(tVar);
            q8.d dVar = objArr[objArr.length - 1];
            try {
                if (this.f12286e) {
                    f fVar = new f(z5.c.k(dVar));
                    fVar.n(new n(bVar));
                    bVar.s(new p(fVar));
                    return fVar.m();
                }
                f fVar2 = new f(z5.c.k(dVar));
                fVar2.n(new m(bVar));
                bVar.s(new o(fVar2));
                return fVar2.m();
            } catch (Exception e10) {
                return s.a(e10, dVar);
            }
        }
    }

    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f12287d;

        public c(a0 a0Var, d.a aVar, f<d0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar) {
            super(a0Var, aVar, fVar);
            this.f12287d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            b bVar = (b) this.f12287d.a(tVar);
            q8.d dVar = objArr[objArr.length - 1];
            try {
                f fVar = new f(z5.c.k(dVar));
                fVar.n(new q(bVar));
                bVar.s(new r(fVar));
                return fVar.m();
            } catch (Exception e10) {
                return s.a(e10, dVar);
            }
        }
    }

    public k(a0 a0Var, d.a aVar, f<d0, ResponseT> fVar) {
        this.f12281a = a0Var;
        this.f12282b = aVar;
        this.f12283c = fVar;
    }

    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new t(this.f12281a, objArr, this.f12282b, this.f12283c), objArr);
    }

    @Nullable
    public abstract Object c(t tVar, Object[] objArr);
}
