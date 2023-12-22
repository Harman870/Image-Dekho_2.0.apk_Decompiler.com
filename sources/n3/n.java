package n3;

import android.os.IBinder;
import android.os.RemoteException;
import e2.c;
import i4.z7;
import n4.b;
import n4.c5;
import n4.d7;
import n4.f;
import n4.f6;
import n4.h4;
import n4.i;
import n4.k;
import n4.o7;
import n4.q3;
import n4.t3;
import n4.w7;
import n4.z3;
import r3.o;
import y3.a;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9550b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9551c;

    public /* synthetic */ n(Object obj, int i10, Object obj2) {
        this.f9549a = i10;
        this.f9551c = obj;
        this.f9550b = obj2;
    }

    public final void run() {
        String message;
        boolean z9 = true;
        switch (this.f9549a) {
            case 0:
                p pVar = (p) this.f9550b;
                IBinder iBinder = (IBinder) this.f9551c;
                synchronized (pVar) {
                    if (iBinder == null) {
                        message = "Null service connection";
                    } else {
                        try {
                            pVar.f9557c = new c(iBinder);
                            pVar.f9555a = 2;
                            pVar.f9560f.f9567b.execute(new l(pVar, 0));
                        } catch (RemoteException e10) {
                            message = e10.getMessage();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    pVar.a(0, message);
                }
                return;
            case 1:
                ((c5) this.f9550b).e();
                if (z7.a()) {
                    ((c5) this.f9550b).d().o(this);
                    return;
                }
                if (((k) this.f9551c).f9883c == 0) {
                    z9 = false;
                }
                ((k) this.f9551c).f9883c = 0;
                if (z9) {
                    ((k) this.f9551c).b();
                    return;
                }
                return;
            default:
                w7 w7Var = (w7) this.f9551c;
                w7Var.d().g();
                w7Var.k = new z3(w7Var);
                i iVar = new i(w7Var);
                iVar.i();
                w7Var.f10284c = iVar;
                f J = w7Var.J();
                h4 h4Var = w7Var.f10282a;
                o.h(h4Var);
                J.f9731c = h4Var;
                d7 d7Var = new d7(w7Var);
                d7Var.i();
                w7Var.f10290i = d7Var;
                b bVar = new b(w7Var);
                bVar.i();
                w7Var.f10287f = bVar;
                f6 f6Var = new f6(w7Var);
                f6Var.i();
                w7Var.f10289h = f6Var;
                o7 o7Var = new o7(w7Var);
                o7Var.i();
                w7Var.f10286e = o7Var;
                w7Var.f10285d = new q3(w7Var);
                if (w7Var.f10297q != w7Var.f10298r) {
                    w7Var.a().f9828f.c("Not all upload components initialized", Integer.valueOf(w7Var.f10297q), Integer.valueOf(w7Var.f10298r));
                }
                w7Var.f10293m = true;
                w7 w7Var2 = (w7) this.f9551c;
                w7Var2.d().g();
                i iVar2 = w7Var2.f10284c;
                w7.H(iVar2);
                iVar2.P();
                if (w7Var2.f10290i.f9703g.a() == 0) {
                    t3 t3Var = w7Var2.f10290i.f9703g;
                    ((a) w7Var2.c()).getClass();
                    t3Var.b(System.currentTimeMillis());
                }
                w7Var2.C();
                return;
        }
    }

    public /* synthetic */ n(p pVar, IBinder iBinder) {
        this.f9549a = 0;
        this.f9550b = pVar;
        this.f9551c = iBinder;
    }
}
