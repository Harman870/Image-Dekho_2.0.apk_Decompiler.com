package n4;

import java.util.concurrent.atomic.AtomicReference;
import r3.o;

public final class t5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10138a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10139b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10140c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f10141d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f10142e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o3 f10143f;

    public t5(a6 a6Var, AtomicReference atomicReference, String str, String str2, boolean z9) {
        this.f10143f = a6Var;
        this.f10141d = atomicReference;
        this.f10140c = str;
        this.f10142e = str2;
        this.f10139b = z9;
    }

    public final void run() {
        r rVar;
        switch (this.f10138a) {
            case 0:
                a7 v10 = ((a6) this.f10143f).f9600a.v();
                boolean z9 = this.f10139b;
                v10.g();
                v10.h();
                v10.s(new y6(v10, (AtomicReference) this.f10141d, this.f10140c, (String) this.f10142e, v10.p(false), z9));
                return;
            default:
                a7 a7Var = (a7) this.f10143f;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.a("Discarding data. Failed to send event to service");
                    return;
                }
                o.h((g8) this.f10141d);
                a7 a7Var2 = (a7) this.f10143f;
                if (this.f10139b) {
                    rVar = null;
                } else {
                    rVar = (r) this.f10142e;
                }
                a7Var2.k(z2Var, rVar, (g8) this.f10141d);
                ((a7) this.f10143f).r();
                return;
        }
    }

    public t5(a7 a7Var, g8 g8Var, boolean z9, r rVar, String str) {
        this.f10143f = a7Var;
        this.f10141d = g8Var;
        this.f10139b = z9;
        this.f10142e = rVar;
        this.f10140c = str;
    }
}
