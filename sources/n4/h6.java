package n4;

import android.os.Bundle;
import java.util.List;

public final class h6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f9806a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g6 f9807b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g6 f9808c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f9809d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l6 f9810e;

    public h6(l6 l6Var, Bundle bundle, g6 g6Var, g6 g6Var2, long j10) {
        this.f9810e = l6Var;
        this.f9806a = bundle;
        this.f9807b = g6Var;
        this.f9808c = g6Var2;
        this.f9809d = j10;
    }

    public final void run() {
        l6 l6Var = this.f9810e;
        Bundle bundle = this.f9806a;
        g6 g6Var = this.f9807b;
        g6 g6Var2 = this.f9808c;
        long j10 = this.f9809d;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        l6Var.k(g6Var, g6Var2, j10, true, l6Var.f9600a.x().m0("screen_view", bundle, (List) null, false));
    }
}
