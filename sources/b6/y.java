package b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c6.b;
import java.util.Iterator;

public final class y extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f2302b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f2303c;

    public y(a aVar, IBinder iBinder) {
        this.f2303c = aVar;
        this.f2302b = iBinder;
    }

    public final void b() {
        IInterface iInterface;
        b bVar = this.f2303c.f2270a;
        x xVar = bVar.f2280i;
        IBinder iBinder = this.f2302b;
        ((b) xVar).getClass();
        int i10 = n.f2294a;
        if (iBinder == null) {
            iInterface = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            if (queryLocalInterface instanceof o) {
                iInterface = (o) queryLocalInterface;
            } else {
                iInterface = new m(iBinder);
            }
        }
        bVar.f2284n = iInterface;
        b bVar2 = this.f2303c.f2270a;
        bVar2.f2273b.b("linkToDeath", new Object[0]);
        try {
            bVar2.f2284n.asBinder().linkToDeath(bVar2.k, 0);
        } catch (RemoteException e10) {
            bVar2.f2273b.a("linkToDeath failed", e10, new Object[0]);
        }
        b bVar3 = this.f2303c.f2270a;
        bVar3.f2278g = false;
        Iterator it = bVar3.f2275d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f2303c.f2270a.f2275d.clear();
    }
}
