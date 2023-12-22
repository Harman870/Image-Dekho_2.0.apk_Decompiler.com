package i4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.c;
import i6.c0;
import i6.h0;
import i6.x;

/* renamed from: i4.if  reason: invalid class name */
public final class Cif extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final me f7387n;

    public Cif(c cVar) {
        super(2);
        this.f7387n = new me(cVar);
    }

    public final String a() {
        return "reauthenticateWithEmailLinkWithData";
    }

    public final void b() {
        h0 b10 = kf.b(this.f7236c, this.f7241h);
        if (this.f7237d.A().equalsIgnoreCase(b10.f7897b.f7885a)) {
            ((x) this.f7238e).b(this.f7240g, b10);
            f(new c0(b10));
            return;
        }
        e(new Status(17024, (String) null));
    }

    public final void c(TaskCompletionSource taskCompletionSource, nf nfVar) {
        this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
        nfVar.c(this.f7387n, this.f7235b);
    }
}
