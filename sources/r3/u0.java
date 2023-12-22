package r3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class u0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f11638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f11639b;

    public u0(b bVar, int i10) {
        this.f11639b = bVar;
        this.f11638a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j jVar;
        int i10;
        int i11;
        b bVar = this.f11639b;
        if (iBinder == null) {
            synchronized (bVar.f11506g) {
                i10 = bVar.f11512n;
            }
            if (i10 == 3) {
                bVar.u = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            r0 r0Var = bVar.f11505f;
            r0Var.sendMessage(r0Var.obtainMessage(i11, bVar.w.get(), 16));
            return;
        }
        synchronized (bVar.f11507h) {
            b bVar2 = this.f11639b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof j)) {
                jVar = new l0(iBinder);
            } else {
                jVar = (j) queryLocalInterface;
            }
            bVar2.f11508i = jVar;
        }
        b bVar3 = this.f11639b;
        int i12 = this.f11638a;
        r0 r0Var2 = bVar3.f11505f;
        r0Var2.sendMessage(r0Var2.obtainMessage(7, i12, -1, new w0(bVar3, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar;
        synchronized (this.f11639b.f11507h) {
            bVar = this.f11639b;
            bVar.f11508i = null;
        }
        r0 r0Var = bVar.f11505f;
        r0Var.sendMessage(r0Var.obtainMessage(6, this.f11638a, 1));
    }
}
