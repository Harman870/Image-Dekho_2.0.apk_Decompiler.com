package t9;

public abstract class j implements y {

    /* renamed from: a  reason: collision with root package name */
    public final y f12053a;

    public j(y yVar) {
        if (yVar != null) {
            this.f12053a = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.f12053a.close();
    }

    public final z e() {
        return this.f12053a.e();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f12053a.toString() + ")";
    }
}
