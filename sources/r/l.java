package r;

import androidx.activity.f;
import q.d;

public final class l extends p {
    public static int[] k = new int[2];

    public l(d dVar) {
        super(dVar);
        this.f11452h.f11427e = 4;
        this.f11453i.f11427e = 5;
        this.f11450f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0250, code lost:
        if (r13 != 1) goto L_0x029f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(r.d r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f11454j
            int r1 = o.g.b(r1)
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L_0x03b7
            r.g r1 = r0.f11449e
            boolean r4 = r1.f11432j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            if (r4 != 0) goto L_0x029f
            int r4 = r0.f11448d
            if (r4 != r2) goto L_0x029f
            q.d r4 = r0.f11446b
            int r7 = r4.f10926s
            r8 = 2
            if (r7 == r8) goto L_0x0288
            if (r7 == r2) goto L_0x0024
            goto L_0x029f
        L_0x0024:
            int r7 = r4.f10927t
            r8 = -1
            if (r7 == 0) goto L_0x004f
            if (r7 != r2) goto L_0x002c
            goto L_0x004f
        L_0x002c:
            int r7 = r4.f10893a0
            if (r7 == r8) goto L_0x0043
            if (r7 == 0) goto L_0x0037
            if (r7 == r6) goto L_0x0043
            r4 = r3
            goto L_0x029c
        L_0x0037:
            r.n r7 = r4.f10900e
            r.g r7 = r7.f11449e
            int r7 = r7.f11429g
            float r7 = (float) r7
            float r4 = r4.Z
            float r7 = r7 / r4
            goto L_0x029a
        L_0x0043:
            r.n r7 = r4.f10900e
            r.g r7 = r7.f11449e
            int r7 = r7.f11429g
            float r7 = (float) r7
            float r4 = r4.Z
            float r7 = r7 * r4
            goto L_0x029a
        L_0x004f:
            r.n r1 = r4.f10900e
            r.f r7 = r1.f11452h
            r.f r1 = r1.f11453i
            q.c r9 = r4.K
            q.c r9 = r9.f10879f
            if (r9 == 0) goto L_0x005d
            r9 = r6
            goto L_0x005e
        L_0x005d:
            r9 = r3
        L_0x005e:
            q.c r10 = r4.L
            q.c r10 = r10.f10879f
            if (r10 == 0) goto L_0x0066
            r10 = r6
            goto L_0x0067
        L_0x0066:
            r10 = r3
        L_0x0067:
            q.c r11 = r4.M
            q.c r11 = r11.f10879f
            if (r11 == 0) goto L_0x006f
            r11 = r6
            goto L_0x0070
        L_0x006f:
            r11 = r3
        L_0x0070:
            q.c r12 = r4.N
            q.c r12 = r12.f10879f
            if (r12 == 0) goto L_0x0078
            r12 = r6
            goto L_0x0079
        L_0x0078:
            r12 = r3
        L_0x0079:
            int r15 = r4.f10893a0
            if (r9 == 0) goto L_0x01b1
            if (r10 == 0) goto L_0x01b1
            if (r11 == 0) goto L_0x01b1
            if (r12 == 0) goto L_0x01b1
            float r4 = r4.Z
            boolean r8 = r7.f11432j
            if (r8 == 0) goto L_0x00e6
            boolean r8 = r1.f11432j
            if (r8 == 0) goto L_0x00e6
            r.f r2 = r0.f11452h
            boolean r5 = r2.f11425c
            if (r5 == 0) goto L_0x00e5
            r.f r5 = r0.f11453i
            boolean r5 = r5.f11425c
            if (r5 != 0) goto L_0x009a
            goto L_0x00e5
        L_0x009a:
            java.util.ArrayList r2 = r2.f11433l
            java.lang.Object r2 = r2.get(r3)
            r.f r2 = (r.f) r2
            int r2 = r2.f11429g
            r.f r5 = r0.f11452h
            int r5 = r5.f11428f
            int r14 = r2 + r5
            r.f r2 = r0.f11453i
            java.util.ArrayList r2 = r2.f11433l
            java.lang.Object r2 = r2.get(r3)
            r.f r2 = (r.f) r2
            int r2 = r2.f11429g
            r.f r5 = r0.f11453i
            int r5 = r5.f11428f
            int r2 = r2 - r5
            int r5 = r7.f11429g
            int r7 = r7.f11428f
            int r16 = r5 + r7
            int r5 = r1.f11429g
            int r1 = r1.f11428f
            int r17 = r5 - r1
            int[] r1 = k
            r13 = r1
            r8 = r15
            r15 = r2
            r18 = r4
            r19 = r8
            m(r13, r14, r15, r16, r17, r18, r19)
            r.g r2 = r0.f11449e
            r3 = r1[r3]
            r2.d(r3)
            q.d r2 = r0.f11446b
            r.n r2 = r2.f10900e
            r.g r2 = r2.f11449e
            r1 = r1[r6]
            r2.d(r1)
        L_0x00e5:
            return
        L_0x00e6:
            r8 = r15
            r.f r9 = r0.f11452h
            boolean r10 = r9.f11432j
            if (r10 == 0) goto L_0x0142
            r.f r10 = r0.f11453i
            boolean r11 = r10.f11432j
            if (r11 == 0) goto L_0x0142
            boolean r11 = r7.f11425c
            if (r11 == 0) goto L_0x0141
            boolean r11 = r1.f11425c
            if (r11 != 0) goto L_0x00fc
            goto L_0x0141
        L_0x00fc:
            int r11 = r9.f11429g
            int r9 = r9.f11428f
            int r14 = r11 + r9
            int r9 = r10.f11429g
            int r10 = r10.f11428f
            int r15 = r9 - r10
            java.util.ArrayList r9 = r7.f11433l
            java.lang.Object r9 = r9.get(r3)
            r.f r9 = (r.f) r9
            int r9 = r9.f11429g
            int r10 = r7.f11428f
            int r16 = r9 + r10
            java.util.ArrayList r9 = r1.f11433l
            java.lang.Object r9 = r9.get(r3)
            r.f r9 = (r.f) r9
            int r9 = r9.f11429g
            int r10 = r1.f11428f
            int r17 = r9 - r10
            int[] r9 = k
            r13 = r9
            r18 = r4
            r19 = r8
            m(r13, r14, r15, r16, r17, r18, r19)
            r.g r10 = r0.f11449e
            r11 = r9[r3]
            r10.d(r11)
            q.d r10 = r0.f11446b
            r.n r10 = r10.f10900e
            r.g r10 = r10.f11449e
            r9 = r9[r6]
            r10.d(r9)
            goto L_0x0142
        L_0x0141:
            return
        L_0x0142:
            r.f r9 = r0.f11452h
            boolean r10 = r9.f11425c
            if (r10 == 0) goto L_0x01b0
            r.f r10 = r0.f11453i
            boolean r10 = r10.f11425c
            if (r10 == 0) goto L_0x01b0
            boolean r10 = r7.f11425c
            if (r10 == 0) goto L_0x01b0
            boolean r10 = r1.f11425c
            if (r10 != 0) goto L_0x0157
            goto L_0x01b0
        L_0x0157:
            java.util.ArrayList r9 = r9.f11433l
            java.lang.Object r9 = r9.get(r3)
            r.f r9 = (r.f) r9
            int r9 = r9.f11429g
            r.f r10 = r0.f11452h
            int r10 = r10.f11428f
            int r14 = r9 + r10
            r.f r9 = r0.f11453i
            java.util.ArrayList r9 = r9.f11433l
            java.lang.Object r9 = r9.get(r3)
            r.f r9 = (r.f) r9
            int r9 = r9.f11429g
            r.f r10 = r0.f11453i
            int r10 = r10.f11428f
            int r15 = r9 - r10
            java.util.ArrayList r9 = r7.f11433l
            java.lang.Object r9 = r9.get(r3)
            r.f r9 = (r.f) r9
            int r9 = r9.f11429g
            int r7 = r7.f11428f
            int r16 = r9 + r7
            java.util.ArrayList r7 = r1.f11433l
            java.lang.Object r7 = r7.get(r3)
            r.f r7 = (r.f) r7
            int r7 = r7.f11429g
            int r1 = r1.f11428f
            int r17 = r7 - r1
            int[] r1 = k
            r13 = r1
            r18 = r4
            r19 = r8
            m(r13, r14, r15, r16, r17, r18, r19)
            r.g r4 = r0.f11449e
            r7 = r1[r3]
            r4.d(r7)
            q.d r4 = r0.f11446b
            r.n r4 = r4.f10900e
            r.g r4 = r4.f11449e
            r1 = r1[r6]
            goto L_0x0283
        L_0x01b0:
            return
        L_0x01b1:
            r13 = r15
            if (r9 == 0) goto L_0x0223
            if (r11 == 0) goto L_0x0223
            r.f r1 = r0.f11452h
            boolean r7 = r1.f11425c
            if (r7 == 0) goto L_0x0222
            r.f r7 = r0.f11453i
            boolean r7 = r7.f11425c
            if (r7 != 0) goto L_0x01c3
            goto L_0x0222
        L_0x01c3:
            float r4 = r4.Z
            java.util.ArrayList r1 = r1.f11433l
            java.lang.Object r1 = r1.get(r3)
            r.f r1 = (r.f) r1
            int r1 = r1.f11429g
            r.f r7 = r0.f11452h
            int r7 = r7.f11428f
            int r1 = r1 + r7
            r.f r7 = r0.f11453i
            java.util.ArrayList r7 = r7.f11433l
            java.lang.Object r7 = r7.get(r3)
            r.f r7 = (r.f) r7
            int r7 = r7.f11429g
            r.f r9 = r0.f11453i
            int r9 = r9.f11428f
            int r7 = r7 - r9
            if (r13 == r8) goto L_0x01ff
            if (r13 == 0) goto L_0x01ff
            if (r13 == r6) goto L_0x01ed
            goto L_0x029f
        L_0x01ed:
            int r7 = r7 - r1
            int r1 = r0.g(r7, r3)
            float r7 = (float) r1
            float r7 = r7 / r4
            float r7 = r7 + r5
            int r7 = (int) r7
            int r8 = r0.g(r7, r6)
            if (r7 == r8) goto L_0x0212
            float r1 = (float) r8
            float r1 = r1 * r4
            goto L_0x0210
        L_0x01ff:
            int r7 = r7 - r1
            int r1 = r0.g(r7, r3)
            float r7 = (float) r1
            float r7 = r7 * r4
            float r7 = r7 + r5
            int r7 = (int) r7
            int r8 = r0.g(r7, r6)
            if (r7 == r8) goto L_0x0212
            float r1 = (float) r8
            float r1 = r1 / r4
        L_0x0210:
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x0212:
            r.g r4 = r0.f11449e
            r4.d(r1)
            q.d r1 = r0.f11446b
            r.n r1 = r1.f10900e
            r.g r1 = r1.f11449e
            r1.d(r8)
            goto L_0x029f
        L_0x0222:
            return
        L_0x0223:
            if (r10 == 0) goto L_0x029f
            if (r12 == 0) goto L_0x029f
            boolean r9 = r7.f11425c
            if (r9 == 0) goto L_0x0287
            boolean r9 = r1.f11425c
            if (r9 != 0) goto L_0x0230
            goto L_0x0287
        L_0x0230:
            float r4 = r4.Z
            java.util.ArrayList r9 = r7.f11433l
            java.lang.Object r9 = r9.get(r3)
            r.f r9 = (r.f) r9
            int r9 = r9.f11429g
            int r7 = r7.f11428f
            int r9 = r9 + r7
            java.util.ArrayList r7 = r1.f11433l
            java.lang.Object r7 = r7.get(r3)
            r.f r7 = (r.f) r7
            int r7 = r7.f11429g
            int r1 = r1.f11428f
            int r7 = r7 - r1
            if (r13 == r8) goto L_0x0265
            if (r13 == 0) goto L_0x0253
            if (r13 == r6) goto L_0x0265
            goto L_0x029f
        L_0x0253:
            int r7 = r7 - r9
            int r1 = r0.g(r7, r6)
            float r7 = (float) r1
            float r7 = r7 * r4
            float r7 = r7 + r5
            int r7 = (int) r7
            int r8 = r0.g(r7, r3)
            if (r7 == r8) goto L_0x0278
            float r1 = (float) r8
            float r1 = r1 / r4
            goto L_0x0276
        L_0x0265:
            int r7 = r7 - r9
            int r1 = r0.g(r7, r6)
            float r7 = (float) r1
            float r7 = r7 / r4
            float r7 = r7 + r5
            int r7 = (int) r7
            int r8 = r0.g(r7, r3)
            if (r7 == r8) goto L_0x0278
            float r1 = (float) r8
            float r1 = r1 * r4
        L_0x0276:
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x0278:
            r.g r4 = r0.f11449e
            r4.d(r8)
            q.d r4 = r0.f11446b
            r.n r4 = r4.f10900e
            r.g r4 = r4.f11449e
        L_0x0283:
            r4.d(r1)
            goto L_0x029f
        L_0x0287:
            return
        L_0x0288:
            q.d r7 = r4.W
            if (r7 == 0) goto L_0x029f
            r.l r7 = r7.f10898d
            r.g r7 = r7.f11449e
            boolean r8 = r7.f11432j
            if (r8 == 0) goto L_0x029f
            float r4 = r4.f10929x
            int r7 = r7.f11429g
            float r7 = (float) r7
            float r7 = r7 * r4
        L_0x029a:
            float r7 = r7 + r5
            int r4 = (int) r7
        L_0x029c:
            r1.d(r4)
        L_0x029f:
            r.f r1 = r0.f11452h
            boolean r4 = r1.f11425c
            if (r4 == 0) goto L_0x03b6
            r.f r4 = r0.f11453i
            boolean r7 = r4.f11425c
            if (r7 != 0) goto L_0x02ad
            goto L_0x03b6
        L_0x02ad:
            boolean r1 = r1.f11432j
            if (r1 == 0) goto L_0x02bc
            boolean r1 = r4.f11432j
            if (r1 == 0) goto L_0x02bc
            r.g r1 = r0.f11449e
            boolean r1 = r1.f11432j
            if (r1 == 0) goto L_0x02bc
            return
        L_0x02bc:
            r.g r1 = r0.f11449e
            boolean r1 = r1.f11432j
            if (r1 != 0) goto L_0x0304
            int r1 = r0.f11448d
            if (r1 != r2) goto L_0x0304
            q.d r1 = r0.f11446b
            int r4 = r1.f10926s
            if (r4 != 0) goto L_0x0304
            boolean r1 = r1.y()
            if (r1 != 0) goto L_0x0304
            r.f r1 = r0.f11452h
            java.util.ArrayList r1 = r1.f11433l
            java.lang.Object r1 = r1.get(r3)
            r.f r1 = (r.f) r1
            r.f r2 = r0.f11453i
            java.util.ArrayList r2 = r2.f11433l
            java.lang.Object r2 = r2.get(r3)
            r.f r2 = (r.f) r2
            int r1 = r1.f11429g
            r.f r3 = r0.f11452h
            int r4 = r3.f11428f
            int r1 = r1 + r4
            int r2 = r2.f11429g
            r.f r4 = r0.f11453i
            int r4 = r4.f11428f
            int r2 = r2 + r4
            int r4 = r2 - r1
            r3.d(r1)
            r.f r1 = r0.f11453i
            r1.d(r2)
            r.g r1 = r0.f11449e
            r1.d(r4)
            return
        L_0x0304:
            r.g r1 = r0.f11449e
            boolean r1 = r1.f11432j
            if (r1 != 0) goto L_0x0366
            int r1 = r0.f11448d
            if (r1 != r2) goto L_0x0366
            int r1 = r0.f11445a
            if (r1 != r6) goto L_0x0366
            r.f r1 = r0.f11452h
            java.util.ArrayList r1 = r1.f11433l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0366
            r.f r1 = r0.f11453i
            java.util.ArrayList r1 = r1.f11433l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0366
            r.f r1 = r0.f11452h
            java.util.ArrayList r1 = r1.f11433l
            java.lang.Object r1 = r1.get(r3)
            r.f r1 = (r.f) r1
            r.f r2 = r0.f11453i
            java.util.ArrayList r2 = r2.f11433l
            java.lang.Object r2 = r2.get(r3)
            r.f r2 = (r.f) r2
            int r1 = r1.f11429g
            r.f r4 = r0.f11452h
            int r4 = r4.f11428f
            int r1 = r1 + r4
            int r2 = r2.f11429g
            r.f r4 = r0.f11453i
            int r4 = r4.f11428f
            int r2 = r2 + r4
            int r2 = r2 - r1
            r.g r1 = r0.f11449e
            int r1 = r1.f11434m
            int r1 = java.lang.Math.min(r2, r1)
            q.d r2 = r0.f11446b
            int r4 = r2.w
            int r2 = r2.f10928v
            int r1 = java.lang.Math.max(r2, r1)
            if (r4 <= 0) goto L_0x0361
            int r1 = java.lang.Math.min(r4, r1)
        L_0x0361:
            r.g r2 = r0.f11449e
            r2.d(r1)
        L_0x0366:
            r.g r1 = r0.f11449e
            boolean r1 = r1.f11432j
            if (r1 != 0) goto L_0x036d
            return
        L_0x036d:
            r.f r1 = r0.f11452h
            java.util.ArrayList r1 = r1.f11433l
            java.lang.Object r1 = r1.get(r3)
            r.f r1 = (r.f) r1
            r.f r2 = r0.f11453i
            java.util.ArrayList r2 = r2.f11433l
            java.lang.Object r2 = r2.get(r3)
            r.f r2 = (r.f) r2
            int r3 = r1.f11429g
            r.f r4 = r0.f11452h
            int r6 = r4.f11428f
            int r6 = r6 + r3
            int r7 = r2.f11429g
            r.f r8 = r0.f11453i
            int r8 = r8.f11428f
            int r8 = r8 + r7
            q.d r9 = r0.f11446b
            float r9 = r9.f10905g0
            if (r1 != r2) goto L_0x0397
            r9 = r5
            goto L_0x0399
        L_0x0397:
            r3 = r6
            r7 = r8
        L_0x0399:
            int r7 = r7 - r3
            r.g r1 = r0.f11449e
            int r1 = r1.f11429g
            int r7 = r7 - r1
            float r1 = (float) r3
            float r1 = r1 + r5
            float r2 = (float) r7
            float r2 = r2 * r9
            float r2 = r2 + r1
            int r1 = (int) r2
            r4.d(r1)
            r.f r1 = r0.f11453i
            r.f r2 = r0.f11452h
            int r2 = r2.f11429g
            r.g r3 = r0.f11449e
            int r3 = r3.f11429g
            int r2 = r2 + r3
            r1.d(r2)
        L_0x03b6:
            return
        L_0x03b7:
            q.d r1 = r0.f11446b
            q.c r2 = r1.K
            q.c r1 = r1.M
            r0.l(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.l.a(r.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        r0 = r9.f11446b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            q.d r0 = r9.f11446b
            boolean r1 = r0.f10892a
            if (r1 == 0) goto L_0x000f
            r.g r1 = r9.f11449e
            int r0 = r0.r()
            r1.d(r0)
        L_0x000f:
            r.g r0 = r9.f11449e
            boolean r1 = r0.f11432j
            r2 = 0
            r3 = 1
            r4 = 4
            r5 = 3
            if (r1 != 0) goto L_0x007a
            q.d r1 = r9.f11446b
            int[] r6 = r1.V
            r6 = r6[r2]
            r9.f11448d = r6
            if (r6 == r5) goto L_0x00ae
            if (r6 != r4) goto L_0x0070
            q.d r7 = r1.W
            if (r7 == 0) goto L_0x0070
            int[] r8 = r7.V
            r8 = r8[r2]
            if (r8 == r3) goto L_0x0031
            if (r8 != r4) goto L_0x0070
        L_0x0031:
            int r0 = r7.r()
            q.d r1 = r9.f11446b
            q.c r1 = r1.K
            int r1 = r1.e()
            int r0 = r0 - r1
            q.d r1 = r9.f11446b
            q.c r1 = r1.M
            int r1 = r1.e()
            int r0 = r0 - r1
            r.f r1 = r9.f11452h
            r.l r2 = r7.f10898d
            r.f r2 = r2.f11452h
            q.d r3 = r9.f11446b
            q.c r3 = r3.K
            int r3 = r3.e()
            r.p.b(r1, r2, r3)
            r.f r1 = r9.f11453i
            r.l r2 = r7.f10898d
            r.f r2 = r2.f11453i
            q.d r3 = r9.f11446b
            q.c r3 = r3.M
            int r3 = r3.e()
            int r3 = -r3
            r.p.b(r1, r2, r3)
            r.g r1 = r9.f11449e
            r1.d(r0)
            return
        L_0x0070:
            if (r6 != r3) goto L_0x00ae
            int r1 = r1.r()
            r0.d(r1)
            goto L_0x00ae
        L_0x007a:
            int r0 = r9.f11448d
            if (r0 != r4) goto L_0x00ae
            q.d r0 = r9.f11446b
            q.d r1 = r0.W
            if (r1 == 0) goto L_0x00ae
            int[] r6 = r1.V
            r6 = r6[r2]
            if (r6 == r3) goto L_0x008c
            if (r6 != r4) goto L_0x00ae
        L_0x008c:
            r.f r2 = r9.f11452h
            r.l r3 = r1.f10898d
            r.f r3 = r3.f11452h
            q.c r0 = r0.K
            int r0 = r0.e()
            r.p.b(r2, r3, r0)
            r.f r0 = r9.f11453i
            r.l r1 = r1.f10898d
            r.f r1 = r1.f11453i
            q.d r2 = r9.f11446b
            q.c r2 = r2.M
            int r2 = r2.e()
            int r2 = -r2
            r.p.b(r0, r1, r2)
            return
        L_0x00ae:
            r.g r0 = r9.f11449e
            boolean r1 = r0.f11432j
            if (r1 == 0) goto L_0x0195
            q.d r1 = r9.f11446b
            boolean r6 = r1.f10892a
            if (r6 == 0) goto L_0x0195
            q.c[] r0 = r1.S
            r4 = r0[r2]
            q.c r5 = r4.f10879f
            if (r5 == 0) goto L_0x0127
            r6 = r0[r3]
            q.c r6 = r6.f10879f
            if (r6 == 0) goto L_0x0127
            boolean r0 = r1.y()
            if (r0 == 0) goto L_0x00e6
            r.f r0 = r9.f11452h
            q.d r1 = r9.f11446b
            q.c[] r1 = r1.S
            r1 = r1[r2]
            int r1 = r1.e()
            r0.f11428f = r1
            r.f r0 = r9.f11453i
            q.d r1 = r9.f11446b
            q.c[] r1 = r1.S
            r1 = r1[r3]
            goto L_0x02db
        L_0x00e6:
            q.d r0 = r9.f11446b
            q.c[] r0 = r0.S
            r0 = r0[r2]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x0101
            r.f r1 = r9.f11452h
            q.d r4 = r9.f11446b
            q.c[] r4 = r4.S
            r2 = r4[r2]
            int r2 = r2.e()
            r.p.b(r1, r0, r2)
        L_0x0101:
            q.d r0 = r9.f11446b
            q.c[] r0 = r0.S
            r0 = r0[r3]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x011d
            r.f r1 = r9.f11453i
            q.d r2 = r9.f11446b
            q.c[] r2 = r2.S
            r2 = r2[r3]
            int r2 = r2.e()
            int r2 = -r2
            r.p.b(r1, r0, r2)
        L_0x011d:
            r.f r0 = r9.f11452h
            r0.f11424b = r3
            r.f r0 = r9.f11453i
            r0.f11424b = r3
            goto L_0x0362
        L_0x0127:
            if (r5 == 0) goto L_0x013f
            r.f r0 = r.p.h(r4)
            if (r0 == 0) goto L_0x0362
            r.f r1 = r9.f11452h
            q.d r3 = r9.f11446b
            q.c[] r3 = r3.S
            r2 = r3[r2]
            int r2 = r2.e()
            r.p.b(r1, r0, r2)
            goto L_0x0188
        L_0x013f:
            r0 = r0[r3]
            q.c r2 = r0.f10879f
            if (r2 == 0) goto L_0x0165
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x0362
            r.f r1 = r9.f11453i
            q.d r2 = r9.f11446b
            q.c[] r2 = r2.S
            r2 = r2[r3]
            int r2 = r2.e()
            int r2 = -r2
            r.p.b(r1, r0, r2)
            r.f r0 = r9.f11452h
            r.f r1 = r9.f11453i
            r.g r2 = r9.f11449e
            int r2 = r2.f11429g
            int r2 = -r2
            goto L_0x0190
        L_0x0165:
            boolean r0 = r1 instanceof q.h
            if (r0 != 0) goto L_0x0362
            q.d r0 = r1.W
            if (r0 == 0) goto L_0x0362
            q.c$a r0 = q.c.a.CENTER
            q.c r0 = r1.j(r0)
            q.c r0 = r0.f10879f
            if (r0 != 0) goto L_0x0362
            q.d r0 = r9.f11446b
            q.d r1 = r0.W
            r.l r1 = r1.f10898d
            r.f r1 = r1.f11452h
            r.f r2 = r9.f11452h
            int r0 = r0.s()
            r.p.b(r2, r1, r0)
        L_0x0188:
            r.f r0 = r9.f11453i
            r.f r1 = r9.f11452h
            r.g r2 = r9.f11449e
            int r2 = r2.f11429g
        L_0x0190:
            r.p.b(r0, r1, r2)
            goto L_0x0362
        L_0x0195:
            int r1 = r9.f11448d
            if (r1 != r5) goto L_0x02af
            q.d r1 = r9.f11446b
            int r6 = r1.f10926s
            r7 = 2
            if (r6 == r7) goto L_0x0286
            if (r6 == r5) goto L_0x01a4
            goto L_0x02af
        L_0x01a4:
            int r6 = r1.f10927t
            if (r6 != r5) goto L_0x0238
            r.f r5 = r9.f11452h
            r5.f11423a = r9
            r.f r5 = r9.f11453i
            r5.f11423a = r9
            r.n r5 = r1.f10900e
            r.f r6 = r5.f11452h
            r6.f11423a = r9
            r.f r5 = r5.f11453i
            r5.f11423a = r9
            r0.f11423a = r9
            boolean r0 = r1.z()
            if (r0 == 0) goto L_0x0210
            r.g r0 = r9.f11449e
            java.util.ArrayList r0 = r0.f11433l
            q.d r1 = r9.f11446b
            r.n r1 = r1.f10900e
            r.g r1 = r1.f11449e
            r0.add(r1)
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.g r0 = r0.f11449e
            java.util.ArrayList r0 = r0.k
            r.g r1 = r9.f11449e
            r0.add(r1)
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.g r1 = r0.f11449e
            r1.f11423a = r9
            r.g r1 = r9.f11449e
            java.util.ArrayList r1 = r1.f11433l
            r.f r0 = r0.f11452h
            r1.add(r0)
            r.g r0 = r9.f11449e
            java.util.ArrayList r0 = r0.f11433l
            q.d r1 = r9.f11446b
            r.n r1 = r1.f10900e
            r.f r1 = r1.f11453i
            r0.add(r1)
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.f r0 = r0.f11452h
            java.util.ArrayList r0 = r0.k
            r.g r1 = r9.f11449e
            r0.add(r1)
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.f r0 = r0.f11453i
            java.util.ArrayList r0 = r0.k
            goto L_0x0283
        L_0x0210:
            q.d r0 = r9.f11446b
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0231
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.g r0 = r0.f11449e
            java.util.ArrayList r0 = r0.f11433l
            r.g r1 = r9.f11449e
            r0.add(r1)
            r.g r0 = r9.f11449e
            java.util.ArrayList r0 = r0.k
            q.d r1 = r9.f11446b
            r.n r1 = r1.f10900e
            r.g r1 = r1.f11449e
            goto L_0x02ac
        L_0x0231:
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.g r0 = r0.f11449e
            goto L_0x0281
        L_0x0238:
            r.n r1 = r1.f10900e
            r.g r1 = r1.f11449e
            java.util.ArrayList r0 = r0.f11433l
            r0.add(r1)
            java.util.ArrayList r0 = r1.k
            r.g r1 = r9.f11449e
            r0.add(r1)
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.f r0 = r0.f11452h
            java.util.ArrayList r0 = r0.k
            r.g r1 = r9.f11449e
            r0.add(r1)
            q.d r0 = r9.f11446b
            r.n r0 = r0.f10900e
            r.f r0 = r0.f11453i
            java.util.ArrayList r0 = r0.k
            r.g r1 = r9.f11449e
            r0.add(r1)
            r.g r0 = r9.f11449e
            r0.f11424b = r3
            java.util.ArrayList r0 = r0.k
            r.f r1 = r9.f11452h
            r0.add(r1)
            r.g r0 = r9.f11449e
            java.util.ArrayList r0 = r0.k
            r.f r1 = r9.f11453i
            r0.add(r1)
            r.f r0 = r9.f11452h
            java.util.ArrayList r0 = r0.f11433l
            r.g r1 = r9.f11449e
            r0.add(r1)
            r.f r0 = r9.f11453i
        L_0x0281:
            java.util.ArrayList r0 = r0.f11433l
        L_0x0283:
            r.g r1 = r9.f11449e
            goto L_0x02ac
        L_0x0286:
            q.d r1 = r1.W
            if (r1 != 0) goto L_0x028b
            goto L_0x02af
        L_0x028b:
            r.n r1 = r1.f10900e
            r.g r1 = r1.f11449e
            java.util.ArrayList r0 = r0.f11433l
            r0.add(r1)
            java.util.ArrayList r0 = r1.k
            r.g r1 = r9.f11449e
            r0.add(r1)
            r.g r0 = r9.f11449e
            r0.f11424b = r3
            java.util.ArrayList r0 = r0.k
            r.f r1 = r9.f11452h
            r0.add(r1)
            r.g r0 = r9.f11449e
            java.util.ArrayList r0 = r0.k
            r.f r1 = r9.f11453i
        L_0x02ac:
            r0.add(r1)
        L_0x02af:
            q.d r0 = r9.f11446b
            q.c[] r1 = r0.S
            r5 = r1[r2]
            q.c r6 = r5.f10879f
            if (r6 == 0) goto L_0x0305
            r7 = r1[r3]
            q.c r7 = r7.f10879f
            if (r7 == 0) goto L_0x0305
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x02e4
            r.f r0 = r9.f11452h
            q.d r1 = r9.f11446b
            q.c[] r1 = r1.S
            r1 = r1[r2]
            int r1 = r1.e()
            r0.f11428f = r1
            r.f r0 = r9.f11453i
            q.d r1 = r9.f11446b
            q.c[] r1 = r1.S
            r1 = r1[r3]
        L_0x02db:
            int r1 = r1.e()
            int r1 = -r1
            r0.f11428f = r1
            goto L_0x0362
        L_0x02e4:
            q.d r0 = r9.f11446b
            q.c[] r0 = r0.S
            r0 = r0[r2]
            r.f r0 = r.p.h(r0)
            q.d r1 = r9.f11446b
            q.c[] r1 = r1.S
            r1 = r1[r3]
            r.f r1 = r.p.h(r1)
            if (r0 == 0) goto L_0x02fd
            r0.b(r9)
        L_0x02fd:
            if (r1 == 0) goto L_0x0302
            r1.b(r9)
        L_0x0302:
            r9.f11454j = r4
            goto L_0x0362
        L_0x0305:
            if (r6 == 0) goto L_0x031d
            r.f r0 = r.p.h(r5)
            if (r0 == 0) goto L_0x0362
            r.f r1 = r9.f11452h
            q.d r4 = r9.f11446b
            q.c[] r4 = r4.S
            r2 = r4[r2]
            int r2 = r2.e()
            r.p.b(r1, r0, r2)
            goto L_0x0359
        L_0x031d:
            r1 = r1[r3]
            q.c r2 = r1.f10879f
            if (r2 == 0) goto L_0x0344
            r.f r0 = r.p.h(r1)
            if (r0 == 0) goto L_0x0362
            r.f r1 = r9.f11453i
            q.d r2 = r9.f11446b
            q.c[] r2 = r2.S
            r2 = r2[r3]
            int r2 = r2.e()
            int r2 = -r2
            r.p.b(r1, r0, r2)
            r.f r0 = r9.f11452h
            r.f r1 = r9.f11453i
            r2 = -1
            r.g r3 = r9.f11449e
            r9.c(r0, r1, r2, r3)
            goto L_0x0362
        L_0x0344:
            boolean r1 = r0 instanceof q.h
            if (r1 != 0) goto L_0x0362
            q.d r1 = r0.W
            if (r1 == 0) goto L_0x0362
            r.l r1 = r1.f10898d
            r.f r1 = r1.f11452h
            r.f r2 = r9.f11452h
            int r0 = r0.s()
            r.p.b(r2, r1, r0)
        L_0x0359:
            r.f r0 = r9.f11453i
            r.f r1 = r9.f11452h
            r.g r2 = r9.f11449e
            r9.c(r0, r1, r3, r2)
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.l.d():void");
    }

    public final void e() {
        f fVar = this.f11452h;
        if (fVar.f11432j) {
            this.f11446b.f10895b0 = fVar.f11429g;
        }
    }

    public final void f() {
        this.f11447c = null;
        this.f11452h.c();
        this.f11453i.c();
        this.f11449e.c();
        this.f11451g = false;
    }

    public final boolean k() {
        return this.f11448d != 3 || this.f11446b.f10926s == 0;
    }

    public final void n() {
        this.f11451g = false;
        this.f11452h.c();
        this.f11452h.f11432j = false;
        this.f11453i.c();
        this.f11453i.f11432j = false;
        this.f11449e.f11432j = false;
    }

    public final String toString() {
        StringBuilder g10 = f.g("HorizontalRun ");
        g10.append(this.f11446b.f10912k0);
        return g10.toString();
    }
}
