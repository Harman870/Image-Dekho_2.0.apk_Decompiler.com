package r;

import java.util.ArrayList;
import q.c;
import q.d;
import q.g;

public final class i {
    public static o a(d dVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        c cVar;
        int i12;
        if (i10 == 0) {
            i11 = dVar.f10923q0;
        } else {
            i11 = dVar.f10925r0;
        }
        int i13 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f11441b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i14);
                if (oVar2.f11441b == i11) {
                    if (oVar != null) {
                        oVar.d(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof q.i) {
                q.i iVar = (q.i) dVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= iVar.f10964t0) {
                        i12 = -1;
                        break;
                    }
                    d dVar2 = iVar.f10963s0[i15];
                    if ((i10 == 0 && (i12 = dVar2.f10923q0) != -1) || (i10 == 1 && (i12 = dVar2.f10925r0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i16);
                        if (oVar3.f11441b == i12) {
                            oVar = oVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(dVar)) {
            if (dVar instanceof g) {
                g gVar = (g) dVar;
                c cVar2 = gVar.f10960v0;
                if (gVar.f10961w0 == 0) {
                    i13 = 1;
                }
                cVar2.c(i13, oVar, arrayList);
            }
            if (i10 == 0) {
                dVar.f10923q0 = oVar.f11441b;
                dVar.K.c(i10, oVar, arrayList);
                cVar = dVar.M;
            } else {
                dVar.f10925r0 = oVar.f11441b;
                dVar.L.c(i10, oVar, arrayList);
                dVar.O.c(i10, oVar, arrayList);
                cVar = dVar.N;
            }
            cVar.c(i10, oVar, arrayList);
            dVar.R.c(i10, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }
}
