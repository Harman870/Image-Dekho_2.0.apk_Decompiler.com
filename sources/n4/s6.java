package n4;

import android.os.RemoteException;
import j4.x0;

public final class s6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f10120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10121b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x0 f10122c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a7 f10123d;

    public s6(a7 a7Var, r rVar, String str, x0 x0Var) {
        this.f10123d = a7Var;
        this.f10120a = rVar;
        this.f10121b = str;
        this.f10122c = x0Var;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            a7 a7Var = this.f10123d;
            z2 z2Var = a7Var.f9613d;
            if (z2Var == null) {
                a7Var.f9600a.a().f9828f.a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = z2Var.u(this.f10120a, this.f10121b);
                this.f10123d.r();
            }
        } catch (RemoteException e10) {
            this.f10123d.f9600a.a().f9828f.b("Failed to send event to the service to bundle", e10);
        } catch (Throwable th) {
            this.f10123d.f9600a.x().C(this.f10122c, bArr);
            throw th;
        }
        this.f10123d.f9600a.x().C(this.f10122c, bArr);
    }
}
