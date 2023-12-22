package n4;

public final class o5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10037b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10038c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f10039d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a6 f10040e;

    public o5(a6 a6Var, String str, String str2, Object obj, long j10) {
        this.f10040e = a6Var;
        this.f10036a = str;
        this.f10037b = str2;
        this.f10038c = obj;
        this.f10039d = j10;
    }

    public final void run() {
        a6 a6Var = this.f10040e;
        String str = this.f10036a;
        String str2 = this.f10037b;
        a6Var.y(this.f10039d, this.f10038c, str, str2);
    }
}
