package r;

import androidx.fragment.app.v0;
import java.util.ArrayList;
import java.util.Iterator;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public p f11423a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11424b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11425c = false;

    /* renamed from: d  reason: collision with root package name */
    public p f11426d;

    /* renamed from: e  reason: collision with root package name */
    public int f11427e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f11428f;

    /* renamed from: g  reason: collision with root package name */
    public int f11429g;

    /* renamed from: h  reason: collision with root package name */
    public int f11430h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f11431i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11432j = false;
    public ArrayList k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f11433l = new ArrayList();

    public f(p pVar) {
        this.f11426d = pVar;
    }

    public final void a(d dVar) {
        Iterator it = this.f11433l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f11432j) {
                return;
            }
        }
        this.f11425c = true;
        p pVar = this.f11423a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f11424b) {
            this.f11426d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        Iterator it2 = this.f11433l.iterator();
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f11432j) {
            g gVar = this.f11431i;
            if (gVar != null) {
                if (gVar.f11432j) {
                    this.f11428f = this.f11430h * gVar.f11429g;
                } else {
                    return;
                }
            }
            d(fVar.f11429g + this.f11428f);
        }
        p pVar2 = this.f11423a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.k.add(dVar);
        if (this.f11432j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f11433l.clear();
        this.k.clear();
        this.f11432j = false;
        this.f11429g = 0;
        this.f11425c = false;
        this.f11424b = false;
    }

    public void d(int i10) {
        if (!this.f11432j) {
            this.f11432j = true;
            this.f11429g = i10;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11426d.f11446b.f10912k0);
        sb.append(":");
        sb.append(v0.g(this.f11427e));
        sb.append("(");
        if (this.f11432j) {
            obj = Integer.valueOf(this.f11429g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f11433l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
