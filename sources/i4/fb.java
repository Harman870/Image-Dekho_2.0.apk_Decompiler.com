package i4;

public final class fb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final fb zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private bb zze;
    /* access modifiers changed from: private */
    public e0 zzf;
    /* access modifiers changed from: private */
    public e0 zzg;

    static {
        fb fbVar = new fb();
        zzb = fbVar;
        c1.j(fb.class, fbVar);
    }

    public fb() {
        d0 d0Var = e0.f7269b;
        this.zzf = d0Var;
        this.zzg = d0Var;
    }

    public static fb A(e0 e0Var, p0 p0Var) {
        return (fb) c1.t(zzb, e0Var, p0Var);
    }

    public static /* synthetic */ void E(fb fbVar, bb bbVar) {
        bbVar.getClass();
        fbVar.zze = bbVar;
    }

    public static eb x() {
        return (eb) zzb.q();
    }

    public static fb z() {
        return zzb;
    }

    public final e0 B() {
        return this.zzf;
    }

    public final e0 C() {
        return this.zzg;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new fb();
        } else {
            if (i11 == 4) {
                return new eb(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int v() {
        return this.zzd;
    }

    public final bb w() {
        bb bbVar = this.zze;
        return bbVar == null ? bb.y() : bbVar;
    }
}
