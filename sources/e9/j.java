package e9;

import java.util.concurrent.CancellationException;
import o8.h;

public final class j extends p0 implements i {
    public final boolean c(Throwable th) {
        r0 l6 = l();
        if (th instanceof CancellationException) {
            return true;
        }
        return l6.h(th);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return h.f10610a;
    }

    public final void k(Throwable th) {
        l();
        throw null;
    }
}
