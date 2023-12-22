package i4;

import android.text.TextUtils;
import h6.b0;
import i6.h;
import n3.w;
import u1.t;

public final class ve implements fg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7745a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f7746b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f7747c;

    public /* synthetic */ ve(t tVar, w wVar, int i10) {
        this.f7745a = i10;
        this.f7747c = tVar;
        this.f7746b = wVar;
    }

    public final void c(xf xfVar) {
        switch (this.f7745a) {
            case 0:
                o oVar = (o) xfVar;
                if (!TextUtils.isEmpty(oVar.f7541e)) {
                    this.f7746b.e(new te(oVar.f7541e, oVar.f7540d, (b0) null));
                    return;
                }
                this.f7747c.e(new wg(oVar.f7538b, oVar.f7537a, Long.valueOf(oVar.f7539c), "Bearer"), (String) null, (String) null, Boolean.FALSE, (b0) null, this.f7746b, this);
                return;
            default:
                q qVar = (q) xfVar;
                this.f7747c.e(new wg(qVar.f7601b, qVar.f7600a, Long.valueOf(qVar.f7602c), "Bearer"), (String) null, (String) null, Boolean.valueOf(qVar.f7603d), (b0) null, this.f7746b, this);
                return;
        }
    }

    public final void zza(String str) {
        switch (this.f7745a) {
            case 0:
                this.f7746b.f(h.a(str));
                return;
            default:
                this.f7746b.f(h.a(str));
                return;
        }
    }
}
