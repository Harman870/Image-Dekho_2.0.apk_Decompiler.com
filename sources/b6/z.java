package b6;

public final class z extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f2304b;

    public z(a aVar) {
        this.f2304b = aVar;
    }

    public final void b() {
        b bVar = this.f2304b.f2270a;
        bVar.f2273b.b("unlinkToDeath", new Object[0]);
        bVar.f2284n.asBinder().unlinkToDeath(bVar.k, 0);
        b bVar2 = this.f2304b.f2270a;
        bVar2.f2284n = null;
        bVar2.f2278g = false;
    }
}
