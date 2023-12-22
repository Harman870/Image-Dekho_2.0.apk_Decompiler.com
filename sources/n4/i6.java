package n4;

import android.os.Bundle;

public final class i6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g6 f9846a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g6 f9847b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9848c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f9849d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l6 f9850e;

    public i6(l6 l6Var, g6 g6Var, g6 g6Var2, long j10, boolean z9) {
        this.f9850e = l6Var;
        this.f9846a = g6Var;
        this.f9847b = g6Var2;
        this.f9848c = j10;
        this.f9849d = z9;
    }

    public final void run() {
        this.f9850e.k(this.f9846a, this.f9847b, this.f9848c, this.f9849d, (Bundle) null);
    }
}
