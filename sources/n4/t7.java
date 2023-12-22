package n4;

import android.os.Bundle;
import g1.t;
import r3.o;
import y3.a;

public final class t7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10145a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f10146b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f10147c;

    public t7(t tVar, String str, Bundle bundle) {
        this.f10147c = tVar;
        this.f10145a = str;
        this.f10146b = bundle;
    }

    public final void run() {
        d8 P = ((w7) this.f10147c.f6553a).P();
        Bundle bundle = this.f10146b;
        ((a) ((w7) this.f10147c.f6553a).c()).getClass();
        r n02 = P.n0("_err", bundle, "auto", System.currentTimeMillis(), false);
        o.h(n02);
        ((w7) this.f10147c.f6553a).j(n02, this.f10145a);
    }
}
