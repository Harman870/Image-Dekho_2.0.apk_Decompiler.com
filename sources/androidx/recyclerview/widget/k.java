package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.activity.f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class k extends z {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f2058s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2059h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2060i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<b> f2061j = new ArrayList<>();
    public ArrayList<a> k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.z>> f2062l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f2063m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<a>> f2064n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2065o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2066p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2067q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2068r = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f2069a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.z f2070b;

        /* renamed from: c  reason: collision with root package name */
        public int f2071c;

        /* renamed from: d  reason: collision with root package name */
        public int f2072d;

        /* renamed from: e  reason: collision with root package name */
        public int f2073e;

        /* renamed from: f  reason: collision with root package name */
        public int f2074f;

        public a(RecyclerView.z zVar, RecyclerView.z zVar2, int i10, int i11, int i12, int i13) {
            this.f2069a = zVar;
            this.f2070b = zVar2;
            this.f2071c = i10;
            this.f2072d = i11;
            this.f2073e = i12;
            this.f2074f = i13;
        }

        public final String toString() {
            StringBuilder g10 = f.g("ChangeInfo{oldHolder=");
            g10.append(this.f2069a);
            g10.append(", newHolder=");
            g10.append(this.f2070b);
            g10.append(", fromX=");
            g10.append(this.f2071c);
            g10.append(", fromY=");
            g10.append(this.f2072d);
            g10.append(", toX=");
            g10.append(this.f2073e);
            g10.append(", toY=");
            g10.append(this.f2074f);
            g10.append('}');
            return g10.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f2075a;

        /* renamed from: b  reason: collision with root package name */
        public int f2076b;

        /* renamed from: c  reason: collision with root package name */
        public int f2077c;

        /* renamed from: d  reason: collision with root package name */
        public int f2078d;

        /* renamed from: e  reason: collision with root package name */
        public int f2079e;

        public b(RecyclerView.z zVar, int i10, int i11, int i12, int i13) {
            this.f2075a = zVar;
            this.f2076b = i10;
            this.f2077c = i11;
            this.f2078d = i12;
            this.f2079e = i13;
        }
    }

    public static void i(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.z) arrayList.get(size)).f1942a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final void e(RecyclerView.z zVar) {
        View view = zVar.f1942a;
        view.animate().cancel();
        int size = this.f2061j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2061j.get(size).f2075a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(zVar);
                this.f2061j.remove(size);
            }
        }
        k(zVar, this.k);
        if (this.f2059h.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        if (this.f2060i.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        int size2 = this.f2064n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f2064n.get(size2);
            k(zVar, arrayList);
            if (arrayList.isEmpty()) {
                this.f2064n.remove(size2);
            }
        }
        int size3 = this.f2063m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f2063m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).f2075a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2063m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2062l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f2062l.get(size5);
                if (arrayList3.remove(zVar)) {
                    view.setAlpha(1.0f);
                    c(zVar);
                    if (arrayList3.isEmpty()) {
                        this.f2062l.remove(size5);
                    }
                }
            } else {
                this.f2067q.remove(zVar);
                this.f2065o.remove(zVar);
                this.f2068r.remove(zVar);
                this.f2066p.remove(zVar);
                j();
                return;
            }
        }
    }

    public final void f() {
        int size = this.f2061j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f2061j.get(size);
            View view = bVar.f2075a.f1942a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f2075a);
            this.f2061j.remove(size);
        }
        int size2 = this.f2059h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f2059h.get(size2));
            this.f2059h.remove(size2);
        }
        int size3 = this.f2060i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.z zVar = this.f2060i.get(size3);
            zVar.f1942a.setAlpha(1.0f);
            c(zVar);
            this.f2060i.remove(size3);
        }
        int size4 = this.k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.k.get(size4);
            RecyclerView.z zVar2 = aVar.f2069a;
            if (zVar2 != null) {
                l(aVar, zVar2);
            }
            RecyclerView.z zVar3 = aVar.f2070b;
            if (zVar3 != null) {
                l(aVar, zVar3);
            }
        }
        this.k.clear();
        if (g()) {
            int size5 = this.f2063m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f2063m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = (b) arrayList.get(size6);
                        View view2 = bVar2.f2075a.f1942a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(bVar2.f2075a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f2063m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f2062l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f2062l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.z zVar4 = (RecyclerView.z) arrayList2.get(size8);
                        zVar4.f1942a.setAlpha(1.0f);
                        c(zVar4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f2062l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f2064n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f2064n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            a aVar2 = (a) arrayList3.get(size10);
                            RecyclerView.z zVar5 = aVar2.f2069a;
                            if (zVar5 != null) {
                                l(aVar2, zVar5);
                            }
                            RecyclerView.z zVar6 = aVar2.f2070b;
                            if (zVar6 != null) {
                                l(aVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f2064n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    i(this.f2067q);
                    i(this.f2066p);
                    i(this.f2065o);
                    i(this.f2068r);
                    d();
                    return;
                }
            }
        }
    }

    public final boolean g() {
        return !this.f2060i.isEmpty() || !this.k.isEmpty() || !this.f2061j.isEmpty() || !this.f2059h.isEmpty() || !this.f2066p.isEmpty() || !this.f2067q.isEmpty() || !this.f2065o.isEmpty() || !this.f2068r.isEmpty() || !this.f2063m.isEmpty() || !this.f2062l.isEmpty() || !this.f2064n.isEmpty();
    }

    public final boolean h(RecyclerView.z zVar, int i10, int i11, int i12, int i13) {
        View view = zVar.f1942a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) zVar.f1942a.getTranslationY());
        m(zVar);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(zVar);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f2061j.add(new b(zVar, translationX, translationY, i12, i13));
        return true;
    }

    public final void j() {
        if (!g()) {
            d();
        }
    }

    public final void k(RecyclerView.z zVar, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = (a) arrayList.get(size);
                if (l(aVar, zVar) && aVar.f2069a == null && aVar.f2070b == null) {
                    arrayList.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean l(a aVar, RecyclerView.z zVar) {
        if (aVar.f2070b == zVar) {
            aVar.f2070b = null;
        } else if (aVar.f2069a != zVar) {
            return false;
        } else {
            aVar.f2069a = null;
        }
        zVar.f1942a.setAlpha(1.0f);
        zVar.f1942a.setTranslationX(0.0f);
        zVar.f1942a.setTranslationY(0.0f);
        c(zVar);
        return true;
    }

    public final void m(RecyclerView.z zVar) {
        if (f2058s == null) {
            f2058s = new ValueAnimator().getInterpolator();
        }
        zVar.f1942a.animate().setInterpolator(f2058s);
        e(zVar);
    }
}
