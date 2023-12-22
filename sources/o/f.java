package o;

import java.util.Arrays;
import java.util.Comparator;
import o.b;

public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public h[] f10443f = new h[128];

    /* renamed from: g  reason: collision with root package name */
    public h[] f10444g = new h[128];

    /* renamed from: h  reason: collision with root package name */
    public int f10445h = 0;

    /* renamed from: i  reason: collision with root package name */
    public b f10446i = new b();

    public class a implements Comparator<h> {
        public final int compare(Object obj, Object obj2) {
            return ((h) obj).f10451b - ((h) obj2).f10451b;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public h f10447a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f10447a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder g10 = androidx.activity.f.g(str);
                    g10.append(this.f10447a.f10457h[i10]);
                    g10.append(" ");
                    str = g10.toString();
                }
            }
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(str, "] ");
            h10.append(this.f10447a);
            return h10.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.h a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f10445h
            if (r2 >= r4) goto L_0x0057
            o.h[] r4 = r11.f10443f
            r5 = r4[r2]
            int r6 = r5.f10451b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            o.f$b r6 = r11.f10446i
            r6.f10447a = r5
            r5 = 8
            r7 = 1
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r5 < 0) goto L_0x0032
            o.h r4 = r6.f10447a
            float[] r4 = r4.f10457h
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0032:
            r7 = r1
        L_0x0033:
            if (r7 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r5 < 0) goto L_0x0050
            float[] r8 = r4.f10457h
            r8 = r8[r5]
            o.h r9 = r6.f10447a
            float[] r9 = r9.f10457h
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r5 = r5 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r7 = r1
        L_0x0051:
            if (r7 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            o.h[] r12 = r11.f10443f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.a(boolean[]):o.h");
    }

    public final boolean e() {
        return this.f10445h == 0;
    }

    public final void i(d dVar, b bVar, boolean z9) {
        b bVar2 = bVar;
        h hVar = bVar2.f10416a;
        if (hVar != null) {
            b.a aVar = bVar2.f10419d;
            int d10 = aVar.d();
            for (int i10 = 0; i10 < d10; i10++) {
                h h10 = aVar.h(i10);
                float a10 = aVar.a(i10);
                b bVar3 = this.f10446i;
                bVar3.f10447a = h10;
                boolean z10 = true;
                if (h10.f10450a) {
                    for (int i11 = 0; i11 < 9; i11++) {
                        float[] fArr = bVar3.f10447a.f10457h;
                        float f10 = (hVar.f10457h[i11] * a10) + fArr[i11];
                        fArr[i11] = f10;
                        if (Math.abs(f10) < 1.0E-4f) {
                            bVar3.f10447a.f10457h[i11] = 0.0f;
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        f.this.k(bVar3.f10447a);
                    }
                    z10 = false;
                } else {
                    for (int i12 = 0; i12 < 9; i12++) {
                        float f11 = hVar.f10457h[i12];
                        if (f11 != 0.0f) {
                            float f12 = f11 * a10;
                            if (Math.abs(f12) < 1.0E-4f) {
                                f12 = 0.0f;
                            }
                            bVar3.f10447a.f10457h[i12] = f12;
                        } else {
                            bVar3.f10447a.f10457h[i12] = 0.0f;
                        }
                    }
                }
                if (z10) {
                    j(h10);
                }
                this.f10417b = (bVar2.f10417b * a10) + this.f10417b;
            }
            k(hVar);
        }
    }

    public final void j(h hVar) {
        int i10;
        int i11 = this.f10445h + 1;
        h[] hVarArr = this.f10443f;
        if (i11 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f10443f = hVarArr2;
            this.f10444g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f10443f;
        int i12 = this.f10445h;
        hVarArr3[i12] = hVar;
        int i13 = i12 + 1;
        this.f10445h = i13;
        if (i13 > 1 && hVarArr3[i13 - 1].f10451b > hVar.f10451b) {
            int i14 = 0;
            while (true) {
                i10 = this.f10445h;
                if (i14 >= i10) {
                    break;
                }
                this.f10444g[i14] = this.f10443f[i14];
                i14++;
            }
            Arrays.sort(this.f10444g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f10445h; i15++) {
                this.f10443f[i15] = this.f10444g[i15];
            }
        }
        hVar.f10450a = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i10 = 0;
        while (i10 < this.f10445h) {
            if (this.f10443f[i10] == hVar) {
                while (true) {
                    int i11 = this.f10445h;
                    if (i10 < i11 - 1) {
                        h[] hVarArr = this.f10443f;
                        int i12 = i10 + 1;
                        hVarArr[i10] = hVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f10445h = i11 - 1;
                        hVar.f10450a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public final String toString() {
        StringBuilder h10 = com.ironsource.adapters.ironsource.a.h("", " goal -> (");
        h10.append(this.f10417b);
        h10.append(") : ");
        String sb = h10.toString();
        for (int i10 = 0; i10 < this.f10445h; i10++) {
            this.f10446i.f10447a = this.f10443f[i10];
            StringBuilder g10 = androidx.activity.f.g(sb);
            g10.append(this.f10446i);
            g10.append(" ");
            sb = g10.toString();
        }
        return sb;
    }
}
