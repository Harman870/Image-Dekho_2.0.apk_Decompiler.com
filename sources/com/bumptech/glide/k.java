package com.bumptech.glide;

import c2.e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import d.u;
import e2.d;
import e2.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k2.a;
import o1.j;
import u1.n;
import u1.o;
import u1.p;
import u1.r;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final p f2570a;

    /* renamed from: b  reason: collision with root package name */
    public final e2.a f2571b;

    /* renamed from: c  reason: collision with root package name */
    public final e2.d f2572c;

    /* renamed from: d  reason: collision with root package name */
    public final e2.e f2573d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2574e;

    /* renamed from: f  reason: collision with root package name */
    public final c2.e f2575f;

    /* renamed from: g  reason: collision with root package name */
    public final u f2576g;

    /* renamed from: h  reason: collision with root package name */
    public final e2.c f2577h = new e2.c();

    /* renamed from: i  reason: collision with root package name */
    public final e2.b f2578i = new e2.b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f2579j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.c.<init>(java.lang.Object):void");
        }

        public <M> c(M m2, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public k() {
        a.c cVar = new a.c(new g0.f(20), new k2.b(), new k2.c());
        this.f2579j = cVar;
        this.f2570a = new p(cVar);
        this.f2571b = new e2.a();
        this.f2572c = new e2.d();
        this.f2573d = new e2.e();
        this.f2574e = new f();
        this.f2575f = new c2.e();
        this.f2576g = new u();
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        e2.d dVar = this.f2572c;
        synchronized (dVar) {
            ArrayList arrayList2 = new ArrayList(dVar.f6177a);
            dVar.f6177a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dVar.f6177a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    dVar.f6177a.add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, o oVar) {
        p pVar = this.f2570a;
        synchronized (pVar) {
            r rVar = pVar.f12138a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f12153a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f12139b.f12140a.clear();
        }
    }

    public final void b(Class cls, o1.k kVar) {
        e2.e eVar = this.f2573d;
        synchronized (eVar) {
            eVar.f6182a.add(new e.a(cls, kVar));
        }
    }

    public final void c(j jVar, Class cls, Class cls2, String str) {
        e2.d dVar = this.f2572c;
        synchronized (dVar) {
            dVar.a(str).add(new d.a(cls, cls2, jVar));
        }
    }

    public final List<ImageHeaderParser> d() {
        List<ImageHeaderParser> list;
        u uVar = this.f2576g;
        synchronized (uVar) {
            list = (List) uVar.f5966a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public final <Model> List<n<Model, ?>> e(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.f2570a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0154a aVar = (p.a.C0154a) pVar.f12139b.f12140a.get(cls);
            if (aVar == null) {
                list = null;
            } else {
                list = aVar.f12141a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f12138a.a(cls));
                pVar.f12139b.a(cls, list);
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z9 = true;
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = list.get(i10);
                if (nVar.b(model)) {
                    if (z9) {
                        emptyList = new ArrayList<>(size - i10);
                        z9 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public final <X> com.bumptech.glide.load.data.e<X> f(X x9) {
        com.bumptech.glide.load.data.e<X> b10;
        f fVar = this.f2574e;
        synchronized (fVar) {
            y3.a.h(x9);
            e.a aVar = (e.a) fVar.f2595a.get(x9.getClass());
            if (aVar == null) {
                Iterator it = fVar.f2595a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(x9.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f.f2594b;
            }
            b10 = aVar.b(x9);
        }
        return b10;
    }

    public final void g(e.a aVar) {
        f fVar = this.f2574e;
        synchronized (fVar) {
            fVar.f2595a.put(aVar.a(), aVar);
        }
    }

    public final void h(Class cls, Class cls2, c2.d dVar) {
        c2.e eVar = this.f2575f;
        synchronized (eVar) {
            eVar.f2375a.add(new e.a(cls, cls2, dVar));
        }
    }
}
