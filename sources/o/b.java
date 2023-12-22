package o;

import java.util.ArrayList;
import o.d;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public h f10416a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f10417b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<h> f10418c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f10419d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10420e = false;

    public interface a {
        float a(int i10);

        void b(h hVar, float f10, boolean z9);

        void c(h hVar, float f10);

        void clear();

        int d();

        boolean e(h hVar);

        float f(b bVar, boolean z9);

        float g(h hVar);

        h h(int i10);

        void i(float f10);

        float j(h hVar, boolean z9);

        void k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f10419d = new a(this, cVar);
    }

    public h a(boolean[] zArr) {
        return f(zArr, (h) null);
    }

    public final void b(d dVar, int i10) {
        this.f10419d.c(dVar.k(i10), 1.0f);
        this.f10419d.c(dVar.k(i10), -1.0f);
    }

    public final void c(h hVar, h hVar2, h hVar3, int i10) {
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            this.f10417b = (float) i10;
        }
        if (!z9) {
            this.f10419d.c(hVar, -1.0f);
            this.f10419d.c(hVar2, 1.0f);
            this.f10419d.c(hVar3, 1.0f);
            return;
        }
        this.f10419d.c(hVar, 1.0f);
        this.f10419d.c(hVar2, -1.0f);
        this.f10419d.c(hVar3, -1.0f);
    }

    public final void d(h hVar, h hVar2, h hVar3, int i10) {
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            this.f10417b = (float) i10;
        }
        if (!z9) {
            this.f10419d.c(hVar, -1.0f);
            this.f10419d.c(hVar2, 1.0f);
            this.f10419d.c(hVar3, -1.0f);
            return;
        }
        this.f10419d.c(hVar, 1.0f);
        this.f10419d.c(hVar2, -1.0f);
        this.f10419d.c(hVar3, 1.0f);
    }

    public boolean e() {
        return this.f10416a == null && this.f10417b == 0.0f && this.f10419d.d() == 0;
    }

    public final h f(boolean[] zArr, h hVar) {
        int i10;
        int d10 = this.f10419d.d();
        h hVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < d10; i11++) {
            float a10 = this.f10419d.a(i11);
            if (a10 < 0.0f) {
                h h10 = this.f10419d.h(i11);
                if ((zArr == null || !zArr[h10.f10451b]) && h10 != hVar && (((i10 = h10.f10458i) == 3 || i10 == 4) && a10 < f10)) {
                    f10 = a10;
                    hVar2 = h10;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.f10416a;
        if (hVar2 != null) {
            this.f10419d.c(hVar2, -1.0f);
            this.f10416a.f10452c = -1;
            this.f10416a = null;
        }
        float j10 = this.f10419d.j(hVar, true) * -1.0f;
        this.f10416a = hVar;
        if (j10 != 1.0f) {
            this.f10417b /= j10;
            this.f10419d.i(j10);
        }
    }

    public final void h(d dVar, h hVar, boolean z9) {
        if (hVar != null && hVar.f10455f) {
            float g10 = this.f10419d.g(hVar);
            this.f10417b = (hVar.f10454e * g10) + this.f10417b;
            this.f10419d.j(hVar, z9);
            if (z9) {
                hVar.b(this);
            }
            if (this.f10419d.d() == 0) {
                this.f10420e = true;
                dVar.f10427a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z9) {
        float f10 = this.f10419d.f(bVar, z9);
        this.f10417b = (bVar.f10417b * f10) + this.f10417b;
        if (z9) {
            bVar.f10416a.b(this);
        }
        if (this.f10416a != null && this.f10419d.d() == 0) {
            this.f10420e = true;
            dVar.f10427a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            o.h r0 = r10.f10416a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            o.h r1 = r10.f10416a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.ironsource.adapters.ironsource.a.g(r0, r1)
            float r1 = r10.f10417b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            float r1 = r10.f10417b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            o.b$a r5 = r10.f10419d
            int r5 = r5.d()
        L_0x003b:
            if (r3 >= r5) goto L_0x009f
            o.b$a r6 = r10.f10419d
            o.h r6 = r6.h(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x009c
        L_0x0046:
            o.b$a r7 = r10.f10419d
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x009c
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            java.lang.String r1 = "- "
            goto L_0x0076
        L_0x0064:
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            if (r8 <= 0) goto L_0x0074
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x007e
        L_0x0074:
            java.lang.String r1 = " - "
        L_0x0076:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L_0x007e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x008a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0097
        L_0x008a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x0097:
            java.lang.String r0 = androidx.activity.e.c(r1, r0, r6)
            r1 = r4
        L_0x009c:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009f:
            if (r1 != 0) goto L_0x00a7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.ironsource.adapters.ironsource.a.g(r0, r1)
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.toString():java.lang.String");
    }
}
