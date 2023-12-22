package k2;

public abstract class d {

    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f9052a;

        public final void a() {
            if (this.f9052a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
