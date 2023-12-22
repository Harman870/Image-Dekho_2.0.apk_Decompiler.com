package b6;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

public final /* synthetic */ class t implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2297a;

    public /* synthetic */ t(b bVar) {
        this.f2297a = bVar;
    }

    public final void binderDied() {
        b bVar = this.f2297a;
        bVar.f2273b.b("reportBinderDeath", new Object[0]);
        w wVar = (w) bVar.f2281j.get();
        if (wVar != null) {
            bVar.f2273b.b("calling onBinderDied", new Object[0]);
            wVar.a();
        } else {
            bVar.f2273b.b("%s : Binder has died.", bVar.f2274c);
            Iterator it = bVar.f2275d.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(new RemoteException(String.valueOf(bVar.f2274c).concat(" : Binder has died.")));
            }
            bVar.f2275d.clear();
        }
        synchronized (bVar.f2277f) {
            bVar.d();
        }
    }
}
