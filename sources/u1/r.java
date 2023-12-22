package u1;

import com.bumptech.glide.k;
import g0.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k2.a;
import o1.h;
import u1.n;

public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f12151e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final a f12152f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12153a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f12154b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f12155c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f12156d;

    public static class a implements n<Object, Object> {
        public final n.a<Object> a(Object obj, int i10, int i11, h hVar) {
            return null;
        }

        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f12157a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f12158b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f12159c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f12157a = cls;
            this.f12158b = cls2;
            this.f12159c = oVar;
        }
    }

    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f12151e;
        this.f12156d = cVar;
        this.f12154b = cVar2;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f12153a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f12155c.contains(bVar)) {
                    if (bVar.f12157a.isAssignableFrom(cls)) {
                        this.f12155c.add(bVar);
                        n<? extends Model, ? extends Data> b10 = bVar.f12159c.b(this);
                        y3.a.h(b10);
                        arrayList.add(b10);
                        this.f12155c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f12155c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        boolean z9;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f12153a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (this.f12155c.contains(bVar)) {
                    z10 = true;
                } else {
                    if (!bVar.f12157a.isAssignableFrom(cls) || !bVar.f12158b.isAssignableFrom(cls2)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9) {
                        this.f12155c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f12155c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f12154b;
                d<List<Throwable>> dVar = this.f12156d;
                cVar.getClass();
                return new q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f12152f;
            } else {
                throw new k.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f12155c.clear();
            throw th;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<? extends Model, ? extends Data> b10 = bVar.f12159c.b(this);
        y3.a.h(b10);
        return b10;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f12153a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f12158b) && bVar.f12157a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f12158b);
            }
        }
        return arrayList;
    }
}
