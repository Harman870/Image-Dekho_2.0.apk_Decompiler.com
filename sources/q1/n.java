package q1;

import f2.h;
import f2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k2.a;
import k2.d;
import o1.f;
import q1.j;
import q1.q;

public final class n<R> implements j.a<R>, a.d {

    /* renamed from: z  reason: collision with root package name */
    public static final c f11084z = new c();

    /* renamed from: a  reason: collision with root package name */
    public final e f11085a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f11086b;

    /* renamed from: c  reason: collision with root package name */
    public final q.a f11087c;

    /* renamed from: d  reason: collision with root package name */
    public final g0.d<n<?>> f11088d;

    /* renamed from: e  reason: collision with root package name */
    public final c f11089e;

    /* renamed from: f  reason: collision with root package name */
    public final o f11090f;

    /* renamed from: g  reason: collision with root package name */
    public final t1.a f11091g;

    /* renamed from: h  reason: collision with root package name */
    public final t1.a f11092h;

    /* renamed from: i  reason: collision with root package name */
    public final t1.a f11093i;

    /* renamed from: j  reason: collision with root package name */
    public final t1.a f11094j;
    public final AtomicInteger k;

    /* renamed from: l  reason: collision with root package name */
    public f f11095l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11096m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11097n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11098o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11099p;

    /* renamed from: q  reason: collision with root package name */
    public w<?> f11100q;

    /* renamed from: r  reason: collision with root package name */
    public o1.a f11101r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11102s;

    /* renamed from: t  reason: collision with root package name */
    public r f11103t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public q<?> f11104v;
    public j<R> w;

    /* renamed from: x  reason: collision with root package name */
    public volatile boolean f11105x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11106y;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final h f11107a;

        public a(h hVar) {
            this.f11107a = hVar;
        }

        public final void run() {
            i iVar = (i) this.f11107a;
            iVar.f6348b.a();
            synchronized (iVar.f6349c) {
                synchronized (n.this) {
                    if (n.this.f11085a.f11113a.contains(new d(this.f11107a, j2.e.f8015b))) {
                        n nVar = n.this;
                        h hVar = this.f11107a;
                        nVar.getClass();
                        try {
                            ((i) hVar).m(nVar.f11103t, 5);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final h f11109a;

        public b(h hVar) {
            this.f11109a = hVar;
        }

        public final void run() {
            i iVar = (i) this.f11109a;
            iVar.f6348b.a();
            synchronized (iVar.f6349c) {
                synchronized (n.this) {
                    if (n.this.f11085a.f11113a.contains(new d(this.f11109a, j2.e.f8015b))) {
                        n.this.f11104v.d();
                        n nVar = n.this;
                        h hVar = this.f11109a;
                        nVar.getClass();
                        try {
                            ((i) hVar).o(nVar.f11104v, nVar.f11101r, nVar.f11106y);
                            n.this.h(this.f11109a);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final h f11111a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f11112b;

        public d(h hVar, Executor executor) {
            this.f11111a = hVar;
            this.f11112b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f11111a.equals(((d) obj).f11111a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f11111a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f11113a;

        public e(ArrayList arrayList) {
            this.f11113a = arrayList;
        }

        public final Iterator<d> iterator() {
            return this.f11113a.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(t1.a aVar, t1.a aVar2, t1.a aVar3, t1.a aVar4, o oVar, q.a aVar5, a.c cVar) {
        c cVar2 = f11084z;
        this.f11085a = new e(new ArrayList(2));
        this.f11086b = new d.a();
        this.k = new AtomicInteger();
        this.f11091g = aVar;
        this.f11092h = aVar2;
        this.f11093i = aVar3;
        this.f11094j = aVar4;
        this.f11090f = oVar;
        this.f11087c = aVar5;
        this.f11088d = cVar;
        this.f11089e = cVar2;
    }

    public final synchronized void a(h hVar, Executor executor) {
        Runnable runnable;
        this.f11086b.a();
        this.f11085a.f11113a.add(new d(hVar, executor));
        boolean z9 = true;
        if (this.f11102s) {
            e(1);
            runnable = new b(hVar);
        } else if (this.u) {
            e(1);
            runnable = new a(hVar);
        } else {
            if (this.f11105x) {
                z9 = false;
            }
            y3.a.g("Cannot add callbacks to a cancelled EngineJob", z9);
        }
        executor.execute(runnable);
    }

    public final void b() {
        Object obj;
        if (!f()) {
            this.f11105x = true;
            j<R> jVar = this.w;
            jVar.E = true;
            h hVar = jVar.C;
            if (hVar != null) {
                hVar.cancel();
            }
            o oVar = this.f11090f;
            f fVar = this.f11095l;
            m mVar = (m) oVar;
            synchronized (mVar) {
                t tVar = mVar.f11060a;
                tVar.getClass();
                if (this.f11099p) {
                    obj = tVar.f11139b;
                } else {
                    obj = tVar.f11138a;
                }
                Map map = (Map) obj;
                if (equals(map.get(fVar))) {
                    map.remove(fVar);
                }
            }
        }
    }

    public final void c() {
        q<?> qVar;
        synchronized (this) {
            this.f11086b.a();
            y3.a.g("Not yet complete!", f());
            int decrementAndGet = this.k.decrementAndGet();
            y3.a.g("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                qVar = this.f11104v;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public final d.a d() {
        return this.f11086b;
    }

    public final synchronized void e(int i10) {
        q<?> qVar;
        y3.a.g("Not yet complete!", f());
        if (this.k.getAndAdd(i10) == 0 && (qVar = this.f11104v) != null) {
            qVar.d();
        }
    }

    public final boolean f() {
        return this.u || this.f11102s || this.f11105x;
    }

    public final synchronized void g() {
        boolean a10;
        if (this.f11095l != null) {
            this.f11085a.f11113a.clear();
            this.f11095l = null;
            this.f11104v = null;
            this.f11100q = null;
            this.u = false;
            this.f11105x = false;
            this.f11102s = false;
            this.f11106y = false;
            j<R> jVar = this.w;
            j.e eVar = jVar.f11026g;
            synchronized (eVar) {
                eVar.f11048a = true;
                a10 = eVar.a();
            }
            if (a10) {
                jVar.m();
            }
            this.w = null;
            this.f11103t = null;
            this.f11101r = null;
            this.f11088d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(h hVar) {
        boolean z9;
        this.f11086b.a();
        this.f11085a.f11113a.remove(new d(hVar, j2.e.f8015b));
        if (this.f11085a.f11113a.isEmpty()) {
            b();
            if (!this.f11102s) {
                if (!this.u) {
                    z9 = false;
                    if (z9 && this.k.get() == 0) {
                        g();
                    }
                }
            }
            z9 = true;
            g();
        }
    }
}
