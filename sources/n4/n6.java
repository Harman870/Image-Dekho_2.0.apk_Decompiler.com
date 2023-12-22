package n4;

import android.os.Bundle;
import android.os.RemoteException;
import j4.x0;
import java.util.List;
import r3.o;

public final class n6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10018a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10019b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g8 f10020c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f10021d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x0 f10022e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a7 f10023f;

    public n6(a7 a7Var, String str, String str2, g8 g8Var, boolean z9, x0 x0Var) {
        this.f10023f = a7Var;
        this.f10018a = str;
        this.f10019b = str2;
        this.f10020c = g8Var;
        this.f10021d = z9;
        this.f10022e = x0Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            a7 a7Var = this.f10023f;
            z2 z2Var = a7Var.f9613d;
            if (z2Var == null) {
                a7Var.f9600a.a().f9828f.c("Failed to get user properties; not connected to service", this.f10018a, this.f10019b);
                this.f10023f.f9600a.x().B(this.f10022e, bundle2);
                return;
            }
            o.h(this.f10020c);
            List<z7> s10 = z2Var.s(this.f10018a, this.f10019b, this.f10021d, this.f10020c);
            bundle = new Bundle();
            if (s10 != null) {
                for (z7 z7Var : s10) {
                    String str = z7Var.f10357e;
                    if (str != null) {
                        bundle.putString(z7Var.f10354b, str);
                    } else {
                        Long l6 = z7Var.f10356d;
                        if (l6 != null) {
                            bundle.putLong(z7Var.f10354b, l6.longValue());
                        } else {
                            Double d10 = z7Var.f10359g;
                            if (d10 != null) {
                                bundle.putDouble(z7Var.f10354b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f10023f.r();
                this.f10023f.f9600a.x().B(this.f10022e, bundle);
            } catch (RemoteException e11) {
                e10 = e11;
                try {
                    this.f10023f.f9600a.a().f9828f.c("Failed to get user properties; remote exception", this.f10018a, e10);
                    this.f10023f.f9600a.x().B(this.f10022e, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f10023f.f9600a.x().B(this.f10022e, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
            this.f10023f.f9600a.a().f9828f.c("Failed to get user properties; remote exception", this.f10018a, e10);
            this.f10023f.f9600a.x().B(this.f10022e, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f10023f.f9600a.x().B(this.f10022e, bundle2);
            throw th;
        }
    }
}
