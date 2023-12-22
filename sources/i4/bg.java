package i4;

import com.google.android.gms.common.api.Status;
import h6.b0;
import h6.q;
import i6.h;
import i6.j;
import r3.o;

public final class bg implements lf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cg f7214a;

    public bg(cg cgVar) {
        this.f7214a = cgVar;
    }

    public final void a(Status status, q qVar) {
        boolean z9;
        int i10 = this.f7214a.f7234a;
        if (i10 == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        o.j("Unexpected response type " + i10, z9);
        j jVar = this.f7214a.f7239f;
        if (jVar != null) {
            jVar.a(status);
        }
        cg cgVar = this.f7214a;
        cgVar.f7242i = qVar;
        j jVar2 = cgVar.f7239f;
        if (jVar2 != null) {
            jVar2.a(status);
        }
        this.f7214a.e(status);
    }

    public final void b(te teVar) {
        cg cgVar = this.f7214a;
        cgVar.f7243j = teVar;
        cgVar.e(h.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void c(wg wgVar) {
        int i10 = this.f7214a.f7234a;
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        o.j("Unexpected response type: " + i10, z9);
        cg cgVar = this.f7214a;
        cgVar.f7240g = wgVar;
        cgVar.b();
        o.j("no success or failure set on method implementation", cgVar.k);
    }

    public final void d(wg wgVar, rg rgVar) {
        int i10 = this.f7214a.f7234a;
        boolean z9 = i10 == 2;
        o.j("Unexpected response type: " + i10, z9);
        cg cgVar = this.f7214a;
        cgVar.f7240g = wgVar;
        cgVar.f7241h = rgVar;
        cgVar.b();
        o.j("no success or failure set on method implementation", cgVar.k);
    }

    public final void e(re reVar) {
        Status status = reVar.f7646a;
        b0 b0Var = reVar.f7647b;
        j jVar = this.f7214a.f7239f;
        if (jVar != null) {
            jVar.a(status);
        }
        cg cgVar = this.f7214a;
        cgVar.f7242i = b0Var;
        j jVar2 = cgVar.f7239f;
        if (jVar2 != null) {
            jVar2.a(status);
        }
        this.f7214a.e(status);
    }

    public final void f(Status status) {
        String str = status.f2812c;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, (String) null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, (String) null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, (String) null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, (String) null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, (String) null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, (String) null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, (String) null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, (String) null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, (String) null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, (String) null);
            }
        }
        cg cgVar = this.f7214a;
        if (cgVar.f7234a != 8) {
            j jVar = cgVar.f7239f;
            if (jVar != null) {
                jVar.a(status);
            }
            this.f7214a.e(status);
            return;
        }
        cgVar.k = true;
        throw null;
    }
}
