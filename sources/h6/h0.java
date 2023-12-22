package h6;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import i4.wg;
import i6.g0;
import i6.j;
import i6.x;
import r3.o;

public final class h0 implements x, j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6910a;

    public h0(g0 g0Var) {
        this.f6910a = g0Var;
    }

    public final void a(Status status) {
        int i10 = status.f2811b;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005 || i10 == 17091) {
            this.f6910a.a();
        }
    }

    public final void b(wg wgVar, l lVar) {
        o.h(wgVar);
        o.h(lVar);
        lVar.I(wgVar);
        FirebaseAuth.d(this.f6910a, lVar, wgVar, true, true);
    }
}
