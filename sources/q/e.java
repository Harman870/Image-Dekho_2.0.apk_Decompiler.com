package q;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o.d;
import r.b;
import z5.c;

public final class e extends k {
    public int A0;
    public int B0 = 0;
    public int C0 = 0;
    public b[] D0 = new b[4];
    public b[] E0 = new b[4];
    public int F0 = 257;
    public boolean G0 = false;
    public boolean H0 = false;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public WeakReference<c> L0 = null;
    public HashSet<d> M0 = new HashSet<>();
    public b.a N0 = new b.a();

    /* renamed from: t0  reason: collision with root package name */
    public b f10932t0 = new b(this);
    public r.e u0 = new r.e(this);

    /* renamed from: v0  reason: collision with root package name */
    public int f10933v0;

    /* renamed from: w0  reason: collision with root package name */
    public b.C0134b f10934w0 = null;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f10935x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public d f10936y0 = new d();

    /* renamed from: z0  reason: collision with root package name */
    public int f10937z0;

    public static void V(d dVar, b.C0134b bVar, b.a aVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        if (bVar != null) {
            if (dVar.f10911j0 == 8 || (dVar instanceof g) || (dVar instanceof a)) {
                aVar.f11408e = 0;
                aVar.f11409f = 0;
                return;
            }
            int[] iArr = dVar.V;
            aVar.f11404a = iArr[0];
            boolean z13 = true;
            aVar.f11405b = iArr[1];
            aVar.f11406c = dVar.r();
            aVar.f11407d = dVar.l();
            aVar.f11412i = false;
            aVar.f11413j = 0;
            if (aVar.f11404a == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (aVar.f11405b == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z9 || dVar.Z <= 0.0f) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z10 || dVar.Z <= 0.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z9 && dVar.u(0) && dVar.f10926s == 0 && !z11) {
                aVar.f11404a = 2;
                if (z10 && dVar.f10927t == 0) {
                    aVar.f11404a = 1;
                }
                z9 = false;
            }
            if (z10 && dVar.u(1) && dVar.f10927t == 0 && !z12) {
                aVar.f11405b = 2;
                if (z9 && dVar.f10926s == 0) {
                    aVar.f11405b = 1;
                }
                z10 = false;
            }
            if (dVar.B()) {
                aVar.f11404a = 1;
                z9 = false;
            }
            if (dVar.C()) {
                aVar.f11405b = 1;
                z10 = false;
            }
            if (z11) {
                if (dVar.u[0] == 4) {
                    aVar.f11404a = 1;
                } else if (!z10) {
                    if (aVar.f11405b == 1) {
                        i12 = aVar.f11407d;
                    } else {
                        aVar.f11404a = 2;
                        ((ConstraintLayout.b) bVar).b(dVar, aVar);
                        i12 = aVar.f11409f;
                    }
                    aVar.f11404a = 1;
                    aVar.f11406c = (int) (dVar.Z * ((float) i12));
                }
            }
            if (z12) {
                if (dVar.u[1] == 4) {
                    aVar.f11405b = 1;
                } else if (!z9) {
                    if (aVar.f11404a == 1) {
                        i10 = aVar.f11406c;
                    } else {
                        aVar.f11405b = 2;
                        ((ConstraintLayout.b) bVar).b(dVar, aVar);
                        i10 = aVar.f11408e;
                    }
                    aVar.f11405b = 1;
                    if (dVar.f10893a0 == -1) {
                        i11 = (int) (((float) i10) / dVar.Z);
                    } else {
                        i11 = (int) (dVar.Z * ((float) i10));
                    }
                    aVar.f11407d = i11;
                }
            }
            ((ConstraintLayout.b) bVar).b(dVar, aVar);
            dVar.O(aVar.f11408e);
            dVar.L(aVar.f11409f);
            dVar.F = aVar.f11411h;
            int i13 = aVar.f11410g;
            dVar.f10899d0 = i13;
            if (i13 <= 0) {
                z13 = false;
            }
            dVar.F = z13;
            aVar.f11413j = 0;
        }
    }

    public final void D() {
        this.f10936y0.u();
        this.f10937z0 = 0;
        this.A0 = 0;
        super.D();
    }

