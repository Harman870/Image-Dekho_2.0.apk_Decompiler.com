package q1;

import q1.c;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f10974a;

    public b(c cVar) {
        this.f10974a = cVar;
    }

    public final void run() {
        c cVar = this.f10974a;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f10984c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
