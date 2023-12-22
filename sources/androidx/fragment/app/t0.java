package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.imgdkh.app.R;
import d0.d;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1622a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f1623b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f1624c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1625d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1626e = false;

    public static class a extends b {

        /* renamed from: h  reason: collision with root package name */
        public final f0 f1627h;

        public a(int i10, int i11, f0 f0Var, d dVar) {
            super(i10, i11, f0Var.f1473c, dVar);
            this.f1627h = f0Var;
        }

        public final void b() {
            super.b();
            this.f1627h.k();
        }

        public final void d() {
            float f10;
            int i10 = this.f1629b;
            if (i10 == 2) {
                o oVar = this.f1627h.f1473c;
                View findFocus = oVar.F.findFocus();
                if (findFocus != null) {
                    oVar.i().f1597m = findFocus;
                    if (y.I(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                    }
                }
                View V = this.f1630c.V();
                if (V.getParent() == null) {
                    this.f1627h.b();
                    V.setAlpha(0.0f);
                }
                if (V.getAlpha() == 0.0f && V.getVisibility() == 0) {
                    V.setVisibility(4);
                }
                o.b bVar = oVar.I;
                if (bVar == null) {
                    f10 = 1.0f;
                } else {
                    f10 = bVar.f1596l;
                }
                V.setAlpha(f10);
            } else if (i10 == 3) {
                o oVar2 = this.f1627h.f1473c;
                View V2 = oVar2.V();
                if (y.I(2)) {
                    StringBuilder g10 = f.g("Clearing focus ");
                    g10.append(V2.findFocus());
                    g10.append(" on view ");
                    g10.append(V2);
                    g10.append(" for Fragment ");
                    g10.append(oVar2);
                    Log.v("FragmentManager", g10.toString());
                }
                V2.clearFocus();
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1628a;

        /* renamed from: b  reason: collision with root package name */
        public int f1629b;

        /* renamed from: c  reason: collision with root package name */
        public final o f1630c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f1631d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<d> f1632e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1633f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1634g = false;

        public b(int i10, int i11, o oVar, d dVar) {
            this.f1628a = i10;
            this.f1629b = i11;
            this.f1630c = oVar;
            dVar.b(new u0(this));
        }

        public final void a() {
            if (!this.f1633f) {
                this.f1633f = true;
                if (this.f1632e.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(this.f1632e).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.f1634g) {
                if (y.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1634g = true;
                Iterator it = this.f1631d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        public final void c(int i10, int i11) {
            if (i11 != 0) {
                int i12 = i11 - 1;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            if (y.I(2)) {
                                StringBuilder g10 = f.g("SpecialEffectsController: For fragment ");
                                g10.append(this.f1630c);
                                g10.append(" mFinalState = ");
                                g10.append(w0.i(this.f1628a));
                                g10.append(" -> REMOVED. mLifecycleImpact  = ");
                                g10.append(v0.e(this.f1629b));
                                g10.append(" to REMOVING.");
                                Log.v("FragmentManager", g10.toString());
                            }
                            this.f1628a = 1;
                            this.f1629b = 3;
                        }
                    } else if (this.f1628a == 1) {
                        if (y.I(2)) {
                            StringBuilder g11 = f.g("SpecialEffectsController: For fragment ");
                            g11.append(this.f1630c);
                            g11.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                            g11.append(v0.e(this.f1629b));
                            g11.append(" to ADDING.");
                            Log.v("FragmentManager", g11.toString());
                        }
                        this.f1628a = 2;
                        this.f1629b = 2;
                    }
                } else if (this.f1628a != 1) {
                    if (y.I(2)) {
                        StringBuilder g12 = f.g("SpecialEffectsController: For fragment ");
                        g12.append(this.f1630c);
                        g12.append(" mFinalState = ");
                        g12.append(w0.i(this.f1628a));
                        g12.append(" -> ");
                        g12.append(w0.i(i10));
                        g12.append(". ");
                        Log.v("FragmentManager", g12.toString());
                    }
                    this.f1628a = i10;
                }
            } else {
                throw null;
            }
        }

        public void d() {
        }

        public final String toString() {
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h("Operation ", "{");
            h10.append(Integer.toHexString(System.identityHashCode(this)));
            h10.append("} ");
            h10.append("{");
            h10.append("mFinalState = ");
            h10.append(w0.i(this.f1628a));
            h10.append("} ");
            h10.append("{");
            h10.append("mLifecycleImpact = ");
            h10.append(v0.e(this.f1629b));
            h10.append("} ");
            h10.append("{");
            h10.append("mFragment = ");
            h10.append(this.f1630c);
            h10.append("}");
            return h10.toString();
        }
    }

    public t0(ViewGroup viewGroup) {
        this.f1622a = viewGroup;
    }

    public static t0 f(ViewGroup viewGroup, x0 x0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof t0) {
            return (t0) tag;
        }
        ((y.c) x0Var).getClass();
        m mVar = new m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, mVar);
        return mVar;
    }

    public final void a(int i10, int i11, f0 f0Var) {
        synchronized (this.f1623b) {
            d dVar = new d();
            b d10 = d(f0Var.f1473c);
            if (d10 != null) {
                d10.c(i10, i11);
                return;
            }
            a aVar = new a(i10, i11, f0Var, dVar);
            this.f1623b.add(aVar);
            aVar.f1631d.add(new r0(this, aVar));
            aVar.f1631d.add(new s0(this, aVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z9);

    public final void c() {
        if (!this.f1626e) {
            ViewGroup viewGroup = this.f1622a;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            if (!y.g.b(viewGroup)) {
                e();
                this.f1625d = false;
                return;
            }
            synchronized (this.f1623b) {
                if (!this.f1623b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1624c);
                    this.f1624c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        if (y.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                        }
                        bVar.a();
                        if (!bVar.f1634g) {
                            this.f1624c.add(bVar);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f1623b);
                    this.f1623b.clear();
                    this.f1624c.addAll(arrayList2);
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).d();
                    }
                    b(arrayList2, this.f1625d);
                    this.f1625d = false;
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    public final b d(o oVar) {
        Iterator<b> it = this.f1623b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1630c.equals(oVar) && !next.f1633f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (y.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1622a;
        WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
        boolean b10 = y.g.b(viewGroup);
        synchronized (this.f1623b) {
            h();
            Iterator<b> it = this.f1623b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1624c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (y.I(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1622a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(bVar);
                    Log.v("FragmentManager", sb.toString());
                }
                bVar.a();
            }
            Iterator it3 = new ArrayList(this.f1623b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (y.I(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str = "";
                    } else {
                        str = "Container " + this.f1622a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(bVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f1623b) {
            h();
            this.f1626e = false;
            int size = this.f1623b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f1623b.get(size);
                int c10 = w0.c(bVar.f1630c.F);
                if (bVar.f1628a == 2 && c10 != 2) {
                    o.b bVar2 = bVar.f1630c.I;
                    this.f1626e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator<b> it = this.f1623b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1629b == 2) {
                next.c(w0.b(next.f1630c.V().getVisibility()), 1);
            }
        }
    }
}
