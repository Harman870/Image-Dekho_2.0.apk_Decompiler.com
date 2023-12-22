package i4;

import c.a;
import java.security.GeneralSecurityException;

public final class j8 extends l7 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7407d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j8(int r5) {
        /*
            r4 = this;
            java.lang.Class<i4.g4> r0 = i4.g4.class
            r4.f7407d = r5
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x0017
            i4.w7[] r5 = new i4.w7[r2]
            i4.d6 r3 = new i4.d6
            r3.<init>(r2, r0)
            r5[r1] = r3
            java.lang.Class<i4.i9> r0 = i4.i9.class
            r4.<init>(r0, r5)
            return
        L_0x0017:
            i4.w7[] r5 = new i4.w7[r2]
            i4.d6 r2 = new i4.d6
            r3 = 2
            r2.<init>(r3, r0)
            r5[r1] = r2
            java.lang.Class<i4.lb> r0 = i4.lb.class
            r4.<init>(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.j8.<init>(int):void");
    }

    public static final void h(lb lbVar) {
        vd.c(lbVar.v());
        if (lbVar.B().g() >= 16) {
            k(lbVar.A());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static j7 i(int i10, int i11, int i12, int i13) {
        mb w = nb.w();
        ob w10 = pb.w();
        w10.j();
        ((pb) w10.f7833b).zzd = a.m(i12);
        w10.j();
        ((pb) w10.f7833b).zze = i11;
        w.j();
        ((nb) w.f7833b).zzd = (pb) w10.d();
        w.j();
        ((nb) w.f7833b).zze = i10;
        return new j7(i13, (nb) w.d());
    }

    public static void j(m9 m9Var) {
        if (m9Var.v() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (m9Var.v() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void k(pb pbVar) {
        if (pbVar.v() >= 10) {
            int A = pbVar.A() - 2;
            if (A != 1) {
                if (A != 2) {
                    if (A != 3) {
                        if (A != 4) {
                            if (A != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (pbVar.v() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (pbVar.v() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (pbVar.v() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (pbVar.v() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (pbVar.v() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final k7 a() {
        switch (this.f7407d) {
            case 0:
                return new i8();
            default:
                return new q8();
        }
    }

    public final int b() {
        return 2;
    }

    public final b2 c(e0 e0Var) {
        switch (this.f7407d) {
            case 0:
                return i9.y(e0Var, p0.f7582b);
            default:
                return lb.z(e0Var, p0.f7582b);
        }
    }

    public final String d() {
        switch (this.f7407d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    public final void e(b2 b2Var) {
        switch (this.f7407d) {
            case 0:
                i9 i9Var = (i9) b2Var;
                vd.c(i9Var.v());
                if (i9Var.A().g() == 32) {
                    j(i9Var.z());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                h((lb) b2Var);
                return;
        }
    }

    public final int f() {
        switch (this.f7407d) {
            case 1:
                return 2;
            default:
                return 1;
        }
    }
}
