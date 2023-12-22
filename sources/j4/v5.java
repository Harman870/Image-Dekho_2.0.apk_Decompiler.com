package j4;

import javax.annotation.CheckForNull;

public final class v5 extends x5 {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f8506c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f8507d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x5 f8508e;

    public v5(x5 x5Var, int i10, int i11) {
        this.f8508e = x5Var;
        this.f8506c = i10;
        this.f8507d = i11;
    }

    public final int d() {
        return this.f8508e.g() + this.f8506c + this.f8507d;
    }

    public final int g() {
        return this.f8508e.g() + this.f8506c;
    }

    public final Object get(int i10) {
        j5.a(i10, this.f8507d);
        return this.f8508e.get(i10 + this.f8506c);
    }

    @CheckForNull
    public final Object[] h() {
        return this.f8508e.h();
    }

    /* renamed from: i */
    public final x5 subList(int i10, int i11) {
        j5.b(i10, i11, this.f8507d);
        x5 x5Var = this.f8508e;
        int i12 = this.f8506c;
        return x5Var.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.f8507d;
    }
}
