package j4;

public final class r3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final r3 zza;
    private r7 zzd = w8.f8543d;

    static {
        r3 r3Var = new r3();
        zza = r3Var;
        m7.p(r3.class, r3Var);
    }

    public static q3 t() {
        return (q3) zza.i();
    }

    public static /* synthetic */ void x(r3 r3Var, t3 t3Var) {
        r7 r7Var = r3Var.zzd;
        if (!r7Var.zzc()) {
            r3Var.zzd = m7.m(r7Var);
        }
        r3Var.zzd.add(t3Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", t3.class});
        } else if (i11 == 3) {
            return new r3();
        } else {
            if (i11 == 4) {
                return new q3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final t3 v() {
        return (t3) this.zzd.get(0);
    }

    public final r7 w() {
        return this.zzd;
    }
}
