package i4;

import com.google.android.gms.tasks.TaskCompletionSource;
import h6.q;
import i6.c0;
import i6.h0;
import i6.x;
import n3.w;
import r3.o;
import s3.a;
import u1.t;

public final class ff extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f7315n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final a f7316o;

    public ff(q qVar) {
        super(2);
        this.f7316o = qVar;
    }

    public final String a() {
        switch (this.f7315n) {
            case 0:
                return "linkPhoneAuthCredential";
            default:
                return "signInWithEmailAndPassword";
        }
    }

    public final void b() {
        switch (this.f7315n) {
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
        switch (this.f7315n) {
            case 0:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                fe feVar = new fe((q) this.f7316o, this.f7237d.G());
                bg bgVar = this.f7235b;
                nfVar.getClass();
                o.h(bgVar);
                q qVar = feVar.f7314b;
                o.h(qVar);
                String str = feVar.f7313a;
                o.e(str);
                t tVar = nfVar.f7533a;
                p H = y3.a.H(qVar);
                w wVar = new w(bgVar, nf.f7532b);
                tVar.getClass();
                o.e(str);
                tVar.b(str, new ze(tVar, H, wVar));
                return;
            default:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                nfVar.b((ke) this.f7316o, this.f7235b);
                return;
        }
    }

    public ff(String str, String str2, String str3) {
        super(2);
        o.f("email cannot be null or empty", str);
        o.f("password cannot be null or empty", str2);
        this.f7316o = new ke(str, str2, str3);
    }
}
