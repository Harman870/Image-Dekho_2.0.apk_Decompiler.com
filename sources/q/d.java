package q;

import androidx.activity.e;
import androidx.lifecycle.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q.c;
import r.c;
import r.f;
import r.l;
import r.n;
import r.p;

public class d {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public c K;
    public c L;
    public c M;
    public c N;
    public c O;
    public c P;
    public c Q;
    public c R;
    public c[] S;
    public ArrayList<c> T;
    public boolean[] U;
    public int[] V;
    public d W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10892a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f10893a0;

    /* renamed from: b  reason: collision with root package name */
    public c f10894b;

    /* renamed from: b0  reason: collision with root package name */
    public int f10895b0;

    /* renamed from: c  reason: collision with root package name */
    public c f10896c;

    /* renamed from: c0  reason: collision with root package name */
    public int f10897c0;

    /* renamed from: d  reason: collision with root package name */
    public l f10898d = null;

    /* renamed from: d0  reason: collision with root package name */
    public int f10899d0;

    /* renamed from: e  reason: collision with root package name */
    public n f10900e = null;

    /* renamed from: e0  reason: collision with root package name */
    public int f10901e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f10902f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public int f10903f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10904g = true;

    /* renamed from: g0  reason: collision with root package name */
    public float f10905g0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10906h = true;

    /* renamed from: h0  reason: collision with root package name */
    public float f10907h0;

    /* renamed from: i  reason: collision with root package name */
    public int f10908i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public Object f10909i0;

    /* renamed from: j  reason: collision with root package name */
    public int f10910j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public int f10911j0;
    public String k;

    /* renamed from: k0  reason: collision with root package name */
    public String f10912k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10913l;

    /* renamed from: l0  reason: collision with root package name */
    public int f10914l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10915m;

    /* renamed from: m0  reason: collision with root package name */
    public int f10916m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10917n;

    /* renamed from: n0  reason: collision with root package name */
    public float[] f10918n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10919o;

    /* renamed from: o0  reason: collision with root package name */
    public d[] f10920o0;

    /* renamed from: p  reason: collision with root package name */
    public int f10921p;
    public d[] p0;

    /* renamed from: q  reason: collision with root package name */
    public int f10922q;

    /* renamed from: q0  reason: collision with root package name */
    public int f10923q0;

    /* renamed from: r  reason: collision with root package name */
    public int f10924r;

    /* renamed from: r0  reason: collision with root package name */
    public int f10925r0;

    /* renamed from: s  reason: collision with root package name */
    public int f10926s;

    /* renamed from: t  reason: collision with root package name */
    public int f10927t;
    public int[] u;

    /* renamed from: v  reason: collision with root package name */
    public int f10928v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public float f10929x;

    /* renamed from: y  reason: collision with root package name */
    public int f10930y;

    /* renamed from: z  reason: collision with root package name */
    public int f10931z;

    public d() {
        new HashMap();
        this.f10913l = false;
        this.f10915m = false;
        this.f10917n = false;
        this.f10919o = false;
        this.f10921p = -1;
        this.f10922q = -1;
        this.f10924r = 0;
        this.f10926s = 0;
        this.f10927t = 0;
        this.u = new int[2];
        this.f10928v = 0;
        this.w = 0;
        this.f10929x = 1.0f;
        this.f10930y = 0;
        this.f10931z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        c cVar = new c(this, c.a.LEFT);
        this.K = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.L = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.M = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.N = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.O = cVar5;
        this.P = new c(this, c.a.CENTER_X);
        this.Q = new c(this, c.a.CENTER_Y);
        c cVar6 = new c(this, c.a.CENTER);
        this.R = cVar6;
        this.S = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        this.V = new int[]{1, 1};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f10893a0 = -1;
        this.f10895b0 = 0;
        this.f10897c0 = 0;
        this.f10899d0 = 0;
        this.f10905g0 = 0.5f;
        this.f10907h0 = 0.5f;
        this.f10911j0 = 0;
        this.f10912k0 = null;
        this.f10914l0 = 0;
        this.f10916m0 = 0;
        this.f10918n0 = new float[]{-1.0f, -1.0f};
        this.f10920o0 = new d[]{null, null};
        this.p0 = new d[]{null, null};
        this.f10923q0 = -1;
        this.f10925r0 = -1;
        arrayList.add(this.K);
        this.T.add(this.L);
        this.T.add(this.M);
        this.T.add(this.N);
        this.T.add(this.P);
        this.T.add(this.Q);
        this.T.add(this.R);
        this.T.add(this.O);
    }

