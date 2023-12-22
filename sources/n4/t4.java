package n4;

public final class t4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10135a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g8 f10136b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z4 f10137c;

    public /* synthetic */ t4(z4 z4Var, g8 g8Var, int i10) {
        this.f10135a = i10;
        this.f10137c = z4Var;
        this.f10136b = g8Var;
    }

    public final void run() {
        switch (this.f10135a) {
            case 0:
                this.f10137c.f10346a.b();
                this.f10137c.f10346a.p(this.f10136b);
                return;
            default:
                this.f10137c.f10346a.b();
                this.f10137c.f10346a.m(this.f10136b);
                return;
        }
    }
}
