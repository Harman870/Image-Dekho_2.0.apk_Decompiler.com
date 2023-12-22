package h6;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import i4.wg;
import i6.j;
import i6.x;

public final class f0 implements x, j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6908a;

    public f0(FirebaseAuth firebaseAuth) {
        this.f6908a = firebaseAuth;
    }

    public final void a(Status status) {
        int i10 = status.f2811b;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.f6908a.a();
        }
    }

    public final void b(wg wgVar, l lVar) {
        FirebaseAuth.d(this.f6908a, lVar, wgVar, true, true);
    }
}
