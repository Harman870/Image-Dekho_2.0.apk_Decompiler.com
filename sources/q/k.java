package q;

import java.util.ArrayList;
import o.c;

public class k extends d {

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList<d> f10970s0 = new ArrayList<>();

    public void D() {
        this.f10970s0.clear();
        super.D();
    }

    public final void G(c cVar) {
        super.G(cVar);
        int size = this.f10970s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10970s0.get(i10).G(cVar);
        }
    }

    public void R() {
        ArrayList<d> arrayList = this.f10970s0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = this.f10970s0.get(i10);
                if (dVar instanceof k) {
                    ((k) dVar).R();
                }
            }
        }
    }
}
