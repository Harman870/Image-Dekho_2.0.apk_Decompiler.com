package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import m.e;
import m.h;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final h<RecyclerView.z, a> f2026a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final e<RecyclerView.z> f2027b = new e<>();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static g0.e f2028d = new g0.e(20);

        /* renamed from: a  reason: collision with root package name */
        public int f2029a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f2030b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f2031c;

        public static a a() {
            a aVar = (a) f2028d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f2026a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2026a.put(zVar, orDefault);
        }
        orDefault.f2031c = cVar;
        orDefault.f2029a |= 8;
    }

    public final void b(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f2026a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2026a.put(zVar, orDefault);
        }
        orDefault.f2030b = cVar;
        orDefault.f2029a |= 4;
    }

    public final RecyclerView.i.c c(RecyclerView.z zVar, int i10) {
        a l6;
        RecyclerView.i.c cVar;
        int e10 = this.f2026a.e(zVar);
        if (e10 >= 0 && (l6 = this.f2026a.l(e10)) != null) {
            int i11 = l6.f2029a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                l6.f2029a = i12;
                if (i10 == 4) {
                    cVar = l6.f2030b;
                } else if (i10 == 8) {
                    cVar = l6.f2031c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f2026a.j(e10);
                    l6.f2029a = 0;
                    l6.f2030b = null;
                    l6.f2031c = null;
                    a.f2028d.a(l6);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void d(RecyclerView.z zVar) {
        a orDefault = this.f2026a.getOrDefault(zVar, null);
        if (orDefault != null) {
            orDefault.f2029a &= -2;
        }
    }

    public final void e(RecyclerView.z zVar) {
        e<RecyclerView.z> eVar = this.f2027b;
        if (eVar.f9271a) {
            eVar.d();
        }
        int i10 = eVar.f9274d - 1;
        while (true) {
            if (i10 < 0) {
                break;
            } else if (zVar == this.f2027b.g(i10)) {
                e<RecyclerView.z> eVar2 = this.f2027b;
                Object[] objArr = eVar2.f9273c;
                Object obj = objArr[i10];
                Object obj2 = e.f9270e;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    eVar2.f9271a = true;
                }
            } else {
                i10--;
            }
        }
        a remove = this.f2026a.remove(zVar);
        if (remove != null) {
            remove.f2029a = 0;
            remove.f2030b = null;
            remove.f2031c = null;
            a.f2028d.a(remove);
        }
    }
}
