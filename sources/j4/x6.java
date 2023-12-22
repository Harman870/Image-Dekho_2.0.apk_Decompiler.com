package j4;

public final class x6 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8552a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8553b;

    public x6(int i10, Object obj) {
        this.f8552a = obj;
        this.f8553b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return this.f8552a == x6Var.f8552a && this.f8553b == x6Var.f8553b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8552a) * 65535) + this.f8553b;
    }
}
