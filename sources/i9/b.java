package i9;

import e9.h0;
import h9.d;
import h9.o;
import java.util.concurrent.Executor;
import q8.g;
import x8.f;

public final class b extends h0 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final b f7965b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final d f7966c;

    static {
        k kVar = k.f7980b;
        int i10 = o.f7068a;
        if (64 >= i10) {
            i10 = 64;
        }
        boolean z9 = false;
        int z10 = c6.b.z("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        kVar.getClass();
        if (z10 >= 1) {
            z9 = true;
        }
        if (z9) {
            f7966c = new d(kVar, z10);
            return;
        }
        throw new IllegalArgumentException(f.j(Integer.valueOf(z10), "Expected positive parallelism level, but got ").toString());
    }

    public final void L(q8.f fVar, Runnable runnable) {
        f7966c.L(fVar, runnable);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        L(g.f11375a, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
