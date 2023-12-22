package i4;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7542a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7543b;

    public o0(int i10, Object obj) {
        this.f7542a = obj;
        this.f7543b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f7542a == o0Var.f7542a && this.f7543b == o0Var.f7543b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7542a) * 65535) + this.f7543b;
    }
}
