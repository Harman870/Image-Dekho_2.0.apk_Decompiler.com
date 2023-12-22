package n4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import n3.l;
import n3.m;
import q3.i0;
import r3.b;
import r3.o;

public final class z6 implements ServiceConnection, b.a, b.C0136b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f10350a;

    /* renamed from: b  reason: collision with root package name */
    public volatile e3 f10351b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a7 f10352c;

    public z6(a7 a7Var) {
        this.f10352c = a7Var;
    }

    public final void b(o3.b bVar) {
        o.d("MeasurementServiceConnection.onConnectionFailed");
        i3 i3Var = this.f10352c.f9600a.f9994i;
        if (i3Var == null || !i3Var.f9629b) {
            i3Var = null;
        }
        if (i3Var != null) {
            i3Var.f9831i.b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f10350a = false;
            this.f10351b = null;
        }
        this.f10352c.f9600a.d().o(new m(1, this));
    }

    public final void c(int i10) {
        o.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f10352c.f9600a.a().f9834m.a("Service connection suspended");
        this.f10352c.f9600a.d().o(new l(this, 2));
    }

    public final void d() {
        o.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                o.h(this.f10351b);
                this.f10352c.f9600a.d().o(new u6(this, 1, (z2) this.f10351b.v()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f10351b = null;
                this.f10350a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f10352c.f9600a.a().f9828f.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            r3.o.d(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f10350a = r4     // Catch:{ all -> 0x001c }
            n4.a7 r4 = r3.f10352c     // Catch:{ all -> 0x001c }
            n4.n4 r4 = r4.f9600a     // Catch:{ all -> 0x001c }
            n4.i3 r4 = r4.a()     // Catch:{ all -> 0x001c }
            n4.g3 r4 = r4.f9828f     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0096
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof n4.z2     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            n4.z2 r1 = (n4.z2) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            n4.x2 r1 = new n4.x2     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            n4.a7 r5 = r3.f10352c     // Catch:{ RemoteException -> 0x0060 }
            n4.n4 r5 = r5.f9600a     // Catch:{ RemoteException -> 0x0060 }
            n4.i3 r5 = r5.a()     // Catch:{ RemoteException -> 0x0060 }
            n4.g3 r5 = r5.f9835n     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            n4.a7 r5 = r3.f10352c     // Catch:{ RemoteException -> 0x0060 }
            n4.n4 r5 = r5.f9600a     // Catch:{ RemoteException -> 0x0060 }
            n4.i3 r5 = r5.a()     // Catch:{ RemoteException -> 0x0060 }
            n4.g3 r5 = r5.f9828f     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            n4.a7 r5 = r3.f10352c     // Catch:{ all -> 0x001c }
            n4.n4 r5 = r5.f9600a     // Catch:{ all -> 0x001c }
            n4.i3 r5 = r5.a()     // Catch:{ all -> 0x001c }
            n4.g3 r5 = r5.f9828f     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0083
            r3.f10350a = r4     // Catch:{ all -> 0x001c }
            v3.a r4 = v3.a.b()     // Catch:{ IllegalArgumentException -> 0x0094 }
            n4.a7 r5 = r3.f10352c     // Catch:{ IllegalArgumentException -> 0x0094 }
            n4.n4 r0 = r5.f9600a     // Catch:{ IllegalArgumentException -> 0x0094 }
            android.content.Context r0 = r0.f9986a     // Catch:{ IllegalArgumentException -> 0x0094 }
            n4.z6 r5 = r5.f9612c     // Catch:{ IllegalArgumentException -> 0x0094 }
            r4.c(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x0094
        L_0x0083:
            n4.a7 r4 = r3.f10352c     // Catch:{ all -> 0x001c }
            n4.n4 r4 = r4.f9600a     // Catch:{ all -> 0x001c }
            n4.m4 r4 = r4.d()     // Catch:{ all -> 0x001c }
            n4.u4 r5 = new n4.u4     // Catch:{ all -> 0x001c }
            r1 = 4
            r5.<init>(r3, r1, r0)     // Catch:{ all -> 0x001c }
            r4.o(r5)     // Catch:{ all -> 0x001c }
        L_0x0094:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.z6.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        o.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f10352c.f9600a.a().f9834m.a("Service disconnected");
        this.f10352c.f9600a.d().o(new i0(this, 4, componentName));
    }
}
