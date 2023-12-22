package n4;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.v0;
import j4.cd;
import j4.dd;
import j4.x2;
import n3.w;

public final class r7 extends p7 {
    public r7(w7 w7Var) {
        super(w7Var);
    }

    public final w h(String str) {
        String str2;
        ((dd) cd.f8091b.f8092a.zza()).zza();
        w wVar = null;
        if (this.f9600a.f9992g.o((String) null, w2.f10227l0)) {
            this.f9600a.a().f9835n.a("sgtm feature flag enabled.");
            i iVar = this.f10066b.f10284c;
            w7.H(iVar);
            d5 A = iVar.A(str);
            if (A == null) {
                return new w(i(str));
            }
            A.f9674a.d().g();
            if (A.f9693v) {
                this.f9600a.a().f9835n.a("sgtm upload enabled in manifest.");
                h4 h4Var = this.f10066b.f10282a;
                w7.H(h4Var);
                x2 q10 = h4Var.q(A.w());
                if (q10 != null) {
                    String C = q10.C();
                    if (!TextUtils.isEmpty(C)) {
                        String B = q10.B();
                        g3 g3Var = this.f9600a.a().f9835n;
                        if (true != TextUtils.isEmpty(B)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        g3Var.c("sgtm configured with upload_url, server_info", C, str2);
                        if (TextUtils.isEmpty(B)) {
                            this.f9600a.getClass();
                            wVar = new w(C);
                        } else {
                            wVar = new w((Object) C, (Object) v0.c("x-google-sgtm-server-info", B));
                        }
                    }
                }
            }
            if (wVar != null) {
                return wVar;
            }
        }
        return new w(i(str));
    }

    public final String i(String str) {
        h4 h4Var = this.f10066b.f10282a;
        w7.H(h4Var);
        h4Var.g();
        h4Var.m(str);
        String str2 = (String) h4Var.f9803l.getOrDefault(str, null);
        if (TextUtils.isEmpty(str2)) {
            return (String) w2.f10237r.a((Object) null);
        }
        Uri parse = Uri.parse((String) w2.f10237r.a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(str2 + "." + authority);
        return buildUpon.build().toString();
    }
}
