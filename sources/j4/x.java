package j4;

import java.util.ArrayList;
import o.c;

public final class x extends w {
    public x() {
        this.f8532a.add(g0.EQUALS);
        this.f8532a.add(g0.GREATER_THAN);
        this.f8532a.add(g0.GREATER_THAN_EQUALS);
        this.f8532a.add(g0.IDENTITY_EQUALS);
        this.f8532a.add(g0.IDENTITY_NOT_EQUALS);
        this.f8532a.add(g0.LESS_THAN);
        this.f8532a.add(g0.LESS_THAN_EQUALS);
        this.f8532a.add(g0.NOT_EQUALS);
    }

    public static boolean c(p pVar, p pVar2) {
        if (pVar.getClass().equals(pVar2.getClass())) {
            if ((pVar instanceof u) || (pVar instanceof n)) {
                return true;
            }
            return pVar instanceof i ? !Double.isNaN(pVar.b().doubleValue()) && !Double.isNaN(pVar2.b().doubleValue()) && pVar.b().doubleValue() == pVar2.b().doubleValue() : pVar instanceof t ? pVar.zzi().equals(pVar2.zzi()) : pVar instanceof g ? pVar.k().equals(pVar2.k()) : pVar == pVar2;
        } else if (((pVar instanceof u) || (pVar instanceof n)) && ((pVar2 instanceof u) || (pVar2 instanceof n))) {
            return true;
        } else {
            boolean z9 = pVar instanceof i;
            if (z9 && (pVar2 instanceof t)) {
                return c(pVar, new i(pVar2.b()));
            }
            boolean z10 = pVar instanceof t;
            if (z10 && (pVar2 instanceof i)) {
                return c(new i(pVar.b()), pVar2);
            }
            if (pVar instanceof g) {
                return c(new i(pVar.b()), pVar2);
            }
            if (pVar2 instanceof g) {
                return c(pVar, new i(pVar2.b()));
            }
            if ((z10 || z9) && (pVar2 instanceof l)) {
                return c(pVar, new t(pVar2.zzi()));
            }
            if (!(pVar instanceof l) || (!(pVar2 instanceof t) && !(pVar2 instanceof i))) {
                return false;
            }
            return c(new t(pVar.zzi()), pVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(j4.p r8, j4.p r9) {
        /*
            boolean r0 = r8 instanceof j4.l
            if (r0 == 0) goto L_0x000e
            j4.t r0 = new j4.t
            java.lang.String r8 = r8.zzi()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof j4.l
            if (r0 == 0) goto L_0x001c
            j4.t r0 = new j4.t
            java.lang.String r9 = r9.zzi()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof j4.t
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof j4.t
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.zzi()
            java.lang.String r9 = r9.zzi()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.b()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.b()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.x.d(j4.p, j4.p):boolean");
    }

    public static boolean e(p pVar, p pVar2) {
        if (pVar instanceof l) {
            pVar = new t(pVar.zzi());
        }
        if (pVar2 instanceof l) {
            pVar2 = new t(pVar2.zzi());
        }
        return (((pVar instanceof t) && (pVar2 instanceof t)) || (!Double.isNaN(pVar.b().doubleValue()) && !Double.isNaN(pVar2.b().doubleValue()))) && !d(pVar2, pVar);
    }

    public final p a(String str, c cVar, ArrayList arrayList) {
        boolean z9;
        boolean z10;
        j4.h(j4.e(str).name(), 2, arrayList);
        p b10 = cVar.b((p) arrayList.get(0));
        p b11 = cVar.b((p) arrayList.get(1));
        int ordinal = j4.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                z10 = c(b10, b11);
            } else if (ordinal == 42) {
                z9 = d(b10, b11);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z9 = d(b11, b10);
                        break;
                    case 38:
                        z9 = e(b11, b10);
                        break;
                    case 39:
                        z9 = j4.l(b10, b11);
                        break;
                    case 40:
                        z10 = j4.l(b10, b11);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                z9 = e(b10, b11);
            }
            z9 = !z10;
        } else {
            z9 = c(b10, b11);
        }
        return z9 ? p.f8378h0 : p.f8379i0;
    }
}
