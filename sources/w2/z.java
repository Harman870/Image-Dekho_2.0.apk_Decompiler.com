package w2;

import b3.c;
import b3.d;
import c3.q;
import c3.t;
import c3.u;
import java.util.concurrent.Executor;
import n8.a;
import x2.e;
import y2.b;

public final class z implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12735a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12736b;

    /* renamed from: c  reason: collision with root package name */
    public final a f12737c;

    /* renamed from: d  reason: collision with root package name */
    public final a f12738d;

    /* renamed from: e  reason: collision with root package name */
    public final a f12739e;

    /* renamed from: f  reason: collision with root package name */
    public final a f12740f;

    public /* synthetic */ z(a aVar, a aVar2, b bVar, a aVar3, a aVar4, int i10) {
        this.f12735a = i10;
        this.f12736b = aVar;
        this.f12737c = aVar2;
        this.f12738d = bVar;
        this.f12739e = aVar3;
        this.f12740f = aVar4;
    }

    public final Object get() {
        switch (this.f12735a) {
            case 0:
                return new x((f3.a) this.f12736b.get(), (f3.a) this.f12737c.get(), (d) this.f12738d.get(), (q) this.f12739e.get(), (t) this.f12740f.get());
            default:
                return new c((Executor) this.f12736b.get(), (e) this.f12737c.get(), (u) this.f12738d.get(), (d3.d) this.f12739e.get(), (e3.b) this.f12740f.get());
        }
    }
}
