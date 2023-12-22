package j4;

import java.util.Iterator;
import m.b;
import m.g;

public final class g5 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f8196a = new b();

    public static synchronized void a() {
        synchronized (g5.class) {
            b bVar = f8196a;
            Iterator it = ((g.e) bVar.values()).iterator();
            if (!it.hasNext()) {
                bVar.clear();
            } else {
                ((g5) it.next()).getClass();
                throw null;
            }
        }
    }
}
