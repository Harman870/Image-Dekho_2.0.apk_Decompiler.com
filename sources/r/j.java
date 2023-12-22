package r;

import q.d;
import q.g;

public final class j extends p {
    public j(d dVar) {
        super(dVar);
        dVar.f10898d.f();
        dVar.f10900e.f();
        this.f11450f = ((g) dVar).f10961w0;
    }

    public final void a(d dVar) {
        f fVar = this.f11452h;
        if (fVar.f11425c && !fVar.f11432j) {
            this.f11452h.d((int) ((((float) ((f) fVar.f11433l.get(0)).f11429g) * ((g) this.f11446b).f10958s0) + 0.5f));
        }
    }

    public final void d() {
        p pVar;
        d dVar = this.f11446b;
        g gVar = (g) dVar;
        int i10 = gVar.f10959t0;
        int i11 = gVar.u0;
        if (gVar.f10961w0 == 1) {
            f fVar = this.f11452h;
            if (i10 != -1) {
                fVar.f11433l.add(dVar.W.f10898d.f11452h);
                this.f11446b.W.f10898d.f11452h.k.add(this.f11452h);
                this.f11452h.f11428f = i10;
            } else if (i11 != -1) {
                fVar.f11433l.add(dVar.W.f10898d.f11453i);
                this.f11446b.W.f10898d.f11453i.k.add(this.f11452h);
                this.f11452h.f11428f = -i11;
            } else {
                fVar.f11424b = true;
                fVar.f11433l.add(dVar.W.f10898d.f11453i);
                this.f11446b.W.f10898d.f11453i.k.add(this.f11452h);
            }
            m(this.f11446b.f10898d.f11452h);
            pVar = this.f11446b.f10898d;
        } else {
            f fVar2 = this.f11452h;
            if (i10 != -1) {
                fVar2.f11433l.add(dVar.W.f10900e.f11452h);
                this.f11446b.W.f10900e.f11452h.k.add(this.f11452h);
                this.f11452h.f11428f = i10;
            } else if (i11 != -1) {
                fVar2.f11433l.add(dVar.W.f10900e.f11453i);
                this.f11446b.W.f10900e.f11453i.k.add(this.f11452h);
                this.f11452h.f11428f = -i11;
            } else {
                fVar2.f11424b = true;
                fVar2.f11433l.add(dVar.W.f10900e.f11453i);
                this.f11446b.W.f10900e.f11453i.k.add(this.f11452h);
            }
            m(this.f11446b.f10900e.f11452h);
            pVar = this.f11446b.f10900e;
        }
        m(pVar.f11453i);
    }

    public final void e() {
        d dVar = this.f11446b;
        if (((g) dVar).f10961w0 == 1) {
            dVar.f10895b0 = this.f11452h.f11429g;
        } else {
            dVar.f10897c0 = this.f11452h.f11429g;
        }
    }

    public final void f() {
        this.f11452h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f11452h.k.add(fVar);
        fVar.f11433l.add(this.f11452h);
    }
}
