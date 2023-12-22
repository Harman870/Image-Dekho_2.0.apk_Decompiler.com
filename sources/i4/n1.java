package i4;

import java.util.Collections;
import java.util.List;

public final class n1 extends p1 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f7514c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: i4.l1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: i4.l1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: i4.l1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List d(int r3, long r4, java.lang.Object r6) {
        /*
            java.lang.Object r0 = i4.h3.j(r4, r6)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof i4.m1
            if (r1 == 0) goto L_0x0016
            i4.l1 r0 = new i4.l1
            r0.<init>((int) r3)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof i4.i2
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof i4.f1
            if (r1 == 0) goto L_0x0026
            i4.f1 r0 = (i4.f1) r0
            i4.f1 r3 = r0.c(r3)
            r0 = r3
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
        L_0x002b:
            i4.h3.s(r4, r6, r0)
            goto L_0x0084
        L_0x002f:
            java.lang.Class r1 = f7514c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r3
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0048:
            i4.h3.s(r4, r6, r1)
            r0 = r1
            goto L_0x0084
        L_0x004d:
            boolean r1 = r0 instanceof i4.c3
            if (r1 == 0) goto L_0x0065
            i4.l1 r1 = new i4.l1
            int r2 = r0.size()
            int r2 = r2 + r3
            r1.<init>((int) r2)
            i4.c3 r0 = (i4.c3) r0
            int r3 = r1.size()
            r1.addAll(r3, r0)
            goto L_0x0048
        L_0x0065:
            boolean r1 = r0 instanceof i4.i2
            if (r1 == 0) goto L_0x0084
            boolean r1 = r0 instanceof i4.f1
            if (r1 == 0) goto L_0x0084
            r1 = r0
            i4.f1 r1 = (i4.f1) r1
            boolean r2 = r1.zzc()
            if (r2 == 0) goto L_0x0077
            goto L_0x0084
        L_0x0077:
            int r0 = r0.size()
            int r0 = r0 + r3
            i4.f1 r3 = r1.c(r0)
            i4.h3.s(r4, r6, r3)
            return r3
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.n1.d(int, long, java.lang.Object):java.util.List");
    }

    public final List a(long j10, Object obj) {
        return d(10, j10, obj);
    }

    public final void b(long j10, Object obj) {
        Object obj2;
        List list = (List) h3.j(j10, obj);
        if (list instanceof m1) {
            obj2 = ((m1) list).zze();
        } else if (!f7514c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof i2) || !(list instanceof f1)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                f1 f1Var = (f1) list;
                if (f1Var.zzc()) {
                    f1Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        h3.s(j10, obj, obj2);
    }

    public final void c(long j10, Object obj, Object obj2) {
        List list = (List) h3.j(j10, obj2);
        List d10 = d(list.size(), j10, obj);
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        h3.s(j10, obj, list);
    }
}
