package n4;

import java.util.concurrent.Callable;

public final class p4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10056b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10057c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z4 f10058d;

    public p4(z4 z4Var, String str, String str2, String str3) {
        this.f10058d = z4Var;
        this.f10055a = str;
        this.f10056b = str2;
        this.f10057c = str3;
    }

    public final Object call() {
        this.f10058d.f10346a.b();
        i iVar = this.f10058d.f10346a.f10284c;
        w7.H(iVar);
        return iVar.L(this.f10055a, this.f10056b, this.f10057c);
    }
}
