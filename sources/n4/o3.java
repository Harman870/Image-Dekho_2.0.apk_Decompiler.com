package n4;

public abstract class o3 extends r2 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f10031b;

    public o3(n4 n4Var) {
        super(n4Var);
        this.f9600a.E++;
    }

    public final void h() {
        if (!this.f10031b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i() {
        if (this.f10031b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!j()) {
            this.f9600a.b();
            this.f10031b = true;
        }
    }

    public abstract boolean j();
}
