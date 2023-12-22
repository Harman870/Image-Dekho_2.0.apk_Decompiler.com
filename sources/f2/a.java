package f2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.j;
import com.ironsource.mediationsdk.logger.IronSourceError;
import f2.a;
import j2.b;
import o1.f;
import o1.g;
import o1.h;
import q1.l;
import x1.e;
import x1.i;
import x1.l;

public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public int f6318a;

    /* renamed from: b  reason: collision with root package name */
    public float f6319b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public l f6320c = l.f11058c;

    /* renamed from: d  reason: collision with root package name */
    public j f6321d = j.NORMAL;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f6322e;

    /* renamed from: f  reason: collision with root package name */
    public int f6323f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f6324g;

    /* renamed from: h  reason: collision with root package name */
    public int f6325h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6326i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f6327j = -1;
    public int k = -1;

    /* renamed from: l  reason: collision with root package name */
    public f f6328l = i2.a.f7120b;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6329m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6330n = true;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f6331o;

    /* renamed from: p  reason: collision with root package name */
    public int f6332p;

    /* renamed from: q  reason: collision with root package name */
    public h f6333q = new h();

    /* renamed from: r  reason: collision with root package name */
    public b f6334r = new b();

    /* renamed from: s  reason: collision with root package name */
    public Class<?> f6335s = Object.class;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6336t;
    public Resources.Theme u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6337v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6338x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6339y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6340z;

    public static boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T b(a<?> aVar) {
        if (this.f6337v) {
            return clone().b(aVar);
        }
        if (f(aVar.f6318a, 2)) {
            this.f6319b = aVar.f6319b;
        }
        if (f(aVar.f6318a, 262144)) {
            this.w = aVar.w;
        }
        if (f(aVar.f6318a, 1048576)) {
            this.f6340z = aVar.f6340z;
        }
        if (f(aVar.f6318a, 4)) {
            this.f6320c = aVar.f6320c;
        }
        if (f(aVar.f6318a, 8)) {
            this.f6321d = aVar.f6321d;
        }
        if (f(aVar.f6318a, 16)) {
            this.f6322e = aVar.f6322e;
            this.f6323f = 0;
            this.f6318a &= -33;
        }
        if (f(aVar.f6318a, 32)) {
            this.f6323f = aVar.f6323f;
            this.f6322e = null;
            this.f6318a &= -17;
        }
        if (f(aVar.f6318a, 64)) {
            this.f6324g = aVar.f6324g;
            this.f6325h = 0;
            this.f6318a &= -129;
        }
        if (f(aVar.f6318a, 128)) {
            this.f6325h = aVar.f6325h;
            this.f6324g = null;
            this.f6318a &= -65;
        }
        if (f(aVar.f6318a, 256)) {
            this.f6326i = aVar.f6326i;
        }
        if (f(aVar.f6318a, 512)) {
            this.k = aVar.k;
            this.f6327j = aVar.f6327j;
        }
        if (f(aVar.f6318a, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES)) {
            this.f6328l = aVar.f6328l;
        }
        if (f(aVar.f6318a, 4096)) {
            this.f6335s = aVar.f6335s;
        }
        if (f(aVar.f6318a, 8192)) {
            this.f6331o = aVar.f6331o;
            this.f6332p = 0;
            this.f6318a &= -16385;
        }
        if (f(aVar.f6318a, 16384)) {
            this.f6332p = aVar.f6332p;
            this.f6331o = null;
            this.f6318a &= -8193;
        }
        if (f(aVar.f6318a, 32768)) {
            this.u = aVar.u;
        }
        if (f(aVar.f6318a, 65536)) {
            this.f6330n = aVar.f6330n;
        }
        if (f(aVar.f6318a, 131072)) {
            this.f6329m = aVar.f6329m;
        }
        if (f(aVar.f6318a, 2048)) {
            this.f6334r.putAll(aVar.f6334r);
            this.f6339y = aVar.f6339y;
        }
        if (f(aVar.f6318a, 524288)) {
            this.f6338x = aVar.f6338x;
        }
        if (!this.f6330n) {
            this.f6334r.clear();
            this.f6329m = false;
            this.f6318a = this.f6318a & -2049 & -131073;
            this.f6339y = true;
        }
        this.f6318a |= aVar.f6318a;
        this.f6333q.f10519b.i(aVar.f6333q.f10519b);
        k();
        return this;
    }

    /* renamed from: c */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            h hVar = new h();
            t10.f6333q = hVar;
            hVar.f10519b.i(this.f6333q.f10519b);
            b bVar = new b();
            t10.f6334r = bVar;
            bVar.putAll(this.f6334r);
            t10.f6336t = false;
            t10.f6337v = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T d(Class<?> cls) {
        if (this.f6337v) {
            return clone().d(cls);
        }
        this.f6335s = cls;
        this.f6318a |= 4096;
        k();
        return this;
    }

    public final T e(l lVar) {
        if (this.f6337v) {
            return clone().e(lVar);
        }
        y3.a.h(lVar);
        this.f6320c = lVar;
        this.f6318a |= 4;
        k();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f6319b, this.f6319b) == 0 && this.f6323f == aVar.f6323f && j2.l.b(this.f6322e, aVar.f6322e) && this.f6325h == aVar.f6325h && j2.l.b(this.f6324g, aVar.f6324g) && this.f6332p == aVar.f6332p && j2.l.b(this.f6331o, aVar.f6331o) && this.f6326i == aVar.f6326i && this.f6327j == aVar.f6327j && this.k == aVar.k && this.f6329m == aVar.f6329m && this.f6330n == aVar.f6330n && this.w == aVar.w && this.f6338x == aVar.f6338x && this.f6320c.equals(aVar.f6320c) && this.f6321d == aVar.f6321d && this.f6333q.equals(aVar.f6333q) && this.f6334r.equals(aVar.f6334r) && this.f6335s.equals(aVar.f6335s) && j2.l.b(this.f6328l, aVar.f6328l) && j2.l.b(this.u, aVar.u);
        }
    }

    public final T g() {
        T h10 = h(x1.l.f12867b, new i());
        h10.f6339y = true;
        return h10;
    }

    public final a h(x1.l lVar, e eVar) {
        if (this.f6337v) {
            return clone().h(lVar, eVar);
        }
        g<x1.l> gVar = x1.l.f12871f;
        y3.a.h(lVar);
        l(gVar, lVar);
        return p(eVar, false);
    }

    public int hashCode() {
        float f10 = this.f6319b;
        char[] cArr = j2.l.f8029a;
        return j2.l.g(j2.l.g(j2.l.g(j2.l.g(j2.l.g(j2.l.g(j2.l.g(j2.l.h(j2.l.h(j2.l.h(j2.l.h((((j2.l.h(j2.l.g((j2.l.g((j2.l.g(((Float.floatToIntBits(f10) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f6323f, this.f6322e) * 31) + this.f6325h, this.f6324g) * 31) + this.f6332p, this.f6331o), this.f6326i) * 31) + this.f6327j) * 31) + this.k, this.f6329m), this.f6330n), this.w), this.f6338x), this.f6320c), this.f6321d), this.f6333q), this.f6334r), this.f6335s), this.f6328l), this.u);
    }

    public final T i(int i10, int i11) {
        if (this.f6337v) {
            return clone().i(i10, i11);
        }
        this.k = i10;
        this.f6327j = i11;
        this.f6318a |= 512;
        k();
        return this;
    }

    public final a j() {
        j jVar = j.LOW;
        if (this.f6337v) {
            return clone().j();
        }
        this.f6321d = jVar;
        this.f6318a |= 8;
        k();
        return this;
    }

    public final void k() {
        if (this.f6336t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o1.g<Y>, o1.g, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T l(o1.g<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f6337v
            if (r0 == 0) goto L_0x000d
            f2.a r0 = r1.clone()
            f2.a r2 = r0.l(r2, r3)
            return r2
        L_0x000d:
            y3.a.h(r2)
            y3.a.h(r3)
            o1.h r0 = r1.f6333q
            j2.b r0 = r0.f10519b
            r0.put(r2, r3)
            r1.k()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.l(o1.g, java.lang.Object):f2.a");
    }

    public final a m(i2.b bVar) {
        if (this.f6337v) {
            return clone().m(bVar);
        }
        this.f6328l = bVar;
        this.f6318a |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        k();
        return this;
    }

    public final a n() {
        if (this.f6337v) {
            return clone().n();
        }
        this.f6326i = false;
        this.f6318a |= 256;
        k();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [o1.l, java.lang.Object, o1.l<Y>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T o(java.lang.Class<Y> r2, o1.l<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f6337v
            if (r0 == 0) goto L_0x000d
            f2.a r0 = r1.clone()
            f2.a r2 = r0.o(r2, r3, r4)
            return r2
        L_0x000d:
            y3.a.h(r3)
            j2.b r0 = r1.f6334r
            r0.put(r2, r3)
            int r2 = r1.f6318a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f6330n = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f6318a = r2
            r0 = 0
            r1.f6339y = r0
            if (r4 == 0) goto L_0x002d
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f6318a = r2
            r1.f6329m = r3
        L_0x002d:
            r1.k()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.o(java.lang.Class, o1.l, boolean):f2.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [o1.l, o1.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T p(o1.l<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f6337v
            if (r0 == 0) goto L_0x000d
            f2.a r0 = r2.clone()
            f2.a r3 = r0.p(r3, r4)
            return r3
        L_0x000d:
            x1.o r0 = new x1.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.o(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.o(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.o(r1, r0, r4)
            java.lang.Class<b2.c> r0 = b2.c.class
            b2.e r1 = new b2.e
            r1.<init>(r3)
            r2.o(r0, r1, r4)
            r2.k()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.p(o1.l, boolean):f2.a");
    }

    public final a q(l.c cVar, x1.j jVar) {
        if (this.f6337v) {
            return clone().q(cVar, jVar);
        }
        g<x1.l> gVar = x1.l.f12871f;
        y3.a.h(cVar);
        l(gVar, cVar);
        return p(jVar, true);
    }

    public final a r() {
        if (this.f6337v) {
            return clone().r();
        }
        this.f6340z = true;
        this.f6318a |= 1048576;
        k();
        return this;
    }
}
