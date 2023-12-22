package n4;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class c4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9656b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9657c;

    public /* synthetic */ c4(int i10, Object obj, String str) {
        this.f9655a = i10;
        this.f9657c = obj;
        this.f9656b = str;
    }

    public final Object call() {
        switch (this.f9655a) {
            case 0:
                h4 h4Var = (h4) this.f9657c;
                String str = this.f9656b;
                i iVar = h4Var.f10066b.f10284c;
                w7.H(iVar);
                d5 A = iVar.A(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                h4Var.f9600a.f9992g.k();
                hashMap.put("gmp_version", 79000L);
                if (A != null) {
                    String y9 = A.y();
                    if (y9 != null) {
                        hashMap.put("app_version", y9);
                    }
                    hashMap.put("app_version_int", Long.valueOf(A.t()));
                    A.f9674a.d().g();
                    hashMap.put("dynamite_version", Long.valueOf(A.f9691s));
                }
                return hashMap;
            default:
                ((z4) this.f9657c).f10346a.b();
                i iVar2 = ((z4) this.f9657c).f10346a.f10284c;
                w7.H(iVar2);
                return iVar2.K(this.f9656b);
        }
    }
}
