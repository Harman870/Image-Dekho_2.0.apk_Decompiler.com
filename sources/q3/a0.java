package q3;

import android.os.Looper;
import f4.f;
import m3.l;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p3.a;
import p3.a.c;

public final class a0<O extends a.c> extends q {
    @NotOnlyInitialized

    /* renamed from: b  reason: collision with root package name */
    public final p3.c<O> f11196b;

    public a0(p3.c<O> cVar) {
        this.f11196b = cVar;
    }

    public final Looper a() {
        return this.f11196b.f10666f;
    }

    public final com.google.android.gms.common.api.internal.a b(l lVar) {
        p3.c<O> cVar = this.f11196b;
        cVar.getClass();
        lVar.zak();
        d dVar = cVar.f10670j;
        dVar.getClass();
        o0 o0Var = new o0(lVar);
        f fVar = dVar.f11224n;
        fVar.sendMessage(fVar.obtainMessage(4, new f0(o0Var, dVar.f11220i.get(), cVar)));
        return lVar;
    }
}
