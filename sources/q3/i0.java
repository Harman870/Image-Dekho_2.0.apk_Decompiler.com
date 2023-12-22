package q3;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j4.x0;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n4.a6;
import n4.a7;
import n4.c;
import n4.d8;
import n4.g8;
import n4.n4;
import n4.w2;
import n4.w7;
import n4.z2;
import n4.z4;
import n4.z6;
import o3.b;
import p4.k;
import r3.g0;
import r3.h1;
import r3.i;
import r3.o;

public final class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11241b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11242c;

    public /* synthetic */ i0(Object obj, int i10, Object obj2) {
        this.f11240a = i10;
        this.f11242c = obj;
        this.f11241b = obj2;
    }

    public final void run() {
        boolean z9;
        i iVar;
        i iVar2;
        boolean z10 = true;
        switch (this.f11240a) {
            case 0:
                k0 k0Var = (k0) this.f11242c;
                k kVar = (k) this.f11241b;
                b bVar = kVar.f10685b;
                if (bVar.f10539b == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    g0 g0Var = kVar.f10686c;
                    o.h(g0Var);
                    bVar = g0Var.f11589c;
                    if (bVar.f10539b != 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar)), new Exception());
                    } else {
                        j0 j0Var = k0Var.f11250g;
                        IBinder iBinder = g0Var.f11588b;
                        if (iBinder == null) {
                            iVar = null;
                        } else {
                            int i10 = i.a.f11596b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                iVar2 = (i) queryLocalInterface;
                            } else {
                                iVar2 = new h1(iBinder);
                            }
                            iVar = iVar2;
                        }
                        Set<Scope> set = k0Var.f11247d;
                        z zVar = (z) j0Var;
                        zVar.getClass();
                        if (iVar == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            zVar.b(new b(4));
                            ((r3.b) k0Var.f11249f).p();
                            return;
                        }
                        zVar.f11310c = iVar;
                        zVar.f11311d = set;
                        if (zVar.f11312e) {
                            zVar.f11308a.d(iVar, set);
                        }
                        ((r3.b) k0Var.f11249f).p();
                        return;
                    }
                }
                ((z) k0Var.f11250g).b(bVar);
                ((r3.b) k0Var.f11249f).p();
                return;
            case 1:
                ((z4) this.f11242c).f10346a.b();
                if (((c) this.f11241b).f9642c.x() == null) {
                    w7 w7Var = ((z4) this.f11242c).f10346a;
                    c cVar = (c) this.f11241b;
                    w7Var.getClass();
                    String str = cVar.f9640a;
                    o.h(str);
                    g8 y9 = w7Var.y(str);
                    if (y9 != null) {
                        w7Var.n(cVar, y9);
                        return;
                    }
                    return;
                }
                w7 w7Var2 = ((z4) this.f11242c).f10346a;
                c cVar2 = (c) this.f11241b;
                w7Var2.getClass();
                String str2 = cVar2.f9640a;
                o.h(str2);
                g8 y10 = w7Var2.y(str2);
                if (y10 != null) {
                    w7Var2.q(cVar2, y10);
                    return;
                }
                return;
            case 2:
                synchronized (((AtomicReference) this.f11241b)) {
                    try {
                        Object obj = this.f11242c;
                        ((AtomicReference) this.f11241b).set(Integer.valueOf(((a6) obj).f9600a.f9992g.i(((a6) obj).f9600a.o().l(), w2.N)));
                        ((AtomicReference) this.f11241b).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f11241b).notify();
                        throw th;
                    }
                }
                return;
            case 3:
                a7 a7Var = (a7) this.f11242c;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    o.h((g8) this.f11241b);
                    z2Var.B((g8) this.f11241b);
                    ((a7) this.f11242c).r();
                    return;
                } catch (RemoteException e10) {
                    ((a7) this.f11242c).f9600a.a().f9828f.b("Failed to send measurementEnabled to the service", e10);
                    return;
                }
            case 4:
                a7.t(((z6) this.f11242c).f10352c, (ComponentName) this.f11241b);
                return;
            case 5:
                ((w7) this.f11241b).b();
                w7 w7Var3 = (w7) this.f11241b;
                Runnable runnable = (Runnable) this.f11242c;
                w7Var3.d().g();
                if (w7Var3.f10296p == null) {
                    w7Var3.f10296p = new ArrayList();
                }
                w7Var3.f10296p.add(runnable);
                ((w7) this.f11241b).t();
                return;
            default:
                d8 x9 = ((AppMeasurementDynamiteService) this.f11242c).f2841a.x();
                x0 x0Var = (x0) this.f11241b;
                n4 n4Var = ((AppMeasurementDynamiteService) this.f11242c).f2841a;
                if (n4Var.A == null || !n4Var.A.booleanValue()) {
                    z10 = false;
                }
                x9.z(x0Var, z10);
                return;
        }
    }

    public i0(w7 w7Var, Runnable runnable) {
        this.f11240a = 5;
        this.f11241b = w7Var;
        this.f11242c = runnable;
    }
}
