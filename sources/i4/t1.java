package i4;

public final class t1 implements a2 {

    /* renamed from: a  reason: collision with root package name */
    public final a2[] f7678a;

    public t1(a2... a2VarArr) {
        this.f7678a = a2VarArr;
    }

    public final z1 a(Class cls) {
        a2[] a2VarArr = this.f7678a;
        for (int i10 = 0; i10 < 2; i10++) {
            a2 a2Var = a2VarArr[i10];
            if (a2Var.b(cls)) {
                return a2Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean b(Class cls) {
        a2[] a2VarArr = this.f7678a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (a2VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
