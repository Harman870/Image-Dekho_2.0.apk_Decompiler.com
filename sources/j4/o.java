package j4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.c;

public final class o extends j {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8346c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f8347d;

    /* renamed from: e  reason: collision with root package name */
    public c f8348e;

    public o(o oVar) {
        super(oVar.f8268a);
        ArrayList arrayList = new ArrayList(oVar.f8346c.size());
        this.f8346c = arrayList;
        arrayList.addAll(oVar.f8346c);
        ArrayList arrayList2 = new ArrayList(oVar.f8347d.size());
        this.f8347d = arrayList2;
        arrayList2.addAll(oVar.f8347d);
        this.f8348e = oVar.f8348e;
    }

    public o(String str, ArrayList arrayList, List list, c cVar) {
        super(str);
        this.f8346c = new ArrayList();
        this.f8348e = cVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f8346c.add(((p) it.next()).zzi());
            }
        }
        this.f8347d = new ArrayList(list);
    }

    public final p a() {
        return new o(this);
    }

    public final p c(c cVar, List list) {
        p pVar;
        String str;
        c a10 = this.f8348e.a();
        for (int i10 = 0; i10 < this.f8346c.size(); i10++) {
            if (i10 < list.size()) {
                str = (String) this.f8346c.get(i10);
                pVar = cVar.b((p) list.get(i10));
            } else {
                str = (String) this.f8346c.get(i10);
                pVar = p.f8373c0;
            }
            a10.e(str, pVar);
        }
        Iterator it = this.f8347d.iterator();
        while (it.hasNext()) {
            p pVar2 = (p) it.next();
            p b10 = a10.b(pVar2);
            if (b10 instanceof q) {
                b10 = a10.b(pVar2);
            }
            if (b10 instanceof h) {
                return ((h) b10).f8206a;
            }
        }
        return p.f8373c0;
    }
}
