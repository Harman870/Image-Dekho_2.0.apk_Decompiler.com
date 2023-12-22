package j6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import r6.c;

public final class w implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<v<?>> f8770a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<v<?>> f8771b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<v<?>> f8772c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<v<?>> f8773d;

    /* renamed from: e  reason: collision with root package name */
    public final b f8774e;

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final c f8775a;

        public a(c cVar) {
            this.f8775a = cVar;
        }
    }

    public w(a aVar, i iVar) {
        boolean z9;
        boolean z10;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (k next : aVar.f8719c) {
            int i10 = next.f8750c;
            boolean z11 = true;
            if (i10 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (next.f8749b != 2 ? false : z11) {
                    hashSet4.add(next.f8748a);
                } else {
                    hashSet.add(next.f8748a);
                }
            } else {
                if (i10 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    hashSet3.add(next.f8748a);
                } else {
                    if (next.f8749b != 2 ? false : z11) {
                        hashSet5.add(next.f8748a);
                    } else {
                        hashSet2.add(next.f8748a);
                    }
                }
            }
        }
        if (!aVar.f8723g.isEmpty()) {
            hashSet.add(v.a(c.class));
        }
        this.f8770a = Collections.unmodifiableSet(hashSet);
        this.f8771b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f8772c = Collections.unmodifiableSet(hashSet4);
        this.f8773d = Collections.unmodifiableSet(hashSet5);
        Set<Class<?>> set = aVar.f8723g;
        this.f8774e = iVar;
    }

    public final <T> T a(Class<T> cls) {
        if (this.f8770a.contains(v.a(cls))) {
            T a10 = this.f8774e.a(cls);
            return !cls.equals(c.class) ? a10 : new a((c) a10);
        }
        throw new m(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public final <T> u6.a<T> b(v<T> vVar) {
        if (this.f8771b.contains(vVar)) {
            return this.f8774e.b(vVar);
        }
        throw new m(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{vVar}));
    }

    public final <T> T c(v<T> vVar) {
        if (this.f8770a.contains(vVar)) {
            return this.f8774e.c(vVar);
        }
        throw new m(String.format("Attempting to request an undeclared dependency %s.", new Object[]{vVar}));
    }

    public final <T> u6.a<T> d(Class<T> cls) {
        return b(v.a(cls));
    }

    public final <T> u6.a<Set<T>> e(v<T> vVar) {
        if (this.f8773d.contains(vVar)) {
            return this.f8774e.e(vVar);
        }
        throw new m(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{vVar}));
    }

    public final <T> Set<T> f(v<T> vVar) {
        if (this.f8772c.contains(vVar)) {
            return this.f8774e.f(vVar);
        }
        throw new m(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{vVar}));
    }
}
