package c2;

import android.content.res.Resources;
import android.os.RemoteException;
import h6.r;
import i4.fg;
import i4.lf;
import i4.wg;
import i4.xf;
import i6.h0;
import i6.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n3.w;
import n4.g3;
import n4.h4;
import n4.i3;
import o1.h;
import r3.o;
import u3.a;
import x1.u;

public final class b implements d, fg {

    /* renamed from: a  reason: collision with root package name */
    public Object f2371a;

    public /* synthetic */ b() {
        this.f2371a = new HashMap();
    }

    public /* synthetic */ b(Resources resources) {
        this.f2371a = resources;
    }

    public b(h0 h0Var) {
        o.h(h0Var);
        this.f2371a = h0Var;
    }

    public /* synthetic */ b(w wVar) {
        this.f2371a = wVar;
    }

    public final q1.w a(q1.w wVar, h hVar) {
        Resources resources = (Resources) this.f2371a;
        if (wVar == null) {
            return null;
        }
        return new u(resources, wVar);
    }

    public final ArrayList b() {
        n nVar = ((h0) this.f2371a).f7906l;
        if (nVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (r add : nVar.f7917a) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public final void c(xf xfVar) {
        wg wgVar = (wg) xfVar;
        w wVar = (w) this.f2371a;
        wVar.getClass();
        try {
            ((lf) wVar.f9573a).c(wgVar);
        } catch (RemoteException e10) {
            ((a) wVar.f9574b).b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void d(int i10, String str, List list, boolean z9, boolean z10) {
        g3 g3Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            g3Var = ((h4) this.f2371a).f9600a.a().f9834m;
        } else if (i11 == 1) {
            i3 a10 = ((h4) this.f2371a).f9600a.a();
            if (z9) {
                g3Var = a10.f9829g;
            } else if (!z10) {
                g3Var = a10.f9830h;
            } else {
                g3Var = a10.f9828f;
            }
        } else if (i11 == 3) {
            g3Var = ((h4) this.f2371a).f9600a.a().f9835n;
        } else if (i11 != 4) {
            g3Var = ((h4) this.f2371a).f9600a.a().f9833l;
        } else {
            i3 a11 = ((h4) this.f2371a).f9600a.a();
            if (z9) {
                g3Var = a11.f9832j;
            } else if (!z10) {
                g3Var = a11.k;
            } else {
                g3Var = a11.f9831i;
            }
        }
        int size = list.size();
        if (size == 1) {
            g3Var.b(str, list.get(0));
        } else if (size == 2) {
            g3Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            g3Var.a(str);
        } else {
            g3Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public final void zza(String str) {
        ((w) this.f2371a).f(i6.h.a(str));
    }

    public /* synthetic */ b(Object obj) {
        this.f2371a = obj;
    }
}
