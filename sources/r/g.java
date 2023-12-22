package r;

import java.util.Iterator;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f11434m;

    public g(p pVar) {
        super(pVar);
        this.f11427e = pVar instanceof l ? 2 : 3;
    }

    public final void d(int i10) {
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
}
