package u8;

import x8.f;

public class a extends t8.a {
    public final void a(Throwable th, Throwable th2) {
        f.f(th, "cause");
        f.f(th2, "exception");
        th.addSuppressed(th2);
    }
}
