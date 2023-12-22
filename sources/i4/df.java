package i4;

import androidx.fragment.app.g0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.c;
import h6.q;
import i6.c0;
import i6.h0;
import i6.x;
import n3.w;
import r3.o;
import s3.a;
import u1.t;

public final class df extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f7263n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final a f7264o;

    public df(c cVar) {
        super(2);
        this.f7264o = cVar;
        o.f("email cannot be null", cVar.f6902a);
        o.f("password cannot be null", cVar.f6903b);
    }

    public final String a() {
        switch (this.f7263n) {
            case 0:
                return "linkEmailAuthCredential";
            default:
                return "reauthenticateWithPhoneCredentialWithData";
        }
    }

    public final void b() {
        switch (this.f7263n) {
            case 0:
                h0 b10 = kf.b(this.f7236c, this.f7241h);
                ((x) this.f7238e).b(this.f7240g, b10);
                f(new c0(b10));
                return;
            default:
                h0 b11 = kf.b(this.f7236c, this.f7241h);
                if (this.f7237d.A().equalsIgnoreCase(b11.f7897b.f7885a)) {
                    ((x) this.f7238e).b(this.f7240g, b11);
                    f(new c0(b11));
                    return;
                }
                e(new Status(17024, (String) null));
                return;
        }
    }

    public final void c(TaskCompletionSource taskCompletionSource, nf nfVar) {
        switch (this.f7263n) {
            case 0:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                c cVar = (c) this.f7264o;
                String str = cVar.f6902a;
                String str2 = cVar.f6903b;
                o.e(str2);
                be beVar = new be(str, str2, this.f7237d.G());
                bg bgVar = this.f7235b;
                nfVar.getClass();
                o.e(beVar.f7211a);
                o.e(beVar.f7212b);
                o.e(beVar.f7213c);
                o.h(bgVar);
                t tVar = nfVar.f7533a;
                String str3 = beVar.f7211a;
                String str4 = beVar.f7212b;
                String str5 = beVar.f7213c;
                w wVar = new w(bgVar, nf.f7532b);
                tVar.getClass();
                o.e(str3);
                o.e(str4);
                o.e(str5);
                tVar.b(str5, new g0(tVar, str3, str4, wVar));
                return;
            default:
                this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
                nfVar.d((oe) this.f7264o, this.f7235b);
                return;
        }
    }

    public df(q qVar, String str) {
        super(2);
        if (qVar != null) {
            qVar.f6918e = false;
            this.f7264o = new oe(qVar, str);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }
}
