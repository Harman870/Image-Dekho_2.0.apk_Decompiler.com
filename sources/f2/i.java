package f2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.j;
import g2.f;
import g2.g;
import h2.a;
import h2.b;
import j2.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k2.d;
import q1.l;
import q1.m;
import q1.r;
import q1.w;
import u1.k;

public final class i<R> implements d, f, h {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f6347a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f6348b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6349c;

    /* renamed from: d  reason: collision with root package name */
    public final f<R> f6350d;

    /* renamed from: e  reason: collision with root package name */
    public final e f6351e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f6352f;

    /* renamed from: g  reason: collision with root package name */
    public final h f6353g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f6354h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f6355i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f6356j;
    public final int k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6357l;

    /* renamed from: m  reason: collision with root package name */
    public final j f6358m;

    /* renamed from: n  reason: collision with root package name */
    public final g<R> f6359n;

    /* renamed from: o  reason: collision with root package name */
    public final List<f<R>> f6360o;

    /* renamed from: p  reason: collision with root package name */
    public final b<? super R> f6361p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f6362q;

    /* renamed from: r  reason: collision with root package name */
    public w<R> f6363r;

    /* renamed from: s  reason: collision with root package name */
    public m.d f6364s;

    /* renamed from: t  reason: collision with root package name */
    public long f6365t;
    public volatile m u;

    /* renamed from: v  reason: collision with root package name */
    public int f6366v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f6367x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f6368y;

    /* renamed from: z  reason: collision with root package name */
    public int f6369z;

