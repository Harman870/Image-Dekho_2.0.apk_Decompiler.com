package i4;

public final class bb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final bb zzb;
    /* access modifiers changed from: private */
    public hb zzd;
    /* access modifiers changed from: private */
    public wa zze;
    private int zzf;

    static {
        bb bbVar = new bb();
        zzb = bbVar;
        c1.j(bb.class, bbVar);
    }

    public static void D(bb bbVar, int i10) {
        if (i10 != 1) {
            bbVar.zzf = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static za w() {
        return (za) zzb.q();
    }

    public static bb y() {
        return zzb;
    }

    public final int C() {
        int i10 = this.zzf;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
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
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new bb();
        } else {
            if (i11 == 4) {
                return new za(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final wa v() {
        wa waVar = this.zze;
        return waVar == null ? wa.x() : waVar;
    }

    public final hb z() {
        hb hbVar = this.zzd;
        return hbVar == null ? hb.x() : hbVar;
    }
}
