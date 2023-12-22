package i4;

public final class hb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final hb zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public e0 zzf = e0.f7269b;

    static {
        hb hbVar = new hb();
        zzb = hbVar;
        c1.j(hb.class, hbVar);
    }

    public static void C(hb hbVar) {
        hbVar.zzd = 2;
    }

    public static gb v() {
        return (gb) zzb.q();
    }

    public static hb x() {
        return zzb;
    }

    public final int A() {
        int i10 = this.zzd;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int B() {
        int i10 = this.zze;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 1) {
                i11 = 3;
            } else if (i10 != 2) {
                i11 = 5;
                if (i10 != 3) {
                    i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
                }
            } else {
                i11 = 4;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new hb();
        } else {
            if (i11 == 4) {
                return new gb(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final e0 y() {
        return this.zzf;
    }
}
