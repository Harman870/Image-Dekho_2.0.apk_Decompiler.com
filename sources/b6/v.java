package b6;

public final class v extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2301b;

    public v(b bVar) {
        this.f2301b = bVar;
    }

    public final void b() {
        synchronized (this.f2301b.f2277f) {
            try {
                if (this.f2301b.f2282l.get() > 0) {
                    if (this.f2301b.f2282l.decrementAndGet() > 0) {
                        this.f2301b.f2273b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                b bVar = this.f2301b;
                if (bVar.f2284n != null) {
                    bVar.f2273b.b("Unbind from service.", new Object[0]);
                    b bVar2 = this.f2301b;
                    bVar2.f2272a.unbindService(bVar2.f2283m);
                    b bVar3 = this.f2301b;
                    bVar3.f2278g = false;
                    bVar3.f2284n = null;
                    bVar3.f2283m = null;
                }
                this.f2301b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
