package i4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.b;
import h6.q;
import i6.c0;
import i6.h0;
import i6.x;
import r3.o;
import s3.a;

public final class hf extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f7371n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final a f7372o;

    public hf(b bVar, String str) {
        super(2);
        if (bVar != null) {
            k n2 = c.a.n(bVar, str);
            n2.f7421j = false;
            this.f7372o = new ie(n2);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    public final String a() {
        switch (this.f7371n) {
            case 0:
                return "reauthenticateWithCredentialWithData";
            default:
                return "signInWithPhoneNumber";
        }
    }

    public final void b() {
        switch (this.f7371n) {
            case 0:
                h0 b10 = kf.b(this.f7236c, this.f7241h);
                if (this.f7237d.A().equalsIgnoreCase(b10.f7897b.f7885a)) {
                    ((x) this.f7238e).b(this.f7240g, b10);
                    f(new c0(b10));
                    return;
                }
                e(new Status(17024, (String) null));
                return;
            default:
                h0 b11 = kf.b(this.f7236c, this.f7241h);
                ((x) this.f7238e).b(this.f7240g, b11);
                f(new c0(b11));
                return;
        }
    }

    public final void c(TaskCompletionSource taskCompletionSource, nf nfVar) {
        switch (this.f7371n) {
            case 0:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                nfVar.a((ie) this.f7372o, this.f7235b);
                return;
            default:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                nfVar.d((oe) this.f7372o, this.f7235b);
                return;
        }
    }

    public hf(q qVar, String str) {
        super(2);
        o.h(qVar);
        this.f7372o = new oe(qVar, str);
    }
}
