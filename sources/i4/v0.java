package i4;

public enum v0 {
    DOUBLE_LIST_PACKED(35, 3, r7),
    SINT64_LIST_PACKED(48, 3, r9);
    

    /* renamed from: d  reason: collision with root package name */
    public static final v0[] f7732d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f7734a;

    /* access modifiers changed from: public */
    static {
        int i10;
        f7732d = new v0[r1];
        for (v0 v0Var : values()) {
            f7732d[v0Var.f7734a] = v0Var;
        }
    }

    /* access modifiers changed from: public */
    v0(int i10, int i11, j1 j1Var) {
        this.f7734a = i10;
        j1 j1Var2 = j1.VOID;
        int i12 = i11 - 1;
        if (i12 == 1 || i12 == 3) {
            j1Var.getClass();
        }
        if (i11 == 1) {
            j1Var.ordinal();
        }
    }

    public final int zza() {
        return this.f7734a;
    }
}
