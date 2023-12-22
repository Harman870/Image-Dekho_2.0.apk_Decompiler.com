package q;

import java.util.ArrayList;
import o.d;

public final class f extends j {
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public ArrayList<a> Y0 = new ArrayList<>();
    public d[] Z0 = null;

    /* renamed from: a1  reason: collision with root package name */
    public d[] f10938a1 = null;

    /* renamed from: b1  reason: collision with root package name */
    public int[] f10939b1 = null;
    public d[] c1;

    /* renamed from: d1  reason: collision with root package name */
    public int f10940d1 = 0;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10941a;

        /* renamed from: b  reason: collision with root package name */
        public d f10942b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f10943c = 0;

        /* renamed from: d  reason: collision with root package name */
        public c f10944d;

        /* renamed from: e  reason: collision with root package name */
        public c f10945e;

        /* renamed from: f  reason: collision with root package name */
        public c f10946f;

        /* renamed from: g  reason: collision with root package name */
        public c f10947g;

        /* renamed from: h  reason: collision with root package name */
        public int f10948h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f10949i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f10950j = 0;
        public int k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f10951l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f10952m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f10953n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f10954o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f10955p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f10956q = 0;

        public a(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
            this.f10941a = i10;
            this.f10944d = cVar;
            this.f10945e = cVar2;
            this.f10946f = cVar3;
            this.f10947g = cVar4;
            this.f10948h = f.this.f10968y0;
            this.f10949i = f.this.u0;
            this.f10950j = f.this.f10969z0;
            this.k = f.this.f10965v0;
            this.f10956q = i11;
        }

