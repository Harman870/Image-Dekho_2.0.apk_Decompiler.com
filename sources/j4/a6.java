package j4;

public final class a6 extends x5 {

    /* renamed from: e  reason: collision with root package name */
    public static final a6 f8042e = new a6(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f8043c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f8044d;

    public a6(Object[] objArr, int i10) {
        this.f8043c = objArr;
        this.f8044d = i10;
    }

    public final void a(Object[] objArr) {
        System.arraycopy(this.f8043c, 0, objArr, 0, this.f8044d);
    }

    public final int d() {
        return this.f8044d;
    }

    public final int g() {
        return 0;
    }

    public final Object get(int i10) {
        j5.a(i10, this.f8044d);
        Object obj = this.f8043c[i10];
        obj.getClass();
        return obj;
    }

    public final Object[] h() {
        return this.f8043c;
    }

    public final int size() {
        return this.f8044d;
    }
}
