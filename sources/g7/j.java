package g7;

import e7.h;
import e7.t;
import e7.u;
import f7.c;
import f7.d;
import java.util.Collections;
import java.util.List;
import k7.b;

public final class j implements u, Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final j f6599f = new j();

    /* renamed from: a  reason: collision with root package name */
    public double f6600a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    public int f6601b = 136;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6602c = true;

    /* renamed from: d  reason: collision with root package name */
    public List<e7.a> f6603d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public List<e7.a> f6604e = Collections.emptyList();

    public class a extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public t<T> f6605a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f6606b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f6607c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h f6608d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ j7.a f6609e;

        public a(boolean z9, boolean z10, h hVar, j7.a aVar) {
            this.f6606b = z9;
            this.f6607c = z10;
            this.f6608d = hVar;
            this.f6609e = aVar;
        }

        public final T a(k7.a aVar) {
            if (this.f6606b) {
                aVar.b0();
                return null;
            }
            t<T> tVar = this.f6605a;
            if (tVar == null) {
                tVar = this.f6608d.c(j.this, this.f6609e);
                this.f6605a = tVar;
            }
            return tVar.a(aVar);
        }

        public final void b(b bVar, T t10) {
            if (this.f6607c) {
                bVar.v();
                return;
            }
            t<T> tVar = this.f6605a;
            if (tVar == null) {
                tVar = this.f6608d.c(j.this, this.f6609e);
                this.f6605a = tVar;
            }
            tVar.b(bVar, t10);
        }
    }

    public final <T> t<T> b(h hVar, j7.a<T> aVar) {
        Class<? super T> cls = aVar.f8776a;
        boolean c10 = c(cls, true);
        boolean c11 = c(cls, false);
        if (c10 || c11) {
            return new a(c11, c10, hVar, aVar);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.lang.Class<?> r5, boolean r6) {
        /*
            r4 = this;
            double r0 = r4.f6600a
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.Class<f7.c> r0 = f7.c.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            f7.c r0 = (f7.c) r0
            java.lang.Class<f7.d> r2 = f7.d.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            f7.d r2 = (f7.d) r2
            boolean r0 = r4.d(r0, r2)
            if (r0 != 0) goto L_0x0020
            return r1
        L_0x0020:
            boolean r0 = r4.f6602c
            r2 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r5.isMemberClass()
            if (r0 == 0) goto L_0x003a
            int r0 = r5.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0035
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 != 0) goto L_0x003a
            r0 = r1
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return r1
        L_0x003e:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L_0x0054
            boolean r0 = r5.isAnonymousClass()
            if (r0 != 0) goto L_0x0052
            boolean r5 = r5.isLocalClass()
            if (r5 == 0) goto L_0x0054
        L_0x0052:
            r5 = r1
            goto L_0x0055
        L_0x0054:
            r5 = r2
        L_0x0055:
            if (r5 == 0) goto L_0x0058
            return r1
        L_0x0058:
            if (r6 == 0) goto L_0x005d
            java.util.List<e7.a> r5 = r4.f6603d
            goto L_0x005f
        L_0x005d:
            java.util.List<e7.a> r5 = r4.f6604e
        L_0x005f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0063:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0076
            java.lang.Object r6 = r5.next()
            e7.a r6 = (e7.a) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x0063
            return r1
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.j.c(java.lang.Class, boolean):boolean");
    }

    public final Object clone() {
        try {
            return (j) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean d(c cVar, d dVar) {
        boolean z9;
        boolean z10;
        if (cVar == null || cVar.value() <= this.f6600a) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        if (dVar == null || dVar.value() > this.f6600a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
