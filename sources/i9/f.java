package i9;

import e9.h0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class f extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public a f7969b;

    public f(int i10, int i11, long j10) {
        this.f7969b = new a(i10, i11, j10, "DefaultDispatcher");
    }

    public final void L(q8.f fVar, Runnable runnable) {
        a aVar = this.f7969b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f7947h;
        aVar.c(runnable, j.f7978f, false);
    }
}
