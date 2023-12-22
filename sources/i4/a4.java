package i4;

public final class a4 {

    /* renamed from: a  reason: collision with root package name */
    public final bc f7180a;

    public a4(bc bcVar) {
        this.f7180a = bcVar;
    }

    public static a4 a(String str, byte[] bArr, int i10) {
        ac v10 = bc.v();
        v10.l(str);
        d0 d0Var = e0.f7269b;
        v10.m(e0.q(bArr, 0, bArr.length));
        int i11 = i10 - 1;
        int i12 = 2;
        if (i11 != 0) {
            if (i11 == 1) {
                i12 = 3;
            } else if (i11 != 2) {
                i12 = 5;
            } else {
                i12 = 4;
            }
        }
        v10.k(i12);
        return new a4((bc) v10.d());
    }
}
