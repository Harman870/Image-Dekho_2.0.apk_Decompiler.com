package n4;

import java.util.concurrent.Callable;

public final class q4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10076b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10077c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z4 f10078d;

    public q4(z4 z4Var, String str, String str2, String str3) {
        this.f10078d = z4Var;
        this.f10075a = str;
        this.f10076b = str2;
        this.f10077c = str3;
    }

    public final Object call() {
        this.f10078d.f10346a.b();
        i iVar = this.f10078d.f10346a.f10284c;
        w7.H(iVar);
        return iVar.L(this.f10075a, this.f10076b, this.f10077c);
    }
}
