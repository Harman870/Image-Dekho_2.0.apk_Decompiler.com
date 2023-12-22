package j4;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public final class t3 extends m7 implements o8 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final t3 zzd;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    private r7 zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private w3 zzS;
    private p7 zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private boolean zzZ;
    private String zzaa;
    private boolean zzab;
    private p3 zzac;
    private String zzad;
    private r7 zzae;
    private String zzaf;
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    private r7 zzh;
    private r7 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        t3 t3Var = new t3();
        zzd = t3Var;
        m7.p(t3.class, t3Var);
    }

    public t3() {
        w8 w8Var = w8.f8543d;
        this.zzh = w8Var;
        this.zzi = w8Var;
        this.zzG = w8Var;
        this.zzH = "";
        this.zzL = "";
        this.zzO = "";
        this.zzP = "";
        this.zzR = "";
        this.zzT = n7.f8338d;
        this.zzW = "";
        this.zzX = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = w8Var;
        this.zzaf = "";
    }

    public static /* synthetic */ void A0(t3 t3Var, int i10) {
        t3Var.T0();
        t3Var.zzh.remove(i10);
    }

    public static /* synthetic */ void B0(t3 t3Var, int i10, c4 c4Var) {
        t3Var.U0();
        t3Var.zzi.set(i10, c4Var);
    }

    public static /* synthetic */ void C0(t3 t3Var, c4 c4Var) {
        t3Var.U0();
        t3Var.zzi.add(c4Var);
    }

    public static /* synthetic */ void D0(t3 t3Var, int i10) {
        t3Var.U0();
        t3Var.zzi.remove(i10);
    }

    public static /* synthetic */ void E0(t3 t3Var, long j10) {
        t3Var.zze |= 2;
        t3Var.zzj = j10;
    }

    public static /* synthetic */ void F0(t3 t3Var, long j10) {
        t3Var.zze |= 4;
        t3Var.zzk = j10;
    }

    public static /* synthetic */ void G0(t3 t3Var, long j10) {
        t3Var.zze |= 8;
        t3Var.zzl = j10;
    }

    public static s3 G1() {
        return (s3) zzd.i();
    }

    public static /* synthetic */ void H0(t3 t3Var, long j10) {
        t3Var.zze |= 16;
        t3Var.zzm = j10;
    }

    public static /* synthetic */ void I0(t3 t3Var) {
        t3Var.zze &= -17;
        t3Var.zzm = 0;
    }

    public static /* synthetic */ void J(t3 t3Var) {
        t3Var.zze &= Integer.MAX_VALUE;
        t3Var.zzO = zzd.zzO;
    }

    public static /* synthetic */ void J0(t3 t3Var, long j10) {
        t3Var.zze |= 32;
        t3Var.zzn = j10;
    }

    public static /* synthetic */ void K(t3 t3Var, int i10) {
        t3Var.zzf |= 2;
        t3Var.zzQ = i10;
    }

    public static /* synthetic */ void K0(t3 t3Var) {
        t3Var.zze &= -33;
        t3Var.zzn = 0;
    }

    public static /* synthetic */ void L(t3 t3Var, int i10, k3 k3Var) {
        t3Var.T0();
        t3Var.zzh.set(i10, k3Var);
    }

    public static /* synthetic */ void L0(t3 t3Var) {
        t3Var.zze |= 64;
        t3Var.zzo = "android";
    }

    public static /* synthetic */ void M(t3 t3Var, String str) {
        str.getClass();
        t3Var.zzf |= 4;
        t3Var.zzR = str;
    }

    public static /* synthetic */ void M0(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 128;
        t3Var.zzp = str;
    }

    public static void N(t3 t3Var, ArrayList arrayList) {
        int i10;
        p7 p7Var = t3Var.zzT;
        if (!((g6) p7Var).f8197a) {
            n7 n7Var = (n7) p7Var;
            int i11 = n7Var.f8340c;
            if (i11 == 0) {
                i10 = 10;
            } else {
                i10 = i11 + i11;
            }
            if (i10 >= i11) {
                t3Var.zzT = new n7(Arrays.copyOf(n7Var.f8339b, i10), n7Var.f8340c, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        f6.f(arrayList, t3Var.zzT);
    }

    public static /* synthetic */ void N0(t3 t3Var) {
        t3Var.zze &= -129;
        t3Var.zzp = zzd.zzp;
    }

    public static /* synthetic */ void O(t3 t3Var, k3 k3Var) {
        t3Var.T0();
        t3Var.zzh.add(k3Var);
    }

    public static /* synthetic */ void O0(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 256;
        t3Var.zzq = str;
    }

    public static /* synthetic */ void P(t3 t3Var, long j10) {
        t3Var.zzf |= 16;
        t3Var.zzU = j10;
    }

    public static /* synthetic */ void P0(t3 t3Var) {
        t3Var.zze &= -257;
        t3Var.zzq = zzd.zzq;
    }

    public static /* synthetic */ void Q(t3 t3Var, long j10) {
        t3Var.zzf |= 32;
        t3Var.zzV = j10;
    }

    public static /* synthetic */ void Q0(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 512;
        t3Var.zzr = str;
    }

    public static /* synthetic */ void R(t3 t3Var, String str) {
        t3Var.zzf |= 128;
        t3Var.zzX = str;
    }

    public static /* synthetic */ void R0(t3 t3Var, int i10) {
        t3Var.zze |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        t3Var.zzs = i10;
    }

    public static /* synthetic */ void T(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 2048;
        t3Var.zzt = str;
    }

    public static /* synthetic */ void U(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 4096;
        t3Var.zzu = str;
    }

    public static /* synthetic */ void V(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 8192;
        t3Var.zzv = str;
    }

    public static /* synthetic */ void W(t3 t3Var, long j10) {
        t3Var.zze |= 16384;
        t3Var.zzw = j10;
    }

    public static /* synthetic */ void X(t3 t3Var) {
        t3Var.zze |= 32768;
        t3Var.zzx = 79000;
    }

    public static /* synthetic */ void Y(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 65536;
        t3Var.zzy = str;
    }

    public static /* synthetic */ void Z(t3 t3Var) {
        t3Var.zze &= -65537;
        t3Var.zzy = zzd.zzy;
    }

    public static /* synthetic */ void a0(t3 t3Var, boolean z9) {
        t3Var.zze |= 131072;
        t3Var.zzz = z9;
    }

    public static /* synthetic */ void b0(t3 t3Var) {
        t3Var.zze &= -131073;
        t3Var.zzz = false;
    }

    public static /* synthetic */ void c0(t3 t3Var, String str) {
        t3Var.zze |= 262144;
        t3Var.zzA = str;
    }

    public static /* synthetic */ void d0(t3 t3Var) {
        t3Var.zze &= -262145;
        t3Var.zzA = zzd.zzA;
    }

    public static /* synthetic */ void e0(t3 t3Var, long j10) {
        t3Var.zze |= 524288;
        t3Var.zzB = j10;
    }

    public static /* synthetic */ void f0(t3 t3Var, int i10) {
        t3Var.zze |= 1048576;
        t3Var.zzC = i10;
    }

    public static /* synthetic */ void g0(t3 t3Var, String str) {
        t3Var.zze |= 2097152;
        t3Var.zzD = str;
    }

    public static /* synthetic */ void h0(t3 t3Var) {
        t3Var.zze &= -2097153;
        t3Var.zzD = zzd.zzD;
    }

    public static /* synthetic */ void i0(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 4194304;
        t3Var.zzE = str;
    }

    public static /* synthetic */ void j0(t3 t3Var) {
        t3Var.zze |= 8388608;
        t3Var.zzF = false;
    }

    public static /* synthetic */ void k0(t3 t3Var, ArrayList arrayList) {
        r7 r7Var = t3Var.zzG;
        if (!r7Var.zzc()) {
            t3Var.zzG = m7.m(r7Var);
        }
        f6.f(arrayList, t3Var.zzG);
    }

    public static void l0(t3 t3Var) {
        t3Var.zzG = w8.f8543d;
    }

    public static /* synthetic */ void m0(t3 t3Var, String str) {
        t3Var.zze |= 16777216;
        t3Var.zzH = str;
    }

    public static /* synthetic */ void n0(t3 t3Var, int i10) {
        t3Var.zze |= 33554432;
        t3Var.zzI = i10;
    }

    public static /* synthetic */ void o0(t3 t3Var) {
        t3Var.zze |= 1;
        t3Var.zzg = 1;
    }

    public static /* synthetic */ void p0(t3 t3Var) {
        t3Var.zze &= -268435457;
        t3Var.zzL = zzd.zzL;
    }

    public static /* synthetic */ void q0(t3 t3Var, long j10) {
        t3Var.zze |= 536870912;
        t3Var.zzM = j10;
    }

    public static /* synthetic */ void t0(t3 t3Var, ArrayList arrayList) {
        t3Var.T0();
        f6.f(arrayList, t3Var.zzh);
    }

    public static /* synthetic */ void u0(t3 t3Var, String str) {
        str.getClass();
        t3Var.zzf |= 8192;
        t3Var.zzad = str;
    }

    public static /* synthetic */ void v0(t3 t3Var) {
        t3Var.zzf &= -8193;
        t3Var.zzad = zzd.zzad;
    }

    public static /* synthetic */ void w0(t3 t3Var, Set set) {
        r7 r7Var = t3Var.zzae;
        if (!r7Var.zzc()) {
            t3Var.zzae = m7.m(r7Var);
        }
        f6.f(set, t3Var.zzae);
    }

    public static void x0(t3 t3Var) {
        t3Var.zzh = w8.f8543d;
    }

    public static /* synthetic */ void y0(t3 t3Var, String str) {
        str.getClass();
        t3Var.zzf |= 16384;
        t3Var.zzaf = str;
    }

    public static /* synthetic */ void z0(t3 t3Var, long j10) {
        t3Var.zzf |= 32768;
        t3Var.zzag = j10;
    }

    public final String A() {
        return this.zzD;
    }

    public final long A1() {
        return this.zzm;
    }

    public final String B() {
        return this.zzp;
    }

    public final long B1() {
        return this.zzk;
    }

    public final String C() {
        return this.zzo;
    }

    public final long C1() {
        return this.zzag;
    }

    public final String D() {
        return this.zzy;
    }

    public final long D1() {
        return this.zzj;
    }

    public final String E() {
        return this.zzad;
    }

    public final long E1() {
        return this.zzx;
    }

    public final String F() {
        return this.zzr;
    }

    public final k3 F1(int i10) {
        return (k3) this.zzh.get(i10);
    }

    public final r7 G() {
        return this.zzG;
    }

    public final r7 H() {
        return this.zzh;
    }

    public final r7 I() {
        return this.zzi;
    }

    public final c4 I1(int i10) {
        return (c4) this.zzi.get(i10);
    }

    public final String J1() {
        return this.zzR;
    }

    public final String K1() {
        return this.zzu;
    }

    public final String L1() {
        return this.zzA;
    }

    public final int S() {
        return this.zzI;
    }

    public final int S0() {
        return this.zzC;
    }

    public final void T0() {
        r7 r7Var = this.zzh;
        if (!r7Var.zzc()) {
            this.zzh = m7.m(r7Var);
        }
    }

    public final void U0() {
        r7 r7Var = this.zzi;
        if (!r7Var.zzc()) {
            this.zzi = m7.m(r7Var);
        }
    }

    public final boolean V0() {
        return (this.zze & 33554432) != 0;
    }

    public final boolean W0() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean X0() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 128) != 0;
    }

    public final boolean Z0() {
        return (this.zze & 524288) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean b1() {
        return (this.zze & 8) != 0;
    }

    public final boolean c1() {
        return (this.zze & 16384) != 0;
    }

    public final boolean d1() {
        return (this.zze & 131072) != 0;
    }

    public final boolean e1() {
        return (this.zze & 32) != 0;
    }

    public final boolean f1() {
        return (this.zze & 16) != 0;
    }

    public final boolean g1() {
        return (this.zze & 1) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean i1() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean k1() {
        return (this.zze & 4) != 0;
    }

    public final boolean l1() {
        return (this.zzf & 32768) != 0;
    }

    public final boolean m1() {
        return (this.zze & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0;
    }

    public final boolean n1() {
        return (this.zze & 2) != 0;
    }

    public final boolean o1() {
        return (this.zze & 32768) != 0;
    }

    public final int p1() {
        return this.zzh.size();
    }

    public final int q1() {
        return this.zzg;
    }

    public final boolean r0() {
        return this.zzz;
    }

    public final int r1() {
        return this.zzQ;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", k3.class, "zzi", c4.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", g3.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", c3.f8081a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i11 == 3) {
            return new t3();
        } else {
            if (i11 == 4) {
                return new s3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzd;
        }
    }

    public final boolean s0() {
        return this.zzF;
    }

    public final int s1() {
        return this.zzs;
    }

    public final String t() {
        return this.zzt;
    }

    public final int t1() {
        return this.zzi.size();
    }

    public final String u() {
        return this.zzv;
    }

    public final long u1() {
        return this.zzM;
    }

    public final String v() {
        return this.zzX;
    }

    public final long v1() {
        return this.zzB;
    }

    public final String w() {
        return this.zzq;
    }

    public final long w1() {
        return this.zzU;
    }

    public final String x() {
        return this.zzO;
    }

    public final long x1() {
        return this.zzl;
    }

    public final String y() {
        return this.zzH;
    }

    public final long y1() {
        return this.zzw;
    }

    public final String z() {
        return this.zzE;
    }

    public final long z1() {
        return this.zzn;
    }
}
