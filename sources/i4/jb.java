package i4;

public final class jb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final jb zzb;
    /* access modifiers changed from: private */
    public e0 zzd = e0.f7269b;
    /* access modifiers changed from: private */
    public kc zze;

    static {
        jb jbVar = new jb();
        zzb = jbVar;
        c1.j(jb.class, jbVar);
    }

    public static ib v() {
        return (ib) zzb.q();
    }

    public static jb x(byte[] bArr, p0 p0Var) {
        return (jb) c1.u(zzb, bArr, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new jb();
        } else {
            if (i11 == 4) {
                return new ib(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final e0 y() {
        return this.zzd;
    }
}
