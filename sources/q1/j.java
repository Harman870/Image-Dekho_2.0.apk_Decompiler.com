package q1;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.v0;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import k2.a;
import k2.d;
import o1.f;
import o1.g;
import o1.k;
import q1.h;
import q1.m;
import q1.n;
import x1.m;

public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public o1.a A;
    public com.bumptech.glide.load.data.d<?> B;
    public volatile h C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;

    /* renamed from: a  reason: collision with root package name */
    public final i<R> f11020a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11021b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final d.a f11022c = new d.a();

    /* renamed from: d  reason: collision with root package name */
    public final d f11023d;

    /* renamed from: e  reason: collision with root package name */
    public final g0.d<j<?>> f11024e;

    /* renamed from: f  reason: collision with root package name */
    public final c<?> f11025f = new c<>();

    /* renamed from: g  reason: collision with root package name */
    public final e f11026g = new e();

    /* renamed from: h  reason: collision with root package name */
    public com.bumptech.glide.h f11027h;

    /* renamed from: i  reason: collision with root package name */
    public f f11028i;

    /* renamed from: j  reason: collision with root package name */
    public com.bumptech.glide.j f11029j;
    public p k;

    /* renamed from: l  reason: collision with root package name */
    public int f11030l;

    /* renamed from: m  reason: collision with root package name */
    public int f11031m;

    /* renamed from: n  reason: collision with root package name */
    public l f11032n;

    /* renamed from: o  reason: collision with root package name */
    public o1.h f11033o;

    /* renamed from: p  reason: collision with root package name */
    public a<R> f11034p;

    /* renamed from: q  reason: collision with root package name */
    public int f11035q;

    /* renamed from: r  reason: collision with root package name */
    public int f11036r;

    /* renamed from: s  reason: collision with root package name */
    public int f11037s;

    /* renamed from: t  reason: collision with root package name */
    public long f11038t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public Object f11039v;
    public Thread w;

    /* renamed from: x  reason: collision with root package name */
    public f f11040x;

    /* renamed from: y  reason: collision with root package name */
    public f f11041y;

    /* renamed from: z  reason: collision with root package name */
    public Object f11042z;

    public interface a<R> {
    }

    public final class b<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final o1.a f11043a;

        public b(o1.a aVar) {
            this.f11043a = aVar;
        }
    }

    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public f f11045a;

        /* renamed from: b  reason: collision with root package name */
        public k<Z> f11046b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f11047c;
    }

    public interface d {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11048a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11049b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11050c;

        public final boolean a() {
            return (this.f11050c || this.f11049b) && this.f11048a;
        }
    }

    public j(d dVar, a.c cVar) {
        this.f11023d = dVar;
        this.f11024e = cVar;
    }

    public final void a(f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, o1.a aVar, f fVar2) {
        this.f11040x = fVar;
        this.f11042z = obj;
        this.B = dVar;
        this.A = aVar;
        this.f11041y = fVar2;
        boolean z9 = false;
        if (fVar != this.f11020a.a().get(0)) {
            z9 = true;
        }
        this.F = z9;
        if (Thread.currentThread() != this.w) {
            n(3);
        } else {
            g();
        }
    }

    public final void b() {
        n(2);
    }

    public final void c(f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, o1.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        rVar.f11132b = fVar;
        rVar.f11133c = aVar;
        rVar.f11134d = a10;
        this.f11021b.add(rVar);
        if (Thread.currentThread() != this.w) {
            n(2);
        } else {
            o();
        }
    }

    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int ordinal = this.f11029j.ordinal() - jVar.f11029j.ordinal();
        if (ordinal == 0) {
            return this.f11035q - jVar.f11035q;
        }
        return ordinal;
    }

    public final d.a d() {
        return this.f11022c;
    }

    public final <Data> w<R> e(com.bumptech.glide.load.data.d<?> dVar, Data data, o1.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = j2.h.f8019b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> f10 = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j(elapsedRealtimeNanos, "Decoded result " + f10, (String) null);
            }
            return f10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> f(Data data, o1.a aVar) {
        boolean z9;
        u<Data, ?, R> c10 = this.f11020a.c(data.getClass());
        o1.h hVar = this.f11033o;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar == o1.a.RESOURCE_DISK_CACHE || this.f11020a.f11019r) {
                z9 = true;
            } else {
                z9 = false;
            }
            g gVar = m.f12876i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z9)) {
                hVar = new o1.h();
                hVar.f10519b.i(this.f11033o.f10519b);
                hVar.f10519b.put(gVar, Boolean.valueOf(z9));
            }
        }
        o1.h hVar2 = hVar;
        com.bumptech.glide.load.data.e f10 = this.f11027h.a().f(data);
        try {
            return c10.a(this.f11030l, this.f11031m, hVar2, f10, new b(aVar));
        } finally {
            f10.b();
        }
    }

    public final void g() {
        w<R> wVar;
        boolean z9;
        c<?> cVar;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.f11038t;
            StringBuilder g10 = androidx.activity.f.g("data: ");
            g10.append(this.f11042z);
            g10.append(", cache key: ");
            g10.append(this.f11040x);
            g10.append(", fetcher: ");
            g10.append(this.B);
            j(j10, "Retrieved data", g10.toString());
        }
        v vVar = null;
        try {
            wVar = e(this.B, this.f11042z, this.A);
        } catch (r e10) {
            f fVar = this.f11041y;
            o1.a aVar = this.A;
            e10.f11132b = fVar;
            e10.f11133c = aVar;
            e10.f11134d = null;
            this.f11021b.add(e10);
            wVar = null;
        }
        if (wVar != null) {
            o1.a aVar2 = this.A;
            boolean z10 = this.F;
            if (wVar instanceof s) {
                ((s) wVar).initialize();
            }
            boolean z11 = false;
            if (this.f11025f.f11047c != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                vVar = (v) v.f11143e.b();
                y3.a.h(vVar);
                vVar.f11147d = false;
                vVar.f11146c = true;
                vVar.f11145b = wVar;
                wVar = vVar;
            }
            k(wVar, aVar2, z10);
            this.f11036r = 5;
            try {
                cVar = this.f11025f;
                if (cVar.f11047c != null) {
                    z11 = true;
                }
                if (z11) {
                    d dVar = this.f11023d;
                    o1.h hVar = this.f11033o;
                    cVar.getClass();
                    ((m.c) dVar).a().b(cVar.f11045a, new g(cVar.f11046b, cVar.f11047c, hVar));
                    cVar.f11047c.e();
                }
                if (vVar != null) {
                    vVar.e();
                }
                e eVar = this.f11026g;
                synchronized (eVar) {
                    eVar.f11049b = true;
                    a10 = eVar.a();
                }
                if (a10) {
                    m();
                }
            } catch (Throwable th) {
                if (vVar != null) {
                    vVar.e();
                }
                throw th;
            }
        } else {
            o();
        }
    }

    public final h h() {
        int b10 = o.g.b(this.f11036r);
        if (b10 == 1) {
            return new x(this.f11020a, this);
        }
        if (b10 == 2) {
            i<R> iVar = this.f11020a;
            return new e(iVar.a(), iVar, this);
        } else if (b10 == 3) {
            return new b0(this.f11020a, this);
        } else {
            if (b10 == 5) {
                return null;
            }
            StringBuilder g10 = androidx.activity.f.g("Unrecognized stage: ");
            g10.append(w0.k(this.f11036r));
            throw new IllegalStateException(g10.toString());
        }
    }

    public final int i(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 || i11 == 5) {
                            return 6;
                        }
                        StringBuilder g10 = androidx.activity.f.g("Unrecognized stage: ");
                        g10.append(w0.k(i10));
                        throw new IllegalArgumentException(g10.toString());
                    } else if (this.u) {
                        return 6;
                    } else {
                        return 4;
                    }
                } else if (this.f11032n.a()) {
                    return 3;
                } else {
                    return i(3);
                }
            } else if (this.f11032n.b()) {
                return 2;
            } else {
                return i(2);
            }
        } else {
            throw null;
        }
    }

    public final void j(long j10, String str, String str2) {
        String str3;
        StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(str, " in ");
        h10.append(j2.h.a(j10));
        h10.append(", load key: ");
        h10.append(this.k);
        if (str2 != null) {
            str3 = com.ironsource.adapters.ironsource.a.g(", ", str2);
        } else {
            str3 = "";
        }
        h10.append(str3);
        h10.append(", thread: ");
        h10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", h10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r1 = (q1.m) r0.f11090f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r9 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r9.f11123a == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r1.f11066g.a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r9 = r1.f11060a;
        r9.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0.f11099p == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = r9.f11139b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r9 = r9.f11138a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r9 = (java.util.Map) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r0.equals(r9.get(r8)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r9.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r8 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r8.hasNext() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r9 = (q1.n.d) r8.next();
        r9.f11112b.execute(new q1.n.b(r9.f11111a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r0.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(q1.w<R> r8, o1.a r9, boolean r10) {
        /*
            r7 = this;
            r7.q()
            q1.j$a<R> r0 = r7.f11034p
            q1.n r0 = (q1.n) r0
            monitor-enter(r0)
            r0.f11100q = r8     // Catch:{ all -> 0x00c9 }
            r0.f11101r = r9     // Catch:{ all -> 0x00c9 }
            r0.f11106y = r10     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            monitor-enter(r0)
            k2.d$a r8 = r0.f11086b     // Catch:{ all -> 0x00c6 }
            r8.a()     // Catch:{ all -> 0x00c6 }
            boolean r8 = r0.f11105x     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x0024
            q1.w<?> r8 = r0.f11100q     // Catch:{ all -> 0x00c6 }
            r8.c()     // Catch:{ all -> 0x00c6 }
            r0.g()     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00b2
        L_0x0024:
            q1.n$e r8 = r0.f11085a     // Catch:{ all -> 0x00c6 }
            java.util.List<q1.n$d> r8 = r8.f11113a     // Catch:{ all -> 0x00c6 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00be
            boolean r8 = r0.f11102s     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00b6
            q1.n$c r8 = r0.f11089e     // Catch:{ all -> 0x00c6 }
            q1.w<?> r2 = r0.f11100q     // Catch:{ all -> 0x00c6 }
            boolean r3 = r0.f11096m     // Catch:{ all -> 0x00c6 }
            o1.f r5 = r0.f11095l     // Catch:{ all -> 0x00c6 }
            q1.q$a r6 = r0.f11087c     // Catch:{ all -> 0x00c6 }
            r8.getClass()     // Catch:{ all -> 0x00c6 }
            q1.q r8 = new q1.q     // Catch:{ all -> 0x00c6 }
            r4 = 1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            r0.f11104v = r8     // Catch:{ all -> 0x00c6 }
            r8 = 1
            r0.f11102s = r8     // Catch:{ all -> 0x00c6 }
            q1.n$e r9 = r0.f11085a     // Catch:{ all -> 0x00c6 }
            r9.getClass()     // Catch:{ all -> 0x00c6 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            java.util.List<q1.n$d> r9 = r9.f11113a     // Catch:{ all -> 0x00c6 }
            r10.<init>(r9)     // Catch:{ all -> 0x00c6 }
            int r9 = r10.size()     // Catch:{ all -> 0x00c6 }
            int r9 = r9 + r8
            r0.e(r9)     // Catch:{ all -> 0x00c6 }
            o1.f r8 = r0.f11095l     // Catch:{ all -> 0x00c6 }
            q1.q<?> r9 = r0.f11104v     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            q1.o r1 = r0.f11090f
            q1.m r1 = (q1.m) r1
            monitor-enter(r1)
            if (r9 == 0) goto L_0x0074
            boolean r2 = r9.f11123a     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0074
            q1.c r2 = r1.f11066g     // Catch:{ all -> 0x00b3 }
            r2.a(r8, r9)     // Catch:{ all -> 0x00b3 }
        L_0x0074:
            q1.t r9 = r1.f11060a     // Catch:{ all -> 0x00b3 }
            r9.getClass()     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.f11099p     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0080
            java.lang.Object r9 = r9.f11139b     // Catch:{ all -> 0x00b3 }
            goto L_0x0082
        L_0x0080:
            java.lang.Object r9 = r9.f11138a     // Catch:{ all -> 0x00b3 }
        L_0x0082:
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r9.get(r8)     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0091
            r9.remove(r8)     // Catch:{ all -> 0x00b3 }
        L_0x0091:
            monitor-exit(r1)
            java.util.Iterator r8 = r10.iterator()
        L_0x0096:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            q1.n$d r9 = (q1.n.d) r9
            java.util.concurrent.Executor r10 = r9.f11112b
            q1.n$b r1 = new q1.n$b
            f2.h r9 = r9.f11111a
            r1.<init>(r9)
            r10.execute(r1)
            goto L_0x0096
        L_0x00af:
            r0.c()
        L_0x00b2:
            return
        L_0x00b3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L_0x00b6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Already have resource"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00be:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Received a resource without any callbacks to notify"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r8
        L_0x00c9:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.j.k(q1.w, o1.a, boolean):void");
    }

    public final void l() {
        boolean a10;
        Object obj;
        q();
        r rVar = new r("Failed to load resource", new ArrayList(this.f11021b));
        n nVar = (n) this.f11034p;
        synchronized (nVar) {
            nVar.f11103t = rVar;
        }
        synchronized (nVar) {
            nVar.f11086b.a();
            if (nVar.f11105x) {
                nVar.g();
            } else if (nVar.f11085a.f11113a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!nVar.u) {
                nVar.u = true;
                f fVar = nVar.f11095l;
                n.e eVar = nVar.f11085a;
                eVar.getClass();
                ArrayList<n.d> arrayList = new ArrayList<>(eVar.f11113a);
                nVar.e(arrayList.size() + 1);
                m mVar = (m) nVar.f11090f;
                synchronized (mVar) {
                    t tVar = mVar.f11060a;
                    tVar.getClass();
                    if (nVar.f11099p) {
                        obj = tVar.f11139b;
                    } else {
                        obj = tVar.f11138a;
                    }
                    Map map = (Map) obj;
                    if (nVar.equals(map.get(fVar))) {
                        map.remove(fVar);
                    }
                }
                for (n.d dVar : arrayList) {
                    dVar.f11112b.execute(new n.a(dVar.f11111a));
                }
                nVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar2 = this.f11026g;
        synchronized (eVar2) {
            eVar2.f11050c = true;
            a10 = eVar2.a();
        }
        if (a10) {
            m();
        }
    }

    public final void m() {
        e eVar = this.f11026g;
        synchronized (eVar) {
            eVar.f11049b = false;
            eVar.f11048a = false;
            eVar.f11050c = false;
        }
        c<?> cVar = this.f11025f;
        cVar.f11045a = null;
        cVar.f11046b = null;
        cVar.f11047c = null;
        i<R> iVar = this.f11020a;
        iVar.f11005c = null;
        iVar.f11006d = null;
        iVar.f11015n = null;
        iVar.f11009g = null;
        iVar.k = null;
        iVar.f11011i = null;
        iVar.f11016o = null;
        iVar.f11012j = null;
        iVar.f11017p = null;
        iVar.f11003a.clear();
        iVar.f11013l = false;
        iVar.f11004b.clear();
        iVar.f11014m = false;
        this.D = false;
        this.f11027h = null;
        this.f11028i = null;
        this.f11033o = null;
        this.f11029j = null;
        this.k = null;
        this.f11034p = null;
        this.f11036r = 0;
        this.C = null;
        this.w = null;
        this.f11040x = null;
        this.f11042z = null;
        this.A = null;
        this.B = null;
        this.f11038t = 0;
        this.E = false;
        this.f11039v = null;
        this.f11021b.clear();
        this.f11024e.a(this);
    }

    public final void n(int i10) {
        t1.a aVar;
        this.f11037s = i10;
        n nVar = (n) this.f11034p;
        if (nVar.f11097n) {
            aVar = nVar.f11093i;
        } else if (nVar.f11098o) {
            aVar = nVar.f11094j;
        } else {
            aVar = nVar.f11092h;
        }
        aVar.execute(this);
    }

    public final void o() {
        this.w = Thread.currentThread();
        int i10 = j2.h.f8019b;
        this.f11038t = SystemClock.elapsedRealtimeNanos();
        boolean z9 = false;
        while (!this.E && this.C != null && !(z9 = this.C.e())) {
            this.f11036r = i(this.f11036r);
            this.C = h();
            if (this.f11036r == 4) {
                n(2);
                return;
            }
        }
        if ((this.f11036r == 6 || this.E) && !z9) {
            l();
        }
    }

    public final void p() {
        int b10 = o.g.b(this.f11037s);
        if (b10 == 0) {
            this.f11036r = i(1);
            this.C = h();
        } else if (b10 != 1) {
            if (b10 == 2) {
                g();
                return;
            }
            StringBuilder g10 = androidx.activity.f.g("Unrecognized run reason: ");
            g10.append(v0.f(this.f11037s));
            throw new IllegalStateException(g10.toString());
        }
        o();
    }

    public final void q() {
        Throwable th;
        this.f11022c.a();
        if (this.D) {
            if (this.f11021b.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f11021b;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.D = true;
    }

    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.B;
        try {
            if (this.E) {
                l();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            p();
            if (dVar != null) {
                dVar.b();
            }
        } catch (d e10) {
            throw e10;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }
}