        public final void a(d dVar) {
            int i10 = 0;
            if (this.f10941a == 0) {
                int V = f.this.V(this.f10956q, dVar);
                if (dVar.V[0] == 3) {
                    this.f10955p++;
                    V = 0;
                }
                f fVar = f.this;
                int i11 = fVar.R0;
                if (dVar.f10911j0 != 8) {
                    i10 = i11;
                }
                this.f10951l = V + i10 + this.f10951l;
                int U = fVar.U(this.f10956q, dVar);
                if (this.f10942b == null || this.f10943c < U) {
                    this.f10942b = dVar;
                    this.f10943c = U;
                    this.f10952m = U;
                }
            } else {
                int V2 = f.this.V(this.f10956q, dVar);
                int U2 = f.this.U(this.f10956q, dVar);
                if (dVar.V[1] == 3) {
                    this.f10955p++;
                    U2 = 0;
                }
                int i12 = f.this.S0;
                if (dVar.f10911j0 != 8) {
                    i10 = i12;
                }
                this.f10952m = U2 + i10 + this.f10952m;
                if (this.f10942b == null || this.f10943c < V2) {
                    this.f10942b = dVar;
                    this.f10943c = V2;
                    this.f10951l = V2;
                }
            }
            this.f10954o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:142:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r17, boolean r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f10954o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x001e
                int r4 = r0.f10953n
                int r4 = r4 + r3
                q.f r5 = q.f.this
                int r6 = r5.f10940d1
                if (r4 < r6) goto L_0x0012
                goto L_0x001e
            L_0x0012:
                q.d[] r5 = r5.c1
                r4 = r5[r4]
                if (r4 == 0) goto L_0x001b
                r4.E()
            L_0x001b:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x001e:
                if (r1 == 0) goto L_0x02db
                q.d r3 = r0.f10942b
                if (r3 != 0) goto L_0x0026
                goto L_0x02db
            L_0x0026:
                if (r19 == 0) goto L_0x002c
                if (r17 != 0) goto L_0x002c
                r4 = 1
                goto L_0x002d
            L_0x002c:
                r4 = r2
            L_0x002d:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x0031:
                if (r6 >= r1) goto L_0x0055
                if (r18 == 0) goto L_0x0039
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x003a
            L_0x0039:
                r9 = r6
            L_0x003a:
                int r10 = r0.f10953n
                int r10 = r10 + r9
                q.f r9 = q.f.this
                int r11 = r9.f10940d1
                if (r10 < r11) goto L_0x0044
                goto L_0x0055
            L_0x0044:
                q.d[] r9 = r9.c1
                r9 = r9[r10]
                if (r9 == 0) goto L_0x0052
                int r9 = r9.f10911j0
                if (r9 != 0) goto L_0x0052
                if (r7 != r5) goto L_0x0051
                r7 = r6
            L_0x0051:
                r8 = r6
            L_0x0052:
                int r6 = r6 + 1
                goto L_0x0031
            L_0x0055:
                int r6 = r0.f10941a
                r9 = 0
                if (r6 != 0) goto L_0x01a1
                q.d r6 = r0.f10942b
                q.f r10 = q.f.this
                int r11 = r10.G0
                r6.f10916m0 = r11
                int r11 = r0.f10949i
                if (r17 <= 0) goto L_0x0069
                int r10 = r10.S0
                int r11 = r11 + r10
            L_0x0069:
                q.c r10 = r6.L
                q.c r12 = r0.f10945e
                r10.a(r12, r11)
                if (r19 == 0) goto L_0x007b
                q.c r10 = r6.N
                q.c r11 = r0.f10947g
                int r12 = r0.k
                r10.a(r11, r12)
            L_0x007b:
                if (r17 <= 0) goto L_0x0088
                q.c r10 = r0.f10945e
                q.d r10 = r10.f10877d
                q.c r10 = r10.N
                q.c r11 = r6.L
                r10.a(r11, r2)
            L_0x0088:
                q.f r10 = q.f.this
                int r10 = r10.U0
                r11 = 3
                if (r10 != r11) goto L_0x00b3
                boolean r10 = r6.F
                if (r10 != 0) goto L_0x00b3
                r10 = r2
            L_0x0094:
                if (r10 >= r1) goto L_0x00b3
                if (r18 == 0) goto L_0x009c
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x009d
            L_0x009c:
                r12 = r10
            L_0x009d:
                int r13 = r0.f10953n
                int r13 = r13 + r12
                q.f r12 = q.f.this
                int r14 = r12.f10940d1
                if (r13 < r14) goto L_0x00a7
                goto L_0x00b3
            L_0x00a7:
                q.d[] r12 = r12.c1
                r12 = r12[r13]
                boolean r13 = r12.F
                if (r13 == 0) goto L_0x00b0
                goto L_0x00b4
            L_0x00b0:
                int r10 = r10 + 1
                goto L_0x0094
            L_0x00b3:
                r12 = r6
            L_0x00b4:
                r10 = r2
            L_0x00b5:
                if (r10 >= r1) goto L_0x02db
                if (r18 == 0) goto L_0x00bd
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00be
            L_0x00bd:
                r13 = r10
            L_0x00be:
                int r14 = r0.f10953n
                int r14 = r14 + r13
                q.f r15 = q.f.this
                int r11 = r15.f10940d1
                if (r14 < r11) goto L_0x00c9
                goto L_0x02db
            L_0x00c9:
                q.d[] r11 = r15.c1
                r11 = r11[r14]
                if (r11 != 0) goto L_0x00d2
                r3 = 3
                goto L_0x019b
            L_0x00d2:
                if (r10 != 0) goto L_0x00dd
                q.c r14 = r11.K
                q.c r15 = r0.f10944d
                int r3 = r0.f10948h
                r11.g(r14, r15, r3)
            L_0x00dd:
                if (r13 != 0) goto L_0x0114
                q.f r3 = q.f.this
                int r13 = r3.F0
                r14 = 1065353216(0x3f800000, float:1.0)
                if (r18 == 0) goto L_0x00ec
                float r15 = r3.L0
                float r15 = r14 - r15
                goto L_0x00ee
            L_0x00ec:
                float r15 = r3.L0
            L_0x00ee:
                int r2 = r0.f10953n
                if (r2 != 0) goto L_0x00fe
                int r2 = r3.H0
                if (r2 == r5) goto L_0x00fe
                if (r18 == 0) goto L_0x00fb
                float r3 = r3.N0
                goto L_0x0108
            L_0x00fb:
                float r3 = r3.N0
                goto L_0x010e
            L_0x00fe:
                if (r19 == 0) goto L_0x0110
                int r2 = r3.J0
                if (r2 == r5) goto L_0x0110
                if (r18 == 0) goto L_0x010c
                float r3 = r3.P0
            L_0x0108:
                float r14 = r14 - r3
                r13 = r2
                r15 = r14
                goto L_0x0110
            L_0x010c:
                float r3 = r3.P0
            L_0x010e:
                r13 = r2
                r15 = r3
            L_0x0110:
                r11.f10914l0 = r13
                r11.f10905g0 = r15
            L_0x0114:
                int r2 = r1 + -1
                if (r10 != r2) goto L_0x0121
                q.c r2 = r11.M
                q.c r3 = r0.f10946f
                int r13 = r0.f10950j
                r11.g(r2, r3, r13)
            L_0x0121:
                if (r9 == 0) goto L_0x0155
                q.c r2 = r11.K
                q.c r3 = r9.M
                q.f r13 = q.f.this
                int r13 = r13.R0
                r2.a(r3, r13)
                if (r10 != r7) goto L_0x013c
                q.c r2 = r11.K
                int r3 = r0.f10948h
                boolean r13 = r2.h()
                if (r13 == 0) goto L_0x013c
                r2.f10881h = r3
            L_0x013c:
                q.c r2 = r9.M
                q.c r3 = r11.K
                r13 = 0
                r2.a(r3, r13)
                r2 = 1
                int r3 = r8 + 1
                if (r10 != r3) goto L_0x0155
                q.c r2 = r9.M
                int r3 = r0.f10950j
                boolean r9 = r2.h()
                if (r9 == 0) goto L_0x0155
                r2.f10881h = r3
            L_0x0155:
                if (r11 == r6) goto L_0x0199
                q.f r2 = q.f.this
                int r2 = r2.U0
                r3 = 3
                if (r2 != r3) goto L_0x016d
                boolean r9 = r12.F
                if (r9 == 0) goto L_0x016d
                if (r11 == r12) goto L_0x016d
                boolean r9 = r11.F
                if (r9 == 0) goto L_0x016d
                q.c r2 = r11.O
                q.c r9 = r12.O
                goto L_0x0193
            L_0x016d:
                if (r2 == 0) goto L_0x018f
                r9 = 1
                if (r2 == r9) goto L_0x018a
                q.c r2 = r11.L
                if (r4 == 0) goto L_0x0184
                q.c r9 = r0.f10945e
                int r13 = r0.f10949i
                r2.a(r9, r13)
                q.c r2 = r11.N
                q.c r9 = r0.f10947g
                int r13 = r0.k
                goto L_0x0194
            L_0x0184:
                q.c r9 = r6.L
                r13 = 0
                r2.a(r9, r13)
            L_0x018a:
                q.c r2 = r11.N
                q.c r9 = r6.N
                goto L_0x0193
            L_0x018f:
                q.c r2 = r11.L
                q.c r9 = r6.L
            L_0x0193:
                r13 = 0
            L_0x0194:
                r2.a(r9, r13)
            L_0x0197:
                r9 = r11
                goto L_0x019b
            L_0x0199:
                r3 = 3
                goto L_0x0197
            L_0x019b:
                int r10 = r10 + 1
                r11 = r3
                r2 = 0
                goto L_0x00b5
            L_0x01a1:
                q.d r2 = r0.f10942b
                q.f r3 = q.f.this
                int r6 = r3.F0
                r2.f10914l0 = r6
                int r6 = r0.f10948h
                if (r17 <= 0) goto L_0x01b0
                int r3 = r3.R0
                int r6 = r6 + r3
            L_0x01b0:
                if (r18 == 0) goto L_0x01cf
                q.c r3 = r2.M
                q.c r10 = r0.f10946f
                r3.a(r10, r6)
                if (r19 == 0) goto L_0x01c4
                q.c r3 = r2.K
                q.c r6 = r0.f10944d
                int r10 = r0.f10950j
                r3.a(r6, r10)
            L_0x01c4:
                if (r17 <= 0) goto L_0x01ef
                q.c r3 = r0.f10946f
                q.d r3 = r3.f10877d
                q.c r3 = r3.K
                q.c r6 = r2.M
                goto L_0x01eb
            L_0x01cf:
                q.c r3 = r2.K
                q.c r10 = r0.f10944d
                r3.a(r10, r6)
                if (r19 == 0) goto L_0x01e1
                q.c r3 = r2.M
                q.c r6 = r0.f10946f
                int r10 = r0.f10950j
                r3.a(r6, r10)
            L_0x01e1:
                if (r17 <= 0) goto L_0x01ef
                q.c r3 = r0.f10944d
                q.d r3 = r3.f10877d
                q.c r3 = r3.M
                q.c r6 = r2.K
            L_0x01eb:
                r10 = 0
                r3.a(r6, r10)
            L_0x01ef:
                r13 = 0
            L_0x01f0:
                if (r13 >= r1) goto L_0x02db
                int r3 = r0.f10953n
                int r3 = r3 + r13
                q.f r6 = q.f.this
                int r10 = r6.f10940d1
                if (r3 < r10) goto L_0x01fd
                goto L_0x02db
            L_0x01fd:
                q.d[] r6 = r6.c1
                r3 = r6[r3]
                if (r3 != 0) goto L_0x0207
                r10 = 1
                r11 = 0
                goto L_0x02d7
            L_0x0207:
                if (r13 != 0) goto L_0x0232
                q.c r6 = r3.L
                q.c r10 = r0.f10945e
                int r11 = r0.f10949i
                r3.g(r6, r10, r11)
                q.f r6 = q.f.this
                int r10 = r6.G0
                float r11 = r6.M0
                int r12 = r0.f10953n
                if (r12 != 0) goto L_0x0225
                int r12 = r6.I0
                if (r12 == r5) goto L_0x0225
                float r6 = r6.O0
            L_0x0222:
                r11 = r6
                r10 = r12
                goto L_0x022e
            L_0x0225:
                if (r19 == 0) goto L_0x022e
                int r12 = r6.K0
                if (r12 == r5) goto L_0x022e
                float r6 = r6.Q0
                goto L_0x0222
            L_0x022e:
                r3.f10916m0 = r10
                r3.f10907h0 = r11
            L_0x0232:
                int r6 = r1 + -1
                if (r13 != r6) goto L_0x023f
                q.c r6 = r3.N
                q.c r10 = r0.f10947g
                int r11 = r0.k
                r3.g(r6, r10, r11)
            L_0x023f:
                if (r9 == 0) goto L_0x0273
                q.c r6 = r3.L
                q.c r10 = r9.N
                q.f r11 = q.f.this
                int r11 = r11.S0
                r6.a(r10, r11)
                if (r13 != r7) goto L_0x025a
                q.c r6 = r3.L
                int r10 = r0.f10949i
                boolean r11 = r6.h()
                if (r11 == 0) goto L_0x025a
                r6.f10881h = r10
            L_0x025a:
                q.c r6 = r9.N
                q.c r10 = r3.L
                r11 = 0
                r6.a(r10, r11)
                r6 = 1
                int r10 = r8 + 1
                if (r13 != r10) goto L_0x0273
                q.c r6 = r9.N
                int r9 = r0.k
                boolean r10 = r6.h()
                if (r10 == 0) goto L_0x0273
                r6.f10881h = r9
            L_0x0273:
                if (r3 == r2) goto L_0x02d4
                r6 = 2
                q.f r9 = q.f.this
                if (r18 == 0) goto L_0x029e
                int r9 = r9.T0
                if (r9 == 0) goto L_0x0293
                r10 = 1
                if (r9 == r10) goto L_0x028d
                if (r9 == r6) goto L_0x0284
                goto L_0x02d4
            L_0x0284:
                q.c r6 = r3.K
                q.c r9 = r2.K
                r10 = 0
                r6.a(r9, r10)
                goto L_0x0294
            L_0x028d:
                r10 = 0
                q.c r6 = r3.K
                q.c r9 = r2.K
                goto L_0x0298
            L_0x0293:
                r10 = 0
            L_0x0294:
                q.c r6 = r3.M
                q.c r9 = r2.M
            L_0x0298:
                r6.a(r9, r10)
                r11 = r10
                r10 = 1
                goto L_0x02d6
            L_0x029e:
                int r9 = r9.T0
                if (r9 == 0) goto L_0x02ca
                r10 = 1
                if (r9 == r10) goto L_0x02c4
                if (r9 == r6) goto L_0x02a8
                goto L_0x02d5
            L_0x02a8:
                q.c r6 = r3.K
                if (r4 == 0) goto L_0x02bd
                q.c r9 = r0.f10944d
                int r11 = r0.f10948h
                r6.a(r9, r11)
                q.c r6 = r3.M
                q.c r9 = r0.f10946f
                int r11 = r0.f10950j
                r6.a(r9, r11)
                goto L_0x02d5
            L_0x02bd:
                q.c r9 = r2.K
                r11 = 0
                r6.a(r9, r11)
                goto L_0x02c5
            L_0x02c4:
                r11 = 0
            L_0x02c5:
                q.c r6 = r3.M
                q.c r9 = r2.M
                goto L_0x02d0
            L_0x02ca:
                r10 = 1
                r11 = 0
                q.c r6 = r3.K
                q.c r9 = r2.K
            L_0x02d0:
                r6.a(r9, r11)
                goto L_0x02d6
            L_0x02d4:
                r10 = 1
            L_0x02d5:
                r11 = 0
            L_0x02d6:
                r9 = r3
            L_0x02d7:
                int r13 = r13 + 1
                goto L_0x01f0
            L_0x02db:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.f.a.b(int, boolean, boolean):void");
        }

