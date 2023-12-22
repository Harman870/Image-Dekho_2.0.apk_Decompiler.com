package n4;

import android.os.Bundle;
import android.os.SystemClock;
import j4.fb;
import j4.gb;

public final class j7 {

    /* renamed from: a  reason: collision with root package name */
    public long f9868a;

    /* renamed from: b  reason: collision with root package name */
    public long f9869b;

    /* renamed from: c  reason: collision with root package name */
    public final r6 f9870c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l7 f9871d;

    public j7(l7 l7Var) {
        this.f9871d = l7Var;
        this.f9870c = new r6(this, l7Var.f9600a, 1);
        l7Var.f9600a.f9998n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f9868a = elapsedRealtime;
        this.f9869b = elapsedRealtime;
    }

    public final boolean a(boolean z9, long j10, boolean z10) {
        this.f9871d.g();
        this.f9871d.h();
        ((gb) fb.f8153b.f8154a.zza()).zza();
        if (!this.f9871d.f9600a.f9992g.o((String) null, w2.f10214e0) || this.f9871d.f9600a.g()) {
            t3 t3Var = this.f9871d.f9600a.r().f10263n;
            this.f9871d.f9600a.f9998n.getClass();
            t3Var.b(System.currentTimeMillis());
        }
        long j11 = j10 - this.f9868a;
        if (z9 || j11 >= 1000) {
            if (!z10) {
                j11 = j10 - this.f9869b;
                this.f9869b = j10;
            }
            this.f9871d.f9600a.a().f9835n.b("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            d8.t(this.f9871d.f9600a.u().m(!this.f9871d.f9600a.f9992g.p()), bundle, true);
            if (!z10) {
                this.f9871d.f9600a.t().n("auto", "_e", bundle);
            }
            this.f9868a = j10;
            this.f9870c.a();
            this.f9870c.c(3600000);
            return true;
        }
        this.f9871d.f9600a.a().f9835n.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }
}