    public final void P(boolean z9, boolean z10) {
        super.P(z9, z10);
        int size = this.f10970s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10970s0.get(i10).P(z9, z10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: q.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: q.a} */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x065a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x07da  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0807 A[LOOP:34: B:481:0x0805->B:482:0x0807, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x086f  */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x087d  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x089b  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x089f  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x08d9  */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x08df  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x08ec  */
    /* JADX WARNING: Removed duplicated region for block: B:613:0x08e1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R() {
        /*
            r27 = this;
            r1 = r27
            r2 = 0
            r1.f10895b0 = r2
            r1.f10897c0 = r2
            r1.G0 = r2
            r1.H0 = r2
            java.util.ArrayList<q.d> r0 = r1.f10970s0
            int r3 = r0.size()
            int r0 = r27.r()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r27.l()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.V
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f10933v0
            r9 = -1
            if (r8 != 0) goto L_0x0238
            int r8 = r1.F0
            boolean r8 = androidx.lifecycle.c0.g(r8, r6)
            if (r8 == 0) goto L_0x0238
            r.b$b r8 = r1.f10934w0
            int[] r11 = r1.V
            r12 = r11[r2]
            r11 = r11[r6]
            r27.F()
            java.util.ArrayList<q.d> r13 = r1.f10970s0
            int r14 = r13.size()
            r15 = r2
        L_0x0047:
            if (r15 >= r14) goto L_0x0055
            java.lang.Object r16 = r13.get(r15)
            q.d r16 = (q.d) r16
            r16.F()
            int r15 = r15 + 1
            goto L_0x0047
        L_0x0055:
            boolean r15 = r1.f10935x0
            if (r12 != r6) goto L_0x0061
            int r12 = r27.r()
            r1.J(r2, r12)
            goto L_0x0068
        L_0x0061:
            q.c r12 = r1.K
            r12.l(r2)
            r1.f10895b0 = r2
        L_0x0068:
            r12 = r2
            r16 = r12
            r17 = r16
        L_0x006d:
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r12 >= r14) goto L_0x00c8
            java.lang.Object r19 = r13.get(r12)
            r10 = r19
            q.d r10 = (q.d) r10
            boolean r2 = r10 instanceof q.g
            if (r2 == 0) goto L_0x00b5
            q.g r10 = (q.g) r10
            int r2 = r10.f10961w0
            if (r2 != r6) goto L_0x00c3
            int r2 = r10.f10959t0
            if (r2 == r9) goto L_0x0088
            goto L_0x00ab
        L_0x0088:
            int r2 = r10.u0
            if (r2 == r9) goto L_0x009a
            boolean r2 = r27.B()
            if (r2 == 0) goto L_0x009a
            int r2 = r27.r()
            int r9 = r10.u0
            int r2 = r2 - r9
            goto L_0x00ab
        L_0x009a:
            boolean r2 = r27.B()
            if (r2 == 0) goto L_0x00b2
            float r2 = r10.f10958s0
            int r9 = r27.r()
            float r9 = (float) r9
            float r2 = r2 * r9
            float r2 = r2 + r18
            int r2 = (int) r2
        L_0x00ab:
            q.c r9 = r10.f10960v0
            r9.l(r2)
            r10.f10962x0 = r6
        L_0x00b2:
            r16 = r6
            goto L_0x00c3
        L_0x00b5:
            boolean r2 = r10 instanceof q.a
            if (r2 == 0) goto L_0x00c3
            q.a r10 = (q.a) r10
            int r2 = r10.T()
            if (r2 != 0) goto L_0x00c3
            r17 = r6
        L_0x00c3:
            int r12 = r12 + 1
            r2 = 0
            r9 = -1
            goto L_0x006d
        L_0x00c8:
            if (r16 == 0) goto L_0x00e6
            r2 = 0
        L_0x00cb:
            if (r2 >= r14) goto L_0x00e6
            java.lang.Object r9 = r13.get(r2)
            q.d r9 = (q.d) r9
            boolean r10 = r9 instanceof q.g
            if (r10 == 0) goto L_0x00e2
            q.g r9 = (q.g) r9
            int r10 = r9.f10961w0
            if (r10 != r6) goto L_0x00e2
            r10 = 0
            r.h.b(r10, r9, r8, r15)
            goto L_0x00e3
        L_0x00e2:
            r10 = 0
        L_0x00e3:
            int r2 = r2 + 1
            goto L_0x00cb
        L_0x00e6:
            r10 = 0
            r.h.b(r10, r1, r8, r15)
            if (r17 == 0) goto L_0x010d
            r2 = 0
        L_0x00ed:
            if (r2 >= r14) goto L_0x010d
            java.lang.Object r9 = r13.get(r2)
            q.d r9 = (q.d) r9
            boolean r10 = r9 instanceof q.a
            if (r10 == 0) goto L_0x010a
            q.a r9 = (q.a) r9
            int r10 = r9.T()
            if (r10 != 0) goto L_0x010a
            boolean r10 = r9.S()
            if (r10 == 0) goto L_0x010a
            r.h.b(r6, r9, r8, r15)
        L_0x010a:
            int r2 = r2 + 1
            goto L_0x00ed
        L_0x010d:
            if (r11 != r6) goto L_0x0118
            int r2 = r27.l()
            r9 = 0
            r1.K(r9, r2)
            goto L_0x0120
        L_0x0118:
            r9 = 0
            q.c r2 = r1.L
            r2.l(r9)
            r1.f10897c0 = r9
        L_0x0120:
            r2 = 0
            r9 = 0
            r10 = 0
        L_0x0123:
            if (r2 >= r14) goto L_0x0177
            java.lang.Object r11 = r13.get(r2)
            q.d r11 = (q.d) r11
            boolean r12 = r11 instanceof q.g
            if (r12 == 0) goto L_0x0167
            q.g r11 = (q.g) r11
            int r12 = r11.f10961w0
            if (r12 != 0) goto L_0x0174
            int r9 = r11.f10959t0
            r12 = -1
            if (r9 == r12) goto L_0x013b
            goto L_0x015e
        L_0x013b:
            int r9 = r11.u0
            if (r9 == r12) goto L_0x014d
            boolean r9 = r27.C()
            if (r9 == 0) goto L_0x014d
            int r9 = r27.l()
            int r12 = r11.u0
            int r9 = r9 - r12
            goto L_0x015e
        L_0x014d:
            boolean r9 = r27.C()
            if (r9 == 0) goto L_0x0165
            float r9 = r11.f10958s0
            int r12 = r27.l()
            float r12 = (float) r12
            float r9 = r9 * r12
            float r9 = r9 + r18
            int r9 = (int) r9
        L_0x015e:
            q.c r12 = r11.f10960v0
            r12.l(r9)
            r11.f10962x0 = r6
        L_0x0165:
            r9 = r6
            goto L_0x0174
        L_0x0167:
            boolean r12 = r11 instanceof q.a
            if (r12 == 0) goto L_0x0174
            q.a r11 = (q.a) r11
            int r11 = r11.T()
            if (r11 != r6) goto L_0x0174
            r10 = r6
        L_0x0174:
            int r2 = r2 + 1
            goto L_0x0123
        L_0x0177:
            if (r9 == 0) goto L_0x0192
            r2 = 0
        L_0x017a:
            if (r2 >= r14) goto L_0x0192
            java.lang.Object r9 = r13.get(r2)
            q.d r9 = (q.d) r9
            boolean r11 = r9 instanceof q.g
            if (r11 == 0) goto L_0x018f
            q.g r9 = (q.g) r9
            int r11 = r9.f10961w0
            if (r11 != 0) goto L_0x018f
            r.h.g(r6, r9, r8)
        L_0x018f:
            int r2 = r2 + 1
            goto L_0x017a
        L_0x0192:
            r2 = 0
            r.h.g(r2, r1, r8)
            if (r10 == 0) goto L_0x01b9
            r2 = 0
        L_0x0199:
            if (r2 >= r14) goto L_0x01b9
            java.lang.Object r9 = r13.get(r2)
            q.d r9 = (q.d) r9
            boolean r10 = r9 instanceof q.a
            if (r10 == 0) goto L_0x01b6
            q.a r9 = (q.a) r9
            int r10 = r9.T()
            if (r10 != r6) goto L_0x01b6
            boolean r10 = r9.S()
            if (r10 == 0) goto L_0x01b6
            r.h.g(r6, r9, r8)
        L_0x01b6:
            int r2 = r2 + 1
            goto L_0x0199
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            if (r2 >= r14) goto L_0x01ef
            java.lang.Object r9 = r13.get(r2)
            q.d r9 = (q.d) r9
            boolean r10 = r9.A()
            if (r10 == 0) goto L_0x01ec
            boolean r10 = r.h.a(r9)
            if (r10 == 0) goto L_0x01ec
            r.b$a r10 = r.h.f11435a
            V(r9, r8, r10)
            boolean r10 = r9 instanceof q.g
            if (r10 == 0) goto L_0x01e5
            r10 = r9
            q.g r10 = (q.g) r10
            int r10 = r10.f10961w0
            if (r10 != 0) goto L_0x01e0
            r10 = 0
            goto L_0x01e9
        L_0x01e0:
            r10 = 0
            r.h.b(r10, r9, r8, r15)
            goto L_0x01ec
        L_0x01e5:
            r10 = 0
            r.h.b(r10, r9, r8, r15)
        L_0x01e9:
            r.h.g(r10, r9, r8)
        L_0x01ec:
            int r2 = r2 + 1
            goto L_0x01ba
        L_0x01ef:
            r2 = 0
        L_0x01f0:
            if (r2 >= r3) goto L_0x0238
            java.util.ArrayList<q.d> r8 = r1.f10970s0
            java.lang.Object r8 = r8.get(r2)
            q.d r8 = (q.d) r8
            boolean r9 = r8.A()
            if (r9 == 0) goto L_0x0235
            boolean r9 = r8 instanceof q.g
            if (r9 != 0) goto L_0x0235
            boolean r9 = r8 instanceof q.a
            if (r9 != 0) goto L_0x0235
            boolean r9 = r8 instanceof q.j
            if (r9 != 0) goto L_0x0235
            boolean r9 = r8.H
            if (r9 != 0) goto L_0x0235
            r9 = 0
            int r10 = r8.k(r9)
            int r9 = r8.k(r6)
            r11 = 3
            if (r10 != r11) goto L_0x0228
            int r10 = r8.f10926s
            if (r10 == r6) goto L_0x0228
            if (r9 != r11) goto L_0x0228
            int r9 = r8.f10927t
            if (r9 == r6) goto L_0x0228
            r9 = r6
            goto L_0x0229
        L_0x0228:
            r9 = 0
        L_0x0229:
            if (r9 != 0) goto L_0x0235
            r.b$a r9 = new r.b$a
            r9.<init>()
            r.b$b r10 = r1.f10934w0
            V(r8, r10, r9)
        L_0x0235:
            int r2 = r2 + 1
            goto L_0x01f0
        L_0x0238:
            r2 = 2
            if (r3 <= r2) goto L_0x0633
            if (r5 == r2) goto L_0x023f
            if (r7 != r2) goto L_0x0633
        L_0x023f:
            int r9 = r1.F0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = androidx.lifecycle.c0.g(r9, r10)
            if (r9 == 0) goto L_0x0633
            r.b$b r9 = r1.f10934w0
            q.c$a r10 = q.c.a.CENTER
            java.util.ArrayList<q.d> r11 = r1.f10970s0
            int r12 = r11.size()
            r13 = 0
        L_0x0254:
            if (r13 >= r12) goto L_0x0288
            java.lang.Object r14 = r11.get(r13)
            q.d r14 = (q.d) r14
            int[] r15 = r1.V
            r16 = 0
            r2 = r15[r16]
            r15 = r15[r6]
            int[] r8 = r14.V
            r21 = r3
            r3 = r8[r16]
            r8 = r8[r6]
            boolean r2 = r.i.b(r2, r15, r3, r8)
            if (r2 != 0) goto L_0x0273
            goto L_0x0277
        L_0x0273:
            boolean r2 = r14 instanceof q.f
            if (r2 == 0) goto L_0x0282
        L_0x0277:
            r24 = r0
            r23 = r4
            r25 = r5
            r22 = r7
        L_0x027f:
            r0 = 0
            goto L_0x05e8
        L_0x0282:
            int r13 = r13 + 1
            r3 = r21
            r2 = 2
            goto L_0x0254
        L_0x0288:
            r21 = r3
            r2 = 0
            r3 = 0
            r6 = 0
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0291:
            if (r6 >= r12) goto L_0x0373
            java.lang.Object r22 = r11.get(r6)
            r23 = r4
            r4 = r22
            q.d r4 = (q.d) r4
            r22 = r7
            int[] r7 = r1.V
            r24 = r0
            r19 = 0
            r0 = r7[r19]
            r16 = 1
            r7 = r7[r16]
            r25 = r5
            int[] r5 = r4.V
            r26 = r11
            r11 = r5[r19]
            r5 = r5[r16]
            boolean r0 = r.i.b(r0, r7, r11, r5)
            if (r0 != 0) goto L_0x02c0
            r.b$a r0 = r1.N0
            V(r4, r9, r0)
        L_0x02c0:
            boolean r0 = r4 instanceof q.g
            if (r0 == 0) goto L_0x02e5
            r5 = r4
            q.g r5 = (q.g) r5
            int r7 = r5.f10961w0
            if (r7 != 0) goto L_0x02d6
            if (r8 != 0) goto L_0x02d3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r7
        L_0x02d3:
            r8.add(r5)
        L_0x02d6:
            int r7 = r5.f10961w0
            r11 = 1
            if (r7 != r11) goto L_0x02e5
            if (r2 != 0) goto L_0x02e2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x02e2:
            r2.add(r5)
        L_0x02e5:
            boolean r5 = r4 instanceof q.i
            if (r5 == 0) goto L_0x0327
            boolean r5 = r4 instanceof q.a
            if (r5 == 0) goto L_0x030f
            r5 = r4
            q.a r5 = (q.a) r5
            int r7 = r5.T()
            if (r7 != 0) goto L_0x0300
            if (r3 != 0) goto L_0x02fd
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x02fd:
            r3.add(r5)
        L_0x0300:
            int r7 = r5.T()
            r11 = 1
            if (r7 != r11) goto L_0x0327
            if (r13 != 0) goto L_0x0324
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x0323
        L_0x030f:
            r5 = r4
            q.i r5 = (q.i) r5
            if (r3 != 0) goto L_0x0319
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0319:
            r3.add(r5)
            if (r13 != 0) goto L_0x0324
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0323:
            r13 = r7
        L_0x0324:
            r13.add(r5)
        L_0x0327:
            q.c r5 = r4.K
            q.c r5 = r5.f10879f
            if (r5 != 0) goto L_0x0343
            q.c r5 = r4.M
            q.c r5 = r5.f10879f
            if (r5 != 0) goto L_0x0343
            if (r0 != 0) goto L_0x0343
            boolean r5 = r4 instanceof q.a
            if (r5 != 0) goto L_0x0343
            if (r14 != 0) goto L_0x0340
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0340:
            r14.add(r4)
        L_0x0343:
            q.c r5 = r4.L
            q.c r5 = r5.f10879f
            if (r5 != 0) goto L_0x0365
            q.c r5 = r4.N
            q.c r5 = r5.f10879f
            if (r5 != 0) goto L_0x0365
            q.c r5 = r4.O
            q.c r5 = r5.f10879f
            if (r5 != 0) goto L_0x0365
            if (r0 != 0) goto L_0x0365
            boolean r0 = r4 instanceof q.a
            if (r0 != 0) goto L_0x0365
            if (r15 != 0) goto L_0x0362
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0362:
            r15.add(r4)
        L_0x0365:
            int r6 = r6 + 1
            r7 = r22
            r4 = r23
            r0 = r24
            r5 = r25
            r11 = r26
            goto L_0x0291
        L_0x0373:
            r24 = r0
            r23 = r4
            r25 = r5
            r22 = r7
            r26 = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x039a
            java.util.Iterator r2 = r2.iterator()
        L_0x0388:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x039a
            java.lang.Object r4 = r2.next()
            q.g r4 = (q.g) r4
            r5 = 0
            r6 = 0
            r.i.a(r4, r6, r0, r5)
            goto L_0x0388
        L_0x039a:
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x03bb
            java.util.Iterator r2 = r3.iterator()
        L_0x03a2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03bb
            java.lang.Object r3 = r2.next()
            q.i r3 = (q.i) r3
            r.o r4 = r.i.a(r3, r6, r0, r5)
            r3.R(r6, r4, r0)
            r4.b(r0)
            r5 = 0
            r6 = 0
            goto L_0x03a2
        L_0x03bb:
            q.c$a r2 = q.c.a.LEFT
            q.c r2 = r1.j(r2)
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 == 0) goto L_0x03dd
            java.util.Iterator r2 = r2.iterator()
        L_0x03c9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03dd
            java.lang.Object r3 = r2.next()
            q.c r3 = (q.c) r3
            q.d r3 = r3.f10877d
            r4 = 0
            r5 = 0
            r.i.a(r3, r5, r0, r4)
            goto L_0x03c9
        L_0x03dd:
            q.c$a r2 = q.c.a.RIGHT
            q.c r2 = r1.j(r2)
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 == 0) goto L_0x03ff
            java.util.Iterator r2 = r2.iterator()
        L_0x03eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ff
            java.lang.Object r3 = r2.next()
            q.c r3 = (q.c) r3
            q.d r3 = r3.f10877d
            r4 = 0
            r5 = 0
            r.i.a(r3, r5, r0, r4)
            goto L_0x03eb
        L_0x03ff:
            q.c r2 = r1.j(r10)
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 == 0) goto L_0x041f
            java.util.Iterator r2 = r2.iterator()
        L_0x040b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.next()
            q.c r3 = (q.c) r3
            q.d r3 = r3.f10877d
            r4 = 0
            r5 = 0
            r.i.a(r3, r5, r0, r4)
            goto L_0x040b
        L_0x041f:
            r4 = 0
            r5 = 0
            if (r14 == 0) goto L_0x0437
            java.util.Iterator r2 = r14.iterator()
        L_0x0427:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0437
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            r.i.a(r3, r5, r0, r4)
            goto L_0x0427
        L_0x0437:
            if (r8 == 0) goto L_0x044e
            java.util.Iterator r2 = r8.iterator()
        L_0x043d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x044e
            java.lang.Object r3 = r2.next()
            q.g r3 = (q.g) r3
            r5 = 1
            r.i.a(r3, r5, r0, r4)
            goto L_0x043d
        L_0x044e:
            r5 = 1
            if (r13 == 0) goto L_0x046e
            java.util.Iterator r2 = r13.iterator()
        L_0x0455:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x046e
            java.lang.Object r3 = r2.next()
            q.i r3 = (q.i) r3
            r.o r6 = r.i.a(r3, r5, r0, r4)
            r3.R(r5, r6, r0)
            r6.b(r0)
            r4 = 0
            r5 = 1
            goto L_0x0455
        L_0x046e:
            q.c$a r2 = q.c.a.TOP
            q.c r2 = r1.j(r2)
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 == 0) goto L_0x0490
            java.util.Iterator r2 = r2.iterator()
        L_0x047c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0490
            java.lang.Object r3 = r2.next()
            q.c r3 = (q.c) r3
            q.d r3 = r3.f10877d
            r4 = 0
            r5 = 1
            r.i.a(r3, r5, r0, r4)
            goto L_0x047c
        L_0x0490:
            q.c$a r2 = q.c.a.BASELINE
            q.c r2 = r1.j(r2)
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 == 0) goto L_0x04b2
            java.util.Iterator r2 = r2.iterator()
        L_0x049e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b2
            java.lang.Object r3 = r2.next()
            q.c r3 = (q.c) r3
            q.d r3 = r3.f10877d
            r4 = 0
            r5 = 1
            r.i.a(r3, r5, r0, r4)
            goto L_0x049e
        L_0x04b2:
            q.c$a r2 = q.c.a.BOTTOM
            q.c r2 = r1.j(r2)
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 == 0) goto L_0x04d4
            java.util.Iterator r2 = r2.iterator()
        L_0x04c0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d4
            java.lang.Object r3 = r2.next()
            q.c r3 = (q.c) r3
            q.d r3 = r3.f10877d
            r4 = 0
            r5 = 1
            r.i.a(r3, r5, r0, r4)
            goto L_0x04c0
        L_0x04d4:
            q.c r2 = r1.j(r10)
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 == 0) goto L_0x04f4
            java.util.Iterator r2 = r2.iterator()
        L_0x04e0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04f4
            java.lang.Object r3 = r2.next()
            q.c r3 = (q.c) r3
            q.d r3 = r3.f10877d
            r4 = 0
            r5 = 1
            r.i.a(r3, r5, r0, r4)
            goto L_0x04e0
        L_0x04f4:
            r4 = 0
            r5 = 1
            if (r15 == 0) goto L_0x050c
            java.util.Iterator r2 = r15.iterator()
        L_0x04fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x050c
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            r.i.a(r3, r5, r0, r4)
            goto L_0x04fc
        L_0x050c:
            r2 = 0
        L_0x050d:
            if (r2 >= r12) goto L_0x056c
            r3 = r26
            java.lang.Object r4 = r3.get(r2)
            q.d r4 = (q.d) r4
            int[] r6 = r4.V
            r7 = 0
            r8 = r6[r7]
            r7 = 3
            if (r8 != r7) goto L_0x0525
            r6 = r6[r5]
            if (r6 != r7) goto L_0x0525
            r5 = 1
            goto L_0x0526
        L_0x0525:
            r5 = 0
        L_0x0526:
            if (r5 == 0) goto L_0x0566
            int r5 = r4.f10923q0
            int r6 = r0.size()
            r8 = 0
        L_0x052f:
            if (r8 >= r6) goto L_0x053f
            java.lang.Object r9 = r0.get(r8)
            r.o r9 = (r.o) r9
            int r10 = r9.f11441b
            if (r5 != r10) goto L_0x053c
            goto L_0x0540
        L_0x053c:
            int r8 = r8 + 1
            goto L_0x052f
        L_0x053f:
            r9 = 0
        L_0x0540:
            int r4 = r4.f10925r0
            int r5 = r0.size()
            r6 = 0
        L_0x0547:
            if (r6 >= r5) goto L_0x0557
            java.lang.Object r8 = r0.get(r6)
            r.o r8 = (r.o) r8
            int r10 = r8.f11441b
            if (r4 != r10) goto L_0x0554
            goto L_0x0558
        L_0x0554:
            int r6 = r6 + 1
            goto L_0x0547
        L_0x0557:
            r8 = 0
        L_0x0558:
            if (r9 == 0) goto L_0x0566
            if (r8 == 0) goto L_0x0566
            r4 = 0
            r9.d(r4, r8)
            r4 = 2
            r8.f11442c = r4
            r0.remove(r9)
        L_0x0566:
            int r2 = r2 + 1
            r26 = r3
            r5 = 1
            goto L_0x050d
        L_0x056c:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x0575
            goto L_0x027f
        L_0x0575:
            int[] r2 = r1.V
            r3 = 0
            r2 = r2[r3]
            r3 = 2
            if (r2 != r3) goto L_0x05ab
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x0583:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05a1
            java.lang.Object r5 = r2.next()
            r.o r5 = (r.o) r5
            int r6 = r5.f11442c
            r7 = 1
            if (r6 != r7) goto L_0x0595
            goto L_0x0583
        L_0x0595:
            o.d r6 = r1.f10936y0
            r8 = 0
            int r6 = r5.c(r6, r8)
            if (r6 <= r4) goto L_0x0583
            r3 = r5
            r4 = r6
            goto L_0x0583
        L_0x05a1:
            r7 = 1
            if (r3 == 0) goto L_0x05ac
            r1.M(r7)
            r1.O(r4)
            goto L_0x05ad
        L_0x05ab:
            r7 = 1
        L_0x05ac:
            r3 = 0
        L_0x05ad:
            int[] r2 = r1.V
            r2 = r2[r7]
            r4 = 2
            if (r2 != r4) goto L_0x05e2
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r4 = 0
        L_0x05ba:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05d8
            java.lang.Object r5 = r0.next()
            r.o r5 = (r.o) r5
            int r6 = r5.f11442c
            if (r6 != 0) goto L_0x05cc
            r7 = 1
            goto L_0x05ba
        L_0x05cc:
            o.d r6 = r1.f10936y0
            r7 = 1
            int r6 = r5.c(r6, r7)
            if (r6 <= r4) goto L_0x05ba
            r2 = r5
            r4 = r6
            goto L_0x05ba
        L_0x05d8:
            r7 = 1
            if (r2 == 0) goto L_0x05e2
            r1.N(r7)
            r1.L(r4)
            goto L_0x05e3
        L_0x05e2:
            r2 = 0
        L_0x05e3:
            if (r3 != 0) goto L_0x05e7
            if (r2 == 0) goto L_0x027f
        L_0x05e7:
            r0 = 1
        L_0x05e8:
            if (r0 == 0) goto L_0x062a
            r2 = r25
            r3 = 2
            if (r2 != r3) goto L_0x0605
            int r0 = r27.r()
            r3 = r24
            if (r3 >= r0) goto L_0x0600
            if (r3 <= 0) goto L_0x0600
            r1.O(r3)
            r4 = 1
            r1.G0 = r4
            goto L_0x0607
        L_0x0600:
            int r0 = r27.r()
            goto L_0x0608
        L_0x0605:
            r3 = r24
        L_0x0607:
            r0 = r3
        L_0x0608:
            r4 = r22
            r3 = 2
            if (r4 != r3) goto L_0x0623
            int r3 = r27.l()
            r5 = r23
            if (r5 >= r3) goto L_0x061e
            if (r5 <= 0) goto L_0x061e
            r1.L(r5)
            r3 = 1
            r1.H0 = r3
            goto L_0x0625
        L_0x061e:
            int r3 = r27.l()
            goto L_0x0626
        L_0x0623:
            r5 = r23
        L_0x0625:
            r3 = r5
        L_0x0626:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x063a
        L_0x062a:
            r4 = r22
            r5 = r23
            r3 = r24
            r2 = r25
            goto L_0x0639
        L_0x0633:
            r21 = r3
            r2 = r5
            r3 = r0
            r5 = r4
            r4 = r7
        L_0x0639:
            r0 = 0
        L_0x063a:
            r6 = 64
            boolean r7 = r1.W(r6)
            if (r7 != 0) goto L_0x064d
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.W(r7)
            if (r7 == 0) goto L_0x064b
            goto L_0x064d
        L_0x064b:
            r7 = 0
            goto L_0x064e
        L_0x064d:
            r7 = 1
        L_0x064e:
            o.d r8 = r1.f10936y0
            r8.getClass()
            r9 = 0
            r8.f10433g = r9
            int r10 = r1.F0
            if (r10 == 0) goto L_0x0660
            if (r7 == 0) goto L_0x0660
            r7 = 1
            r8.f10433g = r7
            goto L_0x0661
        L_0x0660:
            r7 = 1
        L_0x0661:
            java.util.ArrayList<q.d> r8 = r1.f10970s0
            int[] r10 = r1.V
            r11 = r10[r9]
            r12 = 2
            if (r11 == r12) goto L_0x0671
            r10 = r10[r7]
            if (r10 != r12) goto L_0x066f
            goto L_0x0671
        L_0x066f:
            r10 = r9
            goto L_0x0672
        L_0x0671:
            r10 = 1
        L_0x0672:
            r1.B0 = r9
            r1.C0 = r9
            r9 = r21
            r7 = 0
        L_0x0679:
            if (r7 >= r9) goto L_0x068f
            java.util.ArrayList<q.d> r11 = r1.f10970s0
            java.lang.Object r11 = r11.get(r7)
            q.d r11 = (q.d) r11
            boolean r12 = r11 instanceof q.k
            if (r12 == 0) goto L_0x068c
            q.k r11 = (q.k) r11
            r11.R()
        L_0x068c:
            int r7 = r7 + 1
            goto L_0x0679
        L_0x068f:
            boolean r7 = r1.W(r6)
            r11 = r0
            r0 = 0
            r12 = 1
        L_0x0696:
            if (r12 == 0) goto L_0x08e8
            r13 = 1
            int r14 = r0 + 1
            o.d r0 = r1.f10936y0     // Catch:{ Exception -> 0x0776 }
            r0.u()     // Catch:{ Exception -> 0x0776 }
            r13 = 0
            r1.B0 = r13     // Catch:{ Exception -> 0x0776 }
            r1.C0 = r13     // Catch:{ Exception -> 0x0776 }
            o.d r0 = r1.f10936y0     // Catch:{ Exception -> 0x0776 }
            r1.h(r0)     // Catch:{ Exception -> 0x0776 }
            r0 = 0
        L_0x06ab:
            if (r0 >= r9) goto L_0x06bd
            java.util.ArrayList<q.d> r13 = r1.f10970s0     // Catch:{ Exception -> 0x0776 }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x0776 }
            q.d r13 = (q.d) r13     // Catch:{ Exception -> 0x0776 }
            o.d r15 = r1.f10936y0     // Catch:{ Exception -> 0x0776 }
            r13.h(r15)     // Catch:{ Exception -> 0x0776 }
            int r0 = r0 + 1
            goto L_0x06ab
        L_0x06bd:
            o.d r0 = r1.f10936y0     // Catch:{ Exception -> 0x0776 }
            r1.T(r0)     // Catch:{ Exception -> 0x0776 }
            java.lang.ref.WeakReference<q.c> r0 = r1.I0     // Catch:{ Exception -> 0x0768 }
            r12 = 5
            if (r0 == 0) goto L_0x06ec
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            if (r0 == 0) goto L_0x06ec
            java.lang.ref.WeakReference<q.c> r0 = r1.I0     // Catch:{ Exception -> 0x0768 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            q.c r0 = (q.c) r0     // Catch:{ Exception -> 0x0768 }
            o.d r13 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            q.c r15 = r1.L     // Catch:{ Exception -> 0x0768 }
            o.h r13 = r13.l(r15)     // Catch:{ Exception -> 0x0768 }
            o.d r15 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            o.h r0 = r15.l(r0)     // Catch:{ Exception -> 0x0768 }
            o.d r15 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            r6 = 0
            r15.f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x0768 }
            r6 = 0
            r1.I0 = r6     // Catch:{ Exception -> 0x0773 }
        L_0x06ec:
            java.lang.ref.WeakReference<q.c> r0 = r1.K0     // Catch:{ Exception -> 0x0768 }
            if (r0 == 0) goto L_0x0715
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            if (r0 == 0) goto L_0x0715
            java.lang.ref.WeakReference<q.c> r0 = r1.K0     // Catch:{ Exception -> 0x0768 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            q.c r0 = (q.c) r0     // Catch:{ Exception -> 0x0768 }
            o.d r6 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            q.c r13 = r1.N     // Catch:{ Exception -> 0x0768 }
            o.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0768 }
            o.d r13 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            o.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0768 }
            o.d r13 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0768 }
            r6 = 0
            r1.K0 = r6     // Catch:{ Exception -> 0x0773 }
        L_0x0715:
            java.lang.ref.WeakReference<q.c> r0 = r1.J0     // Catch:{ Exception -> 0x0768 }
            if (r0 == 0) goto L_0x073e
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            if (r0 == 0) goto L_0x073e
            java.lang.ref.WeakReference<q.c> r0 = r1.J0     // Catch:{ Exception -> 0x0768 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            q.c r0 = (q.c) r0     // Catch:{ Exception -> 0x0768 }
            o.d r6 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            q.c r13 = r1.K     // Catch:{ Exception -> 0x0768 }
            o.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0768 }
            o.d r13 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            o.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0768 }
            o.d r13 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            r15 = 0
            r13.f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x0768 }
            r6 = 0
            r1.J0 = r6     // Catch:{ Exception -> 0x0773 }
        L_0x073e:
            java.lang.ref.WeakReference<q.c> r0 = r1.L0     // Catch:{ Exception -> 0x0768 }
            if (r0 == 0) goto L_0x076b
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            if (r0 == 0) goto L_0x076b
            java.lang.ref.WeakReference<q.c> r0 = r1.L0     // Catch:{ Exception -> 0x0768 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0768 }
            q.c r0 = (q.c) r0     // Catch:{ Exception -> 0x0768 }
            o.d r6 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            q.c r13 = r1.M     // Catch:{ Exception -> 0x0768 }
            o.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0768 }
            o.d r13 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            o.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0768 }
            o.d r13 = r1.f10936y0     // Catch:{ Exception -> 0x0768 }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0768 }
            r6 = 0
            r1.L0 = r6     // Catch:{ Exception -> 0x0773 }
            goto L_0x076c
        L_0x0768:
            r0 = move-exception
            r6 = 0
            goto L_0x0774
        L_0x076b:
            r6 = 0
        L_0x076c:
            o.d r0 = r1.f10936y0     // Catch:{ Exception -> 0x0773 }
            r0.q()     // Catch:{ Exception -> 0x0773 }
            r12 = 1
            goto L_0x0791
        L_0x0773:
            r0 = move-exception
        L_0x0774:
            r12 = 1
            goto L_0x0778
        L_0x0776:
            r0 = move-exception
            r6 = 0
        L_0x0778:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x0791:
            if (r12 == 0) goto L_0x07da
            o.d r0 = r1.f10936y0
            boolean[] r6 = androidx.lifecycle.c0.f1725i
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.W(r6)
            r1.Q(r0, r12)
            java.util.ArrayList<q.d> r13 = r1.f10970s0
            int r13 = r13.size()
            r15 = 0
            r20 = 0
        L_0x07ad:
            if (r15 >= r13) goto L_0x07d8
            java.util.ArrayList<q.d> r6 = r1.f10970s0
            java.lang.Object r6 = r6.get(r15)
            q.d r6 = (q.d) r6
            r6.Q(r0, r12)
            r22 = r0
            int r0 = r6.f10908i
            r23 = r12
            r12 = -1
            if (r0 != r12) goto L_0x07ca
            int r0 = r6.f10910j
            if (r0 == r12) goto L_0x07c8
            goto L_0x07ca
        L_0x07c8:
            r0 = 0
            goto L_0x07cb
        L_0x07ca:
            r0 = 1
        L_0x07cb:
            if (r0 == 0) goto L_0x07cf
            r20 = 1
        L_0x07cf:
            int r15 = r15 + 1
            r0 = r22
            r12 = r23
            r6 = 64
            goto L_0x07ad
        L_0x07d8:
            r12 = -1
            goto L_0x07f5
        L_0x07da:
            r12 = -1
            o.d r0 = r1.f10936y0
            r1.Q(r0, r7)
            r0 = 0
        L_0x07e1:
            if (r0 >= r9) goto L_0x07f3
            java.util.ArrayList<q.d> r6 = r1.f10970s0
            java.lang.Object r6 = r6.get(r0)
            q.d r6 = (q.d) r6
            o.d r13 = r1.f10936y0
            r6.Q(r13, r7)
            int r0 = r0 + 1
            goto L_0x07e1
        L_0x07f3:
            r20 = 0
        L_0x07f5:
            r0 = 8
            if (r10 == 0) goto L_0x085f
            if (r14 >= r0) goto L_0x085f
            boolean[] r6 = androidx.lifecycle.c0.f1725i
            r13 = 2
            boolean r6 = r6[r13]
            if (r6 == 0) goto L_0x085f
            r6 = 0
            r13 = 0
            r15 = 0
        L_0x0805:
            if (r6 >= r9) goto L_0x082c
            java.util.ArrayList<q.d> r12 = r1.f10970s0
            java.lang.Object r12 = r12.get(r6)
            q.d r12 = (q.d) r12
            int r0 = r12.f10895b0
            int r23 = r12.r()
            int r0 = r23 + r0
            int r13 = java.lang.Math.max(r13, r0)
            int r0 = r12.f10897c0
            int r12 = r12.l()
            int r12 = r12 + r0
            int r15 = java.lang.Math.max(r15, r12)
            int r6 = r6 + 1
            r0 = 8
            r12 = -1
            goto L_0x0805
        L_0x082c:
            int r0 = r1.f10901e0
            int r0 = java.lang.Math.max(r0, r13)
            int r6 = r1.f10903f0
            int r6 = java.lang.Math.max(r6, r15)
            r12 = 2
            if (r2 != r12) goto L_0x084c
            int r13 = r27.r()
            if (r13 >= r0) goto L_0x084c
            r1.O(r0)
            int[] r0 = r1.V
            r11 = 0
            r0[r11] = r12
            r11 = 1
            r20 = 1
        L_0x084c:
            if (r4 != r12) goto L_0x085f
            int r0 = r27.l()
            if (r0 >= r6) goto L_0x085f
            r1.L(r6)
            int[] r0 = r1.V
            r6 = 1
            r0[r6] = r12
            r11 = 1
            r20 = 1
        L_0x085f:
            int r0 = r1.f10901e0
            int r6 = r27.r()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r27.r()
            if (r0 <= r6) goto L_0x087d
            r1.O(r0)
            int[] r0 = r1.V
            r6 = 1
            r11 = 0
            r0[r11] = r6
            r16 = r6
            r20 = r16
            goto L_0x0880
        L_0x087d:
            r6 = 1
            r16 = r11
        L_0x0880:
            int r0 = r1.f10903f0
            int r11 = r27.l()
            int r0 = java.lang.Math.max(r0, r11)
            int r11 = r27.l()
            if (r0 <= r11) goto L_0x089b
            r1.L(r0)
            int[] r0 = r1.V
            r0[r6] = r6
            r0 = r6
            r20 = r0
            goto L_0x089d
        L_0x089b:
            r0 = r16
        L_0x089d:
            if (r0 != 0) goto L_0x08d9
            int[] r11 = r1.V
            r12 = 0
            r11 = r11[r12]
            r13 = 2
            if (r11 != r13) goto L_0x08bb
            if (r3 <= 0) goto L_0x08bb
            int r11 = r27.r()
            if (r11 <= r3) goto L_0x08bb
            r1.G0 = r6
            int[] r0 = r1.V
            r0[r12] = r6
            r1.O(r3)
            r0 = r6
            r20 = r0
        L_0x08bb:
            int[] r11 = r1.V
            r11 = r11[r6]
            r12 = 2
            if (r11 != r12) goto L_0x08da
            if (r5 <= 0) goto L_0x08da
            int r11 = r27.l()
            if (r11 <= r5) goto L_0x08da
            r1.H0 = r6
            int[] r0 = r1.V
            r0[r6] = r6
            r1.L(r5)
            r0 = 8
            r11 = 1
            r20 = 1
            goto L_0x08dd
        L_0x08d9:
            r12 = 2
        L_0x08da:
            r11 = r0
            r0 = 8
        L_0x08dd:
            if (r14 <= r0) goto L_0x08e1
            r20 = 0
        L_0x08e1:
            r0 = r14
            r12 = r20
            r6 = 64
            goto L_0x0696
        L_0x08e8:
            r1.f10970s0 = r8
            if (r11 == 0) goto L_0x08f4
            int[] r0 = r1.V
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r4
        L_0x08f4:
            o.d r0 = r1.f10936y0
            o.c r0 = r0.f10437l
            r1.G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.R():void");
    }

    public final void S(int i10, d dVar) {
        if (i10 == 0) {
            int i11 = this.B0 + 1;
            b[] bVarArr = this.E0;
            if (i11 >= bVarArr.length) {
                this.E0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.E0;
            int i12 = this.B0;
            bVarArr2[i12] = new b(dVar, 0, this.f10935x0);
            this.B0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.C0 + 1;
            b[] bVarArr3 = this.D0;
            if (i13 >= bVarArr3.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.D0;
            int i14 = this.C0;
            bVarArr4[i14] = new b(dVar, 1, this.f10935x0);
            this.C0 = i14 + 1;
        }
    }

    public final void T(d dVar) {
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean W = W(64);
        c(dVar, W);
        int size = this.f10970s0.size();
        boolean z13 = false;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = this.f10970s0.get(i11);
            boolean[] zArr = dVar2.U;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z13 = true;
            }
        }
        if (z13) {
            for (int i12 = 0; i12 < size; i12++) {
                d dVar3 = this.f10970s0.get(i12);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i13 = 0; i13 < aVar.f10964t0; i13++) {
                        d dVar4 = aVar.f10963s0[i13];
                        if (aVar.f10855v0 || dVar4.d()) {
                            int i14 = aVar.u0;
                            if (i14 == 0 || i14 == 1) {
                                dVar4.U[0] = true;
                            } else if (i14 == 2 || i14 == 3) {
                                dVar4.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.M0.clear();
        for (int i15 = 0; i15 < size; i15++) {
            d dVar5 = this.f10970s0.get(i15);
            dVar5.getClass();
            if ((dVar5 instanceof j) || (dVar5 instanceof g)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (dVar5 instanceof j) {
                    this.M0.add(dVar5);
                } else {
                    dVar5.c(dVar, W);
                }
            }
        }
        while (this.M0.size() > 0) {
            int size2 = this.M0.size();
            Iterator<d> it = this.M0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) it.next();
                HashSet<d> hashSet = this.M0;
                int i16 = 0;
                while (true) {
                    if (i16 >= jVar.f10964t0) {
                        z11 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(jVar.f10963s0[i16])) {
                        z11 = true;
                        continue;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (z11) {
                    jVar.c(dVar, W);
                    this.M0.remove(jVar);
                    break;
                }
            }
            if (size2 == this.M0.size()) {
                Iterator<d> it2 = this.M0.iterator();
                while (it2.hasNext()) {
                    it2.next().c(dVar, W);
                }
                this.M0.clear();
            }
        }
        if (d.f10425p) {
            HashSet hashSet2 = new HashSet();
            for (int i17 = 0; i17 < size; i17++) {
                d dVar6 = this.f10970s0.get(i17);
                dVar6.getClass();
                if ((dVar6 instanceof j) || (dVar6 instanceof g)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    hashSet2.add(dVar6);
                }
            }
            if (this.V[0] == 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            b(this, dVar, hashSet2, i10, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar7 = (d) it3.next();
                c0.f(this, dVar, dVar7);
                dVar7.c(dVar, W);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                d dVar8 = this.f10970s0.get(i18);
                if (dVar8 instanceof e) {
                    int[] iArr = dVar8.V;
                    int i19 = iArr[0];
                    int i20 = iArr[1];
                    if (i19 == 2) {
                        dVar8.M(1);
                    }
                    if (i20 == 2) {
                        dVar8.N(1);
                    }
                    dVar8.c(dVar, W);
                    if (i19 == 2) {
                        dVar8.M(i19);
                    }
                    if (i20 == 2) {
                        dVar8.N(i20);
                    }
                } else {
                    c0.f(this, dVar, dVar8);
                    if ((dVar8 instanceof j) || (dVar8 instanceof g)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        dVar8.c(dVar, W);
                    }
                }
            }
        }
        if (this.B0 > 0) {
            c.d(this, dVar, (ArrayList) null, 0);
        }
        if (this.C0 > 0) {
            c.d(this, dVar, (ArrayList) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0127 A[EDGE_INSN: B:75:0x0127->B:60:0x0127 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U(int r12, boolean r13) {
        /*
            r11 = this;
            r.e r0 = r11.u0
            r1 = 1
            r13 = r13 & r1
            q.e r2 = r0.f11415a
            r3 = 0
            int r2 = r2.k(r3)
            q.e r4 = r0.f11415a
            int r4 = r4.k(r1)
            q.e r5 = r0.f11415a
            int r5 = r5.s()
            q.e r6 = r0.f11415a
            int r6 = r6.t()
            if (r13 == 0) goto L_0x007f
            r7 = 2
            if (r2 == r7) goto L_0x0024
            if (r4 != r7) goto L_0x007f
        L_0x0024:
            java.util.ArrayList<r.p> r8 = r0.f11419e
            java.util.Iterator r8 = r8.iterator()
        L_0x002a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0041
            java.lang.Object r9 = r8.next()
            r.p r9 = (r.p) r9
            int r10 = r9.f11450f
            if (r10 != r12) goto L_0x002a
            boolean r9 = r9.k()
            if (r9 != 0) goto L_0x002a
            r13 = r3
        L_0x0041:
            if (r12 != 0) goto L_0x0060
            if (r13 == 0) goto L_0x007f
            if (r2 != r7) goto L_0x007f
            q.e r13 = r0.f11415a
            r13.M(r1)
            q.e r13 = r0.f11415a
            int r7 = r0.d(r13, r3)
            r13.O(r7)
            q.e r13 = r0.f11415a
            r.l r7 = r13.f10898d
            r.g r7 = r7.f11449e
            int r13 = r13.r()
            goto L_0x007c
        L_0x0060:
            if (r13 == 0) goto L_0x007f
            if (r4 != r7) goto L_0x007f
            q.e r13 = r0.f11415a
            r13.N(r1)
            q.e r13 = r0.f11415a
            int r7 = r0.d(r13, r1)
            r13.L(r7)
            q.e r13 = r0.f11415a
            r.n r7 = r13.f10900e
            r.g r7 = r7.f11449e
            int r13 = r13.l()
        L_0x007c:
            r7.d(r13)
        L_0x007f:
            q.e r13 = r0.f11415a
            int[] r7 = r13.V
            r8 = 4
            if (r12 != 0) goto L_0x00a2
            r6 = r7[r3]
            if (r6 == r1) goto L_0x008c
            if (r6 != r8) goto L_0x00a9
        L_0x008c:
            int r13 = r13.r()
            int r13 = r13 + r5
            q.e r6 = r0.f11415a
            r.l r6 = r6.f10898d
            r.f r6 = r6.f11453i
            r6.d(r13)
            q.e r6 = r0.f11415a
            r.l r6 = r6.f10898d
            r.g r6 = r6.f11449e
            int r13 = r13 - r5
            goto L_0x00c1
        L_0x00a2:
            r5 = r7[r1]
            if (r5 == r1) goto L_0x00ab
            if (r5 != r8) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r13 = r3
            goto L_0x00c5
        L_0x00ab:
            int r13 = r13.l()
            int r13 = r13 + r6
            q.e r5 = r0.f11415a
            r.n r5 = r5.f10900e
            r.f r5 = r5.f11453i
            r5.d(r13)
            q.e r5 = r0.f11415a
            r.n r5 = r5.f10900e
            r.g r5 = r5.f11449e
            int r13 = r13 - r6
            r6 = r5
        L_0x00c1:
            r6.d(r13)
            r13 = r1
        L_0x00c5:
            r0.g()
            java.util.ArrayList<r.p> r5 = r0.f11419e
            java.util.Iterator r5 = r5.iterator()
        L_0x00ce:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ee
            java.lang.Object r6 = r5.next()
            r.p r6 = (r.p) r6
            int r7 = r6.f11450f
            if (r7 == r12) goto L_0x00df
            goto L_0x00ce
        L_0x00df:
            q.d r7 = r6.f11446b
            q.e r8 = r0.f11415a
            if (r7 != r8) goto L_0x00ea
            boolean r7 = r6.f11451g
            if (r7 != 0) goto L_0x00ea
            goto L_0x00ce
        L_0x00ea:
            r6.e()
            goto L_0x00ce
        L_0x00ee:
            java.util.ArrayList<r.p> r5 = r0.f11419e
            java.util.Iterator r5 = r5.iterator()
        L_0x00f4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0127
            java.lang.Object r6 = r5.next()
            r.p r6 = (r.p) r6
            int r7 = r6.f11450f
            if (r7 == r12) goto L_0x0105
            goto L_0x00f4
        L_0x0105:
            if (r13 != 0) goto L_0x010e
            q.d r7 = r6.f11446b
            q.e r8 = r0.f11415a
            if (r7 != r8) goto L_0x010e
            goto L_0x00f4
        L_0x010e:
            r.f r7 = r6.f11452h
            boolean r7 = r7.f11432j
            if (r7 != 0) goto L_0x0115
            goto L_0x0126
        L_0x0115:
            r.f r7 = r6.f11453i
            boolean r7 = r7.f11432j
            if (r7 != 0) goto L_0x011c
            goto L_0x0126
        L_0x011c:
            boolean r7 = r6 instanceof r.c
            if (r7 != 0) goto L_0x00f4
            r.g r6 = r6.f11449e
            boolean r6 = r6.f11432j
            if (r6 != 0) goto L_0x00f4
        L_0x0126:
            r1 = r3
        L_0x0127:
            q.e r12 = r0.f11415a
            r12.M(r2)
            q.e r12 = r0.f11415a
            r12.N(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.U(int, boolean):boolean");
    }

    public final boolean W(int i10) {
        return (this.F0 & i10) == i10;
    }

    public final void o(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        sb.append("  actualWidth:" + this.X);
        sb.append("\n");
        sb.append("  actualHeight:" + this.Y);
        sb.append("\n");
        Iterator<d> it = this.f10970s0.iterator();
        while (it.hasNext()) {
            it.next().o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
