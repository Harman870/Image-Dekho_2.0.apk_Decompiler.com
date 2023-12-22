package q3;

import p3.a;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f11278a;

    public u(v vVar) {
        this.f11278a = vVar;
    }

    public final void run() {
        a.e eVar = this.f11278a.f11281a.f11287b;
        eVar.e(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
