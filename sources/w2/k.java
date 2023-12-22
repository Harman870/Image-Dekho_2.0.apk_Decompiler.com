package w2;

import android.content.Context;
import androidx.fragment.app.g0;
import c3.r;
import d.u;
import d3.f0;
import d3.x;
import d3.y;
import f3.b;
import f3.c;
import g1.t;
import java.util.concurrent.Executor;
import n8.a;
import w2.o;
import x2.j;
import x2.l;
import y2.c;

public final class k extends y {

    /* renamed from: a  reason: collision with root package name */
    public a<Executor> f12710a = y2.a.a(o.a.f12718a);

    /* renamed from: b  reason: collision with root package name */
    public c f12711b;

    /* renamed from: c  reason: collision with root package name */
    public a f12712c;

    /* renamed from: d  reason: collision with root package name */
    public f0 f12713d;

    /* renamed from: e  reason: collision with root package name */
    public a<x> f12714e;

    /* renamed from: f  reason: collision with root package name */
    public a<x> f12715f;

    public k(Context context) {
        Context context2 = context;
        if (context2 != null) {
            c cVar = new c(context2);
            this.f12711b = cVar;
            b bVar = b.a.f6377a;
            f3.c cVar2 = c.a.f6378a;
            this.f12712c = y2.a.a(new l((Object) cVar, (Object) new j(cVar)));
            y2.c cVar3 = this.f12711b;
            this.f12713d = new f0(cVar3);
            a<x> a10 = y2.a.a(new y(this.f12713d, y2.a.a(new u(cVar3))));
            this.f12714e = a10;
            t tVar = new t((Object) bVar);
            y2.c cVar4 = this.f12711b;
            o.c cVar5 = new o.c(cVar4, a10, tVar);
            a<Executor> aVar = this.f12710a;
            a aVar2 = this.f12712c;
            z zVar = new z(aVar, aVar2, cVar5, a10, a10, 1);
            this.f12715f = y2.a.a(new z(bVar, cVar2, zVar, new r(cVar4, aVar2, a10, cVar5, aVar, a10, a10), new g0((a) aVar, (a) a10, cVar5, (a) a10), 0));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
