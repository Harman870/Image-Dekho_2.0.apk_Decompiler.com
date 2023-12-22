package n4;

public abstract class b5 extends a5 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f9629b;

    public b5(n4 n4Var) {
        super(n4Var);
        this.f9600a.E++;
    }

    public abstract boolean h();

    public final void i() {
        if (!this.f9629b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f9629b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!h()) {
            this.f9600a.b();
            this.f9629b = true;
        }
    }
}
