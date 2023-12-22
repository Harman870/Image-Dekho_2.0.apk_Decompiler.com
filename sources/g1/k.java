package g1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.activity.f;
import androidx.lifecycle.c0;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.e;

public abstract class k implements Cloneable {
    public static final int[] u = {2, 1, 3, 4};

    /* renamed from: v  reason: collision with root package name */
    public static final a f6503v = new a();
    public static ThreadLocal<m.b<Animator, b>> w = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public String f6504a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f6505b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f6506c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f6507d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Integer> f6508e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f6509f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public s f6510g = new s();

    /* renamed from: h  reason: collision with root package name */
    public s f6511h = new s();

    /* renamed from: i  reason: collision with root package name */
    public p f6512i = null;

    /* renamed from: j  reason: collision with root package name */
    public int[] f6513j = u;
    public ArrayList<r> k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<r> f6514l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<Animator> f6515m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public int f6516n = 0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6517o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6518p = false;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<d> f6519q = null;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<Animator> f6520r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public c f6521s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.activity.result.c f6522t = f6503v;

    public class a extends androidx.activity.result.c {
        public a() {
            super(0);
        }

        public final Path g(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f6523a;

        /* renamed from: b  reason: collision with root package name */
        public String f6524b;

        /* renamed from: c  reason: collision with root package name */
        public r f6525c;

        /* renamed from: d  reason: collision with root package name */
        public e0 f6526d;

        /* renamed from: e  reason: collision with root package name */
        public k f6527e;

        public b(View view, String str, k kVar, d0 d0Var, r rVar) {
            this.f6523a = view;
            this.f6524b = str;
            this.f6525c = rVar;
            this.f6526d = d0Var;
            this.f6527e = kVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a();

        void b(k kVar);

        void c();

        void d();

        void e(k kVar);
    }

    public static void d(s sVar, View view, r rVar) {
        sVar.f6549a.put(view, rVar);
        int id = view.getId();
        if (id >= 0) {
            if (sVar.f6550b.indexOfKey(id) >= 0) {
                sVar.f6550b.put(id, (Object) null);
            } else {
                sVar.f6550b.put(id, view);
            }
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        String k10 = y.i.k(view);
        if (k10 != null) {
            if (sVar.f6552d.containsKey(k10)) {
                sVar.f6552d.put(k10, null);
            } else {
                sVar.f6552d.put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e<View> eVar = sVar.f6551c;
                if (eVar.f9271a) {
                    eVar.d();
                }
                if (c0.d(eVar.f9272b, eVar.f9274d, itemIdAtPosition) >= 0) {
                    View view2 = (View) sVar.f6551c.e(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        y.d.r(view2, false);
                        sVar.f6551c.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                y.d.r(view, true);
                sVar.f6551c.f(itemIdAtPosition, view);
            }
        }
    }

    public static m.b<Animator, b> p() {
        m.b<Animator, b> bVar = w.get();
        if (bVar != null) {
            return bVar;
        }
        m.b<Animator, b> bVar2 = new m.b<>();
        w.set(bVar2);
        return bVar2;
    }

    public static boolean x(r rVar, r rVar2, String str) {
        Object obj = rVar.f6546a.get(str);
        Object obj2 = rVar2.f6546a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(View view) {
        this.f6509f.remove(view);
    }

    public void B(ViewGroup viewGroup) {
        if (this.f6517o) {
            if (!this.f6518p) {
                int size = this.f6515m.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f6515m.get(size).resume();
                }
                ArrayList<d> arrayList = this.f6519q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f6519q.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((d) arrayList2.get(i10)).c();
                    }
                }
            }
            this.f6517o = false;
        }
    }

    public void C() {
        J();
        m.b<Animator, b> p5 = p();
        Iterator<Animator> it = this.f6520r.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p5.containsKey(next)) {
                J();
                if (next != null) {
                    next.addListener(new l(this, p5));
                    long j10 = this.f6506c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f6505b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f6507d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new m(this));
                    next.start();
                }
            }
        }
        this.f6520r.clear();
        n();
    }

    public void D(long j10) {
        this.f6506c = j10;
    }

    public void E(c cVar) {
        this.f6521s = cVar;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f6507d = timeInterpolator;
    }

    public void G(androidx.activity.result.c cVar) {
        if (cVar == null) {
            cVar = f6503v;
        }
        this.f6522t = cVar;
    }

    public void H() {
    }

    public void I(long j10) {
        this.f6505b = j10;
    }

