package n4;

import java.util.concurrent.Callable;

public final class s4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10114b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10115c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z4 f10116d;

    public s4(z4 z4Var, String str, String str2, String str3) {
        this.f10116d = z4Var;
        this.f10113a = str;
        this.f10114b = str2;
        this.f10115c = str3;
    }

    public final Object call() {
        this.f10116d.f10346a.b();
        i iVar = this.f10116d.f10346a.f10284c;
        w7.H(iVar);
        return iVar.I(this.f10113a, this.f10114b, this.f10115c);
    }
}
