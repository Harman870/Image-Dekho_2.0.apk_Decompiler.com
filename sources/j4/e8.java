package j4;

public final class e8 implements m8 {

    /* renamed from: a  reason: collision with root package name */
    public final m8[] f8123a;

    public e8(m8... m8VarArr) {
        this.f8123a = m8VarArr;
    }

    public final l8 a(Class cls) {
        m8[] m8VarArr = this.f8123a;
        for (int i10 = 0; i10 < 2; i10++) {
            m8 m8Var = m8VarArr[i10];
            if (m8Var.b(cls)) {
                return m8Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean b(Class cls) {
        m8[] m8VarArr = this.f8123a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (m8VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
