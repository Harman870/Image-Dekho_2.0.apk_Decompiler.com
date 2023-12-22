package i4;

import androidx.activity.result.c;
import java.util.List;
import n3.w;
import r3.o;
import u1.t;

public final class we implements fg {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7770a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7771b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7772c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7773d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f7774e;

    public /* synthetic */ we(String str, String str2, String str3, String str4, String str5) {
        this.f7770a = str;
        this.f7771b = str2;
        this.f7772c = str3;
        this.f7773d = str4;
        this.f7774e = str5;
    }

    public /* synthetic */ we(t tVar, w wVar, g gVar, fg fgVar, wg wgVar) {
        this.f7774e = tVar;
        this.f7770a = fgVar;
        this.f7771b = wVar;
        this.f7772c = wgVar;
        this.f7773d = gVar;
    }

    public final void c(xf xfVar) {
        List list = ((pg) xfVar).f7599a.f7693a;
        if (list == null || list.isEmpty()) {
            ((fg) this.f7770a).zza("No users");
            return;
        }
        w wVar = (w) this.f7771b;
        wg wgVar = (wg) this.f7772c;
        rg rgVar = (rg) list.get(0);
        g gVar = (g) this.f7773d;
        fg fgVar = (fg) this.f7770a;
        o.h(wVar);
        o.h(wgVar);
        o.h(rgVar);
        o.h(gVar);
        o.h(fgVar);
        ((c) ((t) this.f7774e).f12166a).w(gVar, new xe(wVar, gVar, fgVar, rgVar, wgVar));
    }

    public final void zza(String str) {
        ((fg) this.f7770a).zza(str);
    }
}