    public static void H(int i10, int i11, String str, StringBuilder sb) {
        if (i10 != i11) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i10);
            sb.append(",\n");
        }
    }

    public static void I(StringBuilder sb, String str, float f10, float f11) {
        if (f10 != f11) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f10);
            sb.append(",\n");
        }
    }

    public static void p(StringBuilder sb, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb.append(str);
        sb.append(" :  {\n");
        H(i10, 0, "      size", sb);
        H(i11, 0, "      min", sb);
        H(i12, Integer.MAX_VALUE, "      max", sb);
        H(i13, 0, "      matchMin", sb);
        H(i14, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f10, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, c cVar) {
        if (cVar.f10879f != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(cVar.f10879f);
            sb.append("'");
            if (!(cVar.f10881h == Integer.MIN_VALUE && cVar.f10880g == 0)) {
                sb.append(",");
                sb.append(cVar.f10880g);
                if (cVar.f10881h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(cVar.f10881h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    public final boolean A() {
        return this.f10904g && this.f10911j0 != 8;
    }

    public boolean B() {
        if (this.f10913l || (this.K.f10876c && this.M.f10876c)) {
            return true;
        }
        return false;
    }

    public boolean C() {
        if (this.f10915m || (this.L.f10876c && this.N.f10876c)) {
            return true;
        }
        return false;
    }

    public void D() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f10893a0 = -1;
        this.f10895b0 = 0;
        this.f10897c0 = 0;
        this.f10899d0 = 0;
        this.f10901e0 = 0;
        this.f10903f0 = 0;
        this.f10905g0 = 0.5f;
        this.f10907h0 = 0.5f;
        int[] iArr = this.V;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f10909i0 = null;
        this.f10911j0 = 0;
        this.f10914l0 = 0;
        this.f10916m0 = 0;
        float[] fArr = this.f10918n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f10921p = -1;
        this.f10922q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f10926s = 0;
        this.f10927t = 0;
        this.f10929x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.f10931z = Integer.MAX_VALUE;
        this.f10928v = 0;
        this.f10930y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f10902f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f10904g = true;
        int[] iArr3 = this.u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f10908i = -1;
        this.f10910j = -1;
    }

    public final void E() {
        d dVar = this.W;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).j();
        }
    }

    public final void F() {
        this.f10913l = false;
        this.f10915m = false;
        this.f10917n = false;
        this.f10919o = false;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.T.get(i10);
            cVar.f10876c = false;
            cVar.f10875b = 0;
        }
    }

    public void G(o.c cVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void J(int i10, int i11) {
        if (!this.f10913l) {
            this.K.l(i10);
            this.M.l(i11);
            this.f10895b0 = i10;
            this.X = i11 - i10;
            this.f10913l = true;
        }
    }

    public final void K(int i10, int i11) {
        if (!this.f10915m) {
            this.L.l(i10);
            this.N.l(i11);
            this.f10897c0 = i10;
            this.Y = i11 - i10;
            if (this.F) {
                this.O.l(i10 + this.f10899d0);
            }
            this.f10915m = true;
        }
    }

    public final void L(int i10) {
        this.Y = i10;
        int i11 = this.f10903f0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public final void M(int i10) {
        this.V[0] = i10;
    }

    public final void N(int i10) {
        this.V[1] = i10;
    }

    public final void O(int i10) {
        this.X = i10;
        int i11 = this.f10901e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public void P(boolean z9, boolean z10) {
        int i10;
        int i11;
        l lVar = this.f10898d;
        boolean z11 = z9 & lVar.f11451g;
        n nVar = this.f10900e;
        boolean z12 = z10 & nVar.f11451g;
        int i12 = lVar.f11452h.f11429g;
        int i13 = nVar.f11452h.f11429g;
        int i14 = lVar.f11453i.f11429g;
        int i15 = nVar.f11453i.f11429g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z11) {
            this.f10895b0 = i12;
        }
        if (z12) {
            this.f10897c0 = i13;
        }
        if (this.f10911j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (z11) {
            if (this.V[0] == 1 && i17 < (i11 = this.X)) {
                i17 = i11;
            }
            this.X = i17;
            int i19 = this.f10901e0;
            if (i17 < i19) {
                this.X = i19;
            }
        }
        if (z12) {
            if (this.V[1] == 1 && i18 < (i10 = this.Y)) {
                i18 = i10;
            }
            this.Y = i18;
            int i20 = this.f10903f0;
            if (i18 < i20) {
                this.Y = i20;
            }
        }
    }

    public void Q(o.d dVar, boolean z9) {
        int i10;
        int i11;
        n nVar;
        l lVar;
        c cVar = this.K;
        dVar.getClass();
        int o10 = o.d.o(cVar);
        int o11 = o.d.o(this.L);
        int o12 = o.d.o(this.M);
        int o13 = o.d.o(this.N);
        if (z9 && (lVar = this.f10898d) != null) {
            f fVar = lVar.f11452h;
            if (fVar.f11432j) {
                f fVar2 = lVar.f11453i;
                if (fVar2.f11432j) {
                    o10 = fVar.f11429g;
                    o12 = fVar2.f11429g;
                }
            }
        }
        if (z9 && (nVar = this.f10900e) != null) {
            f fVar3 = nVar.f11452h;
            if (fVar3.f11432j) {
                f fVar4 = nVar.f11453i;
                if (fVar4.f11432j) {
                    o11 = fVar3.f11429g;
                    o13 = fVar4.f11429g;
                }
            }
        }
        int i12 = o13 - o11;
        if (o12 - o10 < 0 || i12 < 0 || o10 == Integer.MIN_VALUE || o10 == Integer.MAX_VALUE || o11 == Integer.MIN_VALUE || o11 == Integer.MAX_VALUE || o12 == Integer.MIN_VALUE || o12 == Integer.MAX_VALUE || o13 == Integer.MIN_VALUE || o13 == Integer.MAX_VALUE) {
            o10 = 0;
            o11 = 0;
            o12 = 0;
            o13 = 0;
        }
        int i13 = o12 - o10;
        int i14 = o13 - o11;
        this.f10895b0 = o10;
        this.f10897c0 = o11;
        if (this.f10911j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.X)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.Y)) {
            i14 = i10;
        }
        this.X = i13;
        this.Y = i14;
        int i16 = this.f10903f0;
        if (i14 < i16) {
            this.Y = i16;
        }
        int i17 = this.f10901e0;
        if (i13 < i17) {
            this.X = i17;
        }
        int i18 = this.w;
        if (i18 > 0 && i15 == 3) {
            this.X = Math.min(this.X, i18);
        }
        int i19 = this.f10931z;
        if (i19 > 0 && this.V[1] == 3) {
            this.Y = Math.min(this.Y, i19);
        }
        int i20 = this.X;
        if (i13 != i20) {
            this.f10908i = i20;
        }
        int i21 = this.Y;
        if (i14 != i21) {
            this.f10910j = i21;
        }
    }

    public final void b(e eVar, o.d dVar, HashSet<d> hashSet, int i10, boolean z9) {
        if (z9) {
            if (hashSet.contains(this)) {
                c0.f(eVar, dVar, this);
                hashSet.remove(this);
                c(dVar, eVar.W(64));
            } else {
                return;
            }
        }
        if (i10 == 0) {
            HashSet<c> hashSet2 = this.K.f10874a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f10877d.b(eVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<c> hashSet3 = this.M.f10874a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f10877d.b(eVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.L.f10874a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f10877d.b(eVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet5 = this.N.f10874a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f10877d.b(eVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet6 = this.O.f10874a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f10877d.b(eVar, dVar, hashSet, i10, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0635  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06a3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(o.d r50, boolean r51) {
        /*
            r49 = this;
            r15 = r49
            r14 = r50
            q.c r0 = r15.K
            o.h r13 = r14.l(r0)
            q.c r0 = r15.M
            o.h r12 = r14.l(r0)
            q.c r0 = r15.L
            o.h r11 = r14.l(r0)
            q.c r0 = r15.N
            o.h r10 = r14.l(r0)
            q.c r0 = r15.O
            o.h r9 = r14.l(r0)
            q.d r0 = r15.W
            r8 = 2
            r7 = 3
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0051
            int[] r0 = r0.V
            r1 = r0[r6]
            if (r1 != r8) goto L_0x0032
            r1 = r5
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            r0 = r0[r5]
            if (r0 != r8) goto L_0x0039
            r0 = r5
            goto L_0x003a
        L_0x0039:
            r0 = r6
        L_0x003a:
            int r2 = r15.f10924r
            if (r2 == r5) goto L_0x004c
            if (r2 == r8) goto L_0x0047
            if (r2 == r7) goto L_0x0051
            r28 = r0
            r29 = r1
            goto L_0x0055
        L_0x0047:
            r28 = r0
            r29 = r6
            goto L_0x0055
        L_0x004c:
            r29 = r1
            r28 = r6
            goto L_0x0055
        L_0x0051:
            r28 = r6
            r29 = r28
        L_0x0055:
            int r0 = r15.f10911j0
            r4 = 8
            if (r0 != r4) goto L_0x008f
            java.util.ArrayList<q.c> r0 = r15.T
            int r0 = r0.size()
            r1 = r6
        L_0x0062:
            if (r1 >= r0) goto L_0x0081
            java.util.ArrayList<q.c> r2 = r15.T
            java.lang.Object r2 = r2.get(r1)
            q.c r2 = (q.c) r2
            java.util.HashSet<q.c> r2 = r2.f10874a
            if (r2 != 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0079
            r2 = r5
            goto L_0x007a
        L_0x0079:
            r2 = r6
        L_0x007a:
            if (r2 == 0) goto L_0x007e
            r0 = r5
            goto L_0x0082
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x0062
        L_0x0081:
            r0 = r6
        L_0x0082:
            if (r0 != 0) goto L_0x008f
            boolean[] r0 = r15.U
            boolean r1 = r0[r6]
            if (r1 != 0) goto L_0x008f
            boolean r0 = r0[r5]
            if (r0 != 0) goto L_0x008f
            return
        L_0x008f:
            boolean r0 = r15.f10913l
            r3 = 5
            if (r0 != 0) goto L_0x0098
            boolean r1 = r15.f10915m
            if (r1 == 0) goto L_0x019f
        L_0x0098:
            if (r0 == 0) goto L_0x0107
            int r0 = r15.f10895b0
            r14.d(r13, r0)
            int r0 = r15.f10895b0
            int r1 = r15.X
            int r0 = r0 + r1
            r14.d(r12, r0)
            if (r29 == 0) goto L_0x0107
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x0107
            boolean r1 = r15.f10906h
            if (r1 == 0) goto L_0x00fe
            q.e r0 = (q.e) r0
            q.c r1 = r15.K
            java.lang.ref.WeakReference<q.c> r2 = r0.J0
            if (r2 == 0) goto L_0x00d1
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x00d1
            int r2 = r1.d()
            java.lang.ref.WeakReference<q.c> r8 = r0.J0
            java.lang.Object r8 = r8.get()
            q.c r8 = (q.c) r8
            int r8 = r8.d()
            if (r2 <= r8) goto L_0x00d8
        L_0x00d1:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.J0 = r2
        L_0x00d8:
            q.c r1 = r15.M
            java.lang.ref.WeakReference<q.c> r2 = r0.L0
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x00f6
            int r2 = r1.d()
            java.lang.ref.WeakReference<q.c> r8 = r0.L0
            java.lang.Object r8 = r8.get()
            q.c r8 = (q.c) r8
            int r8 = r8.d()
            if (r2 <= r8) goto L_0x0107
        L_0x00f6:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.L0 = r2
            goto L_0x0107
        L_0x00fe:
            q.c r0 = r0.M
            o.h r0 = r14.l(r0)
            r14.f(r0, r12, r6, r3)
        L_0x0107:
            boolean r0 = r15.f10915m
            if (r0 == 0) goto L_0x0192
            int r0 = r15.f10897c0
            r14.d(r11, r0)
            int r0 = r15.f10897c0
            int r1 = r15.Y
            int r0 = r0 + r1
            r14.d(r10, r0)
            q.c r0 = r15.O
            java.util.HashSet<q.c> r0 = r0.f10874a
            if (r0 != 0) goto L_0x011f
            goto L_0x0127
        L_0x011f:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0127
            r0 = r5
            goto L_0x0128
        L_0x0127:
            r0 = r6
        L_0x0128:
            if (r0 == 0) goto L_0x0132
            int r0 = r15.f10897c0
            int r1 = r15.f10899d0
            int r0 = r0 + r1
            r14.d(r9, r0)
        L_0x0132:
            if (r28 == 0) goto L_0x0192
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x0192
            boolean r1 = r15.f10906h
            if (r1 == 0) goto L_0x0189
            q.e r0 = (q.e) r0
            q.c r1 = r15.L
            java.lang.ref.WeakReference<q.c> r2 = r0.I0
            if (r2 == 0) goto L_0x015c
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x015c
            int r2 = r1.d()
            java.lang.ref.WeakReference<q.c> r8 = r0.I0
            java.lang.Object r8 = r8.get()
            q.c r8 = (q.c) r8
            int r8 = r8.d()
            if (r2 <= r8) goto L_0x0163
        L_0x015c:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.I0 = r2
        L_0x0163:
            q.c r1 = r15.N
            java.lang.ref.WeakReference<q.c> r2 = r0.K0
            if (r2 == 0) goto L_0x0181
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x0181
            int r2 = r1.d()
            java.lang.ref.WeakReference<q.c> r8 = r0.K0
            java.lang.Object r8 = r8.get()
            q.c r8 = (q.c) r8
            int r8 = r8.d()
            if (r2 <= r8) goto L_0x0192
        L_0x0181:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.K0 = r2
            goto L_0x0192
        L_0x0189:
            q.c r0 = r0.N
            o.h r0 = r14.l(r0)
            r14.f(r0, r10, r6, r3)
        L_0x0192:
            boolean r0 = r15.f10913l
            if (r0 == 0) goto L_0x019f
            boolean r0 = r15.f10915m
            if (r0 == 0) goto L_0x019f
            r15.f10913l = r6
            r15.f10915m = r6
            return
        L_0x019f:
            if (r51 == 0) goto L_0x0225
            r.l r0 = r15.f10898d
            if (r0 == 0) goto L_0x0225
            r.n r1 = r15.f10900e
            if (r1 == 0) goto L_0x0225
            r.f r2 = r0.f11452h
            boolean r8 = r2.f11432j
            if (r8 == 0) goto L_0x0225
            r.f r0 = r0.f11453i
            boolean r0 = r0.f11432j
            if (r0 == 0) goto L_0x0225
            r.f r0 = r1.f11452h
            boolean r0 = r0.f11432j
            if (r0 == 0) goto L_0x0225
            r.f r0 = r1.f11453i
            boolean r0 = r0.f11432j
            if (r0 == 0) goto L_0x0225
            int r0 = r2.f11429g
            r14.d(r13, r0)
            r.l r0 = r15.f10898d
            r.f r0 = r0.f11453i
            int r0 = r0.f11429g
            r14.d(r12, r0)
            r.n r0 = r15.f10900e
            r.f r0 = r0.f11452h
            int r0 = r0.f11429g
            r14.d(r11, r0)
            r.n r0 = r15.f10900e
            r.f r0 = r0.f11453i
            int r0 = r0.f11429g
            r14.d(r10, r0)
            r.n r0 = r15.f10900e
            r.f r0 = r0.k
            int r0 = r0.f11429g
            r14.d(r9, r0)
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x0220
            if (r29 == 0) goto L_0x0207
            boolean[] r0 = r15.f10902f
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0207
            boolean r0 = r49.y()
            if (r0 != 0) goto L_0x0207
            q.d r0 = r15.W
            q.c r0 = r0.M
            o.h r0 = r14.l(r0)
            r14.f(r0, r12, r6, r4)
        L_0x0207:
            if (r28 == 0) goto L_0x0220
            boolean[] r0 = r15.f10902f
            boolean r0 = r0[r5]
            if (r0 == 0) goto L_0x0220
            boolean r0 = r49.z()
            if (r0 != 0) goto L_0x0220
            q.d r0 = r15.W
            q.c r0 = r0.N
            o.h r0 = r14.l(r0)
            r14.f(r0, r10, r6, r4)
        L_0x0220:
            r15.f10913l = r6
            r15.f10915m = r6
            return
        L_0x0225:
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x0296
            boolean r0 = r15.x(r6)
            if (r0 == 0) goto L_0x0238
            q.d r0 = r15.W
            q.e r0 = (q.e) r0
            r0.S(r6, r15)
            r0 = r5
            goto L_0x023c
        L_0x0238:
            boolean r0 = r49.y()
        L_0x023c:
            boolean r1 = r15.x(r5)
            if (r1 == 0) goto L_0x024b
            q.d r1 = r15.W
            q.e r1 = (q.e) r1
            r1.S(r5, r15)
            r1 = r5
            goto L_0x024f
        L_0x024b:
            boolean r1 = r49.z()
        L_0x024f:
            if (r0 != 0) goto L_0x026e
            if (r29 == 0) goto L_0x026e
            int r2 = r15.f10911j0
            if (r2 == r4) goto L_0x026e
            q.c r2 = r15.K
            q.c r2 = r2.f10879f
            if (r2 != 0) goto L_0x026e
            q.c r2 = r15.M
            q.c r2 = r2.f10879f
            if (r2 != 0) goto L_0x026e
            q.d r2 = r15.W
            q.c r2 = r2.M
            o.h r2 = r14.l(r2)
            r14.f(r2, r12, r6, r5)
        L_0x026e:
            if (r1 != 0) goto L_0x0291
            if (r28 == 0) goto L_0x0291
            int r2 = r15.f10911j0
            if (r2 == r4) goto L_0x0291
            q.c r2 = r15.L
            q.c r2 = r2.f10879f
            if (r2 != 0) goto L_0x0291
            q.c r2 = r15.N
            q.c r2 = r2.f10879f
            if (r2 != 0) goto L_0x0291
            q.c r2 = r15.O
            if (r2 != 0) goto L_0x0291
            q.d r2 = r15.W
            q.c r2 = r2.N
            o.h r2 = r14.l(r2)
            r14.f(r2, r10, r6, r5)
        L_0x0291:
            r31 = r0
            r30 = r1
            goto L_0x029a
        L_0x0296:
            r30 = r6
            r31 = r30
        L_0x029a:
            int r0 = r15.X
            int r1 = r15.f10901e0
            if (r0 >= r1) goto L_0x02a1
            goto L_0x02a2
        L_0x02a1:
            r1 = r0
        L_0x02a2:
            int r2 = r15.Y
            int r8 = r15.f10903f0
            if (r2 >= r8) goto L_0x02a9
            goto L_0x02aa
        L_0x02a9:
            r8 = r2
        L_0x02aa:
            int[] r3 = r15.V
            r4 = r3[r6]
            if (r4 == r7) goto L_0x02b3
            r19 = r5
            goto L_0x02b5
        L_0x02b3:
            r19 = r6
        L_0x02b5:
            r3 = r3[r5]
            if (r3 == r7) goto L_0x02bc
            r20 = r5
            goto L_0x02be
        L_0x02bc:
            r20 = r6
        L_0x02be:
            int r5 = r15.f10893a0
            r15.B = r5
            float r6 = r15.Z
            r15.C = r6
            int r7 = r15.f10926s
            r24 = r1
            int r1 = r15.f10927t
            r25 = 0
            int r25 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            r26 = 4
            r27 = r8
            if (r25 <= 0) goto L_0x03e6
            int r8 = r15.f10911j0
            r32 = r9
            r9 = 8
            if (r8 == r9) goto L_0x03e8
            r8 = 3
            if (r4 != r8) goto L_0x02e4
            if (r7 != 0) goto L_0x02e4
            r7 = r8
        L_0x02e4:
            if (r3 != r8) goto L_0x02e9
            if (r1 != 0) goto L_0x02e9
            r1 = r8
        L_0x02e9:
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r4 != r8) goto L_0x03a9
            if (r3 != r8) goto L_0x03a9
            if (r7 != r8) goto L_0x03a9
            if (r1 != r8) goto L_0x03a9
            r8 = -1
            if (r5 != r8) goto L_0x030b
            if (r19 == 0) goto L_0x02fe
            if (r20 != 0) goto L_0x02fe
            r0 = 0
            r15.B = r0
            goto L_0x030b
        L_0x02fe:
            if (r19 != 0) goto L_0x030b
            if (r20 == 0) goto L_0x030b
            r0 = 1
            r15.B = r0
            if (r5 != r8) goto L_0x030b
            float r0 = r9 / r6
            r15.C = r0
        L_0x030b:
            int r0 = r15.B
            if (r0 != 0) goto L_0x0321
            q.c r0 = r15.L
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x031f
            q.c r0 = r15.N
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x0321
        L_0x031f:
            r0 = 1
            goto L_0x0337
        L_0x0321:
            int r0 = r15.B
            r2 = 1
            if (r0 != r2) goto L_0x0339
            q.c r0 = r15.K
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0336
            q.c r0 = r15.M
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x0339
        L_0x0336:
            r0 = 0
        L_0x0337:
            r15.B = r0
        L_0x0339:
            int r0 = r15.B
            r2 = -1
            if (r0 != r2) goto L_0x0389
            q.c r0 = r15.L
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x035e
            q.c r0 = r15.N
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x035e
            q.c r0 = r15.K
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x035e
            q.c r0 = r15.M
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x0389
        L_0x035e:
            q.c r0 = r15.L
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0370
            q.c r0 = r15.N
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0370
            r0 = 0
            goto L_0x0387
        L_0x0370:
            q.c r0 = r15.K
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0389
            q.c r0 = r15.M
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0389
            float r0 = r15.C
            float r0 = r9 / r0
            r15.C = r0
            r0 = 1
        L_0x0387:
            r15.B = r0
        L_0x0389:
            int r0 = r15.B
            r2 = -1
            if (r0 != r2) goto L_0x03d9
            int r0 = r15.f10928v
            if (r0 <= 0) goto L_0x039a
            int r2 = r15.f10930y
            if (r2 != 0) goto L_0x039a
            r2 = 0
            r15.B = r2
            goto L_0x03d9
        L_0x039a:
            if (r0 != 0) goto L_0x03d9
            int r0 = r15.f10930y
            if (r0 <= 0) goto L_0x03d9
            float r0 = r15.C
            float r9 = r9 / r0
            r15.C = r9
            r0 = 1
            r15.B = r0
            goto L_0x03d9
        L_0x03a9:
            if (r4 != r8) goto L_0x03ba
            if (r7 != r8) goto L_0x03ba
            r9 = 0
            r15.B = r9
            float r0 = (float) r2
            float r6 = r6 * r0
            int r0 = (int) r6
            if (r3 == r8) goto L_0x03db
            r24 = r0
            r7 = r26
            goto L_0x03e8
        L_0x03ba:
            if (r3 != r8) goto L_0x03d9
            if (r1 != r8) goto L_0x03d9
            r2 = 1
            r15.B = r2
            r2 = -1
            if (r5 != r2) goto L_0x03ca
            r2 = 1065353216(0x3f800000, float:1.0)
            float r9 = r2 / r6
            r15.C = r9
        L_0x03ca:
            float r2 = r15.C
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            if (r4 == r8) goto L_0x03d5
            r8 = r0
            r1 = r26
            goto L_0x03ea
        L_0x03d5:
            r8 = r0
            r0 = r24
            goto L_0x03dd
        L_0x03d9:
            r0 = r24
        L_0x03db:
            r8 = r27
        L_0x03dd:
            r35 = r1
            r36 = r7
            r34 = r8
            r33 = 1
            goto L_0x03f4
        L_0x03e6:
            r32 = r9
        L_0x03e8:
            r8 = r27
        L_0x03ea:
            r35 = r1
            r36 = r7
            r34 = r8
            r0 = r24
            r33 = 0
        L_0x03f4:
            int[] r1 = r15.u
            r2 = 0
            r1[r2] = r36
            r2 = 1
            r1[r2] = r35
            if (r33 == 0) goto L_0x0408
            int r1 = r15.B
            r2 = -1
            if (r1 == 0) goto L_0x0405
            if (r1 != r2) goto L_0x0409
        L_0x0405:
            r19 = 1
            goto L_0x040b
        L_0x0408:
            r2 = -1
        L_0x0409:
            r19 = 0
        L_0x040b:
            if (r33 == 0) goto L_0x0417
            int r1 = r15.B
            r3 = 1
            if (r1 == r3) goto L_0x0414
            if (r1 != r2) goto L_0x0417
        L_0x0414:
            r37 = 1
            goto L_0x0419
        L_0x0417:
            r37 = 0
        L_0x0419:
            int[] r1 = r15.V
            r2 = 0
            r1 = r1[r2]
            r2 = 2
            if (r1 != r2) goto L_0x0427
            boolean r1 = r15 instanceof q.e
            if (r1 == 0) goto L_0x0427
            r9 = 1
            goto L_0x0428
        L_0x0427:
            r9 = 0
        L_0x0428:
            if (r9 == 0) goto L_0x042d
            r20 = 0
            goto L_0x042f
        L_0x042d:
            r20 = r0
        L_0x042f:
            q.c r0 = r15.R
            boolean r0 = r0.h()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.U
            r2 = 0
            boolean r27 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f10921p
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x051f
            boolean r0 = r15.f10913l
            if (r0 != 0) goto L_0x051f
            if (r51 == 0) goto L_0x048f
            r.l r0 = r15.f10898d
            if (r0 == 0) goto L_0x048f
            r.f r1 = r0.f11452h
            boolean r2 = r1.f11432j
            if (r2 == 0) goto L_0x048f
            r.f r0 = r0.f11453i
            boolean r0 = r0.f11432j
            if (r0 != 0) goto L_0x045d
            goto L_0x048f
        L_0x045d:
            if (r51 == 0) goto L_0x051f
            int r0 = r1.f11429g
            r14.d(r13, r0)
            r.l r0 = r15.f10898d
            r.f r0 = r0.f11453i
            int r0 = r0.f11429g
            r14.d(r12, r0)
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x051f
            if (r29 == 0) goto L_0x051f
            boolean[] r0 = r15.f10902f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x051f
            boolean r0 = r49.y()
            if (r0 != 0) goto L_0x051f
            q.d r0 = r15.W
            q.c r0 = r0.M
            o.h r0 = r14.l(r0)
            r4 = 8
            r14.f(r0, r12, r1, r4)
            goto L_0x051f
        L_0x048f:
            r4 = 8
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x049d
            q.c r0 = r0.M
            o.h r0 = r14.l(r0)
            r7 = r0
            goto L_0x049f
        L_0x049d:
            r7 = r40
        L_0x049f:
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x04ab
            q.c r0 = r0.K
            o.h r0 = r14.l(r0)
            r6 = r0
            goto L_0x04ad
        L_0x04ab:
            r6 = r40
        L_0x04ad:
            boolean[] r0 = r15.f10902f
            r16 = 0
            boolean r5 = r0[r16]
            int[] r0 = r15.V
            r18 = r0[r16]
            q.c r3 = r15.K
            q.c r1 = r15.M
            int r2 = r15.f10895b0
            r22 = r2
            int r2 = r15.f10901e0
            int[] r4 = r15.D
            r42 = r4[r16]
            float r4 = r15.f10905g0
            r21 = 1
            r0 = r0[r21]
            r8 = 3
            if (r0 != r8) goto L_0x04d1
            r23 = r21
            goto L_0x04d3
        L_0x04d1:
            r23 = r16
        L_0x04d3:
            int r0 = r15.f10928v
            r24 = r0
            int r0 = r15.w
            r25 = r0
            float r0 = r15.f10929x
            r26 = r0
            r0 = 1
            r44 = r2
            r2 = r0
            r0 = r49
            r45 = r1
            r1 = r50
            r17 = r3
            r3 = r29
            r41 = r4
            r4 = r28
            r8 = r18
            r46 = r32
            r47 = r10
            r10 = r17
            r48 = r11
            r11 = r45
            r32 = r12
            r12 = r22
            r43 = r13
            r13 = r20
            r14 = r44
            r15 = r42
            r16 = r41
            r17 = r19
            r18 = r23
            r19 = r31
            r20 = r30
            r21 = r27
            r22 = r36
            r23 = r35
            r27 = r38
            r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0529
        L_0x051f:
            r47 = r10
            r48 = r11
            r43 = r13
            r46 = r32
            r32 = r12
        L_0x0529:
            if (r51 == 0) goto L_0x058f
            r15 = r49
            r.n r0 = r15.f10900e
            if (r0 == 0) goto L_0x0582
            r.f r1 = r0.f11452h
            boolean r2 = r1.f11432j
            if (r2 == 0) goto L_0x0582
            r.f r0 = r0.f11453i
            boolean r0 = r0.f11432j
            if (r0 == 0) goto L_0x0582
            int r0 = r1.f11429g
            r14 = r50
            r13 = r48
            r14.d(r13, r0)
            r.n r0 = r15.f10900e
            r.f r0 = r0.f11453i
            int r0 = r0.f11429g
            r12 = r47
            r14.d(r12, r0)
            r.n r0 = r15.f10900e
            r.f r0 = r0.k
            int r0 = r0.f11429g
            r1 = r46
            r14.d(r1, r0)
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x057c
            if (r30 != 0) goto L_0x057c
            if (r28 == 0) goto L_0x057c
            boolean[] r2 = r15.f10902f
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0578
            q.c r0 = r0.N
            o.h r0 = r14.l(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x0580
        L_0x0578:
            r2 = 8
            r10 = 0
            goto L_0x0580
        L_0x057c:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0580:
            r6 = r10
            goto L_0x059e
        L_0x0582:
            r14 = r50
            r1 = r46
            r12 = r47
            r13 = r48
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x059d
        L_0x058f:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r49
            r14 = r50
            r1 = r46
            r12 = r47
            r13 = r48
        L_0x059d:
            r6 = r11
        L_0x059e:
            int r0 = r15.f10922q
            r3 = 2
            if (r0 != r3) goto L_0x05a4
            r6 = r10
        L_0x05a4:
            if (r6 == 0) goto L_0x0676
            boolean r0 = r15.f10915m
            if (r0 != 0) goto L_0x0676
            int[] r0 = r15.V
            r0 = r0[r11]
            if (r0 != r3) goto L_0x05b6
            boolean r0 = r15 instanceof q.e
            if (r0 == 0) goto L_0x05b6
            r9 = r11
            goto L_0x05b7
        L_0x05b6:
            r9 = r10
        L_0x05b7:
            if (r9 == 0) goto L_0x05bb
            r34 = r10
        L_0x05bb:
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x05c7
            q.c r0 = r0.N
            o.h r0 = r14.l(r0)
            r7 = r0
            goto L_0x05c9
        L_0x05c7:
            r7 = r40
        L_0x05c9:
            q.d r0 = r15.W
            if (r0 == 0) goto L_0x05d5
            q.c r0 = r0.L
            o.h r0 = r14.l(r0)
            r6 = r0
            goto L_0x05d7
        L_0x05d5:
            r6 = r40
        L_0x05d7:
            int r0 = r15.f10899d0
            if (r0 > 0) goto L_0x05df
            int r3 = r15.f10911j0
            if (r3 != r2) goto L_0x0613
        L_0x05df:
            q.c r3 = r15.O
            q.c r4 = r3.f10879f
            if (r4 == 0) goto L_0x0608
            r14.e(r1, r13, r0, r2)
            q.c r0 = r15.O
            q.c r0 = r0.f10879f
            o.h r0 = r14.l(r0)
            q.c r3 = r15.O
            int r3 = r3.e()
            r14.e(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x0605
            q.c r0 = r15.N
            o.h r0 = r14.l(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x0605:
            r27 = r10
            goto L_0x0615
        L_0x0608:
            int r4 = r15.f10911j0
            if (r4 != r2) goto L_0x0610
            int r0 = r3.e()
        L_0x0610:
            r14.e(r1, r13, r0, r2)
        L_0x0613:
            r27 = r38
        L_0x0615:
            boolean[] r0 = r15.f10902f
            boolean r5 = r0[r11]
            int[] r0 = r15.V
            r8 = r0[r11]
            q.c r4 = r15.L
            q.c r3 = r15.N
            int r1 = r15.f10897c0
            int r2 = r15.f10903f0
            int[] r10 = r15.D
            r16 = r10[r11]
            float r10 = r15.f10907h0
            r17 = 0
            r0 = r0[r17]
            r11 = 3
            if (r0 != r11) goto L_0x0635
            r18 = 1
            goto L_0x0637
        L_0x0635:
            r18 = r17
        L_0x0637:
            int r0 = r15.f10930y
            r24 = r0
            int r0 = r15.f10931z
            r25 = r0
            float r0 = r15.A
            r26 = r0
            r0 = 0
            r19 = r2
            r2 = r0
            r0 = r49
            r20 = r1
            r1 = r50
            r11 = r3
            r3 = r28
            r21 = r4
            r4 = r29
            r17 = r10
            r10 = r21
            r28 = r12
            r12 = r20
            r29 = r13
            r13 = r34
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r30
            r20 = r31
            r21 = r39
            r22 = r35
            r23 = r36
            r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x067a
        L_0x0676:
            r28 = r12
            r29 = r13
        L_0x067a:
            r6 = r49
            if (r33 == 0) goto L_0x069b
            int r0 = r6.B
            float r5 = r6.C
            r1 = 1
            if (r0 != r1) goto L_0x068e
            r1 = r28
            r2 = r29
            r3 = r32
            r4 = r43
            goto L_0x0696
        L_0x068e:
            r3 = r28
            r4 = r29
            r1 = r32
            r2 = r43
        L_0x0696:
            r0 = r50
            r0.h(r1, r2, r3, r4, r5)
        L_0x069b:
            q.c r0 = r6.R
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x075b
            q.c r0 = r6.R
            q.c r0 = r0.f10879f
            q.d r0 = r0.f10877d
            float r1 = r6.E
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            q.c r2 = r6.R
            int r2 = r2.e()
            q.c$a r3 = q.c.a.LEFT
            q.c r4 = r6.j(r3)
            r5 = r50
            o.h r4 = r5.l(r4)
            q.c$a r7 = q.c.a.TOP
            q.c r8 = r6.j(r7)
            o.h r8 = r5.l(r8)
            q.c$a r9 = q.c.a.RIGHT
            q.c r10 = r6.j(r9)
            o.h r10 = r5.l(r10)
            q.c$a r11 = q.c.a.BOTTOM
            q.c r12 = r6.j(r11)
            o.h r12 = r5.l(r12)
            q.c r3 = r0.j(r3)
            o.h r3 = r5.l(r3)
            q.c r7 = r0.j(r7)
            o.h r7 = r5.l(r7)
            q.c r9 = r0.j(r9)
            o.h r9 = r5.l(r9)
            q.c r0 = r0.j(r11)
            o.h r0 = r5.l(r0)
            o.b r11 = r50.m()
            double r13 = (double) r1
            double r15 = java.lang.Math.sin(r13)
            double r1 = (double) r2
            r17 = r9
            r51 = r10
            double r9 = r15 * r1
            float r9 = (float) r9
            o.b$a r10 = r11.f10419d
            r15 = 1056964608(0x3f000000, float:0.5)
            r10.c(r7, r15)
            o.b$a r7 = r11.f10419d
            r7.c(r0, r15)
            o.b$a r0 = r11.f10419d
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            r0.c(r8, r7)
            o.b$a r0 = r11.f10419d
            r0.c(r12, r7)
            float r0 = -r9
            r11.f10417b = r0
            r5.c(r11)
            o.b r0 = r50.m()
            double r8 = java.lang.Math.cos(r13)
            double r8 = r8 * r1
            float r1 = (float) r8
            o.b$a r2 = r0.f10419d
            r2.c(r3, r15)
            o.b$a r2 = r0.f10419d
            r3 = r17
            r2.c(r3, r15)
            o.b$a r2 = r0.f10419d
            r2.c(r4, r7)
            o.b$a r2 = r0.f10419d
            r3 = r51
            r2.c(r3, r7)
            float r1 = -r1
            r0.f10417b = r1
            r5.c(r0)
        L_0x075b:
            r0 = 0
            r6.f10913l = r0
            r6.f10915m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.c(o.d, boolean):void");
    }

    public boolean d() {
        return this.f10911j0 != 8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0510, code lost:
        if (r3[1] == 3) goto L_0x0515;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0370 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0418 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0434 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:349:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(o.d r32, boolean r33, boolean r34, boolean r35, boolean r36, o.h r37, o.h r38, int r39, boolean r40, q.c r41, q.c r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r54
            r3 = r55
            r4 = r56
            r5 = r57
            q.c$a r6 = q.c.a.BOTTOM
            o.h r9 = r10.l(r13)
            o.h r8 = r10.l(r14)
            q.c r7 = r13.f10879f
            o.h r7 = r10.l(r7)
            q.c r12 = r14.f10879f
            o.h r12 = r10.l(r12)
            boolean r16 = r41.h()
            boolean r17 = r42.h()
            q.c r2 = r0.R
            boolean r2 = r2.h()
            if (r17 == 0) goto L_0x0041
            int r18 = r16 + 1
            goto L_0x0043
        L_0x0041:
            r18 = r16
        L_0x0043:
            if (r2 == 0) goto L_0x0047
            int r18 = r18 + 1
        L_0x0047:
            r14 = r18
            if (r48 == 0) goto L_0x004d
            r11 = 3
            goto L_0x004f
        L_0x004d:
            r11 = r53
        L_0x004f:
            if (r39 == 0) goto L_0x051e
            r19 = r12
            r12 = -1
            int r5 = r39 + -1
            r12 = 1
            r20 = r6
            if (r5 == 0) goto L_0x0066
            if (r5 == r12) goto L_0x0066
            r12 = 2
            if (r5 == r12) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r12 = 4
            if (r11 == r12) goto L_0x0066
            r5 = 1
            goto L_0x0067
        L_0x0066:
            r5 = 0
        L_0x0067:
            int r12 = r0.f10908i
            r6 = -1
            if (r12 == r6) goto L_0x0073
            if (r33 == 0) goto L_0x0073
            r0.f10908i = r6
            r44 = 0
            goto L_0x0077
        L_0x0073:
            r12 = r44
            r44 = r5
        L_0x0077:
            int r5 = r0.f10910j
            if (r5 == r6) goto L_0x0082
            if (r33 != 0) goto L_0x0082
            r0.f10910j = r6
            r12 = r5
            r5 = 0
            goto L_0x0084
        L_0x0082:
            r5 = r44
        L_0x0084:
            int r6 = r0.f10911j0
            r44 = r12
            r12 = 8
            if (r6 != r12) goto L_0x008f
            r5 = 0
            r6 = 0
            goto L_0x0091
        L_0x008f:
            r6 = r44
        L_0x0091:
            if (r58 == 0) goto L_0x00b4
            if (r16 != 0) goto L_0x009f
            if (r17 != 0) goto L_0x009f
            if (r2 != 0) goto L_0x009f
            r12 = r43
            r10.d(r9, r12)
            goto L_0x00af
        L_0x009f:
            if (r16 == 0) goto L_0x00af
            if (r17 != 0) goto L_0x00af
            int r12 = r41.e()
            r22 = r2
            r2 = 8
            r10.e(r9, r7, r12, r2)
            goto L_0x00b7
        L_0x00af:
            r22 = r2
            r2 = 8
            goto L_0x00b7
        L_0x00b4:
            r22 = r2
            r2 = r12
        L_0x00b7:
            if (r5 != 0) goto L_0x00dc
            if (r40 == 0) goto L_0x00d0
            r2 = 0
            r12 = 3
            r10.e(r8, r9, r2, r12)
            r2 = 8
            if (r15 <= 0) goto L_0x00c7
            r10.f(r8, r9, r15, r2)
        L_0x00c7:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00d4
            r10.g(r8, r9, r1, r2)
            goto L_0x00d4
        L_0x00d0:
            r12 = 3
            r10.e(r8, r9, r6, r2)
        L_0x00d4:
            r12 = r36
            r20 = r3
        L_0x00d8:
            r23 = r5
            goto L_0x01a9
        L_0x00dc:
            r1 = 2
            r12 = 3
            if (r14 == r1) goto L_0x00fe
            if (r48 != 0) goto L_0x00fe
            r1 = 1
            if (r11 == r1) goto L_0x00e7
            if (r11 != 0) goto L_0x00fe
        L_0x00e7:
            int r1 = java.lang.Math.max(r3, r6)
            if (r4 <= 0) goto L_0x00f1
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00f1:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r12 = r36
            r20 = r3
            r23 = 0
            goto L_0x01a9
        L_0x00fe:
            r1 = -2
            if (r3 != r1) goto L_0x0102
            r3 = r6
        L_0x0102:
            if (r4 != r1) goto L_0x0105
            r4 = r6
        L_0x0105:
            if (r6 <= 0) goto L_0x010b
            r1 = 1
            if (r11 == r1) goto L_0x010b
            r6 = 0
        L_0x010b:
            if (r3 <= 0) goto L_0x0116
            r1 = 8
            r10.f(r8, r9, r3, r1)
            int r6 = java.lang.Math.max(r6, r3)
        L_0x0116:
            if (r4 <= 0) goto L_0x012f
            if (r34 == 0) goto L_0x011f
            r1 = 1
            if (r11 != r1) goto L_0x011f
            r1 = 0
            goto L_0x0120
        L_0x011f:
            r1 = 1
        L_0x0120:
            if (r1 == 0) goto L_0x0128
            r1 = 8
            r10.g(r8, r9, r4, r1)
            goto L_0x012a
        L_0x0128:
            r1 = 8
        L_0x012a:
            int r6 = java.lang.Math.min(r6, r4)
            goto L_0x0131
        L_0x012f:
            r1 = 8
        L_0x0131:
            r2 = 1
            if (r11 != r2) goto L_0x0142
            if (r34 == 0) goto L_0x013a
            r10.e(r8, r9, r6, r1)
            goto L_0x00d4
        L_0x013a:
            r2 = 5
            r10.e(r8, r9, r6, r2)
            r10.g(r8, r9, r6, r1)
            goto L_0x00d4
        L_0x0142:
            r1 = 2
            if (r11 != r1) goto L_0x01a2
            q.c$a r1 = r13.f10878e
            q.c$a r2 = q.c.a.TOP
            r6 = r20
            if (r1 == r2) goto L_0x0161
            if (r1 != r6) goto L_0x0150
            goto L_0x0161
        L_0x0150:
            q.d r1 = r0.W
            q.c$a r2 = q.c.a.LEFT
            q.c r1 = r1.j(r2)
            o.h r1 = r10.l(r1)
            q.d r2 = r0.W
            q.c$a r6 = q.c.a.RIGHT
            goto L_0x016d
        L_0x0161:
            q.d r1 = r0.W
            q.c r1 = r1.j(r2)
            o.h r1 = r10.l(r1)
            q.d r2 = r0.W
        L_0x016d:
            q.c r2 = r2.j(r6)
            o.h r2 = r10.l(r2)
            o.b r6 = r32.m()
            o.b$a r12 = r6.f10419d
            r40 = r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.c(r8, r3)
            o.b$a r3 = r6.f10419d
            r12 = 1065353216(0x3f800000, float:1.0)
            r3.c(r9, r12)
            o.b$a r3 = r6.f10419d
            r12 = r57
            r3.c(r2, r12)
            o.b$a r2 = r6.f10419d
            float r3 = -r12
            r2.c(r1, r3)
            r10.c(r6)
            if (r34 == 0) goto L_0x019c
            r5 = 0
        L_0x019c:
            r12 = r36
            r20 = r40
            goto L_0x00d8
        L_0x01a2:
            r40 = r3
            r20 = r40
            r23 = r5
            r12 = 1
        L_0x01a9:
            if (r58 == 0) goto L_0x04d3
            if (r50 == 0) goto L_0x01af
            goto L_0x04d3
        L_0x01af:
            if (r16 != 0) goto L_0x01c0
            if (r17 != 0) goto L_0x01c0
            if (r22 != 0) goto L_0x01c0
            r13 = r42
            r5 = r8
            r36 = r12
            r14 = r19
        L_0x01bc:
            r2 = 5
            r4 = 0
            goto L_0x04b8
        L_0x01c0:
            if (r16 == 0) goto L_0x01df
            if (r17 != 0) goto L_0x01df
            q.c r1 = r13.f10879f
            q.d r1 = r1.f10877d
            if (r34 == 0) goto L_0x01d1
            boolean r1 = r1 instanceof q.a
            if (r1 == 0) goto L_0x01d1
            r1 = 8
            goto L_0x01d2
        L_0x01d1:
            r1 = 5
        L_0x01d2:
            r13 = r42
            r5 = r8
            r36 = r12
            r14 = r19
            r4 = 0
            r12 = r1
            r1 = r34
            goto L_0x04bb
        L_0x01df:
            if (r16 != 0) goto L_0x0207
            if (r17 == 0) goto L_0x0207
            int r1 = r42.e()
            int r1 = -r1
            r14 = r19
            r2 = 8
            r10.e(r8, r14, r1, r2)
            if (r34 == 0) goto L_0x0201
            r5 = r37
            r1 = 5
            r6 = 0
            r10.f(r9, r5, r6, r1)
            r13 = r42
            r2 = r1
            r4 = r6
            r5 = r8
            r36 = r12
            goto L_0x04b8
        L_0x0201:
            r13 = r42
            r5 = r8
            r36 = r12
            goto L_0x01bc
        L_0x0207:
            r5 = r37
            r14 = r19
            r3 = 3
            r6 = 0
            if (r16 == 0) goto L_0x04b1
            if (r17 == 0) goto L_0x04b1
            q.c r1 = r13.f10879f
            q.d r2 = r1.f10877d
            r1 = r42
            q.c r6 = r1.f10879f
            q.d r6 = r6.f10877d
            q.d r3 = r0.W
            r16 = 6
            if (r23 == 0) goto L_0x031f
            if (r11 != 0) goto L_0x0275
            if (r4 != 0) goto L_0x024c
            if (r20 != 0) goto L_0x024c
            boolean r4 = r7.f10455f
            if (r4 == 0) goto L_0x0241
            boolean r4 = r14.f10455f
            if (r4 == 0) goto L_0x0241
            int r2 = r41.e()
            r3 = 8
            r10.e(r9, r7, r2, r3)
            int r1 = r42.e()
            int r1 = -r1
            r10.e(r8, r14, r1, r3)
            return
        L_0x0241:
            r33 = 8
            r17 = 8
            r19 = 1
            r22 = 0
            r24 = 0
            goto L_0x0256
        L_0x024c:
            r33 = 5
            r17 = 5
            r19 = 0
            r22 = 1
            r24 = 1
        L_0x0256:
            boolean r4 = r2 instanceof q.a
            if (r4 != 0) goto L_0x026a
            boolean r4 = r6 instanceof q.a
            if (r4 == 0) goto L_0x025f
            goto L_0x026a
        L_0x025f:
            r4 = r33
            r13 = r16
            r25 = r19
            r19 = r17
            r17 = r11
            goto L_0x02a0
        L_0x026a:
            r4 = r33
            r17 = r11
            r13 = r16
            r25 = r19
            r19 = 4
            goto L_0x02a0
        L_0x0275:
            r13 = 2
            if (r11 != r13) goto L_0x028f
            boolean r4 = r2 instanceof q.a
            if (r4 != 0) goto L_0x0289
            boolean r4 = r6 instanceof q.a
            if (r4 == 0) goto L_0x0281
            goto L_0x0289
        L_0x0281:
            r17 = r11
            r13 = r16
            r4 = 5
            r19 = 5
            goto L_0x029a
        L_0x0289:
            r17 = r11
            r13 = r16
            r4 = 5
            goto L_0x0298
        L_0x028f:
            r13 = 1
            if (r11 != r13) goto L_0x02a4
            r17 = r11
            r13 = r16
            r4 = 8
        L_0x0298:
            r19 = 4
        L_0x029a:
            r22 = 1
            r24 = 1
            r25 = 0
        L_0x02a0:
            r11 = r38
            goto L_0x036e
        L_0x02a4:
            r13 = 3
            if (r11 != r13) goto L_0x0311
            int r13 = r0.B
            r17 = r11
            r11 = -1
            if (r13 != r11) goto L_0x02c6
            r11 = r38
            r4 = 8
            if (r51 == 0) goto L_0x02ba
            if (r34 == 0) goto L_0x02b8
            r13 = 5
            goto L_0x02bc
        L_0x02b8:
            r13 = 4
            goto L_0x02bc
        L_0x02ba:
            r13 = 8
        L_0x02bc:
            r19 = 5
        L_0x02be:
            r22 = 1
            r24 = 1
            r25 = 1
            goto L_0x036e
        L_0x02c6:
            if (r48 == 0) goto L_0x02e7
            r11 = r54
            r13 = 2
            if (r11 == r13) goto L_0x02d3
            r4 = 1
            if (r11 != r4) goto L_0x02d1
            goto L_0x02d3
        L_0x02d1:
            r4 = 0
            goto L_0x02d4
        L_0x02d3:
            r4 = 1
        L_0x02d4:
            if (r4 != 0) goto L_0x02da
            r4 = 8
            r11 = 5
            goto L_0x02dc
        L_0x02da:
            r4 = 5
            r11 = 4
        L_0x02dc:
            r19 = r11
            r13 = r16
            r22 = 1
            r24 = 1
            r25 = 1
            goto L_0x02a0
        L_0x02e7:
            if (r4 <= 0) goto L_0x02ef
            r11 = r38
            r13 = r16
            r4 = 5
            goto L_0x02bc
        L_0x02ef:
            if (r4 != 0) goto L_0x0309
            if (r20 != 0) goto L_0x0309
            if (r51 != 0) goto L_0x02fd
            r11 = r38
            r13 = r16
            r4 = 5
            r19 = 8
            goto L_0x02be
        L_0x02fd:
            if (r2 == r3) goto L_0x0303
            if (r6 == r3) goto L_0x0303
            r4 = 4
            goto L_0x0304
        L_0x0303:
            r4 = 5
        L_0x0304:
            r11 = r38
            r13 = r16
            goto L_0x030e
        L_0x0309:
            r11 = r38
            r13 = r16
            r4 = 5
        L_0x030e:
            r19 = 4
            goto L_0x02be
        L_0x0311:
            r17 = r11
            r11 = r38
            r13 = r16
            r4 = 5
            r19 = 4
            r22 = 0
            r24 = 0
            goto L_0x036c
        L_0x031f:
            r17 = r11
            boolean r4 = r7.f10455f
            if (r4 == 0) goto L_0x0361
            boolean r4 = r14.f10455f
            if (r4 == 0) goto L_0x0361
            int r2 = r41.e()
            int r3 = r42.e()
            r4 = 8
            r48 = r32
            r49 = r9
            r50 = r7
            r51 = r2
            r52 = r47
            r53 = r14
            r54 = r8
            r55 = r3
            r56 = r4
            r48.b(r49, r50, r51, r52, r53, r54, r55, r56)
            if (r34 == 0) goto L_0x0360
            if (r12 == 0) goto L_0x0360
            q.c r2 = r1.f10879f
            if (r2 == 0) goto L_0x0357
            int r6 = r42.e()
            r11 = r38
            goto L_0x035a
        L_0x0357:
            r11 = r38
            r6 = 0
        L_0x035a:
            if (r14 == r11) goto L_0x0360
            r1 = 5
            r10.f(r11, r8, r6, r1)
        L_0x0360:
            return
        L_0x0361:
            r11 = r38
            r13 = r16
            r4 = 5
            r19 = 4
            r22 = 1
            r24 = 1
        L_0x036c:
            r25 = 0
        L_0x036e:
            if (r22 == 0) goto L_0x0379
            if (r7 != r14) goto L_0x0379
            if (r2 == r3) goto L_0x0379
            r22 = 0
            r26 = 0
            goto L_0x037d
        L_0x0379:
            r26 = r22
            r22 = 1
        L_0x037d:
            if (r24 == 0) goto L_0x03c7
            if (r23 != 0) goto L_0x0391
            if (r49 != 0) goto L_0x0391
            if (r51 != 0) goto L_0x0391
            if (r7 != r5) goto L_0x0391
            if (r14 != r11) goto L_0x0391
            r13 = 0
            r22 = 8
            r24 = 0
            r27 = 8
            goto L_0x0399
        L_0x0391:
            r27 = r13
            r24 = r22
            r13 = r34
            r22 = r4
        L_0x0399:
            int r4 = r41.e()
            int r28 = r42.e()
            r33 = r13
            r13 = r1
            r1 = r32
            r11 = r2
            r2 = r9
            r36 = r12
            r12 = r3
            r3 = r7
            r15 = r5
            r5 = r47
            r15 = r6
            r6 = r14
            r18 = r12
            r12 = r7
            r7 = r8
            r29 = r8
            r8 = r28
            r30 = r9
            r9 = r27
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r33
            r4 = r22
            r22 = r24
            goto L_0x03d5
        L_0x03c7:
            r13 = r1
            r11 = r2
            r18 = r3
            r15 = r6
            r29 = r8
            r30 = r9
            r36 = r12
            r12 = r7
            r1 = r34
        L_0x03d5:
            int r2 = r0.f10911j0
            r3 = 8
            if (r2 != r3) goto L_0x03ec
            java.util.HashSet<q.c> r2 = r13.f10874a
            if (r2 != 0) goto L_0x03e0
            goto L_0x03e8
        L_0x03e0:
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03e8
            r6 = 1
            goto L_0x03e9
        L_0x03e8:
            r6 = 0
        L_0x03e9:
            if (r6 != 0) goto L_0x03ec
            return
        L_0x03ec:
            if (r26 == 0) goto L_0x0412
            if (r1 == 0) goto L_0x03fe
            if (r12 == r14) goto L_0x03fe
            if (r23 != 0) goto L_0x03fe
            boolean r2 = r11 instanceof q.a
            if (r2 != 0) goto L_0x03fc
            boolean r2 = r15 instanceof q.a
            if (r2 == 0) goto L_0x03fe
        L_0x03fc:
            r4 = r16
        L_0x03fe:
            int r2 = r41.e()
            r3 = r30
            r10.f(r3, r12, r2, r4)
            int r2 = r42.e()
            int r2 = -r2
            r5 = r29
            r10.g(r5, r14, r2, r4)
            goto L_0x0416
        L_0x0412:
            r5 = r29
            r3 = r30
        L_0x0416:
            if (r1 == 0) goto L_0x042c
            if (r52 == 0) goto L_0x042c
            boolean r2 = r11 instanceof q.a
            if (r2 != 0) goto L_0x042c
            boolean r2 = r15 instanceof q.a
            if (r2 != 0) goto L_0x042c
            r2 = r18
            if (r15 == r2) goto L_0x042e
            r4 = r16
            r6 = r4
            r21 = 1
            goto L_0x0432
        L_0x042c:
            r2 = r18
        L_0x042e:
            r6 = r19
            r21 = r22
        L_0x0432:
            if (r21 == 0) goto L_0x047f
            if (r25 == 0) goto L_0x045f
            if (r51 == 0) goto L_0x043a
            if (r35 == 0) goto L_0x045f
        L_0x043a:
            if (r11 == r2) goto L_0x0441
            if (r15 != r2) goto L_0x043f
            goto L_0x0441
        L_0x043f:
            r16 = r6
        L_0x0441:
            boolean r7 = r11 instanceof q.g
            if (r7 != 0) goto L_0x0449
            boolean r7 = r15 instanceof q.g
            if (r7 == 0) goto L_0x044b
        L_0x0449:
            r16 = 5
        L_0x044b:
            boolean r7 = r11 instanceof q.a
            if (r7 != 0) goto L_0x0453
            boolean r7 = r15 instanceof q.a
            if (r7 == 0) goto L_0x0455
        L_0x0453:
            r16 = 5
        L_0x0455:
            if (r51 == 0) goto L_0x0459
            r7 = 5
            goto L_0x045b
        L_0x0459:
            r7 = r16
        L_0x045b:
            int r6 = java.lang.Math.max(r7, r6)
        L_0x045f:
            if (r1 == 0) goto L_0x046f
            int r4 = java.lang.Math.min(r4, r6)
            if (r48 == 0) goto L_0x0470
            if (r51 != 0) goto L_0x0470
            if (r11 == r2) goto L_0x046d
            if (r15 != r2) goto L_0x0470
        L_0x046d:
            r4 = 4
            goto L_0x0470
        L_0x046f:
            r4 = r6
        L_0x0470:
            int r2 = r41.e()
            r10.e(r3, r12, r2, r4)
            int r2 = r42.e()
            int r2 = -r2
            r10.e(r5, r14, r2, r4)
        L_0x047f:
            if (r1 == 0) goto L_0x0491
            r2 = r37
            if (r2 != r12) goto L_0x048a
            int r6 = r41.e()
            goto L_0x048b
        L_0x048a:
            r6 = 0
        L_0x048b:
            if (r12 == r2) goto L_0x0491
            r4 = 5
            r10.f(r3, r2, r6, r4)
        L_0x0491:
            if (r1 == 0) goto L_0x04ae
            if (r23 == 0) goto L_0x04ae
            if (r45 != 0) goto L_0x04ae
            if (r20 != 0) goto L_0x04ae
            if (r23 == 0) goto L_0x04a8
            r11 = r17
            r2 = 3
            if (r11 != r2) goto L_0x04a8
            r2 = 8
            r4 = 0
            r10.f(r5, r3, r4, r2)
            r2 = 5
            goto L_0x04ba
        L_0x04a8:
            r4 = 0
            r2 = 5
            r10.f(r5, r3, r4, r2)
            goto L_0x04ba
        L_0x04ae:
            r2 = 5
            r4 = 0
            goto L_0x04ba
        L_0x04b1:
            r13 = r42
            r4 = r6
            r5 = r8
            r36 = r12
            r2 = 5
        L_0x04b8:
            r1 = r34
        L_0x04ba:
            r12 = r2
        L_0x04bb:
            if (r1 == 0) goto L_0x04d2
            if (r36 == 0) goto L_0x04d2
            q.c r1 = r13.f10879f
            if (r1 == 0) goto L_0x04ca
            int r6 = r42.e()
            r1 = r38
            goto L_0x04cd
        L_0x04ca:
            r1 = r38
            r6 = r4
        L_0x04cd:
            if (r14 == r1) goto L_0x04d2
            r10.f(r1, r5, r6, r12)
        L_0x04d2:
            return
        L_0x04d3:
            r6 = r37
            r1 = r38
            r5 = r8
            r3 = r9
            r36 = r12
            r7 = r14
            r2 = 3
            r4 = 0
            r8 = 2
            if (r7 >= r8) goto L_0x051d
            if (r34 == 0) goto L_0x051d
            if (r36 == 0) goto L_0x051d
            r7 = 8
            r10.f(r3, r6, r4, r7)
            if (r33 != 0) goto L_0x04f5
            q.c r3 = r0.O
            q.c r3 = r3.f10879f
            if (r3 != 0) goto L_0x04f3
            goto L_0x04f5
        L_0x04f3:
            r6 = r4
            goto L_0x04f6
        L_0x04f5:
            r6 = 1
        L_0x04f6:
            if (r33 != 0) goto L_0x0515
            q.c r3 = r0.O
            q.c r3 = r3.f10879f
            if (r3 == 0) goto L_0x0515
            q.d r3 = r3.f10877d
            float r6 = r3.Z
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0513
            int[] r3 = r3.V
            r6 = r3[r4]
            if (r6 != r2) goto L_0x0513
            r6 = 1
            r3 = r3[r6]
            if (r3 != r2) goto L_0x0513
            goto L_0x0515
        L_0x0513:
            r12 = r4
            goto L_0x0516
        L_0x0515:
            r12 = r6
        L_0x0516:
            if (r12 == 0) goto L_0x051d
            r2 = 8
            r10.f(r1, r5, r4, r2)
        L_0x051d:
            return
        L_0x051e:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.e(o.d, boolean, boolean, boolean, boolean, o.h, o.h, int, boolean, q.c, q.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013a, code lost:
        if (r13 != null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0161, code lost:
        if (r13.h() != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
        if (r13.h() != false) goto L_0x018a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(q.c.a r11, q.d r12, q.c.a r13, int r14) {
        /*
            r10 = this;
            q.c$a r0 = q.c.a.CENTER_Y
            q.c$a r1 = q.c.a.CENTER_X
            q.c$a r2 = q.c.a.LEFT
            q.c$a r3 = q.c.a.TOP
            q.c$a r4 = q.c.a.RIGHT
            q.c$a r5 = q.c.a.BOTTOM
            q.c$a r6 = q.c.a.CENTER
            r7 = 0
            if (r11 != r6) goto L_0x0097
            if (r13 != r6) goto L_0x007b
            q.c r11 = r10.j(r2)
            q.c r13 = r10.j(r4)
            q.c r14 = r10.j(r3)
            q.c r8 = r10.j(r5)
            r9 = 1
            if (r11 == 0) goto L_0x002c
            boolean r11 = r11.h()
            if (r11 != 0) goto L_0x0034
        L_0x002c:
            if (r13 == 0) goto L_0x0036
            boolean r11 = r13.h()
            if (r11 == 0) goto L_0x0036
        L_0x0034:
            r11 = r7
            goto L_0x003d
        L_0x0036:
            r10.f(r2, r12, r2, r7)
            r10.f(r4, r12, r4, r7)
            r11 = r9
        L_0x003d:
            if (r14 == 0) goto L_0x0045
            boolean r13 = r14.h()
            if (r13 != 0) goto L_0x004d
        L_0x0045:
            if (r8 == 0) goto L_0x004f
            boolean r13 = r8.h()
            if (r13 == 0) goto L_0x004f
        L_0x004d:
            r9 = r7
            goto L_0x0055
        L_0x004f:
            r10.f(r3, r12, r3, r7)
            r10.f(r5, r12, r5, r7)
        L_0x0055:
            if (r11 == 0) goto L_0x0063
            if (r9 == 0) goto L_0x0063
            q.c r11 = r10.j(r6)
            q.c r12 = r12.j(r6)
            goto L_0x0116
        L_0x0063:
            if (r11 == 0) goto L_0x006f
            q.c r11 = r10.j(r1)
            q.c r12 = r12.j(r1)
            goto L_0x0116
        L_0x006f:
            if (r9 == 0) goto L_0x0193
            q.c r11 = r10.j(r0)
            q.c r12 = r12.j(r0)
            goto L_0x0116
        L_0x007b:
            if (r13 == r2) goto L_0x008b
            if (r13 != r4) goto L_0x0080
            goto L_0x008b
        L_0x0080:
            if (r13 == r3) goto L_0x0084
            if (r13 != r5) goto L_0x0193
        L_0x0084:
            r10.f(r3, r12, r13, r7)
            r10.f(r5, r12, r13, r7)
            goto L_0x0091
        L_0x008b:
            r10.f(r2, r12, r13, r7)
            r10.f(r4, r12, r13, r7)
        L_0x0091:
            q.c r11 = r10.j(r6)
            goto L_0x0112
        L_0x0097:
            if (r11 != r1) goto L_0x00b4
            if (r13 == r2) goto L_0x009d
            if (r13 != r4) goto L_0x00b4
        L_0x009d:
            q.c r11 = r10.j(r2)
            q.c r12 = r12.j(r13)
            q.c r13 = r10.j(r4)
            r11.a(r12, r7)
            r13.a(r12, r7)
            q.c r11 = r10.j(r1)
            goto L_0x0116
        L_0x00b4:
            if (r11 != r0) goto L_0x00d5
            if (r13 == r3) goto L_0x00ba
            if (r13 != r5) goto L_0x00d5
        L_0x00ba:
            q.c r11 = r12.j(r13)
            q.c r12 = r10.j(r3)
            r12.a(r11, r7)
            q.c r12 = r10.j(r5)
            r12.a(r11, r7)
            q.c r12 = r10.j(r0)
            r12.a(r11, r7)
            goto L_0x0193
        L_0x00d5:
            if (r11 != r1) goto L_0x00f4
            if (r13 != r1) goto L_0x00f4
            q.c r11 = r10.j(r2)
            q.c r14 = r12.j(r2)
            r11.a(r14, r7)
            q.c r11 = r10.j(r4)
            q.c r14 = r12.j(r4)
            r11.a(r14, r7)
            q.c r11 = r10.j(r1)
            goto L_0x0112
        L_0x00f4:
            if (r11 != r0) goto L_0x011b
            if (r13 != r0) goto L_0x011b
            q.c r11 = r10.j(r3)
            q.c r14 = r12.j(r3)
            r11.a(r14, r7)
            q.c r11 = r10.j(r5)
            q.c r14 = r12.j(r5)
            r11.a(r14, r7)
            q.c r11 = r10.j(r0)
        L_0x0112:
            q.c r12 = r12.j(r13)
        L_0x0116:
            r11.a(r12, r7)
            goto L_0x0193
        L_0x011b:
            q.c r7 = r10.j(r11)
            q.c r12 = r12.j(r13)
            boolean r13 = r7.i(r12)
            if (r13 == 0) goto L_0x0193
            q.c$a r13 = q.c.a.BASELINE
            if (r11 != r13) goto L_0x013d
            q.c r11 = r10.j(r3)
            q.c r13 = r10.j(r5)
            if (r11 == 0) goto L_0x013a
            r11.j()
        L_0x013a:
            if (r13 == 0) goto L_0x0190
            goto L_0x018d
        L_0x013d:
            if (r11 == r3) goto L_0x0164
            if (r11 != r5) goto L_0x0142
            goto L_0x0164
        L_0x0142:
            if (r11 == r2) goto L_0x0146
            if (r11 != r4) goto L_0x0190
        L_0x0146:
            q.c r13 = r10.j(r6)
            q.c r0 = r13.f10879f
            if (r0 == r12) goto L_0x0151
            r13.j()
        L_0x0151:
            q.c r11 = r10.j(r11)
            q.c r11 = r11.f()
            q.c r13 = r10.j(r1)
            boolean r0 = r13.h()
            if (r0 == 0) goto L_0x0190
            goto L_0x018a
        L_0x0164:
            q.c r13 = r10.j(r13)
            if (r13 == 0) goto L_0x016d
            r13.j()
        L_0x016d:
            q.c r13 = r10.j(r6)
            q.c r1 = r13.f10879f
            if (r1 == r12) goto L_0x0178
            r13.j()
        L_0x0178:
            q.c r11 = r10.j(r11)
            q.c r11 = r11.f()
            q.c r13 = r10.j(r0)
            boolean r0 = r13.h()
            if (r0 == 0) goto L_0x0190
        L_0x018a:
            r11.j()
        L_0x018d:
            r13.j()
        L_0x0190:
            r7.a(r12, r14)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.f(q.c$a, q.d, q.c$a, int):void");
    }

    public final void g(c cVar, c cVar2, int i10) {
        if (cVar.f10877d == this) {
            f(cVar.f10878e, cVar2.f10877d, cVar2.f10878e, i10);
        }
    }

    public final void h(o.d dVar) {
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        dVar.l(this.N);
        if (this.f10899d0 > 0) {
            dVar.l(this.O);
        }
    }

    public final void i() {
        if (this.f10898d == null) {
            this.f10898d = new l(this);
        }
        if (this.f10900e == null) {
            this.f10900e = new n(this);
        }
    }

    public c j(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final int k(int i10) {
        if (i10 == 0) {
            return this.V[0];
        }
        if (i10 == 1) {
            return this.V[1];
        }
        return 0;
    }

    public final int l() {
        if (this.f10911j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q.d m(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            q.c r3 = r2.M
            q.c r0 = r3.f10879f
            if (r0 == 0) goto L_0x001f
            q.c r1 = r0.f10879f
            if (r1 != r3) goto L_0x001f
            q.d r3 = r0.f10877d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            q.c r3 = r2.N
            q.c r0 = r3.f10879f
            if (r0 == 0) goto L_0x001f
            q.c r1 = r0.f10879f
            if (r1 != r3) goto L_0x001f
            q.d r3 = r0.f10877d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.m(int):q.d");
    }

    public final p n(int i10) {
        if (i10 == 0) {
            return this.f10898d;
        }
        if (i10 == 1) {
            return this.f10900e;
        }
        return null;
    }

    public void o(StringBuilder sb) {
        StringBuilder g10 = androidx.activity.f.g("  ");
        g10.append(this.k);
        g10.append(":{\n");
        sb.append(g10.toString());
        sb.append("    actualWidth:" + this.X);
        sb.append("\n");
        sb.append("    actualHeight:" + this.Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f10895b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f10897c0);
        sb.append("\n");
        q(sb, "left", this.K);
        q(sb, "top", this.L);
        q(sb, "right", this.M);
        q(sb, "bottom", this.N);
        q(sb, "baseline", this.O);
        q(sb, "centerX", this.P);
        q(sb, "centerY", this.Q);
        int i10 = this.X;
        int i11 = this.f10901e0;
        int i12 = this.D[0];
        int i13 = this.f10928v;
        int i14 = this.f10926s;
        float f10 = this.f10929x;
        float f11 = this.f10918n0[0];
        p(sb, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.Y;
        int i16 = this.f10903f0;
        int i17 = this.D[1];
        int i18 = this.f10930y;
        int i19 = this.f10927t;
        float f12 = this.A;
        float f13 = this.f10918n0[1];
        p(sb, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.Z;
        int i20 = this.f10893a0;
        if (f14 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f14);
            sb.append(",");
            sb.append(i20);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.f10905g0, 0.5f);
        I(sb, "    verticalBias", this.f10907h0, 0.5f);
        H(this.f10914l0, 0, "    horizontalChainStyle", sb);
        H(this.f10916m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.f10911j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int s() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f10895b0 : ((e) dVar).f10937z0 + this.f10895b0;
    }

    public final int t() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f10897c0 : ((e) dVar).A0 + this.f10897c0;
    }

    public String toString() {
        String str = "";
        StringBuilder g10 = androidx.activity.f.g(str);
        if (this.f10912k0 != null) {
            str = e.c(androidx.activity.f.g("id: "), this.f10912k0, " ");
        }
        g10.append(str);
        g10.append("(");
        g10.append(this.f10895b0);
        g10.append(", ");
        g10.append(this.f10897c0);
        g10.append(") - (");
        g10.append(this.X);
        g10.append(" x ");
        g10.append(this.Y);
        g10.append(")");
        return g10.toString();
    }

    public final boolean u(int i10) {
        if (i10 == 0) {
            return (this.K.f10879f != null ? 1 : 0) + (this.M.f10879f != null ? 1 : 0) < 2;
        }
        return ((this.L.f10879f != null ? 1 : 0) + (this.N.f10879f != null ? 1 : 0)) + (this.O.f10879f != null ? 1 : 0) < 2;
    }

    public final boolean v(int i10, int i11) {
        c cVar;
        c cVar2;
        if (i10 == 0) {
            c cVar3 = this.K.f10879f;
            if (cVar3 != null && cVar3.f10876c && (cVar2 = this.M.f10879f) != null && cVar2.f10876c) {
                if ((cVar2.d() - this.M.e()) - (this.K.e() + this.K.f10879f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            c cVar4 = this.L.f10879f;
            if (cVar4 != null && cVar4.f10876c && (cVar = this.N.f10879f) != null && cVar.f10876c) {
                if ((cVar.d() - this.N.e()) - (this.L.e() + this.L.f10879f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void w(c.a aVar, d dVar, c.a aVar2, int i10, int i11) {
        j(aVar).b(dVar.j(aVar2), i10, i11, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = r0[r5 + 1];
        r0 = r5.f10879f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(int r5) {
        /*
            r4 = this;
            int r5 = r5 * 2
            q.c[] r0 = r4.S
            r1 = r0[r5]
            q.c r2 = r1.f10879f
            r3 = 1
            if (r2 == 0) goto L_0x001b
            q.c r2 = r2.f10879f
            if (r2 == r1) goto L_0x001b
            int r5 = r5 + r3
            r5 = r0[r5]
            q.c r0 = r5.f10879f
            if (r0 == 0) goto L_0x001b
            q.c r0 = r0.f10879f
            if (r0 != r5) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.x(int):boolean");
    }

    public final boolean y() {
        c cVar = this.K;
        c cVar2 = cVar.f10879f;
        if (cVar2 != null && cVar2.f10879f == cVar) {
            return true;
        }
        c cVar3 = this.M;
        c cVar4 = cVar3.f10879f;
        return cVar4 != null && cVar4.f10879f == cVar3;
    }

    public final boolean z() {
        c cVar = this.L;
        c cVar2 = cVar.f10879f;
        if (cVar2 != null && cVar2.f10879f == cVar) {
            return true;
        }
        c cVar3 = this.N;
        c cVar4 = cVar3.f10879f;
        return cVar4 != null && cVar4.f10879f == cVar3;
    }
}
