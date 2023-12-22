package r;

import java.util.Iterator;
import q.a;
import q.d;

public final class k extends p {
    public k(d dVar) {
        super(dVar);
    }

    public final void a(d dVar) {
        a aVar = (a) this.f11446b;
        int i10 = aVar.u0;
        Iterator it = this.f11452h.f11433l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f11429g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            this.f11452h.d(i12 + aVar.f10856w0);
        } else {
            this.f11452h.d(i11 + aVar.f10856w0);
        }
    }

    public final void d() {
        p pVar;
        d dVar = this.f11446b;
        if (dVar instanceof a) {
            f fVar = this.f11452h;
            fVar.f11424b = true;
            a aVar = (a) dVar;
            int i10 = aVar.u0;
            boolean z9 = aVar.f10855v0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f11427e = 4;
                while (i11 < aVar.f10964t0) {
                    d dVar2 = aVar.f10963s0[i11];
                    if (z9 || dVar2.f10911j0 != 8) {
                        f fVar2 = dVar2.f10898d.f11452h;
                        fVar2.k.add(this.f11452h);
                        this.f11452h.f11433l.add(fVar2);
                    }
                    i11++;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    fVar.f11427e = 6;
                    while (i11 < aVar.f10964t0) {
                        d dVar3 = aVar.f10963s0[i11];
                        if (z9 || dVar3.f10911j0 != 8) {
                            f fVar3 = dVar3.f10900e.f11452h;
                            fVar3.k.add(this.f11452h);
                            this.f11452h.f11433l.add(fVar3);
                        }
                        i11++;
                    }
                } else if (i10 == 3) {
                    fVar.f11427e = 7;
                    while (i11 < aVar.f10964t0) {
                        d dVar4 = aVar.f10963s0[i11];
                        if (z9 || dVar4.f10911j0 != 8) {
                            f fVar4 = dVar4.f10900e.f11453i;
                            fVar4.k.add(this.f11452h);
                            this.f11452h.f11433l.add(fVar4);
                        }
                        i11++;
                    }
                } else {
                    return;
                }
                m(this.f11446b.f10900e.f11452h);
                pVar = this.f11446b.f10900e;
                m(pVar.f11453i);
            } else {
                fVar.f11427e = 5;
                while (i11 < aVar.f10964t0) {
                    d dVar5 = aVar.f10963s0[i11];
                    if (z9 || dVar5.f10911j0 != 8) {
                        f fVar5 = dVar5.f10898d.f11453i;
                        fVar5.k.add(this.f11452h);
                        this.f11452h.f11433l.add(fVar5);
                    }
                    i11++;
                }
            }
            m(this.f11446b.f10898d.f11452h);
            pVar = this.f11446b.f10898d;
            m(pVar.f11453i);
        }
    }

    public final void e() {
        d dVar = this.f11446b;
        if (dVar instanceof a) {
            int i10 = ((a) dVar).u0;
            if (i10 == 0 || i10 == 1) {
                dVar.f10895b0 = this.f11452h.f11429g;
            } else {
                dVar.f10897c0 = this.f11452h.f11429g;
            }
        }
    }

    public final void f() {
        this.f11447c = null;
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
