package n4;

public final class p0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10049a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f10050b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r2 f10051c;

    public /* synthetic */ p0(r2 r2Var, long j10, int i10) {
        this.f10049a = i10;
        this.f10051c = r2Var;
        this.f10050b = j10;
    }

    public final void run() {
        switch (this.f10049a) {
            case 0:
                ((q1) this.f10051c).m(this.f10050b);
                return;
            default:
                ((l6) this.f10051c).f9600a.l().j(this.f10050b);
                ((l6) this.f10051c).f9921e = null;
                return;
        }
    }
}
