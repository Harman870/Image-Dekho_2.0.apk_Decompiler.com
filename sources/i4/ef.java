package i4;

import com.google.android.gms.tasks.TaskCompletionSource;
import d3.f0;
import h6.b;
import i6.c0;
import i6.h0;
import i6.x;
import n3.w;
import r3.o;
import s3.a;
import u1.t;

public final class ef extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f7290n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final a f7291o;

    public ef(b bVar) {
        super(2);
        this.f7291o = c.a.n(bVar, (String) null);
    }

    public final String a() {
        switch (this.f7290n) {
            case 0:
                return "linkFederatedCredential";
            default:
                return "signInWithCredential";
        }
    }

    public final void b() {
        switch (this.f7290n) {
            case 0:
                h0 b10 = kf.b(this.f7236c, this.f7241h);
                ((x) this.f7238e).b(this.f7240g, b10);
                f(new c0(b10));
                return;
            default:
                h0 b11 = kf.b(this.f7236c, this.f7241h);
                ((x) this.f7238e).b(this.f7240g, b11);
                f(new c0(b11));
                return;
        }
    }

    public final void c(TaskCompletionSource taskCompletionSource, nf nfVar) {
        switch (this.f7290n) {
            case 0:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                de deVar = new de(this.f7237d.G(), (k) this.f7291o);
                bg bgVar = this.f7235b;
                nfVar.getClass();
                o.e(deVar.f7261a);
                o.h(deVar.f7262b);
                o.h(bgVar);
                t tVar = nfVar.f7533a;
                String str = deVar.f7261a;
                k kVar = deVar.f7262b;
                w wVar = new w(bgVar, nf.f7532b);
                tVar.getClass();
                o.e(str);
                o.h(kVar);
                tVar.b(str, new f0(tVar, kVar, wVar));
                return;
            default:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                nfVar.a((ie) this.f7291o, this.f7235b);
                return;
        }
    }

    public ef(b bVar, String str) {
        super(2);
        if (bVar != null) {
            this.f7291o = new ie(c.a.n(bVar, str));
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }
}
