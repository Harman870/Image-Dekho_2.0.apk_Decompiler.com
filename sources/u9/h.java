package u9;

import u9.i;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i.a.C0158a f12266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f12267b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Throwable f12268c;

    public /* synthetic */ h(i.a.C0158a aVar, d dVar, Throwable th) {
        this.f12266a = aVar;
        this.f12267b = dVar;
        this.f12268c = th;
    }

    public final void run() {
        i.a.C0158a aVar = this.f12266a;
        this.f12267b.b(i.a.this, this.f12268c);
    }
}
