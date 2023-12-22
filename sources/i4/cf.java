package i4;

import android.text.TextUtils;
import androidx.activity.result.c;
import c2.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import i6.l;
import i6.x;
import n3.w;
import r3.o;
import u1.t;

public final class cf extends cg {

    /* renamed from: n  reason: collision with root package name */
    public final zd f7233n;

    public cf(String str) {
        super(1);
        o.f("refresh token cannot be null", str);
        this.f7233n = new zd(str);
    }

    public final String a() {
        return "getAccessToken";
    }

    public final void b() {
        if (TextUtils.isEmpty(this.f7240g.f7776a)) {
            wg wgVar = this.f7240g;
            String str = this.f7233n.f7845a;
            wgVar.getClass();
            o.e(str);
            wgVar.f7776a = str;
        }
        ((x) this.f7238e).b(this.f7240g, this.f7237d);
        f(l.a(this.f7240g.f7777b));
    }

    public final void c(TaskCompletionSource taskCompletionSource, nf nfVar) {
        this.f7245m = new h6((Object) this, (Object) taskCompletionSource);
        zd zdVar = this.f7233n;
        bg bgVar = this.f7235b;
        nfVar.getClass();
        o.h(zdVar);
        o.h(bgVar);
        o.e(zdVar.f7845a);
        t tVar = nfVar.f7533a;
        String str = zdVar.f7845a;
        w wVar = new w(bgVar, nf.f7532b);
        tVar.getClass();
        o.e(str);
        ((c) tVar.f12166a).u(new h6(str), new b(wVar));
    }
}
