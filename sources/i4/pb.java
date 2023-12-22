package i4;

public final class pb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final pb zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        pb pbVar = new pb();
        zzb = pbVar;
        c1.j(pb.class, pbVar);
    }

    public static ob w() {
        return (ob) zzb.q();
    }

    public static pb y() {
        return zzb;
    }

    public final int A() {
        int i10 = this.zzd;
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
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new pb();
        } else {
            if (i11 == 4) {
                return new ob(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int v() {
        return this.zze;
    }
}
