package n4;

public abstract class q7 extends p7 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f10084c;

    public q7(w7 w7Var) {
        super(w7Var);
        this.f10066b.f10297q++;
    }

    public final void h() {
        if (!this.f10084c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i() {
        if (!this.f10084c) {
            j();
            this.f10066b.f10298r++;
            this.f10084c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void j();
}
