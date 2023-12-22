package s6;

import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f11885a;

    public /* synthetic */ c(f fVar) {
        this.f11885a = fVar;
    }

    public final Object call() {
        f fVar = this.f11885a;
        synchronized (fVar) {
            fVar.f11889a.get().h(System.currentTimeMillis(), fVar.f11891c.get().a());
        }
        return null;
    }
}
