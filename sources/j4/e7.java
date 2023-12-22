package j4;

public enum e7 {
    DOUBLE_LIST_PACKED(35, 3, r7),
    SINT64_LIST_PACKED(48, 3, r9);
    

    /* renamed from: d  reason: collision with root package name */
    public static final e7[] f8120d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f8122a;

    /* access modifiers changed from: public */
    static {
        int i10;
        f8120d = new e7[r1];
        for (e7 e7Var : values()) {
            f8120d[e7Var.f8122a] = e7Var;
        }
    }

    /* access modifiers changed from: public */
    e7(int i10, int i11, v7 v7Var) {
        this.f8122a = i10;
        v7 v7Var2 = v7.VOID;
        int i12 = i11 - 1;
        if (i12 == 1 || i12 == 3) {
            v7Var.getClass();
        }
        if (i11 == 1) {
            v7Var.ordinal();
        }
    }

    public final int zza() {
        return this.f8122a;
    }
}
