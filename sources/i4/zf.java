package i4;

import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.c;
import androidx.appcompat.widget.l;
import c6.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import m.b;
import r3.o;

public final class zf extends c {

    /* renamed from: b  reason: collision with root package name */
    public tf f7849b = null;

    /* renamed from: c  reason: collision with root package name */
    public uf f7850c = null;

    /* renamed from: d  reason: collision with root package name */
    public hg f7851d = null;

    /* renamed from: e  reason: collision with root package name */
    public final yf f7852e;

    /* renamed from: f  reason: collision with root package name */
    public final f f7853f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7854g;

    /* renamed from: h  reason: collision with root package name */
    public ag f7855h;

    public zf(f fVar, yf yfVar) {
        kg kgVar;
        kg kgVar2;
        this.f7853f = fVar;
        fVar.a();
        String str = fVar.f2496c.f2506a;
        this.f7854g = str;
        this.f7852e = yfVar;
        String v10 = z5.c.v("firebear.secureToken");
        if (TextUtils.isEmpty(v10)) {
            b bVar = lg.f7482a;
            synchronized (bVar) {
                kgVar2 = (kg) bVar.getOrDefault(str, null);
            }
            if (kgVar2 == null) {
                v10 = "https://".concat("securetoken.googleapis.com/v1");
            } else {
                throw null;
            }
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(v10)));
        }
        if (this.f7851d == null) {
            this.f7851d = new hg(v10, A());
        }
        String v11 = z5.c.v("firebear.identityToolkit");
        if (TextUtils.isEmpty(v11)) {
            v11 = lg.a(str);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(v11)));
        }
        if (this.f7849b == null) {
            this.f7849b = new tf(v11, A());
        }
        String v12 = z5.c.v("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(v12)) {
            b bVar2 = lg.f7482a;
            synchronized (bVar2) {
                kgVar = (kg) bVar2.getOrDefault(str, null);
            }
            if (kgVar == null) {
                v12 = "https://".concat("identitytoolkit.googleapis.com/v2");
            } else {
                throw null;
            }
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(v12)));
        }
        if (this.f7850c == null) {
            this.f7850c = new uf(v12, A());
        }
        b bVar3 = lg.f7483b;
        synchronized (bVar3) {
            if (bVar3.containsKey(str)) {
                ((List) bVar3.getOrDefault(str, null)).add(new WeakReference(this));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(this));
                bVar3.put(str, arrayList);
            }
        }
    }

    public final ag A() {
        if (this.f7855h == null) {
            f fVar = this.f7853f;
            String format = String.format("X%s", new Object[]{Integer.toString(this.f7852e.f7828a)});
            fVar.a();
            this.f7855h = new ag(fVar.f2494a, fVar, format);
        }
        return this.f7855h;
    }

    public final void t(ng ngVar, l lVar) {
        tf tfVar = this.f7849b;
        c6.b.D(tfVar.a("/emailLinkSignin", this.f7854g), ngVar, lVar, og.class, tfVar.f7677b);
    }

    public final void u(h6 h6Var, fg fgVar) {
        hg hgVar = this.f7851d;
        c6.b.D(hgVar.a("/token", this.f7854g), h6Var, fgVar, wg.class, hgVar.f7677b);
    }

    public final void v(af afVar, fg fgVar) {
        tf tfVar = this.f7849b;
        c6.b.D(tfVar.a("/getAccountInfo", this.f7854g), afVar, fgVar, pg.class, tfVar.f7677b);
    }

    public final void w(g gVar, xe xeVar) {
        tf tfVar = this.f7849b;
        c6.b.D(tfVar.a("/setAccountInfo", this.f7854g), gVar, xeVar, h.class, tfVar.f7677b);
    }

    public final void x(k kVar, fg fgVar) {
        o.h(kVar);
        tf tfVar = this.f7849b;
        c6.b.D(tfVar.a("/verifyAssertion", this.f7854g), kVar, fgVar, n.class, tfVar.f7677b);
    }

    public final void y(c2.c cVar, ve veVar) {
        tf tfVar = this.f7849b;
        c6.b.D(tfVar.a("/verifyPassword", this.f7854g), cVar, veVar, o.class, tfVar.f7677b);
    }

    public final void z(p pVar, fg fgVar) {
        o.h(pVar);
        tf tfVar = this.f7849b;
        c6.b.D(tfVar.a("/verifyPhoneNumber", this.f7854g), pVar, fgVar, q.class, tfVar.f7677b);
    }
}
