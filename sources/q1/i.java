package q1;

import c.a;
import c2.d;
import c2.e;
import com.bumptech.glide.h;
import com.bumptech.glide.k;
import e2.a;
import e2.b;
import e2.c;
import e2.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o1.f;
import o1.l;
import q1.j;
import u1.n;
import u1.p;

public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11003a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11004b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public h f11005c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11006d;

    /* renamed from: e  reason: collision with root package name */
    public int f11007e;

    /* renamed from: f  reason: collision with root package name */
    public int f11008f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f11009g;

    /* renamed from: h  reason: collision with root package name */
    public j.d f11010h;

    /* renamed from: i  reason: collision with root package name */
    public o1.h f11011i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, l<?>> f11012j;
    public Class<Transcode> k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11013l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11014m;

    /* renamed from: n  reason: collision with root package name */
    public f f11015n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.j f11016o;

    /* renamed from: p  reason: collision with root package name */
    public l f11017p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11018q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11019r;

    public final ArrayList a() {
        if (!this.f11014m) {
            this.f11014m = true;
            this.f11004b.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) b10.get(i10);
                if (!this.f11004b.contains(aVar.f12135a)) {
                    this.f11004b.add(aVar.f12135a);
                }
                for (int i11 = 0; i11 < aVar.f12136b.size(); i11++) {
                    if (!this.f11004b.contains(aVar.f12136b.get(i11))) {
                        this.f11004b.add(aVar.f12136b.get(i11));
                    }
                }
            }
        }
        return this.f11004b;
    }

    public final ArrayList b() {
        if (!this.f11013l) {
            this.f11013l = true;
            this.f11003a.clear();
            List e10 = this.f11005c.a().e(this.f11006d);
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a a10 = ((n) e10.get(i10)).a(this.f11006d, this.f11007e, this.f11008f, this.f11011i);
                if (a10 != null) {
                    this.f11003a.add(a10);
                }
            }
        }
        return this.f11003a;
    }

    public final <Data> u<Data, ?, Transcode> c(Class<Data> cls) {
        u<Data, ?, Transcode> orDefault;
        u<Data, ?, Transcode> uVar;
        u<?, ?, ?> uVar2;
        ArrayList arrayList;
        boolean z9;
        d dVar;
        d dVar2;
        boolean z10;
        Class<Data> cls2 = cls;
        k a10 = this.f11005c.a();
        Class<?> cls3 = this.f11009g;
        Class<Transcode> cls4 = this.k;
        b bVar = a10.f2578i;
        j2.k andSet = bVar.f6174b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new j2.k();
        }
        andSet.f8026a = cls2;
        andSet.f8027b = cls3;
        andSet.f8028c = cls4;
        synchronized (bVar.f6173a) {
            orDefault = bVar.f6173a.getOrDefault(andSet, null);
        }
        bVar.f6174b.set(andSet);
        a10.f2578i.getClass();
        if (b.f6172c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a10.f2572c.b(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = a10.f2575f.a(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    e2.d dVar3 = a10.f2572c;
                    synchronized (dVar3) {
                        arrayList = new ArrayList();
                        Iterator it3 = dVar3.f6177a.iterator();
                        while (it3.hasNext()) {
                            List<d.a> list = (List) dVar3.f6178b.get((String) it3.next());
                            if (list != null) {
                                for (d.a aVar : list) {
                                    if (!aVar.f6179a.isAssignableFrom(cls2) || !cls5.isAssignableFrom(aVar.f6180b)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        arrayList.add(aVar.f6181c);
                                    }
                                }
                            }
                        }
                    }
                    e eVar = a10.f2575f;
                    synchronized (eVar) {
                        if (cls6.isAssignableFrom(cls5)) {
                            dVar = a.f2340a;
                        } else {
                            Iterator it4 = eVar.f2375a.iterator();
                            while (it4.hasNext()) {
                                e.a aVar2 = (e.a) it4.next();
                                if (!aVar2.f2376a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f2377b)) {
                                    z9 = false;
                                    continue;
                                } else {
                                    z9 = true;
                                    continue;
                                }
                                if (z9) {
                                    dVar = aVar2.f2378c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                        dVar2 = dVar;
                    }
                    k kVar = r2;
                    k kVar2 = new k(cls, cls5, cls6, arrayList, dVar2, a10.f2579j);
                    arrayList2.add(kVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            uVar = null;
        } else {
            uVar = new u<>(cls, cls3, cls4, arrayList2, a10.f2579j);
        }
        b bVar2 = a10.f2578i;
        synchronized (bVar2.f6173a) {
            m.b<j2.k, u<?, ?, ?>> bVar3 = bVar2.f6173a;
            j2.k kVar3 = new j2.k(cls2, cls3, cls4);
            if (uVar != null) {
                uVar2 = uVar;
            } else {
                uVar2 = b.f6172c;
            }
            bVar3.put(kVar3, uVar2);
        }
        return uVar;
    }

    public final List<Class<?>> d() {
        List<Class<?>> list;
        ArrayList d10;
        k a10 = this.f11005c.a();
        Class<?> cls = this.f11006d.getClass();
        Class<?> cls2 = this.f11009g;
        Class<Transcode> cls3 = this.k;
        c cVar = a10.f2577h;
        j2.k kVar = (j2.k) ((AtomicReference) cVar.f6175a).getAndSet((Object) null);
        if (kVar == null) {
            kVar = new j2.k(cls, cls2, cls3);
        } else {
            kVar.f8026a = cls;
            kVar.f8027b = cls2;
            kVar.f8028c = cls3;
        }
        synchronized (((m.b) cVar.f6176b)) {
            list = (List) ((m.b) cVar.f6176b).getOrDefault(kVar, null);
        }
        ((AtomicReference) cVar.f6175a).set(kVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            p pVar = a10.f2570a;
            synchronized (pVar) {
                d10 = pVar.f12138a.d(cls);
            }
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                Iterator it2 = a10.f2572c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a10.f2575f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            c cVar2 = a10.f2577h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((m.b) cVar2.f6176b)) {
                ((m.b) cVar2.f6176b).put(new j2.k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final <X> o1.d<X> e(X x9) {
        o1.d<T> dVar;
        e2.a aVar = this.f11005c.a().f2571b;
        Class<?> cls = x9.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f6169a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0078a aVar2 = (a.C0078a) it.next();
                if (aVar2.f6170a.isAssignableFrom(cls)) {
                    dVar = aVar2.f6171b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new k.e(x9.getClass());
    }

    public final <Z> l<Z> f(Class<Z> cls) {
        l<Z> lVar = this.f11012j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, l<?>>> it = this.f11012j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f11012j.isEmpty() || !this.f11018q) {
            return w1.b.f12665b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
