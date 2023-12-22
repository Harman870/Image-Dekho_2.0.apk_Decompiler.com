package i4;

public final class db extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final db zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public fb zze;
    /* access modifiers changed from: private */
    public e0 zzf = e0.f7269b;

    static {
        db dbVar = new db();
        zzb = dbVar;
        c1.j(db.class, dbVar);
    }

    public static cb w() {
        return (cb) zzb.q();
    }

    public static db y(e0 e0Var, p0 p0Var) {
        return (db) c1.t(zzb, e0Var, p0Var);
    }

    public final e0 A() {
        return this.zzf;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new db();
        } else {
            if (i11 == 4) {
                return new cb(0);
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

    public final fb z() {
        fb fbVar = this.zze;
        return fbVar == null ? fb.z() : fbVar;
    }
}
