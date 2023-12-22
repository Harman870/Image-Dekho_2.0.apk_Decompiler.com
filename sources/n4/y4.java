package n4;

public final class y4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10328c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f10329d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z4 f10330e;

    public y4(z4 z4Var, String str, String str2, String str3, long j10) {
        this.f10330e = z4Var;
        this.f10326a = str;
        this.f10327b = str2;
        this.f10328c = str3;
        this.f10329d = j10;
    }

    public final void run() {
        String str = this.f10326a;
        if (str == null) {
            w7 w7Var = this.f10330e.f10346a;
            String str2 = this.f10327b;
            w7Var.d().g();
            String str3 = w7Var.D;
            if (str3 == null || str3.equals(str2)) {
                w7Var.D = str2;
                w7Var.C = null;
                return;
            }
            return;
        }
        g6 g6Var = new g6(this.f10329d, this.f10328c, str);
        w7 w7Var2 = this.f10330e.f10346a;
        String str4 = this.f10327b;
        w7Var2.d().g();
        String str5 = w7Var2.D;
        if (str5 != null) {
            boolean equals = str5.equals(str4);
        }
        w7Var2.D = str4;
        w7Var2.C = g6Var;
    }
}
