package n4;

import android.os.RemoteException;
import j4.x0;
import java.util.ArrayList;
import r3.o;

public final class x6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g8 f10317c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x0 f10318d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a7 f10319e;

    public x6(a7 a7Var, String str, String str2, g8 g8Var, x0 x0Var) {
        this.f10319e = a7Var;
        this.f10315a = str;
        this.f10316b = str2;
        this.f10317c = g8Var;
        this.f10318d = x0Var;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            a7 a7Var = this.f10319e;
            z2 z2Var = a7Var.f9613d;
            if (z2Var == null) {
                a7Var.f9600a.a().f9828f.c("Failed to get conditional properties; not connected to service", this.f10315a, this.f10316b);
            } else {
                o.h(this.f10317c);
                arrayList = d8.q(z2Var.A(this.f10315a, this.f10316b, this.f10317c));
                this.f10319e.r();
            }
        } catch (RemoteException e10) {
            this.f10319e.f9600a.a().f9828f.d("Failed to get conditional properties; remote exception", this.f10315a, this.f10316b, e10);
        } catch (Throwable th) {
            this.f10319e.f9600a.x().A(this.f10318d, arrayList);
            throw th;
        }
        this.f10319e.f9600a.x().A(this.f10318d, arrayList);
    }
}
