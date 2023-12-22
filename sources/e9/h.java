package e9;

import h9.c;
import java.util.concurrent.CancellationException;

public final class h extends p0 {

    /* renamed from: e  reason: collision with root package name */
    public final f<?> f6241e;

    public h(f<?> fVar) {
        this.f6241e = fVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return o8.h.f10610a;
    }

    public final void k(Throwable th) {
        boolean z9;
        b0 b0Var;
        f<?> fVar = this.f6241e;
        r0 l6 = l();
        fVar.getClass();
        CancellationException u = l6.u();
        if (!fVar.o()) {
            z9 = false;
        } else {
            z9 = ((c) fVar.f6236d).k(u);
        }
        if (!z9) {
            fVar.k(u);
            if (!fVar.o() && (b0Var = fVar.f6238f) != null) {
                b0Var.b();
                fVar.f6238f = u0.f6272a;
            }
        }
    }
}
