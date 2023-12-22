package r;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.c;
import q.d;
import q.e;

public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f11439f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<d> f11440a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f11441b;

    /* renamed from: c  reason: collision with root package name */
    public int f11442c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f11443d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f11444e = -1;

    public class a {
        public a(d dVar, o.d dVar2) {
            new WeakReference(dVar);
            c cVar = dVar.K;
            dVar2.getClass();
            o.d.o(cVar);
            o.d.o(dVar.L);
            o.d.o(dVar.M);
            o.d.o(dVar.N);
            o.d.o(dVar.O);
        }
    }

    public o(int i10) {
        int i11 = f11439f;
        f11439f = i11 + 1;
        this.f11441b = i11;
        this.f11442c = i10;
    }

    public final boolean a(d dVar) {
        if (this.f11440a.contains(dVar)) {
            return false;
        }
        this.f11440a.add(dVar);
        return true;
    }

    public final void b(ArrayList<o> arrayList) {
        int size = this.f11440a.size();
        if (this.f11444e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f11444e == oVar.f11441b) {
                    d(this.f11442c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(o.d dVar, int i10) {
        int i11;
        c cVar;
        if (this.f11440a.size() == 0) {
            return 0;
        }
        ArrayList<d> arrayList = this.f11440a;
        e eVar = (e) arrayList.get(0).W;
        dVar.u();
        eVar.c(dVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).c(dVar, false);
        }
        if (i10 == 0 && eVar.B0 > 0) {
            z5.c.d(eVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.C0 > 0) {
            z5.c.d(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f11443d = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f11443d.add(new a(arrayList.get(i13), dVar));
        }
        if (i10 == 0) {
            i11 = o.d.o(eVar.K);
            cVar = eVar.M;
        } else {
            i11 = o.d.o(eVar.L);
            cVar = eVar.N;
        }
        int o10 = o.d.o(cVar);
        dVar.u();
        return o10 - i11;
    }

    public final void d(int i10, o oVar) {
        Iterator<d> it = this.f11440a.iterator();
        while (it.hasNext()) {
            d next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f10923q0 = oVar.f11441b;
            } else {
                next.f10925r0 = oVar.f11441b;
            }
        }
        this.f11444e = oVar.f11441b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i10 = this.f11442c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f11441b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<d> it = this.f11440a.iterator();
        while (it.hasNext()) {
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(sb2, " ");
            h10.append(it.next().f10912k0);
            sb2 = h10.toString();
        }
        return com.ironsource.adapters.ironsource.a.g(sb2, " >");
    }
}
