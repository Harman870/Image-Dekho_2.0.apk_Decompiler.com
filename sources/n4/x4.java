package n4;

public final class x4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z7 f10310a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g8 f10311b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z4 f10312c;

    public x4(z4 z4Var, z7 z7Var, g8 g8Var) {
        this.f10312c = z4Var;
        this.f10310a = z7Var;
        this.f10311b = g8Var;
    }

    public final void run() {
        this.f10312c.f10346a.b();
        if (this.f10310a.x() == null) {
            this.f10312c.f10346a.o(this.f10310a.f10354b, this.f10311b);
        } else {
            this.f10312c.f10346a.s(this.f10310a, this.f10311b);
        }
    }
}
