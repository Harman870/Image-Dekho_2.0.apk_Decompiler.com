package j4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public b f8069a;

    /* renamed from: b  reason: collision with root package name */
    public b f8070b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8071c;

    public c() {
        this.f8069a = new b((HashMap) null, 0, "");
        this.f8070b = new b((HashMap) null, 0, "");
        this.f8071c = new ArrayList();
    }

    public c(b bVar) {
        this.f8069a = bVar;
        this.f8070b = bVar.clone();
        this.f8071c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.f8069a.clone());
        Iterator it = this.f8071c.iterator();
        while (it.hasNext()) {
            cVar.f8071c.add(((b) it.next()).clone());
        }
        return cVar;
    }
}
