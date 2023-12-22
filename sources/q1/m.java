package q1;

import android.os.SystemClock;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import f2.i;
import j2.i;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import k2.a;
import n4.z;
import o1.f;
import q1.c;
import q1.j;
import q1.q;
import s1.a;
import s1.e;
import s1.g;
import s1.h;

public final class m implements o, h.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f11059h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final t f11060a;

    /* renamed from: b  reason: collision with root package name */
    public final z f11061b;

    /* renamed from: c  reason: collision with root package name */
    public final h f11062c;

    /* renamed from: d  reason: collision with root package name */
    public final b f11063d;

    /* renamed from: e  reason: collision with root package name */
    public final z f11064e;

    /* renamed from: f  reason: collision with root package name */
    public final a f11065f;

    /* renamed from: g  reason: collision with root package name */
    public final c f11066g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.d f11067a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f11068b = k2.a.a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new C0130a());

        /* renamed from: c  reason: collision with root package name */
        public int f11069c;

        /* renamed from: q1.m$a$a  reason: collision with other inner class name */
        public class C0130a implements a.b<j<?>> {
            public C0130a() {
            }

            public final Object a() {
                a aVar = a.this;
                return new j(aVar.f11067a, aVar.f11068b);
            }
        }

        public a(c cVar) {
            this.f11067a = cVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final t1.a f11071a;

        /* renamed from: b  reason: collision with root package name */
        public final t1.a f11072b;

        /* renamed from: c  reason: collision with root package name */
        public final t1.a f11073c;

        /* renamed from: d  reason: collision with root package name */
        public final t1.a f11074d;

        /* renamed from: e  reason: collision with root package name */
        public final o f11075e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f11076f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f11077g = k2.a.a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new a());

        public class a implements a.b<n<?>> {
            public a() {
            }

            public final Object a() {
                b bVar = b.this;
                return new n(bVar.f11071a, bVar.f11072b, bVar.f11073c, bVar.f11074d, bVar.f11075e, bVar.f11076f, bVar.f11077g);
            }
        }

        public b(t1.a aVar, t1.a aVar2, t1.a aVar3, t1.a aVar4, o oVar, q.a aVar5) {
            this.f11071a = aVar;
            this.f11072b = aVar2;
            this.f11073c = aVar3;
            this.f11074d = aVar4;
            this.f11075e = oVar;
            this.f11076f = aVar5;
        }
    }

    public static class c implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0139a f11079a;

        /* renamed from: b  reason: collision with root package name */
        public volatile s1.a f11080b;

        public c(a.C0139a aVar) {
            this.f11079a = aVar;
        }

        public final s1.a a() {
            if (this.f11080b == null) {
                synchronized (this) {
                    if (this.f11080b == null) {
                        s1.c cVar = (s1.c) this.f11079a;
                        e eVar = (e) cVar.f11831b;
                        File cacheDir = eVar.f11837a.getCacheDir();
                        s1.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (eVar.f11838b != null) {
                            cacheDir = new File(cacheDir, eVar.f11838b);
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                dVar = new s1.d(cacheDir, cVar.f11830a);
                            }
                        }
                        this.f11080b = dVar;
                    }
                    if (this.f11080b == null) {
                        this.f11080b = new z5.c();
                    }
                }
            }
            return this.f11080b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<?> f11081a;

        /* renamed from: b  reason: collision with root package name */
        public final f2.h f11082b;

        public d(f2.h hVar, n<?> nVar) {
            this.f11082b = hVar;
            this.f11081a = nVar;
        }
    }

    public m(h hVar, a.C0139a aVar, t1.a aVar2, t1.a aVar3, t1.a aVar4, t1.a aVar5) {
        this.f11062c = hVar;
        c cVar = new c(aVar);
        c cVar2 = new c();
        this.f11066g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f10985d = this;
            }
        }
        this.f11061b = new z();
        this.f11060a = new t();
        this.f11063d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f11065f = new a(cVar);
        this.f11064e = new z();
        ((g) hVar).f11839d = this;
    }

    public static void d(String str, long j10, f fVar) {
        StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(str, " in ");
        h10.append(j2.h.a(j10));
        h10.append("ms, key: ");
        h10.append(fVar);
        Log.v("Engine", h10.toString());
    }

    public static void e(w wVar) {
        if (wVar instanceof q) {
            ((q) wVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final void a(f fVar, q<?> qVar) {
        c cVar = this.f11066g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f10983b.remove(fVar);
            if (aVar != null) {
                aVar.f10988c = null;
                aVar.clear();
            }
        }
        if (qVar.f11123a) {
            w wVar = (w) ((g) this.f11062c).d(fVar, qVar);
        } else {
            this.f11064e.a(qVar, false);
        }
    }

    public final d b(com.bumptech.glide.h hVar, Object obj, f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.j jVar, l lVar, j2.b bVar, boolean z9, boolean z10, o1.h hVar2, boolean z11, boolean z12, boolean z13, boolean z14, f2.h hVar3, Executor executor) {
        long j10;
        if (f11059h) {
            int i12 = j2.h.f8019b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f11061b.getClass();
        p pVar = new p(obj, fVar, i10, i11, bVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                q<?> c10 = c(pVar, z11, j11);
                if (c10 == null) {
                    d f10 = f(hVar, obj, fVar, i10, i11, cls, cls2, jVar, lVar, bVar, z9, z10, hVar2, z11, z12, z13, z14, hVar3, executor, pVar, j11);
                    return f10;
                }
                ((i) hVar3).o(c10, o1.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final q<?> c(p pVar, boolean z9, long j10) {
        q<?> qVar;
        Y y9;
        q<?> qVar2;
        if (!z9) {
            return null;
        }
        c cVar = this.f11066g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f10983b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = (q) aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.d();
        }
        if (qVar != null) {
            if (f11059h) {
                d("Loaded resource from active resources", j10, pVar);
            }
            return qVar;
        }
        g gVar = (g) this.f11062c;
        synchronized (gVar) {
            i.a aVar2 = (i.a) gVar.f8020a.remove(pVar);
            if (aVar2 == null) {
                y9 = null;
            } else {
                gVar.f8022c -= (long) aVar2.f8024b;
                y9 = aVar2.f8023a;
            }
        }
        w wVar = (w) y9;
        if (wVar == null) {
            qVar2 = null;
        } else if (wVar instanceof q) {
            qVar2 = (q) wVar;
        } else {
            qVar2 = new q<>(wVar, true, true, pVar, this);
        }
        if (qVar2 != null) {
            qVar2.d();
            this.f11066g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f11059h) {
            d("Loaded resource from cache", j10, pVar);
        }
        return qVar2;
    }

    public final d f(com.bumptech.glide.h hVar, Object obj, f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.j jVar, l lVar, j2.b bVar, boolean z9, boolean z10, o1.h hVar2, boolean z11, boolean z12, boolean z13, boolean z14, f2.h hVar3, Executor executor, p pVar, long j10) {
        t1.a aVar;
        com.bumptech.glide.h hVar4 = hVar;
        Object obj2 = obj;
        f fVar2 = fVar;
        int i12 = i10;
        int i13 = i11;
        com.bumptech.glide.j jVar2 = jVar;
        l lVar2 = lVar;
        o1.h hVar5 = hVar2;
        boolean z15 = z14;
        f2.h hVar6 = hVar3;
        Executor executor2 = executor;
        p pVar2 = pVar;
        long j11 = j10;
        t tVar = this.f11060a;
        n nVar = (n) ((Map) (z15 ? tVar.f11139b : tVar.f11138a)).get(pVar2);
        if (nVar != null) {
            nVar.a(hVar6, executor2);
            if (f11059h) {
                d("Added to existing load", j11, pVar2);
            }
            return new d(hVar6, nVar);
        }
        n nVar2 = (n) this.f11063d.f11077g.b();
        y3.a.h(nVar2);
        synchronized (nVar2) {
            nVar2.f11095l = pVar2;
            nVar2.f11096m = z11;
            nVar2.f11097n = z12;
            nVar2.f11098o = z13;
            nVar2.f11099p = z15;
        }
        a aVar2 = this.f11065f;
        j<R> jVar3 = (j) aVar2.f11068b.b();
        y3.a.h(jVar3);
        int i14 = aVar2.f11069c;
        aVar2.f11069c = i14 + 1;
        i<R> iVar = jVar3.f11020a;
        j.d dVar = jVar3.f11023d;
        iVar.f11005c = hVar4;
        iVar.f11006d = obj2;
        iVar.f11015n = fVar2;
        iVar.f11007e = i12;
        iVar.f11008f = i13;
        iVar.f11017p = lVar2;
        iVar.f11009g = cls;
        iVar.f11010h = dVar;
        iVar.k = cls2;
        iVar.f11016o = jVar2;
        iVar.f11011i = hVar5;
        iVar.f11012j = bVar;
        iVar.f11018q = z9;
        iVar.f11019r = z10;
        jVar3.f11027h = hVar4;
        jVar3.f11028i = fVar2;
        jVar3.f11029j = jVar2;
        jVar3.k = pVar2;
        jVar3.f11030l = i12;
        jVar3.f11031m = i13;
        jVar3.f11032n = lVar2;
        jVar3.u = z15;
        jVar3.f11033o = hVar5;
        jVar3.f11034p = nVar2;
        jVar3.f11035q = i14;
        boolean z16 = true;
        jVar3.f11037s = 1;
        jVar3.f11039v = obj2;
        t tVar2 = this.f11060a;
        tVar2.getClass();
        ((Map) (nVar2.f11099p ? tVar2.f11139b : tVar2.f11138a)).put(pVar2, nVar2);
        f2.h hVar7 = hVar3;
        nVar2.a(hVar7, executor);
        synchronized (nVar2) {
            nVar2.w = jVar3;
            int i15 = jVar3.i(1);
            if (i15 != 2) {
                if (i15 != 3) {
                    z16 = false;
                }
            }
            if (z16) {
                aVar = nVar2.f11091g;
            } else {
                aVar = nVar2.f11097n ? nVar2.f11093i : nVar2.f11098o ? nVar2.f11094j : nVar2.f11092h;
            }
            aVar.execute(jVar3);
        }
        if (f11059h) {
            d("Started new load", j10, pVar2);
        }
        return new d(hVar7, nVar2);
    }
}
