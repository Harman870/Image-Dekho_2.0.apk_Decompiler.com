package b3;

import c3.u;
import d3.d;
import e3.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import w2.h;
import w2.j;
import w2.x;
import x2.e;

public final class c implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f2257f = Logger.getLogger(x.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final u f2258a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f2259b;

    /* renamed from: c  reason: collision with root package name */
    public final e f2260c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2261d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2262e;

    public c(Executor executor, e eVar, u uVar, d dVar, b bVar) {
        this.f2259b = executor;
        this.f2260c = eVar;
        this.f2258a = uVar;
        this.f2261d = dVar;
        this.f2262e = bVar;
    }

    public final void a(h hVar, j jVar, w2.u uVar) {
        this.f2259b.execute(new a(this, jVar, uVar, hVar, 0));
    }
}
