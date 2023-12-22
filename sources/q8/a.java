package q8;

import q8.f;
import w8.p;

public abstract class a implements f.b {
    private final f.c<?> key;

    public a(f.c<?> cVar) {
        x8.f.f(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r4, p<? super R, ? super f.b, ? extends R> pVar) {
        x8.f.f(pVar, "operation");
        return pVar.a(r4, this);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.b(this, cVar);
    }

    public f.c<?> getKey() {
        return this.key;
    }

    public f minusKey(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    public f plus(f fVar) {
        x8.f.f(fVar, "context");
        return f.a.a(this, fVar);
    }
}
