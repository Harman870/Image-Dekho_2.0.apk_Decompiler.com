package m9;

import j9.d;
import j9.e0;
import j9.m;
import j9.q;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k9.e;
import y0.c;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final j9.a f9430a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9431b;

    /* renamed from: c  reason: collision with root package name */
    public final m f9432c;

    /* renamed from: d  reason: collision with root package name */
    public List<Proxy> f9433d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public int f9434e;

    /* renamed from: f  reason: collision with root package name */
    public List<InetSocketAddress> f9435f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f9436g = new ArrayList();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<e0> f9437a;

        /* renamed from: b  reason: collision with root package name */
        public int f9438b = 0;

        public a(ArrayList arrayList) {
            this.f9437a = arrayList;
        }
    }

    public h(j9.a aVar, c cVar, d dVar, m mVar) {
        List<Proxy> list;
        this.f9430a = aVar;
        this.f9431b = cVar;
        this.f9432c = mVar;
        q qVar = aVar.f8810a;
        Proxy proxy = aVar.f8817h;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f8816g.select(qVar.p());
            if (select == null || select.isEmpty()) {
                list = e.m(Proxy.NO_PROXY);
            } else {
                list = e.l(select);
            }
        }
        this.f9433d = list;
        this.f9434e = 0;
    }
}
