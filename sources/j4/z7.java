package j4;

import java.util.Collections;
import java.util.List;

public final class z7 extends b8 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f8580c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(long j10, Object obj) {
        Object obj2;
        List list = (List) t9.j(j10, obj);
        if (list instanceof y7) {
            obj2 = ((y7) list).zze();
        } else if (!f8580c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof u8) || !(list instanceof r7)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                r7 r7Var = (r7) list;
                if (r7Var.zzc()) {
                    r7Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        t9.r(j10, obj, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: j4.x7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: j4.x7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: j4.x7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r5, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            java.lang.Object r8 = j4.t9.j(r5, r8)
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            java.lang.Object r1 = j4.t9.j(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r1 instanceof j4.y7
            if (r2 == 0) goto L_0x0020
            j4.x7 r1 = new j4.x7
            r1.<init>((int) r0)
            goto L_0x0069
        L_0x0020:
            boolean r2 = r1 instanceof j4.u8
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof j4.r7
            if (r2 == 0) goto L_0x0030
            j4.r7 r1 = (j4.r7) r1
            j4.r7 r0 = r1.c(r0)
        L_0x002e:
            r1 = r0
            goto L_0x0069
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x0069
        L_0x0036:
            java.lang.Class r2 = f8580c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0051
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x004f:
            r1 = r2
            goto L_0x0069
        L_0x0051:
            boolean r2 = r1 instanceof j4.o9
            if (r2 == 0) goto L_0x006d
            j4.x7 r2 = new j4.x7
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            j4.o9 r1 = (j4.o9) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x004f
        L_0x0069:
            j4.t9.r(r5, r7, r1)
            goto L_0x0088
        L_0x006d:
            boolean r2 = r1 instanceof j4.u8
            if (r2 == 0) goto L_0x0088
            boolean r2 = r1 instanceof j4.r7
            if (r2 == 0) goto L_0x0088
            r2 = r1
            j4.r7 r2 = (j4.r7) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L_0x0088
            int r1 = r1.size()
            int r1 = r1 + r0
            j4.r7 r0 = r2.c(r1)
            goto L_0x002e
        L_0x0088:
            int r0 = r1.size()
            int r2 = r8.size()
            if (r0 <= 0) goto L_0x0097
            if (r2 <= 0) goto L_0x0097
            r1.addAll(r8)
        L_0x0097:
            if (r0 > 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r8 = r1
        L_0x009b:
            j4.t9.r(r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.z7.b(long, java.lang.Object, java.lang.Object):void");
    }
}
