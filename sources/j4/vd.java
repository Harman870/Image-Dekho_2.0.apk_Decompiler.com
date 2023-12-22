package j4;

import java.util.Collections;
import java.util.TreeMap;
import o.c;

public final class vd {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f8530a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap f8531b = new TreeMap();

    public final void a(c cVar, c cVar2) {
        int i10;
        l7 l7Var = new l7(cVar2);
        for (Integer num : this.f8530a.keySet()) {
            b a10 = cVar2.f8070b.clone();
            p c10 = ((o) this.f8530a.get(num)).c(cVar, Collections.singletonList(l7Var));
            if (c10 instanceof i) {
                i10 = j4.b(c10.b().doubleValue());
            } else {
                i10 = -1;
            }
            if (i10 == 2 || i10 == -1) {
                cVar2.f8070b = a10;
            }
        }
        for (Integer num2 : this.f8531b.keySet()) {
            p c11 = ((o) this.f8531b.get(num2)).c(cVar, Collections.singletonList(l7Var));
            if (c11 instanceof i) {
                j4.b(c11.b().doubleValue());
            }
        }
    }
}
