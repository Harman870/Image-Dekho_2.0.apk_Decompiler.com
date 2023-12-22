package e9;

import h9.c;
import q8.b;
import q8.d;
import q8.e;
import q8.f;
import w8.l;
import x8.g;

public abstract class p extends q8.a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6257a = new a();

    public static final class a extends b<e, p> {

        /* renamed from: e9.p$a$a  reason: collision with other inner class name */
        public static final class C0081a extends g implements l<f.b, p> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0081a f6258c = new C0081a();

            public C0081a() {
                super(1);
            }

            public final Object invoke(Object obj) {
                f.b bVar = (f.b) obj;
                if (bVar instanceof p) {
                    return (p) bVar;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f11373a, C0081a.f6258c);
        }
    }

    public p() {
        super(e.a.f11373a);
    }

    public abstract void L(f fVar, Runnable runnable);

    public boolean M() {
        return !(this instanceof z0);
    }

    public final c c(s8.c cVar) {
        return new c(this, cVar);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        boolean z9;
        x8.f.f(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> key = getKey();
            x8.f.f(key, "key");
            if (key == bVar || bVar.f11368b == key) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                E a10 = bVar.a(this);
                if (a10 instanceof f.b) {
                    return a10;
                }
            }
        } else if (e.a.f11373a == cVar) {
            return this;
        }
        return null;
    }

    public final void j(d<?> dVar) {
        ((c) dVar).l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r3.a(r2) != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (q8.e.a.f11373a == r3) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q8.f minusKey(q8.f.c<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            x8.f.f(r3, r0)
            boolean r1 = r3 instanceof q8.b
            if (r1 == 0) goto L_0x0025
            q8.b r3 = (q8.b) r3
            q8.f$c r1 = r2.getKey()
            x8.f.f(r1, r0)
            if (r1 == r3) goto L_0x001b
            q8.f$c<?> r0 = r3.f11368b
            if (r0 != r1) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x002c
            q8.f$b r3 = r3.a(r2)
            if (r3 == 0) goto L_0x002c
            goto L_0x0029
        L_0x0025:
            q8.e$a r0 = q8.e.a.f11373a
            if (r0 != r3) goto L_0x002c
        L_0x0029:
            q8.g r3 = q8.g.f11375a
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.p.minusKey(q8.f$c):q8.f");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + t.c(this);
    }
}
