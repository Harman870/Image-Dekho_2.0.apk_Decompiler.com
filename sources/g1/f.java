package g1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import androidx.fragment.app.o0;
import d0.d;
import g1.k;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class f extends o0 {

    public class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6492a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f6493b;

        public a(View view, ArrayList arrayList) {
            this.f6492a = view;
            this.f6493b = arrayList;
        }

        public final void a() {
        }

        public final void b(k kVar) {
            kVar.z(this);
            this.f6492a.setVisibility(8);
            int size = this.f6493b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f6493b.get(i10)).setVisibility(0);
            }
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e(k kVar) {
            kVar.z(this);
            kVar.b(this);
        }
    }

    public class b extends k.c {
    }

    public final void a(View view, Object obj) {
        ((k) obj).c(view);
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z9;
        k kVar;
        k kVar2 = (k) obj;
        if (kVar2 != null) {
            int i10 = 0;
            if (kVar2 instanceof p) {
                p pVar = (p) kVar2;
                int size = pVar.f6538x.size();
                while (i10 < size) {
                    if (i10 < 0 || i10 >= pVar.f6538x.size()) {
                        kVar = null;
                    } else {
                        kVar = pVar.f6538x.get(i10);
                    }
                    b(kVar, arrayList);
                    i10++;
                }
                return;
            }
            if (!o0.h(kVar2.f6508e) || !o0.h((List) null) || !o0.h((List) null)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 && o0.h(kVar2.f6509f)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    kVar2.c(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (k) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof k;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((k) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        k kVar3 = (k) obj3;
        if (kVar != null && kVar2 != null) {
            p pVar = new p();
            pVar.L(kVar);
            pVar.L(kVar2);
            pVar.f6539y = false;
            kVar = pVar;
        } else if (kVar == null) {
            if (kVar2 != null) {
                kVar = kVar2;
            } else {
                kVar = null;
            }
        }
        if (kVar3 == null) {
            return kVar;
        }
        p pVar2 = new p();
        if (kVar != null) {
            pVar2.L(kVar);
        }
        pVar2.L(kVar3);
        return pVar2;
    }

    public final Object j(Object obj, Object obj2) {
        p pVar = new p();
        if (obj != null) {
            pVar.L((k) obj);
        }
        pVar.L((k) obj2);
        return pVar;
    }

    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((k) obj).b(new a(view, arrayList));
    }

    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((k) obj).b(new g(this, obj2, arrayList, obj3, arrayList2));
    }

    public final void m(View view, Object obj) {
        if (view != null) {
            o0.g(view, new Rect());
            ((k) obj).E(new e());
        }
    }

    public final void n(Object obj, Rect rect) {
        ((k) obj).E(new b());
    }

    public final void o(Object obj, d dVar, l lVar) {
        k kVar = (k) obj;
        dVar.b(new h(kVar));
        kVar.b(new i(lVar));
    }

    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        ArrayList<View> arrayList2 = pVar.f6509f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.f6509f.clear();
            pVar.f6509f.addAll(arrayList2);
            s(pVar, arrayList, arrayList2);
        }
    }

    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.L((k) obj);
        return pVar;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z9;
        int i10;
        k kVar;
        k kVar2 = (k) obj;
        int i11 = 0;
        if (kVar2 instanceof p) {
            p pVar = (p) kVar2;
            int size = pVar.f6538x.size();
            while (i11 < size) {
                if (i11 < 0 || i11 >= pVar.f6538x.size()) {
                    kVar = null;
                } else {
                    kVar = pVar.f6538x.get(i11);
                }
                s(kVar, arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (!o0.h(kVar2.f6508e) || !o0.h((List) null) || !o0.h((List) null)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            ArrayList<View> arrayList3 = kVar2.f6509f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    kVar2.c(arrayList2.get(i11));
                    i11++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        kVar2.A(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
