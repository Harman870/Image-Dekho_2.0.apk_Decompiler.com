package q8;

import java.io.Serializable;
import q8.f;
import w8.p;

public final class g implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final g f11375a = new g();

    public final <R> R fold(R r4, p<? super R, ? super f.b, ? extends R> pVar) {
        x8.f.f(pVar, "operation");
        return r4;
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        x8.f.f(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final f minusKey(f.c<?> cVar) {
        x8.f.f(cVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
