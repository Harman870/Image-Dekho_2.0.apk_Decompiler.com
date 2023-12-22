package n4;

import java.util.concurrent.Callable;

public final class r4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10098c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z4 f10099d;

    public r4(z4 z4Var, String str, String str2, String str3) {
        this.f10099d = z4Var;
        this.f10096a = str;
        this.f10097b = str2;
        this.f10098c = str3;
    }

    public final Object call() {
        this.f10099d.f10346a.b();
        i iVar = this.f10099d.f10346a.f10284c;
        w7.H(iVar);
        return iVar.I(this.f10096a, this.f10097b, this.f10098c);
    }
}
