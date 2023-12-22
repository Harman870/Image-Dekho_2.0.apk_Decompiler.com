package g1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.c;
import g1.k;
import java.util.ArrayList;
import java.util.Iterator;

public class p extends k {
    public boolean A = false;
    public int B = 0;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<k> f6538x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public boolean f6539y = true;

    /* renamed from: z  reason: collision with root package name */
    public int f6540z;

    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f6541a;

        public a(k kVar) {
            this.f6541a = kVar;
        }

        public final void b(k kVar) {
            this.f6541a.C();
            kVar.z(this);
        }
    }

    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        public p f6542a;

        public b(p pVar) {
            this.f6542a = pVar;
        }

        public final void b(k kVar) {
            p pVar = this.f6542a;
            int i10 = pVar.f6540z - 1;
            pVar.f6540z = i10;
            if (i10 == 0) {
                pVar.A = false;
                pVar.n();
            }
            kVar.z(this);
        }

        public final void e(k kVar) {
            p pVar = this.f6542a;
            if (!pVar.A) {
                pVar.J();
                this.f6542a.A = true;
            }
        }
    }

    public final void A(View view) {
        for (int i10 = 0; i10 < this.f6538x.size(); i10++) {
            this.f6538x.get(i10).A(view);
        }
        this.f6509f.remove(view);
    }

    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6538x.get(i10).B(viewGroup);
        }
    }

    public final void C() {
        if (this.f6538x.isEmpty()) {
            J();
            n();
            return;
        }
        b bVar = new b(this);
        Iterator<k> it = this.f6538x.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.f6540z = this.f6538x.size();
        if (!this.f6539y) {
            for (int i10 = 1; i10 < this.f6538x.size(); i10++) {
                this.f6538x.get(i10 - 1).b(new a(this.f6538x.get(i10)));
            }
            k kVar = this.f6538x.get(0);
            if (kVar != null) {
                kVar.C();
                return;
            }
            return;
        }
        Iterator<k> it2 = this.f6538x.iterator();
        while (it2.hasNext()) {
            it2.next().C();
        }
    }

    public final void D(long j10) {
        ArrayList<k> arrayList;
        this.f6506c = j10;
        if (j10 >= 0 && (arrayList = this.f6538x) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f6538x.get(i10).D(j10);
            }
        }
    }

    public final void E(k.c cVar) {
        this.f6521s = cVar;
        this.B |= 8;
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6538x.get(i10).E(cVar);
        }
    }

    public final void F(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList<k> arrayList = this.f6538x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f6538x.get(i10).F(timeInterpolator);
            }
        }
        this.f6507d = timeInterpolator;
    }

    public final void G(c cVar) {
        super.G(cVar);
        this.B |= 4;
        if (this.f6538x != null) {
            for (int i10 = 0; i10 < this.f6538x.size(); i10++) {
                this.f6538x.get(i10).G(cVar);
            }
        }
    }

    public final void H() {
        this.B |= 2;
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6538x.get(i10).H();
        }
    }

    public final void I(long j10) {
        this.f6505b = j10;
    }

    public final String K(String str) {
        String K = super.K(str);
        for (int i10 = 0; i10 < this.f6538x.size(); i10++) {
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(K, "\n");
            h10.append(this.f6538x.get(i10).K(str + "  "));
            K = h10.toString();
        }
        return K;
    }

    public final void L(k kVar) {
        this.f6538x.add(kVar);
        kVar.f6512i = this;
        long j10 = this.f6506c;
        if (j10 >= 0) {
            kVar.D(j10);
        }
        if ((this.B & 1) != 0) {
            kVar.F(this.f6507d);
        }
        if ((this.B & 2) != 0) {
            kVar.H();
        }
        if ((this.B & 4) != 0) {
            kVar.G(this.f6522t);
        }
        if ((this.B & 8) != 0) {
            kVar.E(this.f6521s);
        }
    }

    public final void b(k.d dVar) {
        super.b(dVar);
    }

    public final void c(View view) {
        for (int i10 = 0; i10 < this.f6538x.size(); i10++) {
            this.f6538x.get(i10).c(view);
        }
        this.f6509f.add(view);
    }

    public final void cancel() {
        super.cancel();
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6538x.get(i10).cancel();
        }
    }

    public final void e(r rVar) {
        if (w(rVar.f6547b)) {
            Iterator<k> it = this.f6538x.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.w(rVar.f6547b)) {
                    next.e(rVar);
                    rVar.f6548c.add(next);
                }
            }
        }
    }

    public final void g(r rVar) {
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6538x.get(i10).g(rVar);
        }
    }

    public final void h(r rVar) {
        if (w(rVar.f6547b)) {
            Iterator<k> it = this.f6538x.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.w(rVar.f6547b)) {
                    next.h(rVar);
                    rVar.f6548c.add(next);
                }
            }
        }
    }

    /* renamed from: k */
    public final k clone() {
        p pVar = (p) super.clone();
        pVar.f6538x = new ArrayList<>();
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            k k = this.f6538x.get(i10).clone();
            pVar.f6538x.add(k);
            k.f6512i = pVar;
        }
        return pVar;
    }

    public final void m(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long j10 = this.f6505b;
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = this.f6538x.get(i10);
            if (j10 > 0 && (this.f6539y || i10 == 0)) {
                long j11 = kVar.f6505b;
                if (j11 > 0) {
                    kVar.I(j11 + j10);
                } else {
                    kVar.I(j10);
                }
            }
            kVar.m(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    public final void y(View view) {
        super.y(view);
        int size = this.f6538x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6538x.get(i10).y(view);
        }
    }

    public final void z(k.d dVar) {
        super.z(dVar);
    }
}