        public final int c() {
            if (this.f10941a == 1) {
                return this.f10952m - f.this.S0;
            }
            return this.f10952m;
        }

        public final int d() {
            if (this.f10941a == 0) {
                return this.f10951l - f.this.R0;
            }
            return this.f10951l;
        }

        public final void e(int i10) {
            int i11;
            int i12;
            int i13;
            int i14 = this.f10955p;
            if (i14 != 0) {
                int i15 = this.f10954o;
                int i16 = i10 / i14;
                for (int i17 = 0; i17 < i15; i17++) {
                    int i18 = this.f10953n + i17;
                    f fVar = f.this;
                    if (i18 >= fVar.f10940d1) {
                        break;
                    }
                    d dVar = fVar.c1[i18];
                    int i19 = 1;
                    if (this.f10941a == 0) {
                        if (dVar != null) {
                            int[] iArr = dVar.V;
                            if (iArr[0] == 3 && dVar.f10926s == 0) {
                                i12 = iArr[1];
                                i11 = dVar.l();
                                i13 = i16;
                            }
                        }
                    } else {
                        if (dVar != null) {
                            int[] iArr2 = dVar.V;
                            if (iArr2[1] == 3 && dVar.f10927t == 0) {
                                int i20 = iArr2[0];
                                i13 = dVar.r();
                                i11 = i16;
                                i12 = 1;
                                i19 = i20;
                            }
                        }
                    }
                    fVar.T(dVar, i19, i13, i12, i11);
                }
                this.f10951l = 0;
                this.f10952m = 0;
                this.f10942b = null;
                this.f10943c = 0;
                int i21 = this.f10954o;
                int i22 = 0;
                while (i22 < i21) {
                    int i23 = this.f10953n + i22;
                    f fVar2 = f.this;
                    if (i23 < fVar2.f10940d1) {
                        d dVar2 = fVar2.c1[i23];
                        if (this.f10941a == 0) {
                            int r4 = dVar2.r();
                            f fVar3 = f.this;
                            int i24 = fVar3.R0;
                            if (dVar2.f10911j0 == 8) {
                                i24 = 0;
                            }
                            this.f10951l = r4 + i24 + this.f10951l;
                            int U = fVar3.U(this.f10956q, dVar2);
                            if (this.f10942b == null || this.f10943c < U) {
                                this.f10942b = dVar2;
                                this.f10943c = U;
                                this.f10952m = U;
                            }
                        } else {
                            int V = fVar2.V(this.f10956q, dVar2);
                            int U2 = f.this.U(this.f10956q, dVar2);
                            int i25 = f.this.S0;
                            if (dVar2.f10911j0 == 8) {
                                i25 = 0;
                            }
                            this.f10952m = U2 + i25 + this.f10952m;
                            if (this.f10942b == null || this.f10943c < V) {
                                this.f10942b = dVar2;
                                this.f10943c = V;
                                this.f10951l = V;
                            }
                        }
                        i22++;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f10941a = i10;
            this.f10944d = cVar;
            this.f10945e = cVar2;
            this.f10946f = cVar3;
            this.f10947g = cVar4;
            this.f10948h = i11;
            this.f10949i = i12;
            this.f10950j = i13;
            this.k = i14;
            this.f10956q = i15;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v15, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v101, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v19, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r32v9 */
    /* JADX WARNING: type inference failed for: r1v100 */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x04f3, code lost:
        r1 = r35;
        r2 = r36;
        r3 = r37;
        r9 = r32;
        r32 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
        if (r8.G0 == -1) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b9, code lost:
        if (r8.G0 == -1) goto L_0x00bb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x07f0  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0800  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x081b  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0512 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(int r35, int r36, int r37, int r38) {
        /*
            r34 = this;
            r8 = r34
            int r0 = r8.f10964t0
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r0 <= 0) goto L_0x008e
            q.d r0 = r8.W
            if (r0 == 0) goto L_0x0013
            q.e r0 = (q.e) r0
            r.b$b r0 = r0.f10934w0
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0019
            r0 = r12
            goto L_0x0085
        L_0x0019:
            r2 = r12
        L_0x001a:
            int r3 = r8.f10964t0
            if (r2 >= r3) goto L_0x0084
            q.d[] r3 = r8.f10963s0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0025
            goto L_0x0081
        L_0x0025:
            boolean r4 = r3 instanceof q.g
            if (r4 == 0) goto L_0x002a
            goto L_0x0081
        L_0x002a:
            int r4 = r3.k(r12)
            int r5 = r3.k(r11)
            if (r4 != r9) goto L_0x0040
            int r6 = r3.f10926s
            if (r6 == r11) goto L_0x0040
            if (r5 != r9) goto L_0x0040
            int r6 = r3.f10927t
            if (r6 == r11) goto L_0x0040
            r6 = r11
            goto L_0x0041
        L_0x0040:
            r6 = r12
        L_0x0041:
            if (r6 == 0) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            if (r4 != r9) goto L_0x0047
            r4 = r10
        L_0x0047:
            if (r5 != r9) goto L_0x004a
            r5 = r10
        L_0x004a:
            r.b$a r6 = r8.D0
            r6.f11404a = r4
            r6.f11405b = r5
            int r4 = r3.r()
            r6.f11406c = r4
            r.b$a r4 = r8.D0
            int r5 = r3.l()
            r4.f11407d = r5
            r.b$a r4 = r8.D0
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.b) r5
            r5.b(r3, r4)
            r.b$a r4 = r8.D0
            int r4 = r4.f11408e
            r3.O(r4)
            r.b$a r4 = r8.D0
            int r4 = r4.f11409f
            r3.L(r4)
            r.b$a r4 = r8.D0
            int r4 = r4.f11410g
            r3.f10899d0 = r4
            if (r4 <= 0) goto L_0x007e
            r4 = r11
            goto L_0x007f
        L_0x007e:
            r4 = r12
        L_0x007f:
            r3.F = r4
        L_0x0081:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x0084:
            r0 = r11
        L_0x0085:
            if (r0 != 0) goto L_0x008e
            r8.B0 = r12
            r8.C0 = r12
            r8.A0 = r12
            return
        L_0x008e:
            int r13 = r8.f10968y0
            int r14 = r8.f10969z0
            int r15 = r8.u0
            int r7 = r8.f10965v0
            int[] r6 = new int[r10]
            int r0 = r36 - r13
            int r0 = r0 - r14
            int r2 = r8.X0
            if (r2 != r11) goto L_0x00a2
            int r0 = r38 - r15
            int r0 = r0 - r7
        L_0x00a2:
            r5 = r0
            r0 = -1
            if (r2 != 0) goto L_0x00b1
            int r2 = r8.F0
            if (r2 != r0) goto L_0x00ac
            r8.F0 = r12
        L_0x00ac:
            int r2 = r8.G0
            if (r2 != r0) goto L_0x00bd
            goto L_0x00bb
        L_0x00b1:
            int r2 = r8.F0
            if (r2 != r0) goto L_0x00b7
            r8.F0 = r12
        L_0x00b7:
            int r2 = r8.G0
            if (r2 != r0) goto L_0x00bd
        L_0x00bb:
            r8.G0 = r12
        L_0x00bd:
            q.d[] r0 = r8.f10963s0
            r2 = r12
            r3 = r2
        L_0x00c1:
            int r4 = r8.f10964t0
            r1 = 8
            if (r2 >= r4) goto L_0x00d4
            q.d[] r4 = r8.f10963s0
            r4 = r4[r2]
            int r4 = r4.f10911j0
            if (r4 != r1) goto L_0x00d1
            int r3 = r3 + 1
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x00c1
        L_0x00d4:
            if (r3 <= 0) goto L_0x00ef
            int r4 = r4 - r3
            q.d[] r0 = new q.d[r4]
            r2 = r12
            r4 = r2
        L_0x00db:
            int r3 = r8.f10964t0
            if (r2 >= r3) goto L_0x00ef
            q.d[] r3 = r8.f10963s0
            r3 = r3[r2]
            int r12 = r3.f10911j0
            if (r12 == r1) goto L_0x00eb
            r0[r4] = r3
            int r4 = r4 + 1
        L_0x00eb:
            int r2 = r2 + 1
            r12 = 0
            goto L_0x00db
        L_0x00ef:
            r12 = r0
            r8.c1 = r12
            r8.f10940d1 = r4
            int r0 = r8.V0
            if (r0 == 0) goto L_0x0729
            if (r0 == r11) goto L_0x052e
            if (r0 == r10) goto L_0x036c
            if (r0 == r9) goto L_0x010b
            r0 = r35
            r2 = r36
            r3 = r37
            r5 = r38
            r1 = r11
            r4 = 0
            r11 = r8
            goto L_0x07e0
        L_0x010b:
            int r3 = r8.X0
            if (r4 != 0) goto L_0x011b
            r32 = r6
            r29 = r7
            r28 = r13
            r31 = r14
            r30 = r15
            goto L_0x0739
        L_0x011b:
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.clear()
            q.f$a r2 = new q.f$a
            q.c r1 = r8.K
            q.c r0 = r8.L
            q.c r10 = r8.M
            q.c r9 = r8.N
            r16 = r0
            r0 = r2
            r19 = r1
            r1 = r34
            r11 = r2
            r2 = r3
            r27 = r3
            r3 = r19
            r28 = r13
            r13 = r4
            r4 = r16
            r29 = r5
            r5 = r10
            r10 = r6
            r6 = r9
            r9 = r7
            r7 = r29
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.add(r11)
            if (r27 != 0) goto L_0x01ed
            r2 = r11
            r0 = 0
            r1 = 0
            r3 = 0
            r11 = 0
        L_0x0153:
            if (r11 >= r13) goto L_0x01e1
            r4 = 1
            int r7 = r0 + 1
            r6 = r12[r11]
            r5 = r29
            int r16 = r8.V(r5, r6)
            int[] r0 = r6.V
            r4 = 0
            r0 = r0[r4]
            r4 = 3
            if (r0 != r4) goto L_0x016a
            int r1 = r1 + 1
        L_0x016a:
            r19 = r1
            if (r3 == r5) goto L_0x0175
            int r0 = r8.R0
            int r0 = r0 + r3
            int r0 = r0 + r16
            if (r0 <= r5) goto L_0x017b
        L_0x0175:
            q.d r0 = r2.f10942b
            if (r0 == 0) goto L_0x017b
            r0 = 1
            goto L_0x017c
        L_0x017b:
            r0 = 0
        L_0x017c:
            if (r0 != 0) goto L_0x0187
            if (r11 <= 0) goto L_0x0187
            int r1 = r8.W0
            if (r1 <= 0) goto L_0x0187
            if (r7 <= r1) goto L_0x0187
            r0 = 1
        L_0x0187:
            if (r0 == 0) goto L_0x01c0
            q.f$a r4 = new q.f$a
            q.c r3 = r8.K
            q.c r2 = r8.L
            q.c r1 = r8.M
            q.c r0 = r8.N
            r20 = r0
            r0 = r4
            r21 = r1
            r1 = r34
            r22 = r2
            r2 = r27
            r29 = r9
            r9 = r4
            r4 = r22
            r30 = r5
            r5 = r21
            r31 = r14
            r14 = r6
            r6 = r20
            r20 = r7
            r7 = r30
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f10953n = r11
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.add(r9)
            r2 = r9
            r3 = r16
            r0 = r20
            goto L_0x01d2
        L_0x01c0:
            r30 = r5
            r29 = r9
            r31 = r14
            r14 = r6
            if (r11 <= 0) goto L_0x01cf
            int r0 = r8.R0
            int r0 = r0 + r16
            int r16 = r0 + r3
        L_0x01cf:
            r3 = r16
            r0 = 0
        L_0x01d2:
            r2.a(r14)
            int r11 = r11 + 1
            r1 = r19
            r9 = r29
            r29 = r30
            r14 = r31
            goto L_0x0153
        L_0x01e1:
            r31 = r14
            r30 = r29
            r29 = r9
            r14 = r30
            r30 = r15
            goto L_0x0267
        L_0x01ed:
            r31 = r14
            r30 = r29
            r29 = r9
            r2 = r11
            r0 = 0
            r1 = 0
            r9 = 0
        L_0x01f7:
            if (r9 >= r13) goto L_0x0262
            r11 = r12[r9]
            r14 = r30
            int r16 = r8.U(r14, r11)
            int[] r3 = r11.V
            r4 = 1
            r3 = r3[r4]
            r4 = 3
            if (r3 != r4) goto L_0x020b
            int r0 = r0 + 1
        L_0x020b:
            r19 = r0
            if (r1 == r14) goto L_0x0216
            int r0 = r8.S0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r14) goto L_0x021c
        L_0x0216:
            q.d r0 = r2.f10942b
            if (r0 == 0) goto L_0x021c
            r0 = 1
            goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            if (r0 != 0) goto L_0x0228
            if (r9 <= 0) goto L_0x0228
            int r3 = r8.W0
            if (r3 <= 0) goto L_0x0228
            if (r3 >= 0) goto L_0x0228
            r0 = 1
        L_0x0228:
            if (r0 == 0) goto L_0x0249
            q.f$a r7 = new q.f$a
            q.c r3 = r8.K
            q.c r4 = r8.L
            q.c r5 = r8.M
            q.c r6 = r8.N
            r0 = r7
            r1 = r34
            r2 = r27
            r30 = r15
            r15 = r7
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r15.f10953n = r9
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.add(r15)
            r2 = r15
            goto L_0x0254
        L_0x0249:
            r30 = r15
            if (r9 <= 0) goto L_0x0254
            int r0 = r8.S0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0256
        L_0x0254:
            r1 = r16
        L_0x0256:
            r2.a(r11)
            int r9 = r9 + 1
            r0 = r19
            r15 = r30
            r30 = r14
            goto L_0x01f7
        L_0x0262:
            r14 = r30
            r30 = r15
            r1 = r0
        L_0x0267:
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            int r0 = r0.size()
            q.c r2 = r8.K
            q.c r3 = r8.L
            q.c r4 = r8.M
            q.c r5 = r8.N
            int r6 = r8.f10968y0
            int r7 = r8.u0
            int r9 = r8.f10969z0
            int r11 = r8.f10965v0
            int[] r12 = r8.V
            r13 = 0
            r15 = r12[r13]
            r13 = 2
            if (r15 == r13) goto L_0x028d
            r15 = 1
            r12 = r12[r15]
            if (r12 != r13) goto L_0x028b
            goto L_0x028d
        L_0x028b:
            r12 = 0
            goto L_0x028e
        L_0x028d:
            r12 = 1
        L_0x028e:
            if (r1 <= 0) goto L_0x02b0
            if (r12 == 0) goto L_0x02b0
            r1 = 0
        L_0x0293:
            if (r1 >= r0) goto L_0x02b0
            java.util.ArrayList<q.f$a> r12 = r8.Y0
            java.lang.Object r12 = r12.get(r1)
            q.f$a r12 = (q.f.a) r12
            if (r27 != 0) goto L_0x02a4
            int r13 = r12.d()
            goto L_0x02a8
        L_0x02a4:
            int r13 = r12.c()
        L_0x02a8:
            int r13 = r14 - r13
            r12.e(r13)
            int r1 = r1 + 1
            goto L_0x0293
        L_0x02b0:
            r1 = 0
            r12 = 0
            r13 = 0
        L_0x02b3:
            if (r1 >= r0) goto L_0x0362
            java.util.ArrayList<q.f$a> r15 = r8.Y0
            java.lang.Object r15 = r15.get(r1)
            q.f$a r15 = (q.f.a) r15
            if (r27 != 0) goto L_0x030f
            int r5 = r0 + -1
            if (r1 >= r5) goto L_0x02d5
            java.util.ArrayList<q.f$a> r5 = r8.Y0
            int r11 = r1 + 1
            java.lang.Object r5 = r5.get(r11)
            q.f$a r5 = (q.f.a) r5
            q.d r5 = r5.f10942b
            q.c r5 = r5.L
            r32 = r10
            r11 = 0
            goto L_0x02db
        L_0x02d5:
            q.c r5 = r8.N
            int r11 = r8.f10965v0
            r32 = r10
        L_0x02db:
            q.d r10 = r15.f10942b
            q.c r10 = r10.N
            r16 = r15
            r17 = r27
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r11
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r15.d()
            int r3 = java.lang.Math.max(r12, r3)
            int r7 = r15.c()
            int r7 = r7 + r13
            if (r1 <= 0) goto L_0x030a
            int r12 = r8.S0
            int r7 = r7 + r12
        L_0x030a:
            r12 = r3
            r13 = r7
            r3 = r10
            r7 = 0
            goto L_0x035c
        L_0x030f:
            r32 = r10
            int r4 = r0 + -1
            if (r1 >= r4) goto L_0x0325
            java.util.ArrayList<q.f$a> r4 = r8.Y0
            int r9 = r1 + 1
            java.lang.Object r4 = r4.get(r9)
            q.f$a r4 = (q.f.a) r4
            q.d r4 = r4.f10942b
            q.c r4 = r4.K
            r9 = 0
            goto L_0x0329
        L_0x0325:
            q.c r4 = r8.M
            int r9 = r8.f10969z0
        L_0x0329:
            q.d r10 = r15.f10942b
            q.c r10 = r10.M
            r16 = r15
            r17 = r27
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r11
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r15.d()
            int r2 = r2 + r12
            int r6 = r15.c()
            int r6 = java.lang.Math.max(r13, r6)
            if (r1 <= 0) goto L_0x0358
            int r12 = r8.R0
            int r2 = r2 + r12
        L_0x0358:
            r12 = r2
            r13 = r6
            r2 = r10
            r6 = 0
        L_0x035c:
            int r1 = r1 + 1
            r10 = r32
            goto L_0x02b3
        L_0x0362:
            r32 = r10
            r1 = 0
            r32[r1] = r12
            r0 = 1
            r32[r0] = r13
            goto L_0x0739
        L_0x036c:
            r32 = r6
            r29 = r7
            r28 = r13
            r31 = r14
            r30 = r15
            r13 = r4
            r14 = r5
            int r0 = r8.X0
            int r1 = r8.W0
            if (r0 != 0) goto L_0x03a1
            if (r1 > 0) goto L_0x039e
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0383:
            if (r1 >= r13) goto L_0x039d
            if (r1 <= 0) goto L_0x038a
            int r4 = r8.R0
            int r2 = r2 + r4
        L_0x038a:
            r4 = r12[r1]
            if (r4 != 0) goto L_0x038f
            goto L_0x039a
        L_0x038f:
            int r4 = r8.V(r14, r4)
            int r4 = r4 + r2
            if (r4 <= r14) goto L_0x0397
            goto L_0x039d
        L_0x0397:
            int r3 = r3 + 1
            r2 = r4
        L_0x039a:
            int r1 = r1 + 1
            goto L_0x0383
        L_0x039d:
            r1 = r3
        L_0x039e:
            r2 = r1
            r1 = 0
            goto L_0x03c2
        L_0x03a1:
            if (r1 > 0) goto L_0x03c1
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x03a6:
            if (r1 >= r13) goto L_0x03c0
            if (r1 <= 0) goto L_0x03ad
            int r4 = r8.S0
            int r2 = r2 + r4
        L_0x03ad:
            r4 = r12[r1]
            if (r4 != 0) goto L_0x03b2
            goto L_0x03bd
        L_0x03b2:
            int r4 = r8.U(r14, r4)
            int r4 = r4 + r2
            if (r4 <= r14) goto L_0x03ba
            goto L_0x03c0
        L_0x03ba:
            int r3 = r3 + 1
            r2 = r4
        L_0x03bd:
            int r1 = r1 + 1
            goto L_0x03a6
        L_0x03c0:
            r1 = r3
        L_0x03c1:
            r2 = 0
        L_0x03c2:
            int[] r3 = r8.f10939b1
            if (r3 != 0) goto L_0x03cb
            r3 = 2
            int[] r3 = new int[r3]
            r8.f10939b1 = r3
        L_0x03cb:
            if (r1 != 0) goto L_0x03d0
            r3 = 1
            if (r0 == r3) goto L_0x03d4
        L_0x03d0:
            if (r2 != 0) goto L_0x03e8
            if (r0 != 0) goto L_0x03e8
        L_0x03d4:
            r3 = r37
            r4 = r38
            r5 = r0
            r6 = r1
            r7 = r2
            r10 = r8
            r11 = r10
            r15 = r30
            r9 = r32
            r0 = 1
            r1 = r35
            r2 = r36
            goto L_0x0502
        L_0x03e8:
            r3 = r38
            r4 = r0
            r5 = r1
            r6 = r2
            r10 = r8
            r11 = r10
            r15 = r30
            r7 = r32
            r9 = 0
            r0 = r35
            r1 = r36
            r2 = r37
        L_0x03fa:
            if (r9 != 0) goto L_0x0512
            if (r4 != 0) goto L_0x040d
            float r5 = (float) r13
            r35 = r0
            float r0 = (float) r6
            float r5 = r5 / r0
            r36 = r1
            double r0 = (double) r5
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r5 = r0
            goto L_0x041b
        L_0x040d:
            r35 = r0
            r36 = r1
            float r0 = (float) r13
            float r1 = (float) r5
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r6 = r0
        L_0x041b:
            q.d[] r0 = r10.f10938a1
            if (r0 == 0) goto L_0x0428
            int r1 = r0.length
            if (r1 >= r6) goto L_0x0423
            goto L_0x0428
        L_0x0423:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x042d
        L_0x0428:
            r1 = 0
            q.d[] r0 = new q.d[r6]
            r10.f10938a1 = r0
        L_0x042d:
            q.d[] r0 = r10.Z0
            if (r0 == 0) goto L_0x043a
            int r1 = r0.length
            if (r1 >= r5) goto L_0x0435
            goto L_0x043a
        L_0x0435:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x043e
        L_0x043a:
            q.d[] r0 = new q.d[r5]
            r10.Z0 = r0
        L_0x043e:
            r0 = 0
        L_0x043f:
            if (r0 >= r6) goto L_0x049c
            r1 = 0
        L_0x0442:
            if (r1 >= r5) goto L_0x0493
            int r17 = r1 * r6
            int r17 = r17 + r0
            r37 = r2
            r2 = 1
            if (r4 != r2) goto L_0x0451
            int r2 = r0 * r5
            int r17 = r2 + r1
        L_0x0451:
            r38 = r3
            r2 = r17
            int r3 = r12.length
            if (r2 < r3) goto L_0x045b
        L_0x0458:
            r17 = r9
            goto L_0x048a
        L_0x045b:
            r2 = r12[r2]
            if (r2 != 0) goto L_0x0460
            goto L_0x0458
        L_0x0460:
            int r3 = r10.V(r14, r2)
            r17 = r9
            q.d[] r9 = r10.f10938a1
            r9 = r9[r0]
            if (r9 == 0) goto L_0x0472
            int r9 = r9.r()
            if (r9 >= r3) goto L_0x0476
        L_0x0472:
            q.d[] r3 = r10.f10938a1
            r3[r0] = r2
        L_0x0476:
            int r3 = r10.U(r14, r2)
            q.d[] r9 = r10.Z0
            r9 = r9[r1]
            if (r9 == 0) goto L_0x0486
            int r9 = r9.l()
            if (r9 >= r3) goto L_0x048a
        L_0x0486:
            q.d[] r3 = r10.Z0
            r3[r1] = r2
        L_0x048a:
            int r1 = r1 + 1
            r2 = r37
            r3 = r38
            r9 = r17
            goto L_0x0442
        L_0x0493:
            r37 = r2
            r38 = r3
            r17 = r9
            int r0 = r0 + 1
            goto L_0x043f
        L_0x049c:
            r37 = r2
            r38 = r3
            r17 = r9
            r0 = 0
            r1 = 0
        L_0x04a4:
            if (r0 >= r6) goto L_0x04ba
            q.d[] r2 = r10.f10938a1
            r2 = r2[r0]
            if (r2 == 0) goto L_0x04b7
            if (r0 <= 0) goto L_0x04b1
            int r3 = r10.R0
            int r1 = r1 + r3
        L_0x04b1:
            int r2 = r10.V(r14, r2)
            int r2 = r2 + r1
            r1 = r2
        L_0x04b7:
            int r0 = r0 + 1
            goto L_0x04a4
        L_0x04ba:
            r0 = 0
            r2 = 0
        L_0x04bc:
            if (r0 >= r5) goto L_0x04d2
            q.d[] r3 = r10.Z0
            r3 = r3[r0]
            if (r3 == 0) goto L_0x04cf
            if (r0 <= 0) goto L_0x04c9
            int r9 = r10.S0
            int r2 = r2 + r9
        L_0x04c9:
            int r3 = r10.U(r14, r3)
            int r3 = r3 + r2
            r2 = r3
        L_0x04cf:
            int r0 = r0 + 1
            goto L_0x04bc
        L_0x04d2:
            r0 = 0
            r7[r0] = r1
            r0 = 1
            r7[r0] = r2
            if (r4 != 0) goto L_0x04e1
            if (r1 <= r14) goto L_0x04f3
            if (r6 <= r0) goto L_0x04f3
            int r6 = r6 + -1
            goto L_0x04e7
        L_0x04e1:
            if (r2 <= r14) goto L_0x04f3
            if (r5 <= r0) goto L_0x04f3
            int r5 = r5 + -1
        L_0x04e7:
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r38
            r9 = r17
            goto L_0x03fa
        L_0x04f3:
            r1 = r35
            r2 = r36
            r3 = r37
            r9 = r32
            r32 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r38
        L_0x0502:
            r33 = r9
            r9 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r32
            r32 = r33
            goto L_0x03fa
        L_0x0512:
            r35 = r0
            r36 = r1
            r37 = r2
            r38 = r3
            r0 = 1
            int[] r1 = r10.f10939b1
            r2 = 0
            r1[r2] = r6
            r1[r0] = r5
            r0 = r35
            r1 = r36
            r2 = r37
            r13 = r28
            r7 = r29
            goto L_0x0748
        L_0x052e:
            r32 = r6
            r29 = r7
            r28 = r13
            r31 = r14
            r30 = r15
            r13 = r4
            r14 = r5
            int r9 = r8.X0
            if (r13 != 0) goto L_0x0540
            goto L_0x0739
        L_0x0540:
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.clear()
            q.f$a r10 = new q.f$a
            q.c r3 = r8.K
            q.c r4 = r8.L
            q.c r5 = r8.M
            q.c r6 = r8.N
            r0 = r10
            r1 = r34
            r2 = r9
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.add(r10)
            r0 = 0
            r1 = 0
            r11 = 0
            if (r9 != 0) goto L_0x05c1
        L_0x0561:
            if (r11 >= r13) goto L_0x0625
            r15 = r12[r11]
            int r16 = r8.V(r14, r15)
            int[] r2 = r15.V
            r3 = 0
            r2 = r2[r3]
            r3 = 3
            if (r2 != r3) goto L_0x0573
            int r0 = r0 + 1
        L_0x0573:
            r19 = r0
            if (r1 == r14) goto L_0x057e
            int r0 = r8.R0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r14) goto L_0x0584
        L_0x057e:
            q.d r0 = r10.f10942b
            if (r0 == 0) goto L_0x0584
            r0 = 1
            goto L_0x0585
        L_0x0584:
            r0 = 0
        L_0x0585:
            if (r0 != 0) goto L_0x0592
            if (r11 <= 0) goto L_0x0592
            int r2 = r8.W0
            if (r2 <= 0) goto L_0x0592
            int r2 = r11 % r2
            if (r2 != 0) goto L_0x0592
            r0 = 1
        L_0x0592:
            if (r0 == 0) goto L_0x05ae
            q.f$a r10 = new q.f$a
            q.c r3 = r8.K
            q.c r4 = r8.L
            q.c r5 = r8.M
            q.c r6 = r8.N
            r0 = r10
            r1 = r34
            r2 = r9
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.f10953n = r11
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.add(r10)
            goto L_0x05b7
        L_0x05ae:
            if (r11 <= 0) goto L_0x05b7
            int r0 = r8.R0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x05b9
        L_0x05b7:
            r1 = r16
        L_0x05b9:
            r10.a(r15)
            int r11 = r11 + 1
            r0 = r19
            goto L_0x0561
        L_0x05c1:
            if (r11 >= r13) goto L_0x0625
            r15 = r12[r11]
            int r16 = r8.U(r14, r15)
            int[] r2 = r15.V
            r3 = 1
            r2 = r2[r3]
            r7 = 3
            if (r2 != r7) goto L_0x05d3
            int r0 = r0 + 1
        L_0x05d3:
            r18 = r0
            if (r1 == r14) goto L_0x05de
            int r0 = r8.S0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r14) goto L_0x05e4
        L_0x05de:
            q.d r0 = r10.f10942b
            if (r0 == 0) goto L_0x05e4
            r0 = 1
            goto L_0x05e5
        L_0x05e4:
            r0 = 0
        L_0x05e5:
            if (r0 != 0) goto L_0x05f2
            if (r11 <= 0) goto L_0x05f2
            int r2 = r8.W0
            if (r2 <= 0) goto L_0x05f2
            int r2 = r11 % r2
            if (r2 != 0) goto L_0x05f2
            r0 = 1
        L_0x05f2:
            if (r0 == 0) goto L_0x0610
            q.f$a r10 = new q.f$a
            q.c r3 = r8.K
            q.c r4 = r8.L
            q.c r5 = r8.M
            q.c r6 = r8.N
            r0 = r10
            r1 = r34
            r2 = r9
            r19 = r7
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.f10953n = r11
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.add(r10)
            goto L_0x061b
        L_0x0610:
            r19 = r7
            if (r11 <= 0) goto L_0x061b
            int r0 = r8.S0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x061d
        L_0x061b:
            r1 = r16
        L_0x061d:
            r10.a(r15)
            int r11 = r11 + 1
            r0 = r18
            goto L_0x05c1
        L_0x0625:
            java.util.ArrayList<q.f$a> r1 = r8.Y0
            int r1 = r1.size()
            q.c r2 = r8.K
            q.c r3 = r8.L
            q.c r4 = r8.M
            q.c r5 = r8.N
            int r6 = r8.f10968y0
            int r7 = r8.u0
            int r10 = r8.f10969z0
            int r11 = r8.f10965v0
            int[] r12 = r8.V
            r13 = 0
            r15 = r12[r13]
            r13 = 2
            if (r15 == r13) goto L_0x064b
            r15 = 1
            r12 = r12[r15]
            if (r12 != r13) goto L_0x0649
            goto L_0x064b
        L_0x0649:
            r12 = 0
            goto L_0x064c
        L_0x064b:
            r12 = 1
        L_0x064c:
            if (r0 <= 0) goto L_0x066e
            if (r12 == 0) goto L_0x066e
            r0 = 0
        L_0x0651:
            if (r0 >= r1) goto L_0x066e
            java.util.ArrayList<q.f$a> r12 = r8.Y0
            java.lang.Object r12 = r12.get(r0)
            q.f$a r12 = (q.f.a) r12
            if (r9 != 0) goto L_0x0662
            int r13 = r12.d()
            goto L_0x0666
        L_0x0662:
            int r13 = r12.c()
        L_0x0666:
            int r13 = r14 - r13
            r12.e(r13)
            int r0 = r0 + 1
            goto L_0x0651
        L_0x066e:
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0671:
            if (r0 >= r1) goto L_0x0722
            java.util.ArrayList<q.f$a> r15 = r8.Y0
            java.lang.Object r15 = r15.get(r0)
            q.f$a r15 = (q.f.a) r15
            if (r9 != 0) goto L_0x06cd
            int r5 = r1 + -1
            if (r0 >= r5) goto L_0x0693
            java.util.ArrayList<q.f$a> r5 = r8.Y0
            int r11 = r0 + 1
            java.lang.Object r5 = r5.get(r11)
            q.f$a r5 = (q.f.a) r5
            q.d r5 = r5.f10942b
            q.c r5 = r5.L
            r27 = r1
            r11 = 0
            goto L_0x0699
        L_0x0693:
            q.c r5 = r8.N
            int r11 = r8.f10965v0
            r27 = r1
        L_0x0699:
            q.d r1 = r15.f10942b
            q.c r1 = r1.N
            r16 = r15
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r10
            r25 = r11
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r15.d()
            int r3 = java.lang.Math.max(r12, r3)
            int r7 = r15.c()
            int r7 = r7 + r13
            if (r0 <= 0) goto L_0x06c8
            int r12 = r8.S0
            int r7 = r7 + r12
        L_0x06c8:
            r12 = r3
            r13 = r7
            r7 = 0
            r3 = r1
            goto L_0x071c
        L_0x06cd:
            r27 = r1
            int r1 = r27 + -1
            if (r0 >= r1) goto L_0x06e3
            java.util.ArrayList<q.f$a> r1 = r8.Y0
            int r4 = r0 + 1
            java.lang.Object r1 = r1.get(r4)
            q.f$a r1 = (q.f.a) r1
            q.d r1 = r1.f10942b
            q.c r1 = r1.K
            r4 = 0
            goto L_0x06e7
        L_0x06e3:
            q.c r1 = r8.M
            int r4 = r8.f10969z0
        L_0x06e7:
            q.d r10 = r15.f10942b
            q.c r10 = r10.M
            r16 = r15
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r1
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r4
            r25 = r11
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r15.d()
            int r2 = r2 + r12
            int r6 = r15.c()
            int r6 = java.lang.Math.max(r13, r6)
            if (r0 <= 0) goto L_0x0716
            int r12 = r8.R0
            int r2 = r2 + r12
        L_0x0716:
            r12 = r2
            r13 = r6
            r2 = r10
            r6 = 0
            r10 = r4
            r4 = r1
        L_0x071c:
            int r0 = r0 + 1
            r1 = r27
            goto L_0x0671
        L_0x0722:
            r0 = 0
            r32[r0] = r12
            r0 = 1
            r32[r0] = r13
            goto L_0x0739
        L_0x0729:
            r32 = r6
            r29 = r7
            r28 = r13
            r31 = r14
            r30 = r15
            r13 = r4
            r14 = r5
            int r2 = r8.X0
            if (r13 != 0) goto L_0x0753
        L_0x0739:
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r38
            r11 = r8
            r13 = r28
            r7 = r29
            r15 = r30
        L_0x0748:
            r14 = r31
            r6 = r32
            r5 = r3
            r4 = 0
            r3 = r2
            r2 = r1
            r1 = 1
            goto L_0x07e0
        L_0x0753:
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0772
            q.f$a r9 = new q.f$a
            q.c r3 = r8.K
            q.c r4 = r8.L
            q.c r5 = r8.M
            q.c r6 = r8.N
            r0 = r9
            r1 = r34
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r0.add(r9)
            goto L_0x07b4
        L_0x0772:
            java.util.ArrayList<q.f$a> r0 = r8.Y0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            q.f$a r9 = (q.f.a) r9
            r9.f10943c = r1
            r0 = 0
            r9.f10942b = r0
            r9.f10951l = r1
            r9.f10952m = r1
            r9.f10953n = r1
            r9.f10954o = r1
            r9.f10955p = r1
            q.c r0 = r8.K
            q.c r1 = r8.L
            q.c r3 = r8.M
            q.c r4 = r8.N
            int r5 = r8.f10968y0
            int r6 = r8.u0
            int r7 = r8.f10969z0
            int r10 = r8.f10965v0
            r16 = r9
            r17 = r2
            r18 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r10
            r26 = r14
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x07b4:
            r4 = 0
        L_0x07b5:
            if (r4 >= r13) goto L_0x07bf
            r0 = r12[r4]
            r9.a(r0)
            int r4 = r4 + 1
            goto L_0x07b5
        L_0x07bf:
            int r0 = r9.d()
            r4 = 0
            r32[r4] = r0
            int r0 = r9.c()
            r1 = 1
            r32[r1] = r0
            r0 = r35
            r2 = r36
            r3 = r37
            r5 = r38
            r11 = r8
            r13 = r28
            r7 = r29
            r15 = r30
            r14 = r31
            r6 = r32
        L_0x07e0:
            r9 = r6[r4]
            int r9 = r9 + r13
            int r9 = r9 + r14
            r6 = r6[r1]
            int r6 = r6 + r15
            int r6 = r6 + r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1073741824(0x40000000, float:2.0)
            if (r0 != r10) goto L_0x07f0
            r0 = r2
            goto L_0x07fc
        L_0x07f0:
            if (r0 != r7) goto L_0x07f7
            int r0 = java.lang.Math.min(r9, r2)
            goto L_0x07fc
        L_0x07f7:
            if (r0 != 0) goto L_0x07fb
            r0 = r9
            goto L_0x07fc
        L_0x07fb:
            r0 = r4
        L_0x07fc:
            if (r3 != r10) goto L_0x0800
            r2 = r5
            goto L_0x080c
        L_0x0800:
            if (r3 != r7) goto L_0x0807
            int r2 = java.lang.Math.min(r6, r5)
            goto L_0x080c
        L_0x0807:
            if (r3 != 0) goto L_0x080b
            r2 = r6
            goto L_0x080c
        L_0x080b:
            r2 = r4
        L_0x080c:
            r11.B0 = r0
            r11.C0 = r2
            r11.O(r0)
            r11.L(r2)
            int r0 = r11.f10964t0
            if (r0 <= 0) goto L_0x081b
            goto L_0x081c
        L_0x081b:
            r1 = r4
        L_0x081c:
            r11.A0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.S(int, int, int, int):void");
    }

    public final int U(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        if (dVar.V[1] == 3) {
            int i11 = dVar.f10927t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.A * ((float) i10));
                if (i12 != dVar.l()) {
                    dVar.f10904g = true;
                    T(dVar, dVar.V[0], dVar.r(), 1, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return dVar.l();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) dVar.r()) * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.l();
    }

    public final int V(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        if (dVar.V[0] == 3) {
            int i11 = dVar.f10926s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f10929x * ((float) i10));
                if (i12 != dVar.r()) {
                    dVar.f10904g = true;
                    T(dVar, 1, i12, dVar.V[1], dVar.l());
                }
                return i12;
            } else if (i11 == 1) {
                return dVar.r();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) dVar.l()) * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.r();
    }

    public final void c(d dVar, boolean z9) {
        boolean z10;
        boolean z11;
        d dVar2;
        float f10;
        int i10;
        boolean z12;
        super.c(dVar, z9);
        d dVar3 = this.W;
        if (dVar3 == null || !((e) dVar3).f10935x0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = this.V0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = this.Y0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    a aVar = this.Y0.get(i12);
                    if (i12 == size - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aVar.b(i12, z10, z11);
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = this.Y0.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        a aVar2 = this.Y0.get(i13);
                        if (i13 == size2 - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        aVar2.b(i13, z10, z12);
                    }
                }
            } else if (!(this.f10939b1 == null || this.f10938a1 == null || this.Z0 == null)) {
                for (int i14 = 0; i14 < this.f10940d1; i14++) {
                    this.c1[i14].E();
                }
                int[] iArr = this.f10939b1;
                int i15 = iArr[0];
                int i16 = iArr[1];
                d dVar4 = null;
                float f11 = this.L0;
                int i17 = 0;
                while (i17 < i15) {
                    if (z10) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.L0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    d dVar5 = this.f10938a1[i10];
                    if (!(dVar5 == null || dVar5.f10911j0 == 8)) {
                        if (i17 == 0) {
                            dVar5.g(dVar5.K, this.K, this.f10968y0);
                            dVar5.f10914l0 = this.F0;
                            dVar5.f10905g0 = f10;
                        }
                        if (i17 == i15 - 1) {
                            dVar5.g(dVar5.M, this.M, this.f10969z0);
                        }
                        if (i17 > 0 && dVar4 != null) {
                            dVar5.g(dVar5.K, dVar4.M, this.R0);
                            dVar4.g(dVar4.M, dVar5.K, 0);
                        }
                        dVar4 = dVar5;
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i16; i18++) {
                    d dVar6 = this.Z0[i18];
                    if (!(dVar6 == null || dVar6.f10911j0 == 8)) {
                        if (i18 == 0) {
                            dVar6.g(dVar6.L, this.L, this.u0);
                            dVar6.f10916m0 = this.G0;
                            dVar6.f10907h0 = this.M0;
                        }
                        if (i18 == i16 - 1) {
                            dVar6.g(dVar6.N, this.N, this.f10965v0);
                        }
                        if (i18 > 0 && dVar4 != null) {
                            dVar6.g(dVar6.L, dVar4.N, this.S0);
                            dVar4.g(dVar4.N, dVar6.L, 0);
                        }
                        dVar4 = dVar6;
                    }
                }
                for (int i19 = 0; i19 < i15; i19++) {
                    for (int i20 = 0; i20 < i16; i20++) {
                        int i21 = (i20 * i15) + i19;
                        if (this.X0 == 1) {
                            i21 = (i19 * i16) + i20;
                        }
                        d[] dVarArr = this.c1;
                        if (!(i21 >= dVarArr.length || (dVar2 = dVarArr[i21]) == null || dVar2.f10911j0 == 8)) {
                            d dVar7 = this.f10938a1[i19];
                            d dVar8 = this.Z0[i20];
                            if (dVar2 != dVar7) {
                                dVar2.g(dVar2.K, dVar7.K, 0);
                                dVar2.g(dVar2.M, dVar7.M, 0);
                            }
                            if (dVar2 != dVar8) {
                                dVar2.g(dVar2.L, dVar8.L, 0);
                                dVar2.g(dVar2.N, dVar8.N, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.Y0.size() > 0) {
            this.Y0.get(0).b(0, z10, true);
        }
        this.A0 = false;
    }
}