    public final void J() {
        if (this.f6516n == 0) {
            ArrayList<d> arrayList = this.f6519q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6519q.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).e(this);
                }
            }
            this.f6518p = false;
        }
        this.f6516n++;
    }

    public String K(String str) {
        StringBuilder g10 = f.g(str);
        g10.append(getClass().getSimpleName());
        g10.append("@");
        g10.append(Integer.toHexString(hashCode()));
        g10.append(": ");
        String sb = g10.toString();
        if (this.f6506c != -1) {
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(sb, "dur(");
            h10.append(this.f6506c);
            h10.append(") ");
            sb = h10.toString();
        }
        if (this.f6505b != -1) {
            StringBuilder h11 = com.ironsource.adapters.ironsource.a.h(sb, "dly(");
            h11.append(this.f6505b);
            h11.append(") ");
            sb = h11.toString();
        }
        if (this.f6507d != null) {
            StringBuilder h12 = com.ironsource.adapters.ironsource.a.h(sb, "interp(");
            h12.append(this.f6507d);
            h12.append(") ");
            sb = h12.toString();
        }
        if (this.f6508e.size() <= 0 && this.f6509f.size() <= 0) {
            return sb;
        }
        String g11 = com.ironsource.adapters.ironsource.a.g(sb, "tgts(");
        if (this.f6508e.size() > 0) {
            for (int i10 = 0; i10 < this.f6508e.size(); i10++) {
                if (i10 > 0) {
                    g11 = com.ironsource.adapters.ironsource.a.g(g11, ", ");
                }
                StringBuilder g12 = f.g(g11);
                g12.append(this.f6508e.get(i10));
                g11 = g12.toString();
            }
        }
        if (this.f6509f.size() > 0) {
            for (int i11 = 0; i11 < this.f6509f.size(); i11++) {
                if (i11 > 0) {
                    g11 = com.ironsource.adapters.ironsource.a.g(g11, ", ");
                }
                StringBuilder g13 = f.g(g11);
                g13.append(this.f6509f.get(i11));
                g11 = g13.toString();
            }
        }
        return com.ironsource.adapters.ironsource.a.g(g11, ")");
    }

    public void b(d dVar) {
        if (this.f6519q == null) {
            this.f6519q = new ArrayList<>();
        }
        this.f6519q.add(dVar);
    }

    public void c(View view) {
        this.f6509f.add(view);
    }

    public void cancel() {
        int size = this.f6515m.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            this.f6515m.get(size).cancel();
        }
        ArrayList<d> arrayList = this.f6519q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f6519q.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((d) arrayList2.get(i10)).d();
            }
        }
    }

    public abstract void e(r rVar);

    public final void f(View view, boolean z9) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                r rVar = new r(view);
                if (z9) {
                    h(rVar);
                } else {
                    e(rVar);
                }
                rVar.f6548c.add(this);
                g(rVar);
                d(z9 ? this.f6510g : this.f6511h, view, rVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), z9);
                }
            }
        }
    }

    public void g(r rVar) {
    }

    public abstract void h(r rVar);

    public final void i(ViewGroup viewGroup, boolean z9) {
        j(z9);
        if (this.f6508e.size() > 0 || this.f6509f.size() > 0) {
            for (int i10 = 0; i10 < this.f6508e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f6508e.get(i10).intValue());
                if (findViewById != null) {
                    r rVar = new r(findViewById);
                    if (z9) {
                        h(rVar);
                    } else {
                        e(rVar);
                    }
                    rVar.f6548c.add(this);
                    g(rVar);
                    d(z9 ? this.f6510g : this.f6511h, findViewById, rVar);
                }
            }
            for (int i11 = 0; i11 < this.f6509f.size(); i11++) {
                View view = this.f6509f.get(i11);
                r rVar2 = new r(view);
                if (z9) {
                    h(rVar2);
                } else {
                    e(rVar2);
                }
                rVar2.f6548c.add(this);
                g(rVar2);
                d(z9 ? this.f6510g : this.f6511h, view, rVar2);
            }
            return;
        }
        f(viewGroup, z9);
    }

    public final void j(boolean z9) {
        s sVar;
        if (z9) {
            this.f6510g.f6549a.clear();
            this.f6510g.f6550b.clear();
            sVar = this.f6510g;
        } else {
            this.f6511h.f6549a.clear();
            this.f6511h.f6550b.clear();
            sVar = this.f6511h;
        }
        sVar.f6551c.b();
    }

    /* renamed from: k */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.f6520r = new ArrayList<>();
            kVar.f6510g = new s();
            kVar.f6511h = new s();
            kVar.k = null;
            kVar.f6514l = null;
            return kVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        boolean z9;
        Animator l6;
        Animator animator;
        r rVar;
        View view;
        r rVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        m.b<Animator, b> p5 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            r rVar3 = arrayList.get(i10);
            r rVar4 = arrayList2.get(i10);
            if (rVar3 != null && !rVar3.f6548c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.f6548c.contains(this)) {
                rVar4 = null;
            }
            if (!(rVar3 == null && rVar4 == null)) {
                if (rVar3 == null || rVar4 == null || v(rVar3, rVar4)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && (l6 = l(viewGroup2, rVar3, rVar4)) != null) {
                    if (rVar4 != null) {
                        View view2 = rVar4.f6547b;
                        String[] q10 = q();
                        if (q10 != null && q10.length > 0) {
                            rVar2 = new r(view2);
                            r orDefault = sVar2.f6549a.getOrDefault(view2, null);
                            if (orDefault != null) {
                                int i11 = 0;
                                while (i11 < q10.length) {
                                    HashMap hashMap = rVar2.f6546a;
                                    Animator animator3 = l6;
                                    String str = q10[i11];
                                    hashMap.put(str, orDefault.f6546a.get(str));
                                    i11++;
                                    l6 = animator3;
                                    q10 = q10;
                                }
                            }
                            Animator animator4 = l6;
                            int i12 = p5.f9301c;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    animator2 = animator4;
                                    break;
                                }
                                b orDefault2 = p5.getOrDefault(p5.h(i13), null);
                                if (orDefault2.f6525c != null && orDefault2.f6523a == view2 && orDefault2.f6524b.equals(this.f6504a) && orDefault2.f6525c.equals(rVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            s sVar3 = sVar2;
                            animator2 = l6;
                            rVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        rVar = rVar2;
                    } else {
                        s sVar4 = sVar2;
                        view = rVar3.f6547b;
                        animator = l6;
                        rVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f6504a;
                        z zVar = v.f6555a;
                        d0 d0Var = new d0(viewGroup2);
                        b bVar = r0;
                        b bVar2 = new b(view, str2, this, d0Var, rVar);
                        p5.put(animator, bVar);
                        this.f6520r.add(animator);
                    }
                    i10++;
                    viewGroup2 = viewGroup;
                }
            }
            s sVar5 = sVar2;
            i10++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = this.f6520r.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay(animator5.getStartDelay() + (((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i10 = this.f6516n - 1;
        this.f6516n = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.f6519q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6519q.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).b(this);
                }
            }
            int i12 = 0;
            while (true) {
                e<View> eVar = this.f6510g.f6551c;
                if (eVar.f9271a) {
                    eVar.d();
                }
                if (i12 >= eVar.f9274d) {
                    break;
                }
                View g10 = this.f6510g.f6551c.g(i12);
                if (g10 != null) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.r(g10, false);
                }
                i12++;
            }
            int i13 = 0;
            while (true) {
                e<View> eVar2 = this.f6511h.f6551c;
                if (eVar2.f9271a) {
                    eVar2.d();
                }
                if (i13 < eVar2.f9274d) {
                    View g11 = this.f6511h.f6551c.g(i13);
                    if (g11 != null) {
                        WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                        y.d.r(g11, false);
                    }
                    i13++;
                } else {
                    this.f6518p = true;
                    return;
                }
            }
        }
    }

    public final r o(View view, boolean z9) {
        p pVar = this.f6512i;
        if (pVar != null) {
            return pVar.o(view, z9);
        }
        ArrayList<r> arrayList = z9 ? this.k : this.f6514l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            r rVar = arrayList.get(i11);
            if (rVar == null) {
                return null;
            }
            if (rVar.f6547b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z9 ? this.f6514l : this.k).get(i10);
    }

    public String[] q() {
        return null;
    }

    public final r r(View view, boolean z9) {
        s sVar;
        p pVar = this.f6512i;
        if (pVar != null) {
            return pVar.r(view, z9);
        }
        if (z9) {
            sVar = this.f6510g;
        } else {
            sVar = this.f6511h;
        }
        return sVar.f6549a.getOrDefault(view, null);
    }

    public final String toString() {
        return K("");
    }

    public boolean v(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] q10 = q();
        if (q10 != null) {
            int length = q10.length;
            int i10 = 0;
            while (i10 < length) {
                if (!x(rVar, rVar2, q10[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String x9 : rVar.f6546a.keySet()) {
            if (x(rVar, rVar2, x9)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        return (this.f6508e.size() == 0 && this.f6509f.size() == 0) || this.f6508e.contains(Integer.valueOf(view.getId())) || this.f6509f.contains(view);
    }

    public void y(View view) {
        if (!this.f6518p) {
            for (int size = this.f6515m.size() - 1; size >= 0; size--) {
                this.f6515m.get(size).pause();
            }
            ArrayList<d> arrayList = this.f6519q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6519q.clone();
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((d) arrayList2.get(i10)).a();
                }
            }
            this.f6517o = true;
        }
    }

    public void z(d dVar) {
        ArrayList<d> arrayList = this.f6519q;
        if (arrayList != null) {
            arrayList.remove(dVar);
            if (this.f6519q.size() == 0) {
                this.f6519q = null;
            }
        }
    }
}
