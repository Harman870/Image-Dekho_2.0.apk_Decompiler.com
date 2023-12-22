package c3;

import android.content.Context;
import d3.c;
import d3.d;
import d3.i;
import e3.b;
import f3.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import w2.h;
import w2.p;
import w2.s;
import x2.e;
import x2.m;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2419a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2420b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2421c;

    /* renamed from: d  reason: collision with root package name */
    public final u f2422d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f2423e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2424f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2425g;

    /* renamed from: h  reason: collision with root package name */
    public final a f2426h;

    /* renamed from: i  reason: collision with root package name */
    public final c f2427i;

    public q(Context context, e eVar, d dVar, u uVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f2419a = context;
        this.f2420b = eVar;
        this.f2421c = dVar;
        this.f2422d = uVar;
        this.f2423e = executor;
        this.f2424f = bVar;
        this.f2425g = aVar;
        this.f2426h = aVar2;
        this.f2427i = cVar;
    }

    public final void a(s sVar, int i10) {
        x2.b bVar;
        int i11;
        boolean z9;
        m a10 = this.f2420b.a(sVar.b());
        new x2.b(1, 0);
        long j10 = 0;
        while (((Boolean) this.f2424f.c(new j(this, sVar))).booleanValue()) {
            Iterable<i> iterable = (Iterable) this.f2424f.c(new k(this, sVar));
            if (iterable.iterator().hasNext()) {
                boolean z10 = false;
                if (a10 == null) {
                    a3.a.a(sVar, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                    bVar = new x2.b(3, -1);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (i a11 : iterable) {
                        arrayList.add(a11.a());
                    }
                    if (sVar.c() != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        b bVar2 = this.f2424f;
                        c cVar = this.f2427i;
                        Objects.requireNonNull(cVar);
                        z2.a aVar = (z2.a) bVar2.c(new g(cVar));
                        h.a aVar2 = new h.a();
                        aVar2.f12698f = new HashMap();
                        aVar2.f12696d = Long.valueOf(this.f2425g.a());
                        aVar2.f12697e = Long.valueOf(this.f2426h.a());
                        aVar2.d("GDT_CLIENT_METRICS");
                        t2.b bVar3 = new t2.b("proto");
                        aVar.getClass();
                        q6.h hVar = p.f12719a;
                        hVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            hVar.a(aVar, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        aVar2.c(new w2.m(bVar3, byteArrayOutputStream.toByteArray()));
                        arrayList.add(a10.b(aVar2.b()));
                    }
                    bVar = a10.a(new x2.a(arrayList, sVar.c()));
                }
                if (bVar.f12928a == 2) {
                    this.f2424f.c(new l(this, iterable, sVar, j10));
                    this.f2422d.a(sVar, i10 + 1, true);
                    return;
                }
                this.f2424f.c(new m(this, iterable));
                int i12 = bVar.f12928a;
                if (i12 == 1) {
                    j10 = Math.max(j10, bVar.f12929b);
                    if (sVar.c() != null) {
                        z10 = true;
                    }
                    if (z10) {
                        this.f2424f.c(new n(this));
                    }
                } else if (i12 == 4) {
                    HashMap hashMap = new HashMap();
                    for (i a12 : iterable) {
                        String g10 = a12.a().g();
                        if (!hashMap.containsKey(g10)) {
                            i11 = 1;
                        } else {
                            i11 = Integer.valueOf(((Integer) hashMap.get(g10)).intValue() + 1);
                        }
                        hashMap.put(g10, i11);
                    }
                    this.f2424f.c(new o(this, hashMap));
                }
            } else {
                return;
            }
        }
        this.f2424f.c(new p(this, sVar, j10));
    }
}
