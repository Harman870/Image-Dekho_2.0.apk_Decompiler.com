package x8;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f13003a;

    public h(Class cls) {
        f.f(cls, "jClass");
        this.f13003a = cls;
    }

    public final Class<?> a() {
        return this.f13003a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || !f.a(this.f13003a, ((h) obj).f13003a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13003a.hashCode();
    }

    public final String toString() {
        return this.f13003a.toString() + " (Kotlin reflection is not available)";
    }
}
