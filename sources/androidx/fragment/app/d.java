package androidx.fragment.app;

import androidx.fragment.app.t0;
import java.util.ArrayList;
import java.util.List;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f1444a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0.b f1445b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f1446c;

    public d(m mVar, ArrayList arrayList, t0.b bVar) {
        this.f1446c = mVar;
        this.f1444a = arrayList;
        this.f1445b = bVar;
    }

    public final void run() {
        if (this.f1444a.contains(this.f1445b)) {
            this.f1444a.remove(this.f1445b);
            m mVar = this.f1446c;
            t0.b bVar = this.f1445b;
            mVar.getClass();
            w0.a(bVar.f1628a, bVar.f1630c.F);
        }
    }
}
