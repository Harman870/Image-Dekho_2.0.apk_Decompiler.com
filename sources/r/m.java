package r;

import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public p f11436a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<p> f11437b = new ArrayList<>();

    public m(p pVar) {
        this.f11436a = pVar;
    }

    public static long a(f fVar, long j10) {
        p pVar = fVar.f11426d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f11426d != pVar) {
                    j11 = Math.min(j11, a(fVar2, ((long) fVar2.f11428f) + j10));
                }
            }
        }
        if (fVar != pVar.f11453i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, a(pVar.f11452h, j12)), j12 - ((long) pVar.f11452h.f11428f));
    }

    public static long b(f fVar, long j10) {
        p pVar = fVar.f11426d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f11426d != pVar) {
                    j11 = Math.max(j11, b(fVar2, ((long) fVar2.f11428f) + j10));
                }
            }
        }
        if (fVar != pVar.f11452h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, b(pVar.f11453i, j12)), j12 - ((long) pVar.f11453i.f11428f));
    }
}
