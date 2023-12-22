package r;

import java.util.ArrayList;
import java.util.Iterator;
import q.d;

public final class c extends p {
    public ArrayList<p> k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f11414l;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r1.f10879f == r5) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.f10879f == r5) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[LOOP:0: B:1:0x000e->B:16:0x0033, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0035 A[EDGE_INSN: B:44:0x0035->B:17:0x0035 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(int r4, q.d r5) {
        /*
            r3 = this;
            r3.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.k = r5
            r3.f11450f = r4
            q.d r4 = r3.f11446b
        L_0x000e:
            int r5 = r3.f11450f
            r0 = 1
            if (r5 != 0) goto L_0x0020
            q.c r5 = r4.K
            q.c r1 = r5.f10879f
            if (r1 == 0) goto L_0x0030
            q.c r2 = r1.f10879f
            if (r2 != r5) goto L_0x0030
        L_0x001d:
            q.d r5 = r1.f10877d
            goto L_0x0031
        L_0x0020:
            if (r5 != r0) goto L_0x002d
            q.c r5 = r4.L
            q.c r1 = r5.f10879f
            if (r1 == 0) goto L_0x0030
            q.c r2 = r1.f10879f
            if (r2 != r5) goto L_0x0030
            goto L_0x001d
        L_0x002d:
            r4.getClass()
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r5 == 0) goto L_0x0035
            r4 = r5
            goto L_0x000e
        L_0x0035:
            r3.f11446b = r4
        L_0x0037:
            java.util.ArrayList<r.p> r5 = r3.k
            int r1 = r3.f11450f
            r.p r1 = r4.n(r1)
            r5.add(r1)
            int r5 = r3.f11450f
            q.d r4 = r4.m(r5)
            if (r4 == 0) goto L_0x004b
            goto L_0x0037
        L_0x004b:
            java.util.ArrayList<r.p> r4 = r3.k
            java.util.Iterator r4 = r4.iterator()
        L_0x0051:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x006d
            java.lang.Object r5 = r4.next()
            r.p r5 = (r.p) r5
            int r1 = r3.f11450f
            if (r1 != 0) goto L_0x0066
            q.d r5 = r5.f11446b
            r5.f10894b = r3
            goto L_0x0051
        L_0x0066:
            if (r1 != r0) goto L_0x0051
            q.d r5 = r5.f11446b
            r5.f10896c = r3
            goto L_0x0051
        L_0x006d:
            int r4 = r3.f11450f
            if (r4 != 0) goto L_0x007d
            q.d r4 = r3.f11446b
            q.d r4 = r4.W
            q.e r4 = (q.e) r4
            boolean r4 = r4.f10935x0
            if (r4 == 0) goto L_0x007d
            r4 = r0
            goto L_0x007e
        L_0x007d:
            r4 = 0
        L_0x007e:
            if (r4 == 0) goto L_0x0099
            java.util.ArrayList<r.p> r4 = r3.k
            int r4 = r4.size()
            if (r4 <= r0) goto L_0x0099
            java.util.ArrayList<r.p> r4 = r3.k
            int r5 = r4.size()
            int r5 = r5 - r0
            java.lang.Object r4 = r4.get(r5)
            r.p r4 = (r.p) r4
            q.d r4 = r4.f11446b
            r3.f11446b = r4
        L_0x0099:
            int r4 = r3.f11450f
            if (r4 != 0) goto L_0x00a2
            q.d r4 = r3.f11446b
            int r4 = r4.f10914l0
            goto L_0x00a6
        L_0x00a2:
            q.d r4 = r3.f11446b
            int r4 = r4.f10916m0
        L_0x00a6:
            r3.f11414l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.c.<init>(int, q.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(r.d r26) {
        /*
            r25 = this;
            r0 = r25
            r.f r1 = r0.f11452h
            boolean r2 = r1.f11432j
            if (r2 == 0) goto L_0x03bb
            r.f r2 = r0.f11453i
            boolean r3 = r2.f11432j
            if (r3 != 0) goto L_0x0010
            goto L_0x03bb
        L_0x0010:
            q.d r3 = r0.f11446b
            q.d r3 = r3.W
            boolean r4 = r3 instanceof q.e
            if (r4 == 0) goto L_0x001d
            q.e r3 = (q.e) r3
            boolean r3 = r3.f10935x0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.f11429g
            int r1 = r1.f11429g
            int r2 = r2 - r1
            java.util.ArrayList<r.p> r1 = r0.k
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r6 = -1
            r7 = 8
            if (r4 >= r1) goto L_0x0040
            java.util.ArrayList<r.p> r8 = r0.k
            java.lang.Object r8 = r8.get(r4)
            r.p r8 = (r.p) r8
            q.d r8 = r8.f11446b
            int r8 = r8.f10911j0
            if (r8 != r7) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0040:
            r4 = r6
        L_0x0041:
            int r8 = r1 + -1
            r9 = r8
        L_0x0044:
            if (r9 < 0) goto L_0x0058
            java.util.ArrayList<r.p> r10 = r0.k
            java.lang.Object r10 = r10.get(r9)
            r.p r10 = (r.p) r10
            q.d r10 = r10.f11446b
            int r10 = r10.f10911j0
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0044
        L_0x0057:
            r6 = r9
        L_0x0058:
            r9 = 0
        L_0x0059:
            r11 = 2
            r13 = 3
            if (r9 >= r11) goto L_0x00f8
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0065:
            if (r14 >= r1) goto L_0x00e8
            java.util.ArrayList<r.p> r5 = r0.k
            java.lang.Object r5 = r5.get(r14)
            r.p r5 = (r.p) r5
            q.d r11 = r5.f11446b
            int r10 = r11.f10911j0
            if (r10 != r7) goto L_0x0077
            goto L_0x00e0
        L_0x0077:
            int r17 = r17 + 1
            if (r14 <= 0) goto L_0x0082
            if (r14 < r4) goto L_0x0082
            r.f r10 = r5.f11452h
            int r10 = r10.f11428f
            int r15 = r15 + r10
        L_0x0082:
            r.g r10 = r5.f11449e
            int r7 = r10.f11429g
            int r12 = r5.f11448d
            if (r12 == r13) goto L_0x008c
            r12 = 1
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            if (r12 == 0) goto L_0x00ab
            int r10 = r0.f11450f
            if (r10 != 0) goto L_0x009c
            r.l r13 = r11.f10898d
            r.g r13 = r13.f11449e
            boolean r13 = r13.f11432j
            if (r13 != 0) goto L_0x009c
            return
        L_0x009c:
            r13 = 1
            if (r10 != r13) goto L_0x00a8
            r.n r10 = r11.f10900e
            r.g r10 = r10.f11449e
            boolean r10 = r10.f11432j
            if (r10 != 0) goto L_0x00a8
            return
        L_0x00a8:
            r20 = r7
            goto L_0x00c1
        L_0x00ab:
            r20 = r7
            r13 = 1
            int r7 = r5.f11445a
            if (r7 != r13) goto L_0x00b9
            if (r9 != 0) goto L_0x00b9
            int r7 = r10.f11434m
            int r16 = r16 + 1
            goto L_0x00bf
        L_0x00b9:
            boolean r7 = r10.f11432j
            if (r7 == 0) goto L_0x00c1
            r7 = r20
        L_0x00bf:
            r12 = 1
            goto L_0x00c3
        L_0x00c1:
            r7 = r20
        L_0x00c3:
            if (r12 != 0) goto L_0x00d5
            int r16 = r16 + 1
            float[] r7 = r11.f10918n0
            int r10 = r0.f11450f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00d6
            float r18 = r18 + r7
            goto L_0x00d6
        L_0x00d5:
            int r15 = r15 + r7
        L_0x00d6:
            if (r14 >= r8) goto L_0x00e0
            if (r14 >= r6) goto L_0x00e0
            r.f r5 = r5.f11453i
            int r5 = r5.f11428f
            int r5 = -r5
            int r15 = r15 + r5
        L_0x00e0:
            int r14 = r14 + 1
            r7 = 8
            r11 = 2
            r13 = 3
            goto L_0x0065
        L_0x00e8:
            if (r15 < r2) goto L_0x00f3
            if (r16 != 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0059
        L_0x00f3:
            r5 = r16
            r7 = r17
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
            r7 = 0
            r15 = 0
            r18 = 0
        L_0x00fd:
            r.f r9 = r0.f11452h
            int r9 = r9.f11429g
            if (r3 == 0) goto L_0x0107
            r.f r9 = r0.f11453i
            int r9 = r9.f11429g
        L_0x0107:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r2) goto L_0x0118
            r11 = 1073741824(0x40000000, float:2.0)
            int r12 = r15 - r2
            float r12 = (float) r12
            float r12 = r12 / r11
            float r12 = r12 + r10
            int r11 = (int) r12
            if (r3 == 0) goto L_0x0117
            int r9 = r9 + r11
            goto L_0x0118
        L_0x0117:
            int r9 = r9 - r11
        L_0x0118:
            if (r5 <= 0) goto L_0x01f8
            int r11 = r2 - r15
            float r11 = (float) r11
            float r12 = (float) r5
            float r12 = r11 / r12
            float r12 = r12 + r10
            int r12 = (int) r12
            r13 = 0
            r14 = 0
        L_0x0124:
            if (r13 >= r1) goto L_0x01ac
            java.util.ArrayList<r.p> r10 = r0.k
            java.lang.Object r10 = r10.get(r13)
            r.p r10 = (r.p) r10
            r17 = r12
            q.d r12 = r10.f11446b
            r20 = r15
            int r15 = r12.f10911j0
            r21 = r9
            r9 = 8
            if (r15 != r9) goto L_0x013d
            goto L_0x0194
        L_0x013d:
            int r9 = r10.f11448d
            r15 = 3
            if (r9 != r15) goto L_0x0194
            r.g r9 = r10.f11449e
            boolean r15 = r9.f11432j
            if (r15 != 0) goto L_0x0194
            r15 = 0
            int r19 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x015d
            float[] r15 = r12.f10918n0
            r22 = r3
            int r3 = r0.f11450f
            r3 = r15[r3]
            float r3 = r3 * r11
            float r3 = r3 / r18
            r15 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r15
            int r3 = (int) r3
            goto L_0x0161
        L_0x015d:
            r22 = r3
            r3 = r17
        L_0x0161:
            int r15 = r0.f11450f
            if (r15 != 0) goto L_0x016a
            int r15 = r12.w
            int r12 = r12.f10928v
            goto L_0x016e
        L_0x016a:
            int r15 = r12.f10931z
            int r12 = r12.f10930y
        L_0x016e:
            r23 = r11
            int r11 = r10.f11445a
            r24 = r7
            r7 = 1
            if (r11 != r7) goto L_0x017e
            int r7 = r9.f11434m
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x017f
        L_0x017e:
            r7 = r3
        L_0x017f:
            int r7 = java.lang.Math.max(r12, r7)
            if (r15 <= 0) goto L_0x0189
            int r7 = java.lang.Math.min(r15, r7)
        L_0x0189:
            if (r7 == r3) goto L_0x018e
            int r14 = r14 + 1
            r3 = r7
        L_0x018e:
            r.g r7 = r10.f11449e
            r7.d(r3)
            goto L_0x019a
        L_0x0194:
            r22 = r3
            r24 = r7
            r23 = r11
        L_0x019a:
            int r13 = r13 + 1
            r12 = r17
            r15 = r20
            r9 = r21
            r3 = r22
            r11 = r23
            r7 = r24
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0124
        L_0x01ac:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            if (r14 <= 0) goto L_0x01e9
            int r5 = r5 - r14
            r3 = 0
            r7 = 0
        L_0x01b9:
            if (r3 >= r1) goto L_0x01e7
            java.util.ArrayList<r.p> r9 = r0.k
            java.lang.Object r9 = r9.get(r3)
            r.p r9 = (r.p) r9
            q.d r10 = r9.f11446b
            int r10 = r10.f10911j0
            r11 = 8
            if (r10 != r11) goto L_0x01cc
            goto L_0x01e4
        L_0x01cc:
            if (r3 <= 0) goto L_0x01d5
            if (r3 < r4) goto L_0x01d5
            r.f r10 = r9.f11452h
            int r10 = r10.f11428f
            int r7 = r7 + r10
        L_0x01d5:
            r.g r10 = r9.f11449e
            int r10 = r10.f11429g
            int r7 = r7 + r10
            if (r3 >= r8) goto L_0x01e4
            if (r3 >= r6) goto L_0x01e4
            r.f r9 = r9.f11453i
            int r9 = r9.f11428f
            int r9 = -r9
            int r7 = r7 + r9
        L_0x01e4:
            int r3 = r3 + 1
            goto L_0x01b9
        L_0x01e7:
            r15 = r7
            goto L_0x01eb
        L_0x01e9:
            r15 = r20
        L_0x01eb:
            int r3 = r0.f11414l
            r7 = 2
            if (r3 != r7) goto L_0x01f6
            if (r14 != 0) goto L_0x01f6
            r3 = 0
            r0.f11414l = r3
            goto L_0x0202
        L_0x01f6:
            r3 = 0
            goto L_0x0202
        L_0x01f8:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            r3 = 0
            r7 = 2
        L_0x0202:
            if (r15 <= r2) goto L_0x0206
            r0.f11414l = r7
        L_0x0206:
            if (r24 <= 0) goto L_0x020e
            if (r5 != 0) goto L_0x020e
            if (r4 != r6) goto L_0x020e
            r0.f11414l = r7
        L_0x020e:
            int r7 = r0.f11414l
            r9 = 1
            r10 = r24
            if (r7 != r9) goto L_0x029f
            if (r10 <= r9) goto L_0x021c
            int r2 = r2 - r15
            int r7 = r10 + -1
            int r2 = r2 / r7
            goto L_0x0223
        L_0x021c:
            if (r10 != r9) goto L_0x0222
            int r2 = r2 - r15
            r7 = 2
            int r2 = r2 / r7
            goto L_0x0223
        L_0x0222:
            r2 = r3
        L_0x0223:
            if (r5 <= 0) goto L_0x0226
            r2 = r3
        L_0x0226:
            r5 = r3
            r9 = r21
        L_0x0229:
            if (r5 >= r1) goto L_0x03bb
            if (r22 == 0) goto L_0x0232
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x0233
        L_0x0232:
            r3 = r5
        L_0x0233:
            java.util.ArrayList<r.p> r7 = r0.k
            java.lang.Object r3 = r7.get(r3)
            r.p r3 = (r.p) r3
            q.d r7 = r3.f11446b
            int r7 = r7.f10911j0
            r10 = 8
            if (r7 != r10) goto L_0x024e
            r.f r7 = r3.f11452h
            r7.d(r9)
            r.f r3 = r3.f11453i
            r3.d(r9)
            goto L_0x029c
        L_0x024e:
            if (r5 <= 0) goto L_0x0255
            if (r22 == 0) goto L_0x0254
            int r9 = r9 - r2
            goto L_0x0255
        L_0x0254:
            int r9 = r9 + r2
        L_0x0255:
            if (r5 <= 0) goto L_0x0262
            if (r5 < r4) goto L_0x0262
            r.f r7 = r3.f11452h
            int r7 = r7.f11428f
            if (r22 == 0) goto L_0x0261
            int r9 = r9 - r7
            goto L_0x0262
        L_0x0261:
            int r9 = r9 + r7
        L_0x0262:
            if (r22 == 0) goto L_0x0267
            r.f r7 = r3.f11453i
            goto L_0x0269
        L_0x0267:
            r.f r7 = r3.f11452h
        L_0x0269:
            r7.d(r9)
            r.g r7 = r3.f11449e
            int r10 = r7.f11429g
            int r11 = r3.f11448d
            r12 = 3
            if (r11 != r12) goto L_0x027c
            int r11 = r3.f11445a
            r12 = 1
            if (r11 != r12) goto L_0x027c
            int r10 = r7.f11434m
        L_0x027c:
            if (r22 == 0) goto L_0x0280
            int r9 = r9 - r10
            goto L_0x0281
        L_0x0280:
            int r9 = r9 + r10
        L_0x0281:
            if (r22 == 0) goto L_0x0286
            r.f r7 = r3.f11452h
            goto L_0x0288
        L_0x0286:
            r.f r7 = r3.f11453i
        L_0x0288:
            r7.d(r9)
            r7 = 1
            r3.f11451g = r7
            if (r5 >= r8) goto L_0x029c
            if (r5 >= r6) goto L_0x029c
            r.f r3 = r3.f11453i
            int r3 = r3.f11428f
            int r3 = -r3
            if (r22 == 0) goto L_0x029b
            int r9 = r9 - r3
            goto L_0x029c
        L_0x029b:
            int r9 = r9 + r3
        L_0x029c:
            int r5 = r5 + 1
            goto L_0x0229
        L_0x029f:
            if (r7 != 0) goto L_0x0321
            int r2 = r2 - r15
            r7 = 1
            int r9 = r10 + 1
            int r2 = r2 / r9
            if (r5 <= 0) goto L_0x02a9
            r2 = r3
        L_0x02a9:
            r5 = r3
            r9 = r21
        L_0x02ac:
            if (r5 >= r1) goto L_0x03bb
            if (r22 == 0) goto L_0x02b5
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02b6
        L_0x02b5:
            r3 = r5
        L_0x02b6:
            java.util.ArrayList<r.p> r7 = r0.k
            java.lang.Object r3 = r7.get(r3)
            r.p r3 = (r.p) r3
            q.d r7 = r3.f11446b
            int r7 = r7.f10911j0
            r10 = 8
            if (r7 != r10) goto L_0x02d1
            r.f r7 = r3.f11452h
            r7.d(r9)
            r.f r3 = r3.f11453i
            r3.d(r9)
            goto L_0x031e
        L_0x02d1:
            if (r22 == 0) goto L_0x02d5
            int r9 = r9 - r2
            goto L_0x02d6
        L_0x02d5:
            int r9 = r9 + r2
        L_0x02d6:
            if (r5 <= 0) goto L_0x02e3
            if (r5 < r4) goto L_0x02e3
            r.f r7 = r3.f11452h
            int r7 = r7.f11428f
            if (r22 == 0) goto L_0x02e2
            int r9 = r9 - r7
            goto L_0x02e3
        L_0x02e2:
            int r9 = r9 + r7
        L_0x02e3:
            if (r22 == 0) goto L_0x02e8
            r.f r7 = r3.f11453i
            goto L_0x02ea
        L_0x02e8:
            r.f r7 = r3.f11452h
        L_0x02ea:
            r7.d(r9)
            r.g r7 = r3.f11449e
            int r10 = r7.f11429g
            int r11 = r3.f11448d
            r12 = 3
            if (r11 != r12) goto L_0x0301
            int r11 = r3.f11445a
            r12 = 1
            if (r11 != r12) goto L_0x0301
            int r7 = r7.f11434m
            int r10 = java.lang.Math.min(r10, r7)
        L_0x0301:
            if (r22 == 0) goto L_0x0305
            int r9 = r9 - r10
            goto L_0x0306
        L_0x0305:
            int r9 = r9 + r10
        L_0x0306:
            if (r22 == 0) goto L_0x030b
            r.f r7 = r3.f11452h
            goto L_0x030d
        L_0x030b:
            r.f r7 = r3.f11453i
        L_0x030d:
            r7.d(r9)
            if (r5 >= r8) goto L_0x031e
            if (r5 >= r6) goto L_0x031e
            r.f r3 = r3.f11453i
            int r3 = r3.f11428f
            int r3 = -r3
            if (r22 == 0) goto L_0x031d
            int r9 = r9 - r3
            goto L_0x031e
        L_0x031d:
            int r9 = r9 + r3
        L_0x031e:
            int r5 = r5 + 1
            goto L_0x02ac
        L_0x0321:
            r9 = 2
            if (r7 != r9) goto L_0x03bb
            int r7 = r0.f11450f
            if (r7 != 0) goto L_0x032d
            q.d r7 = r0.f11446b
            float r7 = r7.f10905g0
            goto L_0x0331
        L_0x032d:
            q.d r7 = r0.f11446b
            float r7 = r7.f10907h0
        L_0x0331:
            if (r22 == 0) goto L_0x0337
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = r9 - r7
        L_0x0337:
            int r2 = r2 - r15
            float r2 = (float) r2
            float r2 = r2 * r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r7
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0342
            if (r5 <= 0) goto L_0x0343
        L_0x0342:
            r2 = r3
        L_0x0343:
            if (r22 == 0) goto L_0x0348
            int r9 = r21 - r2
            goto L_0x034a
        L_0x0348:
            int r9 = r21 + r2
        L_0x034a:
            r5 = r3
        L_0x034b:
            if (r5 >= r1) goto L_0x03bb
            if (r22 == 0) goto L_0x0354
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x0355
        L_0x0354:
            r2 = r5
        L_0x0355:
            java.util.ArrayList<r.p> r3 = r0.k
            java.lang.Object r2 = r3.get(r2)
            r.p r2 = (r.p) r2
            q.d r3 = r2.f11446b
            int r3 = r3.f10911j0
            r7 = 8
            if (r3 != r7) goto L_0x0372
            r.f r3 = r2.f11452h
            r3.d(r9)
            r.f r2 = r2.f11453i
            r2.d(r9)
            r12 = 3
            r13 = 1
            goto L_0x03b8
        L_0x0372:
            if (r5 <= 0) goto L_0x037f
            if (r5 < r4) goto L_0x037f
            r.f r3 = r2.f11452h
            int r3 = r3.f11428f
            if (r22 == 0) goto L_0x037e
            int r9 = r9 - r3
            goto L_0x037f
        L_0x037e:
            int r9 = r9 + r3
        L_0x037f:
            if (r22 == 0) goto L_0x0384
            r.f r3 = r2.f11453i
            goto L_0x0386
        L_0x0384:
            r.f r3 = r2.f11452h
        L_0x0386:
            r3.d(r9)
            r.g r3 = r2.f11449e
            int r10 = r3.f11429g
            int r11 = r2.f11448d
            r12 = 3
            if (r11 != r12) goto L_0x039a
            int r11 = r2.f11445a
            r13 = 1
            if (r11 != r13) goto L_0x039b
            int r10 = r3.f11434m
            goto L_0x039b
        L_0x039a:
            r13 = 1
        L_0x039b:
            if (r22 == 0) goto L_0x039f
            int r9 = r9 - r10
            goto L_0x03a0
        L_0x039f:
            int r9 = r9 + r10
        L_0x03a0:
            if (r22 == 0) goto L_0x03a5
            r.f r3 = r2.f11452h
            goto L_0x03a7
        L_0x03a5:
            r.f r3 = r2.f11453i
        L_0x03a7:
            r3.d(r9)
            if (r5 >= r8) goto L_0x03b8
            if (r5 >= r6) goto L_0x03b8
            r.f r2 = r2.f11453i
            int r2 = r2.f11428f
            int r2 = -r2
            if (r22 == 0) goto L_0x03b7
            int r9 = r9 - r2
            goto L_0x03b8
        L_0x03b7:
            int r9 = r9 + r2
        L_0x03b8:
            int r5 = r5 + 1
            goto L_0x034b
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.c.a(r.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r5 = this;
            java.util.ArrayList<r.p> r0 = r5.k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            r.p r1 = (r.p) r1
            r1.d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<r.p> r0 = r5.k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<r.p> r2 = r5.k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            r.p r2 = (r.p) r2
            q.d r2 = r2.f11446b
            java.util.ArrayList<r.p> r4 = r5.k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            r.p r0 = (r.p) r0
            q.d r0 = r0.f11446b
            int r4 = r5.f11450f
            if (r4 != 0) goto L_0x0070
            q.c r1 = r2.K
            q.c r0 = r0.M
            r.f r2 = r.p.i(r1, r3)
            int r1 = r1.e()
            q.d r4 = r5.m()
            if (r4 == 0) goto L_0x0052
            q.c r1 = r4.K
            int r1 = r1.e()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            r.f r4 = r5.f11452h
            r.p.b(r4, r2, r1)
        L_0x0059:
            r.f r1 = r.p.i(r0, r3)
            int r0 = r0.e()
            q.d r2 = r5.n()
            if (r2 == 0) goto L_0x006d
            q.c r0 = r2.M
            int r0 = r0.e()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            q.c r2 = r2.L
            q.c r0 = r0.N
            r.f r3 = r.p.i(r2, r1)
            int r2 = r2.e()
            q.d r4 = r5.m()
            if (r4 == 0) goto L_0x0088
            q.c r2 = r4.L
            int r2 = r2.e()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            r.f r4 = r5.f11452h
            r.p.b(r4, r3, r2)
        L_0x008f:
            r.f r1 = r.p.i(r0, r1)
            int r0 = r0.e()
            q.d r2 = r5.n()
            if (r2 == 0) goto L_0x00a3
            q.c r0 = r2.N
            int r0 = r0.e()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            r.f r2 = r5.f11453i
            int r0 = -r0
            r.p.b(r2, r1, r0)
        L_0x00ab:
            r.f r0 = r5.f11452h
            r0.f11423a = r5
            r.f r0 = r5.f11453i
            r0.f11423a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.c.d():void");
    }

    public final void e() {
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            this.k.get(i10).e();
        }
    }

    public final void f() {
        this.f11447c = null;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public final long j() {
        int size = this.k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.k.get(i10);
            j10 = ((long) pVar.f11453i.f11428f) + pVar.j() + j10 + ((long) pVar.f11452h.f11428f);
        }
        return j10;
    }

    public final boolean k() {
        int size = this.k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.k.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final d m() {
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            d dVar = this.k.get(i10).f11446b;
            if (dVar.f10911j0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final d n() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            d dVar = this.k.get(size).f11446b;
            if (dVar.f10911j0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f11450f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
