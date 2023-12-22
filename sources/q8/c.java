package q8;

import java.io.Serializable;
import q8.f;
import w8.p;
import x8.g;

public final class c implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f11369a;

    /* renamed from: b  reason: collision with root package name */
    public final f.b f11370b;

    public static final class a extends g implements p<String, f.b, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f11371c = new a();

        public a() {
            super(2);
        }

        public final Object a(Object obj, Object obj2) {
            String str = (String) obj;
            f.b bVar = (f.b) obj2;
            x8.f.f(str, "acc");
            x8.f.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(f.b bVar, f fVar) {
        x8.f.f(fVar, "left");
        x8.f.f(bVar, "element");
        this.f11369a = fVar;
        this.f11370b = bVar;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                f fVar = cVar2.f11369a;
                if (fVar instanceof c) {
                    cVar2 = (c) fVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f11369a;
                if (fVar2 instanceof c) {
                    cVar3 = (c) fVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                f.b bVar = cVar4.f11370b;
                if (x8.f.a(cVar.get(bVar.getKey()), bVar)) {
                    f fVar3 = cVar4.f11369a;
                    if (!(fVar3 instanceof c)) {
                        x8.f.d(fVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.b bVar2 = (f.b) fVar3;
                        z9 = x8.f.a(cVar.get(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar4 = (c) fVar3;
                } else {
                    z9 = false;
                    break;
                }
            }
            if (z9) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final <R> R fold(R r4, p<? super R, ? super f.b, ? extends R> pVar) {
        x8.f.f(pVar, "operation");
        return pVar.a(this.f11369a.fold(r4, pVar), this.f11370b);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        x8.f.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = cVar2.f11370b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar2.f11369a;
            if (!(fVar instanceof c)) {
                return fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final int hashCode() {
        return this.f11370b.hashCode() + this.f11369a.hashCode();
    }

    public final f minusKey(f.c<?> cVar) {
        x8.f.f(cVar, "key");
        if (this.f11370b.get(cVar) != null) {
            return this.f11369a;
        }
        f minusKey = this.f11369a.minusKey(cVar);
        return minusKey == this.f11369a ? this : minusKey == g.f11375a ? this.f11370b : new c(this.f11370b, minusKey);
    }

    public final String toString() {
        return '[' + ((String) fold("", a.f11371c)) + ']';
    }
}
