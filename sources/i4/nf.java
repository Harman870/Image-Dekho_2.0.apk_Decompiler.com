package i4;

import android.content.Context;
import androidx.activity.result.c;
import androidx.appcompat.widget.l;
import c6.f;
import h6.q;
import n3.w;
import n3.x;
import r3.o;
import u1.t;
import u3.a;

public final class nf {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7532b = new a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a  reason: collision with root package name */
    public final t f7533a;

    public nf(f fVar) {
        o.h(fVar);
        fVar.a();
        Context context = fVar.f2494a;
        o.h(context);
        this.f7533a = new t(new zf(fVar, yf.c()));
        new jg(context);
    }

    public final void a(ie ieVar, bg bgVar) {
        o.h(ieVar);
        o.h(ieVar.f7386a);
        o.h(bgVar);
        t tVar = this.f7533a;
        k kVar = ieVar.f7386a;
        w wVar = new w(bgVar, f7532b);
        tVar.getClass();
        o.h(kVar);
        kVar.f7425o = true;
        ((c) tVar.f12166a).x(kVar, new b7((Object) tVar, (Object) wVar));
    }

    public final void b(ke keVar, bg bgVar) {
        o.h(keVar);
        o.e(keVar.f7456a);
        o.e(keVar.f7457b);
        o.h(bgVar);
        t tVar = this.f7533a;
        String str = keVar.f7456a;
        String str2 = keVar.f7457b;
        String str3 = keVar.f7458c;
        w wVar = new w(bgVar, f7532b);
        tVar.getClass();
        o.e(str);
        o.e(str2);
        ((c) tVar.f12166a).y(new c2.c(str, str2, str3), new ve(tVar, wVar, 0));
    }

    public final void c(me meVar, bg bgVar) {
        o.h(meVar);
        o.h(meVar.f7494a);
        o.h(bgVar);
        t tVar = this.f7533a;
        h6.c cVar = meVar.f7494a;
        w wVar = new w(bgVar, f7532b);
        tVar.getClass();
        o.h(cVar);
        if (cVar.f6906e) {
            tVar.b(cVar.f6905d, new x(tVar, cVar, wVar));
            return;
        }
        ((c) tVar.f12166a).t(new ng(cVar, (String) null), new l(tVar, 3, wVar));
    }

    public final void d(oe oeVar, bg bgVar) {
        o.h(bgVar);
        o.h(oeVar);
        q qVar = oeVar.f7567a;
        o.h(qVar);
        t tVar = this.f7533a;
        p H = y3.a.H(qVar);
        w wVar = new w(bgVar, f7532b);
        tVar.getClass();
        ((c) tVar.f12166a).z(H, new ve(tVar, wVar, 1));
    }
}
