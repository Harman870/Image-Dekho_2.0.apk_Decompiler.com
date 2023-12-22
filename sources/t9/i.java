package t9;

public abstract class i implements x {

    /* renamed from: a  reason: collision with root package name */
    public final x f12052a;

    public i(x xVar) {
        if (xVar != null) {
            this.f12052a = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.f12052a.close();
    }

    public final z e() {
        return this.f12052a.e();
    }

    public void flush() {
        this.f12052a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f12052a.toString() + ")";
    }
}
