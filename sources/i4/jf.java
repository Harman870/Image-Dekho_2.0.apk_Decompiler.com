package i4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import i6.c0;
import i6.h0;
import i6.x;
import r3.o;

public final class jf extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final ke f7411n;

    public jf(String str, String str2, String str3) {
        super(2);
        o.f("email cannot be null or empty", str);
        o.f("password cannot be null or empty", str2);
        this.f7411n = new ke(str, str2, str3);
    }

    public final String a() {
        return "reauthenticateWithEmailPasswordWithData";
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
        nfVar.b(this.f7411n, this.f7235b);
    }
}
