package androidx.fragment.app;

import android.util.Log;
import c3.u;
import d3.d;
import i4.af;
import i4.fg;
import i4.g;
import i4.we;
import i4.wg;
import i4.xf;
import i6.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import n3.w;
import n8.a;
import o.c;
import r3.o;
import u1.t;
import y2.b;

public final class g0 implements b, fg {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1482a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1483b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1484c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1485d;

    public /* synthetic */ g0() {
        this.f1482a = new ArrayList();
        this.f1483b = new HashMap();
        this.f1484c = new HashMap();
    }

    public /* synthetic */ g0(a aVar, a aVar2, c cVar, a aVar3) {
        this.f1482a = aVar;
        this.f1483b = aVar2;
        this.f1484c = cVar;
        this.f1485d = aVar3;
    }

    public /* synthetic */ g0(t tVar, String str, String str2, w wVar) {
        this.f1485d = tVar;
        this.f1482a = str;
        this.f1483b = str2;
        this.f1484c = wVar;
    }

    public final void a(o oVar) {
        if (!((ArrayList) this.f1482a).contains(oVar)) {
            synchronized (((ArrayList) this.f1482a)) {
                ((ArrayList) this.f1482a).add(oVar);
            }
            oVar.f1572l = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + oVar);
    }

    public final void b() {
        ((HashMap) this.f1483b).values().removeAll(Collections.singleton((Object) null));
    }

    public final void c(xf xfVar) {
        wg wgVar = (wg) xfVar;
        g gVar = new g();
        String str = wgVar.f7777b;
        o.e(str);
        gVar.f7317a = str;
        String str2 = (String) this.f1482a;
        if (str2 == null) {
            gVar.f7320d.f7374b.add("EMAIL");
        } else {
            gVar.f7318b = str2;
        }
        String str3 = (String) this.f1483b;
        if (str3 == null) {
            gVar.f7320d.f7374b.add("PASSWORD");
        } else {
            gVar.f7319c = str3;
        }
        t tVar = (t) this.f1485d;
        w wVar = (w) this.f1484c;
        o.h(wVar);
        ((androidx.activity.result.c) tVar.f12166a).v(new af(wgVar.f7777b), new we(tVar, wVar, gVar, (fg) this, wgVar));
    }

    public final o d(String str) {
        f0 f0Var = (f0) ((HashMap) this.f1483b).get(str);
        if (f0Var != null) {
            return f0Var.f1473c;
        }
        return null;
    }

    public final o e(String str) {
        for (f0 f0Var : ((HashMap) this.f1483b).values()) {
            if (f0Var != null) {
                o oVar = f0Var.f1473c;
                if (!str.equals(oVar.f1567f)) {
                    oVar = oVar.u.f1649c.e(str);
                }
                if (oVar != null) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : ((HashMap) this.f1483b).values()) {
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList g() {
        o oVar;
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : ((HashMap) this.f1483b).values()) {
            if (f0Var != null) {
                oVar = f0Var.f1473c;
            } else {
                oVar = null;
            }
            arrayList.add(oVar);
        }
        return arrayList;
    }

    public final Object get() {
        return new c3.t((Executor) ((a) this.f1482a).get(), (d) ((a) this.f1483b).get(), (u) ((a) this.f1484c).get(), (e3.b) ((a) this.f1485d).get());
    }

    public final List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f1482a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1482a)) {
            arrayList = new ArrayList((ArrayList) this.f1482a);
        }
        return arrayList;
    }

    public final void i(f0 f0Var) {
        boolean z9;
        o oVar = f0Var.f1473c;
        if (((HashMap) this.f1483b).get(oVar.f1567f) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            ((HashMap) this.f1483b).put(oVar.f1567f, f0Var);
            if (y.I(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + oVar);
            }
        }
    }

    public final void j(f0 f0Var) {
        o oVar = f0Var.f1473c;
        if (oVar.B) {
            ((b0) this.f1485d).d(oVar);
        }
        if (((f0) ((HashMap) this.f1483b).put(oVar.f1567f, (Object) null)) != null && y.I(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + oVar);
        }
    }

    public final e0 k(String str, e0 e0Var) {
        return (e0) (e0Var != null ? ((HashMap) this.f1484c).put(str, e0Var) : ((HashMap) this.f1484c).remove(str));
    }

    public final void zza(String str) {
        ((w) this.f1484c).f(h.a(str));
    }
}