    public i(Context context, h hVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, j jVar, g gVar, ArrayList arrayList, e eVar, m mVar, a.C0094a aVar2) {
        h hVar2 = hVar;
        e.a aVar3 = e.f8014a;
        this.f6347a = D ? String.valueOf(hashCode()) : null;
        this.f6348b = new d.a();
        this.f6349c = obj;
        this.f6352f = context;
        this.f6353g = hVar2;
        this.f6354h = obj2;
        this.f6355i = cls;
        this.f6356j = aVar;
        this.k = i10;
        this.f6357l = i11;
        this.f6358m = jVar;
        this.f6359n = gVar;
        this.f6350d = null;
        this.f6360o = arrayList;
        this.f6351e = eVar;
        this.u = mVar;
        this.f6361p = aVar2;
        this.f6362q = aVar3;
        this.f6366v = 1;
        if (this.C == null) {
            if (hVar2.f2560h.f2563a.containsKey(com.bumptech.glide.e.class)) {
                this.C = new RuntimeException("Glide request origin trace");
            }
        }
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f6349c) {
            z9 = this.f6366v == 4;
        }
        return z9;
    }

    public final void b(int i10, int i11) {
        Object obj;
        int i12;
        m.d b10;
        int i13 = i10;
        int i14 = i11;
        this.f6348b.a();
        Object obj2 = this.f6349c;
        synchronized (obj2) {
            try {
                boolean z9 = D;
                if (z9) {
                    l("Got onSizeReady in " + j2.h.a(this.f6365t));
                }
                if (this.f6366v == 3) {
                    this.f6366v = 2;
                    float f10 = this.f6356j.f6319b;
                    if (i13 != Integer.MIN_VALUE) {
                        i13 = Math.round(((float) i13) * f10);
                    }
                    this.f6369z = i13;
                    if (i14 == Integer.MIN_VALUE) {
                        i12 = i14;
                    } else {
                        i12 = Math.round(f10 * ((float) i14));
                    }
                    this.A = i12;
                    if (z9) {
                        l("finished setup for calling load in " + j2.h.a(this.f6365t));
                    }
                    m mVar = this.u;
                    h hVar = this.f6353g;
                    Object obj3 = this.f6354h;
                    a<?> aVar = this.f6356j;
                    o1.f fVar = aVar.f6328l;
                    int i15 = this.f6369z;
                    int i16 = this.A;
                    Class<?> cls = aVar.f6335s;
                    Class<R> cls2 = this.f6355i;
                    j jVar = this.f6358m;
                    l lVar = aVar.f6320c;
                    j2.b bVar = aVar.f6334r;
                    boolean z10 = aVar.f6329m;
                    boolean z11 = aVar.f6339y;
                    o1.h hVar2 = aVar.f6333q;
                    Object obj4 = obj2;
                    try {
                        boolean z12 = aVar.f6326i;
                        boolean z13 = aVar.w;
                        boolean z14 = aVar.f6340z;
                        o1.h hVar3 = hVar2;
                        obj = obj4;
                        try {
                            b10 = mVar.b(hVar, obj3, fVar, i15, i16, cls, cls2, jVar, lVar, bVar, z10, z11, hVar3, z12, z13, z14, aVar.f6338x, this, this.f6362q);
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                    try {
                        this.f6364s = b10;
                        if (this.f6366v != 2) {
                            this.f6364s = null;
                        }
                        if (z9) {
                            l("finished onSizeReady in " + j2.h.a(this.f6365t));
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    public final void c() {
        if (!this.B) {
            this.f6348b.a();
            this.f6359n.f(this);
            m.d dVar = this.f6364s;
            if (dVar != null) {
                synchronized (m.this) {
                    dVar.f11081a.h(dVar.f11082b);
                }
                this.f6364s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.u.getClass();
        q1.m.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6349c
            monitor-enter(r0)
            boolean r1 = r5.B     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0046
            k2.d$a r1 = r5.f6348b     // Catch:{ all -> 0x004e }
            r1.a()     // Catch:{ all -> 0x004e }
            int r1 = r5.f6366v     // Catch:{ all -> 0x004e }
            r2 = 6
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0013:
            r5.c()     // Catch:{ all -> 0x004e }
            q1.w<R> r1 = r5.f6363r     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f6363r = r3     // Catch:{ all -> 0x004e }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            f2.e r3 = r5.f6351e     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.j(r5)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            g2.g<R> r3 = r5.f6359n     // Catch:{ all -> 0x004e }
            android.graphics.drawable.Drawable r4 = r5.d()     // Catch:{ all -> 0x004e }
            r3.h(r4)     // Catch:{ all -> 0x004e }
        L_0x0038:
            r5.f6366v = r2     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0045
            q1.m r0 = r5.u
            r0.getClass()
            q1.m.e(r1)
        L_0x0045:
            return
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.i.clear():void");
    }

    public final Drawable d() {
        int i10;
        if (this.f6367x == null) {
            a<?> aVar = this.f6356j;
            Drawable drawable = aVar.f6324g;
            this.f6367x = drawable;
            if (drawable == null && (i10 = aVar.f6325h) > 0) {
                this.f6367x = k(i10);
            }
        }
        return this.f6367x;
    }

    public final boolean e(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        j jVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        j jVar2;
        int i15;
        boolean z9;
        d dVar2 = dVar;
        if (!(dVar2 instanceof i)) {
            return false;
        }
        synchronized (this.f6349c) {
            i10 = this.k;
            i11 = this.f6357l;
            obj = this.f6354h;
            cls = this.f6355i;
            aVar = this.f6356j;
            jVar = this.f6358m;
            List<f<R>> list = this.f6360o;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        i iVar = (i) dVar2;
        synchronized (iVar.f6349c) {
            i13 = iVar.k;
            i14 = iVar.f6357l;
            obj2 = iVar.f6354h;
            cls2 = iVar.f6355i;
            aVar2 = iVar.f6356j;
            jVar2 = iVar.f6358m;
            List<f<R>> list2 = iVar.f6360o;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = j2.l.f8029a;
            if (obj == null) {
                if (obj2 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else if (obj instanceof k) {
                z9 = ((k) obj).a();
            } else {
                z9 = obj.equals(obj2);
            }
            if (z9 && cls.equals(cls2) && aVar.equals(aVar2) && jVar == jVar2 && i12 == i15) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        boolean z9;
        synchronized (this.f6349c) {
            z9 = this.f6366v == 6;
        }
        return z9;
    }

    public final void g() {
        synchronized (this.f6349c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6349c
            monitor-enter(r0)
            boolean r1 = r7.B     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00e2
            k2.d$a r1 = r7.f6348b     // Catch:{ all -> 0x00e0 }
            r1.a()     // Catch:{ all -> 0x00e0 }
            int r1 = j2.h.f8019b     // Catch:{ all -> 0x00e0 }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00e0 }
            r7.f6365t = r1     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r7.f6354h     // Catch:{ all -> 0x00e0 }
            r2 = 3
            if (r1 != 0) goto L_0x0052
            int r1 = r7.k     // Catch:{ all -> 0x00e0 }
            int r3 = r7.f6357l     // Catch:{ all -> 0x00e0 }
            boolean r1 = j2.l.j(r1, r3)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x002b
            int r1 = r7.k     // Catch:{ all -> 0x00e0 }
            r7.f6369z = r1     // Catch:{ all -> 0x00e0 }
            int r1 = r7.f6357l     // Catch:{ all -> 0x00e0 }
            r7.A = r1     // Catch:{ all -> 0x00e0 }
        L_0x002b:
            android.graphics.drawable.Drawable r1 = r7.f6368y     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0041
            f2.a<?> r1 = r7.f6356j     // Catch:{ all -> 0x00e0 }
            android.graphics.drawable.Drawable r3 = r1.f6331o     // Catch:{ all -> 0x00e0 }
            r7.f6368y = r3     // Catch:{ all -> 0x00e0 }
            if (r3 != 0) goto L_0x0041
            int r1 = r1.f6332p     // Catch:{ all -> 0x00e0 }
            if (r1 <= 0) goto L_0x0041
            android.graphics.drawable.Drawable r1 = r7.k(r1)     // Catch:{ all -> 0x00e0 }
            r7.f6368y = r1     // Catch:{ all -> 0x00e0 }
        L_0x0041:
            android.graphics.drawable.Drawable r1 = r7.f6368y     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0046
            r2 = 5
        L_0x0046:
            q1.r r1 = new q1.r     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x00e0 }
            r7.m(r1, r2)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0052:
            int r1 = r7.f6366v     // Catch:{ all -> 0x00e0 }
            r3 = 2
            if (r1 == r3) goto L_0x00d8
            r4 = 4
            r5 = 0
            if (r1 != r4) goto L_0x0064
            q1.w<R> r1 = r7.f6363r     // Catch:{ all -> 0x00e0 }
            o1.a r2 = o1.a.MEMORY_CACHE     // Catch:{ all -> 0x00e0 }
            r7.o(r1, r2, r5)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0064:
            java.util.List<f2.f<R>> r1 = r7.f6360o     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0069
            goto L_0x0083
        L_0x0069:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e0 }
        L_0x006d:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00e0 }
            f2.f r4 = (f2.f) r4     // Catch:{ all -> 0x00e0 }
            boolean r6 = r4 instanceof f2.c     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x006d
            f2.c r4 = (f2.c) r4     // Catch:{ all -> 0x00e0 }
            r4.getClass()     // Catch:{ all -> 0x00e0 }
            goto L_0x006d
        L_0x0083:
            r7.f6366v = r2     // Catch:{ all -> 0x00e0 }
            int r1 = r7.k     // Catch:{ all -> 0x00e0 }
            int r4 = r7.f6357l     // Catch:{ all -> 0x00e0 }
            boolean r1 = j2.l.j(r1, r4)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0097
            int r1 = r7.k     // Catch:{ all -> 0x00e0 }
            int r4 = r7.f6357l     // Catch:{ all -> 0x00e0 }
            r7.b(r1, r4)     // Catch:{ all -> 0x00e0 }
            goto L_0x009c
        L_0x0097:
            g2.g<R> r1 = r7.f6359n     // Catch:{ all -> 0x00e0 }
            r1.e(r7)     // Catch:{ all -> 0x00e0 }
        L_0x009c:
            int r1 = r7.f6366v     // Catch:{ all -> 0x00e0 }
            if (r1 == r3) goto L_0x00a2
            if (r1 != r2) goto L_0x00b8
        L_0x00a2:
            f2.e r1 = r7.f6351e     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00ac
            boolean r1 = r1.d(r7)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00ad
        L_0x00ac:
            r5 = 1
        L_0x00ad:
            if (r5 == 0) goto L_0x00b8
            g2.g<R> r1 = r7.f6359n     // Catch:{ all -> 0x00e0 }
            android.graphics.drawable.Drawable r2 = r7.d()     // Catch:{ all -> 0x00e0 }
            r1.d(r2)     // Catch:{ all -> 0x00e0 }
        L_0x00b8:
            boolean r1 = D     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            long r2 = r7.f6365t     // Catch:{ all -> 0x00e0 }
            double r2 = j2.h.a(r2)     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r7.l(r1)     // Catch:{ all -> 0x00e0 }
        L_0x00d6:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00d8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00e0 }
            throw r1     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r1 = move-exception
            goto L_0x00ea
        L_0x00e2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x00e0 }
            throw r1     // Catch:{ all -> 0x00e0 }
        L_0x00ea:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.i.h():void");
    }

    public final boolean i() {
        boolean z9;
        synchronized (this.f6349c) {
            z9 = this.f6366v == 4;
        }
        return z9;
    }

    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6349c) {
            int i10 = this.f6366v;
            if (i10 != 2) {
                if (i10 != 3) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        return z9;
    }

    public final boolean j() {
        e eVar = this.f6351e;
        return eVar == null || !eVar.getRoot().a();
    }

    public final Drawable k(int i10) {
        Resources.Theme theme = this.f6356j.u;
        if (theme == null) {
            theme = this.f6352f.getTheme();
        }
        h hVar = this.f6353g;
        return z1.b.a(hVar, hVar, i10, theme);
    }

    public final void l(String str) {
        StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(str, " this: ");
        h10.append(this.f6347a);
        Log.v("GlideRequest", h10.toString());
    }

    public final void m(r rVar, int i10) {
        int i11;
        int i12;
        this.f6348b.a();
        synchronized (this.f6349c) {
            rVar.getClass();
            int i13 = this.f6353g.f2561i;
            if (i13 <= i10) {
                Log.w("Glide", "Load failed for [" + this.f6354h + "] with dimensions [" + this.f6369z + "x" + this.A + "]", rVar);
                if (i13 <= 4) {
                    rVar.e();
                }
            }
            Drawable drawable = null;
            this.f6364s = null;
            this.f6366v = 5;
            e eVar = this.f6351e;
            if (eVar != null) {
                eVar.k(this);
            }
            boolean z9 = true;
            this.B = true;
            try {
                List<f<R>> list = this.f6360o;
                if (list != null) {
                    for (f<R> b10 : list) {
                        j();
                        b10.b();
                    }
                }
                f<R> fVar = this.f6350d;
                if (fVar != null) {
                    j();
                    fVar.b();
                }
                e eVar2 = this.f6351e;
                if (eVar2 != null) {
                    if (!eVar2.d(this)) {
                        z9 = false;
                    }
                }
                if (z9) {
                    if (this.f6354h == null) {
                        if (this.f6368y == null) {
                            a<?> aVar = this.f6356j;
                            Drawable drawable2 = aVar.f6331o;
                            this.f6368y = drawable2;
                            if (drawable2 == null && (i12 = aVar.f6332p) > 0) {
                                this.f6368y = k(i12);
                            }
                        }
                        drawable = this.f6368y;
                    }
                    if (drawable == null) {
                        if (this.w == null) {
                            a<?> aVar2 = this.f6356j;
                            Drawable drawable3 = aVar2.f6322e;
                            this.w = drawable3;
                            if (drawable3 == null && (i11 = aVar2.f6323f) > 0) {
                                this.w = k(i11);
                            }
                        }
                        drawable = this.w;
                    }
                    if (drawable == null) {
                        drawable = d();
                    }
                    this.f6359n.c(drawable);
                }
                this.B = false;
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    public final void n(w wVar, Object obj, o1.a aVar) {
        j();
        this.f6366v = 4;
        this.f6363r = wVar;
        if (this.f6353g.f2561i <= 3) {
            StringBuilder g10 = androidx.activity.f.g("Finished loading ");
            g10.append(obj.getClass().getSimpleName());
            g10.append(" from ");
            g10.append(aVar);
            g10.append(" for ");
            g10.append(this.f6354h);
            g10.append(" with size [");
            g10.append(this.f6369z);
            g10.append("x");
            g10.append(this.A);
            g10.append("] in ");
            g10.append(j2.h.a(this.f6365t));
            g10.append(" ms");
            Log.d("Glide", g10.toString());
        }
        e eVar = this.f6351e;
        if (eVar != null) {
            eVar.b(this);
        }
        this.B = true;
        try {
            List<f<R>> list = this.f6360o;
            if (list != null) {
                for (f<R> a10 : list) {
                    a10.a(obj);
                }
            }
            f<R> fVar = this.f6350d;
            if (fVar != null) {
                fVar.a(obj);
            }
            this.f6361p.getClass();
            this.f6359n.a(obj);
        } finally {
            this.B = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r6.u.getClass();
        q1.m.e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(q1.w<?> r7, o1.a r8, boolean r9) {
        /*
            r6 = this;
            k2.d$a r9 = r6.f6348b
            r9.a()
            r9 = 0
            java.lang.Object r0 = r6.f6349c     // Catch:{ all -> 0x00c7 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c7 }
            r6.f6364s = r9     // Catch:{ all -> 0x00b9 }
            r1 = 5
            if (r7 != 0) goto L_0x0030
            q1.r r7 = new q1.r     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r8.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r8.append(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.Class<R> r2 = r6.f6355i     // Catch:{ all -> 0x00b9 }
            r8.append(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = " inside, but instead got null."
            r8.append(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b9 }
            r7.<init>(r8)     // Catch:{ all -> 0x00b9 }
            r6.m(r7, r1)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return
        L_0x0030:
            java.lang.Object r2 = r7.get()     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x0067
            java.lang.Class<R> r3 = r6.f6355i     // Catch:{ all -> 0x00b9 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b9 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b9 }
            if (r3 != 0) goto L_0x0043
            goto L_0x0067
        L_0x0043:
            f2.e r1 = r6.f6351e     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.c(r6)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0062
            r6.f6363r = r9     // Catch:{ all -> 0x00b5 }
            r8 = 4
            r6.f6366v = r8     // Catch:{ all -> 0x00b5 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            q1.m r8 = r6.u
            r8.getClass()
            q1.m.e(r7)
            return
        L_0x0062:
            r6.n(r7, r2, r8)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return
        L_0x0067:
            r6.f6363r = r9     // Catch:{ all -> 0x00b5 }
            q1.r r8 = new q1.r     // Catch:{ all -> 0x00b5 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b5 }
            r9.<init>()     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "Expected to receive an object of "
            r9.append(r3)     // Catch:{ all -> 0x00b5 }
            java.lang.Class<R> r3 = r6.f6355i     // Catch:{ all -> 0x00b5 }
            r9.append(r3)     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = " but instead got "
            r9.append(r3)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0086
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b5 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r3 = ""
        L_0x0088:
            r9.append(r3)     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "{"
            r9.append(r3)     // Catch:{ all -> 0x00b5 }
            r9.append(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "} inside Resource{"
            r9.append(r3)     // Catch:{ all -> 0x00b5 }
            r9.append(r7)     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "}."
            r9.append(r3)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00a5
            java.lang.String r2 = ""
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a7:
            r9.append(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b5 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b5 }
            r6.m(r8, r1)     // Catch:{ all -> 0x00b5 }
            goto L_0x0058
        L_0x00b5:
            r8 = move-exception
            r9 = r7
            r7 = r6
            goto L_0x00be
        L_0x00b9:
            r7 = move-exception
            r8 = r6
        L_0x00bb:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00be:
            monitor-exit(r0)     // Catch:{ all -> 0x00c2 }
            throw r8     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r8 = move-exception
            goto L_0x00c9
        L_0x00c2:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00bb
        L_0x00c7:
            r8 = move-exception
            r7 = r6
        L_0x00c9:
            if (r9 == 0) goto L_0x00d3
            q1.m r7 = r7.u
            r7.getClass()
            q1.m.e(r9)
        L_0x00d3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.i.o(q1.w, o1.a, boolean):void");
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f6349c) {
            obj = this.f6354h;
            cls = this.f6355i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
