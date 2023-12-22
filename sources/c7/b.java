package c7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f2515a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2516b;

    public b(Set<d> set, c cVar) {
        this.f2515a = b(set);
        this.f2516b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f2516b;
        synchronized (cVar.f2518a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f2518a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f2515a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2515a);
        sb.append(' ');
        c cVar2 = this.f2516b;
        synchronized (cVar2.f2518a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar2.f2518a);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
