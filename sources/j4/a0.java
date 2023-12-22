package j4;

import java.util.Arrays;
import java.util.Comparator;
import o.c;

public final class a0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f8037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f8038b;

    public a0(j jVar, c cVar) {
        this.f8037a = jVar;
        this.f8038b = cVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        boolean z9 = pVar instanceof u;
        p pVar2 = (p) obj2;
        j jVar = this.f8037a;
        c cVar = this.f8038b;
        if (z9) {
            return !(pVar2 instanceof u) ? 1 : 0;
        }
        if (pVar2 instanceof u) {
            return -1;
        }
        if (jVar == null) {
            return pVar.zzi().compareTo(pVar2.zzi());
        }
        return (int) j4.a(jVar.c(cVar, Arrays.asList(new p[]{pVar, pVar2})).b().doubleValue());
    }
}
