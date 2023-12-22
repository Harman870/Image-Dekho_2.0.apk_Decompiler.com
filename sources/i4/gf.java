package i4;

import com.google.android.gms.tasks.TaskCompletionSource;
import h6.c;
import h6.l;
import i6.c0;
import i6.h0;
import i6.x;
import s3.a;

public final class gf extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f7332n;

    /* renamed from: o  reason: collision with root package name */
    public final a f7333o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gf(c cVar, int i10) {
        super(2);
        this.f7332n = i10;
        if (i10 != 1) {
            this.f7333o = cVar;
            return;
        }
        super(2);
        this.f7333o = new me(cVar);
    }

    public final String a() {
        switch (this.f7332n) {
            case 0:
                return "linkEmailAuthCredential";
            default:
                return "sendSignInLinkToEmail";
        }
    }

    public final void b() {
        switch (this.f7332n) {
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
        switch (this.f7332n) {
            case 0:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                c cVar = (c) this.f7333o;
                l lVar = this.f7237d;
                cVar.getClass();
                cVar.f6905d = lVar.G();
                cVar.f6906e = true;
                nfVar.c(new me(cVar), this.f7235b);
                return;
            default:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                nfVar.c((me) this.f7333o, this.f7235b);
                return;
        }
    }
}
