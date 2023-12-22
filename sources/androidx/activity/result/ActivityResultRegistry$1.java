package androidx.activity.result;

import androidx.activity.result.f;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import b.a;
import b.c;
import c3.n;

class ActivityResultRegistry$1 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f285b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f286c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f287d;

    public ActivityResultRegistry$1(f fVar, String str, n nVar, c cVar) {
        this.f287d = fVar;
        this.f284a = str;
        this.f285b = nVar;
        this.f286c = cVar;
    }

    public final void b(l lVar, g.b bVar) {
        if (g.b.ON_START.equals(bVar)) {
            this.f287d.f302f.put(this.f284a, new f.a(this.f285b, this.f286c));
            if (this.f287d.f303g.containsKey(this.f284a)) {
                Object obj = this.f287d.f303g.get(this.f284a);
                this.f287d.f303g.remove(this.f284a);
                this.f285b.b(obj);
            }
            a aVar = (a) this.f287d.f304h.getParcelable(this.f284a);
            if (aVar != null) {
                this.f287d.f304h.remove(this.f284a);
                this.f285b.b(this.f286c.c(aVar.f289b, aVar.f288a));
            }
        } else if (g.b.ON_STOP.equals(bVar)) {
            this.f287d.f302f.remove(this.f284a);
        } else if (g.b.ON_DESTROY.equals(bVar)) {
            this.f287d.f(this.f284a);
        }
    }
}
