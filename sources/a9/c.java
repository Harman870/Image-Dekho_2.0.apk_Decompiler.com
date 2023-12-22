package a9;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f227d = new c(1, 0);

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.f220a == cVar.f220a && this.f221b == cVar.f221b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f220a * 31) + this.f221b;
    }

    public final boolean isEmpty() {
        if (this.f220a > this.f221b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f220a + ".." + this.f221b;
    }
}
